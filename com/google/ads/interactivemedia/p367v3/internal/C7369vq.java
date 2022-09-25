package com.google.ads.interactivemedia.p367v3.internal;

import android.util.Log;

/* renamed from: com.google.ads.interactivemedia.v3.internal.vq */
/* compiled from: PG */
public final class C7369vq {

    /* renamed from: a */
    private final int[] f24069a;

    /* renamed from: b */
    private final C7353va[] f24070b;

    public C7369vq(int[] iArr, C7353va[] vaVarArr) {
        this.f24069a = iArr;
        this.f24070b = vaVarArr;
    }

    /* renamed from: a */
    public final int[] mo16673a() {
        int[] iArr = new int[this.f24070b.length];
        int i = 0;
        while (true) {
            C7353va[] vaVarArr = this.f24070b;
            if (i >= vaVarArr.length) {
                return iArr;
            }
            iArr[i] = vaVarArr[i].mo16624m();
            i++;
        }
    }

    /* renamed from: b */
    public final void mo16674b(long j) {
        for (C7353va H : this.f24070b) {
            H.mo16613H(j);
        }
    }

    /* renamed from: c */
    public final C7073kr mo16675c(int i) {
        int i2 = 0;
        while (true) {
            int[] iArr = this.f24069a;
            if (i2 >= iArr.length) {
                StringBuilder sb = new StringBuilder(36);
                sb.append("Unmatched track of type: ");
                sb.append(i);
                Log.e("BaseMediaChunkOutput", sb.toString());
                return new C7052jx();
            } else if (i == iArr[i2]) {
                return this.f24070b[i2];
            } else {
                i2++;
            }
        }
    }
}
