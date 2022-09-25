package org.p5633c.p5634a.p5636b;

import org.p5633c.p5634a.C72132a;
import org.p5633c.p5634a.C72149ag;
import org.p5633c.p5634a.C72285i;
import org.p5633c.p5634a.C72288l;
import org.p5633c.p5634a.C72291o;
import org.p5633c.p5634a.C72294r;
import org.p5633c.p5634a.C72296t;
import org.p5633c.p5634a.C72298v;
import org.p5633c.p5634a.p5639e.C72245b;
import org.p5633c.p5634a.p5639e.C72267x;
import p3186j$.util.concurrent.ConcurrentHashMap;

/* renamed from: org.c.a.b.t */
/* compiled from: PG */
public final class C72184t extends C72166b {

    /* renamed from: E */
    public static final C72296t f192129E = new C72296t(-12219292800000L);

    /* renamed from: I */
    private static final ConcurrentHashMap f192130I = new ConcurrentHashMap();
    private static final long serialVersionUID = -2545574827706931671L;

    /* renamed from: F */
    public C72158ad f192131F;

    /* renamed from: G */
    public C72190z f192132G;

    /* renamed from: H */
    public long f192133H;

    /* renamed from: J */
    private C72296t f192134J;

    /* renamed from: K */
    private long f192135K;

    private C72184t(C72132a aVar, C72158ad adVar, C72190z zVar, C72296t tVar) {
        super(aVar, new Object[]{adVar, zVar, tVar});
    }

    /* renamed from: W */
    public static long m106139W(long j, C72132a aVar, C72132a aVar2) {
        return aVar2.mo63359p().mo63454q(aVar2.mo63353j().mo63454q(aVar2.mo63367w().mo63454q(aVar2.mo63368x().mo63454q(0, aVar.mo63368x().mo63444a(j)), aVar.mo63367w().mo63444a(j)), aVar.mo63353j().mo63444a(j)), aVar.mo63359p().mo63444a(j));
    }

    /* renamed from: X */
    public static long m106140X(long j, C72132a aVar, C72132a aVar2) {
        return aVar2.mo63345b(aVar.mo63370z().mo63444a(j), aVar.mo63363t().mo63444a(j), aVar.mo63352i().mo63444a(j), aVar.mo63359p().mo63444a(j));
    }

    /* renamed from: Z */
    public static C72184t m106141Z(C72288l lVar, C72149ag agVar, int i) {
        C72288l e = C72285i.m106777e(lVar);
        if (agVar == null) {
            agVar = f192129E;
        } else if (new C72298v(((C72296t) agVar).f192450a, (C72132a) C72190z.m106190az(e, 4)).mo63679d() <= 0) {
            throw new IllegalArgumentException("Cutover too early. Must be on or after 0001-01-01.");
        }
        C72296t tVar = (C72296t) agVar;
        C72180p pVar = new C72180p(e, tVar, i);
        ConcurrentHashMap concurrentHashMap = f192130I;
        C72184t tVar2 = (C72184t) concurrentHashMap.get(pVar);
        if (tVar2 == null) {
            if (e == C72288l.f192416b) {
                tVar2 = new C72184t(C72158ad.m105804az(e, i), C72190z.m106190az(e, i), tVar);
            } else {
                C72184t Z = m106141Z(C72288l.f192416b, agVar, i);
                tVar2 = new C72184t(C72165ak.m105884W(Z, e), Z.f192131F, Z.f192132G, Z.f192134J);
            }
            C72184t tVar3 = (C72184t) concurrentHashMap.putIfAbsent(pVar, tVar2);
            if (tVar3 != null) {
                return tVar3;
            }
        }
        return tVar2;
    }

    /* renamed from: aa */
    public static C72184t m106142aa() {
        return m106141Z(C72288l.f192416b, f192129E, 4);
    }

    private Object readResolve() {
        return m106141Z(mo63325C(), this.f192134J, this.f192132G.f192099G);
    }

    /* renamed from: C */
    public final C72288l mo63325C() {
        C72132a aVar = this.f192053a;
        if (aVar != null) {
            return aVar.mo63325C();
        }
        return C72288l.f192416b;
    }

    /* access modifiers changed from: protected */
    /* renamed from: V */
    public final void mo63441V(C72154a aVar) {
        Object[] objArr = (Object[]) this.f192054b;
        C72158ad adVar = (C72158ad) objArr[0];
        C72190z zVar = (C72190z) objArr[1];
        C72296t tVar = (C72296t) objArr[2];
        long j = tVar.f192450a;
        this.f192135K = j;
        this.f192131F = adVar;
        this.f192132G = zVar;
        this.f192134J = tVar;
        if (this.f192053a != null) {
            return;
        }
        if (adVar.f192099G == zVar.f192099G) {
            this.f192133H = j - mo63521Y(j);
            aVar.mo63440a(zVar);
            if (zVar.f192061i.mo63444a(this.f192135K) == 0) {
                aVar.f192002m = new C72181q(this, adVar.f192060h, aVar.f192002m, this.f192135K, false);
                aVar.f192003n = new C72181q(this, adVar.f192061i, aVar.f192003n, this.f192135K, false);
                aVar.f192004o = new C72181q(this, adVar.f192062j, aVar.f192004o, this.f192135K, false);
                aVar.f192005p = new C72181q(this, adVar.f192063k, aVar.f192005p, this.f192135K, false);
                aVar.f192006q = new C72181q(this, adVar.f192064l, aVar.f192006q, this.f192135K, false);
                aVar.f192007r = new C72181q(this, adVar.f192065m, aVar.f192007r, this.f192135K, false);
                aVar.f192008s = new C72181q(this, adVar.f192066n, aVar.f192008s, this.f192135K, false);
                aVar.f192010u = new C72181q(this, adVar.f192068p, aVar.f192010u, this.f192135K, false);
                aVar.f192009t = new C72181q(this, adVar.f192067o, aVar.f192009t, this.f192135K, false);
                aVar.f192011v = new C72181q(this, adVar.f192069q, aVar.f192011v, this.f192135K, false);
                aVar.f192012w = new C72181q(this, adVar.f192070r, aVar.f192012w, this.f192135K, false);
            }
            aVar.f191989I = new C72181q(this, adVar.f192044D, aVar.f191989I, this.f192135K, false);
            aVar.f192015z = new C72181q(this, adVar.f192073u, aVar.f192015z, zVar.f192078z.mo63452o(this.f192135K), false);
            aVar.f191981A = new C72181q(this, adVar.f192074v, aVar.f191981A, zVar.f192075w.mo63452o(this.f192135K), true);
            aVar.f191985E = new C72182r(this, adVar.f192078z, aVar.f191985E, (C72291o) null, this.f192135K, false);
            aVar.f191999j = aVar.f191985E.mo63464A();
            aVar.f191986F = new C72182r(this, adVar.f192041A, aVar.f191986F, aVar.f191999j, this.f192135K, false);
            aVar.f191987G = new C72182r(this, adVar.f192042B, aVar.f191987G, aVar.f191999j, this.f192135K, false);
            aVar.f191988H = new C72182r(this, adVar.f192043C, aVar.f191988H, (C72291o) null, this.f192135K, false);
            aVar.f192000k = aVar.f191988H.mo63464A();
            aVar.f191984D = new C72182r(this, adVar.f192077y, aVar.f191984D, (C72291o) null, this.f192135K, false);
            aVar.f191998i = aVar.f191984D.mo63464A();
            aVar.f191982B = new C72182r(this, adVar.f192075w, aVar.f191982B, (C72291o) null, this.f192135K, true);
            aVar.f191983C = new C72182r(this, adVar.f192076x, aVar.f191983C, aVar.f191997h, this.f192135K, false);
            aVar.f191997h = aVar.f191982B.mo63464A();
            C72181q qVar = new C72181q(this, adVar.f192072t, aVar.f192014y, this.f192135K, false);
            qVar.f192125f = aVar.f191998i;
            aVar.f192014y = qVar;
            return;
        }
        throw new IllegalArgumentException();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: Y */
    public final long mo63521Y(long j) {
        return m106140X(j, this.f192131F, this.f192132G);
    }

    /* renamed from: b */
    public final long mo63345b(int i, int i2, int i3, int i4) {
        C72132a aVar = this.f192053a;
        if (aVar != null) {
            return aVar.mo63345b(i, i2, i3, i4);
        }
        long b = this.f192132G.mo63345b(i, i2, i3, i4);
        if (b < this.f192135K) {
            b = this.f192131F.mo63345b(i, i2, i3, i4);
            if (b >= this.f192135K) {
                throw new IllegalArgumentException("Specified date does not exist");
            }
        }
        return b;
    }

    /* renamed from: c */
    public final long mo63346c(int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        int i8;
        int i9;
        long j;
        C72132a aVar = this.f192053a;
        if (aVar != null) {
            return aVar.mo63346c(i, i2, i3, i4, i5, i6, i7);
        }
        try {
            j = this.f192132G.mo63346c(i, i2, i3, i4, i5, i6, i7);
            i9 = i2;
            i8 = i3;
        } catch (C72294r e) {
            if (i2 == 2 && i3 == 29) {
                long c = this.f192132G.mo63346c(i, 2, 28, i4, i5, i6, i7);
                if (c < this.f192135K) {
                    j = c;
                    i9 = 2;
                    i8 = 29;
                } else {
                    throw e;
                }
            } else {
                throw e;
            }
        }
        if (j < this.f192135K) {
            j = this.f192131F.mo63346c(i, i9, i8, i4, i5, i6, i7);
            if (j >= this.f192135K) {
                throw new IllegalArgumentException("Specified date does not exist");
            }
        }
        return j;
    }

    /* renamed from: d */
    public final C72132a mo63347d() {
        return mo63348e(C72288l.f192416b);
    }

    /* renamed from: e */
    public final C72132a mo63348e(C72288l lVar) {
        if (lVar == null) {
            lVar = C72288l.m106789p();
        }
        if (lVar == mo63325C()) {
            return this;
        }
        return m106141Z(lVar, this.f192134J, this.f192132G.f192099G);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C72184t) {
            C72184t tVar = (C72184t) obj;
            return this.f192135K == tVar.f192135K && this.f192132G.f192099G == tVar.f192132G.f192099G && mo63325C().equals(tVar.mo63325C());
        }
    }

    public final int hashCode() {
        return mo63325C().hashCode() + 25025 + this.f192132G.f192099G + this.f192134J.hashCode();
    }

    public final String toString() {
        C72245b bVar;
        StringBuffer stringBuffer = new StringBuffer(60);
        stringBuffer.append("GJChronology[");
        stringBuffer.append(mo63325C().f192423d);
        if (this.f192135K != f192129E.f192450a) {
            stringBuffer.append(",cutover=");
            if (((C72166b) mo63348e(C72288l.f192416b)).f192073u.mo63451n(this.f192135K) == 0) {
                bVar = C72267x.f192321b;
            } else {
                bVar = C72267x.f192324e;
            }
            bVar.mo63600f(mo63348e(C72288l.f192416b)).mo63603i(stringBuffer, this.f192135K, (C72132a) null);
        }
        if (this.f192132G.f192099G != 4) {
            stringBuffer.append(",mdfw=");
            stringBuffer.append(this.f192132G.f192099G);
        }
        stringBuffer.append(']');
        return stringBuffer.toString();
    }

    private C72184t(C72158ad adVar, C72190z zVar, C72296t tVar) {
        super((C72132a) null, new Object[]{adVar, zVar, tVar});
    }
}
