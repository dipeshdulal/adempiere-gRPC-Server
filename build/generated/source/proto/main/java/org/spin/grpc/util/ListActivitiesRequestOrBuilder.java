// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: businessdata.proto

package org.spin.grpc.util;

public interface ListActivitiesRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:data.ListActivitiesRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.data.ClientRequest clientRequest = 1;</code>
   */
  boolean hasClientRequest();
  /**
   * <code>.data.ClientRequest clientRequest = 1;</code>
   */
  org.spin.grpc.util.ClientRequest getClientRequest();
  /**
   * <code>.data.ClientRequest clientRequest = 1;</code>
   */
  org.spin.grpc.util.ClientRequestOrBuilder getClientRequestOrBuilder();

  /**
   * <code>string userUuid = 2;</code>
   */
  java.lang.String getUserUuid();
  /**
   * <code>string userUuid = 2;</code>
   */
  com.google.protobuf.ByteString
      getUserUuidBytes();

  /**
   * <code>string instanceUuid = 3;</code>
   */
  java.lang.String getInstanceUuid();
  /**
   * <code>string instanceUuid = 3;</code>
   */
  com.google.protobuf.ByteString
      getInstanceUuidBytes();

  /**
   * <code>int32 page_size = 4;</code>
   */
  int getPageSize();

  /**
   * <code>string page_token = 5;</code>
   */
  java.lang.String getPageToken();
  /**
   * <code>string page_token = 5;</code>
   */
  com.google.protobuf.ByteString
      getPageTokenBytes();
}