package com.bumptech.glide.load.data.p306a;

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import android.provider.MediaStore;

/* renamed from: com.bumptech.glide.load.data.a.c */
/* compiled from: PG */
public final class C5923c implements C5925e {

    /* renamed from: a */
    private static final String[] f17569a = {"_data"};

    /* renamed from: b */
    private final ContentResolver f17570b;

    public C5923c(ContentResolver contentResolver) {
        this.f17570b = contentResolver;
    }

    /* renamed from: a */
    public final Cursor mo12379a(Uri uri) {
        String lastPathSegment = uri.getLastPathSegment();
        return this.f17570b.query(MediaStore.Video.Thumbnails.EXTERNAL_CONTENT_URI, f17569a, "kind = 1 AND video_id = ?", new String[]{lastPathSegment}, (String) null);
    }
}
