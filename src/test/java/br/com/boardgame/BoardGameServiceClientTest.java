package br.com.boardgame;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.stub.StreamObserver;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import java.util.Random;
import java.util.concurrent.CountDownLatch;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class BoardGameServiceClientTest {
        private BoardGameServiceGrpc.BoardGameServiceStub boardGameServiceStub;

        @BeforeAll
        public void setup() {
            ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 6565)
                    .usePlaintext()
                    .build();

            this.boardGameServiceStub = BoardGameServiceGrpc.newStub(channel);
        }

    @Test
    public void test() throws InterruptedException {
        CountDownLatch latch = new CountDownLatch(1);

        PlayStreamingResponse playStreamingResponse = new PlayStreamingResponse(latch);

        StreamObserver<PlayRequest> play = boardGameServiceStub.play(playStreamingResponse);
        playStreamingResponse.setPlayRequest(play);
        playStreamingResponse.playAgain();

        latch.await();

        System.out.println("Finished");
    }
}
