// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/api/label.proto

package com.google.api;

/**
 * <pre>
 * A description of a label.
 * </pre>
 *
 * Protobuf type {@code google.api.LabelDescriptor}
 */
public  final class LabelDescriptor extends
    com.google.protobuf.GeneratedMessageLite<
        LabelDescriptor, LabelDescriptor.Builder> implements
    // @@protoc_insertion_point(message_implements:google.api.LabelDescriptor)
    LabelDescriptorOrBuilder {
  private LabelDescriptor() {
    key_ = "";
    description_ = "";
  }
  /**
   * <pre>
   * Value types that can be used as label values.
   * </pre>
   *
   * Protobuf enum {@code google.api.LabelDescriptor.ValueType}
   */
  public enum ValueType
      implements com.google.protobuf.Internal.EnumLite {
    /**
     * <pre>
     * A variable-length string. This is the default.
     * </pre>
     *
     * <code>STRING = 0;</code>
     */
    STRING(0),
    /**
     * <pre>
     * Boolean; true or false.
     * </pre>
     *
     * <code>BOOL = 1;</code>
     */
    BOOL(1),
    /**
     * <pre>
     * A 64-bit signed integer.
     * </pre>
     *
     * <code>INT64 = 2;</code>
     */
    INT64(2),
    UNRECOGNIZED(-1),
    ;

    /**
     * <pre>
     * A variable-length string. This is the default.
     * </pre>
     *
     * <code>STRING = 0;</code>
     */
    public static final int STRING_VALUE = 0;
    /**
     * <pre>
     * Boolean; true or false.
     * </pre>
     *
     * <code>BOOL = 1;</code>
     */
    public static final int BOOL_VALUE = 1;
    /**
     * <pre>
     * A 64-bit signed integer.
     * </pre>
     *
     * <code>INT64 = 2;</code>
     */
    public static final int INT64_VALUE = 2;


    @java.lang.Override
    public final int getNumber() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalArgumentException(
            "Can't get the number of an unknown enum value.");
      }
      return value;
    }

    /**
     * @param value The number of the enum to look for.
     * @return The enum associated with the given number.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static ValueType valueOf(int value) {
      return forNumber(value);
    }

    public static ValueType forNumber(int value) {
      switch (value) {
        case 0: return STRING;
        case 1: return BOOL;
        case 2: return INT64;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<ValueType>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        ValueType> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<ValueType>() {
            @java.lang.Override
            public ValueType findValueByNumber(int number) {
              return ValueType.forNumber(number);
            }
          };

    public static com.google.protobuf.Internal.EnumVerifier 
        internalGetVerifier() {
      return ValueTypeVerifier.INSTANCE;
    }

    private static final class ValueTypeVerifier implements 
         com.google.protobuf.Internal.EnumVerifier { 
            static final com.google.protobuf.Internal.EnumVerifier           INSTANCE = new ValueTypeVerifier();
            @java.lang.Override
            public boolean isInRange(int number) {
              return ValueType.forNumber(number) != null;
            }
          };

    private final int value;

    private ValueType(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:google.api.LabelDescriptor.ValueType)
  }

  public static final int KEY_FIELD_NUMBER = 1;
  private java.lang.String key_;
  /**
   * <pre>
   * The label key.
   * </pre>
   *
   * <code>string key = 1;</code>
   * @return The key.
   */
  @java.lang.Override
  public java.lang.String getKey() {
    return key_;
  }
  /**
   * <pre>
   * The label key.
   * </pre>
   *
   * <code>string key = 1;</code>
   * @return The bytes for key.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getKeyBytes() {
    return com.google.protobuf.ByteString.copyFromUtf8(key_);
  }
  /**
   * <pre>
   * The label key.
   * </pre>
   *
   * <code>string key = 1;</code>
   * @param value The key to set.
   */
  private void setKey(
      java.lang.String value) {
    java.lang.Class<?> valueClass = value.getClass();
  
    key_ = value;
  }
  /**
   * <pre>
   * The label key.
   * </pre>
   *
   * <code>string key = 1;</code>
   */
  private void clearKey() {
    
    key_ = getDefaultInstance().getKey();
  }
  /**
   * <pre>
   * The label key.
   * </pre>
   *
   * <code>string key = 1;</code>
   * @param value The bytes for key to set.
   */
  private void setKeyBytes(
      com.google.protobuf.ByteString value) {
    checkByteStringIsUtf8(value);
    key_ = value.toStringUtf8();
    
  }

  public static final int VALUE_TYPE_FIELD_NUMBER = 2;
  private int valueType_;
  /**
   * <pre>
   * The type of data that can be assigned to the label.
   * </pre>
   *
   * <code>.google.api.LabelDescriptor.ValueType value_type = 2;</code>
   * @return The enum numeric value on the wire for valueType.
   */
  @java.lang.Override
  public int getValueTypeValue() {
    return valueType_;
  }
  /**
   * <pre>
   * The type of data that can be assigned to the label.
   * </pre>
   *
   * <code>.google.api.LabelDescriptor.ValueType value_type = 2;</code>
   * @return The valueType.
   */
  @java.lang.Override
  public com.google.api.LabelDescriptor.ValueType getValueType() {
    com.google.api.LabelDescriptor.ValueType result = com.google.api.LabelDescriptor.ValueType.forNumber(valueType_);
    return result == null ? com.google.api.LabelDescriptor.ValueType.UNRECOGNIZED : result;
  }
  /**
   * <pre>
   * The type of data that can be assigned to the label.
   * </pre>
   *
   * <code>.google.api.LabelDescriptor.ValueType value_type = 2;</code>
   * @param value The enum numeric value on the wire for valueType to set.
   */
  private void setValueTypeValue(int value) {
      valueType_ = value;
  }
  /**
   * <pre>
   * The type of data that can be assigned to the label.
   * </pre>
   *
   * <code>.google.api.LabelDescriptor.ValueType value_type = 2;</code>
   * @param value The valueType to set.
   */
  private void setValueType(com.google.api.LabelDescriptor.ValueType value) {
    valueType_ = value.getNumber();
    
  }
  /**
   * <pre>
   * The type of data that can be assigned to the label.
   * </pre>
   *
   * <code>.google.api.LabelDescriptor.ValueType value_type = 2;</code>
   */
  private void clearValueType() {
    
    valueType_ = 0;
  }

  public static final int DESCRIPTION_FIELD_NUMBER = 3;
  private java.lang.String description_;
  /**
   * <pre>
   * A human-readable description for the label.
   * </pre>
   *
   * <code>string description = 3;</code>
   * @return The description.
   */
  @java.lang.Override
  public java.lang.String getDescription() {
    return description_;
  }
  /**
   * <pre>
   * A human-readable description for the label.
   * </pre>
   *
   * <code>string description = 3;</code>
   * @return The bytes for description.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getDescriptionBytes() {
    return com.google.protobuf.ByteString.copyFromUtf8(description_);
  }
  /**
   * <pre>
   * A human-readable description for the label.
   * </pre>
   *
   * <code>string description = 3;</code>
   * @param value The description to set.
   */
  private void setDescription(
      java.lang.String value) {
    java.lang.Class<?> valueClass = value.getClass();
  
    description_ = value;
  }
  /**
   * <pre>
   * A human-readable description for the label.
   * </pre>
   *
   * <code>string description = 3;</code>
   */
  private void clearDescription() {
    
    description_ = getDefaultInstance().getDescription();
  }
  /**
   * <pre>
   * A human-readable description for the label.
   * </pre>
   *
   * <code>string description = 3;</code>
   * @param value The bytes for description to set.
   */
  private void setDescriptionBytes(
      com.google.protobuf.ByteString value) {
    checkByteStringIsUtf8(value);
    description_ = value.toStringUtf8();
    
  }

  public static com.google.api.LabelDescriptor parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static com.google.api.LabelDescriptor parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static com.google.api.LabelDescriptor parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static com.google.api.LabelDescriptor parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static com.google.api.LabelDescriptor parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static com.google.api.LabelDescriptor parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static com.google.api.LabelDescriptor parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static com.google.api.LabelDescriptor parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static com.google.api.LabelDescriptor parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input);
  }
  public static com.google.api.LabelDescriptor parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static com.google.api.LabelDescriptor parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static com.google.api.LabelDescriptor parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }

  public static Builder newBuilder() {
    return (Builder) DEFAULT_INSTANCE.createBuilder();
  }
  public static Builder newBuilder(com.google.api.LabelDescriptor prototype) {
    return (Builder) DEFAULT_INSTANCE.createBuilder(prototype);
  }

  /**
   * <pre>
   * A description of a label.
   * </pre>
   *
   * Protobuf type {@code google.api.LabelDescriptor}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageLite.Builder<
        com.google.api.LabelDescriptor, Builder> implements
      // @@protoc_insertion_point(builder_implements:google.api.LabelDescriptor)
      com.google.api.LabelDescriptorOrBuilder {
    // Construct using com.google.api.LabelDescriptor.newBuilder()
    private Builder() {
      super(DEFAULT_INSTANCE);
    }


    /**
     * <pre>
     * The label key.
     * </pre>
     *
     * <code>string key = 1;</code>
     * @return The key.
     */
    @java.lang.Override
    public java.lang.String getKey() {
      return instance.getKey();
    }
    /**
     * <pre>
     * The label key.
     * </pre>
     *
     * <code>string key = 1;</code>
     * @return The bytes for key.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getKeyBytes() {
      return instance.getKeyBytes();
    }
    /**
     * <pre>
     * The label key.
     * </pre>
     *
     * <code>string key = 1;</code>
     * @param value The key to set.
     * @return This builder for chaining.
     */
    public Builder setKey(
        java.lang.String value) {
      copyOnWrite();
      instance.setKey(value);
      return this;
    }
    /**
     * <pre>
     * The label key.
     * </pre>
     *
     * <code>string key = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearKey() {
      copyOnWrite();
      instance.clearKey();
      return this;
    }
    /**
     * <pre>
     * The label key.
     * </pre>
     *
     * <code>string key = 1;</code>
     * @param value The bytes for key to set.
     * @return This builder for chaining.
     */
    public Builder setKeyBytes(
        com.google.protobuf.ByteString value) {
      copyOnWrite();
      instance.setKeyBytes(value);
      return this;
    }

    /**
     * <pre>
     * The type of data that can be assigned to the label.
     * </pre>
     *
     * <code>.google.api.LabelDescriptor.ValueType value_type = 2;</code>
     * @return The enum numeric value on the wire for valueType.
     */
    @java.lang.Override
    public int getValueTypeValue() {
      return instance.getValueTypeValue();
    }
    /**
     * <pre>
     * The type of data that can be assigned to the label.
     * </pre>
     *
     * <code>.google.api.LabelDescriptor.ValueType value_type = 2;</code>
     * @param value The valueType to set.
     * @return This builder for chaining.
     */
    public Builder setValueTypeValue(int value) {
      copyOnWrite();
      instance.setValueTypeValue(value);
      return this;
    }
    /**
     * <pre>
     * The type of data that can be assigned to the label.
     * </pre>
     *
     * <code>.google.api.LabelDescriptor.ValueType value_type = 2;</code>
     * @return The valueType.
     */
    @java.lang.Override
    public com.google.api.LabelDescriptor.ValueType getValueType() {
      return instance.getValueType();
    }
    /**
     * <pre>
     * The type of data that can be assigned to the label.
     * </pre>
     *
     * <code>.google.api.LabelDescriptor.ValueType value_type = 2;</code>
     * @param value The enum numeric value on the wire for valueType to set.
     * @return This builder for chaining.
     */
    public Builder setValueType(com.google.api.LabelDescriptor.ValueType value) {
      copyOnWrite();
      instance.setValueType(value);
      return this;
    }
    /**
     * <pre>
     * The type of data that can be assigned to the label.
     * </pre>
     *
     * <code>.google.api.LabelDescriptor.ValueType value_type = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearValueType() {
      copyOnWrite();
      instance.clearValueType();
      return this;
    }

    /**
     * <pre>
     * A human-readable description for the label.
     * </pre>
     *
     * <code>string description = 3;</code>
     * @return The description.
     */
    @java.lang.Override
    public java.lang.String getDescription() {
      return instance.getDescription();
    }
    /**
     * <pre>
     * A human-readable description for the label.
     * </pre>
     *
     * <code>string description = 3;</code>
     * @return The bytes for description.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getDescriptionBytes() {
      return instance.getDescriptionBytes();
    }
    /**
     * <pre>
     * A human-readable description for the label.
     * </pre>
     *
     * <code>string description = 3;</code>
     * @param value The description to set.
     * @return This builder for chaining.
     */
    public Builder setDescription(
        java.lang.String value) {
      copyOnWrite();
      instance.setDescription(value);
      return this;
    }
    /**
     * <pre>
     * A human-readable description for the label.
     * </pre>
     *
     * <code>string description = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearDescription() {
      copyOnWrite();
      instance.clearDescription();
      return this;
    }
    /**
     * <pre>
     * A human-readable description for the label.
     * </pre>
     *
     * <code>string description = 3;</code>
     * @param value The bytes for description to set.
     * @return This builder for chaining.
     */
    public Builder setDescriptionBytes(
        com.google.protobuf.ByteString value) {
      copyOnWrite();
      instance.setDescriptionBytes(value);
      return this;
    }

    // @@protoc_insertion_point(builder_scope:google.api.LabelDescriptor)
  }
  @java.lang.Override
  @java.lang.SuppressWarnings({"unchecked", "fallthrough"})
  protected final java.lang.Object dynamicMethod(
      com.google.protobuf.GeneratedMessageLite.MethodToInvoke method,
      java.lang.Object arg0, java.lang.Object arg1) {
    switch (method) {
      case NEW_MUTABLE_INSTANCE: {
        return new com.google.api.LabelDescriptor();
      }
      case NEW_BUILDER: {
        return new Builder();
      }
      case BUILD_MESSAGE_INFO: {
          java.lang.Object[] objects = new java.lang.Object[] {
            "key_",
            "valueType_",
            "description_",
          };
          java.lang.String info =
              "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u0208\u0002\f" +
              "\u0003\u0208";
          return newMessageInfo(DEFAULT_INSTANCE, info, objects);
      }
      // fall through
      case GET_DEFAULT_INSTANCE: {
        return DEFAULT_INSTANCE;
      }
      case GET_PARSER: {
        com.google.protobuf.Parser<com.google.api.LabelDescriptor> parser = PARSER;
        if (parser == null) {
          synchronized (com.google.api.LabelDescriptor.class) {
            parser = PARSER;
            if (parser == null) {
              parser =
                  new DefaultInstanceBasedParser<com.google.api.LabelDescriptor>(
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


  // @@protoc_insertion_point(class_scope:google.api.LabelDescriptor)
  private static final com.google.api.LabelDescriptor DEFAULT_INSTANCE;
  static {
    LabelDescriptor defaultInstance = new LabelDescriptor();
    // New instances are implicitly immutable so no need to make
    // immutable.
    DEFAULT_INSTANCE = defaultInstance;
    com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(
      LabelDescriptor.class, defaultInstance);
  }

  public static com.google.api.LabelDescriptor getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static volatile com.google.protobuf.Parser<LabelDescriptor> PARSER;

  public static com.google.protobuf.Parser<LabelDescriptor> parser() {
    return DEFAULT_INSTANCE.getParserForType();
  }
}

