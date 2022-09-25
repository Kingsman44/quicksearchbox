package com.google.android.apps.gsa.staticplugins.p7930es;

import android.graphics.Bitmap;
import java.io.ByteArrayOutputStream;

/* renamed from: com.google.android.apps.gsa.staticplugins.es.v */
/* compiled from: PG */
public final class C100667v {
    /* renamed from: a */
    public static final byte[] m166829a(Bitmap bitmap, int i) {
        if (bitmap == null) {
            return null;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        bitmap.compress(Bitmap.CompressFormat.JPEG, i, byteArrayOutputStream);
        return byteArrayOutputStream.toByteArray();
    }
}
