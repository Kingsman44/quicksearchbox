package com.google.ads.interactivemedia.p367v3.internal;

import java.util.Arrays;

/* renamed from: com.google.ads.interactivemedia.v3.internal.adv */
/* compiled from: PG */
public final class adv {

    /* renamed from: a */
    private int f20390a;

    /* renamed from: b */
    private long[] f20391b = new long[32];

    /* renamed from: a */
    public final void mo14517a(long j) {
        int i = this.f20390a;
        long[] jArr = this.f20391b;
        if (i == jArr.length) {
            this.f20391b = Arrays.copyOf(jArr, i + i);
        }
        long[] jArr2 = this.f20391b;
        int i2 = this.f20390a;
        this.f20390a = i2 + 1;
        jArr2[i2] = j;
    }

    /* renamed from: b */
    public final long mo14518b(int i) {
        if (i >= 0 && i < this.f20390a) {
            return this.f20391b[i];
        }
        int i2 = this.f20390a;
        StringBuilder sb = new StringBuilder(46);
        sb.append("Invalid index ");
        sb.append(i);
        sb.append(", size is ");
        sb.append(i2);
        throw new IndexOutOfBoundsException(sb.toString());
    }

    /* renamed from: c */
    public final int mo14519c() {
        return this.f20390a;
    }
}
