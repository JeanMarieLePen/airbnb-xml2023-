// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: temp.proto

package com.xml2023.mainapp;

/**
 * Protobuf type {@code com.xml2023.mainapp.getOceneBySmestajIdResponse}
 */
public  final class getOceneBySmestajIdResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:com.xml2023.mainapp.getOceneBySmestajIdResponse)
    getOceneBySmestajIdResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use getOceneBySmestajIdResponse.newBuilder() to construct.
  private getOceneBySmestajIdResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private getOceneBySmestajIdResponse() {
    ocene_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private getOceneBySmestajIdResponse(
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
            if (!((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
              ocene_ = new java.util.ArrayList<com.xml2023.mainapp.OcenaSmestajDTO>();
              mutable_bitField0_ |= 0x00000001;
            }
            ocene_.add(
                input.readMessage(com.xml2023.mainapp.OcenaSmestajDTO.parser(), extensionRegistry));
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
      if (((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
        ocene_ = java.util.Collections.unmodifiableList(ocene_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.xml2023.mainapp.Temp.internal_static_com_xml2023_mainapp_getOceneBySmestajIdResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.xml2023.mainapp.Temp.internal_static_com_xml2023_mainapp_getOceneBySmestajIdResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.xml2023.mainapp.getOceneBySmestajIdResponse.class, com.xml2023.mainapp.getOceneBySmestajIdResponse.Builder.class);
  }

  public static final int OCENE_FIELD_NUMBER = 1;
  private java.util.List<com.xml2023.mainapp.OcenaSmestajDTO> ocene_;
  /**
   * <code>repeated .com.xml2023.mainapp.OcenaSmestajDTO ocene = 1;</code>
   */
  public java.util.List<com.xml2023.mainapp.OcenaSmestajDTO> getOceneList() {
    return ocene_;
  }
  /**
   * <code>repeated .com.xml2023.mainapp.OcenaSmestajDTO ocene = 1;</code>
   */
  public java.util.List<? extends com.xml2023.mainapp.OcenaSmestajDTOOrBuilder> 
      getOceneOrBuilderList() {
    return ocene_;
  }
  /**
   * <code>repeated .com.xml2023.mainapp.OcenaSmestajDTO ocene = 1;</code>
   */
  public int getOceneCount() {
    return ocene_.size();
  }
  /**
   * <code>repeated .com.xml2023.mainapp.OcenaSmestajDTO ocene = 1;</code>
   */
  public com.xml2023.mainapp.OcenaSmestajDTO getOcene(int index) {
    return ocene_.get(index);
  }
  /**
   * <code>repeated .com.xml2023.mainapp.OcenaSmestajDTO ocene = 1;</code>
   */
  public com.xml2023.mainapp.OcenaSmestajDTOOrBuilder getOceneOrBuilder(
      int index) {
    return ocene_.get(index);
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
    for (int i = 0; i < ocene_.size(); i++) {
      output.writeMessage(1, ocene_.get(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < ocene_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, ocene_.get(i));
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
    if (!(obj instanceof com.xml2023.mainapp.getOceneBySmestajIdResponse)) {
      return super.equals(obj);
    }
    com.xml2023.mainapp.getOceneBySmestajIdResponse other = (com.xml2023.mainapp.getOceneBySmestajIdResponse) obj;

    boolean result = true;
    result = result && getOceneList()
        .equals(other.getOceneList());
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
    if (getOceneCount() > 0) {
      hash = (37 * hash) + OCENE_FIELD_NUMBER;
      hash = (53 * hash) + getOceneList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.xml2023.mainapp.getOceneBySmestajIdResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.xml2023.mainapp.getOceneBySmestajIdResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.xml2023.mainapp.getOceneBySmestajIdResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.xml2023.mainapp.getOceneBySmestajIdResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.xml2023.mainapp.getOceneBySmestajIdResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.xml2023.mainapp.getOceneBySmestajIdResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.xml2023.mainapp.getOceneBySmestajIdResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.xml2023.mainapp.getOceneBySmestajIdResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.xml2023.mainapp.getOceneBySmestajIdResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.xml2023.mainapp.getOceneBySmestajIdResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.xml2023.mainapp.getOceneBySmestajIdResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.xml2023.mainapp.getOceneBySmestajIdResponse parseFrom(
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
  public static Builder newBuilder(com.xml2023.mainapp.getOceneBySmestajIdResponse prototype) {
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
   * Protobuf type {@code com.xml2023.mainapp.getOceneBySmestajIdResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:com.xml2023.mainapp.getOceneBySmestajIdResponse)
      com.xml2023.mainapp.getOceneBySmestajIdResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.xml2023.mainapp.Temp.internal_static_com_xml2023_mainapp_getOceneBySmestajIdResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.xml2023.mainapp.Temp.internal_static_com_xml2023_mainapp_getOceneBySmestajIdResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.xml2023.mainapp.getOceneBySmestajIdResponse.class, com.xml2023.mainapp.getOceneBySmestajIdResponse.Builder.class);
    }

    // Construct using com.xml2023.mainapp.getOceneBySmestajIdResponse.newBuilder()
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
        getOceneFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (oceneBuilder_ == null) {
        ocene_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        oceneBuilder_.clear();
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.xml2023.mainapp.Temp.internal_static_com_xml2023_mainapp_getOceneBySmestajIdResponse_descriptor;
    }

    @java.lang.Override
    public com.xml2023.mainapp.getOceneBySmestajIdResponse getDefaultInstanceForType() {
      return com.xml2023.mainapp.getOceneBySmestajIdResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.xml2023.mainapp.getOceneBySmestajIdResponse build() {
      com.xml2023.mainapp.getOceneBySmestajIdResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.xml2023.mainapp.getOceneBySmestajIdResponse buildPartial() {
      com.xml2023.mainapp.getOceneBySmestajIdResponse result = new com.xml2023.mainapp.getOceneBySmestajIdResponse(this);
      int from_bitField0_ = bitField0_;
      if (oceneBuilder_ == null) {
        if (((bitField0_ & 0x00000001) == 0x00000001)) {
          ocene_ = java.util.Collections.unmodifiableList(ocene_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.ocene_ = ocene_;
      } else {
        result.ocene_ = oceneBuilder_.build();
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
      if (other instanceof com.xml2023.mainapp.getOceneBySmestajIdResponse) {
        return mergeFrom((com.xml2023.mainapp.getOceneBySmestajIdResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.xml2023.mainapp.getOceneBySmestajIdResponse other) {
      if (other == com.xml2023.mainapp.getOceneBySmestajIdResponse.getDefaultInstance()) return this;
      if (oceneBuilder_ == null) {
        if (!other.ocene_.isEmpty()) {
          if (ocene_.isEmpty()) {
            ocene_ = other.ocene_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureOceneIsMutable();
            ocene_.addAll(other.ocene_);
          }
          onChanged();
        }
      } else {
        if (!other.ocene_.isEmpty()) {
          if (oceneBuilder_.isEmpty()) {
            oceneBuilder_.dispose();
            oceneBuilder_ = null;
            ocene_ = other.ocene_;
            bitField0_ = (bitField0_ & ~0x00000001);
            oceneBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getOceneFieldBuilder() : null;
          } else {
            oceneBuilder_.addAllMessages(other.ocene_);
          }
        }
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
      com.xml2023.mainapp.getOceneBySmestajIdResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.xml2023.mainapp.getOceneBySmestajIdResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.util.List<com.xml2023.mainapp.OcenaSmestajDTO> ocene_ =
      java.util.Collections.emptyList();
    private void ensureOceneIsMutable() {
      if (!((bitField0_ & 0x00000001) == 0x00000001)) {
        ocene_ = new java.util.ArrayList<com.xml2023.mainapp.OcenaSmestajDTO>(ocene_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.xml2023.mainapp.OcenaSmestajDTO, com.xml2023.mainapp.OcenaSmestajDTO.Builder, com.xml2023.mainapp.OcenaSmestajDTOOrBuilder> oceneBuilder_;

    /**
     * <code>repeated .com.xml2023.mainapp.OcenaSmestajDTO ocene = 1;</code>
     */
    public java.util.List<com.xml2023.mainapp.OcenaSmestajDTO> getOceneList() {
      if (oceneBuilder_ == null) {
        return java.util.Collections.unmodifiableList(ocene_);
      } else {
        return oceneBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .com.xml2023.mainapp.OcenaSmestajDTO ocene = 1;</code>
     */
    public int getOceneCount() {
      if (oceneBuilder_ == null) {
        return ocene_.size();
      } else {
        return oceneBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .com.xml2023.mainapp.OcenaSmestajDTO ocene = 1;</code>
     */
    public com.xml2023.mainapp.OcenaSmestajDTO getOcene(int index) {
      if (oceneBuilder_ == null) {
        return ocene_.get(index);
      } else {
        return oceneBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .com.xml2023.mainapp.OcenaSmestajDTO ocene = 1;</code>
     */
    public Builder setOcene(
        int index, com.xml2023.mainapp.OcenaSmestajDTO value) {
      if (oceneBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureOceneIsMutable();
        ocene_.set(index, value);
        onChanged();
      } else {
        oceneBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .com.xml2023.mainapp.OcenaSmestajDTO ocene = 1;</code>
     */
    public Builder setOcene(
        int index, com.xml2023.mainapp.OcenaSmestajDTO.Builder builderForValue) {
      if (oceneBuilder_ == null) {
        ensureOceneIsMutable();
        ocene_.set(index, builderForValue.build());
        onChanged();
      } else {
        oceneBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .com.xml2023.mainapp.OcenaSmestajDTO ocene = 1;</code>
     */
    public Builder addOcene(com.xml2023.mainapp.OcenaSmestajDTO value) {
      if (oceneBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureOceneIsMutable();
        ocene_.add(value);
        onChanged();
      } else {
        oceneBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .com.xml2023.mainapp.OcenaSmestajDTO ocene = 1;</code>
     */
    public Builder addOcene(
        int index, com.xml2023.mainapp.OcenaSmestajDTO value) {
      if (oceneBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureOceneIsMutable();
        ocene_.add(index, value);
        onChanged();
      } else {
        oceneBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .com.xml2023.mainapp.OcenaSmestajDTO ocene = 1;</code>
     */
    public Builder addOcene(
        com.xml2023.mainapp.OcenaSmestajDTO.Builder builderForValue) {
      if (oceneBuilder_ == null) {
        ensureOceneIsMutable();
        ocene_.add(builderForValue.build());
        onChanged();
      } else {
        oceneBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .com.xml2023.mainapp.OcenaSmestajDTO ocene = 1;</code>
     */
    public Builder addOcene(
        int index, com.xml2023.mainapp.OcenaSmestajDTO.Builder builderForValue) {
      if (oceneBuilder_ == null) {
        ensureOceneIsMutable();
        ocene_.add(index, builderForValue.build());
        onChanged();
      } else {
        oceneBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .com.xml2023.mainapp.OcenaSmestajDTO ocene = 1;</code>
     */
    public Builder addAllOcene(
        java.lang.Iterable<? extends com.xml2023.mainapp.OcenaSmestajDTO> values) {
      if (oceneBuilder_ == null) {
        ensureOceneIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, ocene_);
        onChanged();
      } else {
        oceneBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .com.xml2023.mainapp.OcenaSmestajDTO ocene = 1;</code>
     */
    public Builder clearOcene() {
      if (oceneBuilder_ == null) {
        ocene_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        oceneBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .com.xml2023.mainapp.OcenaSmestajDTO ocene = 1;</code>
     */
    public Builder removeOcene(int index) {
      if (oceneBuilder_ == null) {
        ensureOceneIsMutable();
        ocene_.remove(index);
        onChanged();
      } else {
        oceneBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .com.xml2023.mainapp.OcenaSmestajDTO ocene = 1;</code>
     */
    public com.xml2023.mainapp.OcenaSmestajDTO.Builder getOceneBuilder(
        int index) {
      return getOceneFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .com.xml2023.mainapp.OcenaSmestajDTO ocene = 1;</code>
     */
    public com.xml2023.mainapp.OcenaSmestajDTOOrBuilder getOceneOrBuilder(
        int index) {
      if (oceneBuilder_ == null) {
        return ocene_.get(index);  } else {
        return oceneBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .com.xml2023.mainapp.OcenaSmestajDTO ocene = 1;</code>
     */
    public java.util.List<? extends com.xml2023.mainapp.OcenaSmestajDTOOrBuilder> 
         getOceneOrBuilderList() {
      if (oceneBuilder_ != null) {
        return oceneBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(ocene_);
      }
    }
    /**
     * <code>repeated .com.xml2023.mainapp.OcenaSmestajDTO ocene = 1;</code>
     */
    public com.xml2023.mainapp.OcenaSmestajDTO.Builder addOceneBuilder() {
      return getOceneFieldBuilder().addBuilder(
          com.xml2023.mainapp.OcenaSmestajDTO.getDefaultInstance());
    }
    /**
     * <code>repeated .com.xml2023.mainapp.OcenaSmestajDTO ocene = 1;</code>
     */
    public com.xml2023.mainapp.OcenaSmestajDTO.Builder addOceneBuilder(
        int index) {
      return getOceneFieldBuilder().addBuilder(
          index, com.xml2023.mainapp.OcenaSmestajDTO.getDefaultInstance());
    }
    /**
     * <code>repeated .com.xml2023.mainapp.OcenaSmestajDTO ocene = 1;</code>
     */
    public java.util.List<com.xml2023.mainapp.OcenaSmestajDTO.Builder> 
         getOceneBuilderList() {
      return getOceneFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.xml2023.mainapp.OcenaSmestajDTO, com.xml2023.mainapp.OcenaSmestajDTO.Builder, com.xml2023.mainapp.OcenaSmestajDTOOrBuilder> 
        getOceneFieldBuilder() {
      if (oceneBuilder_ == null) {
        oceneBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.xml2023.mainapp.OcenaSmestajDTO, com.xml2023.mainapp.OcenaSmestajDTO.Builder, com.xml2023.mainapp.OcenaSmestajDTOOrBuilder>(
                ocene_,
                ((bitField0_ & 0x00000001) == 0x00000001),
                getParentForChildren(),
                isClean());
        ocene_ = null;
      }
      return oceneBuilder_;
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


    // @@protoc_insertion_point(builder_scope:com.xml2023.mainapp.getOceneBySmestajIdResponse)
  }

  // @@protoc_insertion_point(class_scope:com.xml2023.mainapp.getOceneBySmestajIdResponse)
  private static final com.xml2023.mainapp.getOceneBySmestajIdResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.xml2023.mainapp.getOceneBySmestajIdResponse();
  }

  public static com.xml2023.mainapp.getOceneBySmestajIdResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<getOceneBySmestajIdResponse>
      PARSER = new com.google.protobuf.AbstractParser<getOceneBySmestajIdResponse>() {
    @java.lang.Override
    public getOceneBySmestajIdResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new getOceneBySmestajIdResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<getOceneBySmestajIdResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<getOceneBySmestajIdResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.xml2023.mainapp.getOceneBySmestajIdResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

