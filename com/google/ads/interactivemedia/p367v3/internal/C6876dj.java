package com.google.ads.interactivemedia.p367v3.internal;

/* renamed from: com.google.ads.interactivemedia.v3.internal.dj */
/* compiled from: PG */
final class C6876dj {

    /* renamed from: a */
    public final C7321tw f21877a;

    /* renamed from: b */
    public final long f21878b;

    /* renamed from: c */
    public final long f21879c;

    /* renamed from: d */
    public final long f21880d;

    /* renamed from: e */
    public final long f21881e;

    /* renamed from: f */
    public final boolean f21882f;

    /* renamed from: g */
    public final boolean f21883g;

    /* renamed from: h */
    public final boolean f21884h;

    public C6876dj(C7321tw twVar, long j, long j2, long j3, long j4, boolean z, boolean z2, boolean z3) {
        this.f21877a = twVar;
        this.f21878b = j;
        this.f21879c = j2;
        this.f21880d = j3;
        this.f21881e = j4;
        this.f21882f = z;
        this.f21883g = z2;
        this.f21884h = z3;
    }

    /* renamed from: a */
    public final C6876dj mo15689a(long j) {
        if (j == this.f21878b) {
            return this;
        }
        return new C6876dj(this.f21877a, j, this.f21879c, this.f21880d, this.f21881e, this.f21882f, this.f21883g, this.f21884h);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            C6876dj djVar = (C6876dj) obj;
            return this.f21878b == djVar.f21878b && this.f21879c == djVar.f21879c && this.f21880d == djVar.f21880d && this.f21881e == djVar.f21881e && this.f21882f == djVar.f21882f && this.f21883g == djVar.f21883g && this.f21884h == djVar.f21884h && aeu.m18533c(this.f21877a, djVar.f21877a);
        }
    }

    public final int hashCode() {
        return ((((((((((((((this.f21877a.hashCode() + 527) * 31) + ((int) this.f21878b)) * 31) + ((int) this.f21879c)) * 31) + ((int) this.f21880d)) * 31) + ((int) this.f21881e)) * 31) + (this.f21882f ? 1 : 0)) * 31) + (this.f21883g ? 1 : 0)) * 31) + (this.f21884h ? 1 : 0);
    }
}
