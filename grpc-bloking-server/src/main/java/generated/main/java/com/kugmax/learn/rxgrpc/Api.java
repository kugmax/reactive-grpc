// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api.proto

package com.kugmax.learn.rxgrpc;

public final class Api {
  private Api() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_kugmax_learn_rxgrpc_HelloRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_kugmax_learn_rxgrpc_HelloRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_kugmax_learn_rxgrpc_HelloResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_kugmax_learn_rxgrpc_HelloResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\tapi.proto\022\027com.kugmax.learn.rxgrpc\" \n\014" +
      "HelloRequest\022\020\n\010greeting\030\001 \001(\t\"\037\n\rHelloR" +
      "esponse\022\016\n\006answer\030\001 \001(\t2f\n\nAPIService\022X\n" +
      "\005hello\022%.com.kugmax.learn.rxgrpc.HelloRe" +
      "quest\032&.com.kugmax.learn.rxgrpc.HelloRes" +
      "ponse\"\000B\002P\001b\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
    internal_static_com_kugmax_learn_rxgrpc_HelloRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_com_kugmax_learn_rxgrpc_HelloRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_kugmax_learn_rxgrpc_HelloRequest_descriptor,
        new java.lang.String[] { "Greeting", });
    internal_static_com_kugmax_learn_rxgrpc_HelloResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_com_kugmax_learn_rxgrpc_HelloResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_kugmax_learn_rxgrpc_HelloResponse_descriptor,
        new java.lang.String[] { "Answer", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
