// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/api/resource.proto

package com.google.api;

/**
 * <pre>
 * Defines a proto annotation that describes a string field that refers to
 * an API resource.
 * </pre>
 *
 * Protobuf type {@code google.api.ResourceReference}
 */
public  final class ResourceReference extends
    com.google.protobuf.GeneratedMessageLite<
        ResourceReference, ResourceReference.Builder> implements
    // @@protoc_insertion_point(message_implements:google.api.ResourceReference)
    ResourceReferenceOrBuilder {
  private ResourceReference() {
    type_ = "";
    childType_ = "";
  }
  public static final int TYPE_FIELD_NUMBER = 1;
  private java.lang.String type_;
  /**
   * <pre>
   * The resource type that the annotated field references.
   * Example:
   *     message Subscription {
   *       string topic = 2 [(google.api.resource_reference) = {
   *         type: "pubsub.googleapis.com/Topic"
   *       }];
   *     }
   * Occasionally, a field may reference an arbitrary resource. In this case,
   * APIs use the special value * in their resource reference.
   * Example:
   *     message GetIamPolicyRequest {
   *       string resource = 2 [(google.api.resource_reference) = {
   *         type: "*"
   *       }];
   *     }
   * </pre>
   *
   * <code>string type = 1;</code>
   * @return The type.
   */
  @java.lang.Override
  public java.lang.String getType() {
    return type_;
  }
  /**
   * <pre>
   * The resource type that the annotated field references.
   * Example:
   *     message Subscription {
   *       string topic = 2 [(google.api.resource_reference) = {
   *         type: "pubsub.googleapis.com/Topic"
   *       }];
   *     }
   * Occasionally, a field may reference an arbitrary resource. In this case,
   * APIs use the special value * in their resource reference.
   * Example:
   *     message GetIamPolicyRequest {
   *       string resource = 2 [(google.api.resource_reference) = {
   *         type: "*"
   *       }];
   *     }
   * </pre>
   *
   * <code>string type = 1;</code>
   * @return The bytes for type.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getTypeBytes() {
    return com.google.protobuf.ByteString.copyFromUtf8(type_);
  }
  /**
   * <pre>
   * The resource type that the annotated field references.
   * Example:
   *     message Subscription {
   *       string topic = 2 [(google.api.resource_reference) = {
   *         type: "pubsub.googleapis.com/Topic"
   *       }];
   *     }
   * Occasionally, a field may reference an arbitrary resource. In this case,
   * APIs use the special value * in their resource reference.
   * Example:
   *     message GetIamPolicyRequest {
   *       string resource = 2 [(google.api.resource_reference) = {
   *         type: "*"
   *       }];
   *     }
   * </pre>
   *
   * <code>string type = 1;</code>
   * @param value The type to set.
   */
  private void setType(
      java.lang.String value) {
    java.lang.Class<?> valueClass = value.getClass();
  
    type_ = value;
  }
  /**
   * <pre>
   * The resource type that the annotated field references.
   * Example:
   *     message Subscription {
   *       string topic = 2 [(google.api.resource_reference) = {
   *         type: "pubsub.googleapis.com/Topic"
   *       }];
   *     }
   * Occasionally, a field may reference an arbitrary resource. In this case,
   * APIs use the special value * in their resource reference.
   * Example:
   *     message GetIamPolicyRequest {
   *       string resource = 2 [(google.api.resource_reference) = {
   *         type: "*"
   *       }];
   *     }
   * </pre>
   *
   * <code>string type = 1;</code>
   */
  private void clearType() {
    
    type_ = getDefaultInstance().getType();
  }
  /**
   * <pre>
   * The resource type that the annotated field references.
   * Example:
   *     message Subscription {
   *       string topic = 2 [(google.api.resource_reference) = {
   *         type: "pubsub.googleapis.com/Topic"
   *       }];
   *     }
   * Occasionally, a field may reference an arbitrary resource. In this case,
   * APIs use the special value * in their resource reference.
   * Example:
   *     message GetIamPolicyRequest {
   *       string resource = 2 [(google.api.resource_reference) = {
   *         type: "*"
   *       }];
   *     }
   * </pre>
   *
   * <code>string type = 1;</code>
   * @param value The bytes for type to set.
   */
  private void setTypeBytes(
      com.google.protobuf.ByteString value) {
    checkByteStringIsUtf8(value);
    type_ = value.toStringUtf8();
    
  }

  public static final int CHILD_TYPE_FIELD_NUMBER = 2;
  private java.lang.String childType_;
  /**
   * <pre>
   * The resource type of a child collection that the annotated field
   * references. This is useful for annotating the `parent` field that
   * doesn't have a fixed resource type.
   * Example:
   *     message ListLogEntriesRequest {
   *       string parent = 1 [(google.api.resource_reference) = {
   *         child_type: "logging.googleapis.com/LogEntry"
   *       };
   *     }
   * </pre>
   *
   * <code>string child_type = 2;</code>
   * @return The childType.
   */
  @java.lang.Override
  public java.lang.String getChildType() {
    return childType_;
  }
  /**
   * <pre>
   * The resource type of a child collection that the annotated field
   * references. This is useful for annotating the `parent` field that
   * doesn't have a fixed resource type.
   * Example:
   *     message ListLogEntriesRequest {
   *       string parent = 1 [(google.api.resource_reference) = {
   *         child_type: "logging.googleapis.com/LogEntry"
   *       };
   *     }
   * </pre>
   *
   * <code>string child_type = 2;</code>
   * @return The bytes for childType.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getChildTypeBytes() {
    return com.google.protobuf.ByteString.copyFromUtf8(childType_);
  }
  /**
   * <pre>
   * The resource type of a child collection that the annotated field
   * references. This is useful for annotating the `parent` field that
   * doesn't have a fixed resource type.
   * Example:
   *     message ListLogEntriesRequest {
   *       string parent = 1 [(google.api.resource_reference) = {
   *         child_type: "logging.googleapis.com/LogEntry"
   *       };
   *     }
   * </pre>
   *
   * <code>string child_type = 2;</code>
   * @param value The childType to set.
   */
  private void setChildType(
      java.lang.String value) {
    java.lang.Class<?> valueClass = value.getClass();
  
    childType_ = value;
  }
  /**
   * <pre>
   * The resource type of a child collection that the annotated field
   * references. This is useful for annotating the `parent` field that
   * doesn't have a fixed resource type.
   * Example:
   *     message ListLogEntriesRequest {
   *       string parent = 1 [(google.api.resource_reference) = {
   *         child_type: "logging.googleapis.com/LogEntry"
   *       };
   *     }
   * </pre>
   *
   * <code>string child_type = 2;</code>
   */
  private void clearChildType() {
    
    childType_ = getDefaultInstance().getChildType();
  }
  /**
   * <pre>
   * The resource type of a child collection that the annotated field
   * references. This is useful for annotating the `parent` field that
   * doesn't have a fixed resource type.
   * Example:
   *     message ListLogEntriesRequest {
   *       string parent = 1 [(google.api.resource_reference) = {
   *         child_type: "logging.googleapis.com/LogEntry"
   *       };
   *     }
   * </pre>
   *
   * <code>string child_type = 2;</code>
   * @param value The bytes for childType to set.
   */
  private void setChildTypeBytes(
      com.google.protobuf.ByteString value) {
    checkByteStringIsUtf8(value);
    childType_ = value.toStringUtf8();
    
  }

  public static com.google.api.ResourceReference parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static com.google.api.ResourceReference parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static com.google.api.ResourceReference parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static com.google.api.ResourceReference parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static com.google.api.ResourceReference parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static com.google.api.ResourceReference parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static com.google.api.ResourceReference parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static com.google.api.ResourceReference parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static com.google.api.ResourceReference parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input);
  }
  public static com.google.api.ResourceReference parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static com.google.api.ResourceReference parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static com.google.api.ResourceReference parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }

  public static Builder newBuilder() {
    return (Builder) DEFAULT_INSTANCE.createBuilder();
  }
  public static Builder newBuilder(com.google.api.ResourceReference prototype) {
    return (Builder) DEFAULT_INSTANCE.createBuilder(prototype);
  }

  /**
   * <pre>
   * Defines a proto annotation that describes a string field that refers to
   * an API resource.
   * </pre>
   *
   * Protobuf type {@code google.api.ResourceReference}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageLite.Builder<
        com.google.api.ResourceReference, Builder> implements
      // @@protoc_insertion_point(builder_implements:google.api.ResourceReference)
      com.google.api.ResourceReferenceOrBuilder {
    // Construct using com.google.api.ResourceReference.newBuilder()
    private Builder() {
      super(DEFAULT_INSTANCE);
    }


    /**
     * <pre>
     * The resource type that the annotated field references.
     * Example:
     *     message Subscription {
     *       string topic = 2 [(google.api.resource_reference) = {
     *         type: "pubsub.googleapis.com/Topic"
     *       }];
     *     }
     * Occasionally, a field may reference an arbitrary resource. In this case,
     * APIs use the special value * in their resource reference.
     * Example:
     *     message GetIamPolicyRequest {
     *       string resource = 2 [(google.api.resource_reference) = {
     *         type: "*"
     *       }];
     *     }
     * </pre>
     *
     * <code>string type = 1;</code>
     * @return The type.
     */
    @java.lang.Override
    public java.lang.String getType() {
      return instance.getType();
    }
    /**
     * <pre>
     * The resource type that the annotated field references.
     * Example:
     *     message Subscription {
     *       string topic = 2 [(google.api.resource_reference) = {
     *         type: "pubsub.googleapis.com/Topic"
     *       }];
     *     }
     * Occasionally, a field may reference an arbitrary resource. In this case,
     * APIs use the special value * in their resource reference.
     * Example:
     *     message GetIamPolicyRequest {
     *       string resource = 2 [(google.api.resource_reference) = {
     *         type: "*"
     *       }];
     *     }
     * </pre>
     *
     * <code>string type = 1;</code>
     * @return The bytes for type.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getTypeBytes() {
      return instance.getTypeBytes();
    }
    /**
     * <pre>
     * The resource type that the annotated field references.
     * Example:
     *     message Subscription {
     *       string topic = 2 [(google.api.resource_reference) = {
     *         type: "pubsub.googleapis.com/Topic"
     *       }];
     *     }
     * Occasionally, a field may reference an arbitrary resource. In this case,
     * APIs use the special value * in their resource reference.
     * Example:
     *     message GetIamPolicyRequest {
     *       string resource = 2 [(google.api.resource_reference) = {
     *         type: "*"
     *       }];
     *     }
     * </pre>
     *
     * <code>string type = 1;</code>
     * @param value The type to set.
     * @return This builder for chaining.
     */
    public Builder setType(
        java.lang.String value) {
      copyOnWrite();
      instance.setType(value);
      return this;
    }
    /**
     * <pre>
     * The resource type that the annotated field references.
     * Example:
     *     message Subscription {
     *       string topic = 2 [(google.api.resource_reference) = {
     *         type: "pubsub.googleapis.com/Topic"
     *       }];
     *     }
     * Occasionally, a field may reference an arbitrary resource. In this case,
     * APIs use the special value * in their resource reference.
     * Example:
     *     message GetIamPolicyRequest {
     *       string resource = 2 [(google.api.resource_reference) = {
     *         type: "*"
     *       }];
     *     }
     * </pre>
     *
     * <code>string type = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearType() {
      copyOnWrite();
      instance.clearType();
      return this;
    }
    /**
     * <pre>
     * The resource type that the annotated field references.
     * Example:
     *     message Subscription {
     *       string topic = 2 [(google.api.resource_reference) = {
     *         type: "pubsub.googleapis.com/Topic"
     *       }];
     *     }
     * Occasionally, a field may reference an arbitrary resource. In this case,
     * APIs use the special value * in their resource reference.
     * Example:
     *     message GetIamPolicyRequest {
     *       string resource = 2 [(google.api.resource_reference) = {
     *         type: "*"
     *       }];
     *     }
     * </pre>
     *
     * <code>string type = 1;</code>
     * @param value The bytes for type to set.
     * @return This builder for chaining.
     */
    public Builder setTypeBytes(
        com.google.protobuf.ByteString value) {
      copyOnWrite();
      instance.setTypeBytes(value);
      return this;
    }

    /**
     * <pre>
     * The resource type of a child collection that the annotated field
     * references. This is useful for annotating the `parent` field that
     * doesn't have a fixed resource type.
     * Example:
     *     message ListLogEntriesRequest {
     *       string parent = 1 [(google.api.resource_reference) = {
     *         child_type: "logging.googleapis.com/LogEntry"
     *       };
     *     }
     * </pre>
     *
     * <code>string child_type = 2;</code>
     * @return The childType.
     */
    @java.lang.Override
    public java.lang.String getChildType() {
      return instance.getChildType();
    }
    /**
     * <pre>
     * The resource type of a child collection that the annotated field
     * references. This is useful for annotating the `parent` field that
     * doesn't have a fixed resource type.
     * Example:
     *     message ListLogEntriesRequest {
     *       string parent = 1 [(google.api.resource_reference) = {
     *         child_type: "logging.googleapis.com/LogEntry"
     *       };
     *     }
     * </pre>
     *
     * <code>string child_type = 2;</code>
     * @return The bytes for childType.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getChildTypeBytes() {
      return instance.getChildTypeBytes();
    }
    /**
     * <pre>
     * The resource type of a child collection that the annotated field
     * references. This is useful for annotating the `parent` field that
     * doesn't have a fixed resource type.
     * Example:
     *     message ListLogEntriesRequest {
     *       string parent = 1 [(google.api.resource_reference) = {
     *         child_type: "logging.googleapis.com/LogEntry"
     *       };
     *     }
     * </pre>
     *
     * <code>string child_type = 2;</code>
     * @param value The childType to set.
     * @return This builder for chaining.
     */
    public Builder setChildType(
        java.lang.String value) {
      copyOnWrite();
      instance.setChildType(value);
      return this;
    }
    /**
     * <pre>
     * The resource type of a child collection that the annotated field
     * references. This is useful for annotating the `parent` field that
     * doesn't have a fixed resource type.
     * Example:
     *     message ListLogEntriesRequest {
     *       string parent = 1 [(google.api.resource_reference) = {
     *         child_type: "logging.googleapis.com/LogEntry"
     *       };
     *     }
     * </pre>
     *
     * <code>string child_type = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearChildType() {
      copyOnWrite();
      instance.clearChildType();
      return this;
    }
    /**
     * <pre>
     * The resource type of a child collection that the annotated field
     * references. This is useful for annotating the `parent` field that
     * doesn't have a fixed resource type.
     * Example:
     *     message ListLogEntriesRequest {
     *       string parent = 1 [(google.api.resource_reference) = {
     *         child_type: "logging.googleapis.com/LogEntry"
     *       };
     *     }
     * </pre>
     *
     * <code>string child_type = 2;</code>
     * @param value The bytes for childType to set.
     * @return This builder for chaining.
     */
    public Builder setChildTypeBytes(
        com.google.protobuf.ByteString value) {
      copyOnWrite();
      instance.setChildTypeBytes(value);
      return this;
    }

    // @@protoc_insertion_point(builder_scope:google.api.ResourceReference)
  }
  @java.lang.Override
  @java.lang.SuppressWarnings({"unchecked", "fallthrough"})
  protected final java.lang.Object dynamicMethod(
      com.google.protobuf.GeneratedMessageLite.MethodToInvoke method,
      java.lang.Object arg0, java.lang.Object arg1) {
    switch (method) {
      case NEW_MUTABLE_INSTANCE: {
        return new com.google.api.ResourceReference();
      }
      case NEW_BUILDER: {
        return new Builder();
      }
      case BUILD_MESSAGE_INFO: {
          java.lang.Object[] objects = new java.lang.Object[] {
            "type_",
            "childType_",
          };
          java.lang.String info =
              "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0208\u0002\u0208" +
              "";
          return newMessageInfo(DEFAULT_INSTANCE, info, objects);
      }
      // fall through
      case GET_DEFAULT_INSTANCE: {
        return DEFAULT_INSTANCE;
      }
      case GET_PARSER: {
        com.google.protobuf.Parser<com.google.api.ResourceReference> parser = PARSER;
        if (parser == null) {
          synchronized (com.google.api.ResourceReference.class) {
            parser = PARSER;
            if (parser == null) {
              parser =
                  new DefaultInstanceBasedParser<com.google.api.ResourceReference>(
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


  // @@protoc_insertion_point(class_scope:google.api.ResourceReference)
  private static final com.google.api.ResourceReference DEFAULT_INSTANCE;
  static {
    ResourceReference defaultInstance = new ResourceReference();
    // New instances are implicitly immutable so no need to make
    // immutable.
    DEFAULT_INSTANCE = defaultInstance;
    com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(
      ResourceReference.class, defaultInstance);
  }

  public static com.google.api.ResourceReference getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static volatile com.google.protobuf.Parser<ResourceReference> PARSER;

  public static com.google.protobuf.Parser<ResourceReference> parser() {
    return DEFAULT_INSTANCE.getParserForType();
  }
}

