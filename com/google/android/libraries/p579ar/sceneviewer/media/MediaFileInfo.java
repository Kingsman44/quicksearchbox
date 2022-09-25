package com.google.android.libraries.p579ar.sceneviewer.media;

import android.net.Uri;

/* renamed from: com.google.android.libraries.ar.sceneviewer.media.MediaFileInfo */
/* compiled from: PG */
public abstract class MediaFileInfo {
    static MediaFileInfo create(MediaType mediaType, Uri uri, String str) {
        return new C10720a(mediaType, uri, str);
    }

    public abstract String dateTaken();

    public abstract MediaType type();

    public abstract Uri uri();
}
