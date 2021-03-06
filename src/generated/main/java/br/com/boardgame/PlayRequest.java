// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: board-game-service.proto

package br.com.boardgame;

/**
 * Protobuf type {@code PlayRequest}
 */
public  final class PlayRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:PlayRequest)
    PlayRequestOrBuilder {
  // Use PlayRequest.newBuilder() to construct.
  private PlayRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private PlayRequest() {
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private PlayRequest(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    int mutable_bitField0_ = 0;
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          default: {
            if (!input.skipField(tag)) {
              done = true;
            }
            break;
          }
          case 10: {
            br.com.boardgame.RolledDie.Builder subBuilder = null;
            if (die_ != null) {
              subBuilder = die_.toBuilder();
            }
            die_ = input.readMessage(br.com.boardgame.RolledDie.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(die_);
              die_ = subBuilder.buildPartial();
            }

            break;
          }
          case 18: {
            br.com.boardgame.Player.Builder subBuilder = null;
            if (player_ != null) {
              subBuilder = player_.toBuilder();
            }
            player_ = input.readMessage(br.com.boardgame.Player.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(player_);
              player_ = subBuilder.buildPartial();
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
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return br.com.boardgame.BoardGameServiceOuterClass.internal_static_PlayRequest_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return br.com.boardgame.BoardGameServiceOuterClass.internal_static_PlayRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            br.com.boardgame.PlayRequest.class, br.com.boardgame.PlayRequest.Builder.class);
  }

  public static final int DIE_FIELD_NUMBER = 1;
  private br.com.boardgame.RolledDie die_;
  /**
   * <code>optional .RolledDie die = 1;</code>
   */
  public boolean hasDie() {
    return die_ != null;
  }
  /**
   * <code>optional .RolledDie die = 1;</code>
   */
  public br.com.boardgame.RolledDie getDie() {
    return die_ == null ? br.com.boardgame.RolledDie.getDefaultInstance() : die_;
  }
  /**
   * <code>optional .RolledDie die = 1;</code>
   */
  public br.com.boardgame.RolledDieOrBuilder getDieOrBuilder() {
    return getDie();
  }

  public static final int PLAYER_FIELD_NUMBER = 2;
  private br.com.boardgame.Player player_;
  /**
   * <code>optional .Player player = 2;</code>
   */
  public boolean hasPlayer() {
    return player_ != null;
  }
  /**
   * <code>optional .Player player = 2;</code>
   */
  public br.com.boardgame.Player getPlayer() {
    return player_ == null ? br.com.boardgame.Player.getDefaultInstance() : player_;
  }
  /**
   * <code>optional .Player player = 2;</code>
   */
  public br.com.boardgame.PlayerOrBuilder getPlayerOrBuilder() {
    return getPlayer();
  }

  private byte memoizedIsInitialized = -1;
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (die_ != null) {
      output.writeMessage(1, getDie());
    }
    if (player_ != null) {
      output.writeMessage(2, getPlayer());
    }
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (die_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getDie());
    }
    if (player_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getPlayer());
    }
    memoizedSize = size;
    return size;
  }

  private static final long serialVersionUID = 0L;
  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof br.com.boardgame.PlayRequest)) {
      return super.equals(obj);
    }
    br.com.boardgame.PlayRequest other = (br.com.boardgame.PlayRequest) obj;

    boolean result = true;
    result = result && (hasDie() == other.hasDie());
    if (hasDie()) {
      result = result && getDie()
          .equals(other.getDie());
    }
    result = result && (hasPlayer() == other.hasPlayer());
    if (hasPlayer()) {
      result = result && getPlayer()
          .equals(other.getPlayer());
    }
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptorForType().hashCode();
    if (hasDie()) {
      hash = (37 * hash) + DIE_FIELD_NUMBER;
      hash = (53 * hash) + getDie().hashCode();
    }
    if (hasPlayer()) {
      hash = (37 * hash) + PLAYER_FIELD_NUMBER;
      hash = (53 * hash) + getPlayer().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static br.com.boardgame.PlayRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static br.com.boardgame.PlayRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static br.com.boardgame.PlayRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static br.com.boardgame.PlayRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static br.com.boardgame.PlayRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static br.com.boardgame.PlayRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static br.com.boardgame.PlayRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static br.com.boardgame.PlayRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static br.com.boardgame.PlayRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static br.com.boardgame.PlayRequest parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(br.com.boardgame.PlayRequest prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
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
   * Protobuf type {@code PlayRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:PlayRequest)
      br.com.boardgame.PlayRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return br.com.boardgame.BoardGameServiceOuterClass.internal_static_PlayRequest_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return br.com.boardgame.BoardGameServiceOuterClass.internal_static_PlayRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              br.com.boardgame.PlayRequest.class, br.com.boardgame.PlayRequest.Builder.class);
    }

    // Construct using br.com.boardgame.PlayRequest.newBuilder()
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
    public Builder clear() {
      super.clear();
      if (dieBuilder_ == null) {
        die_ = null;
      } else {
        die_ = null;
        dieBuilder_ = null;
      }
      if (playerBuilder_ == null) {
        player_ = null;
      } else {
        player_ = null;
        playerBuilder_ = null;
      }
      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return br.com.boardgame.BoardGameServiceOuterClass.internal_static_PlayRequest_descriptor;
    }

    public br.com.boardgame.PlayRequest getDefaultInstanceForType() {
      return br.com.boardgame.PlayRequest.getDefaultInstance();
    }

    public br.com.boardgame.PlayRequest build() {
      br.com.boardgame.PlayRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public br.com.boardgame.PlayRequest buildPartial() {
      br.com.boardgame.PlayRequest result = new br.com.boardgame.PlayRequest(this);
      if (dieBuilder_ == null) {
        result.die_ = die_;
      } else {
        result.die_ = dieBuilder_.build();
      }
      if (playerBuilder_ == null) {
        result.player_ = player_;
      } else {
        result.player_ = playerBuilder_.build();
      }
      onBuilt();
      return result;
    }

    public Builder clone() {
      return (Builder) super.clone();
    }
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        Object value) {
      return (Builder) super.setField(field, value);
    }
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof br.com.boardgame.PlayRequest) {
        return mergeFrom((br.com.boardgame.PlayRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(br.com.boardgame.PlayRequest other) {
      if (other == br.com.boardgame.PlayRequest.getDefaultInstance()) return this;
      if (other.hasDie()) {
        mergeDie(other.getDie());
      }
      if (other.hasPlayer()) {
        mergePlayer(other.getPlayer());
      }
      onChanged();
      return this;
    }

    public final boolean isInitialized() {
      return true;
    }

    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      br.com.boardgame.PlayRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (br.com.boardgame.PlayRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private br.com.boardgame.RolledDie die_ = null;
    private com.google.protobuf.SingleFieldBuilderV3<
        br.com.boardgame.RolledDie, br.com.boardgame.RolledDie.Builder, br.com.boardgame.RolledDieOrBuilder> dieBuilder_;
    /**
     * <code>optional .RolledDie die = 1;</code>
     */
    public boolean hasDie() {
      return dieBuilder_ != null || die_ != null;
    }
    /**
     * <code>optional .RolledDie die = 1;</code>
     */
    public br.com.boardgame.RolledDie getDie() {
      if (dieBuilder_ == null) {
        return die_ == null ? br.com.boardgame.RolledDie.getDefaultInstance() : die_;
      } else {
        return dieBuilder_.getMessage();
      }
    }
    /**
     * <code>optional .RolledDie die = 1;</code>
     */
    public Builder setDie(br.com.boardgame.RolledDie value) {
      if (dieBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        die_ = value;
        onChanged();
      } else {
        dieBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>optional .RolledDie die = 1;</code>
     */
    public Builder setDie(
        br.com.boardgame.RolledDie.Builder builderForValue) {
      if (dieBuilder_ == null) {
        die_ = builderForValue.build();
        onChanged();
      } else {
        dieBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>optional .RolledDie die = 1;</code>
     */
    public Builder mergeDie(br.com.boardgame.RolledDie value) {
      if (dieBuilder_ == null) {
        if (die_ != null) {
          die_ =
            br.com.boardgame.RolledDie.newBuilder(die_).mergeFrom(value).buildPartial();
        } else {
          die_ = value;
        }
        onChanged();
      } else {
        dieBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>optional .RolledDie die = 1;</code>
     */
    public Builder clearDie() {
      if (dieBuilder_ == null) {
        die_ = null;
        onChanged();
      } else {
        die_ = null;
        dieBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>optional .RolledDie die = 1;</code>
     */
    public br.com.boardgame.RolledDie.Builder getDieBuilder() {
      
      onChanged();
      return getDieFieldBuilder().getBuilder();
    }
    /**
     * <code>optional .RolledDie die = 1;</code>
     */
    public br.com.boardgame.RolledDieOrBuilder getDieOrBuilder() {
      if (dieBuilder_ != null) {
        return dieBuilder_.getMessageOrBuilder();
      } else {
        return die_ == null ?
            br.com.boardgame.RolledDie.getDefaultInstance() : die_;
      }
    }
    /**
     * <code>optional .RolledDie die = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        br.com.boardgame.RolledDie, br.com.boardgame.RolledDie.Builder, br.com.boardgame.RolledDieOrBuilder> 
        getDieFieldBuilder() {
      if (dieBuilder_ == null) {
        dieBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            br.com.boardgame.RolledDie, br.com.boardgame.RolledDie.Builder, br.com.boardgame.RolledDieOrBuilder>(
                getDie(),
                getParentForChildren(),
                isClean());
        die_ = null;
      }
      return dieBuilder_;
    }

    private br.com.boardgame.Player player_ = null;
    private com.google.protobuf.SingleFieldBuilderV3<
        br.com.boardgame.Player, br.com.boardgame.Player.Builder, br.com.boardgame.PlayerOrBuilder> playerBuilder_;
    /**
     * <code>optional .Player player = 2;</code>
     */
    public boolean hasPlayer() {
      return playerBuilder_ != null || player_ != null;
    }
    /**
     * <code>optional .Player player = 2;</code>
     */
    public br.com.boardgame.Player getPlayer() {
      if (playerBuilder_ == null) {
        return player_ == null ? br.com.boardgame.Player.getDefaultInstance() : player_;
      } else {
        return playerBuilder_.getMessage();
      }
    }
    /**
     * <code>optional .Player player = 2;</code>
     */
    public Builder setPlayer(br.com.boardgame.Player value) {
      if (playerBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        player_ = value;
        onChanged();
      } else {
        playerBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>optional .Player player = 2;</code>
     */
    public Builder setPlayer(
        br.com.boardgame.Player.Builder builderForValue) {
      if (playerBuilder_ == null) {
        player_ = builderForValue.build();
        onChanged();
      } else {
        playerBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>optional .Player player = 2;</code>
     */
    public Builder mergePlayer(br.com.boardgame.Player value) {
      if (playerBuilder_ == null) {
        if (player_ != null) {
          player_ =
            br.com.boardgame.Player.newBuilder(player_).mergeFrom(value).buildPartial();
        } else {
          player_ = value;
        }
        onChanged();
      } else {
        playerBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>optional .Player player = 2;</code>
     */
    public Builder clearPlayer() {
      if (playerBuilder_ == null) {
        player_ = null;
        onChanged();
      } else {
        player_ = null;
        playerBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>optional .Player player = 2;</code>
     */
    public br.com.boardgame.Player.Builder getPlayerBuilder() {
      
      onChanged();
      return getPlayerFieldBuilder().getBuilder();
    }
    /**
     * <code>optional .Player player = 2;</code>
     */
    public br.com.boardgame.PlayerOrBuilder getPlayerOrBuilder() {
      if (playerBuilder_ != null) {
        return playerBuilder_.getMessageOrBuilder();
      } else {
        return player_ == null ?
            br.com.boardgame.Player.getDefaultInstance() : player_;
      }
    }
    /**
     * <code>optional .Player player = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        br.com.boardgame.Player, br.com.boardgame.Player.Builder, br.com.boardgame.PlayerOrBuilder> 
        getPlayerFieldBuilder() {
      if (playerBuilder_ == null) {
        playerBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            br.com.boardgame.Player, br.com.boardgame.Player.Builder, br.com.boardgame.PlayerOrBuilder>(
                getPlayer(),
                getParentForChildren(),
                isClean());
        player_ = null;
      }
      return playerBuilder_;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }


    // @@protoc_insertion_point(builder_scope:PlayRequest)
  }

  // @@protoc_insertion_point(class_scope:PlayRequest)
  private static final br.com.boardgame.PlayRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new br.com.boardgame.PlayRequest();
  }

  public static br.com.boardgame.PlayRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<PlayRequest>
      PARSER = new com.google.protobuf.AbstractParser<PlayRequest>() {
    public PlayRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new PlayRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<PlayRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<PlayRequest> getParserForType() {
    return PARSER;
  }

  public br.com.boardgame.PlayRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

