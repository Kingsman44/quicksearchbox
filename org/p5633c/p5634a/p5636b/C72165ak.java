package org.p5633c.p5634a.p5636b;

import java.util.HashMap;
import org.p5633c.p5634a.C72132a;
import org.p5633c.p5634a.C72233e;
import org.p5633c.p5634a.C72288l;
import org.p5633c.p5634a.C72291o;
import org.p5633c.p5634a.C72295s;

/* renamed from: org.c.a.b.ak */
/* compiled from: PG */
public final class C72165ak extends C72166b {
    private static final long serialVersionUID = -1079258847191166848L;

    private C72165ak(C72132a aVar, C72288l lVar) {
        super(aVar, lVar);
    }

    /* renamed from: X */
    static boolean m105885X(C72291o oVar) {
        return oVar != null && oVar.mo63488e() < 43200000;
    }

    /* renamed from: Y */
    private final long m105886Y(long j) {
        C72288l lVar = (C72288l) this.f192054b;
        int i = lVar.mo63661i(j);
        long j2 = j - ((long) i);
        if (i == lVar.mo37823a(j2)) {
            return j2;
        }
        throw new C72295s(j2, lVar.f192423d);
    }

    /* renamed from: Z */
    private final C72233e m105887Z(C72233e eVar, HashMap hashMap) {
        if (eVar == null || !eVar.mo63558E()) {
            return eVar;
        }
        if (hashMap.containsKey(eVar)) {
            return (C72233e) hashMap.get(eVar);
        }
        C72163ai aiVar = new C72163ai(eVar, (C72288l) this.f192054b, m105888aa(eVar.mo63464A(), hashMap), m105888aa(eVar.mo63466C(), hashMap), m105888aa(eVar.mo63465B(), hashMap));
        hashMap.put(eVar, aiVar);
        return aiVar;
    }

    /* renamed from: aa */
    private final C72291o m105888aa(C72291o oVar, HashMap hashMap) {
        if (oVar == null || !oVar.mo63566i()) {
            return oVar;
        }
        if (hashMap.containsKey(oVar)) {
            return (C72291o) hashMap.get(oVar);
        }
        C72164aj ajVar = new C72164aj(oVar, (C72288l) this.f192054b);
        hashMap.put(oVar, ajVar);
        return ajVar;
    }

    /* renamed from: C */
    public final C72288l mo63325C() {
        return (C72288l) this.f192054b;
    }

    /* renamed from: T */
    public final long mo63342T(long j, int i, int i2) {
        return m105886Y(this.f192053a.mo63342T(j + ((long) ((C72288l) this.f192054b).mo37823a(j)), i, i2));
    }

    /* access modifiers changed from: protected */
    /* renamed from: V */
    public final void mo63441V(C72154a aVar) {
        HashMap hashMap = new HashMap();
        aVar.f192001l = m105888aa(aVar.f192001l, hashMap);
        aVar.f192000k = m105888aa(aVar.f192000k, hashMap);
        aVar.f191999j = m105888aa(aVar.f191999j, hashMap);
        aVar.f191998i = m105888aa(aVar.f191998i, hashMap);
        aVar.f191997h = m105888aa(aVar.f191997h, hashMap);
        aVar.f191996g = m105888aa(aVar.f191996g, hashMap);
        aVar.f191995f = m105888aa(aVar.f191995f, hashMap);
        aVar.f191994e = m105888aa(aVar.f191994e, hashMap);
        aVar.f191993d = m105888aa(aVar.f191993d, hashMap);
        aVar.f191992c = m105888aa(aVar.f191992c, hashMap);
        aVar.f191991b = m105888aa(aVar.f191991b, hashMap);
        aVar.f191990a = m105888aa(aVar.f191990a, hashMap);
        aVar.f191985E = m105887Z(aVar.f191985E, hashMap);
        aVar.f191986F = m105887Z(aVar.f191986F, hashMap);
        aVar.f191987G = m105887Z(aVar.f191987G, hashMap);
        aVar.f191988H = m105887Z(aVar.f191988H, hashMap);
        aVar.f191989I = m105887Z(aVar.f191989I, hashMap);
        aVar.f192013x = m105887Z(aVar.f192013x, hashMap);
        aVar.f192014y = m105887Z(aVar.f192014y, hashMap);
        aVar.f192015z = m105887Z(aVar.f192015z, hashMap);
        aVar.f191984D = m105887Z(aVar.f191984D, hashMap);
        aVar.f191981A = m105887Z(aVar.f191981A, hashMap);
        aVar.f191982B = m105887Z(aVar.f191982B, hashMap);
        aVar.f191983C = m105887Z(aVar.f191983C, hashMap);
        aVar.f192002m = m105887Z(aVar.f192002m, hashMap);
        aVar.f192003n = m105887Z(aVar.f192003n, hashMap);
        aVar.f192004o = m105887Z(aVar.f192004o, hashMap);
        aVar.f192005p = m105887Z(aVar.f192005p, hashMap);
        aVar.f192006q = m105887Z(aVar.f192006q, hashMap);
        aVar.f192007r = m105887Z(aVar.f192007r, hashMap);
        aVar.f192008s = m105887Z(aVar.f192008s, hashMap);
        aVar.f192010u = m105887Z(aVar.f192010u, hashMap);
        aVar.f192009t = m105887Z(aVar.f192009t, hashMap);
        aVar.f192011v = m105887Z(aVar.f192011v, hashMap);
        aVar.f192012w = m105887Z(aVar.f192012w, hashMap);
    }

    /* renamed from: b */
    public final long mo63345b(int i, int i2, int i3, int i4) {
        return m105886Y(this.f192053a.mo63345b(i, i2, i3, i4));
    }

    /* renamed from: c */
    public final long mo63346c(int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        return m105886Y(this.f192053a.mo63346c(i, i2, i3, i4, i5, i6, i7));
    }

    /* renamed from: d */
    public final C72132a mo63347d() {
        return this.f192053a;
    }

    /* renamed from: e */
    public final C72132a mo63348e(C72288l lVar) {
        if (lVar == null) {
            lVar = C72288l.m106789p();
        }
        if (lVar == this.f192054b) {
            return this;
        }
        if (lVar == C72288l.f192416b) {
            return this.f192053a;
        }
        return new C72165ak(this.f192053a, lVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C72165ak)) {
            return false;
        }
        C72165ak akVar = (C72165ak) obj;
        return this.f192053a.equals(akVar.f192053a) && ((C72288l) this.f192054b).equals((C72288l) akVar.f192054b);
    }

    public final int hashCode() {
        return (((C72288l) this.f192054b).hashCode() * 11) + 326565 + (this.f192053a.hashCode() * 7);
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f192053a);
        String str = ((C72288l) this.f192054b).f192423d;
        return "ZonedChronology[" + valueOf + ", " + str + "]";
    }

    /* renamed from: W */
    public static C72165ak m105884W(C72132a aVar, C72288l lVar) {
        if (aVar != null) {
            C72132a d = aVar.mo63347d();
            if (d == null) {
                throw new IllegalArgumentException("UTC chronology must not be null");
            } else if (lVar != null) {
                return new C72165ak(d, lVar);
            } else {
                throw new IllegalArgumentException("DateTimeZone must not be null");
            }
        } else {
            throw new IllegalArgumentException("Must supply a chronology");
        }
    }
}
