package org.p5633c.p5634a.p5636b;

import org.p5633c.p5634a.C72283g;
import org.p5633c.p5634a.C72291o;
import org.p5633c.p5634a.p5638d.C72218h;
import org.p5633c.p5634a.p5638d.C72220j;

/* renamed from: org.c.a.b.m */
/* compiled from: PG */
final class C72177m extends C72220j {

    /* renamed from: a */
    private final C72170f f192112a;

    public C72177m(C72170f fVar) {
        super(C72283g.f192396l, fVar.mo63460ap());
        this.f192112a = fVar;
    }

    /* renamed from: B */
    public final C72291o mo63465B() {
        return this.f192112a.f192056d;
    }

    /* renamed from: C */
    public final C72291o mo63466C() {
        return null;
    }

    /* renamed from: D */
    public final boolean mo63467D(long j) {
        C72170f fVar = this.f192112a;
        return fVar.mo63503aj(fVar.mo63504ak(j)) > 52;
    }

    /* renamed from: a */
    public final int mo63444a(long j) {
        return this.f192112a.mo63504ak(j);
    }

    /* renamed from: d */
    public final int mo63446d() {
        return this.f192112a.mo63455ae();
    }

    /* renamed from: h */
    public final int mo63447h() {
        return this.f192112a.mo63456ag();
    }

    /* renamed from: k */
    public final long mo63448k(long j, int i) {
        if (i == 0) {
            return j;
        }
        return mo63454q(j, this.f192112a.mo63504ak(j) + i);
    }

    /* renamed from: l */
    public final long mo63449l(long j, long j2) {
        return mo63448k(j, C72218h.m106355a(j2));
    }

    /* renamed from: m */
    public final long mo63450m(long j, long j2) {
        if (j < j2) {
            return (long) (-C72218h.m106355a(mo63450m(j2, j)));
        }
        int ak = this.f192112a.mo63504ak(j);
        int ak2 = this.f192112a.mo63504ak(j2);
        long p = j - mo63453p(j);
        long p2 = j2 - mo63453p(j2);
        if (p2 >= 31449600000L && this.f192112a.mo63503aj(ak) <= 52) {
            p2 -= 604800000;
        }
        int i = ak - ak2;
        if (p < p2) {
            i--;
        }
        return (long) i;
    }

    /* renamed from: n */
    public final long mo63451n(long j) {
        return j - mo63453p(j);
    }

    /* renamed from: p */
    public final long mo63453p(long j) {
        long p = this.f192112a.f192074v.mo63453p(j);
        C72170f fVar = this.f192112a;
        int ai = fVar.mo63502ai(p, fVar.mo63505al(p));
        return ai > 1 ? p - (((long) (ai - 1)) * 604800000) : p;
    }

    /* renamed from: q */
    public final long mo63454q(long j, int i) {
        C72218h.m106360f(this, Math.abs(i), this.f192112a.mo63456ag(), this.f192112a.mo63455ae());
        int ak = this.f192112a.mo63504ak(j);
        if (ak == i) {
            return j;
        }
        int X = this.f192112a.mo63493X(j);
        int aj = this.f192112a.mo63503aj(ak);
        int aj2 = this.f192112a.mo63503aj(i);
        if (aj2 < aj) {
            aj = aj2;
        }
        C72170f fVar = this.f192112a;
        int ai = fVar.mo63502ai(j, fVar.mo63505al(j));
        if (ai <= aj) {
            aj = ai;
        }
        long aw = this.f192112a.mo63510aw(j, i);
        int ak2 = this.f192112a.mo63504ak(aw);
        if (ak2 < i) {
            aw += 604800000;
        } else if (ak2 > i) {
            aw -= 604800000;
        }
        C72170f fVar2 = this.f192112a;
        return this.f192112a.f192071s.mo63454q(aw + (((long) (aj - fVar2.mo63502ai(aw, fVar2.mo63505al(aw)))) * 604800000), X);
    }
}
