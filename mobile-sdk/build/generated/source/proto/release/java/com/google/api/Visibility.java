// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/api/visibility.proto

package com.google.api;

/**
 * <pre>
 * `Visibility` restricts service consumer's access to service elements,
 * such as whether an application can call a visibility-restricted method.
 * The restriction is expressed by applying visibility labels on service
 * elements. The visibility labels are elsewhere linked to service consumers.
 * A service can define multiple visibility labels, but a service consumer
 * should be granted at most one visibility label. Multiple visibility
 * labels for a single service consumer are not supported.
 * If an element and all its parents have no visibility label, its visibility
 * is unconditionally granted.
 * Example:
 *     visibility:
 *       rules:
 *       - selector: google.calendar.Calendar.EnhancedSearch
 *         restriction: PREVIEW
 *       - selector: google.calendar.Calendar.Delegate
 *         restriction: INTERNAL
 * Here, all methods are publicly visible except for the restricted methods
 * EnhancedSearch and Delegate.
 * </pre>
 *
 * Protobuf type {@code google.api.Visibility}
 */
public  final class Visibility extends
    com.google.protobuf.GeneratedMessageLite<
        Visibility, Visibility.Builder> implements
    // @@protoc_insertion_point(message_implements:google.api.Visibility)
    VisibilityOrBuilder {
  private Visibility() {
    rules_ = emptyProtobufList();
  }
  public static final int RULES_FIELD_NUMBER = 1;
  private com.google.protobuf.Internal.ProtobufList<com.google.api.VisibilityRule> rules_;
  /**
   * <pre>
   * A list of visibility rules that apply to individual API elements.
   * **NOTE:** All service configuration rules follow "last one wins" order.
   * </pre>
   *
   * <code>repeated .google.api.VisibilityRule rules = 1;</code>
   */
  @java.lang.Override
  public java.util.List<com.google.api.VisibilityRule> getRulesList() {
    return rules_;
  }
  /**
   * <pre>
   * A list of visibility rules that apply to individual API elements.
   * **NOTE:** All service configuration rules follow "last one wins" order.
   * </pre>
   *
   * <code>repeated .google.api.VisibilityRule rules = 1;</code>
   */
  public java.util.List<? extends com.google.api.VisibilityRuleOrBuilder> 
      getRulesOrBuilderList() {
    return rules_;
  }
  /**
   * <pre>
   * A list of visibility rules that apply to individual API elements.
   * **NOTE:** All service configuration rules follow "last one wins" order.
   * </pre>
   *
   * <code>repeated .google.api.VisibilityRule rules = 1;</code>
   */
  @java.lang.Override
  public int getRulesCount() {
    return rules_.size();
  }
  /**
   * <pre>
   * A list of visibility rules that apply to individual API elements.
   * **NOTE:** All service configuration rules follow "last one wins" order.
   * </pre>
   *
   * <code>repeated .google.api.VisibilityRule rules = 1;</code>
   */
  @java.lang.Override
  public com.google.api.VisibilityRule getRules(int index) {
    return rules_.get(index);
  }
  /**
   * <pre>
   * A list of visibility rules that apply to individual API elements.
   * **NOTE:** All service configuration rules follow "last one wins" order.
   * </pre>
   *
   * <code>repeated .google.api.VisibilityRule rules = 1;</code>
   */
  public com.google.api.VisibilityRuleOrBuilder getRulesOrBuilder(
      int index) {
    return rules_.get(index);
  }
  private void ensureRulesIsMutable() {
    com.google.protobuf.Internal.ProtobufList<com.google.api.VisibilityRule> tmp = rules_;
    if (!tmp.isModifiable()) {
      rules_ =
          com.google.protobuf.GeneratedMessageLite.mutableCopy(tmp);
     }
  }

  /**
   * <pre>
   * A list of visibility rules that apply to individual API elements.
   * **NOTE:** All service configuration rules follow "last one wins" order.
   * </pre>
   *
   * <code>repeated .google.api.VisibilityRule rules = 1;</code>
   */
  private void setRules(
      int index, com.google.api.VisibilityRule value) {
    value.getClass();
  ensureRulesIsMutable();
    rules_.set(index, value);
  }
  /**
   * <pre>
   * A list of visibility rules that apply to individual API elements.
   * **NOTE:** All service configuration rules follow "last one wins" order.
   * </pre>
   *
   * <code>repeated .google.api.VisibilityRule rules = 1;</code>
   */
  private void addRules(com.google.api.VisibilityRule value) {
    value.getClass();
  ensureRulesIsMutable();
    rules_.add(value);
  }
  /**
   * <pre>
   * A list of visibility rules that apply to individual API elements.
   * **NOTE:** All service configuration rules follow "last one wins" order.
   * </pre>
   *
   * <code>repeated .google.api.VisibilityRule rules = 1;</code>
   */
  private void addRules(
      int index, com.google.api.VisibilityRule value) {
    value.getClass();
  ensureRulesIsMutable();
    rules_.add(index, value);
  }
  /**
   * <pre>
   * A list of visibility rules that apply to individual API elements.
   * **NOTE:** All service configuration rules follow "last one wins" order.
   * </pre>
   *
   * <code>repeated .google.api.VisibilityRule rules = 1;</code>
   */
  private void addAllRules(
      java.lang.Iterable<? extends com.google.api.VisibilityRule> values) {
    ensureRulesIsMutable();
    com.google.protobuf.AbstractMessageLite.addAll(
        values, rules_);
  }
  /**
   * <pre>
   * A list of visibility rules that apply to individual API elements.
   * **NOTE:** All service configuration rules follow "last one wins" order.
   * </pre>
   *
   * <code>repeated .google.api.VisibilityRule rules = 1;</code>
   */
  private void clearRules() {
    rules_ = emptyProtobufList();
  }
  /**
   * <pre>
   * A list of visibility rules that apply to individual API elements.
   * **NOTE:** All service configuration rules follow "last one wins" order.
   * </pre>
   *
   * <code>repeated .google.api.VisibilityRule rules = 1;</code>
   */
  private void removeRules(int index) {
    ensureRulesIsMutable();
    rules_.remove(index);
  }

  public static com.google.api.Visibility parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static com.google.api.Visibility parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static com.google.api.Visibility parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static com.google.api.Visibility parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static com.google.api.Visibility parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static com.google.api.Visibility parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static com.google.api.Visibility parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static com.google.api.Visibility parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static com.google.api.Visibility parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input);
  }
  public static com.google.api.Visibility parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static com.google.api.Visibility parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static com.google.api.Visibility parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }

  public static Builder newBuilder() {
    return (Builder) DEFAULT_INSTANCE.createBuilder();
  }
  public static Builder newBuilder(com.google.api.Visibility prototype) {
    return (Builder) DEFAULT_INSTANCE.createBuilder(prototype);
  }

  /**
   * <pre>
   * `Visibility` restricts service consumer's access to service elements,
   * such as whether an application can call a visibility-restricted method.
   * The restriction is expressed by applying visibility labels on service
   * elements. The visibility labels are elsewhere linked to service consumers.
   * A service can define multiple visibility labels, but a service consumer
   * should be granted at most one visibility label. Multiple visibility
   * labels for a single service consumer are not supported.
   * If an element and all its parents have no visibility label, its visibility
   * is unconditionally granted.
   * Example:
   *     visibility:
   *       rules:
   *       - selector: google.calendar.Calendar.EnhancedSearch
   *         restriction: PREVIEW
   *       - selector: google.calendar.Calendar.Delegate
   *         restriction: INTERNAL
   * Here, all methods are publicly visible except for the restricted methods
   * EnhancedSearch and Delegate.
   * </pre>
   *
   * Protobuf type {@code google.api.Visibility}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageLite.Builder<
        com.google.api.Visibility, Builder> implements
      // @@protoc_insertion_point(builder_implements:google.api.Visibility)
      com.google.api.VisibilityOrBuilder {
    // Construct using com.google.api.Visibility.newBuilder()
    private Builder() {
      super(DEFAULT_INSTANCE);
    }


    /**
     * <pre>
     * A list of visibility rules that apply to individual API elements.
     * **NOTE:** All service configuration rules follow "last one wins" order.
     * </pre>
     *
     * <code>repeated .google.api.VisibilityRule rules = 1;</code>
     */
    @java.lang.Override
    public java.util.List<com.google.api.VisibilityRule> getRulesList() {
      return java.util.Collections.unmodifiableList(
          instance.getRulesList());
    }
    /**
     * <pre>
     * A list of visibility rules that apply to individual API elements.
     * **NOTE:** All service configuration rules follow "last one wins" order.
     * </pre>
     *
     * <code>repeated .google.api.VisibilityRule rules = 1;</code>
     */
    @java.lang.Override
    public int getRulesCount() {
      return instance.getRulesCount();
    }/**
     * <pre>
     * A list of visibility rules that apply to individual API elements.
     * **NOTE:** All service configuration rules follow "last one wins" order.
     * </pre>
     *
     * <code>repeated .google.api.VisibilityRule rules = 1;</code>
     */
    @java.lang.Override
    public com.google.api.VisibilityRule getRules(int index) {
      return instance.getRules(index);
    }
    /**
     * <pre>
     * A list of visibility rules that apply to individual API elements.
     * **NOTE:** All service configuration rules follow "last one wins" order.
     * </pre>
     *
     * <code>repeated .google.api.VisibilityRule rules = 1;</code>
     */
    public Builder setRules(
        int index, com.google.api.VisibilityRule value) {
      copyOnWrite();
      instance.setRules(index, value);
      return this;
    }
    /**
     * <pre>
     * A list of visibility rules that apply to individual API elements.
     * **NOTE:** All service configuration rules follow "last one wins" order.
     * </pre>
     *
     * <code>repeated .google.api.VisibilityRule rules = 1;</code>
     */
    public Builder setRules(
        int index, com.google.api.VisibilityRule.Builder builderForValue) {
      copyOnWrite();
      instance.setRules(index,
          builderForValue.build());
      return this;
    }
    /**
     * <pre>
     * A list of visibility rules that apply to individual API elements.
     * **NOTE:** All service configuration rules follow "last one wins" order.
     * </pre>
     *
     * <code>repeated .google.api.VisibilityRule rules = 1;</code>
     */
    public Builder addRules(com.google.api.VisibilityRule value) {
      copyOnWrite();
      instance.addRules(value);
      return this;
    }
    /**
     * <pre>
     * A list of visibility rules that apply to individual API elements.
     * **NOTE:** All service configuration rules follow "last one wins" order.
     * </pre>
     *
     * <code>repeated .google.api.VisibilityRule rules = 1;</code>
     */
    public Builder addRules(
        int index, com.google.api.VisibilityRule value) {
      copyOnWrite();
      instance.addRules(index, value);
      return this;
    }
    /**
     * <pre>
     * A list of visibility rules that apply to individual API elements.
     * **NOTE:** All service configuration rules follow "last one wins" order.
     * </pre>
     *
     * <code>repeated .google.api.VisibilityRule rules = 1;</code>
     */
    public Builder addRules(
        com.google.api.VisibilityRule.Builder builderForValue) {
      copyOnWrite();
      instance.addRules(builderForValue.build());
      return this;
    }
    /**
     * <pre>
     * A list of visibility rules that apply to individual API elements.
     * **NOTE:** All service configuration rules follow "last one wins" order.
     * </pre>
     *
     * <code>repeated .google.api.VisibilityRule rules = 1;</code>
     */
    public Builder addRules(
        int index, com.google.api.VisibilityRule.Builder builderForValue) {
      copyOnWrite();
      instance.addRules(index,
          builderForValue.build());
      return this;
    }
    /**
     * <pre>
     * A list of visibility rules that apply to individual API elements.
     * **NOTE:** All service configuration rules follow "last one wins" order.
     * </pre>
     *
     * <code>repeated .google.api.VisibilityRule rules = 1;</code>
     */
    public Builder addAllRules(
        java.lang.Iterable<? extends com.google.api.VisibilityRule> values) {
      copyOnWrite();
      instance.addAllRules(values);
      return this;
    }
    /**
     * <pre>
     * A list of visibility rules that apply to individual API elements.
     * **NOTE:** All service configuration rules follow "last one wins" order.
     * </pre>
     *
     * <code>repeated .google.api.VisibilityRule rules = 1;</code>
     */
    public Builder clearRules() {
      copyOnWrite();
      instance.clearRules();
      return this;
    }
    /**
     * <pre>
     * A list of visibility rules that apply to individual API elements.
     * **NOTE:** All service configuration rules follow "last one wins" order.
     * </pre>
     *
     * <code>repeated .google.api.VisibilityRule rules = 1;</code>
     */
    public Builder removeRules(int index) {
      copyOnWrite();
      instance.removeRules(index);
      return this;
    }

    // @@protoc_insertion_point(builder_scope:google.api.Visibility)
  }
  @java.lang.Override
  @java.lang.SuppressWarnings({"unchecked", "fallthrough"})
  protected final java.lang.Object dynamicMethod(
      com.google.protobuf.GeneratedMessageLite.MethodToInvoke method,
      java.lang.Object arg0, java.lang.Object arg1) {
    switch (method) {
      case NEW_MUTABLE_INSTANCE: {
        return new com.google.api.Visibility();
      }
      case NEW_BUILDER: {
        return new Builder();
      }
      case BUILD_MESSAGE_INFO: {
          java.lang.Object[] objects = new java.lang.Object[] {
            "rules_",
            com.google.api.VisibilityRule.class,
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
        com.google.protobuf.Parser<com.google.api.Visibility> parser = PARSER;
        if (parser == null) {
          synchronized (com.google.api.Visibility.class) {
            parser = PARSER;
            if (parser == null) {
              parser =
                  new DefaultInstanceBasedParser<com.google.api.Visibility>(
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


  // @@protoc_insertion_point(class_scope:google.api.Visibility)
  private static final com.google.api.Visibility DEFAULT_INSTANCE;
  static {
    Visibility defaultInstance = new Visibility();
    // New instances are implicitly immutable so no need to make
    // immutable.
    DEFAULT_INSTANCE = defaultInstance;
    com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(
      Visibility.class, defaultInstance);
  }

  public static com.google.api.Visibility getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static volatile com.google.protobuf.Parser<Visibility> PARSER;

  public static com.google.protobuf.Parser<Visibility> parser() {
    return DEFAULT_INSTANCE.getParserForType();
  }
}

