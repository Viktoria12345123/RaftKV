package sweetopia.raft;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.8.0)",
    comments = "Source: src/proto/raft.proto")
public final class RaftServiceGrpc {

  private RaftServiceGrpc() {}

  public static final String SERVICE_NAME = "raft.RaftService";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getPutMethod()} instead. 
  public static final io.grpc.MethodDescriptor<Raft.PutRequest,
      Raft.PutResponse> METHOD_PUT = getPutMethod();

  private static volatile io.grpc.MethodDescriptor<Raft.PutRequest,
      Raft.PutResponse> getPutMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<Raft.PutRequest,
      Raft.PutResponse> getPutMethod() {
    io.grpc.MethodDescriptor<Raft.PutRequest, Raft.PutResponse> getPutMethod;
    if ((getPutMethod = RaftServiceGrpc.getPutMethod) == null) {
      synchronized (RaftServiceGrpc.class) {
        if ((getPutMethod = RaftServiceGrpc.getPutMethod) == null) {
          RaftServiceGrpc.getPutMethod = getPutMethod = 
              io.grpc.MethodDescriptor.<Raft.PutRequest, Raft.PutResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "raft.RaftService", "Put"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  Raft.PutRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  Raft.PutResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new RaftServiceMethodDescriptorSupplier("Put"))
                  .build();
          }
        }
     }
     return getPutMethod;
  }
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getGetMethod()} instead. 
  public static final io.grpc.MethodDescriptor<Raft.GetRequest,
      Raft.GetResponse> METHOD_GET = getGetMethod();

  private static volatile io.grpc.MethodDescriptor<Raft.GetRequest,
      Raft.GetResponse> getGetMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<Raft.GetRequest,
      Raft.GetResponse> getGetMethod() {
    io.grpc.MethodDescriptor<Raft.GetRequest, Raft.GetResponse> getGetMethod;
    if ((getGetMethod = RaftServiceGrpc.getGetMethod) == null) {
      synchronized (RaftServiceGrpc.class) {
        if ((getGetMethod = RaftServiceGrpc.getGetMethod) == null) {
          RaftServiceGrpc.getGetMethod = getGetMethod = 
              io.grpc.MethodDescriptor.<Raft.GetRequest, Raft.GetResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "raft.RaftService", "Get"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  Raft.GetRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  Raft.GetResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new RaftServiceMethodDescriptorSupplier("Get"))
                  .build();
          }
        }
     }
     return getGetMethod;
  }
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getHeartbeatMethod()} instead. 
  public static final io.grpc.MethodDescriptor<Raft.HeartbeatRequest,
      Raft.HeartbeatResponse> METHOD_HEARTBEAT = getHeartbeatMethod();

  private static volatile io.grpc.MethodDescriptor<Raft.HeartbeatRequest,
      Raft.HeartbeatResponse> getHeartbeatMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<Raft.HeartbeatRequest,
      Raft.HeartbeatResponse> getHeartbeatMethod() {
    io.grpc.MethodDescriptor<Raft.HeartbeatRequest, Raft.HeartbeatResponse> getHeartbeatMethod;
    if ((getHeartbeatMethod = RaftServiceGrpc.getHeartbeatMethod) == null) {
      synchronized (RaftServiceGrpc.class) {
        if ((getHeartbeatMethod = RaftServiceGrpc.getHeartbeatMethod) == null) {
          RaftServiceGrpc.getHeartbeatMethod = getHeartbeatMethod = 
              io.grpc.MethodDescriptor.<Raft.HeartbeatRequest, Raft.HeartbeatResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "raft.RaftService", "Heartbeat"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  Raft.HeartbeatRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  Raft.HeartbeatResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new RaftServiceMethodDescriptorSupplier("Heartbeat"))
                  .build();
          }
        }
     }
     return getHeartbeatMethod;
  }
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getRequestVoteMethod()} instead. 
  public static final io.grpc.MethodDescriptor<Raft.VoteRequest,
      Raft.VoteResponse> METHOD_REQUEST_VOTE = getRequestVoteMethod();

  private static volatile io.grpc.MethodDescriptor<Raft.VoteRequest,
      Raft.VoteResponse> getRequestVoteMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<Raft.VoteRequest,
      Raft.VoteResponse> getRequestVoteMethod() {
    io.grpc.MethodDescriptor<Raft.VoteRequest, Raft.VoteResponse> getRequestVoteMethod;
    if ((getRequestVoteMethod = RaftServiceGrpc.getRequestVoteMethod) == null) {
      synchronized (RaftServiceGrpc.class) {
        if ((getRequestVoteMethod = RaftServiceGrpc.getRequestVoteMethod) == null) {
          RaftServiceGrpc.getRequestVoteMethod = getRequestVoteMethod = 
              io.grpc.MethodDescriptor.<Raft.VoteRequest, Raft.VoteResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "raft.RaftService", "RequestVote"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  Raft.VoteRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  Raft.VoteResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new RaftServiceMethodDescriptorSupplier("RequestVote"))
                  .build();
          }
        }
     }
     return getRequestVoteMethod;
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
    public void put(Raft.PutRequest request,
                    io.grpc.stub.StreamObserver<Raft.PutResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getPutMethod(), responseObserver);
    }

    /**
     */
    public void get(Raft.GetRequest request,
                    io.grpc.stub.StreamObserver<Raft.GetResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetMethod(), responseObserver);
    }

    /**
     */
    public void heartbeat(Raft.HeartbeatRequest request,
                          io.grpc.stub.StreamObserver<Raft.HeartbeatResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getHeartbeatMethod(), responseObserver);
    }

    /**
     * <pre>
     * Change method name to avoid conflict with message type
     * </pre>
     */
    public void requestVote(Raft.VoteRequest request,
                            io.grpc.stub.StreamObserver<Raft.VoteResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getRequestVoteMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getPutMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                Raft.PutRequest,
                Raft.PutResponse>(
                  this, METHODID_PUT)))
          .addMethod(
            getGetMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                Raft.GetRequest,
                Raft.GetResponse>(
                  this, METHODID_GET)))
          .addMethod(
            getHeartbeatMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                Raft.HeartbeatRequest,
                Raft.HeartbeatResponse>(
                  this, METHODID_HEARTBEAT)))
          .addMethod(
            getRequestVoteMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                Raft.VoteRequest,
                Raft.VoteResponse>(
                  this, METHODID_REQUEST_VOTE)))
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
    public void put(Raft.PutRequest request,
                    io.grpc.stub.StreamObserver<Raft.PutResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getPutMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void get(Raft.GetRequest request,
                    io.grpc.stub.StreamObserver<Raft.GetResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void heartbeat(Raft.HeartbeatRequest request,
                          io.grpc.stub.StreamObserver<Raft.HeartbeatResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getHeartbeatMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Change method name to avoid conflict with message type
     * </pre>
     */
    public void requestVote(Raft.VoteRequest request,
                            io.grpc.stub.StreamObserver<Raft.VoteResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getRequestVoteMethod(), getCallOptions()), request, responseObserver);
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
    public Raft.PutResponse put(Raft.PutRequest request) {
      return blockingUnaryCall(
          getChannel(), getPutMethod(), getCallOptions(), request);
    }

    /**
     */
    public Raft.GetResponse get(Raft.GetRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetMethod(), getCallOptions(), request);
    }

    /**
     */
    public Raft.HeartbeatResponse heartbeat(Raft.HeartbeatRequest request) {
      return blockingUnaryCall(
          getChannel(), getHeartbeatMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Change method name to avoid conflict with message type
     * </pre>
     */
    public Raft.VoteResponse requestVote(Raft.VoteRequest request) {
      return blockingUnaryCall(
          getChannel(), getRequestVoteMethod(), getCallOptions(), request);
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
    public com.google.common.util.concurrent.ListenableFuture<Raft.PutResponse> put(
        Raft.PutRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getPutMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<Raft.GetResponse> get(
        Raft.GetRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<Raft.HeartbeatResponse> heartbeat(
        Raft.HeartbeatRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getHeartbeatMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Change method name to avoid conflict with message type
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<Raft.VoteResponse> requestVote(
        Raft.VoteRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getRequestVoteMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_PUT = 0;
  private static final int METHODID_GET = 1;
  private static final int METHODID_HEARTBEAT = 2;
  private static final int METHODID_REQUEST_VOTE = 3;

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
          serviceImpl.put((Raft.PutRequest) request,
              (io.grpc.stub.StreamObserver<Raft.PutResponse>) responseObserver);
          break;
        case METHODID_GET:
          serviceImpl.get((Raft.GetRequest) request,
              (io.grpc.stub.StreamObserver<Raft.GetResponse>) responseObserver);
          break;
        case METHODID_HEARTBEAT:
          serviceImpl.heartbeat((Raft.HeartbeatRequest) request,
              (io.grpc.stub.StreamObserver<Raft.HeartbeatResponse>) responseObserver);
          break;
        case METHODID_REQUEST_VOTE:
          serviceImpl.requestVote((Raft.VoteRequest) request,
              (io.grpc.stub.StreamObserver<Raft.VoteResponse>) responseObserver);
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
      return Raft.getDescriptor();
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
              .build();
        }
      }
    }
    return result;
  }
}
