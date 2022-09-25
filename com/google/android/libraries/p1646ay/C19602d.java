package com.google.android.libraries.p1646ay;

import android.content.ContentValues;
import android.database.Cursor;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import java.io.FileNotFoundException;

/* renamed from: com.google.android.libraries.ay.d */
/* compiled from: PG */
public abstract class C19602d {
    /* renamed from: a */
    public abstract String mo24914a(Uri uri);

    /* renamed from: b */
    public Cursor mo24915b(Uri uri, String[] strArr) {
        throw null;
    }

    /* renamed from: c */
    public Uri mo24916c(Uri uri, ContentValues contentValues) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: d */
    public ParcelFileDescriptor mo24917d(Uri uri, String str) {
        throw new FileNotFoundException();
    }

    /* renamed from: k */
    public int mo24918k(Uri uri) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: l */
    public int mo24919l() {
        throw new UnsupportedOperationException();
    }
}
