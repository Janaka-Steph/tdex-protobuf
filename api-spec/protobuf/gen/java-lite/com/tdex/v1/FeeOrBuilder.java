// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: tdex/v1/types.proto

package com.tdex.v1;

public interface FeeOrBuilder extends
    // @@protoc_insertion_point(interface_extends:tdex.v1.Fee)
    com.google.protobuf.MessageLiteOrBuilder {

  /**
   * <code>int64 basis_point = 2 [json_name = "basisPoint"];</code>
   * @return The basisPoint.
   */
  long getBasisPoint();

  /**
   * <code>.tdex.v1.Fixed fixed = 3 [json_name = "fixed"];</code>
   * @return Whether the fixed field is set.
   */
  boolean hasFixed();
  /**
   * <code>.tdex.v1.Fixed fixed = 3 [json_name = "fixed"];</code>
   * @return The fixed.
   */
  com.tdex.v1.Fixed getFixed();
}
