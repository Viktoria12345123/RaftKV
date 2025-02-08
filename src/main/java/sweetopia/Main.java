package sweetopia;

import io.grpc.Server;
import io.grpc.ServerBuilder;
import sweetopia.raft.RaftServer;

import java.io.IOException;
import java.util.Arrays;
import java.util.Timer;
import java.util.TimerTask;

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {


        Server server1 = ServerBuilder.forPort(50051)
                .addService(new RaftServer("node1", Arrays.asList("node2", "node3")))
                .build();

        Server server2 = ServerBuilder.forPort(50052)
                .addService(new RaftServer("node2", Arrays.asList("node1", "node3")))
                .build();

        Server server3 = ServerBuilder.forPort(50053)
                .addService(new RaftServer("node3", Arrays.asList("node1", "node2")))
                .build();



        System.out.println("Servers started on ports 50051, 50052, and 50053");
        server1.start();
        server2.start();
        server3.start();

        server1.awaitTermination();

    }
}