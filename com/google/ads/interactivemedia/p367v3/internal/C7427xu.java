package com.google.ads.interactivemedia.p367v3.internal;

import java.util.List;

/* renamed from: com.google.ads.interactivemedia.v3.internal.xu */
/* compiled from: PG */
public abstract class C7427xu extends C7432xz {

    /* renamed from: a */
    final long f24348a;

    /* renamed from: b */
    final long f24349b;

    /* renamed from: c */
    final List f24350c;

    /* renamed from: d */
    final long f24351d;

    /* renamed from: e */
    private final long f24352e;

    /* renamed from: f */
    private final long f24353f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C7427xu(C7423xq xqVar, long j, long j2, long j3, long j4, List list, long j5, long j6, long j7) {
        super(xqVar, j, j2);
        this.f24348a = j3;
        this.f24349b = j4;
        this.f24350c = list;
        this.f24351d = j5;
        this.f24352e = j6;
        this.f24353f = j7;
    }

    /* renamed from: a */
    public final long mo16786a(long j, long j2) {
        long j3 = this.f24348a;
        long h = (long) mo16793h(j2);
        if (h == 0) {
            return j3;
        }
        if (this.f24350c == null) {
            long j4 = this.f24348a + (j / ((this.f24349b * 1000000) / this.f24363i));
            if (j4 < j3) {
                return j3;
            }
            return h != -1 ? Math.min(j4, (j3 + h) - 1) : j4;
        }
        long j5 = (h + j3) - 1;
        long j6 = j3;
        while (j6 <= j5) {
            long j7 = ((j5 - j6) / 2) + j6;
            long c = mo16788c(j7);
            if (c < j) {
                j6 = 1 + j7;
            } else if (c <= j) {
                return j7;
            } else {
                j5 = j7 - 1;
            }
        }
        return j6 == j3 ? j6 : j5;
    }

    /* renamed from: b */
    public final long mo16787b(long j, long j2) {
        List list = this.f24350c;
        if (list != null) {
            return (((C7430xx) list.get((int) (j - this.f24348a))).f24359b * 1000000) / this.f24363i;
        }
        int h = mo16793h(j2);
        if (h == -1 || j != (this.f24348a + ((long) h)) - 1) {
            return (this.f24349b * 1000000) / this.f24363i;
        }
        return j2 - mo16788c(j);
    }

    /* renamed from: c */
    public final long mo16788c(long j) {
        long j2;
        List list = this.f24350c;
        if (list != null) {
            j2 = ((C7430xx) list.get((int) (j - this.f24348a))).f24358a - this.f24364j;
        } else {
            j2 = (j - this.f24348a) * this.f24349b;
        }
        return aeu.m18496N(j2, 1000000, this.f24363i);
    }

    /* renamed from: d */
    public abstract C7423xq mo16789d(C7426xt xtVar, long j);

    /* renamed from: e */
    public final long mo16790e(long j, long j2) {
        if (((long) mo16793h(j)) == -1) {
            long j3 = this.f24352e;
            if (j3 != -9223372036854775807L) {
                return Math.max(this.f24348a, mo16786a((j2 - this.f24353f) - j3, j));
            }
        }
        return this.f24348a;
    }

    /* renamed from: f */
    public final int mo16791f(long j, long j2) {
        int h = mo16793h(j);
        if (h != -1) {
            return h;
        }
        return (int) (mo16786a((j2 - this.f24353f) + this.f24351d, j) - mo16790e(j, j2));
    }

    /* renamed from: g */
    public boolean mo16792g() {
        return this.f24350c != null;
    }

    /* renamed from: h */
    public abstract int mo16793h(long j);
}
