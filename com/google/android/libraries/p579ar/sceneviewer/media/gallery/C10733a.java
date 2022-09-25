package com.google.android.libraries.p579ar.sceneviewer.media.gallery;

import android.graphics.Bitmap;
import android.net.Uri;

/* renamed from: com.google.android.libraries.ar.sceneviewer.media.gallery.a */
/* compiled from: PG */
final class C10733a extends ThumbnailResult {

    /* renamed from: a */
    public final Bitmap f35669a;

    /* renamed from: b */
    public final Uri f35670b;

    public C10733a(Bitmap bitmap, Uri uri) {
        this.f35669a = bitmap;
        if (uri != null) {
            this.f35670b = uri;
            return;
        }
        throw new NullPointerException("Null uri");
    }

    public final Bitmap bitmap() {
        return this.f35669a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ThumbnailResult) {
            ThumbnailResult thumbnailResult = (ThumbnailResult) obj;
            Bitmap bitmap = this.f35669a;
            if (bitmap != null ? bitmap.equals(thumbnailResult.bitmap()) : thumbnailResult.bitmap() == null) {
                if (this.f35670b.equals(thumbnailResult.uri())) {
                    return true;
                }
            }
        }
        return false;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f35669a);
        String obj = this.f35670b.toString();
        return "ThumbnailResult{bitmap=" + valueOf + ", uri=" + obj + "}";
    }

    public final Uri uri() {
        return this.f35670b;
    }

    public final int hashCode() {
        int i;
        Bitmap bitmap = this.f35669a;
        if (bitmap == null) {
            i = 0;
        } else {
            i = bitmap.hashCode();
        }
        return ((i ^ 1000003) * 1000003) ^ this.f35670b.hashCode();
    }
}
