// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: BonusActivityInfoRsp.proto

package emu.grasscutter.net.proto;

public final class BonusActivityInfoRspOuterClass {
  private BonusActivityInfoRspOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface BonusActivityInfoRspOrBuilder extends
      // @@protoc_insertion_point(interface_extends:BonusActivityInfoRsp)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>repeated .BonusActivityInfo bonus_activity_info_list = 1;</code>
     */
    java.util.List<emu.grasscutter.net.proto.BonusActivityInfoOuterClass.BonusActivityInfo> 
        getBonusActivityInfoListList();
    /**
     * <code>repeated .BonusActivityInfo bonus_activity_info_list = 1;</code>
     */
    emu.grasscutter.net.proto.BonusActivityInfoOuterClass.BonusActivityInfo getBonusActivityInfoList(int index);
    /**
     * <code>repeated .BonusActivityInfo bonus_activity_info_list = 1;</code>
     */
    int getBonusActivityInfoListCount();
    /**
     * <code>repeated .BonusActivityInfo bonus_activity_info_list = 1;</code>
     */
    java.util.List<? extends emu.grasscutter.net.proto.BonusActivityInfoOuterClass.BonusActivityInfoOrBuilder> 
        getBonusActivityInfoListOrBuilderList();
    /**
     * <code>repeated .BonusActivityInfo bonus_activity_info_list = 1;</code>
     */
    emu.grasscutter.net.proto.BonusActivityInfoOuterClass.BonusActivityInfoOrBuilder getBonusActivityInfoListOrBuilder(
        int index);

    /**
     * <code>int32 retcode = 7;</code>
     * @return The retcode.
     */
    int getRetcode();
  }
  /**
   * <pre>
   * CmdId: 2565
   * Name: JLPCIJCCNOI
   * </pre>
   *
   * Protobuf type {@code BonusActivityInfoRsp}
   */
  public static final class BonusActivityInfoRsp extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:BonusActivityInfoRsp)
      BonusActivityInfoRspOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use BonusActivityInfoRsp.newBuilder() to construct.
    private BonusActivityInfoRsp(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private BonusActivityInfoRsp() {
      bonusActivityInfoList_ = java.util.Collections.emptyList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new BonusActivityInfoRsp();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private BonusActivityInfoRsp(
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
              if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                bonusActivityInfoList_ = new java.util.ArrayList<emu.grasscutter.net.proto.BonusActivityInfoOuterClass.BonusActivityInfo>();
                mutable_bitField0_ |= 0x00000001;
              }
              bonusActivityInfoList_.add(
                  input.readMessage(emu.grasscutter.net.proto.BonusActivityInfoOuterClass.BonusActivityInfo.parser(), extensionRegistry));
              break;
            }
            case 56: {

              retcode_ = input.readInt32();
              break;
            }
            default: {
              if (!parseUnknownField(
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
        if (((mutable_bitField0_ & 0x00000001) != 0)) {
          bonusActivityInfoList_ = java.util.Collections.unmodifiableList(bonusActivityInfoList_);
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.BonusActivityInfoRspOuterClass.internal_static_BonusActivityInfoRsp_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.BonusActivityInfoRspOuterClass.internal_static_BonusActivityInfoRsp_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.BonusActivityInfoRspOuterClass.BonusActivityInfoRsp.class, emu.grasscutter.net.proto.BonusActivityInfoRspOuterClass.BonusActivityInfoRsp.Builder.class);
    }

    public static final int BONUS_ACTIVITY_INFO_LIST_FIELD_NUMBER = 1;
    private java.util.List<emu.grasscutter.net.proto.BonusActivityInfoOuterClass.BonusActivityInfo> bonusActivityInfoList_;
    /**
     * <code>repeated .BonusActivityInfo bonus_activity_info_list = 1;</code>
     */
    @java.lang.Override
    public java.util.List<emu.grasscutter.net.proto.BonusActivityInfoOuterClass.BonusActivityInfo> getBonusActivityInfoListList() {
      return bonusActivityInfoList_;
    }
    /**
     * <code>repeated .BonusActivityInfo bonus_activity_info_list = 1;</code>
     */
    @java.lang.Override
    public java.util.List<? extends emu.grasscutter.net.proto.BonusActivityInfoOuterClass.BonusActivityInfoOrBuilder> 
        getBonusActivityInfoListOrBuilderList() {
      return bonusActivityInfoList_;
    }
    /**
     * <code>repeated .BonusActivityInfo bonus_activity_info_list = 1;</code>
     */
    @java.lang.Override
    public int getBonusActivityInfoListCount() {
      return bonusActivityInfoList_.size();
    }
    /**
     * <code>repeated .BonusActivityInfo bonus_activity_info_list = 1;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.BonusActivityInfoOuterClass.BonusActivityInfo getBonusActivityInfoList(int index) {
      return bonusActivityInfoList_.get(index);
    }
    /**
     * <code>repeated .BonusActivityInfo bonus_activity_info_list = 1;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.BonusActivityInfoOuterClass.BonusActivityInfoOrBuilder getBonusActivityInfoListOrBuilder(
        int index) {
      return bonusActivityInfoList_.get(index);
    }

    public static final int RETCODE_FIELD_NUMBER = 7;
    private int retcode_;
    /**
     * <code>int32 retcode = 7;</code>
     * @return The retcode.
     */
    @java.lang.Override
    public int getRetcode() {
      return retcode_;
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
      for (int i = 0; i < bonusActivityInfoList_.size(); i++) {
        output.writeMessage(1, bonusActivityInfoList_.get(i));
      }
      if (retcode_ != 0) {
        output.writeInt32(7, retcode_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      for (int i = 0; i < bonusActivityInfoList_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(1, bonusActivityInfoList_.get(i));
      }
      if (retcode_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(7, retcode_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.BonusActivityInfoRspOuterClass.BonusActivityInfoRsp)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.BonusActivityInfoRspOuterClass.BonusActivityInfoRsp other = (emu.grasscutter.net.proto.BonusActivityInfoRspOuterClass.BonusActivityInfoRsp) obj;

      if (!getBonusActivityInfoListList()
          .equals(other.getBonusActivityInfoListList())) return false;
      if (getRetcode()
          != other.getRetcode()) return false;
      if (!unknownFields.equals(other.unknownFields)) return false;
      return true;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      if (getBonusActivityInfoListCount() > 0) {
        hash = (37 * hash) + BONUS_ACTIVITY_INFO_LIST_FIELD_NUMBER;
        hash = (53 * hash) + getBonusActivityInfoListList().hashCode();
      }
      hash = (37 * hash) + RETCODE_FIELD_NUMBER;
      hash = (53 * hash) + getRetcode();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.BonusActivityInfoRspOuterClass.BonusActivityInfoRsp parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.BonusActivityInfoRspOuterClass.BonusActivityInfoRsp parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.BonusActivityInfoRspOuterClass.BonusActivityInfoRsp parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.BonusActivityInfoRspOuterClass.BonusActivityInfoRsp parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.BonusActivityInfoRspOuterClass.BonusActivityInfoRsp parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.BonusActivityInfoRspOuterClass.BonusActivityInfoRsp parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.BonusActivityInfoRspOuterClass.BonusActivityInfoRsp parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.BonusActivityInfoRspOuterClass.BonusActivityInfoRsp parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.BonusActivityInfoRspOuterClass.BonusActivityInfoRsp parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.BonusActivityInfoRspOuterClass.BonusActivityInfoRsp parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.BonusActivityInfoRspOuterClass.BonusActivityInfoRsp parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.BonusActivityInfoRspOuterClass.BonusActivityInfoRsp parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.BonusActivityInfoRspOuterClass.BonusActivityInfoRsp prototype) {
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
     * <pre>
     * CmdId: 2565
     * Name: JLPCIJCCNOI
     * </pre>
     *
     * Protobuf type {@code BonusActivityInfoRsp}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:BonusActivityInfoRsp)
        emu.grasscutter.net.proto.BonusActivityInfoRspOuterClass.BonusActivityInfoRspOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.BonusActivityInfoRspOuterClass.internal_static_BonusActivityInfoRsp_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.BonusActivityInfoRspOuterClass.internal_static_BonusActivityInfoRsp_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.BonusActivityInfoRspOuterClass.BonusActivityInfoRsp.class, emu.grasscutter.net.proto.BonusActivityInfoRspOuterClass.BonusActivityInfoRsp.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.BonusActivityInfoRspOuterClass.BonusActivityInfoRsp.newBuilder()
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
          getBonusActivityInfoListFieldBuilder();
        }
      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        if (bonusActivityInfoListBuilder_ == null) {
          bonusActivityInfoList_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          bonusActivityInfoListBuilder_.clear();
        }
        retcode_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.BonusActivityInfoRspOuterClass.internal_static_BonusActivityInfoRsp_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.BonusActivityInfoRspOuterClass.BonusActivityInfoRsp getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.BonusActivityInfoRspOuterClass.BonusActivityInfoRsp.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.BonusActivityInfoRspOuterClass.BonusActivityInfoRsp build() {
        emu.grasscutter.net.proto.BonusActivityInfoRspOuterClass.BonusActivityInfoRsp result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.BonusActivityInfoRspOuterClass.BonusActivityInfoRsp buildPartial() {
        emu.grasscutter.net.proto.BonusActivityInfoRspOuterClass.BonusActivityInfoRsp result = new emu.grasscutter.net.proto.BonusActivityInfoRspOuterClass.BonusActivityInfoRsp(this);
        int from_bitField0_ = bitField0_;
        if (bonusActivityInfoListBuilder_ == null) {
          if (((bitField0_ & 0x00000001) != 0)) {
            bonusActivityInfoList_ = java.util.Collections.unmodifiableList(bonusActivityInfoList_);
            bitField0_ = (bitField0_ & ~0x00000001);
          }
          result.bonusActivityInfoList_ = bonusActivityInfoList_;
        } else {
          result.bonusActivityInfoList_ = bonusActivityInfoListBuilder_.build();
        }
        result.retcode_ = retcode_;
        onBuilt();
        return result;
      }

      @java.lang.Override
      public Builder clone() {
        return super.clone();
      }
      @java.lang.Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.setField(field, value);
      }
      @java.lang.Override
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return super.clearField(field);
      }
      @java.lang.Override
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return super.clearOneof(oneof);
      }
      @java.lang.Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, java.lang.Object value) {
        return super.setRepeatedField(field, index, value);
      }
      @java.lang.Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.addRepeatedField(field, value);
      }
      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof emu.grasscutter.net.proto.BonusActivityInfoRspOuterClass.BonusActivityInfoRsp) {
          return mergeFrom((emu.grasscutter.net.proto.BonusActivityInfoRspOuterClass.BonusActivityInfoRsp)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.BonusActivityInfoRspOuterClass.BonusActivityInfoRsp other) {
        if (other == emu.grasscutter.net.proto.BonusActivityInfoRspOuterClass.BonusActivityInfoRsp.getDefaultInstance()) return this;
        if (bonusActivityInfoListBuilder_ == null) {
          if (!other.bonusActivityInfoList_.isEmpty()) {
            if (bonusActivityInfoList_.isEmpty()) {
              bonusActivityInfoList_ = other.bonusActivityInfoList_;
              bitField0_ = (bitField0_ & ~0x00000001);
            } else {
              ensureBonusActivityInfoListIsMutable();
              bonusActivityInfoList_.addAll(other.bonusActivityInfoList_);
            }
            onChanged();
          }
        } else {
          if (!other.bonusActivityInfoList_.isEmpty()) {
            if (bonusActivityInfoListBuilder_.isEmpty()) {
              bonusActivityInfoListBuilder_.dispose();
              bonusActivityInfoListBuilder_ = null;
              bonusActivityInfoList_ = other.bonusActivityInfoList_;
              bitField0_ = (bitField0_ & ~0x00000001);
              bonusActivityInfoListBuilder_ = 
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                   getBonusActivityInfoListFieldBuilder() : null;
            } else {
              bonusActivityInfoListBuilder_.addAllMessages(other.bonusActivityInfoList_);
            }
          }
        }
        if (other.getRetcode() != 0) {
          setRetcode(other.getRetcode());
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
        emu.grasscutter.net.proto.BonusActivityInfoRspOuterClass.BonusActivityInfoRsp parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.BonusActivityInfoRspOuterClass.BonusActivityInfoRsp) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private java.util.List<emu.grasscutter.net.proto.BonusActivityInfoOuterClass.BonusActivityInfo> bonusActivityInfoList_ =
        java.util.Collections.emptyList();
      private void ensureBonusActivityInfoListIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          bonusActivityInfoList_ = new java.util.ArrayList<emu.grasscutter.net.proto.BonusActivityInfoOuterClass.BonusActivityInfo>(bonusActivityInfoList_);
          bitField0_ |= 0x00000001;
         }
      }

      private com.google.protobuf.RepeatedFieldBuilderV3<
          emu.grasscutter.net.proto.BonusActivityInfoOuterClass.BonusActivityInfo, emu.grasscutter.net.proto.BonusActivityInfoOuterClass.BonusActivityInfo.Builder, emu.grasscutter.net.proto.BonusActivityInfoOuterClass.BonusActivityInfoOrBuilder> bonusActivityInfoListBuilder_;

      /**
       * <code>repeated .BonusActivityInfo bonus_activity_info_list = 1;</code>
       */
      public java.util.List<emu.grasscutter.net.proto.BonusActivityInfoOuterClass.BonusActivityInfo> getBonusActivityInfoListList() {
        if (bonusActivityInfoListBuilder_ == null) {
          return java.util.Collections.unmodifiableList(bonusActivityInfoList_);
        } else {
          return bonusActivityInfoListBuilder_.getMessageList();
        }
      }
      /**
       * <code>repeated .BonusActivityInfo bonus_activity_info_list = 1;</code>
       */
      public int getBonusActivityInfoListCount() {
        if (bonusActivityInfoListBuilder_ == null) {
          return bonusActivityInfoList_.size();
        } else {
          return bonusActivityInfoListBuilder_.getCount();
        }
      }
      /**
       * <code>repeated .BonusActivityInfo bonus_activity_info_list = 1;</code>
       */
      public emu.grasscutter.net.proto.BonusActivityInfoOuterClass.BonusActivityInfo getBonusActivityInfoList(int index) {
        if (bonusActivityInfoListBuilder_ == null) {
          return bonusActivityInfoList_.get(index);
        } else {
          return bonusActivityInfoListBuilder_.getMessage(index);
        }
      }
      /**
       * <code>repeated .BonusActivityInfo bonus_activity_info_list = 1;</code>
       */
      public Builder setBonusActivityInfoList(
          int index, emu.grasscutter.net.proto.BonusActivityInfoOuterClass.BonusActivityInfo value) {
        if (bonusActivityInfoListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureBonusActivityInfoListIsMutable();
          bonusActivityInfoList_.set(index, value);
          onChanged();
        } else {
          bonusActivityInfoListBuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .BonusActivityInfo bonus_activity_info_list = 1;</code>
       */
      public Builder setBonusActivityInfoList(
          int index, emu.grasscutter.net.proto.BonusActivityInfoOuterClass.BonusActivityInfo.Builder builderForValue) {
        if (bonusActivityInfoListBuilder_ == null) {
          ensureBonusActivityInfoListIsMutable();
          bonusActivityInfoList_.set(index, builderForValue.build());
          onChanged();
        } else {
          bonusActivityInfoListBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .BonusActivityInfo bonus_activity_info_list = 1;</code>
       */
      public Builder addBonusActivityInfoList(emu.grasscutter.net.proto.BonusActivityInfoOuterClass.BonusActivityInfo value) {
        if (bonusActivityInfoListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureBonusActivityInfoListIsMutable();
          bonusActivityInfoList_.add(value);
          onChanged();
        } else {
          bonusActivityInfoListBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       * <code>repeated .BonusActivityInfo bonus_activity_info_list = 1;</code>
       */
      public Builder addBonusActivityInfoList(
          int index, emu.grasscutter.net.proto.BonusActivityInfoOuterClass.BonusActivityInfo value) {
        if (bonusActivityInfoListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureBonusActivityInfoListIsMutable();
          bonusActivityInfoList_.add(index, value);
          onChanged();
        } else {
          bonusActivityInfoListBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .BonusActivityInfo bonus_activity_info_list = 1;</code>
       */
      public Builder addBonusActivityInfoList(
          emu.grasscutter.net.proto.BonusActivityInfoOuterClass.BonusActivityInfo.Builder builderForValue) {
        if (bonusActivityInfoListBuilder_ == null) {
          ensureBonusActivityInfoListIsMutable();
          bonusActivityInfoList_.add(builderForValue.build());
          onChanged();
        } else {
          bonusActivityInfoListBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .BonusActivityInfo bonus_activity_info_list = 1;</code>
       */
      public Builder addBonusActivityInfoList(
          int index, emu.grasscutter.net.proto.BonusActivityInfoOuterClass.BonusActivityInfo.Builder builderForValue) {
        if (bonusActivityInfoListBuilder_ == null) {
          ensureBonusActivityInfoListIsMutable();
          bonusActivityInfoList_.add(index, builderForValue.build());
          onChanged();
        } else {
          bonusActivityInfoListBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .BonusActivityInfo bonus_activity_info_list = 1;</code>
       */
      public Builder addAllBonusActivityInfoList(
          java.lang.Iterable<? extends emu.grasscutter.net.proto.BonusActivityInfoOuterClass.BonusActivityInfo> values) {
        if (bonusActivityInfoListBuilder_ == null) {
          ensureBonusActivityInfoListIsMutable();
          com.google.protobuf.AbstractMessageLite.Builder.addAll(
              values, bonusActivityInfoList_);
          onChanged();
        } else {
          bonusActivityInfoListBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       * <code>repeated .BonusActivityInfo bonus_activity_info_list = 1;</code>
       */
      public Builder clearBonusActivityInfoList() {
        if (bonusActivityInfoListBuilder_ == null) {
          bonusActivityInfoList_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
          onChanged();
        } else {
          bonusActivityInfoListBuilder_.clear();
        }
        return this;
      }
      /**
       * <code>repeated .BonusActivityInfo bonus_activity_info_list = 1;</code>
       */
      public Builder removeBonusActivityInfoList(int index) {
        if (bonusActivityInfoListBuilder_ == null) {
          ensureBonusActivityInfoListIsMutable();
          bonusActivityInfoList_.remove(index);
          onChanged();
        } else {
          bonusActivityInfoListBuilder_.remove(index);
        }
        return this;
      }
      /**
       * <code>repeated .BonusActivityInfo bonus_activity_info_list = 1;</code>
       */
      public emu.grasscutter.net.proto.BonusActivityInfoOuterClass.BonusActivityInfo.Builder getBonusActivityInfoListBuilder(
          int index) {
        return getBonusActivityInfoListFieldBuilder().getBuilder(index);
      }
      /**
       * <code>repeated .BonusActivityInfo bonus_activity_info_list = 1;</code>
       */
      public emu.grasscutter.net.proto.BonusActivityInfoOuterClass.BonusActivityInfoOrBuilder getBonusActivityInfoListOrBuilder(
          int index) {
        if (bonusActivityInfoListBuilder_ == null) {
          return bonusActivityInfoList_.get(index);  } else {
          return bonusActivityInfoListBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       * <code>repeated .BonusActivityInfo bonus_activity_info_list = 1;</code>
       */
      public java.util.List<? extends emu.grasscutter.net.proto.BonusActivityInfoOuterClass.BonusActivityInfoOrBuilder> 
           getBonusActivityInfoListOrBuilderList() {
        if (bonusActivityInfoListBuilder_ != null) {
          return bonusActivityInfoListBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(bonusActivityInfoList_);
        }
      }
      /**
       * <code>repeated .BonusActivityInfo bonus_activity_info_list = 1;</code>
       */
      public emu.grasscutter.net.proto.BonusActivityInfoOuterClass.BonusActivityInfo.Builder addBonusActivityInfoListBuilder() {
        return getBonusActivityInfoListFieldBuilder().addBuilder(
            emu.grasscutter.net.proto.BonusActivityInfoOuterClass.BonusActivityInfo.getDefaultInstance());
      }
      /**
       * <code>repeated .BonusActivityInfo bonus_activity_info_list = 1;</code>
       */
      public emu.grasscutter.net.proto.BonusActivityInfoOuterClass.BonusActivityInfo.Builder addBonusActivityInfoListBuilder(
          int index) {
        return getBonusActivityInfoListFieldBuilder().addBuilder(
            index, emu.grasscutter.net.proto.BonusActivityInfoOuterClass.BonusActivityInfo.getDefaultInstance());
      }
      /**
       * <code>repeated .BonusActivityInfo bonus_activity_info_list = 1;</code>
       */
      public java.util.List<emu.grasscutter.net.proto.BonusActivityInfoOuterClass.BonusActivityInfo.Builder> 
           getBonusActivityInfoListBuilderList() {
        return getBonusActivityInfoListFieldBuilder().getBuilderList();
      }
      private com.google.protobuf.RepeatedFieldBuilderV3<
          emu.grasscutter.net.proto.BonusActivityInfoOuterClass.BonusActivityInfo, emu.grasscutter.net.proto.BonusActivityInfoOuterClass.BonusActivityInfo.Builder, emu.grasscutter.net.proto.BonusActivityInfoOuterClass.BonusActivityInfoOrBuilder> 
          getBonusActivityInfoListFieldBuilder() {
        if (bonusActivityInfoListBuilder_ == null) {
          bonusActivityInfoListBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
              emu.grasscutter.net.proto.BonusActivityInfoOuterClass.BonusActivityInfo, emu.grasscutter.net.proto.BonusActivityInfoOuterClass.BonusActivityInfo.Builder, emu.grasscutter.net.proto.BonusActivityInfoOuterClass.BonusActivityInfoOrBuilder>(
                  bonusActivityInfoList_,
                  ((bitField0_ & 0x00000001) != 0),
                  getParentForChildren(),
                  isClean());
          bonusActivityInfoList_ = null;
        }
        return bonusActivityInfoListBuilder_;
      }

      private int retcode_ ;
      /**
       * <code>int32 retcode = 7;</code>
       * @return The retcode.
       */
      @java.lang.Override
      public int getRetcode() {
        return retcode_;
      }
      /**
       * <code>int32 retcode = 7;</code>
       * @param value The retcode to set.
       * @return This builder for chaining.
       */
      public Builder setRetcode(int value) {
        
        retcode_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int32 retcode = 7;</code>
       * @return This builder for chaining.
       */
      public Builder clearRetcode() {
        
        retcode_ = 0;
        onChanged();
        return this;
      }
      @java.lang.Override
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFields(unknownFields);
      }

      @java.lang.Override
      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:BonusActivityInfoRsp)
    }

    // @@protoc_insertion_point(class_scope:BonusActivityInfoRsp)
    private static final emu.grasscutter.net.proto.BonusActivityInfoRspOuterClass.BonusActivityInfoRsp DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.BonusActivityInfoRspOuterClass.BonusActivityInfoRsp();
    }

    public static emu.grasscutter.net.proto.BonusActivityInfoRspOuterClass.BonusActivityInfoRsp getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<BonusActivityInfoRsp>
        PARSER = new com.google.protobuf.AbstractParser<BonusActivityInfoRsp>() {
      @java.lang.Override
      public BonusActivityInfoRsp parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new BonusActivityInfoRsp(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<BonusActivityInfoRsp> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<BonusActivityInfoRsp> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.BonusActivityInfoRspOuterClass.BonusActivityInfoRsp getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_BonusActivityInfoRsp_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_BonusActivityInfoRsp_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\032BonusActivityInfoRsp.proto\032\027BonusActiv" +
      "ityInfo.proto\"]\n\024BonusActivityInfoRsp\0224\n" +
      "\030bonus_activity_info_list\030\001 \003(\0132\022.BonusA" +
      "ctivityInfo\022\017\n\007retcode\030\007 \001(\005B\033\n\031emu.gras" +
      "scutter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.grasscutter.net.proto.BonusActivityInfoOuterClass.getDescriptor(),
        });
    internal_static_BonusActivityInfoRsp_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_BonusActivityInfoRsp_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_BonusActivityInfoRsp_descriptor,
        new java.lang.String[] { "BonusActivityInfoList", "Retcode", });
    emu.grasscutter.net.proto.BonusActivityInfoOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
