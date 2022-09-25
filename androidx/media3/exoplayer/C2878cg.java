package androidx.media3.exoplayer;

import androidx.media3.common.p136b.C2601a;
import androidx.media3.common.p136b.C2612ak;
import androidx.media3.exoplayer.p145h.C3036as;

/* renamed from: androidx.media3.exoplayer.cg */
/* compiled from: PG */
final class C2878cg {

    /* renamed from: a */
    public final C3036as f8113a;

    /* renamed from: b */
    public final long f8114b;

    /* renamed from: c */
    public final long f8115c;

    /* renamed from: d */
    public final long f8116d;

    /* renamed from: e */
    public final long f8117e;

    /* renamed from: f */
    public final boolean f8118f;

    /* renamed from: g */
    public final boolean f8119g;

    /* renamed from: h */
    public final boolean f8120h;

    /* renamed from: i */
    public final boolean f8121i;

    public C2878cg(C3036as asVar, long j, long j2, long j3, long j4, boolean z, boolean z2, boolean z3, boolean z4) {
        boolean z5 = z;
        boolean z6 = z2;
        boolean z7 = z3;
        boolean z8 = z4;
        boolean z9 = false;
        C2601a.m6830b(!z8 || z6);
        C2601a.m6830b(!z7 || z6);
        if (!z5 || (!z6 && !z7 && !z8)) {
            z9 = true;
        }
        C2601a.m6830b(z9);
        this.f8113a = asVar;
        this.f8114b = j;
        this.f8115c = j2;
        this.f8116d = j3;
        this.f8117e = j4;
        this.f8118f = z5;
        this.f8119g = z6;
        this.f8120h = z7;
        this.f8121i = z8;
    }

    /* renamed from: a */
    public final C2878cg mo6642a(long j) {
        if (j == this.f8115c) {
            return this;
        }
        return new C2878cg(this.f8113a, this.f8114b, j, this.f8116d, this.f8117e, this.f8118f, this.f8119g, this.f8120h, this.f8121i);
    }

    /* renamed from: b */
    public final C2878cg mo6643b(long j) {
        if (j == this.f8114b) {
            return this;
        }
        return new C2878cg(this.f8113a, j, this.f8115c, this.f8116d, this.f8117e, this.f8118f, this.f8119g, this.f8120h, this.f8121i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            C2878cg cgVar = (C2878cg) obj;
            return this.f8114b == cgVar.f8114b && this.f8115c == cgVar.f8115c && this.f8116d == cgVar.f8116d && this.f8117e == cgVar.f8117e && this.f8118f == cgVar.f8118f && this.f8119g == cgVar.f8119g && this.f8120h == cgVar.f8120h && this.f8121i == cgVar.f8121i && C2612ak.m6951aa(this.f8113a, cgVar.f8113a);
        }
    }

    public final int hashCode() {
        return ((((((((((((((((this.f8113a.hashCode() + 527) * 31) + ((int) this.f8114b)) * 31) + ((int) this.f8115c)) * 31) + ((int) this.f8116d)) * 31) + ((int) this.f8117e)) * 31) + (this.f8118f ? 1 : 0)) * 31) + (this.f8119g ? 1 : 0)) * 31) + (this.f8120h ? 1 : 0)) * 31) + (this.f8121i ? 1 : 0);
    }
}
