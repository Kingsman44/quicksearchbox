package com.google.android.libraries.gsa.util;

import android.content.ContentResolver;
import android.graphics.Bitmap;
import android.net.Uri;
import android.provider.MediaStore;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: com.google.android.libraries.gsa.util.a */
/* compiled from: PG */
public final class C23335a {

    /* renamed from: a */
    private static final C59071e f63872a = C59071e.m91332i("com.google.android.libraries.gsa.util.a");

    /* renamed from: a */
    public static Bitmap m43764a(ContentResolver contentResolver, Uri uri) {
        try {
            return MediaStore.Images.Media.getBitmap(contentResolver, uri);
        } catch (SecurityException e) {
            throw e;
        } catch (NullPointerException e2) {
            throw m43767d("getBitmap", e2);
        }
    }

    /* renamed from: b */
    public static InputStream m43765b(ContentResolver contentResolver, Uri uri) {
        try {
            return contentResolver.openInputStream(uri);
        } catch (SecurityException e) {
            throw e;
        } catch (NullPointerException e2) {
            throw m43767d("openInputStream", e2);
        }
    }

    /* renamed from: c */
    public static void m43766c(ContentResolver contentResolver, Uri uri) {
        try {
            contentResolver.delete(uri, (String) null, (String[]) null);
        } catch (SecurityException e) {
            throw e;
        } catch (NullPointerException e2) {
            throw m43767d("delete", e2);
        }
    }

    /* renamed from: d */
    private static IOException m43767d(String str, NullPointerException nullPointerException) {
        String str2 = "ContentResolver " + str + ": NullPointerException";
        ((C59052c) ((C59052c) f63872a.mo56225c()).mo56372aa(48659)).mo56389s("%s", str2);
        return new IOException(str2, nullPointerException);
    }
}
