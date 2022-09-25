package com.google.android.libraries.p579ar.sceneviewer.media.gallery;

import android.graphics.Bitmap;
import android.net.Uri;

/* renamed from: com.google.android.libraries.ar.sceneviewer.media.gallery.ThumbnailResult */
/* compiled from: PG */
public abstract class ThumbnailResult {
    public static ThumbnailResult create(Bitmap bitmap, Uri uri) {
        return new C10733a(bitmap, uri);
    }

    public abstract Bitmap bitmap();

    public abstract Uri uri();
}
