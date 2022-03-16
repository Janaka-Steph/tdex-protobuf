// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: tdex/v1/types.proto

package com.tdex.v1;

/**
 * Protobuf type {@code tdex.v1.MarketWithFee}
 */
public final class MarketWithFee extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:tdex.v1.MarketWithFee)
    MarketWithFeeOrBuilder {
private static final long serialVersionUID = 0L;
  // Use MarketWithFee.newBuilder() to construct.
  private MarketWithFee(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private MarketWithFee() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new MarketWithFee();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private MarketWithFee(
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
            com.tdex.v1.Market.Builder subBuilder = null;
            if (market_ != null) {
              subBuilder = market_.toBuilder();
            }
            market_ = input.readMessage(com.tdex.v1.Market.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(market_);
              market_ = subBuilder.buildPartial();
            }

            break;
          }
          case 18: {
            com.tdex.v1.Fee.Builder subBuilder = null;
            if (fee_ != null) {
              subBuilder = fee_.toBuilder();
            }
            fee_ = input.readMessage(com.tdex.v1.Fee.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(fee_);
              fee_ = subBuilder.buildPartial();
            }

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
    return com.tdex.v1.TypesProto.internal_static_tdex_v1_MarketWithFee_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.tdex.v1.TypesProto.internal_static_tdex_v1_MarketWithFee_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.tdex.v1.MarketWithFee.class, com.tdex.v1.MarketWithFee.Builder.class);
  }

  public static final int MARKET_FIELD_NUMBER = 1;
  private com.tdex.v1.Market market_;
  /**
   * <code>.tdex.v1.Market market = 1 [json_name = "market"];</code>
   * @return Whether the market field is set.
   */
  @java.lang.Override
  public boolean hasMarket() {
    return market_ != null;
  }
  /**
   * <code>.tdex.v1.Market market = 1 [json_name = "market"];</code>
   * @return The market.
   */
  @java.lang.Override
  public com.tdex.v1.Market getMarket() {
    return market_ == null ? com.tdex.v1.Market.getDefaultInstance() : market_;
  }
  /**
   * <code>.tdex.v1.Market market = 1 [json_name = "market"];</code>
   */
  @java.lang.Override
  public com.tdex.v1.MarketOrBuilder getMarketOrBuilder() {
    return getMarket();
  }

  public static final int FEE_FIELD_NUMBER = 2;
  private com.tdex.v1.Fee fee_;
  /**
   * <code>.tdex.v1.Fee fee = 2 [json_name = "fee"];</code>
   * @return Whether the fee field is set.
   */
  @java.lang.Override
  public boolean hasFee() {
    return fee_ != null;
  }
  /**
   * <code>.tdex.v1.Fee fee = 2 [json_name = "fee"];</code>
   * @return The fee.
   */
  @java.lang.Override
  public com.tdex.v1.Fee getFee() {
    return fee_ == null ? com.tdex.v1.Fee.getDefaultInstance() : fee_;
  }
  /**
   * <code>.tdex.v1.Fee fee = 2 [json_name = "fee"];</code>
   */
  @java.lang.Override
  public com.tdex.v1.FeeOrBuilder getFeeOrBuilder() {
    return getFee();
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
    if (market_ != null) {
      output.writeMessage(1, getMarket());
    }
    if (fee_ != null) {
      output.writeMessage(2, getFee());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (market_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getMarket());
    }
    if (fee_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getFee());
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
    if (!(obj instanceof com.tdex.v1.MarketWithFee)) {
      return super.equals(obj);
    }
    com.tdex.v1.MarketWithFee other = (com.tdex.v1.MarketWithFee) obj;

    if (hasMarket() != other.hasMarket()) return false;
    if (hasMarket()) {
      if (!getMarket()
          .equals(other.getMarket())) return false;
    }
    if (hasFee() != other.hasFee()) return false;
    if (hasFee()) {
      if (!getFee()
          .equals(other.getFee())) return false;
    }
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
    if (hasMarket()) {
      hash = (37 * hash) + MARKET_FIELD_NUMBER;
      hash = (53 * hash) + getMarket().hashCode();
    }
    if (hasFee()) {
      hash = (37 * hash) + FEE_FIELD_NUMBER;
      hash = (53 * hash) + getFee().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.tdex.v1.MarketWithFee parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tdex.v1.MarketWithFee parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tdex.v1.MarketWithFee parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tdex.v1.MarketWithFee parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tdex.v1.MarketWithFee parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tdex.v1.MarketWithFee parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tdex.v1.MarketWithFee parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tdex.v1.MarketWithFee parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.tdex.v1.MarketWithFee parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.tdex.v1.MarketWithFee parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.tdex.v1.MarketWithFee parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tdex.v1.MarketWithFee parseFrom(
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
  public static Builder newBuilder(com.tdex.v1.MarketWithFee prototype) {
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
   * Protobuf type {@code tdex.v1.MarketWithFee}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:tdex.v1.MarketWithFee)
      com.tdex.v1.MarketWithFeeOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.tdex.v1.TypesProto.internal_static_tdex_v1_MarketWithFee_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.tdex.v1.TypesProto.internal_static_tdex_v1_MarketWithFee_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.tdex.v1.MarketWithFee.class, com.tdex.v1.MarketWithFee.Builder.class);
    }

    // Construct using com.tdex.v1.MarketWithFee.newBuilder()
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
      if (marketBuilder_ == null) {
        market_ = null;
      } else {
        market_ = null;
        marketBuilder_ = null;
      }
      if (feeBuilder_ == null) {
        fee_ = null;
      } else {
        fee_ = null;
        feeBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.tdex.v1.TypesProto.internal_static_tdex_v1_MarketWithFee_descriptor;
    }

    @java.lang.Override
    public com.tdex.v1.MarketWithFee getDefaultInstanceForType() {
      return com.tdex.v1.MarketWithFee.getDefaultInstance();
    }

    @java.lang.Override
    public com.tdex.v1.MarketWithFee build() {
      com.tdex.v1.MarketWithFee result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.tdex.v1.MarketWithFee buildPartial() {
      com.tdex.v1.MarketWithFee result = new com.tdex.v1.MarketWithFee(this);
      if (marketBuilder_ == null) {
        result.market_ = market_;
      } else {
        result.market_ = marketBuilder_.build();
      }
      if (feeBuilder_ == null) {
        result.fee_ = fee_;
      } else {
        result.fee_ = feeBuilder_.build();
      }
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
      if (other instanceof com.tdex.v1.MarketWithFee) {
        return mergeFrom((com.tdex.v1.MarketWithFee)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.tdex.v1.MarketWithFee other) {
      if (other == com.tdex.v1.MarketWithFee.getDefaultInstance()) return this;
      if (other.hasMarket()) {
        mergeMarket(other.getMarket());
      }
      if (other.hasFee()) {
        mergeFee(other.getFee());
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
      com.tdex.v1.MarketWithFee parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.tdex.v1.MarketWithFee) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private com.tdex.v1.Market market_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.tdex.v1.Market, com.tdex.v1.Market.Builder, com.tdex.v1.MarketOrBuilder> marketBuilder_;
    /**
     * <code>.tdex.v1.Market market = 1 [json_name = "market"];</code>
     * @return Whether the market field is set.
     */
    public boolean hasMarket() {
      return marketBuilder_ != null || market_ != null;
    }
    /**
     * <code>.tdex.v1.Market market = 1 [json_name = "market"];</code>
     * @return The market.
     */
    public com.tdex.v1.Market getMarket() {
      if (marketBuilder_ == null) {
        return market_ == null ? com.tdex.v1.Market.getDefaultInstance() : market_;
      } else {
        return marketBuilder_.getMessage();
      }
    }
    /**
     * <code>.tdex.v1.Market market = 1 [json_name = "market"];</code>
     */
    public Builder setMarket(com.tdex.v1.Market value) {
      if (marketBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        market_ = value;
        onChanged();
      } else {
        marketBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.tdex.v1.Market market = 1 [json_name = "market"];</code>
     */
    public Builder setMarket(
        com.tdex.v1.Market.Builder builderForValue) {
      if (marketBuilder_ == null) {
        market_ = builderForValue.build();
        onChanged();
      } else {
        marketBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.tdex.v1.Market market = 1 [json_name = "market"];</code>
     */
    public Builder mergeMarket(com.tdex.v1.Market value) {
      if (marketBuilder_ == null) {
        if (market_ != null) {
          market_ =
            com.tdex.v1.Market.newBuilder(market_).mergeFrom(value).buildPartial();
        } else {
          market_ = value;
        }
        onChanged();
      } else {
        marketBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.tdex.v1.Market market = 1 [json_name = "market"];</code>
     */
    public Builder clearMarket() {
      if (marketBuilder_ == null) {
        market_ = null;
        onChanged();
      } else {
        market_ = null;
        marketBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.tdex.v1.Market market = 1 [json_name = "market"];</code>
     */
    public com.tdex.v1.Market.Builder getMarketBuilder() {
      
      onChanged();
      return getMarketFieldBuilder().getBuilder();
    }
    /**
     * <code>.tdex.v1.Market market = 1 [json_name = "market"];</code>
     */
    public com.tdex.v1.MarketOrBuilder getMarketOrBuilder() {
      if (marketBuilder_ != null) {
        return marketBuilder_.getMessageOrBuilder();
      } else {
        return market_ == null ?
            com.tdex.v1.Market.getDefaultInstance() : market_;
      }
    }
    /**
     * <code>.tdex.v1.Market market = 1 [json_name = "market"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.tdex.v1.Market, com.tdex.v1.Market.Builder, com.tdex.v1.MarketOrBuilder> 
        getMarketFieldBuilder() {
      if (marketBuilder_ == null) {
        marketBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.tdex.v1.Market, com.tdex.v1.Market.Builder, com.tdex.v1.MarketOrBuilder>(
                getMarket(),
                getParentForChildren(),
                isClean());
        market_ = null;
      }
      return marketBuilder_;
    }

    private com.tdex.v1.Fee fee_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.tdex.v1.Fee, com.tdex.v1.Fee.Builder, com.tdex.v1.FeeOrBuilder> feeBuilder_;
    /**
     * <code>.tdex.v1.Fee fee = 2 [json_name = "fee"];</code>
     * @return Whether the fee field is set.
     */
    public boolean hasFee() {
      return feeBuilder_ != null || fee_ != null;
    }
    /**
     * <code>.tdex.v1.Fee fee = 2 [json_name = "fee"];</code>
     * @return The fee.
     */
    public com.tdex.v1.Fee getFee() {
      if (feeBuilder_ == null) {
        return fee_ == null ? com.tdex.v1.Fee.getDefaultInstance() : fee_;
      } else {
        return feeBuilder_.getMessage();
      }
    }
    /**
     * <code>.tdex.v1.Fee fee = 2 [json_name = "fee"];</code>
     */
    public Builder setFee(com.tdex.v1.Fee value) {
      if (feeBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        fee_ = value;
        onChanged();
      } else {
        feeBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.tdex.v1.Fee fee = 2 [json_name = "fee"];</code>
     */
    public Builder setFee(
        com.tdex.v1.Fee.Builder builderForValue) {
      if (feeBuilder_ == null) {
        fee_ = builderForValue.build();
        onChanged();
      } else {
        feeBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.tdex.v1.Fee fee = 2 [json_name = "fee"];</code>
     */
    public Builder mergeFee(com.tdex.v1.Fee value) {
      if (feeBuilder_ == null) {
        if (fee_ != null) {
          fee_ =
            com.tdex.v1.Fee.newBuilder(fee_).mergeFrom(value).buildPartial();
        } else {
          fee_ = value;
        }
        onChanged();
      } else {
        feeBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.tdex.v1.Fee fee = 2 [json_name = "fee"];</code>
     */
    public Builder clearFee() {
      if (feeBuilder_ == null) {
        fee_ = null;
        onChanged();
      } else {
        fee_ = null;
        feeBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.tdex.v1.Fee fee = 2 [json_name = "fee"];</code>
     */
    public com.tdex.v1.Fee.Builder getFeeBuilder() {
      
      onChanged();
      return getFeeFieldBuilder().getBuilder();
    }
    /**
     * <code>.tdex.v1.Fee fee = 2 [json_name = "fee"];</code>
     */
    public com.tdex.v1.FeeOrBuilder getFeeOrBuilder() {
      if (feeBuilder_ != null) {
        return feeBuilder_.getMessageOrBuilder();
      } else {
        return fee_ == null ?
            com.tdex.v1.Fee.getDefaultInstance() : fee_;
      }
    }
    /**
     * <code>.tdex.v1.Fee fee = 2 [json_name = "fee"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.tdex.v1.Fee, com.tdex.v1.Fee.Builder, com.tdex.v1.FeeOrBuilder> 
        getFeeFieldBuilder() {
      if (feeBuilder_ == null) {
        feeBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.tdex.v1.Fee, com.tdex.v1.Fee.Builder, com.tdex.v1.FeeOrBuilder>(
                getFee(),
                getParentForChildren(),
                isClean());
        fee_ = null;
      }
      return feeBuilder_;
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


    // @@protoc_insertion_point(builder_scope:tdex.v1.MarketWithFee)
  }

  // @@protoc_insertion_point(class_scope:tdex.v1.MarketWithFee)
  private static final com.tdex.v1.MarketWithFee DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.tdex.v1.MarketWithFee();
  }

  public static com.tdex.v1.MarketWithFee getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<MarketWithFee>
      PARSER = new com.google.protobuf.AbstractParser<MarketWithFee>() {
    @java.lang.Override
    public MarketWithFee parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new MarketWithFee(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<MarketWithFee> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<MarketWithFee> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.tdex.v1.MarketWithFee getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

