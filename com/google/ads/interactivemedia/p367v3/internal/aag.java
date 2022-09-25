package com.google.ads.interactivemedia.p367v3.internal;

/* renamed from: com.google.ads.interactivemedia.v3.internal.aag */
/* compiled from: PG */
final class aag {

    /* renamed from: a */
    private final abq f20049a;

    /* renamed from: b */
    private final float f20050b = 0.7f;

    /* renamed from: c */
    private final long f20051c;

    /* renamed from: d */
    private long[][] f20052d;

    public aag(abq abq, float f, long j) {
        this.f20049a = abq;
        this.f20051c = j;
    }

    /* renamed from: a */
    public final long mo14316a() {
        long[][] jArr;
        long max = Math.max(0, ((long) (((float) this.f20049a.mo14398a()) * 0.7f)) - this.f20051c);
        if (this.f20052d == null) {
            return max;
        }
        int i = 1;
        while (true) {
            jArr = this.f20052d;
            if (i >= jArr.length - 1 || jArr[i][0] >= max) {
                long[] jArr2 = jArr[i - 1];
                long[] jArr3 = jArr[i];
                long j = jArr2[0];
                long j2 = jArr3[0];
                long j3 = jArr2[1];
            } else {
                i++;
            }
        }
        long[] jArr22 = jArr[i - 1];
        long[] jArr32 = jArr[i];
        long j4 = jArr22[0];
        long j22 = jArr32[0];
        long j32 = jArr22[1];
        return j32 + ((long) ((((float) (max - j4)) / ((float) (j22 - j4))) * ((float) (jArr32[1] - j32))));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo14317b(long[][] jArr) {
        ary.m19462o(jArr.length >= 2);
        this.f20052d = jArr;
    }
}
