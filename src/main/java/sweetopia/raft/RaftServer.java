
package sweetopia.raft;
import com.sweetopia.raft.Raft;
import com.sweetopia.raft.RaftServiceGrpc;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.stub.StreamObserver;

import java.util.*;

public class RaftServer extends RaftServiceGrpc.RaftServiceImplBase {

    private NodeState state = NodeState.FOLLOWER;
    private int currentTerm = 0;
    private final String nodeId;
    private String votedFor ;
    private String currentLeader = null;
    private final List<String> peers;
    private Timer electionTimer;
    private static final int ELECTION_TIMEOUT_MIN = 150;
    private static final int ELECTION_TIMEOUT_MAX = 300;
    private final Random random = new Random();
    RaftLog raftLog;
    private long lastHeartbeatTime = 0;
    private static final long HEARTBEAT_TIMEOUT = 5000;
    private Map<String, Integer> voteCounts = new HashMap<>();
    private final Map<String,String> store = new HashMap<>();

    public RaftServer(String nodeId, List<String> peers) {
        this.nodeId = nodeId;
        this.peers = peers;
        votedFor = nodeId;
        raftLog = new RaftLog();
        startElectionTimer();
    }

    @Override
    public void put(Raft.PutRequest request, StreamObserver<Raft.PutResponse> responseObserver) {
        store.put(request.getKey(), request.getValue());

        Raft.PutResponse response = Raft.PutResponse.newBuilder().setSuccess(true).build();

        responseObserver.onNext(response);
        responseObserver.onCompleted();

        if (state == NodeState.LEADER) {
            raftLog.appendLog("Put " + request.getKey() + " : " + request.getValue(), currentTerm, nodeId, getOtherServerIds());
        }

    }

    @Override
    public void get(Raft.GetRequest request, StreamObserver<Raft.GetResponse> responseObserver) {
        String value = store.remove(request.getKey());

        Raft.GetResponse response = Raft.GetResponse.newBuilder()
                .setValue( value != null ? value : "")
                .setFound(value != null)
                .build();

        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    @Override
    public void heartbeat(Raft.HeartbeatRequest request, StreamObserver<Raft.HeartbeatResponse> responseObserver) {

        System.out.println("Received heartbeat from: " + request.getLeaderId());

        lastHeartbeatTime = System.currentTimeMillis();

        if(state == NodeState.CANDIDATE) {
            state = NodeState.FOLLOWER;
        }

        if (currentTerm < request.getTerm()) {
            currentTerm = request.getTerm();
            state = NodeState.FOLLOWER;
            votedFor = null;  // reset vote as the term has advanced
        }

        currentLeader = request.getLeaderId();


        if (state != NodeState.LEADER && electionTimer != null) {
            electionTimer.cancel();
            startElectionTimer();
        }

        Raft.HeartbeatResponse response = Raft.HeartbeatResponse.newBuilder().setSuccess(true).build();
        System.out.println("Sending heartbeat response...");
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    private void startElectionTimer() {

        checkForHeartbeatTimeout();

        if (electionTimer != null && currentLeader != null) {
            electionTimer.cancel();
            electionTimer = null;
        }

        if (currentLeader == null) {
            electionTimer = new Timer();

            int timeout = random.nextInt(ELECTION_TIMEOUT_MAX - ELECTION_TIMEOUT_MIN) + ELECTION_TIMEOUT_MIN;

            electionTimer.schedule(new TimerTask() {
                @Override
                public void run() {
                    if (state == NodeState.FOLLOWER) {
                        becomeCandidate();
                    }
                }
            }, timeout);
        }
    }

    private void checkForHeartbeatTimeout() {
        long currentTime = System.currentTimeMillis();
        if (currentTime - lastHeartbeatTime > HEARTBEAT_TIMEOUT) {

            currentLeader = null;
            System.out.println("Heartbeat timeout. Leader lost.");
        }
    }

    private void becomeCandidate() {

        if (state == NodeState.LEADER) return;


        state = NodeState.CANDIDATE;
        currentLeader = null;
        currentTerm++;
        voteCounts.clear();
        voteCounts.put(nodeId, 1);

        System.out.println(nodeId + " becomes candidate in term " + currentTerm);

        for (String otherServerId : getOtherServerIds()) {

            if(state == NodeState.FOLLOWER) {
                System.out.println("election for node " + nodeId + " terminated...");
                break;
            }

            Raft.VoteRequest voteRequest = Raft.VoteRequest.newBuilder()
                    .setTerm(currentTerm)
                    .setCandidateId(nodeId)
                    .build();

            sendVoteRequest(otherServerId, voteRequest);
            System.out.println("CURRENT ROLE FOR " + nodeId + " IS " + state.toString());
        }

        electionTimer.schedule(new TimerTask() {
            @Override
            public void run() {
                checkElectionOutcome();
            }
        }, 2000);

    }

    private void sendVoteRequest(String peer, Raft.VoteRequest voteRequest) {
        // Create the channel to the peer node
        ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", getPeerPort(peer))
                .usePlaintext()
                .build();

        RaftServiceGrpc.RaftServiceBlockingStub blockingStub = RaftServiceGrpc.newBlockingStub(channel);

        try {
            Raft.VoteResponse response = blockingStub.requestVote(voteRequest);

            if (response.getVoteGranted()) {
                voteCounts.put(peer, 1);
            }
        } catch (Exception e) {
            System.err.println("Error contacting peer " + peer + ": " + e.getMessage());
        } finally {
            channel.shutdownNow();
        }
    }

    @Override
    public void requestVote(Raft.VoteRequest request, StreamObserver<Raft.VoteResponse> responseObserver) {

        boolean voteGranted = false;

        if (request.getTerm() > currentTerm) {
            currentTerm = request.getTerm();
            state = NodeState.FOLLOWER;
            votedFor = null;
        }

        if ((votedFor == null || votedFor.equals(request.getCandidateId())) && request.getTerm() >= currentTerm) {
            voteGranted = true;
            votedFor = request.getCandidateId();
        }

        System.out.println("Current node voting result : " + voteGranted + " to " + request.getCandidateId());

        Raft.VoteResponse response = Raft.VoteResponse.newBuilder()
                .setTerm(currentTerm)
                .setVoteGranted(voteGranted)
                .build();
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    private void checkElectionOutcome() {

        int votesForMe = voteCounts.values().stream().mapToInt(Integer::intValue).sum();
        int majority = peers.size() / 2 + 1;

        System.out.println("node checking the election outcome VOTES: "+  votesForMe + " for node "  + nodeId);

        if (votesForMe >= majority && currentLeader == null && state == NodeState.CANDIDATE) {
            becomeLeader();
        } else {
            System.out.println("Election failed for " + nodeId);
            state = NodeState.FOLLOWER;
            startElectionTimer();
        }
    }

    private void becomeLeader() {
        state = NodeState.LEADER;

        startHeartbeatTimer();

        System.out.println(nodeId + " becomes leader in term " + currentTerm);

    }

    private void startHeartbeatTimer() {
        Timer heartbeatTimer = new Timer();
        heartbeatTimer.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {
                sendHeartbeats();
            }
        }, 0, 1000);  // Send heartbeats every 1 second
    }

    private void sendHeartbeats() {
        if (state == NodeState.LEADER) {
            Raft.HeartbeatRequest heartbeatRequest = Raft.HeartbeatRequest.newBuilder()
                    .setTerm(currentTerm)
                    .setLeaderId(nodeId)
                    .build();

            for (String peer : peers) {
                sendHeartbeatToPeer(peer, heartbeatRequest);
            }
        }
    }

    private void sendHeartbeatToPeer(String peer, Raft.HeartbeatRequest heartbeatRequest) {
        // Create the channel to the peer node
        ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", getPeerPort(peer))
                .usePlaintext()
                .build();

        // Create a stub for the remote procedure call (RPC)
        RaftServiceGrpc.RaftServiceBlockingStub blockingStub = RaftServiceGrpc.newBlockingStub(channel);

        try {
            // Send the heartbeat request to the peer node
            Raft.HeartbeatResponse response = blockingStub.heartbeat(heartbeatRequest);

            if (response.getSuccess()) {
                System.out.println("Heartbeat sent to " + peer);
            } else {
                System.out.println("Heartbeat failed for " + peer);
            }
        } catch (Exception e) {
            System.err.println("Error contacting peer " + peer + ": " + e.getMessage());
        } finally {
            // Always shut down the channel to avoid memory leaks
            channel.shutdownNow();
        }
    }


    private List<String> getOtherServerIds() {
        List<String> otherServerIds = new ArrayList<>(peers);
        otherServerIds.remove(nodeId);
        return otherServerIds;
    }

    private int getPeerPort(String peer) {
        switch (peer) {
            case "node1":
                return 50051;
            case "node2":
                return 50052;
            case "node3":
                return 50053;
            default:
                return 50051; // Default port in case no match is found
        }
    }
}
