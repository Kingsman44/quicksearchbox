package com.google.ads.interactivemedia.p367v3.internal;

import java.util.Arrays;

/* renamed from: com.google.ads.interactivemedia.v3.internal.acc */
/* compiled from: PG */
public final class acc {

    /* renamed from: a */
    private final boolean f20249a = true;

    /* renamed from: b */
    private final int f20250b = 65536;

    /* renamed from: c */
    private final byte[] f20251c = null;

    /* renamed from: d */
    private final abj[] f20252d = new abj[1];

    /* renamed from: e */
    private int f20253e;

    /* renamed from: f */
    private int f20254f;

    /* renamed from: g */
    private int f20255g = 0;

    /* renamed from: h */
    private abj[] f20256h = new abj[100];

    public acc() {
        ary.m19462o(true);
        ary.m19462o(true);
    }

    /* renamed from: a */
    public final synchronized void mo14435a() {
        mo14436b(0);
    }

    /* renamed from: b */
    public final synchronized void mo14436b(int i) {
        int i2 = this.f20253e;
        this.f20253e = i;
        if (i < i2) {
            mo14440f();
        }
    }

    /* renamed from: c */
    public final synchronized abj mo14437c() {
        abj abj;
        this.f20254f++;
        int i = this.f20255g;
        if (i > 0) {
            abj[] abjArr = this.f20256h;
            int i2 = i - 1;
            this.f20255g = i2;
            abj = abjArr[i2];
            ary.m19467t(abj);
            this.f20256h[this.f20255g] = null;
        } else {
            abj = new abj(new byte[65536], 0);
        }
        return abj;
    }

    /* renamed from: d */
    public final synchronized void mo14438d(abj abj) {
        abj[] abjArr = this.f20252d;
        abjArr[0] = abj;
        mo14439e(abjArr);
    }

    /* renamed from: e */
    public final synchronized void mo14439e(abj[] abjArr) {
        int i = this.f20255g + r0;
        abj[] abjArr2 = this.f20256h;
        int length = abjArr2.length;
        if (i >= length) {
            this.f20256h = (abj[]) Arrays.copyOf(abjArr2, Math.max(length + length, i));
        }
        for (abj abj : abjArr) {
            abj[] abjArr3 = this.f20256h;
            int i2 = this.f20255g;
            this.f20255g = i2 + 1;
            abjArr3[i2] = abj;
        }
        this.f20254f -= abjArr.length;
        notifyAll();
    }

    /* renamed from: f */
    public final synchronized void mo14440f() {
        int max = Math.max(0, aeu.m18488F(this.f20253e, 65536) - this.f20254f);
        int i = this.f20255g;
        if (max < i) {
            Arrays.fill(this.f20256h, max, i, (Object) null);
            this.f20255g = max;
        }
    }

    /* renamed from: g */
    public final synchronized int mo14441g() {
        return this.f20254f * 65536;
    }

    /* renamed from: h */
    public final int mo14442h() {
        return 65536;
    }
}
