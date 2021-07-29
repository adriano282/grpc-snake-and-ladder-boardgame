package br.com.boardgame;

import io.grpc.stub.StreamObserver;

import java.util.Random;

public class PlayStreamingRequest implements StreamObserver<PlayRequest> {
    StreamObserver<GameStateResponse> gameStateResponseStreamObserver;
    GameManager gameManager;

    public PlayStreamingRequest(GameManager gameManager, StreamObserver<GameStateResponse> gameStateResponseStreamObserver) {
        this.gameStateResponseStreamObserver = gameStateResponseStreamObserver;
        this.gameManager = gameManager;
    }

    @Override
    public void onNext(PlayRequest value) {

        gameManager.setClient(value.getPlayer());
        int newClientPosition = gameManager.getPositionClient() + value.getDie().getValue();


        if (GameManager.LADDERS.get(newClientPosition) != null) {
            newClientPosition = GameManager.LADDERS.get(newClientPosition);
            System.out.println("Client just went up! " + newClientPosition);
        }
        else if (GameManager.SNAKES.get(newClientPosition) != null) {
            newClientPosition = GameManager.SNAKES.get(newClientPosition);
            System.out.println("Client just went down :( " + newClientPosition);
        }
        gameManager.setPositionClient(newClientPosition);
        if (newClientPosition >= 100) {
            GameState gameState = GameState
                    .newBuilder()
                    .setFinishedGame(true)
                    .setAmIWinner(true)
                    .setYourPosition(newClientPosition)
                    .build();

            gameStateResponseStreamObserver.onNext(
                    GameStateResponse.newBuilder().setGameState(gameState).build());

            gameStateResponseStreamObserver.onCompleted();
            return;
        }

        int newServerPosition = gameManager.getServerPosition() + new Random().nextInt(7);


        if (GameManager.LADDERS.get(newServerPosition) != null) {
            newServerPosition = GameManager.LADDERS.get(newServerPosition);
            System.out.println("Server just went up! " + newServerPosition);
        }
        else if (GameManager.SNAKES.get(newServerPosition) != null) {
            newServerPosition = GameManager.SNAKES.get(newServerPosition);
            System.out.println("Server just went down :( " + newServerPosition);
        }

        gameManager.setServerPosition(newServerPosition);
        if (newServerPosition >= 100)  {
            GameState gameState = GameState
                    .newBuilder()
                    .setFinishedGame(true)
                    .setAmIWinner(false)
                    .setYourPosition(newClientPosition)
                    .setServerPosition(newServerPosition)
                    .build();

            gameStateResponseStreamObserver.onNext(
                    GameStateResponse.newBuilder().setGameState(gameState).build());

            gameStateResponseStreamObserver.onCompleted();
            return;
        }


        GameState gameState = GameState.newBuilder()
                .setYourPosition(newClientPosition)
                .setFinishedGame(false)
                .setServerPosition(newServerPosition)
                .setAmIWinner(false).build();

        gameStateResponseStreamObserver.onNext(GameStateResponse.newBuilder().setGameState(gameState).build());
    }

    @Override
    public void onError(Throwable t) {
        gameStateResponseStreamObserver.onCompleted();
    }

    @Override
    public void onCompleted() {
        gameStateResponseStreamObserver.onCompleted();
    }
}
