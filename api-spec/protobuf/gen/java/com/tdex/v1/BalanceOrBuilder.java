// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: v1/types.proto

package com.tdex.v1;

public interface BalanceOrBuilder extends
    // @@protoc_insertion_point(interface_extends:tdex.v1.Balance)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>uint64 base_amount = 1 [json_name = "baseAmount"];</code>
   * @return The baseAmount.
   */
  long getBaseAmount();

  /**
   * <code>uint64 quote_amount = 2 [json_name = "quoteAmount"];</code>
   * @return The quoteAmount.
   */
  long getQuoteAmount();
}
