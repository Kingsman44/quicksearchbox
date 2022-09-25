package com.google.android.apps.gsa.shared.util;

import android.content.ContentResolver;
import android.content.ContentUris;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.provider.ContactsContract;
import com.google.common.p4541l.C59337t;
import java.io.InputStream;

/* renamed from: com.google.android.apps.gsa.shared.util.o */
/* compiled from: PG */
public final class C91068o {
    /* renamed from: a */
    public static Bitmap m148774a(ContentResolver contentResolver, long j) {
        InputStream inputStream;
        try {
            inputStream = ContactsContract.Contacts.openContactPhotoInputStream(contentResolver, ContentUris.withAppendedId(ContactsContract.Contacts.CONTENT_URI, j), true);
            try {
                Bitmap decodeStream = BitmapFactory.decodeStream(inputStream);
                C59337t.m92221a(inputStream);
                return decodeStream;
            } catch (Throwable th) {
                th = th;
                C59337t.m92221a(inputStream);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            inputStream = null;
            C59337t.m92221a(inputStream);
            throw th;
        }
    }
}
