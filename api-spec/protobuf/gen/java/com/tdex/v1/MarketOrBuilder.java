// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: tdex/v1/types.proto

package com.tdex.v1;

public interface MarketOrBuilder extends
    // @@protoc_insertion_point(interface_extends:tdex.v1.Market)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string base_asset = 1 [json_name = "baseAsset"];</code>
   * @return The baseAsset.
   */
  java.lang.String getBaseAsset();
  /**
   * <code>string base_asset = 1 [json_name = "baseAsset"];</code>
   * @return The bytes for baseAsset.
   */
  com.google.protobuf.ByteString
      getBaseAssetBytes();

  /**
   * <code>string quote_asset = 2 [json_name = "quoteAsset"];</code>
   * @return The quoteAsset.
   */
  java.lang.String getQuoteAsset();
  /**
   * <code>string quote_asset = 2 [json_name = "quoteAsset"];</code>
   * @return The bytes for quoteAsset.
   */
  com.google.protobuf.ByteString
      getQuoteAssetBytes();
}
