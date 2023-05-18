// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: temp.proto

package com.xml2023.mainapp;

/**
 * Protobuf type {@code com.xml2023.mainapp.getHostResponse}
 */
public  final class getHostResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:com.xml2023.mainapp.getHostResponse)
    getHostResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use getHostResponse.newBuilder() to construct.
  private getHostResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private getHostResponse() {
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private getHostResponse(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 10: {
            com.xml2023.mainapp.HostBasicDTO.Builder subBuilder = null;
            if (host_ != null) {
              subBuilder = host_.toBuilder();
            }
            host_ = input.readMessage(com.xml2023.mainapp.HostBasicDTO.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(host_);
              host_ = subBuilder.buildPartial();
            }

            break;
          }
          default: {
            if (!parseUnknownFieldProto3(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.xml2023.mainapp.Temp.internal_static_com_xml2023_mainapp_getHostResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.xml2023.mainapp.Temp.internal_static_com_xml2023_mainapp_getHostResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.xml2023.mainapp.getHostResponse.class, com.xml2023.mainapp.getHostResponse.Builder.class);
  }

  public static final int HOST_FIELD_NUMBER = 1;
  private com.xml2023.mainapp.HostBasicDTO host_;
  /**
   * <code>.com.xml2023.mainapp.HostBasicDTO host = 1;</code>
   */
  public boolean hasHost() {
    return host_ != null;
  }
  /**
   * <code>.com.xml2023.mainapp.HostBasicDTO host = 1;</code>
   */
  public com.xml2023.mainapp.HostBasicDTO getHost() {
    return host_ == null ? com.xml2023.mainapp.HostBasicDTO.getDefaultInstance() : host_;
  }
  /**
   * <code>.com.xml2023.mainapp.HostBasicDTO host = 1;</code>
   */
  public com.xml2023.mainapp.HostBasicDTOOrBuilder getHostOrBuilder() {
    return getHost();
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (host_ != null) {
      output.writeMessage(1, getHost());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (host_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getHost());
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.xml2023.mainapp.getHostResponse)) {
      return super.equals(obj);
    }
    com.xml2023.mainapp.getHostResponse other = (com.xml2023.mainapp.getHostResponse) obj;

    boolean result = true;
    result = result && (hasHost() == other.hasHost());
    if (hasHost()) {
      result = result && getHost()
          .equals(other.getHost());
    }
    result = result && unknownFields.equals(other.unknownFields);
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (hasHost()) {
      hash = (37 * hash) + HOST_FIELD_NUMBER;
      hash = (53 * hash) + getHost().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.xml2023.mainapp.getHostResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.xml2023.mainapp.getHostResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.xml2023.mainapp.getHostResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.xml2023.mainapp.getHostResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.xml2023.mainapp.getHostResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.xml2023.mainapp.getHostResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.xml2023.mainapp.getHostResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.xml2023.mainapp.getHostResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.xml2023.mainapp.getHostResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.xml2023.mainapp.getHostResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.xml2023.mainapp.getHostResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.xml2023.mainapp.getHostResponse parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.xml2023.mainapp.getHostResponse prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code com.xml2023.mainapp.getHostResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:com.xml2023.mainapp.getHostResponse)
      com.xml2023.mainapp.getHostResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.xml2023.mainapp.Temp.internal_static_com_xml2023_mainapp_getHostResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.xml2023.mainapp.Temp.internal_static_com_xml2023_mainapp_getHostResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.xml2023.mainapp.getHostResponse.class, com.xml2023.mainapp.getHostResponse.Builder.class);
    }

    // Construct using com.xml2023.mainapp.getHostResponse.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (hostBuilder_ == null) {
        host_ = null;
      } else {
        host_ = null;
        hostBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.xml2023.mainapp.Temp.internal_static_com_xml2023_mainapp_getHostResponse_descriptor;
    }

    @java.lang.Override
    public com.xml2023.mainapp.getHostResponse getDefaultInstanceForType() {
      return com.xml2023.mainapp.getHostResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.xml2023.mainapp.getHostResponse build() {
      com.xml2023.mainapp.getHostResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.xml2023.mainapp.getHostResponse buildPartial() {
      com.xml2023.mainapp.getHostResponse result = new com.xml2023.mainapp.getHostResponse(this);
      if (hostBuilder_ == null) {
        result.host_ = host_;
      } else {
        result.host_ = hostBuilder_.build();
      }
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return (Builder) super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.xml2023.mainapp.getHostResponse) {
        return mergeFrom((com.xml2023.mainapp.getHostResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.xml2023.mainapp.getHostResponse other) {
      if (other == com.xml2023.mainapp.getHostResponse.getDefaultInstance()) return this;
      if (other.hasHost()) {
        mergeHost(other.getHost());
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.xml2023.mainapp.getHostResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.xml2023.mainapp.getHostResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private com.xml2023.mainapp.HostBasicDTO host_ = null;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.xml2023.mainapp.HostBasicDTO, com.xml2023.mainapp.HostBasicDTO.Builder, com.xml2023.mainapp.HostBasicDTOOrBuilder> hostBuilder_;
    /**
     * <code>.com.xml2023.mainapp.HostBasicDTO host = 1;</code>
     */
    public boolean hasHost() {
      return hostBuilder_ != null || host_ != null;
    }
    /**
     * <code>.com.xml2023.mainapp.HostBasicDTO host = 1;</code>
     */
    public com.xml2023.mainapp.HostBasicDTO getHost() {
      if (hostBuilder_ == null) {
        return host_ == null ? com.xml2023.mainapp.HostBasicDTO.getDefaultInstance() : host_;
      } else {
        return hostBuilder_.getMessage();
      }
    }
    /**
     * <code>.com.xml2023.mainapp.HostBasicDTO host = 1;</code>
     */
    public Builder setHost(com.xml2023.mainapp.HostBasicDTO value) {
      if (hostBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        host_ = value;
        onChanged();
      } else {
        hostBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.com.xml2023.mainapp.HostBasicDTO host = 1;</code>
     */
    public Builder setHost(
        com.xml2023.mainapp.HostBasicDTO.Builder builderForValue) {
      if (hostBuilder_ == null) {
        host_ = builderForValue.build();
        onChanged();
      } else {
        hostBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.com.xml2023.mainapp.HostBasicDTO host = 1;</code>
     */
    public Builder mergeHost(com.xml2023.mainapp.HostBasicDTO value) {
      if (hostBuilder_ == null) {
        if (host_ != null) {
          host_ =
            com.xml2023.mainapp.HostBasicDTO.newBuilder(host_).mergeFrom(value).buildPartial();
        } else {
          host_ = value;
        }
        onChanged();
      } else {
        hostBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.com.xml2023.mainapp.HostBasicDTO host = 1;</code>
     */
    public Builder clearHost() {
      if (hostBuilder_ == null) {
        host_ = null;
        onChanged();
      } else {
        host_ = null;
        hostBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.com.xml2023.mainapp.HostBasicDTO host = 1;</code>
     */
    public com.xml2023.mainapp.HostBasicDTO.Builder getHostBuilder() {
      
      onChanged();
      return getHostFieldBuilder().getBuilder();
    }
    /**
     * <code>.com.xml2023.mainapp.HostBasicDTO host = 1;</code>
     */
    public com.xml2023.mainapp.HostBasicDTOOrBuilder getHostOrBuilder() {
      if (hostBuilder_ != null) {
        return hostBuilder_.getMessageOrBuilder();
      } else {
        return host_ == null ?
            com.xml2023.mainapp.HostBasicDTO.getDefaultInstance() : host_;
      }
    }
    /**
     * <code>.com.xml2023.mainapp.HostBasicDTO host = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.xml2023.mainapp.HostBasicDTO, com.xml2023.mainapp.HostBasicDTO.Builder, com.xml2023.mainapp.HostBasicDTOOrBuilder> 
        getHostFieldBuilder() {
      if (hostBuilder_ == null) {
        hostBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.xml2023.mainapp.HostBasicDTO, com.xml2023.mainapp.HostBasicDTO.Builder, com.xml2023.mainapp.HostBasicDTOOrBuilder>(
                getHost(),
                getParentForChildren(),
                isClean());
        host_ = null;
      }
      return hostBuilder_;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:com.xml2023.mainapp.getHostResponse)
  }

  // @@protoc_insertion_point(class_scope:com.xml2023.mainapp.getHostResponse)
  private static final com.xml2023.mainapp.getHostResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.xml2023.mainapp.getHostResponse();
  }

  public static com.xml2023.mainapp.getHostResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<getHostResponse>
      PARSER = new com.google.protobuf.AbstractParser<getHostResponse>() {
    @java.lang.Override
    public getHostResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new getHostResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<getHostResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<getHostResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.xml2023.mainapp.getHostResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

