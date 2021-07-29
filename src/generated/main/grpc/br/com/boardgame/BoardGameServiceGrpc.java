package br.com.boardgame;

import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.0.0-pre2)",
    comments = "Source: board-game-service.proto")
public class BoardGameServiceGrpc {

  private BoardGameServiceGrpc() {}

  public static final String SERVICE_NAME = "BoardGameService";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<br.com.boardgame.PlayRequest,
      br.com.boardgame.GameStateResponse> METHOD_PLAY =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING,
          generateFullMethodName(
              "BoardGameService", "play"),
          io.grpc.protobuf.ProtoUtils.marshaller(br.com.boardgame.PlayRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(br.com.boardgame.GameStateResponse.getDefaultInstance()));

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static BoardGameServiceStub newStub(io.grpc.Channel channel) {
    return new BoardGameServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static BoardGameServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new BoardGameServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary and streaming output calls on the service
   */
  public static BoardGameServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new BoardGameServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class BoardGameServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public io.grpc.stub.StreamObserver<br.com.boardgame.PlayRequest> play(
        io.grpc.stub.StreamObserver<br.com.boardgame.GameStateResponse> responseObserver) {
      return asyncUnimplementedStreamingCall(METHOD_PLAY, responseObserver);
    }

    @java.lang.Override public io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            METHOD_PLAY,
            asyncBidiStreamingCall(
              new MethodHandlers<
                br.com.boardgame.PlayRequest,
                br.com.boardgame.GameStateResponse>(
                  this, METHODID_PLAY)))
          .build();
    }
  }

  /**
   */
  public static final class BoardGameServiceStub extends io.grpc.stub.AbstractStub<BoardGameServiceStub> {
    private BoardGameServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private BoardGameServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected BoardGameServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new BoardGameServiceStub(channel, callOptions);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<br.com.boardgame.PlayRequest> play(
        io.grpc.stub.StreamObserver<br.com.boardgame.GameStateResponse> responseObserver) {
      return asyncBidiStreamingCall(
          getChannel().newCall(METHOD_PLAY, getCallOptions()), responseObserver);
    }
  }

  /**
   */
  public static final class BoardGameServiceBlockingStub extends io.grpc.stub.AbstractStub<BoardGameServiceBlockingStub> {
    private BoardGameServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private BoardGameServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected BoardGameServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new BoardGameServiceBlockingStub(channel, callOptions);
    }
  }

  /**
   */
  public static final class BoardGameServiceFutureStub extends io.grpc.stub.AbstractStub<BoardGameServiceFutureStub> {
    private BoardGameServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private BoardGameServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected BoardGameServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new BoardGameServiceFutureStub(channel, callOptions);
    }
  }

  private static final int METHODID_PLAY = 0;

  private static class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final BoardGameServiceImplBase serviceImpl;
    private final int methodId;

    public MethodHandlers(BoardGameServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_PLAY:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.play(
              (io.grpc.stub.StreamObserver<br.com.boardgame.GameStateResponse>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    return new io.grpc.ServiceDescriptor(SERVICE_NAME,
        METHOD_PLAY);
  }

}
