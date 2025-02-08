package sweetopia.raft;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.stub.StreamObserver;

public class RaftClient {

    public static void main(String[] args) {


        ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 50051)
                .usePlaintext()
                .build();


        RaftServiceGrpc.RaftServiceStub stub = RaftServiceGrpc.newStub(channel);

        try {

            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        channel.shutdownNow();
    }
}
