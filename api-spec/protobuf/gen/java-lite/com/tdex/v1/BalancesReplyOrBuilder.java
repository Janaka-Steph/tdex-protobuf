// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: tdex/v1/trade.proto

package com.tdex.v1;

public interface BalancesReplyOrBuilder extends
    // @@protoc_insertion_point(interface_extends:tdex.v1.BalancesReply)
    com.google.protobuf.MessageLiteOrBuilder {

  /**
   * <code>repeated .tdex.v1.BalanceWithFee balances = 1 [json_name = "balances"];</code>
   */
  java.util.List<com.tdex.v1.BalanceWithFee> 
      getBalancesList();
  /**
   * <code>repeated .tdex.v1.BalanceWithFee balances = 1 [json_name = "balances"];</code>
   */
  com.tdex.v1.BalanceWithFee getBalances(int index);
  /**
   * <code>repeated .tdex.v1.BalanceWithFee balances = 1 [json_name = "balances"];</code>
   */
  int getBalancesCount();
}
