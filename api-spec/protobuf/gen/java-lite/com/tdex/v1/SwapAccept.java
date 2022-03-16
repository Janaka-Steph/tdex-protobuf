// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: tdex/v1/swap.proto

package com.tdex.v1;

/**
 * Protobuf type {@code tdex.v1.SwapAccept}
 */
public  final class SwapAccept extends
    com.google.protobuf.GeneratedMessageLite<
        SwapAccept, SwapAccept.Builder> implements
    // @@protoc_insertion_point(message_implements:tdex.v1.SwapAccept)
    SwapAcceptOrBuilder {
  private SwapAccept() {
    id_ = "";
    requestId_ = "";
    transaction_ = "";
  }
  public static final int ID_FIELD_NUMBER = 1;
  private java.lang.String id_;
  /**
   * <pre>
   * Random unique identifier for the current message
   * </pre>
   *
   * <code>string id = 1 [json_name = "id"];</code>
   * @return The id.
   */
  @java.lang.Override
  public java.lang.String getId() {
    return id_;
  }
  /**
   * <pre>
   * Random unique identifier for the current message
   * </pre>
   *
   * <code>string id = 1 [json_name = "id"];</code>
   * @return The bytes for id.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getIdBytes() {
    return com.google.protobuf.ByteString.copyFromUtf8(id_);
  }
  /**
   * <pre>
   * Random unique identifier for the current message
   * </pre>
   *
   * <code>string id = 1 [json_name = "id"];</code>
   * @param value The id to set.
   */
  private void setId(
      java.lang.String value) {
    java.lang.Class<?> valueClass = value.getClass();
  
    id_ = value;
  }
  /**
   * <pre>
   * Random unique identifier for the current message
   * </pre>
   *
   * <code>string id = 1 [json_name = "id"];</code>
   */
  private void clearId() {
    
    id_ = getDefaultInstance().getId();
  }
  /**
   * <pre>
   * Random unique identifier for the current message
   * </pre>
   *
   * <code>string id = 1 [json_name = "id"];</code>
   * @param value The bytes for id to set.
   */
  private void setIdBytes(
      com.google.protobuf.ByteString value) {
    checkByteStringIsUtf8(value);
    id_ = value.toStringUtf8();
    
  }

  public static final int REQUEST_ID_FIELD_NUMBER = 2;
  private java.lang.String requestId_;
  /**
   * <pre>
   * indetifier of the SwapRequest message
   * </pre>
   *
   * <code>string request_id = 2 [json_name = "requestId"];</code>
   * @return The requestId.
   */
  @java.lang.Override
  public java.lang.String getRequestId() {
    return requestId_;
  }
  /**
   * <pre>
   * indetifier of the SwapRequest message
   * </pre>
   *
   * <code>string request_id = 2 [json_name = "requestId"];</code>
   * @return The bytes for requestId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getRequestIdBytes() {
    return com.google.protobuf.ByteString.copyFromUtf8(requestId_);
  }
  /**
   * <pre>
   * indetifier of the SwapRequest message
   * </pre>
   *
   * <code>string request_id = 2 [json_name = "requestId"];</code>
   * @param value The requestId to set.
   */
  private void setRequestId(
      java.lang.String value) {
    java.lang.Class<?> valueClass = value.getClass();
  
    requestId_ = value;
  }
  /**
   * <pre>
   * indetifier of the SwapRequest message
   * </pre>
   *
   * <code>string request_id = 2 [json_name = "requestId"];</code>
   */
  private void clearRequestId() {
    
    requestId_ = getDefaultInstance().getRequestId();
  }
  /**
   * <pre>
   * indetifier of the SwapRequest message
   * </pre>
   *
   * <code>string request_id = 2 [json_name = "requestId"];</code>
   * @param value The bytes for requestId to set.
   */
  private void setRequestIdBytes(
      com.google.protobuf.ByteString value) {
    checkByteStringIsUtf8(value);
    requestId_ = value.toStringUtf8();
    
  }

  public static final int TRANSACTION_FIELD_NUMBER = 3;
  private java.lang.String transaction_;
  /**
   * <pre>
   * The partial signed transaction base64 encoded containing the Responder's
   * signed inputs in a PSBT format
   * </pre>
   *
   * <code>string transaction = 3 [json_name = "transaction"];</code>
   * @return The transaction.
   */
  @java.lang.Override
  public java.lang.String getTransaction() {
    return transaction_;
  }
  /**
   * <pre>
   * The partial signed transaction base64 encoded containing the Responder's
   * signed inputs in a PSBT format
   * </pre>
   *
   * <code>string transaction = 3 [json_name = "transaction"];</code>
   * @return The bytes for transaction.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getTransactionBytes() {
    return com.google.protobuf.ByteString.copyFromUtf8(transaction_);
  }
  /**
   * <pre>
   * The partial signed transaction base64 encoded containing the Responder's
   * signed inputs in a PSBT format
   * </pre>
   *
   * <code>string transaction = 3 [json_name = "transaction"];</code>
   * @param value The transaction to set.
   */
  private void setTransaction(
      java.lang.String value) {
    java.lang.Class<?> valueClass = value.getClass();
  
    transaction_ = value;
  }
  /**
   * <pre>
   * The partial signed transaction base64 encoded containing the Responder's
   * signed inputs in a PSBT format
   * </pre>
   *
   * <code>string transaction = 3 [json_name = "transaction"];</code>
   */
  private void clearTransaction() {
    
    transaction_ = getDefaultInstance().getTransaction();
  }
  /**
   * <pre>
   * The partial signed transaction base64 encoded containing the Responder's
   * signed inputs in a PSBT format
   * </pre>
   *
   * <code>string transaction = 3 [json_name = "transaction"];</code>
   * @param value The bytes for transaction to set.
   */
  private void setTransactionBytes(
      com.google.protobuf.ByteString value) {
    checkByteStringIsUtf8(value);
    transaction_ = value.toStringUtf8();
    
  }

  public static final int INPUT_BLINDING_KEY_FIELD_NUMBER = 4;
  private static final class InputBlindingKeyDefaultEntryHolder {
    static final com.google.protobuf.MapEntryLite<
        java.lang.String, com.google.protobuf.ByteString> defaultEntry =
            com.google.protobuf.MapEntryLite
            .<java.lang.String, com.google.protobuf.ByteString>newDefaultInstance(
                com.google.protobuf.WireFormat.FieldType.STRING,
                "",
                com.google.protobuf.WireFormat.FieldType.BYTES,
                com.google.protobuf.ByteString.EMPTY);
  }
  private com.google.protobuf.MapFieldLite<
      java.lang.String, com.google.protobuf.ByteString> inputBlindingKey_ =
          com.google.protobuf.MapFieldLite.emptyMapField();
  private com.google.protobuf.MapFieldLite<java.lang.String, com.google.protobuf.ByteString>
  internalGetInputBlindingKey() {
    return inputBlindingKey_;
  }
  private com.google.protobuf.MapFieldLite<java.lang.String, com.google.protobuf.ByteString>
  internalGetMutableInputBlindingKey() {
    if (!inputBlindingKey_.isMutable()) {
      inputBlindingKey_ = inputBlindingKey_.mutableCopy();
    }
    return inputBlindingKey_;
  }
  @java.lang.Override

  public int getInputBlindingKeyCount() {
    return internalGetInputBlindingKey().size();
  }
  /**
   * <pre>
   * In case of a confidential transaction the blinding key of each confidential
   * input is included. Each blinding key is identified by the prevout script
   * hex encoded.
   * </pre>
   *
   * <code>map&lt;string, bytes&gt; input_blinding_key = 4 [json_name = "inputBlindingKey"];</code>
   */
  @java.lang.Override

  public boolean containsInputBlindingKey(
      java.lang.String key) {
    java.lang.Class<?> keyClass = key.getClass();
    return internalGetInputBlindingKey().containsKey(key);
  }
  /**
   * Use {@link #getInputBlindingKeyMap()} instead.
   */
  @java.lang.Override
  @java.lang.Deprecated
  public java.util.Map<java.lang.String, com.google.protobuf.ByteString> getInputBlindingKey() {
    return getInputBlindingKeyMap();
  }
  /**
   * <pre>
   * In case of a confidential transaction the blinding key of each confidential
   * input is included. Each blinding key is identified by the prevout script
   * hex encoded.
   * </pre>
   *
   * <code>map&lt;string, bytes&gt; input_blinding_key = 4 [json_name = "inputBlindingKey"];</code>
   */
  @java.lang.Override

  public java.util.Map<java.lang.String, com.google.protobuf.ByteString> getInputBlindingKeyMap() {
    return java.util.Collections.unmodifiableMap(
        internalGetInputBlindingKey());
  }
  /**
   * <pre>
   * In case of a confidential transaction the blinding key of each confidential
   * input is included. Each blinding key is identified by the prevout script
   * hex encoded.
   * </pre>
   *
   * <code>map&lt;string, bytes&gt; input_blinding_key = 4 [json_name = "inputBlindingKey"];</code>
   */
  @java.lang.Override

  public com.google.protobuf.ByteString getInputBlindingKeyOrDefault(
      java.lang.String key,
      com.google.protobuf.ByteString defaultValue) {
    java.lang.Class<?> keyClass = key.getClass();
    java.util.Map<java.lang.String, com.google.protobuf.ByteString> map =
        internalGetInputBlindingKey();
    return map.containsKey(key) ? map.get(key) : defaultValue;
  }
  /**
   * <pre>
   * In case of a confidential transaction the blinding key of each confidential
   * input is included. Each blinding key is identified by the prevout script
   * hex encoded.
   * </pre>
   *
   * <code>map&lt;string, bytes&gt; input_blinding_key = 4 [json_name = "inputBlindingKey"];</code>
   */
  @java.lang.Override

  public com.google.protobuf.ByteString getInputBlindingKeyOrThrow(
      java.lang.String key) {
    java.lang.Class<?> keyClass = key.getClass();
    java.util.Map<java.lang.String, com.google.protobuf.ByteString> map =
        internalGetInputBlindingKey();
    if (!map.containsKey(key)) {
      throw new java.lang.IllegalArgumentException();
    }
    return map.get(key);
  }
  /**
   * <pre>
   * In case of a confidential transaction the blinding key of each confidential
   * input is included. Each blinding key is identified by the prevout script
   * hex encoded.
   * </pre>
   *
   * <code>map&lt;string, bytes&gt; input_blinding_key = 4 [json_name = "inputBlindingKey"];</code>
   */
  private java.util.Map<java.lang.String, com.google.protobuf.ByteString>
  getMutableInputBlindingKeyMap() {
    return internalGetMutableInputBlindingKey();
  }

  public static final int OUTPUT_BLINDING_KEY_FIELD_NUMBER = 5;
  private static final class OutputBlindingKeyDefaultEntryHolder {
    static final com.google.protobuf.MapEntryLite<
        java.lang.String, com.google.protobuf.ByteString> defaultEntry =
            com.google.protobuf.MapEntryLite
            .<java.lang.String, com.google.protobuf.ByteString>newDefaultInstance(
                com.google.protobuf.WireFormat.FieldType.STRING,
                "",
                com.google.protobuf.WireFormat.FieldType.BYTES,
                com.google.protobuf.ByteString.EMPTY);
  }
  private com.google.protobuf.MapFieldLite<
      java.lang.String, com.google.protobuf.ByteString> outputBlindingKey_ =
          com.google.protobuf.MapFieldLite.emptyMapField();
  private com.google.protobuf.MapFieldLite<java.lang.String, com.google.protobuf.ByteString>
  internalGetOutputBlindingKey() {
    return outputBlindingKey_;
  }
  private com.google.protobuf.MapFieldLite<java.lang.String, com.google.protobuf.ByteString>
  internalGetMutableOutputBlindingKey() {
    if (!outputBlindingKey_.isMutable()) {
      outputBlindingKey_ = outputBlindingKey_.mutableCopy();
    }
    return outputBlindingKey_;
  }
  @java.lang.Override

  public int getOutputBlindingKeyCount() {
    return internalGetOutputBlindingKey().size();
  }
  /**
   * <pre>
   * In case of a confidential transaction the blinding key of each confidential
   * output is included. Each blinding key is identified by the output script
   * hex encoded.
   * </pre>
   *
   * <code>map&lt;string, bytes&gt; output_blinding_key = 5 [json_name = "outputBlindingKey"];</code>
   */
  @java.lang.Override

  public boolean containsOutputBlindingKey(
      java.lang.String key) {
    java.lang.Class<?> keyClass = key.getClass();
    return internalGetOutputBlindingKey().containsKey(key);
  }
  /**
   * Use {@link #getOutputBlindingKeyMap()} instead.
   */
  @java.lang.Override
  @java.lang.Deprecated
  public java.util.Map<java.lang.String, com.google.protobuf.ByteString> getOutputBlindingKey() {
    return getOutputBlindingKeyMap();
  }
  /**
   * <pre>
   * In case of a confidential transaction the blinding key of each confidential
   * output is included. Each blinding key is identified by the output script
   * hex encoded.
   * </pre>
   *
   * <code>map&lt;string, bytes&gt; output_blinding_key = 5 [json_name = "outputBlindingKey"];</code>
   */
  @java.lang.Override

  public java.util.Map<java.lang.String, com.google.protobuf.ByteString> getOutputBlindingKeyMap() {
    return java.util.Collections.unmodifiableMap(
        internalGetOutputBlindingKey());
  }
  /**
   * <pre>
   * In case of a confidential transaction the blinding key of each confidential
   * output is included. Each blinding key is identified by the output script
   * hex encoded.
   * </pre>
   *
   * <code>map&lt;string, bytes&gt; output_blinding_key = 5 [json_name = "outputBlindingKey"];</code>
   */
  @java.lang.Override

  public com.google.protobuf.ByteString getOutputBlindingKeyOrDefault(
      java.lang.String key,
      com.google.protobuf.ByteString defaultValue) {
    java.lang.Class<?> keyClass = key.getClass();
    java.util.Map<java.lang.String, com.google.protobuf.ByteString> map =
        internalGetOutputBlindingKey();
    return map.containsKey(key) ? map.get(key) : defaultValue;
  }
  /**
   * <pre>
   * In case of a confidential transaction the blinding key of each confidential
   * output is included. Each blinding key is identified by the output script
   * hex encoded.
   * </pre>
   *
   * <code>map&lt;string, bytes&gt; output_blinding_key = 5 [json_name = "outputBlindingKey"];</code>
   */
  @java.lang.Override

  public com.google.protobuf.ByteString getOutputBlindingKeyOrThrow(
      java.lang.String key) {
    java.lang.Class<?> keyClass = key.getClass();
    java.util.Map<java.lang.String, com.google.protobuf.ByteString> map =
        internalGetOutputBlindingKey();
    if (!map.containsKey(key)) {
      throw new java.lang.IllegalArgumentException();
    }
    return map.get(key);
  }
  /**
   * <pre>
   * In case of a confidential transaction the blinding key of each confidential
   * output is included. Each blinding key is identified by the output script
   * hex encoded.
   * </pre>
   *
   * <code>map&lt;string, bytes&gt; output_blinding_key = 5 [json_name = "outputBlindingKey"];</code>
   */
  private java.util.Map<java.lang.String, com.google.protobuf.ByteString>
  getMutableOutputBlindingKeyMap() {
    return internalGetMutableOutputBlindingKey();
  }

  public static com.tdex.v1.SwapAccept parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static com.tdex.v1.SwapAccept parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static com.tdex.v1.SwapAccept parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static com.tdex.v1.SwapAccept parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static com.tdex.v1.SwapAccept parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static com.tdex.v1.SwapAccept parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static com.tdex.v1.SwapAccept parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static com.tdex.v1.SwapAccept parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static com.tdex.v1.SwapAccept parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input);
  }
  public static com.tdex.v1.SwapAccept parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static com.tdex.v1.SwapAccept parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static com.tdex.v1.SwapAccept parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }

  public static Builder newBuilder() {
    return (Builder) DEFAULT_INSTANCE.createBuilder();
  }
  public static Builder newBuilder(com.tdex.v1.SwapAccept prototype) {
    return (Builder) DEFAULT_INSTANCE.createBuilder(prototype);
  }

  /**
   * Protobuf type {@code tdex.v1.SwapAccept}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageLite.Builder<
        com.tdex.v1.SwapAccept, Builder> implements
      // @@protoc_insertion_point(builder_implements:tdex.v1.SwapAccept)
      com.tdex.v1.SwapAcceptOrBuilder {
    // Construct using com.tdex.v1.SwapAccept.newBuilder()
    private Builder() {
      super(DEFAULT_INSTANCE);
    }


    /**
     * <pre>
     * Random unique identifier for the current message
     * </pre>
     *
     * <code>string id = 1 [json_name = "id"];</code>
     * @return The id.
     */
    @java.lang.Override
    public java.lang.String getId() {
      return instance.getId();
    }
    /**
     * <pre>
     * Random unique identifier for the current message
     * </pre>
     *
     * <code>string id = 1 [json_name = "id"];</code>
     * @return The bytes for id.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getIdBytes() {
      return instance.getIdBytes();
    }
    /**
     * <pre>
     * Random unique identifier for the current message
     * </pre>
     *
     * <code>string id = 1 [json_name = "id"];</code>
     * @param value The id to set.
     * @return This builder for chaining.
     */
    public Builder setId(
        java.lang.String value) {
      copyOnWrite();
      instance.setId(value);
      return this;
    }
    /**
     * <pre>
     * Random unique identifier for the current message
     * </pre>
     *
     * <code>string id = 1 [json_name = "id"];</code>
     * @return This builder for chaining.
     */
    public Builder clearId() {
      copyOnWrite();
      instance.clearId();
      return this;
    }
    /**
     * <pre>
     * Random unique identifier for the current message
     * </pre>
     *
     * <code>string id = 1 [json_name = "id"];</code>
     * @param value The bytes for id to set.
     * @return This builder for chaining.
     */
    public Builder setIdBytes(
        com.google.protobuf.ByteString value) {
      copyOnWrite();
      instance.setIdBytes(value);
      return this;
    }

    /**
     * <pre>
     * indetifier of the SwapRequest message
     * </pre>
     *
     * <code>string request_id = 2 [json_name = "requestId"];</code>
     * @return The requestId.
     */
    @java.lang.Override
    public java.lang.String getRequestId() {
      return instance.getRequestId();
    }
    /**
     * <pre>
     * indetifier of the SwapRequest message
     * </pre>
     *
     * <code>string request_id = 2 [json_name = "requestId"];</code>
     * @return The bytes for requestId.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getRequestIdBytes() {
      return instance.getRequestIdBytes();
    }
    /**
     * <pre>
     * indetifier of the SwapRequest message
     * </pre>
     *
     * <code>string request_id = 2 [json_name = "requestId"];</code>
     * @param value The requestId to set.
     * @return This builder for chaining.
     */
    public Builder setRequestId(
        java.lang.String value) {
      copyOnWrite();
      instance.setRequestId(value);
      return this;
    }
    /**
     * <pre>
     * indetifier of the SwapRequest message
     * </pre>
     *
     * <code>string request_id = 2 [json_name = "requestId"];</code>
     * @return This builder for chaining.
     */
    public Builder clearRequestId() {
      copyOnWrite();
      instance.clearRequestId();
      return this;
    }
    /**
     * <pre>
     * indetifier of the SwapRequest message
     * </pre>
     *
     * <code>string request_id = 2 [json_name = "requestId"];</code>
     * @param value The bytes for requestId to set.
     * @return This builder for chaining.
     */
    public Builder setRequestIdBytes(
        com.google.protobuf.ByteString value) {
      copyOnWrite();
      instance.setRequestIdBytes(value);
      return this;
    }

    /**
     * <pre>
     * The partial signed transaction base64 encoded containing the Responder's
     * signed inputs in a PSBT format
     * </pre>
     *
     * <code>string transaction = 3 [json_name = "transaction"];</code>
     * @return The transaction.
     */
    @java.lang.Override
    public java.lang.String getTransaction() {
      return instance.getTransaction();
    }
    /**
     * <pre>
     * The partial signed transaction base64 encoded containing the Responder's
     * signed inputs in a PSBT format
     * </pre>
     *
     * <code>string transaction = 3 [json_name = "transaction"];</code>
     * @return The bytes for transaction.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getTransactionBytes() {
      return instance.getTransactionBytes();
    }
    /**
     * <pre>
     * The partial signed transaction base64 encoded containing the Responder's
     * signed inputs in a PSBT format
     * </pre>
     *
     * <code>string transaction = 3 [json_name = "transaction"];</code>
     * @param value The transaction to set.
     * @return This builder for chaining.
     */
    public Builder setTransaction(
        java.lang.String value) {
      copyOnWrite();
      instance.setTransaction(value);
      return this;
    }
    /**
     * <pre>
     * The partial signed transaction base64 encoded containing the Responder's
     * signed inputs in a PSBT format
     * </pre>
     *
     * <code>string transaction = 3 [json_name = "transaction"];</code>
     * @return This builder for chaining.
     */
    public Builder clearTransaction() {
      copyOnWrite();
      instance.clearTransaction();
      return this;
    }
    /**
     * <pre>
     * The partial signed transaction base64 encoded containing the Responder's
     * signed inputs in a PSBT format
     * </pre>
     *
     * <code>string transaction = 3 [json_name = "transaction"];</code>
     * @param value The bytes for transaction to set.
     * @return This builder for chaining.
     */
    public Builder setTransactionBytes(
        com.google.protobuf.ByteString value) {
      copyOnWrite();
      instance.setTransactionBytes(value);
      return this;
    }

    @java.lang.Override

    public int getInputBlindingKeyCount() {
      return instance.getInputBlindingKeyMap().size();
    }
    /**
     * <pre>
     * In case of a confidential transaction the blinding key of each confidential
     * input is included. Each blinding key is identified by the prevout script
     * hex encoded.
     * </pre>
     *
     * <code>map&lt;string, bytes&gt; input_blinding_key = 4 [json_name = "inputBlindingKey"];</code>
     */
    @java.lang.Override

    public boolean containsInputBlindingKey(
        java.lang.String key) {
      java.lang.Class<?> keyClass = key.getClass();
      return instance.getInputBlindingKeyMap().containsKey(key);
    }

    public Builder clearInputBlindingKey() {
      copyOnWrite();
      instance.getMutableInputBlindingKeyMap().clear();
      return this;
    }
    /**
     * <pre>
     * In case of a confidential transaction the blinding key of each confidential
     * input is included. Each blinding key is identified by the prevout script
     * hex encoded.
     * </pre>
     *
     * <code>map&lt;string, bytes&gt; input_blinding_key = 4 [json_name = "inputBlindingKey"];</code>
     */

    public Builder removeInputBlindingKey(
        java.lang.String key) {
      java.lang.Class<?> keyClass = key.getClass();
      copyOnWrite();
      instance.getMutableInputBlindingKeyMap().remove(key);
      return this;
    }
    /**
     * Use {@link #getInputBlindingKeyMap()} instead.
     */
    @java.lang.Override
    @java.lang.Deprecated
    public java.util.Map<java.lang.String, com.google.protobuf.ByteString> getInputBlindingKey() {
      return getInputBlindingKeyMap();
    }
    /**
     * <pre>
     * In case of a confidential transaction the blinding key of each confidential
     * input is included. Each blinding key is identified by the prevout script
     * hex encoded.
     * </pre>
     *
     * <code>map&lt;string, bytes&gt; input_blinding_key = 4 [json_name = "inputBlindingKey"];</code>
     */
    @java.lang.Override
    public java.util.Map<java.lang.String, com.google.protobuf.ByteString> getInputBlindingKeyMap() {
      return java.util.Collections.unmodifiableMap(
          instance.getInputBlindingKeyMap());
    }
    /**
     * <pre>
     * In case of a confidential transaction the blinding key of each confidential
     * input is included. Each blinding key is identified by the prevout script
     * hex encoded.
     * </pre>
     *
     * <code>map&lt;string, bytes&gt; input_blinding_key = 4 [json_name = "inputBlindingKey"];</code>
     */
    @java.lang.Override

    public com.google.protobuf.ByteString getInputBlindingKeyOrDefault(
        java.lang.String key,
        com.google.protobuf.ByteString defaultValue) {
      java.lang.Class<?> keyClass = key.getClass();
      java.util.Map<java.lang.String, com.google.protobuf.ByteString> map =
          instance.getInputBlindingKeyMap();
      return map.containsKey(key) ? map.get(key) : defaultValue;
    }
    /**
     * <pre>
     * In case of a confidential transaction the blinding key of each confidential
     * input is included. Each blinding key is identified by the prevout script
     * hex encoded.
     * </pre>
     *
     * <code>map&lt;string, bytes&gt; input_blinding_key = 4 [json_name = "inputBlindingKey"];</code>
     */
    @java.lang.Override

    public com.google.protobuf.ByteString getInputBlindingKeyOrThrow(
        java.lang.String key) {
      java.lang.Class<?> keyClass = key.getClass();
      java.util.Map<java.lang.String, com.google.protobuf.ByteString> map =
          instance.getInputBlindingKeyMap();
      if (!map.containsKey(key)) {
        throw new java.lang.IllegalArgumentException();
      }
      return map.get(key);
    }
    /**
     * <pre>
     * In case of a confidential transaction the blinding key of each confidential
     * input is included. Each blinding key is identified by the prevout script
     * hex encoded.
     * </pre>
     *
     * <code>map&lt;string, bytes&gt; input_blinding_key = 4 [json_name = "inputBlindingKey"];</code>
     */
    public Builder putInputBlindingKey(
        java.lang.String key,
        com.google.protobuf.ByteString value) {
      java.lang.Class<?> keyClass = key.getClass();
      java.lang.Class<?> valueClass = value.getClass();
      copyOnWrite();
      instance.getMutableInputBlindingKeyMap().put(key, value);
      return this;
    }
    /**
     * <pre>
     * In case of a confidential transaction the blinding key of each confidential
     * input is included. Each blinding key is identified by the prevout script
     * hex encoded.
     * </pre>
     *
     * <code>map&lt;string, bytes&gt; input_blinding_key = 4 [json_name = "inputBlindingKey"];</code>
     */
    public Builder putAllInputBlindingKey(
        java.util.Map<java.lang.String, com.google.protobuf.ByteString> values) {
      copyOnWrite();
      instance.getMutableInputBlindingKeyMap().putAll(values);
      return this;
    }

    @java.lang.Override

    public int getOutputBlindingKeyCount() {
      return instance.getOutputBlindingKeyMap().size();
    }
    /**
     * <pre>
     * In case of a confidential transaction the blinding key of each confidential
     * output is included. Each blinding key is identified by the output script
     * hex encoded.
     * </pre>
     *
     * <code>map&lt;string, bytes&gt; output_blinding_key = 5 [json_name = "outputBlindingKey"];</code>
     */
    @java.lang.Override

    public boolean containsOutputBlindingKey(
        java.lang.String key) {
      java.lang.Class<?> keyClass = key.getClass();
      return instance.getOutputBlindingKeyMap().containsKey(key);
    }

    public Builder clearOutputBlindingKey() {
      copyOnWrite();
      instance.getMutableOutputBlindingKeyMap().clear();
      return this;
    }
    /**
     * <pre>
     * In case of a confidential transaction the blinding key of each confidential
     * output is included. Each blinding key is identified by the output script
     * hex encoded.
     * </pre>
     *
     * <code>map&lt;string, bytes&gt; output_blinding_key = 5 [json_name = "outputBlindingKey"];</code>
     */

    public Builder removeOutputBlindingKey(
        java.lang.String key) {
      java.lang.Class<?> keyClass = key.getClass();
      copyOnWrite();
      instance.getMutableOutputBlindingKeyMap().remove(key);
      return this;
    }
    /**
     * Use {@link #getOutputBlindingKeyMap()} instead.
     */
    @java.lang.Override
    @java.lang.Deprecated
    public java.util.Map<java.lang.String, com.google.protobuf.ByteString> getOutputBlindingKey() {
      return getOutputBlindingKeyMap();
    }
    /**
     * <pre>
     * In case of a confidential transaction the blinding key of each confidential
     * output is included. Each blinding key is identified by the output script
     * hex encoded.
     * </pre>
     *
     * <code>map&lt;string, bytes&gt; output_blinding_key = 5 [json_name = "outputBlindingKey"];</code>
     */
    @java.lang.Override
    public java.util.Map<java.lang.String, com.google.protobuf.ByteString> getOutputBlindingKeyMap() {
      return java.util.Collections.unmodifiableMap(
          instance.getOutputBlindingKeyMap());
    }
    /**
     * <pre>
     * In case of a confidential transaction the blinding key of each confidential
     * output is included. Each blinding key is identified by the output script
     * hex encoded.
     * </pre>
     *
     * <code>map&lt;string, bytes&gt; output_blinding_key = 5 [json_name = "outputBlindingKey"];</code>
     */
    @java.lang.Override

    public com.google.protobuf.ByteString getOutputBlindingKeyOrDefault(
        java.lang.String key,
        com.google.protobuf.ByteString defaultValue) {
      java.lang.Class<?> keyClass = key.getClass();
      java.util.Map<java.lang.String, com.google.protobuf.ByteString> map =
          instance.getOutputBlindingKeyMap();
      return map.containsKey(key) ? map.get(key) : defaultValue;
    }
    /**
     * <pre>
     * In case of a confidential transaction the blinding key of each confidential
     * output is included. Each blinding key is identified by the output script
     * hex encoded.
     * </pre>
     *
     * <code>map&lt;string, bytes&gt; output_blinding_key = 5 [json_name = "outputBlindingKey"];</code>
     */
    @java.lang.Override

    public com.google.protobuf.ByteString getOutputBlindingKeyOrThrow(
        java.lang.String key) {
      java.lang.Class<?> keyClass = key.getClass();
      java.util.Map<java.lang.String, com.google.protobuf.ByteString> map =
          instance.getOutputBlindingKeyMap();
      if (!map.containsKey(key)) {
        throw new java.lang.IllegalArgumentException();
      }
      return map.get(key);
    }
    /**
     * <pre>
     * In case of a confidential transaction the blinding key of each confidential
     * output is included. Each blinding key is identified by the output script
     * hex encoded.
     * </pre>
     *
     * <code>map&lt;string, bytes&gt; output_blinding_key = 5 [json_name = "outputBlindingKey"];</code>
     */
    public Builder putOutputBlindingKey(
        java.lang.String key,
        com.google.protobuf.ByteString value) {
      java.lang.Class<?> keyClass = key.getClass();
      java.lang.Class<?> valueClass = value.getClass();
      copyOnWrite();
      instance.getMutableOutputBlindingKeyMap().put(key, value);
      return this;
    }
    /**
     * <pre>
     * In case of a confidential transaction the blinding key of each confidential
     * output is included. Each blinding key is identified by the output script
     * hex encoded.
     * </pre>
     *
     * <code>map&lt;string, bytes&gt; output_blinding_key = 5 [json_name = "outputBlindingKey"];</code>
     */
    public Builder putAllOutputBlindingKey(
        java.util.Map<java.lang.String, com.google.protobuf.ByteString> values) {
      copyOnWrite();
      instance.getMutableOutputBlindingKeyMap().putAll(values);
      return this;
    }

    // @@protoc_insertion_point(builder_scope:tdex.v1.SwapAccept)
  }
  @java.lang.Override
  @java.lang.SuppressWarnings({"unchecked", "fallthrough"})
  protected final java.lang.Object dynamicMethod(
      com.google.protobuf.GeneratedMessageLite.MethodToInvoke method,
      java.lang.Object arg0, java.lang.Object arg1) {
    switch (method) {
      case NEW_MUTABLE_INSTANCE: {
        return new com.tdex.v1.SwapAccept();
      }
      case NEW_BUILDER: {
        return new Builder();
      }
      case BUILD_MESSAGE_INFO: {
          java.lang.Object[] objects = new java.lang.Object[] {
            "id_",
            "requestId_",
            "transaction_",
            "inputBlindingKey_",
            InputBlindingKeyDefaultEntryHolder.defaultEntry,
            "outputBlindingKey_",
            OutputBlindingKeyDefaultEntryHolder.defaultEntry,
          };
          java.lang.String info =
              "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0002\u0000\u0000\u0001\u0208\u0002\u0208" +
              "\u0003\u0208\u00042\u00052";
          return newMessageInfo(DEFAULT_INSTANCE, info, objects);
      }
      // fall through
      case GET_DEFAULT_INSTANCE: {
        return DEFAULT_INSTANCE;
      }
      case GET_PARSER: {
        com.google.protobuf.Parser<com.tdex.v1.SwapAccept> parser = PARSER;
        if (parser == null) {
          synchronized (com.tdex.v1.SwapAccept.class) {
            parser = PARSER;
            if (parser == null) {
              parser =
                  new DefaultInstanceBasedParser<com.tdex.v1.SwapAccept>(
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


  // @@protoc_insertion_point(class_scope:tdex.v1.SwapAccept)
  private static final com.tdex.v1.SwapAccept DEFAULT_INSTANCE;
  static {
    SwapAccept defaultInstance = new SwapAccept();
    // New instances are implicitly immutable so no need to make
    // immutable.
    DEFAULT_INSTANCE = defaultInstance;
    com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(
      SwapAccept.class, defaultInstance);
  }

  public static com.tdex.v1.SwapAccept getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static volatile com.google.protobuf.Parser<SwapAccept> PARSER;

  public static com.google.protobuf.Parser<SwapAccept> parser() {
    return DEFAULT_INSTANCE.getParserForType();
  }
}

