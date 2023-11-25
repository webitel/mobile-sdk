// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/api/http.proto

package com.google.api;

public interface HttpRuleOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.api.HttpRule)
    com.google.protobuf.MessageLiteOrBuilder {

  /**
   * <pre>
   * Selects methods to which this rule applies.
   * Refer to [selector][google.api.DocumentationRule.selector] for syntax details.
   * </pre>
   *
   * <code>string selector = 1;</code>
   * @return The selector.
   */
  java.lang.String getSelector();
  /**
   * <pre>
   * Selects methods to which this rule applies.
   * Refer to [selector][google.api.DocumentationRule.selector] for syntax details.
   * </pre>
   *
   * <code>string selector = 1;</code>
   * @return The bytes for selector.
   */
  com.google.protobuf.ByteString
      getSelectorBytes();

  /**
   * <pre>
   * Used for listing and getting information about resources.
   * </pre>
   *
   * <code>string get = 2;</code>
   * @return Whether the get field is set.
   */
  boolean hasGet();
  /**
   * <pre>
   * Used for listing and getting information about resources.
   * </pre>
   *
   * <code>string get = 2;</code>
   * @return The get.
   */
  java.lang.String getGet();
  /**
   * <pre>
   * Used for listing and getting information about resources.
   * </pre>
   *
   * <code>string get = 2;</code>
   * @return The bytes for get.
   */
  com.google.protobuf.ByteString
      getGetBytes();

  /**
   * <pre>
   * Used for updating a resource.
   * </pre>
   *
   * <code>string put = 3;</code>
   * @return Whether the put field is set.
   */
  boolean hasPut();
  /**
   * <pre>
   * Used for updating a resource.
   * </pre>
   *
   * <code>string put = 3;</code>
   * @return The put.
   */
  java.lang.String getPut();
  /**
   * <pre>
   * Used for updating a resource.
   * </pre>
   *
   * <code>string put = 3;</code>
   * @return The bytes for put.
   */
  com.google.protobuf.ByteString
      getPutBytes();

  /**
   * <pre>
   * Used for creating a resource.
   * </pre>
   *
   * <code>string post = 4;</code>
   * @return Whether the post field is set.
   */
  boolean hasPost();
  /**
   * <pre>
   * Used for creating a resource.
   * </pre>
   *
   * <code>string post = 4;</code>
   * @return The post.
   */
  java.lang.String getPost();
  /**
   * <pre>
   * Used for creating a resource.
   * </pre>
   *
   * <code>string post = 4;</code>
   * @return The bytes for post.
   */
  com.google.protobuf.ByteString
      getPostBytes();

  /**
   * <pre>
   * Used for deleting a resource.
   * </pre>
   *
   * <code>string delete = 5;</code>
   * @return Whether the delete field is set.
   */
  boolean hasDelete();
  /**
   * <pre>
   * Used for deleting a resource.
   * </pre>
   *
   * <code>string delete = 5;</code>
   * @return The delete.
   */
  java.lang.String getDelete();
  /**
   * <pre>
   * Used for deleting a resource.
   * </pre>
   *
   * <code>string delete = 5;</code>
   * @return The bytes for delete.
   */
  com.google.protobuf.ByteString
      getDeleteBytes();

  /**
   * <pre>
   * Used for updating a resource.
   * </pre>
   *
   * <code>string patch = 6;</code>
   * @return Whether the patch field is set.
   */
  boolean hasPatch();
  /**
   * <pre>
   * Used for updating a resource.
   * </pre>
   *
   * <code>string patch = 6;</code>
   * @return The patch.
   */
  java.lang.String getPatch();
  /**
   * <pre>
   * Used for updating a resource.
   * </pre>
   *
   * <code>string patch = 6;</code>
   * @return The bytes for patch.
   */
  com.google.protobuf.ByteString
      getPatchBytes();

  /**
   * <pre>
   * The custom pattern is used for specifying an HTTP method that is not
   * included in the `pattern` field, such as HEAD, or "*" to leave the
   * HTTP method unspecified for this rule. The wild-card rule is useful
   * for services that provide content to Web (HTML) clients.
   * </pre>
   *
   * <code>.google.api.CustomHttpPattern custom = 8;</code>
   * @return Whether the custom field is set.
   */
  boolean hasCustom();
  /**
   * <pre>
   * The custom pattern is used for specifying an HTTP method that is not
   * included in the `pattern` field, such as HEAD, or "*" to leave the
   * HTTP method unspecified for this rule. The wild-card rule is useful
   * for services that provide content to Web (HTML) clients.
   * </pre>
   *
   * <code>.google.api.CustomHttpPattern custom = 8;</code>
   * @return The custom.
   */
  com.google.api.CustomHttpPattern getCustom();

  /**
   * <pre>
   * The name of the request field whose value is mapped to the HTTP body, or
   * `*` for mapping all fields not captured by the path pattern to the HTTP
   * body. NOTE: the referred field must not be a repeated field and must be
   * present at the top-level of request message type.
   * </pre>
   *
   * <code>string body = 7;</code>
   * @return The body.
   */
  java.lang.String getBody();
  /**
   * <pre>
   * The name of the request field whose value is mapped to the HTTP body, or
   * `*` for mapping all fields not captured by the path pattern to the HTTP
   * body. NOTE: the referred field must not be a repeated field and must be
   * present at the top-level of request message type.
   * </pre>
   *
   * <code>string body = 7;</code>
   * @return The bytes for body.
   */
  com.google.protobuf.ByteString
      getBodyBytes();

  /**
   * <pre>
   * Optional. The name of the response field whose value is mapped to the HTTP
   * body of response. Other response fields are ignored. When
   * not set, the response message will be used as HTTP body of response.
   * </pre>
   *
   * <code>string response_body = 12;</code>
   * @return The responseBody.
   */
  java.lang.String getResponseBody();
  /**
   * <pre>
   * Optional. The name of the response field whose value is mapped to the HTTP
   * body of response. Other response fields are ignored. When
   * not set, the response message will be used as HTTP body of response.
   * </pre>
   *
   * <code>string response_body = 12;</code>
   * @return The bytes for responseBody.
   */
  com.google.protobuf.ByteString
      getResponseBodyBytes();

  /**
   * <pre>
   * Additional HTTP bindings for the selector. Nested bindings must
   * not contain an `additional_bindings` field themselves (that is,
   * the nesting may only be one level deep).
   * </pre>
   *
   * <code>repeated .google.api.HttpRule additional_bindings = 11;</code>
   */
  java.util.List<com.google.api.HttpRule> 
      getAdditionalBindingsList();
  /**
   * <pre>
   * Additional HTTP bindings for the selector. Nested bindings must
   * not contain an `additional_bindings` field themselves (that is,
   * the nesting may only be one level deep).
   * </pre>
   *
   * <code>repeated .google.api.HttpRule additional_bindings = 11;</code>
   */
  com.google.api.HttpRule getAdditionalBindings(int index);
  /**
   * <pre>
   * Additional HTTP bindings for the selector. Nested bindings must
   * not contain an `additional_bindings` field themselves (that is,
   * the nesting may only be one level deep).
   * </pre>
   *
   * <code>repeated .google.api.HttpRule additional_bindings = 11;</code>
   */
  int getAdditionalBindingsCount();

  public com.google.api.HttpRule.PatternCase getPatternCase();
}