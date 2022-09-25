package com.google.ads.interactivemedia.p367v3.internal;

import android.util.Base64;

/* renamed from: com.google.ads.interactivemedia.v3.internal.aoo */
/* compiled from: PG */
final class aoo implements apm {
    /* renamed from: a */
    public final byte[] mo15132a(String str) {
        return Base64.decode(str, 2);
    }

    /* renamed from: b */
    public final String mo15133b(byte[] bArr) {
        return Base64.encodeToString(bArr, 11);
    }
}
