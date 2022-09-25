package org.p5633c.p5634a.p5636b;

import org.p5633c.p5634a.C72283g;
import org.p5633c.p5634a.C72291o;
import org.p5633c.p5634a.p5638d.C72218h;
import org.p5633c.p5634a.p5638d.C72220j;

/* renamed from: org.c.a.b.n */
/* compiled from: PG */
final class C72178n extends C72220j {

    /* renamed from: a */
    protected final C72170f f192113a;

    public C72178n(C72170f fVar) {
        super(C72283g.f192391g, fVar.mo63460ap());
        this.f192113a = fVar;
    }

    /* renamed from: B */
    public final C72291o mo63465B() {
        return this.f192113a.f192055c;
    }

    /* renamed from: C */
    public final C72291o mo63466C() {
        return null;
    }

    /* renamed from: D */
    public final boolean mo63467D(long j) {
        C72170f fVar = this.f192113a;
        return fVar.mo63463ay(fVar.mo63505al(j));
    }

    /* renamed from: a */
    public final int mo63444a(long j) {
        return this.f192113a.mo63505al(j);
    }

    /* renamed from: d */
    public final int mo63446d() {
        return this.f192113a.mo63455ae();
    }

    /* renamed from: h */
    public final int mo63447h() {
        return this.f192113a.mo63456ag();
    }

    /* renamed from: k */
    public final long mo63448k(long j, int i) {
        if (i == 0) {
            return j;
        }
        int al = this.f192113a.mo63505al(j);
        int i2 = al + i;
        if ((al ^ i2) >= 0 || (al ^ i) < 0) {
            return mo63454q(j, i2);
        }
        throw new ArithmeticException("The calculation caused an overflow: " + al + " + " + i);
    }

    /* renamed from: l */
    public final long mo63449l(long j, long j2) {
        return mo63448k(j, C72218h.m106355a(j2));
    }

    /* renamed from: m */
    public final long mo63450m(long j, long j2) {
        if (j < j2) {
            return -this.f192113a.mo63508au(j2, j);
        }
        return this.f192113a.mo63508au(j, j2);
    }

    /* renamed from: n */
    public final long mo63451n(long j) {
        return j - mo63453p(j);
    }

    /* renamed from: o */
    public final long mo63452o(long j) {
        int al = this.f192113a.mo63505al(j);
        return j != this.f192113a.mo63511ax(al).f192080b ? this.f192113a.mo63511ax(al + 1).f192080b : j;
    }

    /* renamed from: p */
    public final long mo63453p(long j) {
        C72170f fVar = this.f192113a;
        return fVar.mo63511ax(fVar.mo63505al(j)).f192080b;
    }

    /* renamed from: q */
    public final long mo63454q(long j, int i) {
        C72218h.m106360f(this, i, this.f192113a.mo63456ag(), this.f192113a.mo63455ae());
        return this.f192113a.mo63510aw(j, i);
    }
}
