package com.google.ads.interactivemedia.p367v3.internal;

/* renamed from: com.google.ads.interactivemedia.v3.internal.ne */
/* compiled from: PG */
final class C7141ne {

    /* renamed from: a */
    public final C7138nb f23068a;

    /* renamed from: b */
    public final int f23069b;

    /* renamed from: c */
    public final long[] f23070c;

    /* renamed from: d */
    public final int[] f23071d;

    /* renamed from: e */
    public final int f23072e;

    /* renamed from: f */
    public final long[] f23073f;

    /* renamed from: g */
    public final int[] f23074g;

    /* renamed from: h */
    public final long f23075h;

    public C7141ne(C7138nb nbVar, long[] jArr, int[] iArr, int i, long[] jArr2, int[] iArr2, long j) {
        int length = iArr.length;
        int length2 = jArr2.length;
        boolean z = true;
        ary.m19462o(length == length2);
        int length3 = jArr.length;
        ary.m19462o(length3 == length2);
        int length4 = iArr2.length;
        ary.m19462o(length4 != length2 ? false : z);
        this.f23068a = nbVar;
        this.f23070c = jArr;
        this.f23071d = iArr;
        this.f23072e = i;
        this.f23073f = jArr2;
        this.f23074g = iArr2;
        this.f23075h = j;
        this.f23069b = length3;
        if (length4 > 0) {
            int i2 = length4 - 1;
            iArr2[i2] = iArr2[i2] | 536870912;
        }
    }

    /* renamed from: a */
    public final int mo16191a(long j) {
        for (int an = aeu.m18523an(this.f23073f, j, false); an >= 0; an--) {
            if ((this.f23074g[an] & 1) != 0) {
                return an;
            }
        }
        return -1;
    }

    /* renamed from: b */
    public final int mo16192b(long j) {
        for (int ak = aeu.m18520ak(this.f23073f, j, true); ak < this.f23073f.length; ak++) {
            if ((this.f23074g[ak] & 1) != 0) {
                return ak;
            }
        }
        return -1;
    }
}
