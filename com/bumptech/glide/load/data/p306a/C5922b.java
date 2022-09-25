package com.bumptech.glide.load.data.p306a;

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import android.provider.MediaStore;

/* renamed from: com.bumptech.glide.load.data.a.b */
/* compiled from: PG */
public final class C5922b implements C5925e {

    /* renamed from: a */
    private static final String[] f17567a = {"_data"};

    /* renamed from: b */
    private final ContentResolver f17568b;

    public C5922b(ContentResolver contentResolver) {
        this.f17568b = contentResolver;
    }

    /* renamed from: a */
    public final Cursor mo12379a(Uri uri) {
        String lastPathSegment = uri.getLastPathSegment();
        return this.f17568b.query(MediaStore.Images.Thumbnails.EXTERNAL_CONTENT_URI, f17567a, "kind = 1 AND image_id = ?", new String[]{lastPathSegment}, (String) null);
    }
}
