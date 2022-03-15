// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: v1/types.proto

package com.tdex.v1;

/**
 * Protobuf type {@code tdex.v1.Price}
 */
public  final class Price extends
    com.google.protobuf.GeneratedMessageLite<
        Price, Price.Builder> implements
    // @@protoc_insertion_point(message_implements:tdex.v1.Price)
    PriceOrBuilder {
  private Price() {
  }
  public static final int BASE_PRICE_DEPRECATED_FIELD_NUMBER = 1;
  private float basePriceDeprecated_;
  /**
   * <code>float base_price_deprecated = 1 [json_name = "basePriceDeprecated"];</code>
   * @return The basePriceDeprecated.
   */
  @java.lang.Override
  public float getBasePriceDeprecated() {
    return basePriceDeprecated_;
  }
  /**
   * <code>float base_price_deprecated = 1 [json_name = "basePriceDeprecated"];</code>
   * @param value The basePriceDeprecated to set.
   */
  private void setBasePriceDeprecated(float value) {
    
    basePriceDeprecated_ = value;
  }
  /**
   * <code>float base_price_deprecated = 1 [json_name = "basePriceDeprecated"];</code>
   */
  private void clearBasePriceDeprecated() {
    
    basePriceDeprecated_ = 0F;
  }

  public static final int QUOTE_PRICE_DEPRECATED_FIELD_NUMBER = 2;
  private float quotePriceDeprecated_;
  /**
   * <code>float quote_price_deprecated = 2 [json_name = "quotePriceDeprecated"];</code>
   * @return The quotePriceDeprecated.
   */
  @java.lang.Override
  public float getQuotePriceDeprecated() {
    return quotePriceDeprecated_;
  }
  /**
   * <code>float quote_price_deprecated = 2 [json_name = "quotePriceDeprecated"];</code>
   * @param value The quotePriceDeprecated to set.
   */
  private void setQuotePriceDeprecated(float value) {
    
    quotePriceDeprecated_ = value;
  }
  /**
   * <code>float quote_price_deprecated = 2 [json_name = "quotePriceDeprecated"];</code>
   */
  private void clearQuotePriceDeprecated() {
    
    quotePriceDeprecated_ = 0F;
  }

  public static final int BASE_PRICE_FIELD_NUMBER = 3;
  private double basePrice_;
  /**
   * <code>double base_price = 3 [json_name = "basePrice"];</code>
   * @return The basePrice.
   */
  @java.lang.Override
  public double getBasePrice() {
    return basePrice_;
  }
  /**
   * <code>double base_price = 3 [json_name = "basePrice"];</code>
   * @param value The basePrice to set.
   */
  private void setBasePrice(double value) {
    
    basePrice_ = value;
  }
  /**
   * <code>double base_price = 3 [json_name = "basePrice"];</code>
   */
  private void clearBasePrice() {
    
    basePrice_ = 0D;
  }

  public static final int QUOTE_PRICE_FIELD_NUMBER = 4;
  private double quotePrice_;
  /**
   * <code>double quote_price = 4 [json_name = "quotePrice"];</code>
   * @return The quotePrice.
   */
  @java.lang.Override
  public double getQuotePrice() {
    return quotePrice_;
  }
  /**
   * <code>double quote_price = 4 [json_name = "quotePrice"];</code>
   * @param value The quotePrice to set.
   */
  private void setQuotePrice(double value) {
    
    quotePrice_ = value;
  }
  /**
   * <code>double quote_price = 4 [json_name = "quotePrice"];</code>
   */
  private void clearQuotePrice() {
    
    quotePrice_ = 0D;
  }

  public static com.tdex.v1.Price parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static com.tdex.v1.Price parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static com.tdex.v1.Price parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static com.tdex.v1.Price parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static com.tdex.v1.Price parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static com.tdex.v1.Price parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static com.tdex.v1.Price parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static com.tdex.v1.Price parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static com.tdex.v1.Price parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input);
  }
  public static com.tdex.v1.Price parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static com.tdex.v1.Price parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static com.tdex.v1.Price parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }

  public static Builder newBuilder() {
    return (Builder) DEFAULT_INSTANCE.createBuilder();
  }
  public static Builder newBuilder(com.tdex.v1.Price prototype) {
    return (Builder) DEFAULT_INSTANCE.createBuilder(prototype);
  }

  /**
   * Protobuf type {@code tdex.v1.Price}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageLite.Builder<
        com.tdex.v1.Price, Builder> implements
      // @@protoc_insertion_point(builder_implements:tdex.v1.Price)
      com.tdex.v1.PriceOrBuilder {
    // Construct using com.tdex.v1.Price.newBuilder()
    private Builder() {
      super(DEFAULT_INSTANCE);
    }


    /**
     * <code>float base_price_deprecated = 1 [json_name = "basePriceDeprecated"];</code>
     * @return The basePriceDeprecated.
     */
    @java.lang.Override
    public float getBasePriceDeprecated() {
      return instance.getBasePriceDeprecated();
    }
    /**
     * <code>float base_price_deprecated = 1 [json_name = "basePriceDeprecated"];</code>
     * @param value The basePriceDeprecated to set.
     * @return This builder for chaining.
     */
    public Builder setBasePriceDeprecated(float value) {
      copyOnWrite();
      instance.setBasePriceDeprecated(value);
      return this;
    }
    /**
     * <code>float base_price_deprecated = 1 [json_name = "basePriceDeprecated"];</code>
     * @return This builder for chaining.
     */
    public Builder clearBasePriceDeprecated() {
      copyOnWrite();
      instance.clearBasePriceDeprecated();
      return this;
    }

    /**
     * <code>float quote_price_deprecated = 2 [json_name = "quotePriceDeprecated"];</code>
     * @return The quotePriceDeprecated.
     */
    @java.lang.Override
    public float getQuotePriceDeprecated() {
      return instance.getQuotePriceDeprecated();
    }
    /**
     * <code>float quote_price_deprecated = 2 [json_name = "quotePriceDeprecated"];</code>
     * @param value The quotePriceDeprecated to set.
     * @return This builder for chaining.
     */
    public Builder setQuotePriceDeprecated(float value) {
      copyOnWrite();
      instance.setQuotePriceDeprecated(value);
      return this;
    }
    /**
     * <code>float quote_price_deprecated = 2 [json_name = "quotePriceDeprecated"];</code>
     * @return This builder for chaining.
     */
    public Builder clearQuotePriceDeprecated() {
      copyOnWrite();
      instance.clearQuotePriceDeprecated();
      return this;
    }

    /**
     * <code>double base_price = 3 [json_name = "basePrice"];</code>
     * @return The basePrice.
     */
    @java.lang.Override
    public double getBasePrice() {
      return instance.getBasePrice();
    }
    /**
     * <code>double base_price = 3 [json_name = "basePrice"];</code>
     * @param value The basePrice to set.
     * @return This builder for chaining.
     */
    public Builder setBasePrice(double value) {
      copyOnWrite();
      instance.setBasePrice(value);
      return this;
    }
    /**
     * <code>double base_price = 3 [json_name = "basePrice"];</code>
     * @return This builder for chaining.
     */
    public Builder clearBasePrice() {
      copyOnWrite();
      instance.clearBasePrice();
      return this;
    }

    /**
     * <code>double quote_price = 4 [json_name = "quotePrice"];</code>
     * @return The quotePrice.
     */
    @java.lang.Override
    public double getQuotePrice() {
      return instance.getQuotePrice();
    }
    /**
     * <code>double quote_price = 4 [json_name = "quotePrice"];</code>
     * @param value The quotePrice to set.
     * @return This builder for chaining.
     */
    public Builder setQuotePrice(double value) {
      copyOnWrite();
      instance.setQuotePrice(value);
      return this;
    }
    /**
     * <code>double quote_price = 4 [json_name = "quotePrice"];</code>
     * @return This builder for chaining.
     */
    public Builder clearQuotePrice() {
      copyOnWrite();
      instance.clearQuotePrice();
      return this;
    }

    // @@protoc_insertion_point(builder_scope:tdex.v1.Price)
  }
  @java.lang.Override
  @java.lang.SuppressWarnings({"unchecked", "fallthrough"})
  protected final java.lang.Object dynamicMethod(
      com.google.protobuf.GeneratedMessageLite.MethodToInvoke method,
      java.lang.Object arg0, java.lang.Object arg1) {
    switch (method) {
      case NEW_MUTABLE_INSTANCE: {
        return new com.tdex.v1.Price();
      }
      case NEW_BUILDER: {
        return new Builder();
      }
      case BUILD_MESSAGE_INFO: {
          java.lang.Object[] objects = new java.lang.Object[] {
            "basePriceDeprecated_",
            "quotePriceDeprecated_",
            "basePrice_",
            "quotePrice_",
          };
          java.lang.String info =
              "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u0001\u0002\u0001" +
              "\u0003\u0000\u0004\u0000";
          return newMessageInfo(DEFAULT_INSTANCE, info, objects);
      }
      // fall through
      case GET_DEFAULT_INSTANCE: {
        return DEFAULT_INSTANCE;
      }
      case GET_PARSER: {
        com.google.protobuf.Parser<com.tdex.v1.Price> parser = PARSER;
        if (parser == null) {
          synchronized (com.tdex.v1.Price.class) {
            parser = PARSER;
            if (parser == null) {
              parser =
                  new DefaultInstanceBasedParser<com.tdex.v1.Price>(
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


  // @@protoc_insertion_point(class_scope:tdex.v1.Price)
  private static final com.tdex.v1.Price DEFAULT_INSTANCE;
  static {
    Price defaultInstance = new Price();
    // New instances are implicitly immutable so no need to make
    // immutable.
    DEFAULT_INSTANCE = defaultInstance;
    com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(
      Price.class, defaultInstance);
  }

  public static com.tdex.v1.Price getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static volatile com.google.protobuf.Parser<Price> PARSER;

  public static com.google.protobuf.Parser<Price> parser() {
    return DEFAULT_INSTANCE.getParserForType();
  }
}

