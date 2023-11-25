// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/rpc/error_details.proto

package com.google.rpc;

public interface RetryInfoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.rpc.RetryInfo)
    com.google.protobuf.MessageLiteOrBuilder {

  /**
   * <pre>
   * Clients should wait at least this long between retrying the same request.
   * </pre>
   *
   * <code>.google.protobuf.Duration retry_delay = 1;</code>
   * @return Whether the retryDelay field is set.
   */
  boolean hasRetryDelay();
  /**
   * <pre>
   * Clients should wait at least this long between retrying the same request.
   * </pre>
   *
   * <code>.google.protobuf.Duration retry_delay = 1;</code>
   * @return The retryDelay.
   */
  com.google.protobuf.Duration getRetryDelay();
}