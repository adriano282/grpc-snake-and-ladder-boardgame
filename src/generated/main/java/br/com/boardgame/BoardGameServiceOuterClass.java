// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: board-game-service.proto

package br.com.boardgame;

public final class BoardGameServiceOuterClass {
  private BoardGameServiceOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Position_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Position_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Players_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Players_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Player_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Player_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_RolledDie_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_RolledDie_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_PlayRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_PlayRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_GameStateResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_GameStateResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Void_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Void_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_GameState_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_GameState_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\030board-game-service.proto\"\031\n\010Position\022\r" +
      "\n\005value\030\001 \001(\005\"#\n\007Players\022\030\n\007players\030\001 \001(" +
      "\0132\007.Player\"$\n\006Player\022\014\n\004uuid\030\001 \001(\t\022\014\n\004na" +
      "me\030\002 \001(\t\"\032\n\tRolledDie\022\r\n\005value\030\001 \001(\005\"?\n\013" +
      "PlayRequest\022\027\n\003die\030\001 \001(\0132\n.RolledDie\022\027\n\006" +
      "player\030\002 \001(\0132\007.Player\"2\n\021GameStateRespon" +
      "se\022\035\n\tgameState\030\001 \001(\0132\n.GameState\"\006\n\004Voi" +
      "d\"b\n\tGameState\022\024\n\014yourPosition\030\001 \001(\005\022\024\n\014" +
      "finishedGame\030\002 \001(\010\022\021\n\tamIWinner\030\003 \001(\010\022\026\n" +
      "\016serverPosition\030\004 \001(\0052@\n\020BoardGameServic",
      "e\022,\n\004play\022\014.PlayRequest\032\022.GameStateRespo" +
      "nse(\0010\001B\024\n\020br.com.boardgameP\001b\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
    internal_static_Position_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_Position_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Position_descriptor,
        new java.lang.String[] { "Value", });
    internal_static_Players_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_Players_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Players_descriptor,
        new java.lang.String[] { "Players", });
    internal_static_Player_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_Player_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Player_descriptor,
        new java.lang.String[] { "Uuid", "Name", });
    internal_static_RolledDie_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_RolledDie_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_RolledDie_descriptor,
        new java.lang.String[] { "Value", });
    internal_static_PlayRequest_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_PlayRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_PlayRequest_descriptor,
        new java.lang.String[] { "Die", "Player", });
    internal_static_GameStateResponse_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_GameStateResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_GameStateResponse_descriptor,
        new java.lang.String[] { "GameState", });
    internal_static_Void_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_Void_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Void_descriptor,
        new java.lang.String[] { });
    internal_static_GameState_descriptor =
      getDescriptor().getMessageTypes().get(7);
    internal_static_GameState_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_GameState_descriptor,
        new java.lang.String[] { "YourPosition", "FinishedGame", "AmIWinner", "ServerPosition", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
