package com.google.ads.interactivemedia.p367v3.internal;

/* renamed from: com.google.ads.interactivemedia.v3.internal.eg */
/* compiled from: PG */
public final class C6900eg {

    /* renamed from: a */
    public static final C6900eg f21969a;

    /* renamed from: b */
    public static final C6900eg f21970b;

    /* renamed from: c */
    public final long f21971c;

    /* renamed from: d */
    public final long f21972d;

    static {
        C6900eg egVar = new C6900eg(0, 0);
        f21969a = egVar;
        new C6900eg(Long.MAX_VALUE, Long.MAX_VALUE);
        new C6900eg(Long.MAX_VALUE, 0);
        new C6900eg(0, Long.MAX_VALUE);
        f21970b = egVar;
    }

    public C6900eg(long j, long j2) {
        boolean z = true;
        ary.m19462o(j >= 0);
        ary.m19462o(j2 < 0 ? false : z);
        this.f21971c = j;
        this.f21972d = j2;
    }

    /* renamed from: a */
    public final long mo15787a(long j, long j2, long j3) {
        long j4 = this.f21971c;
        if (j4 == 0) {
            if (this.f21972d == 0) {
                return j;
            }
            j4 = 0;
        }
        long at = aeu.m18529at(j, j4);
        long aj = aeu.m18519aj(j, this.f21972d);
        boolean z = true;
        boolean z2 = at <= j2 && j2 <= aj;
        if (at > j3 || j3 > aj) {
            z = false;
        }
        if (z2 && z) {
            return Math.abs(j2 - j) <= Math.abs(j3 - j) ? j2 : j3;
        }
        if (z2) {
            return j2;
        }
        return z ? j3 : at;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            C6900eg egVar = (C6900eg) obj;
            return this.f21971c == egVar.f21971c && this.f21972d == egVar.f21972d;
        }
    }

    public final int hashCode() {
        return (((int) this.f21971c) * 31) + ((int) this.f21972d);
    }
}
