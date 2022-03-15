// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: v1/types.proto

package com.tdex.v1;

/**
 * Protobuf type {@code tdex.v1.Market}
 */
public  final class Market extends
    com.google.protobuf.GeneratedMessageLite<
        Market, Market.Builder> implements
    // @@protoc_insertion_point(message_implements:tdex.v1.Market)
    MarketOrBuilder {
  private Market() {
    baseAsset_ = "";
    quoteAsset_ = "";
  }
  public static final int BASE_ASSET_FIELD_NUMBER = 1;
  private java.lang.String baseAsset_;
  /**
   * <code>string base_asset = 1 [json_name = "baseAsset"];</code>
   * @return The baseAsset.
   */
  @java.lang.Override
  public java.lang.String getBaseAsset() {
    return baseAsset_;
  }
  /**
   * <code>string base_asset = 1 [json_name = "baseAsset"];</code>
   * @return The bytes for baseAsset.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getBaseAssetBytes() {
    return com.google.protobuf.ByteString.copyFromUtf8(baseAsset_);
  }
  /**
   * <code>string base_asset = 1 [json_name = "baseAsset"];</code>
   * @param value The baseAsset to set.
   */
  private void setBaseAsset(
      java.lang.String value) {
    java.lang.Class<?> valueClass = value.getClass();
  
    baseAsset_ = value;
  }
  /**
   * <code>string base_asset = 1 [json_name = "baseAsset"];</code>
   */
  private void clearBaseAsset() {
    
    baseAsset_ = getDefaultInstance().getBaseAsset();
  }
  /**
   * <code>string base_asset = 1 [json_name = "baseAsset"];</code>
   * @param value The bytes for baseAsset to set.
   */
  private void setBaseAssetBytes(
      com.google.protobuf.ByteString value) {
    checkByteStringIsUtf8(value);
    baseAsset_ = value.toStringUtf8();
    
  }

  public static final int QUOTE_ASSET_FIELD_NUMBER = 2;
  private java.lang.String quoteAsset_;
  /**
   * <code>string quote_asset = 2 [json_name = "quoteAsset"];</code>
   * @return The quoteAsset.
   */
  @java.lang.Override
  public java.lang.String getQuoteAsset() {
    return quoteAsset_;
  }
  /**
   * <code>string quote_asset = 2 [json_name = "quoteAsset"];</code>
   * @return The bytes for quoteAsset.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getQuoteAssetBytes() {
    return com.google.protobuf.ByteString.copyFromUtf8(quoteAsset_);
  }
  /**
   * <code>string quote_asset = 2 [json_name = "quoteAsset"];</code>
   * @param value The quoteAsset to set.
   */
  private void setQuoteAsset(
      java.lang.String value) {
    java.lang.Class<?> valueClass = value.getClass();
  
    quoteAsset_ = value;
  }
  /**
   * <code>string quote_asset = 2 [json_name = "quoteAsset"];</code>
   */
  private void clearQuoteAsset() {
    
    quoteAsset_ = getDefaultInstance().getQuoteAsset();
  }
  /**
   * <code>string quote_asset = 2 [json_name = "quoteAsset"];</code>
   * @param value The bytes for quoteAsset to set.
   */
  private void setQuoteAssetBytes(
      com.google.protobuf.ByteString value) {
    checkByteStringIsUtf8(value);
    quoteAsset_ = value.toStringUtf8();
    
  }

  public static com.tdex.v1.Market parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static com.tdex.v1.Market parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static com.tdex.v1.Market parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static com.tdex.v1.Market parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static com.tdex.v1.Market parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static com.tdex.v1.Market parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static com.tdex.v1.Market parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static com.tdex.v1.Market parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static com.tdex.v1.Market parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input);
  }
  public static com.tdex.v1.Market parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static com.tdex.v1.Market parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static com.tdex.v1.Market parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }

  public static Builder newBuilder() {
    return (Builder) DEFAULT_INSTANCE.createBuilder();
  }
  public static Builder newBuilder(com.tdex.v1.Market prototype) {
    return (Builder) DEFAULT_INSTANCE.createBuilder(prototype);
  }

  /**
   * Protobuf type {@code tdex.v1.Market}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageLite.Builder<
        com.tdex.v1.Market, Builder> implements
      // @@protoc_insertion_point(builder_implements:tdex.v1.Market)
      com.tdex.v1.MarketOrBuilder {
    // Construct using com.tdex.v1.Market.newBuilder()
    private Builder() {
      super(DEFAULT_INSTANCE);
    }


    /**
     * <code>string base_asset = 1 [json_name = "baseAsset"];</code>
     * @return The baseAsset.
     */
    @java.lang.Override
    public java.lang.String getBaseAsset() {
      return instance.getBaseAsset();
    }
    /**
     * <code>string base_asset = 1 [json_name = "baseAsset"];</code>
     * @return The bytes for baseAsset.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getBaseAssetBytes() {
      return instance.getBaseAssetBytes();
    }
    /**
     * <code>string base_asset = 1 [json_name = "baseAsset"];</code>
     * @param value The baseAsset to set.
     * @return This builder for chaining.
     */
    public Builder setBaseAsset(
        java.lang.String value) {
      copyOnWrite();
      instance.setBaseAsset(value);
      return this;
    }
    /**
     * <code>string base_asset = 1 [json_name = "baseAsset"];</code>
     * @return This builder for chaining.
     */
    public Builder clearBaseAsset() {
      copyOnWrite();
      instance.clearBaseAsset();
      return this;
    }
    /**
     * <code>string base_asset = 1 [json_name = "baseAsset"];</code>
     * @param value The bytes for baseAsset to set.
     * @return This builder for chaining.
     */
    public Builder setBaseAssetBytes(
        com.google.protobuf.ByteString value) {
      copyOnWrite();
      instance.setBaseAssetBytes(value);
      return this;
    }

    /**
     * <code>string quote_asset = 2 [json_name = "quoteAsset"];</code>
     * @return The quoteAsset.
     */
    @java.lang.Override
    public java.lang.String getQuoteAsset() {
      return instance.getQuoteAsset();
    }
    /**
     * <code>string quote_asset = 2 [json_name = "quoteAsset"];</code>
     * @return The bytes for quoteAsset.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getQuoteAssetBytes() {
      return instance.getQuoteAssetBytes();
    }
    /**
     * <code>string quote_asset = 2 [json_name = "quoteAsset"];</code>
     * @param value The quoteAsset to set.
     * @return This builder for chaining.
     */
    public Builder setQuoteAsset(
        java.lang.String value) {
      copyOnWrite();
      instance.setQuoteAsset(value);
      return this;
    }
    /**
     * <code>string quote_asset = 2 [json_name = "quoteAsset"];</code>
     * @return This builder for chaining.
     */
    public Builder clearQuoteAsset() {
      copyOnWrite();
      instance.clearQuoteAsset();
      return this;
    }
    /**
     * <code>string quote_asset = 2 [json_name = "quoteAsset"];</code>
     * @param value The bytes for quoteAsset to set.
     * @return This builder for chaining.
     */
    public Builder setQuoteAssetBytes(
        com.google.protobuf.ByteString value) {
      copyOnWrite();
      instance.setQuoteAssetBytes(value);
      return this;
    }

    // @@protoc_insertion_point(builder_scope:tdex.v1.Market)
  }
  @java.lang.Override
  @java.lang.SuppressWarnings({"unchecked", "fallthrough"})
  protected final java.lang.Object dynamicMethod(
      com.google.protobuf.GeneratedMessageLite.MethodToInvoke method,
      java.lang.Object arg0, java.lang.Object arg1) {
    switch (method) {
      case NEW_MUTABLE_INSTANCE: {
        return new com.tdex.v1.Market();
      }
      case NEW_BUILDER: {
        return new Builder();
      }
      case BUILD_MESSAGE_INFO: {
          java.lang.Object[] objects = new java.lang.Object[] {
            "baseAsset_",
            "quoteAsset_",
          };
          java.lang.String info =
              "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0208\u0002\u0208" +
              "";
          return newMessageInfo(DEFAULT_INSTANCE, info, objects);
      }
      // fall through
      case GET_DEFAULT_INSTANCE: {
        return DEFAULT_INSTANCE;
      }
      case GET_PARSER: {
        com.google.protobuf.Parser<com.tdex.v1.Market> parser = PARSER;
        if (parser == null) {
          synchronized (com.tdex.v1.Market.class) {
            parser = PARSER;
            if (parser == null) {
              parser =
                  new DefaultInstanceBasedParser<com.tdex.v1.Market>(
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


  // @@protoc_insertion_point(class_scope:tdex.v1.Market)
  private static final com.tdex.v1.Market DEFAULT_INSTANCE;
  static {
    Market defaultInstance = new Market();
    // New instances are implicitly immutable so no need to make
    // immutable.
    DEFAULT_INSTANCE = defaultInstance;
    com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(
      Market.class, defaultInstance);
  }

  public static com.tdex.v1.Market getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static volatile com.google.protobuf.Parser<Market> PARSER;

  public static com.google.protobuf.Parser<Market> parser() {
    return DEFAULT_INSTANCE.getParserForType();
  }
}

