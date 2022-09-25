package com.google.android.libraries.p579ar.sceneviewer.media;

import android.net.Uri;

/* renamed from: com.google.android.libraries.ar.sceneviewer.media.a */
/* compiled from: PG */
public final class C10720a extends MediaFileInfo {

    /* renamed from: a */
    public final MediaType f35656a;

    /* renamed from: b */
    public final Uri f35657b;

    /* renamed from: c */
    public final String f35658c;

    public C10720a(MediaType mediaType, Uri uri, String str) {
        if (mediaType != null) {
            this.f35656a = mediaType;
            if (uri != null) {
                this.f35657b = uri;
                if (str != null) {
                    this.f35658c = str;
                    return;
                }
                throw new NullPointerException("Null dateTaken");
            }
            throw new NullPointerException("Null uri");
        }
        throw new NullPointerException("Null type");
    }

    public final String dateTaken() {
        return this.f35658c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof MediaFileInfo) {
            MediaFileInfo mediaFileInfo = (MediaFileInfo) obj;
            return this.f35656a.equals(mediaFileInfo.type()) && this.f35657b.equals(mediaFileInfo.uri()) && this.f35658c.equals(mediaFileInfo.dateTaken());
        }
    }

    public final int hashCode() {
        return ((((this.f35656a.hashCode() ^ 1000003) * 1000003) ^ this.f35657b.hashCode()) * 1000003) ^ this.f35658c.hashCode();
    }

    public final String toString() {
        String obj = this.f35656a.toString();
        String obj2 = this.f35657b.toString();
        String str = this.f35658c;
        return "MediaFileInfo{type=" + obj + ", uri=" + obj2 + ", dateTaken=" + str + "}";
    }

    public final MediaType type() {
        return this.f35656a;
    }

    public final Uri uri() {
        return this.f35657b;
    }
}
