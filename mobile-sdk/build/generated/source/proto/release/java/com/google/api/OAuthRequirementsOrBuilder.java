// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/api/auth.proto

package com.google.api;

public interface OAuthRequirementsOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.api.OAuthRequirements)
    com.google.protobuf.MessageLiteOrBuilder {

  /**
   * <pre>
   * The list of publicly documented OAuth scopes that are allowed access. An
   * OAuth token containing any of these scopes will be accepted.
   * Example:
   *      canonical_scopes: https://www.googleapis.com/auth/calendar,
   *                        https://www.googleapis.com/auth/calendar.read
   * </pre>
   *
   * <code>string canonical_scopes = 1;</code>
   * @return The canonicalScopes.
   */
  java.lang.String getCanonicalScopes();
  /**
   * <pre>
   * The list of publicly documented OAuth scopes that are allowed access. An
   * OAuth token containing any of these scopes will be accepted.
   * Example:
   *      canonical_scopes: https://www.googleapis.com/auth/calendar,
   *                        https://www.googleapis.com/auth/calendar.read
   * </pre>
   *
   * <code>string canonical_scopes = 1;</code>
   * @return The bytes for canonicalScopes.
   */
  com.google.protobuf.ByteString
      getCanonicalScopesBytes();
}
