// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: v1/trade.proto

package com.tdex.v1;

public interface MarketPriceReplyOrBuilder extends
    // @@protoc_insertion_point(interface_extends:tdex.v1.MarketPriceReply)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated .tdex.v1.PriceWithFee prices = 1 [json_name = "prices"];</code>
   */
  java.util.List<com.tdex.v1.PriceWithFee> 
      getPricesList();
  /**
   * <code>repeated .tdex.v1.PriceWithFee prices = 1 [json_name = "prices"];</code>
   */
  com.tdex.v1.PriceWithFee getPrices(int index);
  /**
   * <code>repeated .tdex.v1.PriceWithFee prices = 1 [json_name = "prices"];</code>
   */
  int getPricesCount();
  /**
   * <code>repeated .tdex.v1.PriceWithFee prices = 1 [json_name = "prices"];</code>
   */
  java.util.List<? extends com.tdex.v1.PriceWithFeeOrBuilder> 
      getPricesOrBuilderList();
  /**
   * <code>repeated .tdex.v1.PriceWithFee prices = 1 [json_name = "prices"];</code>
   */
  com.tdex.v1.PriceWithFeeOrBuilder getPricesOrBuilder(
      int index);
}
