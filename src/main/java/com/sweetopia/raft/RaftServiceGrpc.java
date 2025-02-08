package com.sweetopia.raft;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.8.0)",
    comments = "Source: raft.proto")
public final class RaftServiceGrpc {

  private RaftServiceGrpc() {}

  public static final String SERVICE_NAME = "sweetopia.raft.RaftService";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getPutMethod()} instead. 
  public static final io.grpc.MethodDescriptor<com.sweetopia.raft.Raft.PutRequest,
      com.sweetopia.raft.Raft.PutResponse> METHOD_PUT = getPutMethod();

  private static volatile io.grpc.MethodDescriptor<com.sweetopia.raft.Raft.PutRequest,
      com.sweetopia.raft.Raft.PutResponse> getPutMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<com.sweetopia.raft.Raft.PutRequest,
      com.sweetopia.raft.Raft.PutResponse> getPutMethod() {
    io.grpc.MethodDescriptor<com.sweetopia.raft.Raft.PutRequest, com.sweetopia.raft.Raft.PutResponse> getPutMethod;
    if ((getPutMethod = RaftServiceGrpc.getPutMethod) == null) {
      synchronized (RaftServiceGrpc.class) {
        if ((getPutMethod = RaftServiceGrpc.getPutMethod) == null) {
          RaftServiceGrpc.getPutMethod = getPutMethod = 
              io.grpc.MethodDescriptor.<com.sweetopia.raft.Raft.PutRequest, com.sweetopia.raft.Raft.PutResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "sweetopia.raft.RaftService", "Put"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.sweetopia.raft.Raft.PutRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.sweetopia.raft.Raft.PutResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new RaftServiceMethodDescriptorSupplier("Put"))
                  .build();
          }
        }
     }
     return getPutMethod;
  }
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getGetMethod()} instead. 
  public static final io.grpc.MethodDescriptor<com.sweetopia.raft.Raft.GetRequest,
      com.sweetopia.raft.Raft.GetResponse> METHOD_GET = getGetMethod();

  private static volatile io.grpc.MethodDescriptor<com.sweetopia.raft.Raft.GetRequest,
      com.sweetopia.raft.Raft.GetResponse> getGetMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<com.sweetopia.raft.Raft.GetRequest,
      com.sweetopia.raft.Raft.GetResponse> getGetMethod() {
    io.grpc.MethodDescriptor<com.sweetopia.raft.Raft.GetRequest, com.sweetopia.raft.Raft.GetResponse> getGetMethod;
    if ((getGetMethod = RaftServiceGrpc.getGetMethod) == null) {
      synchronized (RaftServiceGrpc.class) {
        if ((getGetMethod = RaftServiceGrpc.getGetMethod) == null) {
          RaftServiceGrpc.getGetMethod = getGetMethod = 
              io.grpc.MethodDescriptor.<com.sweetopia.raft.Raft.GetRequest, com.sweetopia.raft.Raft.GetResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "sweetopia.raft.RaftService", "Get"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.sweetopia.raft.Raft.GetRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.sweetopia.raft.Raft.GetResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new RaftServiceMethodDescriptorSupplier("Get"))
                  .build();
          }
        }
     }
     return getGetMethod;
  }
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getHeartbeatMethod()} instead. 
  public static final io.grpc.MethodDescriptor<com.sweetopia.raft.Raft.HeartbeatRequest,
      com.sweetopia.raft.Raft.HeartbeatResponse> METHOD_HEARTBEAT = getHeartbeatMethod();

  private static volatile io.grpc.MethodDescriptor<com.sweetopia.raft.Raft.HeartbeatRequest,
      com.sweetopia.raft.Raft.HeartbeatResponse> getHeartbeatMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<com.sweetopia.raft.Raft.HeartbeatRequest,
      com.sweetopia.raft.Raft.HeartbeatResponse> getHeartbeatMethod() {
    io.grpc.MethodDescriptor<com.sweetopia.raft.Raft.HeartbeatRequest, com.sweetopia.raft.Raft.HeartbeatResponse> getHeartbeatMethod;
    if ((getHeartbeatMethod = RaftServiceGrpc.getHeartbeatMethod) == null) {
      synchronized (RaftServiceGrpc.class) {
        if ((getHeartbeatMethod = RaftServiceGrpc.getHeartbeatMethod) == null) {
          RaftServiceGrpc.getHeartbeatMethod = getHeartbeatMethod = 
              io.grpc.MethodDescriptor.<com.sweetopia.raft.Raft.HeartbeatRequest, com.sweetopia.raft.Raft.HeartbeatResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "sweetopia.raft.RaftService", "Heartbeat"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.sweetopia.raft.Raft.HeartbeatRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.sweetopia.raft.Raft.HeartbeatResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new RaftServiceMethodDescriptorSupplier("Heartbeat"))
                  .build();
          }
        }
     }
     return getHeartbeatMethod;
  }
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getRequestVoteMethod()} instead. 
  public static final io.grpc.MethodDescriptor<com.sweetopia.raft.Raft.VoteRequest,
      com.sweetopia.raft.Raft.VoteResponse> METHOD_REQUEST_VOTE = getRequestVoteMethod();

  private static volatile io.grpc.MethodDescriptor<com.sweetopia.raft.Raft.VoteRequest,
      com.sweetopia.raft.Raft.VoteResponse> getRequestVoteMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<com.sweetopia.raft.Raft.VoteRequest,
      com.sweetopia.raft.Raft.VoteResponse> getRequestVoteMethod() {
    io.grpc.MethodDescriptor<com.sweetopia.raft.Raft.VoteRequest, com.sweetopia.raft.Raft.VoteResponse> getRequestVoteMethod;
    if ((getRequestVoteMethod = RaftServiceGrpc.getRequestVoteMethod) == null) {
      synchronized (RaftServiceGrpc.class) {
        if ((getRequestVoteMethod = RaftServiceGrpc.getRequestVoteMethod) == null) {
          RaftServiceGrpc.getRequestVoteMethod = getRequestVoteMethod = 
              io.grpc.MethodDescriptor.<com.sweetopia.raft.Raft.VoteRequest, com.sweetopia.raft.Raft.VoteResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "sweetopia.raft.RaftService", "RequestVote"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.sweetopia.raft.Raft.VoteRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.sweetopia.raft.Raft.VoteResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new RaftServiceMethodDescriptorSupplier("RequestVote"))
                  .build();
          }
        }
     }
     return getRequestVoteMethod;
  }
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getAppendLogMethod()} instead. 
  public static final io.grpc.MethodDescriptor<com.sweetopia.raft.Raft.LogEntry,
      com.google.protobuf.Empty> METHOD_APPEND_LOG = getAppendLogMethod();

  private static volatile io.grpc.MethodDescriptor<com.sweetopia.raft.Raft.LogEntry,
      com.google.protobuf.Empty> getAppendLogMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<com.sweetopia.raft.Raft.LogEntry,
      com.google.protobuf.Empty> getAppendLogMethod() {
    io.grpc.MethodDescriptor<com.sweetopia.raft.Raft.LogEntry, com.google.protobuf.Empty> getAppendLogMethod;
    if ((getAppendLogMethod = RaftServiceGrpc.getAppendLogMethod) == null) {
      synchronized (RaftServiceGrpc.class) {
        if ((getAppendLogMethod = RaftServiceGrpc.getAppendLogMethod) == null) {
          RaftServiceGrpc.getAppendLogMethod = getAppendLogMethod = 
              io.grpc.MethodDescriptor.<com.sweetopia.raft.Raft.LogEntry, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "sweetopia.raft.RaftService", "AppendLog"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.sweetopia.raft.Raft.LogEntry.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
                  .setSchemaDescriptor(new RaftServiceMethodDescriptorSupplier("AppendLog"))
                  .build();
          }
        }
     }
     return getAppendLogMethod;
  }
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getAppendEntriesMethod()} instead. 
  public static final io.grpc.MethodDescriptor<com.sweetopia.raft.Raft.AppendEntriesRequest,
      com.sweetopia.raft.Raft.AppendEntriesResponse> METHOD_APPEND_ENTRIES = getAppendEntriesMethod();

  private static volatile io.grpc.MethodDescriptor<com.sweetopia.raft.Raft.AppendEntriesRequest,
      com.sweetopia.raft.Raft.AppendEntriesResponse> getAppendEntriesMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<com.sweetopia.raft.Raft.AppendEntriesRequest,
      com.sweetopia.raft.Raft.AppendEntriesResponse> getAppendEntriesMethod() {
    io.grpc.MethodDescriptor<com.sweetopia.raft.Raft.AppendEntriesRequest, com.sweetopia.raft.Raft.AppendEntriesResponse> getAppendEntriesMethod;
    if ((getAppendEntriesMethod = RaftServiceGrpc.getAppendEntriesMethod) == null) {
      synchronized (RaftServiceGrpc.class) {
        if ((getAppendEntriesMethod = RaftServiceGrpc.getAppendEntriesMethod) == null) {
          RaftServiceGrpc.getAppendEntriesMethod = getAppendEntriesMethod = 
              io.grpc.MethodDescriptor.<com.sweetopia.raft.Raft.AppendEntriesRequest, com.sweetopia.raft.Raft.AppendEntriesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "sweetopia.raft.RaftService", "AppendEntries"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.sweetopia.raft.Raft.AppendEntriesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.sweetopia.raft.Raft.AppendEntriesResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new RaftServiceMethodDescriptorSupplier("AppendEntries"))
                  .build();
          }
        }
     }
     return getAppendEntriesMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static RaftServiceStub newStub(io.grpc.Channel channel) {
    return new RaftServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static RaftServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new RaftServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static RaftServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new RaftServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class RaftServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void put(com.sweetopia.raft.Raft.PutRequest request,
        io.grpc.stub.StreamObserver<com.sweetopia.raft.Raft.PutResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getPutMethod(), responseObserver);
    }

    /**
     */
    public void get(com.sweetopia.raft.Raft.GetRequest request,
        io.grpc.stub.StreamObserver<com.sweetopia.raft.Raft.GetResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetMethod(), responseObserver);
    }

    /**
     */
    public void heartbeat(com.sweetopia.raft.Raft.HeartbeatRequest request,
        io.grpc.stub.StreamObserver<com.sweetopia.raft.Raft.HeartbeatResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getHeartbeatMethod(), responseObserver);
    }

    /**
     */
    public void requestVote(com.sweetopia.raft.Raft.VoteRequest request,
        io.grpc.stub.StreamObserver<com.sweetopia.raft.Raft.VoteResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getRequestVoteMethod(), responseObserver);
    }

    /**
     */
    public void appendLog(com.sweetopia.raft.Raft.LogEntry request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnimplementedUnaryCall(getAppendLogMethod(), responseObserver);
    }

    /**
     */
    public void appendEntries(com.sweetopia.raft.Raft.AppendEntriesRequest request,
        io.grpc.stub.StreamObserver<com.sweetopia.raft.Raft.AppendEntriesResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getAppendEntriesMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getPutMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.sweetopia.raft.Raft.PutRequest,
                com.sweetopia.raft.Raft.PutResponse>(
                  this, METHODID_PUT)))
          .addMethod(
            getGetMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.sweetopia.raft.Raft.GetRequest,
                com.sweetopia.raft.Raft.GetResponse>(
                  this, METHODID_GET)))
          .addMethod(
            getHeartbeatMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.sweetopia.raft.Raft.HeartbeatRequest,
                com.sweetopia.raft.Raft.HeartbeatResponse>(
                  this, METHODID_HEARTBEAT)))
          .addMethod(
            getRequestVoteMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.sweetopia.raft.Raft.VoteRequest,
                com.sweetopia.raft.Raft.VoteResponse>(
                  this, METHODID_REQUEST_VOTE)))
          .addMethod(
            getAppendLogMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.sweetopia.raft.Raft.LogEntry,
                com.google.protobuf.Empty>(
                  this, METHODID_APPEND_LOG)))
          .addMethod(
            getAppendEntriesMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.sweetopia.raft.Raft.AppendEntriesRequest,
                com.sweetopia.raft.Raft.AppendEntriesResponse>(
                  this, METHODID_APPEND_ENTRIES)))
          .build();
    }
  }

  /**
   */
  public static final class RaftServiceStub extends io.grpc.stub.AbstractStub<RaftServiceStub> {
    private RaftServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private RaftServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RaftServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new RaftServiceStub(channel, callOptions);
    }

    /**
     */
    public void put(com.sweetopia.raft.Raft.PutRequest request,
        io.grpc.stub.StreamObserver<com.sweetopia.raft.Raft.PutResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getPutMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void get(com.sweetopia.raft.Raft.GetRequest request,
        io.grpc.stub.StreamObserver<com.sweetopia.raft.Raft.GetResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void heartbeat(com.sweetopia.raft.Raft.HeartbeatRequest request,
        io.grpc.stub.StreamObserver<com.sweetopia.raft.Raft.HeartbeatResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getHeartbeatMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void requestVote(com.sweetopia.raft.Raft.VoteRequest request,
        io.grpc.stub.StreamObserver<com.sweetopia.raft.Raft.VoteResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getRequestVoteMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void appendLog(com.sweetopia.raft.Raft.LogEntry request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getAppendLogMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void appendEntries(com.sweetopia.raft.Raft.AppendEntriesRequest request,
        io.grpc.stub.StreamObserver<com.sweetopia.raft.Raft.AppendEntriesResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getAppendEntriesMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class RaftServiceBlockingStub extends io.grpc.stub.AbstractStub<RaftServiceBlockingStub> {
    private RaftServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private RaftServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RaftServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new RaftServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.sweetopia.raft.Raft.PutResponse put(com.sweetopia.raft.Raft.PutRequest request) {
      return blockingUnaryCall(
          getChannel(), getPutMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.sweetopia.raft.Raft.GetResponse get(com.sweetopia.raft.Raft.GetRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.sweetopia.raft.Raft.HeartbeatResponse heartbeat(com.sweetopia.raft.Raft.HeartbeatRequest request) {
      return blockingUnaryCall(
          getChannel(), getHeartbeatMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.sweetopia.raft.Raft.VoteResponse requestVote(com.sweetopia.raft.Raft.VoteRequest request) {
      return blockingUnaryCall(
          getChannel(), getRequestVoteMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.google.protobuf.Empty appendLog(com.sweetopia.raft.Raft.LogEntry request) {
      return blockingUnaryCall(
          getChannel(), getAppendLogMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.sweetopia.raft.Raft.AppendEntriesResponse appendEntries(com.sweetopia.raft.Raft.AppendEntriesRequest request) {
      return blockingUnaryCall(
          getChannel(), getAppendEntriesMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class RaftServiceFutureStub extends io.grpc.stub.AbstractStub<RaftServiceFutureStub> {
    private RaftServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private RaftServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RaftServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new RaftServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.sweetopia.raft.Raft.PutResponse> put(
        com.sweetopia.raft.Raft.PutRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getPutMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.sweetopia.raft.Raft.GetResponse> get(
        com.sweetopia.raft.Raft.GetRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.sweetopia.raft.Raft.HeartbeatResponse> heartbeat(
        com.sweetopia.raft.Raft.HeartbeatRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getHeartbeatMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.sweetopia.raft.Raft.VoteResponse> requestVote(
        com.sweetopia.raft.Raft.VoteRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getRequestVoteMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> appendLog(
        com.sweetopia.raft.Raft.LogEntry request) {
      return futureUnaryCall(
          getChannel().newCall(getAppendLogMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.sweetopia.raft.Raft.AppendEntriesResponse> appendEntries(
        com.sweetopia.raft.Raft.AppendEntriesRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getAppendEntriesMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_PUT = 0;
  private static final int METHODID_GET = 1;
  private static final int METHODID_HEARTBEAT = 2;
  private static final int METHODID_REQUEST_VOTE = 3;
  private static final int METHODID_APPEND_LOG = 4;
  private static final int METHODID_APPEND_ENTRIES = 5;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final RaftServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(RaftServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_PUT:
          serviceImpl.put((com.sweetopia.raft.Raft.PutRequest) request,
              (io.grpc.stub.StreamObserver<com.sweetopia.raft.Raft.PutResponse>) responseObserver);
          break;
        case METHODID_GET:
          serviceImpl.get((com.sweetopia.raft.Raft.GetRequest) request,
              (io.grpc.stub.StreamObserver<com.sweetopia.raft.Raft.GetResponse>) responseObserver);
          break;
        case METHODID_HEARTBEAT:
          serviceImpl.heartbeat((com.sweetopia.raft.Raft.HeartbeatRequest) request,
              (io.grpc.stub.StreamObserver<com.sweetopia.raft.Raft.HeartbeatResponse>) responseObserver);
          break;
        case METHODID_REQUEST_VOTE:
          serviceImpl.requestVote((com.sweetopia.raft.Raft.VoteRequest) request,
              (io.grpc.stub.StreamObserver<com.sweetopia.raft.Raft.VoteResponse>) responseObserver);
          break;
        case METHODID_APPEND_LOG:
          serviceImpl.appendLog((com.sweetopia.raft.Raft.LogEntry) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_APPEND_ENTRIES:
          serviceImpl.appendEntries((com.sweetopia.raft.Raft.AppendEntriesRequest) request,
              (io.grpc.stub.StreamObserver<com.sweetopia.raft.Raft.AppendEntriesResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class RaftServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    RaftServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.sweetopia.raft.Raft.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("RaftService");
    }
  }

  private static final class RaftServiceFileDescriptorSupplier
      extends RaftServiceBaseDescriptorSupplier {
    RaftServiceFileDescriptorSupplier() {}
  }

  private static final class RaftServiceMethodDescriptorSupplier
      extends RaftServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    RaftServiceMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (RaftServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new RaftServiceFileDescriptorSupplier())
              .addMethod(getPutMethod())
              .addMethod(getGetMethod())
              .addMethod(getHeartbeatMethod())
              .addMethod(getRequestVoteMethod())
              .addMethod(getAppendLogMethod())
              .addMethod(getAppendEntriesMethod())
              .build();
        }
      }
    }
    return result;
  }
}
