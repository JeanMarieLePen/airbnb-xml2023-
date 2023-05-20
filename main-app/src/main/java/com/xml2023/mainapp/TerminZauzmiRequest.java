// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: temp.proto

package com.xml2023.mainapp;

/**
 * Protobuf type {@code com.xml2023.mainapp.TerminZauzmiRequest}
 */
public  final class TerminZauzmiRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:com.xml2023.mainapp.TerminZauzmiRequest)
    TerminZauzmiRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use TerminZauzmiRequest.newBuilder() to construct.
  private TerminZauzmiRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private TerminZauzmiRequest() {
    smestajId_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private TerminZauzmiRequest(
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
            java.lang.String s = input.readStringRequireUtf8();

            smestajId_ = s;
            break;
          }
          case 18: {
            com.xml2023.mainapp.TerminDTO.Builder subBuilder = null;
            if (termin_ != null) {
              subBuilder = termin_.toBuilder();
            }
            termin_ = input.readMessage(com.xml2023.mainapp.TerminDTO.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(termin_);
              termin_ = subBuilder.buildPartial();
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
    return com.xml2023.mainapp.Temp.internal_static_com_xml2023_mainapp_TerminZauzmiRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.xml2023.mainapp.Temp.internal_static_com_xml2023_mainapp_TerminZauzmiRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.xml2023.mainapp.TerminZauzmiRequest.class, com.xml2023.mainapp.TerminZauzmiRequest.Builder.class);
  }

  public static final int SMESTAJID_FIELD_NUMBER = 1;
  private volatile java.lang.Object smestajId_;
  /**
   * <code>string smestajId = 1;</code>
   */
  public java.lang.String getSmestajId() {
    java.lang.Object ref = smestajId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      smestajId_ = s;
      return s;
    }
  }
  /**
   * <code>string smestajId = 1;</code>
   */
  public com.google.protobuf.ByteString
      getSmestajIdBytes() {
    java.lang.Object ref = smestajId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      smestajId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int TERMIN_FIELD_NUMBER = 2;
  private com.xml2023.mainapp.TerminDTO termin_;
  /**
   * <code>.com.xml2023.mainapp.TerminDTO termin = 2;</code>
   */
  public boolean hasTermin() {
    return termin_ != null;
  }
  /**
   * <code>.com.xml2023.mainapp.TerminDTO termin = 2;</code>
   */
  public com.xml2023.mainapp.TerminDTO getTermin() {
    return termin_ == null ? com.xml2023.mainapp.TerminDTO.getDefaultInstance() : termin_;
  }
  /**
   * <code>.com.xml2023.mainapp.TerminDTO termin = 2;</code>
   */
  public com.xml2023.mainapp.TerminDTOOrBuilder getTerminOrBuilder() {
    return getTermin();
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
    if (!getSmestajIdBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, smestajId_);
    }
    if (termin_ != null) {
      output.writeMessage(2, getTermin());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getSmestajIdBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, smestajId_);
    }
    if (termin_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getTermin());
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
    if (!(obj instanceof com.xml2023.mainapp.TerminZauzmiRequest)) {
      return super.equals(obj);
    }
    com.xml2023.mainapp.TerminZauzmiRequest other = (com.xml2023.mainapp.TerminZauzmiRequest) obj;

    boolean result = true;
    result = result && getSmestajId()
        .equals(other.getSmestajId());
    result = result && (hasTermin() == other.hasTermin());
    if (hasTermin()) {
      result = result && getTermin()
          .equals(other.getTermin());
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
    hash = (37 * hash) + SMESTAJID_FIELD_NUMBER;
    hash = (53 * hash) + getSmestajId().hashCode();
    if (hasTermin()) {
      hash = (37 * hash) + TERMIN_FIELD_NUMBER;
      hash = (53 * hash) + getTermin().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.xml2023.mainapp.TerminZauzmiRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.xml2023.mainapp.TerminZauzmiRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.xml2023.mainapp.TerminZauzmiRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.xml2023.mainapp.TerminZauzmiRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.xml2023.mainapp.TerminZauzmiRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.xml2023.mainapp.TerminZauzmiRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.xml2023.mainapp.TerminZauzmiRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.xml2023.mainapp.TerminZauzmiRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.xml2023.mainapp.TerminZauzmiRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.xml2023.mainapp.TerminZauzmiRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.xml2023.mainapp.TerminZauzmiRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.xml2023.mainapp.TerminZauzmiRequest parseFrom(
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
  public static Builder newBuilder(com.xml2023.mainapp.TerminZauzmiRequest prototype) {
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
   * Protobuf type {@code com.xml2023.mainapp.TerminZauzmiRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:com.xml2023.mainapp.TerminZauzmiRequest)
      com.xml2023.mainapp.TerminZauzmiRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.xml2023.mainapp.Temp.internal_static_com_xml2023_mainapp_TerminZauzmiRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.xml2023.mainapp.Temp.internal_static_com_xml2023_mainapp_TerminZauzmiRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.xml2023.mainapp.TerminZauzmiRequest.class, com.xml2023.mainapp.TerminZauzmiRequest.Builder.class);
    }

    // Construct using com.xml2023.mainapp.TerminZauzmiRequest.newBuilder()
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
      smestajId_ = "";

      if (terminBuilder_ == null) {
        termin_ = null;
      } else {
        termin_ = null;
        terminBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.xml2023.mainapp.Temp.internal_static_com_xml2023_mainapp_TerminZauzmiRequest_descriptor;
    }

    @java.lang.Override
    public com.xml2023.mainapp.TerminZauzmiRequest getDefaultInstanceForType() {
      return com.xml2023.mainapp.TerminZauzmiRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.xml2023.mainapp.TerminZauzmiRequest build() {
      com.xml2023.mainapp.TerminZauzmiRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.xml2023.mainapp.TerminZauzmiRequest buildPartial() {
      com.xml2023.mainapp.TerminZauzmiRequest result = new com.xml2023.mainapp.TerminZauzmiRequest(this);
      result.smestajId_ = smestajId_;
      if (terminBuilder_ == null) {
        result.termin_ = termin_;
      } else {
        result.termin_ = terminBuilder_.build();
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
      if (other instanceof com.xml2023.mainapp.TerminZauzmiRequest) {
        return mergeFrom((com.xml2023.mainapp.TerminZauzmiRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.xml2023.mainapp.TerminZauzmiRequest other) {
      if (other == com.xml2023.mainapp.TerminZauzmiRequest.getDefaultInstance()) return this;
      if (!other.getSmestajId().isEmpty()) {
        smestajId_ = other.smestajId_;
        onChanged();
      }
      if (other.hasTermin()) {
        mergeTermin(other.getTermin());
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
      com.xml2023.mainapp.TerminZauzmiRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.xml2023.mainapp.TerminZauzmiRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object smestajId_ = "";
    /**
     * <code>string smestajId = 1;</code>
     */
    public java.lang.String getSmestajId() {
      java.lang.Object ref = smestajId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        smestajId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string smestajId = 1;</code>
     */
    public com.google.protobuf.ByteString
        getSmestajIdBytes() {
      java.lang.Object ref = smestajId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        smestajId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string smestajId = 1;</code>
     */
    public Builder setSmestajId(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      smestajId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string smestajId = 1;</code>
     */
    public Builder clearSmestajId() {
      
      smestajId_ = getDefaultInstance().getSmestajId();
      onChanged();
      return this;
    }
    /**
     * <code>string smestajId = 1;</code>
     */
    public Builder setSmestajIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      smestajId_ = value;
      onChanged();
      return this;
    }

    private com.xml2023.mainapp.TerminDTO termin_ = null;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.xml2023.mainapp.TerminDTO, com.xml2023.mainapp.TerminDTO.Builder, com.xml2023.mainapp.TerminDTOOrBuilder> terminBuilder_;
    /**
     * <code>.com.xml2023.mainapp.TerminDTO termin = 2;</code>
     */
    public boolean hasTermin() {
      return terminBuilder_ != null || termin_ != null;
    }
    /**
     * <code>.com.xml2023.mainapp.TerminDTO termin = 2;</code>
     */
    public com.xml2023.mainapp.TerminDTO getTermin() {
      if (terminBuilder_ == null) {
        return termin_ == null ? com.xml2023.mainapp.TerminDTO.getDefaultInstance() : termin_;
      } else {
        return terminBuilder_.getMessage();
      }
    }
    /**
     * <code>.com.xml2023.mainapp.TerminDTO termin = 2;</code>
     */
    public Builder setTermin(com.xml2023.mainapp.TerminDTO value) {
      if (terminBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        termin_ = value;
        onChanged();
      } else {
        terminBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.com.xml2023.mainapp.TerminDTO termin = 2;</code>
     */
    public Builder setTermin(
        com.xml2023.mainapp.TerminDTO.Builder builderForValue) {
      if (terminBuilder_ == null) {
        termin_ = builderForValue.build();
        onChanged();
      } else {
        terminBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.com.xml2023.mainapp.TerminDTO termin = 2;</code>
     */
    public Builder mergeTermin(com.xml2023.mainapp.TerminDTO value) {
      if (terminBuilder_ == null) {
        if (termin_ != null) {
          termin_ =
            com.xml2023.mainapp.TerminDTO.newBuilder(termin_).mergeFrom(value).buildPartial();
        } else {
          termin_ = value;
        }
        onChanged();
      } else {
        terminBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.com.xml2023.mainapp.TerminDTO termin = 2;</code>
     */
    public Builder clearTermin() {
      if (terminBuilder_ == null) {
        termin_ = null;
        onChanged();
      } else {
        termin_ = null;
        terminBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.com.xml2023.mainapp.TerminDTO termin = 2;</code>
     */
    public com.xml2023.mainapp.TerminDTO.Builder getTerminBuilder() {
      
      onChanged();
      return getTerminFieldBuilder().getBuilder();
    }
    /**
     * <code>.com.xml2023.mainapp.TerminDTO termin = 2;</code>
     */
    public com.xml2023.mainapp.TerminDTOOrBuilder getTerminOrBuilder() {
      if (terminBuilder_ != null) {
        return terminBuilder_.getMessageOrBuilder();
      } else {
        return termin_ == null ?
            com.xml2023.mainapp.TerminDTO.getDefaultInstance() : termin_;
      }
    }
    /**
     * <code>.com.xml2023.mainapp.TerminDTO termin = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.xml2023.mainapp.TerminDTO, com.xml2023.mainapp.TerminDTO.Builder, com.xml2023.mainapp.TerminDTOOrBuilder> 
        getTerminFieldBuilder() {
      if (terminBuilder_ == null) {
        terminBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.xml2023.mainapp.TerminDTO, com.xml2023.mainapp.TerminDTO.Builder, com.xml2023.mainapp.TerminDTOOrBuilder>(
                getTermin(),
                getParentForChildren(),
                isClean());
        termin_ = null;
      }
      return terminBuilder_;
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


    // @@protoc_insertion_point(builder_scope:com.xml2023.mainapp.TerminZauzmiRequest)
  }

  // @@protoc_insertion_point(class_scope:com.xml2023.mainapp.TerminZauzmiRequest)
  private static final com.xml2023.mainapp.TerminZauzmiRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.xml2023.mainapp.TerminZauzmiRequest();
  }

  public static com.xml2023.mainapp.TerminZauzmiRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<TerminZauzmiRequest>
      PARSER = new com.google.protobuf.AbstractParser<TerminZauzmiRequest>() {
    @java.lang.Override
    public TerminZauzmiRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new TerminZauzmiRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<TerminZauzmiRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<TerminZauzmiRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.xml2023.mainapp.TerminZauzmiRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

