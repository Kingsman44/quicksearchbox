package org.p5633c.p5634a.p5636b;

import java.util.HashMap;
import org.p5633c.p5634a.C72132a;
import org.p5633c.p5634a.C72143aa;
import org.p5633c.p5634a.C72147ae;
import org.p5633c.p5634a.C72210d;
import org.p5633c.p5634a.C72233e;
import org.p5633c.p5634a.C72285i;
import org.p5633c.p5634a.C72288l;
import org.p5633c.p5634a.C72291o;
import org.p5633c.p5634a.p5635a.C72135c;
import org.p5633c.p5634a.p5638d.C72218h;
import org.p5633c.p5634a.p5639e.C72267x;

/* renamed from: org.c.a.b.ah */
/* compiled from: PG */
public final class C72162ah extends C72166b {
    private static final long serialVersionUID = 7670866536893052522L;

    /* renamed from: E */
    final C72210d f192029E;

    /* renamed from: F */
    final C72210d f192030F;

    /* renamed from: G */
    private transient C72162ah f192031G;

    private C72162ah(C72132a aVar, C72210d dVar, C72210d dVar2) {
        super(aVar, (Object) null);
        this.f192029E = dVar;
        this.f192030F = dVar2;
    }

    /* renamed from: Y */
    private final C72233e m105840Y(C72233e eVar, HashMap hashMap) {
        if (eVar == null || !eVar.mo63558E()) {
            return eVar;
        }
        if (hashMap.containsKey(eVar)) {
            return (C72233e) hashMap.get(eVar);
        }
        C72159ae aeVar = new C72159ae(this, eVar, m105841Z(eVar.mo63464A(), hashMap), m105841Z(eVar.mo63466C(), hashMap), m105841Z(eVar.mo63465B(), hashMap));
        hashMap.put(eVar, aeVar);
        return aeVar;
    }

    /* renamed from: Z */
    private final C72291o m105841Z(C72291o oVar, HashMap hashMap) {
        if (oVar == null || !oVar.mo63566i()) {
            return oVar;
        }
        if (hashMap.containsKey(oVar)) {
            return (C72291o) hashMap.get(oVar);
        }
        C72160af afVar = new C72160af(this, oVar);
        hashMap.put(oVar, afVar);
        return afVar;
    }

    /* renamed from: T */
    public final long mo63342T(long j, int i, int i2) {
        mo63479X(j, (String) null);
        long T = this.f192053a.mo63342T(j, i, i2);
        mo63479X(T, "resulting");
        return T;
    }

    /* access modifiers changed from: protected */
    /* renamed from: V */
    public final void mo63441V(C72154a aVar) {
        HashMap hashMap = new HashMap();
        aVar.f192001l = m105841Z(aVar.f192001l, hashMap);
        aVar.f192000k = m105841Z(aVar.f192000k, hashMap);
        aVar.f191999j = m105841Z(aVar.f191999j, hashMap);
        aVar.f191998i = m105841Z(aVar.f191998i, hashMap);
        aVar.f191997h = m105841Z(aVar.f191997h, hashMap);
        aVar.f191996g = m105841Z(aVar.f191996g, hashMap);
        aVar.f191995f = m105841Z(aVar.f191995f, hashMap);
        aVar.f191994e = m105841Z(aVar.f191994e, hashMap);
        aVar.f191993d = m105841Z(aVar.f191993d, hashMap);
        aVar.f191992c = m105841Z(aVar.f191992c, hashMap);
        aVar.f191991b = m105841Z(aVar.f191991b, hashMap);
        aVar.f191990a = m105841Z(aVar.f191990a, hashMap);
        aVar.f191985E = m105840Y(aVar.f191985E, hashMap);
        aVar.f191986F = m105840Y(aVar.f191986F, hashMap);
        aVar.f191987G = m105840Y(aVar.f191987G, hashMap);
        aVar.f191988H = m105840Y(aVar.f191988H, hashMap);
        aVar.f191989I = m105840Y(aVar.f191989I, hashMap);
        aVar.f192013x = m105840Y(aVar.f192013x, hashMap);
        aVar.f192014y = m105840Y(aVar.f192014y, hashMap);
        aVar.f192015z = m105840Y(aVar.f192015z, hashMap);
        aVar.f191984D = m105840Y(aVar.f191984D, hashMap);
        aVar.f191981A = m105840Y(aVar.f191981A, hashMap);
        aVar.f191982B = m105840Y(aVar.f191982B, hashMap);
        aVar.f191983C = m105840Y(aVar.f191983C, hashMap);
        aVar.f192002m = m105840Y(aVar.f192002m, hashMap);
        aVar.f192003n = m105840Y(aVar.f192003n, hashMap);
        aVar.f192004o = m105840Y(aVar.f192004o, hashMap);
        aVar.f192005p = m105840Y(aVar.f192005p, hashMap);
        aVar.f192006q = m105840Y(aVar.f192006q, hashMap);
        aVar.f192007r = m105840Y(aVar.f192007r, hashMap);
        aVar.f192008s = m105840Y(aVar.f192008s, hashMap);
        aVar.f192010u = m105840Y(aVar.f192010u, hashMap);
        aVar.f192009t = m105840Y(aVar.f192009t, hashMap);
        aVar.f192011v = m105840Y(aVar.f192011v, hashMap);
        aVar.f192012w = m105840Y(aVar.f192012w, hashMap);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: X */
    public final void mo63479X(long j, String str) {
        C72210d dVar = this.f192029E;
        if (dVar == null || j >= dVar.f191962a) {
            C72210d dVar2 = this.f192030F;
            if (dVar2 != null && j >= dVar2.f191962a) {
                throw new C72161ag(this, str, false);
            }
            return;
        }
        throw new C72161ag(this, str, true);
    }

    /* renamed from: b */
    public final long mo63345b(int i, int i2, int i3, int i4) {
        long b = this.f192053a.mo63345b(i, i2, i3, i4);
        mo63479X(b, "resulting");
        return b;
    }

    /* renamed from: c */
    public final long mo63346c(int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        long c = this.f192053a.mo63346c(i, i2, i3, i4, i5, i6, i7);
        mo63479X(c, "resulting");
        return c;
    }

    /* renamed from: d */
    public final C72132a mo63347d() {
        return mo63348e(C72288l.f192416b);
    }

    /* renamed from: e */
    public final C72132a mo63348e(C72288l lVar) {
        C72162ah ahVar;
        if (lVar == null) {
            lVar = C72288l.m106789p();
        }
        if (lVar == mo63325C()) {
            return this;
        }
        if (lVar == C72288l.f192416b && (ahVar = this.f192031G) != null) {
            return ahVar;
        }
        C72210d dVar = this.f192029E;
        if (dVar != null) {
            C72143aa r = dVar.mo63387r();
            r.mo63422d(lVar);
            dVar = r.mo63385p();
        }
        C72210d dVar2 = this.f192030F;
        if (dVar2 != null) {
            C72143aa r2 = dVar2.mo63387r();
            r2.mo63422d(lVar);
            dVar2 = r2.mo63385p();
        }
        C72162ah W = m105839W(this.f192053a.mo63348e(lVar), dVar, dVar2);
        if (lVar == C72288l.f192416b) {
            this.f192031G = W;
        }
        return W;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C72162ah)) {
            return false;
        }
        C72162ah ahVar = (C72162ah) obj;
        return this.f192053a.equals(ahVar.f192053a) && C72218h.m106362h(this.f192029E, ahVar.f192029E) && C72218h.m106362h(this.f192030F, ahVar.f192030F);
    }

    public final int hashCode() {
        C72210d dVar = this.f192029E;
        int i = 0;
        int hashCode = (dVar != null ? dVar.hashCode() : 0) + 317351877;
        C72210d dVar2 = this.f192030F;
        if (dVar2 != null) {
            i = dVar2.hashCode();
        }
        return hashCode + i + (this.f192053a.hashCode() * 7);
    }

    public final String toString() {
        String str;
        String aVar = this.f192053a.toString();
        C72210d dVar = this.f192029E;
        String str2 = "NoLimit";
        if (dVar == null) {
            str = str2;
        } else {
            str = C72267x.f192324e.mo63596b(dVar);
        }
        C72210d dVar2 = this.f192030F;
        if (dVar2 != null) {
            str2 = C72267x.f192324e.mo63596b(dVar2);
        }
        return "LimitChronology[" + aVar + ", " + str + ", " + str2 + "]";
    }

    /* renamed from: W */
    public static C72162ah m105839W(C72132a aVar, C72147ae aeVar, C72147ae aeVar2) {
        if (aVar != null) {
            if (aeVar == null) {
                aeVar = null;
            }
            if (aeVar2 == null) {
                aeVar2 = null;
            }
            if (!(aeVar == null || aeVar2 == null)) {
                if (!((C72135c) aeVar).mo63389t(C72285i.m106773a(aeVar2))) {
                    throw new IllegalArgumentException("The lower limit must be come before than the upper limit");
                }
            }
            return new C72162ah(aVar, (C72210d) aeVar, (C72210d) aeVar2);
        }
        throw new IllegalArgumentException("Must supply a chronology");
    }
}
