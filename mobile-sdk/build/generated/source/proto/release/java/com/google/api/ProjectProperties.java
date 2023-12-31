// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/api/consumer.proto

package com.google.api;

/**
 * <pre>
 * A descriptor for defining project properties for a service. One service may
 * have many consumer projects, and the service may want to behave differently
 * depending on some properties on the project. For example, a project may be
 * associated with a school, or a business, or a government agency, a business
 * type property on the project may affect how a service responds to the client.
 * This descriptor defines which properties are allowed to be set on a project.
 * Example:
 *    project_properties:
 *      properties:
 *      - name: NO_WATERMARK
 *        type: BOOL
 *        description: Allows usage of the API without watermarks.
 *      - name: EXTENDED_TILE_CACHE_PERIOD
 *        type: INT64
 * </pre>
 *
 * Protobuf type {@code google.api.ProjectProperties}
 */
public  final class ProjectProperties extends
    com.google.protobuf.GeneratedMessageLite<
        ProjectProperties, ProjectProperties.Builder> implements
    // @@protoc_insertion_point(message_implements:google.api.ProjectProperties)
    ProjectPropertiesOrBuilder {
  private ProjectProperties() {
    properties_ = emptyProtobufList();
  }
  public static final int PROPERTIES_FIELD_NUMBER = 1;
  private com.google.protobuf.Internal.ProtobufList<com.google.api.Property> properties_;
  /**
   * <pre>
   * List of per consumer project-specific properties.
   * </pre>
   *
   * <code>repeated .google.api.Property properties = 1;</code>
   */
  @java.lang.Override
  public java.util.List<com.google.api.Property> getPropertiesList() {
    return properties_;
  }
  /**
   * <pre>
   * List of per consumer project-specific properties.
   * </pre>
   *
   * <code>repeated .google.api.Property properties = 1;</code>
   */
  public java.util.List<? extends com.google.api.PropertyOrBuilder> 
      getPropertiesOrBuilderList() {
    return properties_;
  }
  /**
   * <pre>
   * List of per consumer project-specific properties.
   * </pre>
   *
   * <code>repeated .google.api.Property properties = 1;</code>
   */
  @java.lang.Override
  public int getPropertiesCount() {
    return properties_.size();
  }
  /**
   * <pre>
   * List of per consumer project-specific properties.
   * </pre>
   *
   * <code>repeated .google.api.Property properties = 1;</code>
   */
  @java.lang.Override
  public com.google.api.Property getProperties(int index) {
    return properties_.get(index);
  }
  /**
   * <pre>
   * List of per consumer project-specific properties.
   * </pre>
   *
   * <code>repeated .google.api.Property properties = 1;</code>
   */
  public com.google.api.PropertyOrBuilder getPropertiesOrBuilder(
      int index) {
    return properties_.get(index);
  }
  private void ensurePropertiesIsMutable() {
    com.google.protobuf.Internal.ProtobufList<com.google.api.Property> tmp = properties_;
    if (!tmp.isModifiable()) {
      properties_ =
          com.google.protobuf.GeneratedMessageLite.mutableCopy(tmp);
     }
  }

  /**
   * <pre>
   * List of per consumer project-specific properties.
   * </pre>
   *
   * <code>repeated .google.api.Property properties = 1;</code>
   */
  private void setProperties(
      int index, com.google.api.Property value) {
    value.getClass();
  ensurePropertiesIsMutable();
    properties_.set(index, value);
  }
  /**
   * <pre>
   * List of per consumer project-specific properties.
   * </pre>
   *
   * <code>repeated .google.api.Property properties = 1;</code>
   */
  private void addProperties(com.google.api.Property value) {
    value.getClass();
  ensurePropertiesIsMutable();
    properties_.add(value);
  }
  /**
   * <pre>
   * List of per consumer project-specific properties.
   * </pre>
   *
   * <code>repeated .google.api.Property properties = 1;</code>
   */
  private void addProperties(
      int index, com.google.api.Property value) {
    value.getClass();
  ensurePropertiesIsMutable();
    properties_.add(index, value);
  }
  /**
   * <pre>
   * List of per consumer project-specific properties.
   * </pre>
   *
   * <code>repeated .google.api.Property properties = 1;</code>
   */
  private void addAllProperties(
      java.lang.Iterable<? extends com.google.api.Property> values) {
    ensurePropertiesIsMutable();
    com.google.protobuf.AbstractMessageLite.addAll(
        values, properties_);
  }
  /**
   * <pre>
   * List of per consumer project-specific properties.
   * </pre>
   *
   * <code>repeated .google.api.Property properties = 1;</code>
   */
  private void clearProperties() {
    properties_ = emptyProtobufList();
  }
  /**
   * <pre>
   * List of per consumer project-specific properties.
   * </pre>
   *
   * <code>repeated .google.api.Property properties = 1;</code>
   */
  private void removeProperties(int index) {
    ensurePropertiesIsMutable();
    properties_.remove(index);
  }

  public static com.google.api.ProjectProperties parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static com.google.api.ProjectProperties parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static com.google.api.ProjectProperties parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static com.google.api.ProjectProperties parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static com.google.api.ProjectProperties parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static com.google.api.ProjectProperties parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static com.google.api.ProjectProperties parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static com.google.api.ProjectProperties parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static com.google.api.ProjectProperties parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input);
  }
  public static com.google.api.ProjectProperties parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static com.google.api.ProjectProperties parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static com.google.api.ProjectProperties parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }

  public static Builder newBuilder() {
    return (Builder) DEFAULT_INSTANCE.createBuilder();
  }
  public static Builder newBuilder(com.google.api.ProjectProperties prototype) {
    return (Builder) DEFAULT_INSTANCE.createBuilder(prototype);
  }

  /**
   * <pre>
   * A descriptor for defining project properties for a service. One service may
   * have many consumer projects, and the service may want to behave differently
   * depending on some properties on the project. For example, a project may be
   * associated with a school, or a business, or a government agency, a business
   * type property on the project may affect how a service responds to the client.
   * This descriptor defines which properties are allowed to be set on a project.
   * Example:
   *    project_properties:
   *      properties:
   *      - name: NO_WATERMARK
   *        type: BOOL
   *        description: Allows usage of the API without watermarks.
   *      - name: EXTENDED_TILE_CACHE_PERIOD
   *        type: INT64
   * </pre>
   *
   * Protobuf type {@code google.api.ProjectProperties}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageLite.Builder<
        com.google.api.ProjectProperties, Builder> implements
      // @@protoc_insertion_point(builder_implements:google.api.ProjectProperties)
      com.google.api.ProjectPropertiesOrBuilder {
    // Construct using com.google.api.ProjectProperties.newBuilder()
    private Builder() {
      super(DEFAULT_INSTANCE);
    }


    /**
     * <pre>
     * List of per consumer project-specific properties.
     * </pre>
     *
     * <code>repeated .google.api.Property properties = 1;</code>
     */
    @java.lang.Override
    public java.util.List<com.google.api.Property> getPropertiesList() {
      return java.util.Collections.unmodifiableList(
          instance.getPropertiesList());
    }
    /**
     * <pre>
     * List of per consumer project-specific properties.
     * </pre>
     *
     * <code>repeated .google.api.Property properties = 1;</code>
     */
    @java.lang.Override
    public int getPropertiesCount() {
      return instance.getPropertiesCount();
    }/**
     * <pre>
     * List of per consumer project-specific properties.
     * </pre>
     *
     * <code>repeated .google.api.Property properties = 1;</code>
     */
    @java.lang.Override
    public com.google.api.Property getProperties(int index) {
      return instance.getProperties(index);
    }
    /**
     * <pre>
     * List of per consumer project-specific properties.
     * </pre>
     *
     * <code>repeated .google.api.Property properties = 1;</code>
     */
    public Builder setProperties(
        int index, com.google.api.Property value) {
      copyOnWrite();
      instance.setProperties(index, value);
      return this;
    }
    /**
     * <pre>
     * List of per consumer project-specific properties.
     * </pre>
     *
     * <code>repeated .google.api.Property properties = 1;</code>
     */
    public Builder setProperties(
        int index, com.google.api.Property.Builder builderForValue) {
      copyOnWrite();
      instance.setProperties(index,
          builderForValue.build());
      return this;
    }
    /**
     * <pre>
     * List of per consumer project-specific properties.
     * </pre>
     *
     * <code>repeated .google.api.Property properties = 1;</code>
     */
    public Builder addProperties(com.google.api.Property value) {
      copyOnWrite();
      instance.addProperties(value);
      return this;
    }
    /**
     * <pre>
     * List of per consumer project-specific properties.
     * </pre>
     *
     * <code>repeated .google.api.Property properties = 1;</code>
     */
    public Builder addProperties(
        int index, com.google.api.Property value) {
      copyOnWrite();
      instance.addProperties(index, value);
      return this;
    }
    /**
     * <pre>
     * List of per consumer project-specific properties.
     * </pre>
     *
     * <code>repeated .google.api.Property properties = 1;</code>
     */
    public Builder addProperties(
        com.google.api.Property.Builder builderForValue) {
      copyOnWrite();
      instance.addProperties(builderForValue.build());
      return this;
    }
    /**
     * <pre>
     * List of per consumer project-specific properties.
     * </pre>
     *
     * <code>repeated .google.api.Property properties = 1;</code>
     */
    public Builder addProperties(
        int index, com.google.api.Property.Builder builderForValue) {
      copyOnWrite();
      instance.addProperties(index,
          builderForValue.build());
      return this;
    }
    /**
     * <pre>
     * List of per consumer project-specific properties.
     * </pre>
     *
     * <code>repeated .google.api.Property properties = 1;</code>
     */
    public Builder addAllProperties(
        java.lang.Iterable<? extends com.google.api.Property> values) {
      copyOnWrite();
      instance.addAllProperties(values);
      return this;
    }
    /**
     * <pre>
     * List of per consumer project-specific properties.
     * </pre>
     *
     * <code>repeated .google.api.Property properties = 1;</code>
     */
    public Builder clearProperties() {
      copyOnWrite();
      instance.clearProperties();
      return this;
    }
    /**
     * <pre>
     * List of per consumer project-specific properties.
     * </pre>
     *
     * <code>repeated .google.api.Property properties = 1;</code>
     */
    public Builder removeProperties(int index) {
      copyOnWrite();
      instance.removeProperties(index);
      return this;
    }

    // @@protoc_insertion_point(builder_scope:google.api.ProjectProperties)
  }
  @java.lang.Override
  @java.lang.SuppressWarnings({"unchecked", "fallthrough"})
  protected final java.lang.Object dynamicMethod(
      com.google.protobuf.GeneratedMessageLite.MethodToInvoke method,
      java.lang.Object arg0, java.lang.Object arg1) {
    switch (method) {
      case NEW_MUTABLE_INSTANCE: {
        return new com.google.api.ProjectProperties();
      }
      case NEW_BUILDER: {
        return new Builder();
      }
      case BUILD_MESSAGE_INFO: {
          java.lang.Object[] objects = new java.lang.Object[] {
            "properties_",
            com.google.api.Property.class,
          };
          java.lang.String info =
              "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b";
          return newMessageInfo(DEFAULT_INSTANCE, info, objects);
      }
      // fall through
      case GET_DEFAULT_INSTANCE: {
        return DEFAULT_INSTANCE;
      }
      case GET_PARSER: {
        com.google.protobuf.Parser<com.google.api.ProjectProperties> parser = PARSER;
        if (parser == null) {
          synchronized (com.google.api.ProjectProperties.class) {
            parser = PARSER;
            if (parser == null) {
              parser =
                  new DefaultInstanceBasedParser<com.google.api.ProjectProperties>(
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


  // @@protoc_insertion_point(class_scope:google.api.ProjectProperties)
  private static final com.google.api.ProjectProperties DEFAULT_INSTANCE;
  static {
    ProjectProperties defaultInstance = new ProjectProperties();
    // New instances are implicitly immutable so no need to make
    // immutable.
    DEFAULT_INSTANCE = defaultInstance;
    com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(
      ProjectProperties.class, defaultInstance);
  }

  public static com.google.api.ProjectProperties getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static volatile com.google.protobuf.Parser<ProjectProperties> PARSER;

  public static com.google.protobuf.Parser<ProjectProperties> parser() {
    return DEFAULT_INSTANCE.getParserForType();
  }
}

