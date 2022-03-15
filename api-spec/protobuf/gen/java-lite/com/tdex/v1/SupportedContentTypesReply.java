// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: v1/transport.proto

package com.tdex.v1;

/**
 * Protobuf type {@code tdex.v1.SupportedContentTypesReply}
 */
public  final class SupportedContentTypesReply extends
    com.google.protobuf.GeneratedMessageLite<
        SupportedContentTypesReply, SupportedContentTypesReply.Builder> implements
    // @@protoc_insertion_point(message_implements:tdex.v1.SupportedContentTypesReply)
    SupportedContentTypesReplyOrBuilder {
  private SupportedContentTypesReply() {
    acceptedTypes_ = emptyIntList();
  }
  public static final int ACCEPTED_TYPES_FIELD_NUMBER = 1;
  private com.google.protobuf.Internal.IntList acceptedTypes_;
  private static final com.google.protobuf.Internal.ListAdapter.Converter<
      java.lang.Integer, com.tdex.v1.ContentType> acceptedTypes_converter_ =
          new com.google.protobuf.Internal.ListAdapter.Converter<
              java.lang.Integer, com.tdex.v1.ContentType>() {
            @java.lang.Override
            public com.tdex.v1.ContentType convert(java.lang.Integer from) {
              com.tdex.v1.ContentType result = com.tdex.v1.ContentType.forNumber(from);
              return result == null ? com.tdex.v1.ContentType.UNRECOGNIZED : result;
            }
          };
  /**
   * <code>repeated .tdex.v1.ContentType accepted_types = 1 [json_name = "acceptedTypes"];</code>
   * @return A list containing the acceptedTypes.
   */
  @java.lang.Override
  public java.util.List<com.tdex.v1.ContentType> getAcceptedTypesList() {
    return new com.google.protobuf.Internal.ListAdapter<
        java.lang.Integer, com.tdex.v1.ContentType>(acceptedTypes_, acceptedTypes_converter_);
  }
  /**
   * <code>repeated .tdex.v1.ContentType accepted_types = 1 [json_name = "acceptedTypes"];</code>
   * @return The count of acceptedTypes.
   */
  @java.lang.Override
  public int getAcceptedTypesCount() {
    return acceptedTypes_.size();
  }
  /**
   * <code>repeated .tdex.v1.ContentType accepted_types = 1 [json_name = "acceptedTypes"];</code>
   * @param index The index of the element to return.
   * @return The acceptedTypes at the given index.
   */
  @java.lang.Override
  public com.tdex.v1.ContentType getAcceptedTypes(int index) {
    com.tdex.v1.ContentType result = com.tdex.v1.ContentType.forNumber(acceptedTypes_.getInt(index));
    return result == null ? com.tdex.v1.ContentType.UNRECOGNIZED : result;
  }
  /**
   * <code>repeated .tdex.v1.ContentType accepted_types = 1 [json_name = "acceptedTypes"];</code>
   * @return A list containing the enum numeric values on the wire for acceptedTypes.
   */
  @java.lang.Override
  public java.util.List<java.lang.Integer>
  getAcceptedTypesValueList() {
    return acceptedTypes_;
  }
  /**
   * <code>repeated .tdex.v1.ContentType accepted_types = 1 [json_name = "acceptedTypes"];</code>
   * @param index The index of the value to return.
   * @return The enum numeric value on the wire of acceptedTypes at the given index.
   */
  @java.lang.Override
  public int getAcceptedTypesValue(int index) {
    return acceptedTypes_.getInt(index);
  }
  private int acceptedTypesMemoizedSerializedSize;
  private void ensureAcceptedTypesIsMutable() {
    com.google.protobuf.Internal.IntList tmp = acceptedTypes_;
    if (!tmp.isModifiable()) {
      acceptedTypes_ =
          com.google.protobuf.GeneratedMessageLite.mutableCopy(tmp);
    }
  }
  /**
   * <code>repeated .tdex.v1.ContentType accepted_types = 1 [json_name = "acceptedTypes"];</code>
   * @param index The index to set the value at.
   * @param value The acceptedTypes to set.
   */
  private void setAcceptedTypes(
      int index, com.tdex.v1.ContentType value) {
    value.getClass();
  ensureAcceptedTypesIsMutable();
    acceptedTypes_.setInt(index, value.getNumber());
  }
  /**
   * <code>repeated .tdex.v1.ContentType accepted_types = 1 [json_name = "acceptedTypes"];</code>
   * @param value The acceptedTypes to add.
   */
  private void addAcceptedTypes(com.tdex.v1.ContentType value) {
    value.getClass();
  ensureAcceptedTypesIsMutable();
    acceptedTypes_.addInt(value.getNumber());
  }
  /**
   * <code>repeated .tdex.v1.ContentType accepted_types = 1 [json_name = "acceptedTypes"];</code>
   * @param values The acceptedTypes to add.
   */
  private void addAllAcceptedTypes(
      java.lang.Iterable<? extends com.tdex.v1.ContentType> values) {
    ensureAcceptedTypesIsMutable();
    for (com.tdex.v1.ContentType value : values) {
      acceptedTypes_.addInt(value.getNumber());
    }
  }
  /**
   * <code>repeated .tdex.v1.ContentType accepted_types = 1 [json_name = "acceptedTypes"];</code>
   */
  private void clearAcceptedTypes() {
    acceptedTypes_ = emptyIntList();
  }
  /**
   * <code>repeated .tdex.v1.ContentType accepted_types = 1 [json_name = "acceptedTypes"];</code>
   * @param value The enum numeric value on the wire for acceptedTypes to set.
   */
  private void setAcceptedTypesValue(
      int index, int value) {
    ensureAcceptedTypesIsMutable();
    acceptedTypes_.setInt(index, value);
  }
  /**
   * <code>repeated .tdex.v1.ContentType accepted_types = 1 [json_name = "acceptedTypes"];</code>
   * @param value The enum numeric value on the wire for acceptedTypes to add.
   */
  private void addAcceptedTypesValue(int value) {
    ensureAcceptedTypesIsMutable();
    acceptedTypes_.addInt(value);
  }
  /**
   * <code>repeated .tdex.v1.ContentType accepted_types = 1 [json_name = "acceptedTypes"];</code>
   * @param values The enum numeric values on the wire for acceptedTypes to add.
   */
  private void addAllAcceptedTypesValue(
      java.lang.Iterable<java.lang.Integer> values) {
    ensureAcceptedTypesIsMutable();
    for (int value : values) {
      acceptedTypes_.addInt(value);
    }
  }

  public static com.tdex.v1.SupportedContentTypesReply parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static com.tdex.v1.SupportedContentTypesReply parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static com.tdex.v1.SupportedContentTypesReply parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static com.tdex.v1.SupportedContentTypesReply parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static com.tdex.v1.SupportedContentTypesReply parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static com.tdex.v1.SupportedContentTypesReply parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static com.tdex.v1.SupportedContentTypesReply parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static com.tdex.v1.SupportedContentTypesReply parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static com.tdex.v1.SupportedContentTypesReply parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input);
  }
  public static com.tdex.v1.SupportedContentTypesReply parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static com.tdex.v1.SupportedContentTypesReply parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static com.tdex.v1.SupportedContentTypesReply parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }

  public static Builder newBuilder() {
    return (Builder) DEFAULT_INSTANCE.createBuilder();
  }
  public static Builder newBuilder(com.tdex.v1.SupportedContentTypesReply prototype) {
    return (Builder) DEFAULT_INSTANCE.createBuilder(prototype);
  }

  /**
   * Protobuf type {@code tdex.v1.SupportedContentTypesReply}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageLite.Builder<
        com.tdex.v1.SupportedContentTypesReply, Builder> implements
      // @@protoc_insertion_point(builder_implements:tdex.v1.SupportedContentTypesReply)
      com.tdex.v1.SupportedContentTypesReplyOrBuilder {
    // Construct using com.tdex.v1.SupportedContentTypesReply.newBuilder()
    private Builder() {
      super(DEFAULT_INSTANCE);
    }


    /**
     * <code>repeated .tdex.v1.ContentType accepted_types = 1 [json_name = "acceptedTypes"];</code>
     * @return A list containing the acceptedTypes.
     */
    @java.lang.Override
    public java.util.List<com.tdex.v1.ContentType> getAcceptedTypesList() {
      return instance.getAcceptedTypesList();
    }
    /**
     * <code>repeated .tdex.v1.ContentType accepted_types = 1 [json_name = "acceptedTypes"];</code>
     * @return The count of acceptedTypes.
     */
    @java.lang.Override
    public int getAcceptedTypesCount() {
      return instance.getAcceptedTypesCount();
    }
    /**
     * <code>repeated .tdex.v1.ContentType accepted_types = 1 [json_name = "acceptedTypes"];</code>
     * @param index The index of the element to return.
     * @return The acceptedTypes at the given index.
     */
    @java.lang.Override
    public com.tdex.v1.ContentType getAcceptedTypes(int index) {
      return instance.getAcceptedTypes(index);
    }
    /**
     * <code>repeated .tdex.v1.ContentType accepted_types = 1 [json_name = "acceptedTypes"];</code>
     * @param index The index to set the value at.
     * @param value The acceptedTypes to set.
     * @return This builder for chaining.
     */
    public Builder setAcceptedTypes(
        int index, com.tdex.v1.ContentType value) {
      copyOnWrite();
      instance.setAcceptedTypes(index, value);
      return this;
    }
    /**
     * <code>repeated .tdex.v1.ContentType accepted_types = 1 [json_name = "acceptedTypes"];</code>
     * @param value The acceptedTypes to add.
     * @return This builder for chaining.
     */
    public Builder addAcceptedTypes(com.tdex.v1.ContentType value) {
      copyOnWrite();
      instance.addAcceptedTypes(value);
      return this;
    }
    /**
     * <code>repeated .tdex.v1.ContentType accepted_types = 1 [json_name = "acceptedTypes"];</code>
     * @param values The acceptedTypes to add.
     * @return This builder for chaining.
     */
    public Builder addAllAcceptedTypes(
        java.lang.Iterable<? extends com.tdex.v1.ContentType> values) {
      copyOnWrite();
      instance.addAllAcceptedTypes(values);  return this;
    }
    /**
     * <code>repeated .tdex.v1.ContentType accepted_types = 1 [json_name = "acceptedTypes"];</code>
     * @return This builder for chaining.
     */
    public Builder clearAcceptedTypes() {
      copyOnWrite();
      instance.clearAcceptedTypes();
      return this;
    }
    /**
     * <code>repeated .tdex.v1.ContentType accepted_types = 1 [json_name = "acceptedTypes"];</code>
     * @return A list containing the enum numeric values on the wire for acceptedTypes.
     */
    @java.lang.Override
    public java.util.List<java.lang.Integer>
    getAcceptedTypesValueList() {
      return java.util.Collections.unmodifiableList(
          instance.getAcceptedTypesValueList());
    }
    /**
     * <code>repeated .tdex.v1.ContentType accepted_types = 1 [json_name = "acceptedTypes"];</code>
     * @param index The index of the value to return.
     * @return The enum numeric value on the wire of acceptedTypes at the given index.
     */
    @java.lang.Override
    public int getAcceptedTypesValue(int index) {
      return instance.getAcceptedTypesValue(index);
    }
    /**
     * <code>repeated .tdex.v1.ContentType accepted_types = 1 [json_name = "acceptedTypes"];</code>
     * @param index The index to set the value at.
     * @param value The enum numeric value on the wire for acceptedTypes to set.
     * @return This builder for chaining.
     */
    public Builder setAcceptedTypesValue(
        int index, int value) {
      copyOnWrite();
      instance.setAcceptedTypesValue(index, value);
      return this;
    }
    /**
     * <code>repeated .tdex.v1.ContentType accepted_types = 1 [json_name = "acceptedTypes"];</code>
     * @param value The enum numeric value on the wire for acceptedTypes to add.
     * @return This builder for chaining.
     */
    public Builder addAcceptedTypesValue(int value) {
      instance.addAcceptedTypesValue(value);
      return this;
    }
    /**
     * <code>repeated .tdex.v1.ContentType accepted_types = 1 [json_name = "acceptedTypes"];</code>
     * @param values The enum numeric values on the wire for acceptedTypes to add.
     * @return This builder for chaining.
     */
    public Builder addAllAcceptedTypesValue(
        java.lang.Iterable<java.lang.Integer> values) {
      copyOnWrite();
      instance.addAllAcceptedTypesValue(values);
      return this;
    }

    // @@protoc_insertion_point(builder_scope:tdex.v1.SupportedContentTypesReply)
  }
  @java.lang.Override
  @java.lang.SuppressWarnings({"unchecked", "fallthrough"})
  protected final java.lang.Object dynamicMethod(
      com.google.protobuf.GeneratedMessageLite.MethodToInvoke method,
      java.lang.Object arg0, java.lang.Object arg1) {
    switch (method) {
      case NEW_MUTABLE_INSTANCE: {
        return new com.tdex.v1.SupportedContentTypesReply();
      }
      case NEW_BUILDER: {
        return new Builder();
      }
      case BUILD_MESSAGE_INFO: {
          java.lang.Object[] objects = new java.lang.Object[] {
            "acceptedTypes_",
          };
          java.lang.String info =
              "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001,";
          return newMessageInfo(DEFAULT_INSTANCE, info, objects);
      }
      // fall through
      case GET_DEFAULT_INSTANCE: {
        return DEFAULT_INSTANCE;
      }
      case GET_PARSER: {
        com.google.protobuf.Parser<com.tdex.v1.SupportedContentTypesReply> parser = PARSER;
        if (parser == null) {
          synchronized (com.tdex.v1.SupportedContentTypesReply.class) {
            parser = PARSER;
            if (parser == null) {
              parser =
                  new DefaultInstanceBasedParser<com.tdex.v1.SupportedContentTypesReply>(
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


  // @@protoc_insertion_point(class_scope:tdex.v1.SupportedContentTypesReply)
  private static final com.tdex.v1.SupportedContentTypesReply DEFAULT_INSTANCE;
  static {
    SupportedContentTypesReply defaultInstance = new SupportedContentTypesReply();
    // New instances are implicitly immutable so no need to make
    // immutable.
    DEFAULT_INSTANCE = defaultInstance;
    com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(
      SupportedContentTypesReply.class, defaultInstance);
  }

  public static com.tdex.v1.SupportedContentTypesReply getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static volatile com.google.protobuf.Parser<SupportedContentTypesReply> PARSER;

  public static com.google.protobuf.Parser<SupportedContentTypesReply> parser() {
    return DEFAULT_INSTANCE.getParserForType();
  }
}

