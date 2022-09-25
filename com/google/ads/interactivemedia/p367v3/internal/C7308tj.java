package com.google.ads.interactivemedia.p367v3.internal;

import android.util.SparseArray;

/* renamed from: com.google.ads.interactivemedia.v3.internal.tj */
/* compiled from: PG */
public final class C7308tj implements C7334ui {

    /* renamed from: a */
    private final SparseArray f23823a;

    /* renamed from: b */
    private final int[] f23824b;

    public C7308tj(abw abw, C7058kc kcVar) {
        SparseArray sparseArray = new SparseArray();
        try {
            sparseArray.put(0, (C7334ui) Class.forName("com.google.ads.interactivemedia.v3.internal.wp").asSubclass(C7334ui.class).getConstructor(new Class[]{abw.class}).newInstance(new Object[]{abw}));
        } catch (Exception unused) {
        }
        try {
            sparseArray.put(1, (C7334ui) Class.forName("com.google.ads.interactivemedia.v3.exoplayer2.source.smoothstreaming.SsMediaSource$Factory").asSubclass(C7334ui.class).getConstructor(new Class[]{abw.class}).newInstance(new Object[]{abw}));
        } catch (Exception unused2) {
        }
        try {
            sparseArray.put(2, (C7334ui) Class.forName("com.google.ads.interactivemedia.v3.internal.ys").asSubclass(C7334ui.class).getConstructor(new Class[]{abw.class}).newInstance(new Object[]{abw}));
        } catch (Exception unused3) {
        }
        sparseArray.put(3, new C7346uu(abw, kcVar));
        this.f23823a = sparseArray;
        this.f23824b = new int[sparseArray.size()];
        for (int i = 0; i < this.f23823a.size(); i++) {
            this.f23824b[i] = this.f23823a.keyAt(i);
        }
    }
}
