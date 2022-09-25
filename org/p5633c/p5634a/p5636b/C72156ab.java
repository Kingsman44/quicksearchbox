package org.p5633c.p5634a.p5636b;

import org.p5633c.p5634a.C72132a;
import org.p5633c.p5634a.C72283g;
import org.p5633c.p5634a.C72288l;
import org.p5633c.p5634a.p5638d.C72217g;
import org.p5633c.p5634a.p5638d.C72226p;
import p3186j$.util.concurrent.ConcurrentHashMap;

/* renamed from: org.c.a.b.ab */
/* compiled from: PG */
public final class C72156ab extends C72166b {

    /* renamed from: E */
    public static final C72156ab f192017E;

    /* renamed from: F */
    private static final ConcurrentHashMap f192018F;
    private static final long serialVersionUID = -6212696554273812441L;

    static {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        f192018F = concurrentHashMap;
        C72156ab abVar = new C72156ab(C72190z.f192153H);
        f192017E = abVar;
        concurrentHashMap.put(C72288l.f192416b, abVar);
    }

    private C72156ab(C72132a aVar) {
        super(aVar, (Object) null);
    }

    /* renamed from: W */
    public static C72156ab m105788W() {
        return m105789X(C72288l.m106789p());
    }

    /* renamed from: X */
    public static C72156ab m105789X(C72288l lVar) {
        if (lVar == null) {
            lVar = C72288l.m106789p();
        }
        ConcurrentHashMap concurrentHashMap = f192018F;
        C72156ab abVar = (C72156ab) concurrentHashMap.get(lVar);
        if (abVar == null) {
            abVar = new C72156ab(C72165ak.m105884W(f192017E, lVar));
            C72156ab abVar2 = (C72156ab) concurrentHashMap.putIfAbsent(lVar, abVar);
            return abVar2 == null ? abVar : abVar2;
        }
    }

    private Object writeReplace() {
        return new C72155aa(mo63325C());
    }

    /* access modifiers changed from: protected */
    /* renamed from: V */
    public final void mo63441V(C72154a aVar) {
        if (this.f192053a.mo63325C() == C72288l.f192416b) {
            aVar.f191988H = new C72217g(C72157ac.f192019a, C72283g.f192389e);
            aVar.f191987G = new C72226p((C72217g) aVar.f191988H, C72283g.f192390f);
            aVar.f191983C = new C72226p((C72217g) aVar.f191988H, C72283g.f192395k);
            aVar.f192000k = aVar.f191988H.mo63464A();
        }
    }

    /* renamed from: d */
    public final C72132a mo63347d() {
        return f192017E;
    }

    /* renamed from: e */
    public final C72132a mo63348e(C72288l lVar) {
        if (lVar == null) {
            lVar = C72288l.m106789p();
        }
        if (lVar == mo63325C()) {
            return this;
        }
        return m105789X(lVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C72156ab) {
            return mo63325C().equals(((C72156ab) obj).mo63325C());
        }
        return false;
    }

    public final int hashCode() {
        return mo63325C().hashCode() + 800855;
    }

    public final String toString() {
        C72288l C = mo63325C();
        if (C == null) {
            return "ISOChronology";
        }
        String str = C.f192423d;
        return "ISOChronology[" + str + "]";
    }
}
