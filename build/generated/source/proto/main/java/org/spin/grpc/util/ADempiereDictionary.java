// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: dictionary.proto

package org.spin.grpc.util;

public final class ADempiereDictionary {
  private ADempiereDictionary() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_dictionary_ClientRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_dictionary_ClientRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_dictionary_WindowDefinition_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_dictionary_WindowDefinition_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_dictionary_TabDefinition_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_dictionary_TabDefinition_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\020dictionary.proto\022\ndictionary\"/\n\rClient" +
      "Request\022\014\n\004uuid\030\001 \001(\t\022\020\n\010language\030\002 \001(\t\"" +
      "i\n\020WindowDefinition\022\014\n\004uuid\030\001 \001(\t\022\014\n\004nam" +
      "e\030\002 \001(\t\022\023\n\013description\030\003 \001(\t\022\023\n\013contextI" +
      "nfo\030\004 \001(\t\022\017\n\007isSOTrx\030\005 \001(\010\"f\n\rTabDefinit" +
      "ion\022\014\n\004uuid\030\001 \001(\t\022\014\n\004name\030\002 \001(\t\022\023\n\013descr" +
      "iption\030\003 \001(\t\022\023\n\013contextInfo\030\004 \001(\t\022\017\n\007isS" +
      "OTrx\030\005 \001(\0102_\n\021DictionaryService\022J\n\rReque" +
      "stWindow\022\031.dictionary.ClientRequest\032\034.di" +
      "ctionary.WindowDefinition\"\000B1\n\022org.spin." +
      "grpc.utilB\023ADempiereDictionaryP\001\242\002\003HLWb\006" +
      "proto3"
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
    internal_static_dictionary_ClientRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_dictionary_ClientRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_dictionary_ClientRequest_descriptor,
        new java.lang.String[] { "Uuid", "Language", });
    internal_static_dictionary_WindowDefinition_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_dictionary_WindowDefinition_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_dictionary_WindowDefinition_descriptor,
        new java.lang.String[] { "Uuid", "Name", "Description", "ContextInfo", "IsSOTrx", });
    internal_static_dictionary_TabDefinition_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_dictionary_TabDefinition_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_dictionary_TabDefinition_descriptor,
        new java.lang.String[] { "Uuid", "Name", "Description", "ContextInfo", "IsSOTrx", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
