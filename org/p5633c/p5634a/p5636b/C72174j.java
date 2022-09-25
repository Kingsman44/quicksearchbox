package org.p5633c.p5634a.p5636b;

import org.p5633c.p5634a.C72283g;
import org.p5633c.p5634a.C72291o;
import org.p5633c.p5634a.p5638d.C72218h;
import org.p5633c.p5634a.p5638d.C72220j;

/* renamed from: org.c.a.b.j */
/* compiled from: PG */
class C72174j extends C72220j {

    /* renamed from: a */
    private final C72170f f192107a;

    /* renamed from: c */
    private final int f192108c = 12;

    /* renamed from: d */
    private final int f192109d = 2;

    public C72174j(C72170f fVar) {
        super(C72283g.f192393i, fVar.mo63459ao());
        this.f192107a = fVar;
    }

    /* renamed from: B */
    public final C72291o mo63465B() {
        return this.f192107a.f192055c;
    }

    /* renamed from: C */
    public final C72291o mo63466C() {
        return this.f192107a.f192059g;
    }

    /* renamed from: D */
    public final boolean mo63467D(long j) {
        int al = this.f192107a.mo63505al(j);
        if (!this.f192107a.mo63463ay(al) || this.f192107a.mo63501ah(j, al) != this.f192109d) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public final int mo63444a(long j) {
        C72170f fVar = this.f192107a;
        return fVar.mo63501ah(j, fVar.mo63505al(j));
    }

    /* renamed from: d */
    public final int mo63446d() {
        return this.f192108c;
    }

    /* renamed from: h */
    public final int mo63447h() {
        return 1;
    }

    /* renamed from: k */
    public final long mo63448k(long j, int i) {
        int i2;
        int i3;
        if (i == 0) {
            return j;
        }
        long af = (long) this.f192107a.mo63500af(j);
        int al = this.f192107a.mo63505al(j);
        int ah = this.f192107a.mo63501ah(j, al);
        int i4 = (ah - 1) + i;
        if (i4 >= 0) {
            int i5 = this.f192108c;
            i2 = (i4 / i5) + al;
            i3 = (i4 % i5) + 1;
        } else {
            i2 = ((i4 / this.f192108c) + al) - 1;
            int abs = Math.abs(i4);
            int i6 = this.f192108c;
            int i7 = abs % i6;
            if (i7 == 0) {
                i7 = i6;
            }
            i3 = (i6 - i7) + 1;
            if (i3 == 1) {
                i2++;
            }
        }
        int W = this.f192107a.mo63492W(j, al, ah);
        int ad = this.f192107a.mo63499ad(i2, i3);
        if (W > ad) {
            W = ad;
        }
        return this.f192107a.mo63509av(i2, i3, W) + af;
    }

    /* renamed from: l */
    public final long mo63449l(long j, long j2) {
        long j3;
        long j4;
        long j5 = j;
        long j6 = j2;
        int i = (int) j6;
        if (((long) i) == j6) {
            return mo63448k(j5, i);
        }
        long af = (long) this.f192107a.mo63500af(j5);
        int al = this.f192107a.mo63505al(j5);
        int ah = this.f192107a.mo63501ah(j5, al);
        long j7 = ((long) (ah - 1)) + j6;
        if (j7 >= 0) {
            long j8 = (long) this.f192108c;
            j3 = ((long) al) + (j7 / j8);
            j4 = (j7 % j8) + 1;
        } else {
            j3 = -1 + ((long) al) + (j7 / ((long) this.f192108c));
            long abs = Math.abs(j7);
            int i2 = this.f192108c;
            int i3 = (int) (abs % ((long) i2));
            if (i3 == 0) {
                i3 = i2;
            }
            j4 = (long) ((i2 - i3) + 1);
            if (j4 == 1) {
                j3++;
            }
        }
        if (j3 < ((long) this.f192107a.mo63456ag()) || j3 > ((long) this.f192107a.mo63455ae())) {
            throw new IllegalArgumentException("Magnitude of add amount is too large: " + j2);
        }
        int i4 = (int) j3;
        int i5 = (int) j4;
        int W = this.f192107a.mo63492W(j5, al, ah);
        int ad = this.f192107a.mo63499ad(i4, i5);
        if (W > ad) {
            W = ad;
        }
        return this.f192107a.mo63509av(i4, i5, W) + af;
    }

    /* renamed from: m */
    public final long mo63450m(long j, long j2) {
        if (j < j2) {
            return (long) (-C72218h.m106355a(mo63450m(j2, j)));
        }
        int al = this.f192107a.mo63505al(j);
        int ah = this.f192107a.mo63501ah(j, al);
        int al2 = this.f192107a.mo63505al(j2);
        int ah2 = this.f192107a.mo63501ah(j2, al2);
        long j3 = ((((long) (al - al2)) * ((long) this.f192108c)) + ((long) ah)) - ((long) ah2);
        int W = this.f192107a.mo63492W(j, al, ah);
        if (W == this.f192107a.mo63499ad(al, ah) && this.f192107a.mo63492W(j2, al2, ah2) > W) {
            j2 = this.f192107a.f192072t.mo63454q(j2, W);
        }
        C72170f fVar = this.f192107a;
        long j4 = fVar.mo63511ax(al).f192080b;
        long at = fVar.mo63507at(al, ah);
        C72170f fVar2 = this.f192107a;
        return j - (j4 + at) < j2 - (fVar2.mo63511ax(al2).f192080b + fVar2.mo63507at(al2, ah2)) ? j3 - 1 : j3;
    }

    /* renamed from: n */
    public final long mo63451n(long j) {
        return j - mo63453p(j);
    }

    /* renamed from: p */
    public final long mo63453p(long j) {
        int al = this.f192107a.mo63505al(j);
        int ah = this.f192107a.mo63501ah(j, al);
        C72170f fVar = this.f192107a;
        return fVar.mo63511ax(al).f192080b + fVar.mo63507at(al, ah);
    }

    /* renamed from: q */
    public final long mo63454q(long j, int i) {
        C72218h.m106360f(this, i, 1, this.f192108c);
        int al = this.f192107a.mo63505al(j);
        C72170f fVar = this.f192107a;
        int W = fVar.mo63492W(j, al, fVar.mo63501ah(j, al));
        int ad = this.f192107a.mo63499ad(al, i);
        if (W > ad) {
            W = ad;
        }
        return this.f192107a.mo63509av(al, i, W) + ((long) this.f192107a.mo63500af(j));
    }
}
