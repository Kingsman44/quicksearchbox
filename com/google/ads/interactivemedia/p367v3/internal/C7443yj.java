package com.google.ads.interactivemedia.p367v3.internal;

import android.net.Uri;
import java.util.LinkedHashMap;

/* renamed from: com.google.ads.interactivemedia.v3.internal.yj */
/* compiled from: PG */
final class C7443yj {

    /* renamed from: a */
    private final LinkedHashMap f24387a = new C7442yi();

    /* renamed from: a */
    public final byte[] mo16807a(Uri uri) {
        if (uri == null) {
            return null;
        }
        return (byte[]) this.f24387a.get(uri);
    }

    /* renamed from: b */
    public final byte[] mo16808b(Uri uri) {
        return (byte[]) this.f24387a.remove(uri);
    }

    /* renamed from: c */
    public final void mo16809c(Uri uri, byte[] bArr) {
        LinkedHashMap linkedHashMap = this.f24387a;
        ary.m19467t(uri);
        byte[] bArr2 = (byte[]) linkedHashMap.put(uri, bArr);
    }
}
