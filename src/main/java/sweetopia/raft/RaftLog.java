package sweetopia.raft;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

import com.sweetopia.raft.Raft;
import com.sweetopia.raft.RaftServiceGrpc;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.stub.StreamObserver;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class RaftLog {

    private List<LogEntry> log = new ArrayList<>();;

    public RaftLog() {
        this.log = new ArrayList<>();
    }


    public void appendLog(String command, int currentTerm, String nodeId, List<String> otherServers) {
        LogEntry entry = new LogEntry(command, currentTerm, log.size());
        log.add(entry);

        for (String followerId : otherServers) {
            sendLogReplication(followerId, log, currentTerm, nodeId);
        }
    }

    private void sendLogReplication(String followerId, List<LogEntry> log, int currentTerm, String nodeId) {
        if (log.isEmpty()) return;

        LogEntry lastEntry = log.get(log.size() - 1);

        int prevLogIndex = lastEntry.getIndex() - 1;
        int prevLogTerm = (prevLogIndex >= 0) ? log.get(prevLogIndex).getTerm() : 0;

        List<Raft.LogEntry> grpcLogEntries = log.stream()
                .map(entry -> Raft.LogEntry.newBuilder()
                        .setCommand(entry.getCommand())
                        .setTerm(entry.getTerm())
                        .setIndex(entry.getIndex())
                        .build())
                .collect(Collectors.toList());


        Raft.AppendEntriesRequest request = Raft.AppendEntriesRequest.newBuilder()
                .setTerm(currentTerm)
                .setLeaderId(nodeId)
                .setPrevLogIndex(prevLogIndex)
                .setPrevLogTerm(prevLogTerm)
                .addAllEntries(grpcLogEntries)
                .setLeaderCommit(log.size() - 1)
                .build();

        sendAppendEntriesRequest(followerId, request);
    }

    private void sendAppendEntriesRequest(String followerId, Raft.AppendEntriesRequest request) {
        ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", getPeerPort(followerId))
                .usePlaintext()
                .build();

        RaftServiceGrpc.RaftServiceBlockingStub blockingStub = RaftServiceGrpc.newBlockingStub(channel);
        try {
            Raft.AppendEntriesResponse response = blockingStub.appendEntries(request);
            if (response.getSuccess()) {
                System.out.println("Log replicated to " + followerId);
            } else {
                System.out.println("Replication failed for " + followerId);
            }
        } catch (Exception e) {
            System.err.println("Error contacting peer " + followerId + ": " + e.getMessage());
        } finally {
            channel.shutdownNow();
        }
    }


    public int getPeerPort(String peerId) {

        switch (peerId) {
            case "server2": return 8081;
            case "server3": return 8082;
            default: return 8080;
        }
    }

}

