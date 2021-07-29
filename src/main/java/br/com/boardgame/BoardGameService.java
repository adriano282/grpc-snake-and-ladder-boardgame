package br.com.boardgame;

import io.grpc.stub.StreamObserver;

public class BoardGameService extends BoardGameServiceGrpc.BoardGameServiceImplBase {

    GameManager gameManager;

    @Override
    public StreamObserver<PlayRequest> play(StreamObserver<GameStateResponse> responseObserver) {
        System.out.println("New Game!");
        System.out.println();
        gameManager = new GameManager();
        return new PlayStreamingRequest(gameManager, responseObserver);
    }
}
