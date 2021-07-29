package br.com.boardgame;

import io.grpc.stub.StreamObserver;

import java.util.Random;
import java.util.concurrent.CountDownLatch;

public class PlayStreamingResponse implements StreamObserver<GameStateResponse> {

    CountDownLatch latch;
    StreamObserver<PlayRequest> playRequestStreamObserver;


    public PlayStreamingResponse (CountDownLatch latch) {
        this.latch = latch;
    }


    @Override
    public void onNext(GameStateResponse value) {
        System.out.println(value);

        if (value.getGameState().getFinishedGame()) {
            System.out.println("The game is finished!");
            System.out.println("Eu ganhei? R: " + value.getGameState().getAmIWinner());
            System.out.println(value.getGameState());
            playRequestStreamObserver.onCompleted();
            return;
        }

        playAgain();
    }

    @Override
    public void onError(Throwable t) {
        latch.countDown();
        playRequestStreamObserver.onCompleted();
    }

    @Override
    public void onCompleted() {
        System.out.println("The game was notified as finished!");
        latch.countDown();
        playRequestStreamObserver.onCompleted();
    }

    public void setPlayRequest(StreamObserver<PlayRequest> playRequestStreamObserver) {
        this.playRequestStreamObserver = playRequestStreamObserver;
    }
    public void playAgain() {
        PlayRequest playRequest = PlayRequest.newBuilder()
                .setDie(RolledDie.newBuilder().setValue(new Random().nextInt(7)).build())
                .build();

        playRequestStreamObserver.onNext(playRequest);
    }
}
