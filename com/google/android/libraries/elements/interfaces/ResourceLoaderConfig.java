package com.google.android.libraries.elements.interfaces;

/* compiled from: PG */
public final class ResourceLoaderConfig {
    final String bytesPath;
    final Long cacheCap;
    final Long cacheExpirationBuffer;
    final Boolean enforceDependencyOrdering;
    final Integer maxBuildLabels;
    final Integer maxTags;
    final String metadataPath;

    public ResourceLoaderConfig(Integer num, Integer num2, String str, String str2, Long l, Long l2, Boolean bool) {
        this.maxTags = num;
        this.maxBuildLabels = num2;
        this.bytesPath = str;
        this.metadataPath = str2;
        this.cacheCap = l;
        this.cacheExpirationBuffer = l2;
        this.enforceDependencyOrdering = bool;
    }

    public String getBytesPath() {
        return this.bytesPath;
    }

    public Long getCacheCap() {
        return this.cacheCap;
    }

    public Long getCacheExpirationBuffer() {
        return this.cacheExpirationBuffer;
    }

    public Boolean getEnforceDependencyOrdering() {
        return this.enforceDependencyOrdering;
    }

    public Integer getMaxBuildLabels() {
        return this.maxBuildLabels;
    }

    public Integer getMaxTags() {
        return this.maxTags;
    }

    public String getMetadataPath() {
        return this.metadataPath;
    }

    public String toString() {
        Integer num = this.maxTags;
        Integer num2 = this.maxBuildLabels;
        String str = this.bytesPath;
        String str2 = this.metadataPath;
        Long l = this.cacheCap;
        Long l2 = this.cacheExpirationBuffer;
        Boolean bool = this.enforceDependencyOrdering;
        return "ResourceLoaderConfig{maxTags=" + num + ",maxBuildLabels=" + num2 + ",bytesPath=" + str + ",metadataPath=" + str2 + ",cacheCap=" + l + ",cacheExpirationBuffer=" + l2 + ",enforceDependencyOrdering=" + bool + "}";
    }
}
