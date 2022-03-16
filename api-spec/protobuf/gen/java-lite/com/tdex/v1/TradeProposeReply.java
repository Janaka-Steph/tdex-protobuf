// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: tdex/v1/trade.proto

package com.tdex.v1;

/**
 * Protobuf type {@code tdex.v1.TradeProposeReply}
 */
public  final class TradeProposeReply extends
    com.google.protobuf.GeneratedMessageLite<
        TradeProposeReply, TradeProposeReply.Builder> implements
    // @@protoc_insertion_point(message_implements:tdex.v1.TradeProposeReply)
    TradeProposeReplyOrBuilder {
  private TradeProposeReply() {
  }
  public static final int SWAP_ACCEPT_FIELD_NUMBER = 1;
  private com.tdex.v1.SwapAccept swapAccept_;
  /**
   * <code>.tdex.v1.SwapAccept swap_accept = 1 [json_name = "swapAccept"];</code>
   */
  @java.lang.Override
  public boolean hasSwapAccept() {
    return swapAccept_ != null;
  }
  /**
   * <code>.tdex.v1.SwapAccept swap_accept = 1 [json_name = "swapAccept"];</code>
   */
  @java.lang.Override
  public com.tdex.v1.SwapAccept getSwapAccept() {
    return swapAccept_ == null ? com.tdex.v1.SwapAccept.getDefaultInstance() : swapAccept_;
  }
  /**
   * <code>.tdex.v1.SwapAccept swap_accept = 1 [json_name = "swapAccept"];</code>
   */
  private void setSwapAccept(com.tdex.v1.SwapAccept value) {
    value.getClass();
  swapAccept_ = value;
    
    }
  /**
   * <code>.tdex.v1.SwapAccept swap_accept = 1 [json_name = "swapAccept"];</code>
   */
  @java.lang.SuppressWarnings({"ReferenceEquality"})
  private void mergeSwapAccept(com.tdex.v1.SwapAccept value) {
    value.getClass();
  if (swapAccept_ != null &&
        swapAccept_ != com.tdex.v1.SwapAccept.getDefaultInstance()) {
      swapAccept_ =
        com.tdex.v1.SwapAccept.newBuilder(swapAccept_).mergeFrom(value).buildPartial();
    } else {
      swapAccept_ = value;
    }
    
  }
  /**
   * <code>.tdex.v1.SwapAccept swap_accept = 1 [json_name = "swapAccept"];</code>
   */
  private void clearSwapAccept() {  swapAccept_ = null;
    
  }

  public static final int SWAP_FAIL_FIELD_NUMBER = 2;
  private com.tdex.v1.SwapFail swapFail_;
  /**
   * <code>.tdex.v1.SwapFail swap_fail = 2 [json_name = "swapFail"];</code>
   */
  @java.lang.Override
  public boolean hasSwapFail() {
    return swapFail_ != null;
  }
  /**
   * <code>.tdex.v1.SwapFail swap_fail = 2 [json_name = "swapFail"];</code>
   */
  @java.lang.Override
  public com.tdex.v1.SwapFail getSwapFail() {
    return swapFail_ == null ? com.tdex.v1.SwapFail.getDefaultInstance() : swapFail_;
  }
  /**
   * <code>.tdex.v1.SwapFail swap_fail = 2 [json_name = "swapFail"];</code>
   */
  private void setSwapFail(com.tdex.v1.SwapFail value) {
    value.getClass();
  swapFail_ = value;
    
    }
  /**
   * <code>.tdex.v1.SwapFail swap_fail = 2 [json_name = "swapFail"];</code>
   */
  @java.lang.SuppressWarnings({"ReferenceEquality"})
  private void mergeSwapFail(com.tdex.v1.SwapFail value) {
    value.getClass();
  if (swapFail_ != null &&
        swapFail_ != com.tdex.v1.SwapFail.getDefaultInstance()) {
      swapFail_ =
        com.tdex.v1.SwapFail.newBuilder(swapFail_).mergeFrom(value).buildPartial();
    } else {
      swapFail_ = value;
    }
    
  }
  /**
   * <code>.tdex.v1.SwapFail swap_fail = 2 [json_name = "swapFail"];</code>
   */
  private void clearSwapFail() {  swapFail_ = null;
    
  }

  public static final int EXPIRY_TIME_UNIX_FIELD_NUMBER = 3;
  private long expiryTimeUnix_;
  /**
   * <code>uint64 expiry_time_unix = 3 [json_name = "expiryTimeUnix"];</code>
   * @return The expiryTimeUnix.
   */
  @java.lang.Override
  public long getExpiryTimeUnix() {
    return expiryTimeUnix_;
  }
  /**
   * <code>uint64 expiry_time_unix = 3 [json_name = "expiryTimeUnix"];</code>
   * @param value The expiryTimeUnix to set.
   */
  private void setExpiryTimeUnix(long value) {
    
    expiryTimeUnix_ = value;
  }
  /**
   * <code>uint64 expiry_time_unix = 3 [json_name = "expiryTimeUnix"];</code>
   */
  private void clearExpiryTimeUnix() {
    
    expiryTimeUnix_ = 0L;
  }

  public static com.tdex.v1.TradeProposeReply parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static com.tdex.v1.TradeProposeReply parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static com.tdex.v1.TradeProposeReply parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static com.tdex.v1.TradeProposeReply parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static com.tdex.v1.TradeProposeReply parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static com.tdex.v1.TradeProposeReply parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static com.tdex.v1.TradeProposeReply parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static com.tdex.v1.TradeProposeReply parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static com.tdex.v1.TradeProposeReply parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input);
  }
  public static com.tdex.v1.TradeProposeReply parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static com.tdex.v1.TradeProposeReply parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static com.tdex.v1.TradeProposeReply parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }

  public static Builder newBuilder() {
    return (Builder) DEFAULT_INSTANCE.createBuilder();
  }
  public static Builder newBuilder(com.tdex.v1.TradeProposeReply prototype) {
    return (Builder) DEFAULT_INSTANCE.createBuilder(prototype);
  }

  /**
   * Protobuf type {@code tdex.v1.TradeProposeReply}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageLite.Builder<
        com.tdex.v1.TradeProposeReply, Builder> implements
      // @@protoc_insertion_point(builder_implements:tdex.v1.TradeProposeReply)
      com.tdex.v1.TradeProposeReplyOrBuilder {
    // Construct using com.tdex.v1.TradeProposeReply.newBuilder()
    private Builder() {
      super(DEFAULT_INSTANCE);
    }


    /**
     * <code>.tdex.v1.SwapAccept swap_accept = 1 [json_name = "swapAccept"];</code>
     */
    @java.lang.Override
    public boolean hasSwapAccept() {
      return instance.hasSwapAccept();
    }
    /**
     * <code>.tdex.v1.SwapAccept swap_accept = 1 [json_name = "swapAccept"];</code>
     */
    @java.lang.Override
    public com.tdex.v1.SwapAccept getSwapAccept() {
      return instance.getSwapAccept();
    }
    /**
     * <code>.tdex.v1.SwapAccept swap_accept = 1 [json_name = "swapAccept"];</code>
     */
    public Builder setSwapAccept(com.tdex.v1.SwapAccept value) {
      copyOnWrite();
      instance.setSwapAccept(value);
      return this;
      }
    /**
     * <code>.tdex.v1.SwapAccept swap_accept = 1 [json_name = "swapAccept"];</code>
     */
    public Builder setSwapAccept(
        com.tdex.v1.SwapAccept.Builder builderForValue) {
      copyOnWrite();
      instance.setSwapAccept(builderForValue.build());
      return this;
    }
    /**
     * <code>.tdex.v1.SwapAccept swap_accept = 1 [json_name = "swapAccept"];</code>
     */
    public Builder mergeSwapAccept(com.tdex.v1.SwapAccept value) {
      copyOnWrite();
      instance.mergeSwapAccept(value);
      return this;
    }
    /**
     * <code>.tdex.v1.SwapAccept swap_accept = 1 [json_name = "swapAccept"];</code>
     */
    public Builder clearSwapAccept() {  copyOnWrite();
      instance.clearSwapAccept();
      return this;
    }

    /**
     * <code>.tdex.v1.SwapFail swap_fail = 2 [json_name = "swapFail"];</code>
     */
    @java.lang.Override
    public boolean hasSwapFail() {
      return instance.hasSwapFail();
    }
    /**
     * <code>.tdex.v1.SwapFail swap_fail = 2 [json_name = "swapFail"];</code>
     */
    @java.lang.Override
    public com.tdex.v1.SwapFail getSwapFail() {
      return instance.getSwapFail();
    }
    /**
     * <code>.tdex.v1.SwapFail swap_fail = 2 [json_name = "swapFail"];</code>
     */
    public Builder setSwapFail(com.tdex.v1.SwapFail value) {
      copyOnWrite();
      instance.setSwapFail(value);
      return this;
      }
    /**
     * <code>.tdex.v1.SwapFail swap_fail = 2 [json_name = "swapFail"];</code>
     */
    public Builder setSwapFail(
        com.tdex.v1.SwapFail.Builder builderForValue) {
      copyOnWrite();
      instance.setSwapFail(builderForValue.build());
      return this;
    }
    /**
     * <code>.tdex.v1.SwapFail swap_fail = 2 [json_name = "swapFail"];</code>
     */
    public Builder mergeSwapFail(com.tdex.v1.SwapFail value) {
      copyOnWrite();
      instance.mergeSwapFail(value);
      return this;
    }
    /**
     * <code>.tdex.v1.SwapFail swap_fail = 2 [json_name = "swapFail"];</code>
     */
    public Builder clearSwapFail() {  copyOnWrite();
      instance.clearSwapFail();
      return this;
    }

    /**
     * <code>uint64 expiry_time_unix = 3 [json_name = "expiryTimeUnix"];</code>
     * @return The expiryTimeUnix.
     */
    @java.lang.Override
    public long getExpiryTimeUnix() {
      return instance.getExpiryTimeUnix();
    }
    /**
     * <code>uint64 expiry_time_unix = 3 [json_name = "expiryTimeUnix"];</code>
     * @param value The expiryTimeUnix to set.
     * @return This builder for chaining.
     */
    public Builder setExpiryTimeUnix(long value) {
      copyOnWrite();
      instance.setExpiryTimeUnix(value);
      return this;
    }
    /**
     * <code>uint64 expiry_time_unix = 3 [json_name = "expiryTimeUnix"];</code>
     * @return This builder for chaining.
     */
    public Builder clearExpiryTimeUnix() {
      copyOnWrite();
      instance.clearExpiryTimeUnix();
      return this;
    }

    // @@protoc_insertion_point(builder_scope:tdex.v1.TradeProposeReply)
  }
  @java.lang.Override
  @java.lang.SuppressWarnings({"unchecked", "fallthrough"})
  protected final java.lang.Object dynamicMethod(
      com.google.protobuf.GeneratedMessageLite.MethodToInvoke method,
      java.lang.Object arg0, java.lang.Object arg1) {
    switch (method) {
      case NEW_MUTABLE_INSTANCE: {
        return new com.tdex.v1.TradeProposeReply();
      }
      case NEW_BUILDER: {
        return new Builder();
      }
      case BUILD_MESSAGE_INFO: {
          java.lang.Object[] objects = new java.lang.Object[] {
            "swapAccept_",
            "swapFail_",
            "expiryTimeUnix_",
          };
          java.lang.String info =
              "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\t\u0002\t\u0003" +
              "\u0003";
          return newMessageInfo(DEFAULT_INSTANCE, info, objects);
      }
      // fall through
      case GET_DEFAULT_INSTANCE: {
        return DEFAULT_INSTANCE;
      }
      case GET_PARSER: {
        com.google.protobuf.Parser<com.tdex.v1.TradeProposeReply> parser = PARSER;
        if (parser == null) {
          synchronized (com.tdex.v1.TradeProposeReply.class) {
            parser = PARSER;
            if (parser == null) {
              parser =
                  new DefaultInstanceBasedParser<com.tdex.v1.TradeProposeReply>(
                      DEFAULT_INSTANCE);
              PARSER = parser;
            }
          }
        }
        return parser;
    }
    case GET_MEMOIZED_IS_INITIALIZED: {
      return (byte) 1;
    }
    case SET_MEMOIZED_IS_INITIALIZED: {
      return null;
    }
    }
    throw new UnsupportedOperationException();
  }


  // @@protoc_insertion_point(class_scope:tdex.v1.TradeProposeReply)
  private static final com.tdex.v1.TradeProposeReply DEFAULT_INSTANCE;
  static {
    TradeProposeReply defaultInstance = new TradeProposeReply();
    // New instances are implicitly immutable so no need to make
    // immutable.
    DEFAULT_INSTANCE = defaultInstance;
    com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(
      TradeProposeReply.class, defaultInstance);
  }

  public static com.tdex.v1.TradeProposeReply getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static volatile com.google.protobuf.Parser<TradeProposeReply> PARSER;

  public static com.google.protobuf.Parser<TradeProposeReply> parser() {
    return DEFAULT_INSTANCE.getParserForType();
  }
}

