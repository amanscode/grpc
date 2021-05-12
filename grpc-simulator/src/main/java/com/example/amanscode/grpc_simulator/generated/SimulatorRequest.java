// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: GRPCSimulator.proto

package com.example.amanscode.grpc_simulator.generated;

/**
 * Protobuf type {@code com.example.amanscode.grpc_simulator.generated.SimulatorRequest}
 */
public final class SimulatorRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:com.example.amanscode.grpc_simulator.generated.SimulatorRequest)
    SimulatorRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use SimulatorRequest.newBuilder() to construct.
  private SimulatorRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private SimulatorRequest() {
    requestPojoString_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new SimulatorRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private SimulatorRequest(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 10: {
            java.lang.String s = input.readStringRequireUtf8();

            requestPojoString_ = s;
            break;
          }
          default: {
            if (!parseUnknownField(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.example.amanscode.grpc_simulator.generated.GRPCSimulator.internal_static_com_example_amanscode_grpc_simulator_generated_SimulatorRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.example.amanscode.grpc_simulator.generated.GRPCSimulator.internal_static_com_example_amanscode_grpc_simulator_generated_SimulatorRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.example.amanscode.grpc_simulator.generated.SimulatorRequest.class, com.example.amanscode.grpc_simulator.generated.SimulatorRequest.Builder.class);
  }

  public static final int REQUESTPOJOSTRING_FIELD_NUMBER = 1;
  private volatile java.lang.Object requestPojoString_;
  /**
   * <code>string requestPojoString = 1;</code>
   * @return The requestPojoString.
   */
  @java.lang.Override
  public java.lang.String getRequestPojoString() {
    java.lang.Object ref = requestPojoString_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      requestPojoString_ = s;
      return s;
    }
  }
  /**
   * <code>string requestPojoString = 1;</code>
   * @return The bytes for requestPojoString.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getRequestPojoStringBytes() {
    java.lang.Object ref = requestPojoString_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      requestPojoString_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (!getRequestPojoStringBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, requestPojoString_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getRequestPojoStringBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, requestPojoString_);
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.example.amanscode.grpc_simulator.generated.SimulatorRequest)) {
      return super.equals(obj);
    }
    com.example.amanscode.grpc_simulator.generated.SimulatorRequest other = (com.example.amanscode.grpc_simulator.generated.SimulatorRequest) obj;

    if (!getRequestPojoString()
        .equals(other.getRequestPojoString())) return false;
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + REQUESTPOJOSTRING_FIELD_NUMBER;
    hash = (53 * hash) + getRequestPojoString().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.example.amanscode.grpc_simulator.generated.SimulatorRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.example.amanscode.grpc_simulator.generated.SimulatorRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.example.amanscode.grpc_simulator.generated.SimulatorRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.example.amanscode.grpc_simulator.generated.SimulatorRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.example.amanscode.grpc_simulator.generated.SimulatorRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.example.amanscode.grpc_simulator.generated.SimulatorRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.example.amanscode.grpc_simulator.generated.SimulatorRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.example.amanscode.grpc_simulator.generated.SimulatorRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.example.amanscode.grpc_simulator.generated.SimulatorRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.example.amanscode.grpc_simulator.generated.SimulatorRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.example.amanscode.grpc_simulator.generated.SimulatorRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.example.amanscode.grpc_simulator.generated.SimulatorRequest parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.example.amanscode.grpc_simulator.generated.SimulatorRequest prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code com.example.amanscode.grpc_simulator.generated.SimulatorRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:com.example.amanscode.grpc_simulator.generated.SimulatorRequest)
      com.example.amanscode.grpc_simulator.generated.SimulatorRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.example.amanscode.grpc_simulator.generated.GRPCSimulator.internal_static_com_example_amanscode_grpc_simulator_generated_SimulatorRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.example.amanscode.grpc_simulator.generated.GRPCSimulator.internal_static_com_example_amanscode_grpc_simulator_generated_SimulatorRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.example.amanscode.grpc_simulator.generated.SimulatorRequest.class, com.example.amanscode.grpc_simulator.generated.SimulatorRequest.Builder.class);
    }

    // Construct using com.example.amanscode.grpc_simulator.generated.SimulatorRequest.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      requestPojoString_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.example.amanscode.grpc_simulator.generated.GRPCSimulator.internal_static_com_example_amanscode_grpc_simulator_generated_SimulatorRequest_descriptor;
    }

    @java.lang.Override
    public com.example.amanscode.grpc_simulator.generated.SimulatorRequest getDefaultInstanceForType() {
      return com.example.amanscode.grpc_simulator.generated.SimulatorRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.example.amanscode.grpc_simulator.generated.SimulatorRequest build() {
      com.example.amanscode.grpc_simulator.generated.SimulatorRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.example.amanscode.grpc_simulator.generated.SimulatorRequest buildPartial() {
      com.example.amanscode.grpc_simulator.generated.SimulatorRequest result = new com.example.amanscode.grpc_simulator.generated.SimulatorRequest(this);
      result.requestPojoString_ = requestPojoString_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.example.amanscode.grpc_simulator.generated.SimulatorRequest) {
        return mergeFrom((com.example.amanscode.grpc_simulator.generated.SimulatorRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.example.amanscode.grpc_simulator.generated.SimulatorRequest other) {
      if (other == com.example.amanscode.grpc_simulator.generated.SimulatorRequest.getDefaultInstance()) return this;
      if (!other.getRequestPojoString().isEmpty()) {
        requestPojoString_ = other.requestPojoString_;
        onChanged();
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.example.amanscode.grpc_simulator.generated.SimulatorRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.example.amanscode.grpc_simulator.generated.SimulatorRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object requestPojoString_ = "";
    /**
     * <code>string requestPojoString = 1;</code>
     * @return The requestPojoString.
     */
    public java.lang.String getRequestPojoString() {
      java.lang.Object ref = requestPojoString_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        requestPojoString_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string requestPojoString = 1;</code>
     * @return The bytes for requestPojoString.
     */
    public com.google.protobuf.ByteString
        getRequestPojoStringBytes() {
      java.lang.Object ref = requestPojoString_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        requestPojoString_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string requestPojoString = 1;</code>
     * @param value The requestPojoString to set.
     * @return This builder for chaining.
     */
    public Builder setRequestPojoString(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      requestPojoString_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string requestPojoString = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearRequestPojoString() {
      
      requestPojoString_ = getDefaultInstance().getRequestPojoString();
      onChanged();
      return this;
    }
    /**
     * <code>string requestPojoString = 1;</code>
     * @param value The bytes for requestPojoString to set.
     * @return This builder for chaining.
     */
    public Builder setRequestPojoStringBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      requestPojoString_ = value;
      onChanged();
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:com.example.amanscode.grpc_simulator.generated.SimulatorRequest)
  }

  // @@protoc_insertion_point(class_scope:com.example.amanscode.grpc_simulator.generated.SimulatorRequest)
  private static final com.example.amanscode.grpc_simulator.generated.SimulatorRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.example.amanscode.grpc_simulator.generated.SimulatorRequest();
  }

  public static com.example.amanscode.grpc_simulator.generated.SimulatorRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<SimulatorRequest>
      PARSER = new com.google.protobuf.AbstractParser<SimulatorRequest>() {
    @java.lang.Override
    public SimulatorRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new SimulatorRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<SimulatorRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<SimulatorRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.example.amanscode.grpc_simulator.generated.SimulatorRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
