package org.p5633c.p5634a.p5636b;

import org.p5633c.p5634a.C72233e;
import org.p5633c.p5634a.C72291o;

/* renamed from: org.c.a.b.r */
/* compiled from: PG */
final class C72182r extends C72181q {

    /* renamed from: h */
    final /* synthetic */ C72184t f192127h;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C72182r(C72184t tVar, C72233e eVar, C72233e eVar2, C72291o oVar, long j, boolean z) {
        super(tVar, eVar, eVar2, j, z);
        this.f192127h = tVar;
        this.f192124e = oVar == null ? new C72183s(this.f192124e, this) : oVar;
    }

    /* renamed from: b */
    public final int mo63445b(long j, long j2) {
        long j3 = this.f192122c;
        if (j >= j3) {
            if (j2 >= j3) {
                return this.f192121b.mo63445b(j, j2);
            }
            return this.f192120a.mo63445b(mo63519F(j), j2);
        } else if (j2 < j3) {
            return this.f192120a.mo63445b(j, j2);
        } else {
            return this.f192121b.mo63445b(mo63520G(j), j2);
        }
    }

    /* renamed from: e */
    public final int mo63469e(long j) {
        if (j >= this.f192122c) {
            return this.f192121b.mo63469e(j);
        }
        return this.f192120a.mo63469e(j);
    }

    /* renamed from: k */
    public final long mo63448k(long j, int i) {
        if (j >= this.f192122c) {
            long k = this.f192121b.mo63448k(j, i);
            long j2 = this.f192122c;
            if (k >= j2) {
                return k;
            }
            C72184t tVar = this.f192127h;
            if (tVar.f192133H + k >= j2) {
                return k;
            }
            if (this.f192123d) {
                if (tVar.f192132G.f192075w.mo63444a(k) <= 0) {
                    k = this.f192127h.f192132G.f192075w.mo63448k(k, -1);
                }
            } else if (tVar.f192132G.f192078z.mo63444a(k) <= 0) {
                k = this.f192127h.f192132G.f192078z.mo63448k(k, -1);
            }
            return mo63519F(k);
        }
        long k2 = this.f192120a.mo63448k(j, i);
        long j3 = this.f192122c;
        return (k2 < j3 || k2 - this.f192127h.f192133H < j3) ? k2 : mo63520G(k2);
    }

    /* renamed from: l */
    public final long mo63449l(long j, long j2) {
        if (j >= this.f192122c) {
            long l = this.f192121b.mo63449l(j, j2);
            long j3 = this.f192122c;
            if (l >= j3) {
                return l;
            }
            C72184t tVar = this.f192127h;
            if (tVar.f192133H + l >= j3) {
                return l;
            }
            if (this.f192123d) {
                if (tVar.f192132G.f192075w.mo63444a(l) <= 0) {
                    l = this.f192127h.f192132G.f192075w.mo63448k(l, -1);
                }
            } else if (tVar.f192132G.f192078z.mo63444a(l) <= 0) {
                l = this.f192127h.f192132G.f192078z.mo63448k(l, -1);
            }
            return mo63519F(l);
        }
        long l2 = this.f192120a.mo63449l(j, j2);
        long j4 = this.f192122c;
        return (l2 < j4 || l2 - this.f192127h.f192133H < j4) ? l2 : mo63520G(l2);
    }

    /* renamed from: m */
    public final long mo63450m(long j, long j2) {
        long j3 = this.f192122c;
        if (j >= j3) {
            if (j2 >= j3) {
                return this.f192121b.mo63450m(j, j2);
            }
            return this.f192120a.mo63450m(mo63519F(j), j2);
        } else if (j2 < j3) {
            return this.f192120a.mo63450m(j, j2);
        } else {
            return this.f192121b.mo63450m(mo63520G(j), j2);
        }
    }
}
