// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: board-game-service.proto

package br.com.boardgame;

/**
 * Protobuf type {@code Players}
 */
public  final class Players extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:Players)
    PlayersOrBuilder {
  // Use Players.newBuilder() to construct.
  private Players(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Players() {
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private Players(
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
            br.com.boardgame.Player.Builder subBuilder = null;
            if (players_ != null) {
              subBuilder = players_.toBuilder();
            }
            players_ = input.readMessage(br.com.boardgame.Player.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(players_);
              players_ = subBuilder.buildPartial();
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
    return br.com.boardgame.BoardGameServiceOuterClass.internal_static_Players_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return br.com.boardgame.BoardGameServiceOuterClass.internal_static_Players_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            br.com.boardgame.Players.class, br.com.boardgame.Players.Builder.class);
  }

  public static final int PLAYERS_FIELD_NUMBER = 1;
  private br.com.boardgame.Player players_;
  /**
   * <code>optional .Player players = 1;</code>
   */
  public boolean hasPlayers() {
    return players_ != null;
  }
  /**
   * <code>optional .Player players = 1;</code>
   */
  public br.com.boardgame.Player getPlayers() {
    return players_ == null ? br.com.boardgame.Player.getDefaultInstance() : players_;
  }
  /**
   * <code>optional .Player players = 1;</code>
   */
  public br.com.boardgame.PlayerOrBuilder getPlayersOrBuilder() {
    return getPlayers();
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
    if (players_ != null) {
      output.writeMessage(1, getPlayers());
    }
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (players_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getPlayers());
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
    if (!(obj instanceof br.com.boardgame.Players)) {
      return super.equals(obj);
    }
    br.com.boardgame.Players other = (br.com.boardgame.Players) obj;

    boolean result = true;
    result = result && (hasPlayers() == other.hasPlayers());
    if (hasPlayers()) {
      result = result && getPlayers()
          .equals(other.getPlayers());
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
    if (hasPlayers()) {
      hash = (37 * hash) + PLAYERS_FIELD_NUMBER;
      hash = (53 * hash) + getPlayers().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static br.com.boardgame.Players parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static br.com.boardgame.Players parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static br.com.boardgame.Players parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static br.com.boardgame.Players parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static br.com.boardgame.Players parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static br.com.boardgame.Players parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static br.com.boardgame.Players parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static br.com.boardgame.Players parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static br.com.boardgame.Players parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static br.com.boardgame.Players parseFrom(
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
  public static Builder newBuilder(br.com.boardgame.Players prototype) {
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
   * Protobuf type {@code Players}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:Players)
      br.com.boardgame.PlayersOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return br.com.boardgame.BoardGameServiceOuterClass.internal_static_Players_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return br.com.boardgame.BoardGameServiceOuterClass.internal_static_Players_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              br.com.boardgame.Players.class, br.com.boardgame.Players.Builder.class);
    }

    // Construct using br.com.boardgame.Players.newBuilder()
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
      if (playersBuilder_ == null) {
        players_ = null;
      } else {
        players_ = null;
        playersBuilder_ = null;
      }
      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return br.com.boardgame.BoardGameServiceOuterClass.internal_static_Players_descriptor;
    }

    public br.com.boardgame.Players getDefaultInstanceForType() {
      return br.com.boardgame.Players.getDefaultInstance();
    }

    public br.com.boardgame.Players build() {
      br.com.boardgame.Players result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public br.com.boardgame.Players buildPartial() {
      br.com.boardgame.Players result = new br.com.boardgame.Players(this);
      if (playersBuilder_ == null) {
        result.players_ = players_;
      } else {
        result.players_ = playersBuilder_.build();
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
      if (other instanceof br.com.boardgame.Players) {
        return mergeFrom((br.com.boardgame.Players)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(br.com.boardgame.Players other) {
      if (other == br.com.boardgame.Players.getDefaultInstance()) return this;
      if (other.hasPlayers()) {
        mergePlayers(other.getPlayers());
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
      br.com.boardgame.Players parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (br.com.boardgame.Players) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private br.com.boardgame.Player players_ = null;
    private com.google.protobuf.SingleFieldBuilderV3<
        br.com.boardgame.Player, br.com.boardgame.Player.Builder, br.com.boardgame.PlayerOrBuilder> playersBuilder_;
    /**
     * <code>optional .Player players = 1;</code>
     */
    public boolean hasPlayers() {
      return playersBuilder_ != null || players_ != null;
    }
    /**
     * <code>optional .Player players = 1;</code>
     */
    public br.com.boardgame.Player getPlayers() {
      if (playersBuilder_ == null) {
        return players_ == null ? br.com.boardgame.Player.getDefaultInstance() : players_;
      } else {
        return playersBuilder_.getMessage();
      }
    }
    /**
     * <code>optional .Player players = 1;</code>
     */
    public Builder setPlayers(br.com.boardgame.Player value) {
      if (playersBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        players_ = value;
        onChanged();
      } else {
        playersBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>optional .Player players = 1;</code>
     */
    public Builder setPlayers(
        br.com.boardgame.Player.Builder builderForValue) {
      if (playersBuilder_ == null) {
        players_ = builderForValue.build();
        onChanged();
      } else {
        playersBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>optional .Player players = 1;</code>
     */
    public Builder mergePlayers(br.com.boardgame.Player value) {
      if (playersBuilder_ == null) {
        if (players_ != null) {
          players_ =
            br.com.boardgame.Player.newBuilder(players_).mergeFrom(value).buildPartial();
        } else {
          players_ = value;
        }
        onChanged();
      } else {
        playersBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>optional .Player players = 1;</code>
     */
    public Builder clearPlayers() {
      if (playersBuilder_ == null) {
        players_ = null;
        onChanged();
      } else {
        players_ = null;
        playersBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>optional .Player players = 1;</code>
     */
    public br.com.boardgame.Player.Builder getPlayersBuilder() {
      
      onChanged();
      return getPlayersFieldBuilder().getBuilder();
    }
    /**
     * <code>optional .Player players = 1;</code>
     */
    public br.com.boardgame.PlayerOrBuilder getPlayersOrBuilder() {
      if (playersBuilder_ != null) {
        return playersBuilder_.getMessageOrBuilder();
      } else {
        return players_ == null ?
            br.com.boardgame.Player.getDefaultInstance() : players_;
      }
    }
    /**
     * <code>optional .Player players = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        br.com.boardgame.Player, br.com.boardgame.Player.Builder, br.com.boardgame.PlayerOrBuilder> 
        getPlayersFieldBuilder() {
      if (playersBuilder_ == null) {
        playersBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            br.com.boardgame.Player, br.com.boardgame.Player.Builder, br.com.boardgame.PlayerOrBuilder>(
                getPlayers(),
                getParentForChildren(),
                isClean());
        players_ = null;
      }
      return playersBuilder_;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }


    // @@protoc_insertion_point(builder_scope:Players)
  }

  // @@protoc_insertion_point(class_scope:Players)
  private static final br.com.boardgame.Players DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new br.com.boardgame.Players();
  }

  public static br.com.boardgame.Players getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Players>
      PARSER = new com.google.protobuf.AbstractParser<Players>() {
    public Players parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new Players(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<Players> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Players> getParserForType() {
    return PARSER;
  }

  public br.com.boardgame.Players getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
