// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/api/system_parameter.proto

package com.google.api;

/**
 * <pre>
 * Define a parameter's name and location. The parameter may be passed as either
 * an HTTP header or a URL query parameter, and if both are passed the behavior
 * is implementation-dependent.
 * </pre>
 *
 * Protobuf type {@code google.api.SystemParameter}
 */
public  final class SystemParameter extends
    com.google.protobuf.GeneratedMessageLite<
        SystemParameter, SystemParameter.Builder> implements
    // @@protoc_insertion_point(message_implements:google.api.SystemParameter)
    SystemParameterOrBuilder {
  private SystemParameter() {
    name_ = "";
    httpHeader_ = "";
    urlQueryParameter_ = "";
  }
  public static final int NAME_FIELD_NUMBER = 1;
  private java.lang.String name_;
  /**
   * <pre>
   * Define the name of the parameter, such as "api_key" . It is case sensitive.
   * </pre>
   *
   * <code>string name = 1;</code>
   * @return The name.
   */
  @java.lang.Override
  public java.lang.String getName() {
    return name_;
  }
  /**
   * <pre>
   * Define the name of the parameter, such as "api_key" . It is case sensitive.
   * </pre>
   *
   * <code>string name = 1;</code>
   * @return The bytes for name.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getNameBytes() {
    return com.google.protobuf.ByteString.copyFromUtf8(name_);
  }
  /**
   * <pre>
   * Define the name of the parameter, such as "api_key" . It is case sensitive.
   * </pre>
   *
   * <code>string name = 1;</code>
   * @param value The name to set.
   */
  private void setName(
      java.lang.String value) {
    java.lang.Class<?> valueClass = value.getClass();
  
    name_ = value;
  }
  /**
   * <pre>
   * Define the name of the parameter, such as "api_key" . It is case sensitive.
   * </pre>
   *
   * <code>string name = 1;</code>
   */
  private void clearName() {
    
    name_ = getDefaultInstance().getName();
  }
  /**
   * <pre>
   * Define the name of the parameter, such as "api_key" . It is case sensitive.
   * </pre>
   *
   * <code>string name = 1;</code>
   * @param value The bytes for name to set.
   */
  private void setNameBytes(
      com.google.protobuf.ByteString value) {
    checkByteStringIsUtf8(value);
    name_ = value.toStringUtf8();
    
  }

  public static final int HTTP_HEADER_FIELD_NUMBER = 2;
  private java.lang.String httpHeader_;
  /**
   * <pre>
   * Define the HTTP header name to use for the parameter. It is case
   * insensitive.
   * </pre>
   *
   * <code>string http_header = 2;</code>
   * @return The httpHeader.
   */
  @java.lang.Override
  public java.lang.String getHttpHeader() {
    return httpHeader_;
  }
  /**
   * <pre>
   * Define the HTTP header name to use for the parameter. It is case
   * insensitive.
   * </pre>
   *
   * <code>string http_header = 2;</code>
   * @return The bytes for httpHeader.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getHttpHeaderBytes() {
    return com.google.protobuf.ByteString.copyFromUtf8(httpHeader_);
  }
  /**
   * <pre>
   * Define the HTTP header name to use for the parameter. It is case
   * insensitive.
   * </pre>
   *
   * <code>string http_header = 2;</code>
   * @param value The httpHeader to set.
   */
  private void setHttpHeader(
      java.lang.String value) {
    java.lang.Class<?> valueClass = value.getClass();
  
    httpHeader_ = value;
  }
  /**
   * <pre>
   * Define the HTTP header name to use for the parameter. It is case
   * insensitive.
   * </pre>
   *
   * <code>string http_header = 2;</code>
   */
  private void clearHttpHeader() {
    
    httpHeader_ = getDefaultInstance().getHttpHeader();
  }
  /**
   * <pre>
   * Define the HTTP header name to use for the parameter. It is case
   * insensitive.
   * </pre>
   *
   * <code>string http_header = 2;</code>
   * @param value The bytes for httpHeader to set.
   */
  private void setHttpHeaderBytes(
      com.google.protobuf.ByteString value) {
    checkByteStringIsUtf8(value);
    httpHeader_ = value.toStringUtf8();
    
  }

  public static final int URL_QUERY_PARAMETER_FIELD_NUMBER = 3;
  private java.lang.String urlQueryParameter_;
  /**
   * <pre>
   * Define the URL query parameter name to use for the parameter. It is case
   * sensitive.
   * </pre>
   *
   * <code>string url_query_parameter = 3;</code>
   * @return The urlQueryParameter.
   */
  @java.lang.Override
  public java.lang.String getUrlQueryParameter() {
    return urlQueryParameter_;
  }
  /**
   * <pre>
   * Define the URL query parameter name to use for the parameter. It is case
   * sensitive.
   * </pre>
   *
   * <code>string url_query_parameter = 3;</code>
   * @return The bytes for urlQueryParameter.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getUrlQueryParameterBytes() {
    return com.google.protobuf.ByteString.copyFromUtf8(urlQueryParameter_);
  }
  /**
   * <pre>
   * Define the URL query parameter name to use for the parameter. It is case
   * sensitive.
   * </pre>
   *
   * <code>string url_query_parameter = 3;</code>
   * @param value The urlQueryParameter to set.
   */
  private void setUrlQueryParameter(
      java.lang.String value) {
    java.lang.Class<?> valueClass = value.getClass();
  
    urlQueryParameter_ = value;
  }
  /**
   * <pre>
   * Define the URL query parameter name to use for the parameter. It is case
   * sensitive.
   * </pre>
   *
   * <code>string url_query_parameter = 3;</code>
   */
  private void clearUrlQueryParameter() {
    
    urlQueryParameter_ = getDefaultInstance().getUrlQueryParameter();
  }
  /**
   * <pre>
   * Define the URL query parameter name to use for the parameter. It is case
   * sensitive.
   * </pre>
   *
   * <code>string url_query_parameter = 3;</code>
   * @param value The bytes for urlQueryParameter to set.
   */
  private void setUrlQueryParameterBytes(
      com.google.protobuf.ByteString value) {
    checkByteStringIsUtf8(value);
    urlQueryParameter_ = value.toStringUtf8();
    
  }

  public static com.google.api.SystemParameter parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static com.google.api.SystemParameter parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static com.google.api.SystemParameter parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static com.google.api.SystemParameter parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static com.google.api.SystemParameter parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static com.google.api.SystemParameter parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static com.google.api.SystemParameter parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static com.google.api.SystemParameter parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static com.google.api.SystemParameter parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input);
  }
  public static com.google.api.SystemParameter parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static com.google.api.SystemParameter parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static com.google.api.SystemParameter parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }

  public static Builder newBuilder() {
    return (Builder) DEFAULT_INSTANCE.createBuilder();
  }
  public static Builder newBuilder(com.google.api.SystemParameter prototype) {
    return (Builder) DEFAULT_INSTANCE.createBuilder(prototype);
  }

  /**
   * <pre>
   * Define a parameter's name and location. The parameter may be passed as either
   * an HTTP header or a URL query parameter, and if both are passed the behavior
   * is implementation-dependent.
   * </pre>
   *
   * Protobuf type {@code google.api.SystemParameter}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageLite.Builder<
        com.google.api.SystemParameter, Builder> implements
      // @@protoc_insertion_point(builder_implements:google.api.SystemParameter)
      com.google.api.SystemParameterOrBuilder {
    // Construct using com.google.api.SystemParameter.newBuilder()
    private Builder() {
      super(DEFAULT_INSTANCE);
    }


    /**
     * <pre>
     * Define the name of the parameter, such as "api_key" . It is case sensitive.
     * </pre>
     *
     * <code>string name = 1;</code>
     * @return The name.
     */
    @java.lang.Override
    public java.lang.String getName() {
      return instance.getName();
    }
    /**
     * <pre>
     * Define the name of the parameter, such as "api_key" . It is case sensitive.
     * </pre>
     *
     * <code>string name = 1;</code>
     * @return The bytes for name.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getNameBytes() {
      return instance.getNameBytes();
    }
    /**
     * <pre>
     * Define the name of the parameter, such as "api_key" . It is case sensitive.
     * </pre>
     *
     * <code>string name = 1;</code>
     * @param value The name to set.
     * @return This builder for chaining.
     */
    public Builder setName(
        java.lang.String value) {
      copyOnWrite();
      instance.setName(value);
      return this;
    }
    /**
     * <pre>
     * Define the name of the parameter, such as "api_key" . It is case sensitive.
     * </pre>
     *
     * <code>string name = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearName() {
      copyOnWrite();
      instance.clearName();
      return this;
    }
    /**
     * <pre>
     * Define the name of the parameter, such as "api_key" . It is case sensitive.
     * </pre>
     *
     * <code>string name = 1;</code>
     * @param value The bytes for name to set.
     * @return This builder for chaining.
     */
    public Builder setNameBytes(
        com.google.protobuf.ByteString value) {
      copyOnWrite();
      instance.setNameBytes(value);
      return this;
    }

    /**
     * <pre>
     * Define the HTTP header name to use for the parameter. It is case
     * insensitive.
     * </pre>
     *
     * <code>string http_header = 2;</code>
     * @return The httpHeader.
     */
    @java.lang.Override
    public java.lang.String getHttpHeader() {
      return instance.getHttpHeader();
    }
    /**
     * <pre>
     * Define the HTTP header name to use for the parameter. It is case
     * insensitive.
     * </pre>
     *
     * <code>string http_header = 2;</code>
     * @return The bytes for httpHeader.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getHttpHeaderBytes() {
      return instance.getHttpHeaderBytes();
    }
    /**
     * <pre>
     * Define the HTTP header name to use for the parameter. It is case
     * insensitive.
     * </pre>
     *
     * <code>string http_header = 2;</code>
     * @param value The httpHeader to set.
     * @return This builder for chaining.
     */
    public Builder setHttpHeader(
        java.lang.String value) {
      copyOnWrite();
      instance.setHttpHeader(value);
      return this;
    }
    /**
     * <pre>
     * Define the HTTP header name to use for the parameter. It is case
     * insensitive.
     * </pre>
     *
     * <code>string http_header = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearHttpHeader() {
      copyOnWrite();
      instance.clearHttpHeader();
      return this;
    }
    /**
     * <pre>
     * Define the HTTP header name to use for the parameter. It is case
     * insensitive.
     * </pre>
     *
     * <code>string http_header = 2;</code>
     * @param value The bytes for httpHeader to set.
     * @return This builder for chaining.
     */
    public Builder setHttpHeaderBytes(
        com.google.protobuf.ByteString value) {
      copyOnWrite();
      instance.setHttpHeaderBytes(value);
      return this;
    }

    /**
     * <pre>
     * Define the URL query parameter name to use for the parameter. It is case
     * sensitive.
     * </pre>
     *
     * <code>string url_query_parameter = 3;</code>
     * @return The urlQueryParameter.
     */
    @java.lang.Override
    public java.lang.String getUrlQueryParameter() {
      return instance.getUrlQueryParameter();
    }
    /**
     * <pre>
     * Define the URL query parameter name to use for the parameter. It is case
     * sensitive.
     * </pre>
     *
     * <code>string url_query_parameter = 3;</code>
     * @return The bytes for urlQueryParameter.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getUrlQueryParameterBytes() {
      return instance.getUrlQueryParameterBytes();
    }
    /**
     * <pre>
     * Define the URL query parameter name to use for the parameter. It is case
     * sensitive.
     * </pre>
     *
     * <code>string url_query_parameter = 3;</code>
     * @param value The urlQueryParameter to set.
     * @return This builder for chaining.
     */
    public Builder setUrlQueryParameter(
        java.lang.String value) {
      copyOnWrite();
      instance.setUrlQueryParameter(value);
      return this;
    }
    /**
     * <pre>
     * Define the URL query parameter name to use for the parameter. It is case
     * sensitive.
     * </pre>
     *
     * <code>string url_query_parameter = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearUrlQueryParameter() {
      copyOnWrite();
      instance.clearUrlQueryParameter();
      return this;
    }
    /**
     * <pre>
     * Define the URL query parameter name to use for the parameter. It is case
     * sensitive.
     * </pre>
     *
     * <code>string url_query_parameter = 3;</code>
     * @param value The bytes for urlQueryParameter to set.
     * @return This builder for chaining.
     */
    public Builder setUrlQueryParameterBytes(
        com.google.protobuf.ByteString value) {
      copyOnWrite();
      instance.setUrlQueryParameterBytes(value);
      return this;
    }

    // @@protoc_insertion_point(builder_scope:google.api.SystemParameter)
  }
  @java.lang.Override
  @java.lang.SuppressWarnings({"unchecked", "fallthrough"})
  protected final java.lang.Object dynamicMethod(
      com.google.protobuf.GeneratedMessageLite.MethodToInvoke method,
      java.lang.Object arg0, java.lang.Object arg1) {
    switch (method) {
      case NEW_MUTABLE_INSTANCE: {
        return new com.google.api.SystemParameter();
      }
      case NEW_BUILDER: {
        return new Builder();
      }
      case BUILD_MESSAGE_INFO: {
          java.lang.Object[] objects = new java.lang.Object[] {
            "name_",
            "httpHeader_",
            "urlQueryParameter_",
          };
          java.lang.String info =
              "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u0208\u0002\u0208" +
              "\u0003\u0208";
          return newMessageInfo(DEFAULT_INSTANCE, info, objects);
      }
      // fall through
      case GET_DEFAULT_INSTANCE: {
        return DEFAULT_INSTANCE;
      }
      case GET_PARSER: {
        com.google.protobuf.Parser<com.google.api.SystemParameter> parser = PARSER;
        if (parser == null) {
          synchronized (com.google.api.SystemParameter.class) {
            parser = PARSER;
            if (parser == null) {
              parser =
                  new DefaultInstanceBasedParser<com.google.api.SystemParameter>(
                      DEFAULT_INSTANCE);
              PARSER = parser;
            }
          }
        }
        return parser;
    }
    case GET_MEMOIZED_IS_INITIALIZED: {
      return (byte) 1;
    }
    case SET_MEMOIZED_IS_INITIALIZED: {
      return null;
    }
    }
    throw new UnsupportedOperationException();
  }


  // @@protoc_insertion_point(class_scope:google.api.SystemParameter)
  private static final com.google.api.SystemParameter DEFAULT_INSTANCE;
  static {
    SystemParameter defaultInstance = new SystemParameter();
    // New instances are implicitly immutable so no need to make
    // immutable.
    DEFAULT_INSTANCE = defaultInstance;
    com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(
      SystemParameter.class, defaultInstance);
  }

  public static com.google.api.SystemParameter getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static volatile com.google.protobuf.Parser<SystemParameter> PARSER;

  public static com.google.protobuf.Parser<SystemParameter> parser() {
    return DEFAULT_INSTANCE.getParserForType();
  }
}
