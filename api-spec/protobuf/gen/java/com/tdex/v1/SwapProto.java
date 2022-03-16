// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: tdex/v1/swap.proto

package com.tdex.v1;

public final class SwapProto {
  private SwapProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_tdex_v1_SwapRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_tdex_v1_SwapRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_tdex_v1_SwapRequest_InputBlindingKeyEntry_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_tdex_v1_SwapRequest_InputBlindingKeyEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_tdex_v1_SwapRequest_OutputBlindingKeyEntry_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_tdex_v1_SwapRequest_OutputBlindingKeyEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_tdex_v1_SwapAccept_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_tdex_v1_SwapAccept_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_tdex_v1_SwapAccept_InputBlindingKeyEntry_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_tdex_v1_SwapAccept_InputBlindingKeyEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_tdex_v1_SwapAccept_OutputBlindingKeyEntry_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_tdex_v1_SwapAccept_OutputBlindingKeyEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_tdex_v1_SwapComplete_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_tdex_v1_SwapComplete_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_tdex_v1_SwapFail_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_tdex_v1_SwapFail_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\022tdex/v1/swap.proto\022\007tdex.v1\"\351\003\n\013SwapRe" +
      "quest\022\016\n\002id\030\001 \001(\tR\002id\022\031\n\010amount_p\030\002 \001(\004R" +
      "\007amountP\022\027\n\007asset_p\030\003 \001(\tR\006assetP\022\031\n\010amo" +
      "unt_r\030\004 \001(\004R\007amountR\022\027\n\007asset_r\030\005 \001(\tR\006a" +
      "ssetR\022 \n\013transaction\030\006 \001(\tR\013transaction\022" +
      "X\n\022input_blinding_key\030\007 \003(\0132*.tdex.v1.Sw" +
      "apRequest.InputBlindingKeyEntryR\020inputBl" +
      "indingKey\022[\n\023output_blinding_key\030\010 \003(\0132+" +
      ".tdex.v1.SwapRequest.OutputBlindingKeyEn" +
      "tryR\021outputBlindingKey\032C\n\025InputBlindingK" +
      "eyEntry\022\020\n\003key\030\001 \001(\tR\003key\022\024\n\005value\030\002 \001(\014" +
      "R\005value:\0028\001\032D\n\026OutputBlindingKeyEntry\022\020\n" +
      "\003key\030\001 \001(\tR\003key\022\024\n\005value\030\002 \001(\014R\005value:\0028" +
      "\001\"\235\003\n\nSwapAccept\022\016\n\002id\030\001 \001(\tR\002id\022\035\n\nrequ" +
      "est_id\030\002 \001(\tR\trequestId\022 \n\013transaction\030\003" +
      " \001(\tR\013transaction\022W\n\022input_blinding_key\030" +
      "\004 \003(\0132).tdex.v1.SwapAccept.InputBlinding" +
      "KeyEntryR\020inputBlindingKey\022Z\n\023output_bli" +
      "nding_key\030\005 \003(\0132*.tdex.v1.SwapAccept.Out" +
      "putBlindingKeyEntryR\021outputBlindingKey\032C" +
      "\n\025InputBlindingKeyEntry\022\020\n\003key\030\001 \001(\tR\003ke" +
      "y\022\024\n\005value\030\002 \001(\014R\005value:\0028\001\032D\n\026OutputBli" +
      "ndingKeyEntry\022\020\n\003key\030\001 \001(\tR\003key\022\024\n\005value" +
      "\030\002 \001(\014R\005value:\0028\001\"]\n\014SwapComplete\022\016\n\002id\030" +
      "\001 \001(\tR\002id\022\033\n\taccept_id\030\002 \001(\tR\010acceptId\022 " +
      "\n\013transaction\030\003 \001(\tR\013transaction\"\205\001\n\010Swa" +
      "pFail\022\016\n\002id\030\001 \001(\tR\002id\022\035\n\nmessage_id\030\002 \001(" +
      "\tR\tmessageId\022!\n\014failure_code\030\003 \001(\rR\013fail" +
      "ureCode\022\'\n\017failure_message\030\004 \001(\tR\016failur" +
      "eMessageB\242\001\n\013com.tdex.v1B\tSwapProtoP\001ZKg" +
      "ithub.com/tdex-network/tdex-prototbuf/ap" +
      "i-spec/protobuf/gen/tdex/v1;tdexv1\242\002\003TXX" +
      "\252\002\007Tdex.V1\312\002\007Tdex\\V1\342\002\023Tdex\\V1\\GPBMetada" +
      "ta\352\002\010Tdex::V1b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_tdex_v1_SwapRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_tdex_v1_SwapRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_tdex_v1_SwapRequest_descriptor,
        new java.lang.String[] { "Id", "AmountP", "AssetP", "AmountR", "AssetR", "Transaction", "InputBlindingKey", "OutputBlindingKey", });
    internal_static_tdex_v1_SwapRequest_InputBlindingKeyEntry_descriptor =
      internal_static_tdex_v1_SwapRequest_descriptor.getNestedTypes().get(0);
    internal_static_tdex_v1_SwapRequest_InputBlindingKeyEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_tdex_v1_SwapRequest_InputBlindingKeyEntry_descriptor,
        new java.lang.String[] { "Key", "Value", });
    internal_static_tdex_v1_SwapRequest_OutputBlindingKeyEntry_descriptor =
      internal_static_tdex_v1_SwapRequest_descriptor.getNestedTypes().get(1);
    internal_static_tdex_v1_SwapRequest_OutputBlindingKeyEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_tdex_v1_SwapRequest_OutputBlindingKeyEntry_descriptor,
        new java.lang.String[] { "Key", "Value", });
    internal_static_tdex_v1_SwapAccept_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_tdex_v1_SwapAccept_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_tdex_v1_SwapAccept_descriptor,
        new java.lang.String[] { "Id", "RequestId", "Transaction", "InputBlindingKey", "OutputBlindingKey", });
    internal_static_tdex_v1_SwapAccept_InputBlindingKeyEntry_descriptor =
      internal_static_tdex_v1_SwapAccept_descriptor.getNestedTypes().get(0);
    internal_static_tdex_v1_SwapAccept_InputBlindingKeyEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_tdex_v1_SwapAccept_InputBlindingKeyEntry_descriptor,
        new java.lang.String[] { "Key", "Value", });
    internal_static_tdex_v1_SwapAccept_OutputBlindingKeyEntry_descriptor =
      internal_static_tdex_v1_SwapAccept_descriptor.getNestedTypes().get(1);
    internal_static_tdex_v1_SwapAccept_OutputBlindingKeyEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_tdex_v1_SwapAccept_OutputBlindingKeyEntry_descriptor,
        new java.lang.String[] { "Key", "Value", });
    internal_static_tdex_v1_SwapComplete_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_tdex_v1_SwapComplete_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_tdex_v1_SwapComplete_descriptor,
        new java.lang.String[] { "Id", "AcceptId", "Transaction", });
    internal_static_tdex_v1_SwapFail_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_tdex_v1_SwapFail_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_tdex_v1_SwapFail_descriptor,
        new java.lang.String[] { "Id", "MessageId", "FailureCode", "FailureMessage", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
