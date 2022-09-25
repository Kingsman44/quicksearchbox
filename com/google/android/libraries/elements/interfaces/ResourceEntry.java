package com.google.android.libraries.elements.interfaces;

/* compiled from: PG */
public final class ResourceEntry {
    final byte[] resourceBytes;
    final ResourceMetadata resourceMetadata;

    public ResourceEntry(ResourceMetadata resourceMetadata2, byte[] bArr) {
        this.resourceMetadata = resourceMetadata2;
        this.resourceBytes = bArr;
    }

    public byte[] getResourceBytes() {
        return this.resourceBytes;
    }

    public ResourceMetadata getResourceMetadata() {
        return this.resourceMetadata;
    }

    public String toString() {
        String valueOf = String.valueOf(this.resourceMetadata);
        String valueOf2 = String.valueOf(this.resourceBytes);
        return "ResourceEntry{resourceMetadata=" + valueOf + ",resourceBytes=" + valueOf2 + "}";
    }
}
