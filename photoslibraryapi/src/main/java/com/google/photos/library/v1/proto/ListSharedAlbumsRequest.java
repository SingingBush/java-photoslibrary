// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/photos/library/v1/photos_library.proto

package com.google.photos.library.v1.proto;

/**
 *
 *
 * <pre>
 * Request to retrieve the user's list of shared albums. This will return the
 * list of albums corresponding to the user's 'Sharing' tab in the Google Photos
 * app.
 * </pre>
 *
 * Protobuf type {@code google.photos.library.v1.ListSharedAlbumsRequest}
 */
public final class ListSharedAlbumsRequest extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.photos.library.v1.ListSharedAlbumsRequest)
    ListSharedAlbumsRequestOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use ListSharedAlbumsRequest.newBuilder() to construct.
  private ListSharedAlbumsRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private ListSharedAlbumsRequest() {
    pageToken_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new ListSharedAlbumsRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.photos.library.v1.proto.LibraryServiceProto
        .internal_static_google_photos_library_v1_ListSharedAlbumsRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.photos.library.v1.proto.LibraryServiceProto
        .internal_static_google_photos_library_v1_ListSharedAlbumsRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.photos.library.v1.proto.ListSharedAlbumsRequest.class,
            com.google.photos.library.v1.proto.ListSharedAlbumsRequest.Builder.class);
  }

  public static final int PAGE_SIZE_FIELD_NUMBER = 1;
  private int pageSize_ = 0;
  /**
   *
   *
   * <pre>
   * Maximum number of albums to return in the response. Fewer albums might be
   * returned than the specified number. The default `pageSize` is 20, the
   * maximum is 50.
   * </pre>
   *
   * <code>int32 page_size = 1;</code>
   *
   * @return The pageSize.
   */
  @java.lang.Override
  public int getPageSize() {
    return pageSize_;
  }

  public static final int PAGE_TOKEN_FIELD_NUMBER = 2;

  @SuppressWarnings("serial")
  private volatile java.lang.Object pageToken_ = "";
  /**
   *
   *
   * <pre>
   * A continuation token to get the next page of the results. Adding this to
   * the request returns the rows after the `pageToken`. The `pageToken` should
   * be the value returned in the `nextPageToken` parameter in the response to
   * the `listSharedAlbums` request.
   * </pre>
   *
   * <code>string page_token = 2;</code>
   *
   * @return The pageToken.
   */
  @java.lang.Override
  public java.lang.String getPageToken() {
    java.lang.Object ref = pageToken_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      pageToken_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * A continuation token to get the next page of the results. Adding this to
   * the request returns the rows after the `pageToken`. The `pageToken` should
   * be the value returned in the `nextPageToken` parameter in the response to
   * the `listSharedAlbums` request.
   * </pre>
   *
   * <code>string page_token = 2;</code>
   *
   * @return The bytes for pageToken.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getPageTokenBytes() {
    java.lang.Object ref = pageToken_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      pageToken_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int EXCLUDE_NON_APP_CREATED_DATA_FIELD_NUMBER = 3;
  private boolean excludeNonAppCreatedData_ = false;
  /**
   *
   *
   * <pre>
   * If set, the results exclude media items that were not created by this app.
   * Defaults to false (all albums are returned). This field is ignored if the
   * photoslibrary.readonly.appcreateddata scope is used.
   * </pre>
   *
   * <code>bool exclude_non_app_created_data = 3;</code>
   *
   * @return The excludeNonAppCreatedData.
   */
  @java.lang.Override
  public boolean getExcludeNonAppCreatedData() {
    return excludeNonAppCreatedData_;
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
  public void writeTo(com.google.protobuf.CodedOutputStream output) throws java.io.IOException {
    if (pageSize_ != 0) {
      output.writeInt32(1, pageSize_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(pageToken_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, pageToken_);
    }
    if (excludeNonAppCreatedData_ != false) {
      output.writeBool(3, excludeNonAppCreatedData_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (pageSize_ != 0) {
      size += com.google.protobuf.CodedOutputStream.computeInt32Size(1, pageSize_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(pageToken_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, pageToken_);
    }
    if (excludeNonAppCreatedData_ != false) {
      size += com.google.protobuf.CodedOutputStream.computeBoolSize(3, excludeNonAppCreatedData_);
    }
    size += getUnknownFields().getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
      return true;
    }
    if (!(obj instanceof com.google.photos.library.v1.proto.ListSharedAlbumsRequest)) {
      return super.equals(obj);
    }
    com.google.photos.library.v1.proto.ListSharedAlbumsRequest other =
        (com.google.photos.library.v1.proto.ListSharedAlbumsRequest) obj;

    if (getPageSize() != other.getPageSize()) return false;
    if (!getPageToken().equals(other.getPageToken())) return false;
    if (getExcludeNonAppCreatedData() != other.getExcludeNonAppCreatedData()) return false;
    if (!getUnknownFields().equals(other.getUnknownFields())) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + PAGE_SIZE_FIELD_NUMBER;
    hash = (53 * hash) + getPageSize();
    hash = (37 * hash) + PAGE_TOKEN_FIELD_NUMBER;
    hash = (53 * hash) + getPageToken().hashCode();
    hash = (37 * hash) + EXCLUDE_NON_APP_CREATED_DATA_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(getExcludeNonAppCreatedData());
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.photos.library.v1.proto.ListSharedAlbumsRequest parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.photos.library.v1.proto.ListSharedAlbumsRequest parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.photos.library.v1.proto.ListSharedAlbumsRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.photos.library.v1.proto.ListSharedAlbumsRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.photos.library.v1.proto.ListSharedAlbumsRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.photos.library.v1.proto.ListSharedAlbumsRequest parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.photos.library.v1.proto.ListSharedAlbumsRequest parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.photos.library.v1.proto.ListSharedAlbumsRequest parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.photos.library.v1.proto.ListSharedAlbumsRequest parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.photos.library.v1.proto.ListSharedAlbumsRequest parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.photos.library.v1.proto.ListSharedAlbumsRequest parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.photos.library.v1.proto.ListSharedAlbumsRequest parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() {
    return newBuilder();
  }

  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }

  public static Builder newBuilder(
      com.google.photos.library.v1.proto.ListSharedAlbumsRequest prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }

  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   *
   *
   * <pre>
   * Request to retrieve the user's list of shared albums. This will return the
   * list of albums corresponding to the user's 'Sharing' tab in the Google Photos
   * app.
   * </pre>
   *
   * Protobuf type {@code google.photos.library.v1.ListSharedAlbumsRequest}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.photos.library.v1.ListSharedAlbumsRequest)
      com.google.photos.library.v1.proto.ListSharedAlbumsRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.photos.library.v1.proto.LibraryServiceProto
          .internal_static_google_photos_library_v1_ListSharedAlbumsRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.photos.library.v1.proto.LibraryServiceProto
          .internal_static_google_photos_library_v1_ListSharedAlbumsRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.photos.library.v1.proto.ListSharedAlbumsRequest.class,
              com.google.photos.library.v1.proto.ListSharedAlbumsRequest.Builder.class);
    }

    // Construct using com.google.photos.library.v1.proto.ListSharedAlbumsRequest.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      pageSize_ = 0;
      pageToken_ = "";
      excludeNonAppCreatedData_ = false;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.photos.library.v1.proto.LibraryServiceProto
          .internal_static_google_photos_library_v1_ListSharedAlbumsRequest_descriptor;
    }

    @java.lang.Override
    public com.google.photos.library.v1.proto.ListSharedAlbumsRequest getDefaultInstanceForType() {
      return com.google.photos.library.v1.proto.ListSharedAlbumsRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.photos.library.v1.proto.ListSharedAlbumsRequest build() {
      com.google.photos.library.v1.proto.ListSharedAlbumsRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.photos.library.v1.proto.ListSharedAlbumsRequest buildPartial() {
      com.google.photos.library.v1.proto.ListSharedAlbumsRequest result =
          new com.google.photos.library.v1.proto.ListSharedAlbumsRequest(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.photos.library.v1.proto.ListSharedAlbumsRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.pageSize_ = pageSize_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.pageToken_ = pageToken_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.excludeNonAppCreatedData_ = excludeNonAppCreatedData_;
      }
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }

    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return super.setField(field, value);
    }

    @java.lang.Override
    public Builder clearField(com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }

    @java.lang.Override
    public Builder clearOneof(com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }

    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }

    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.photos.library.v1.proto.ListSharedAlbumsRequest) {
        return mergeFrom((com.google.photos.library.v1.proto.ListSharedAlbumsRequest) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.photos.library.v1.proto.ListSharedAlbumsRequest other) {
      if (other == com.google.photos.library.v1.proto.ListSharedAlbumsRequest.getDefaultInstance())
        return this;
      if (other.getPageSize() != 0) {
        setPageSize(other.getPageSize());
      }
      if (!other.getPageToken().isEmpty()) {
        pageToken_ = other.pageToken_;
        bitField0_ |= 0x00000002;
        onChanged();
      }
      if (other.getExcludeNonAppCreatedData() != false) {
        setExcludeNonAppCreatedData(other.getExcludeNonAppCreatedData());
      }
      this.mergeUnknownFields(other.getUnknownFields());
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
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 8:
              {
                pageSize_ = input.readInt32();
                bitField0_ |= 0x00000001;
                break;
              } // case 8
            case 18:
              {
                pageToken_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000002;
                break;
              } // case 18
            case 24:
              {
                excludeNonAppCreatedData_ = input.readBool();
                bitField0_ |= 0x00000004;
                break;
              } // case 24
            default:
              {
                if (!super.parseUnknownField(input, extensionRegistry, tag)) {
                  done = true; // was an endgroup tag
                }
                break;
              } // default:
          } // switch (tag)
        } // while (!done)
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.unwrapIOException();
      } finally {
        onChanged();
      } // finally
      return this;
    }

    private int bitField0_;

    private int pageSize_;
    /**
     *
     *
     * <pre>
     * Maximum number of albums to return in the response. Fewer albums might be
     * returned than the specified number. The default `pageSize` is 20, the
     * maximum is 50.
     * </pre>
     *
     * <code>int32 page_size = 1;</code>
     *
     * @return The pageSize.
     */
    @java.lang.Override
    public int getPageSize() {
      return pageSize_;
    }
    /**
     *
     *
     * <pre>
     * Maximum number of albums to return in the response. Fewer albums might be
     * returned than the specified number. The default `pageSize` is 20, the
     * maximum is 50.
     * </pre>
     *
     * <code>int32 page_size = 1;</code>
     *
     * @param value The pageSize to set.
     * @return This builder for chaining.
     */
    public Builder setPageSize(int value) {

      pageSize_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Maximum number of albums to return in the response. Fewer albums might be
     * returned than the specified number. The default `pageSize` is 20, the
     * maximum is 50.
     * </pre>
     *
     * <code>int32 page_size = 1;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearPageSize() {
      bitField0_ = (bitField0_ & ~0x00000001);
      pageSize_ = 0;
      onChanged();
      return this;
    }

    private java.lang.Object pageToken_ = "";
    /**
     *
     *
     * <pre>
     * A continuation token to get the next page of the results. Adding this to
     * the request returns the rows after the `pageToken`. The `pageToken` should
     * be the value returned in the `nextPageToken` parameter in the response to
     * the `listSharedAlbums` request.
     * </pre>
     *
     * <code>string page_token = 2;</code>
     *
     * @return The pageToken.
     */
    public java.lang.String getPageToken() {
      java.lang.Object ref = pageToken_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        pageToken_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * A continuation token to get the next page of the results. Adding this to
     * the request returns the rows after the `pageToken`. The `pageToken` should
     * be the value returned in the `nextPageToken` parameter in the response to
     * the `listSharedAlbums` request.
     * </pre>
     *
     * <code>string page_token = 2;</code>
     *
     * @return The bytes for pageToken.
     */
    public com.google.protobuf.ByteString getPageTokenBytes() {
      java.lang.Object ref = pageToken_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        pageToken_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * A continuation token to get the next page of the results. Adding this to
     * the request returns the rows after the `pageToken`. The `pageToken` should
     * be the value returned in the `nextPageToken` parameter in the response to
     * the `listSharedAlbums` request.
     * </pre>
     *
     * <code>string page_token = 2;</code>
     *
     * @param value The pageToken to set.
     * @return This builder for chaining.
     */
    public Builder setPageToken(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      pageToken_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * A continuation token to get the next page of the results. Adding this to
     * the request returns the rows after the `pageToken`. The `pageToken` should
     * be the value returned in the `nextPageToken` parameter in the response to
     * the `listSharedAlbums` request.
     * </pre>
     *
     * <code>string page_token = 2;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearPageToken() {
      pageToken_ = getDefaultInstance().getPageToken();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * A continuation token to get the next page of the results. Adding this to
     * the request returns the rows after the `pageToken`. The `pageToken` should
     * be the value returned in the `nextPageToken` parameter in the response to
     * the `listSharedAlbums` request.
     * </pre>
     *
     * <code>string page_token = 2;</code>
     *
     * @param value The bytes for pageToken to set.
     * @return This builder for chaining.
     */
    public Builder setPageTokenBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      pageToken_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    private boolean excludeNonAppCreatedData_;
    /**
     *
     *
     * <pre>
     * If set, the results exclude media items that were not created by this app.
     * Defaults to false (all albums are returned). This field is ignored if the
     * photoslibrary.readonly.appcreateddata scope is used.
     * </pre>
     *
     * <code>bool exclude_non_app_created_data = 3;</code>
     *
     * @return The excludeNonAppCreatedData.
     */
    @java.lang.Override
    public boolean getExcludeNonAppCreatedData() {
      return excludeNonAppCreatedData_;
    }
    /**
     *
     *
     * <pre>
     * If set, the results exclude media items that were not created by this app.
     * Defaults to false (all albums are returned). This field is ignored if the
     * photoslibrary.readonly.appcreateddata scope is used.
     * </pre>
     *
     * <code>bool exclude_non_app_created_data = 3;</code>
     *
     * @param value The excludeNonAppCreatedData to set.
     * @return This builder for chaining.
     */
    public Builder setExcludeNonAppCreatedData(boolean value) {

      excludeNonAppCreatedData_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * If set, the results exclude media items that were not created by this app.
     * Defaults to false (all albums are returned). This field is ignored if the
     * photoslibrary.readonly.appcreateddata scope is used.
     * </pre>
     *
     * <code>bool exclude_non_app_created_data = 3;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearExcludeNonAppCreatedData() {
      bitField0_ = (bitField0_ & ~0x00000004);
      excludeNonAppCreatedData_ = false;
      onChanged();
      return this;
    }

    @java.lang.Override
    public final Builder setUnknownFields(final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }

    // @@protoc_insertion_point(builder_scope:google.photos.library.v1.ListSharedAlbumsRequest)
  }

  // @@protoc_insertion_point(class_scope:google.photos.library.v1.ListSharedAlbumsRequest)
  private static final com.google.photos.library.v1.proto.ListSharedAlbumsRequest DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.photos.library.v1.proto.ListSharedAlbumsRequest();
  }

  public static com.google.photos.library.v1.proto.ListSharedAlbumsRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ListSharedAlbumsRequest> PARSER =
      new com.google.protobuf.AbstractParser<ListSharedAlbumsRequest>() {
        @java.lang.Override
        public ListSharedAlbumsRequest parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          Builder builder = newBuilder();
          try {
            builder.mergeFrom(input, extensionRegistry);
          } catch (com.google.protobuf.InvalidProtocolBufferException e) {
            throw e.setUnfinishedMessage(builder.buildPartial());
          } catch (com.google.protobuf.UninitializedMessageException e) {
            throw e.asInvalidProtocolBufferException().setUnfinishedMessage(builder.buildPartial());
          } catch (java.io.IOException e) {
            throw new com.google.protobuf.InvalidProtocolBufferException(e)
                .setUnfinishedMessage(builder.buildPartial());
          }
          return builder.buildPartial();
        }
      };

  public static com.google.protobuf.Parser<ListSharedAlbumsRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ListSharedAlbumsRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.photos.library.v1.proto.ListSharedAlbumsRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
