package com.google.android.libraries.elements.interfaces;

import java.util.ArrayList;

/* compiled from: PG */
public final class ResourceMetadata {
    final ArrayList dependencies;
    final String resourceIdentifier;
    final Long resourceTag;
    final ResourceType resourceType;
    final String securityVerifier;

    public ResourceMetadata(String str, ResourceType resourceType2, Long l, ArrayList arrayList, String str2) {
        this.resourceIdentifier = str;
        this.resourceType = resourceType2;
        this.resourceTag = l;
        this.dependencies = arrayList;
        this.securityVerifier = str2;
    }

    public ArrayList getDependencies() {
        return this.dependencies;
    }

    public String getResourceIdentifier() {
        return this.resourceIdentifier;
    }

    public Long getResourceTag() {
        return this.resourceTag;
    }

    public ResourceType getResourceType() {
        return this.resourceType;
    }

    public String getSecurityVerifier() {
        return this.securityVerifier;
    }

    public String toString() {
        String str = this.resourceIdentifier;
        String valueOf = String.valueOf(this.resourceType);
        Long l = this.resourceTag;
        String valueOf2 = String.valueOf(this.dependencies);
        String str2 = this.securityVerifier;
        return "ResourceMetadata{resourceIdentifier=" + str + ",resourceType=" + valueOf + ",resourceTag=" + l + ",dependencies=" + valueOf2 + ",securityVerifier=" + str2 + "}";
    }
}
