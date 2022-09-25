package com.google.android.libraries.lens.view.p2113h.p2120c;

import android.graphics.Bitmap;
import android.os.Trace;
import com.google.common.p4526f.p4527a.C58974d;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

/* renamed from: com.google.android.libraries.lens.view.h.c.a */
/* compiled from: PG */
public final class C26724a {

    /* renamed from: a */
    public static final Bitmap.CompressFormat f72849a = Bitmap.CompressFormat.JPEG;

    static {
        C58974d.m91135i("CompressionUtils");
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: a */
    public final byte[] mo32034a(Bitmap bitmap, int i) {
        Trace.beginSection("compressor/compress");
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        if (bitmap.compress(f72849a, i, byteArrayOutputStream)) {
            try {
                byteArrayOutputStream.flush();
                byteArrayOutputStream.close();
                Trace.endSection();
                return byteArrayOutputStream.toByteArray();
            } catch (Throwable th) {
                byteArrayOutputStream.close();
                throw th;
            }
        } else {
            throw new IOException("Failed to compress bitmap.");
        }
    }
}
