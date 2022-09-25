package com.google.ads.interactivemedia.p367v3.internal;

import android.util.SparseArray;

/* renamed from: com.google.ads.interactivemedia.v3.internal.zi */
/* compiled from: PG */
public final class C7469zi {

    /* renamed from: a */
    private final SparseArray f24553a = new SparseArray();

    /* renamed from: a */
    public final aes mo16878a(int i) {
        aes aes = (aes) this.f24553a.get(i);
        if (aes != null) {
            return aes;
        }
        aes aes2 = new aes(Long.MAX_VALUE);
        this.f24553a.put(i, aes2);
        return aes2;
    }

    /* renamed from: b */
    public final void mo16879b() {
        this.f24553a.clear();
    }
}
