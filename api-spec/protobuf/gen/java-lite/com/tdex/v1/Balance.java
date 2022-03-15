// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: v1/types.proto

package com.tdex.v1;

/**
 * Protobuf type {@code tdex.v1.Balance}
 */
public  final class Balance extends
    com.google.protobuf.GeneratedMessageLite<
        Balance, Balance.Builder> implements
    // @@protoc_insertion_point(message_implements:tdex.v1.Balance)
    BalanceOrBuilder {
  private Balance() {
  }
  public static final int BASE_AMOUNT_FIELD_NUMBER = 1;
  private long baseAmount_;
  /**
   * <code>uint64 base_amount = 1 [json_name = "baseAmount"];</code>
   * @return The baseAmount.
   */
  @java.lang.Override
  public long getBaseAmount() {
    return baseAmount_;
  }
  /**
   * <code>uint64 base_amount = 1 [json_name = "baseAmount"];</code>
   * @param value The baseAmount to set.
   */
  private void setBaseAmount(long value) {
    
    baseAmount_ = value;
  }
  /**
   * <code>uint64 base_amount = 1 [json_name = "baseAmount"];</code>
   */
  private void clearBaseAmount() {
    
    baseAmount_ = 0L;
  }

  public static final int QUOTE_AMOUNT_FIELD_NUMBER = 2;
  private long quoteAmount_;
  /**
   * <code>uint64 quote_amount = 2 [json_name = "quoteAmount"];</code>
   * @return The quoteAmount.
   */
  @java.lang.Override
  public long getQuoteAmount() {
    return quoteAmount_;
  }
  /**
   * <code>uint64 quote_amount = 2 [json_name = "quoteAmount"];</code>
   * @param value The quoteAmount to set.
   */
  private void setQuoteAmount(long value) {
    
    quoteAmount_ = value;
  }
  /**
   * <code>uint64 quote_amount = 2 [json_name = "quoteAmount"];</code>
   */
  private void clearQuoteAmount() {
    
    quoteAmount_ = 0L;
  }

  public static com.tdex.v1.Balance parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static com.tdex.v1.Balance parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static com.tdex.v1.Balance parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static com.tdex.v1.Balance parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static com.tdex.v1.Balance parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static com.tdex.v1.Balance parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static com.tdex.v1.Balance parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static com.tdex.v1.Balance parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static com.tdex.v1.Balance parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input);
  }
  public static com.tdex.v1.Balance parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static com.tdex.v1.Balance parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static com.tdex.v1.Balance parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }

  public static Builder newBuilder() {
    return (Builder) DEFAULT_INSTANCE.createBuilder();
  }
  public static Builder newBuilder(com.tdex.v1.Balance prototype) {
    return (Builder) DEFAULT_INSTANCE.createBuilder(prototype);
  }

  /**
   * Protobuf type {@code tdex.v1.Balance}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageLite.Builder<
        com.tdex.v1.Balance, Builder> implements
      // @@protoc_insertion_point(builder_implements:tdex.v1.Balance)
      com.tdex.v1.BalanceOrBuilder {
    // Construct using com.tdex.v1.Balance.newBuilder()
    private Builder() {
      super(DEFAULT_INSTANCE);
    }


    /**
     * <code>uint64 base_amount = 1 [json_name = "baseAmount"];</code>
     * @return The baseAmount.
     */
    @java.lang.Override
    public long getBaseAmount() {
      return instance.getBaseAmount();
    }
    /**
     * <code>uint64 base_amount = 1 [json_name = "baseAmount"];</code>
     * @param value The baseAmount to set.
     * @return This builder for chaining.
     */
    public Builder setBaseAmount(long value) {
      copyOnWrite();
      instance.setBaseAmount(value);
      return this;
    }
    /**
     * <code>uint64 base_amount = 1 [json_name = "baseAmount"];</code>
     * @return This builder for chaining.
     */
    public Builder clearBaseAmount() {
      copyOnWrite();
      instance.clearBaseAmount();
      return this;
    }

    /**
     * <code>uint64 quote_amount = 2 [json_name = "quoteAmount"];</code>
     * @return The quoteAmount.
     */
    @java.lang.Override
    public long getQuoteAmount() {
      return instance.getQuoteAmount();
    }
    /**
     * <code>uint64 quote_amount = 2 [json_name = "quoteAmount"];</code>
     * @param value The quoteAmount to set.
     * @return This builder for chaining.
     */
    public Builder setQuoteAmount(long value) {
      copyOnWrite();
      instance.setQuoteAmount(value);
      return this;
    }
    /**
     * <code>uint64 quote_amount = 2 [json_name = "quoteAmount"];</code>
     * @return This builder for chaining.
     */
    public Builder clearQuoteAmount() {
      copyOnWrite();
      instance.clearQuoteAmount();
      return this;
    }

    // @@protoc_insertion_point(builder_scope:tdex.v1.Balance)
  }
  @java.lang.Override
  @java.lang.SuppressWarnings({"unchecked", "fallthrough"})
  protected final java.lang.Object dynamicMethod(
      com.google.protobuf.GeneratedMessageLite.MethodToInvoke method,
      java.lang.Object arg0, java.lang.Object arg1) {
    switch (method) {
      case NEW_MUTABLE_INSTANCE: {
        return new com.tdex.v1.Balance();
      }
      case NEW_BUILDER: {
        return new Builder();
      }
      case BUILD_MESSAGE_INFO: {
          java.lang.Object[] objects = new java.lang.Object[] {
            "baseAmount_",
            "quoteAmount_",
          };
          java.lang.String info =
              "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0003\u0002\u0003" +
              "";
          return newMessageInfo(DEFAULT_INSTANCE, info, objects);
      }
      // fall through
      case GET_DEFAULT_INSTANCE: {
        return DEFAULT_INSTANCE;
      }
      case GET_PARSER: {
        com.google.protobuf.Parser<com.tdex.v1.Balance> parser = PARSER;
        if (parser == null) {
          synchronized (com.tdex.v1.Balance.class) {
            parser = PARSER;
            if (parser == null) {
              parser =
                  new DefaultInstanceBasedParser<com.tdex.v1.Balance>(
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


  // @@protoc_insertion_point(class_scope:tdex.v1.Balance)
  private static final com.tdex.v1.Balance DEFAULT_INSTANCE;
  static {
    Balance defaultInstance = new Balance();
    // New instances are implicitly immutable so no need to make
    // immutable.
    DEFAULT_INSTANCE = defaultInstance;
    com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(
      Balance.class, defaultInstance);
  }

  public static com.tdex.v1.Balance getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static volatile com.google.protobuf.Parser<Balance> PARSER;

  public static com.google.protobuf.Parser<Balance> parser() {
    return DEFAULT_INSTANCE.getParserForType();
  }
}

