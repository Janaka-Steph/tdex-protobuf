// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: tdex/v1/types.proto

package com.tdex.v1;

public interface MarketWithFeeOrBuilder extends
    // @@protoc_insertion_point(interface_extends:tdex.v1.MarketWithFee)
    com.google.protobuf.MessageLiteOrBuilder {

  /**
   * <code>.tdex.v1.Market market = 1 [json_name = "market"];</code>
   * @return Whether the market field is set.
   */
  boolean hasMarket();
  /**
   * <code>.tdex.v1.Market market = 1 [json_name = "market"];</code>
   * @return The market.
   */
  com.tdex.v1.Market getMarket();

  /**
   * <code>.tdex.v1.Fee fee = 2 [json_name = "fee"];</code>
   * @return Whether the fee field is set.
   */
  boolean hasFee();
  /**
   * <code>.tdex.v1.Fee fee = 2 [json_name = "fee"];</code>
   * @return The fee.
   */
  com.tdex.v1.Fee getFee();
}
