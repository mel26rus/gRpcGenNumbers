package server;

import io.grpc.Server;
import io.grpc.ServerBuilder;

import java.io.IOException;

public class AppServer {
    public static void main(String[] args) throws IOException, InterruptedException {
        Server server = ServerBuilder.forPort(86).addService(new GetNumServImpl()).build();

        server.start();
        System.out.println("Server started");
        server.awaitTermination();
    }

}
