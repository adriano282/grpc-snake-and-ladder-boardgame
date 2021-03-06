package br.com.boardgame;

import io.grpc.Server;
import io.grpc.ServerBuilder;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException, InterruptedException {
        Server server = ServerBuilder.forPort(6565)
                .addService(new BoardGameService())
                .build();

        server.start();

        server.awaitTermination();
    }
}
