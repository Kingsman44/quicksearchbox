package org.p5633c.p5634a.p5636b;

import com.evernote.android.state.BuildConfig;
import org.p5633c.p5634a.C72132a;
import org.p5633c.p5634a.C72147ae;
import org.p5633c.p5634a.C72149ag;
import org.p5633c.p5634a.C72210d;
import org.p5633c.p5634a.C72233e;
import org.p5633c.p5634a.C72283g;
import org.p5633c.p5634a.C72288l;
import org.p5633c.p5634a.p5638d.C72216f;
import org.p5633c.p5634a.p5638d.C72217g;
import org.p5633c.p5634a.p5638d.C72222l;
import org.p5633c.p5634a.p5638d.C72226p;
import org.p5633c.p5634a.p5638d.C72229s;
import p3186j$.util.concurrent.ConcurrentHashMap;

/* renamed from: org.c.a.b.o */
/* compiled from: PG */
public final class C72179o extends C72166b {

    /* renamed from: E */
    private static final C72233e f192114E = new C72175k();

    /* renamed from: F */
    private static final ConcurrentHashMap f192115F = new ConcurrentHashMap();

    /* renamed from: G */
    private static final C72179o f192116G = m106099W(C72288l.f192416b);
    private static final long serialVersionUID = -3474595157769370126L;

    private C72179o(C72132a aVar, Object obj) {
        super(aVar, obj);
    }

    /* renamed from: W */
    public static C72179o m106099W(C72288l lVar) {
        if (lVar == null) {
            lVar = C72288l.m106789p();
        }
        ConcurrentHashMap concurrentHashMap = f192115F;
        C72179o oVar = (C72179o) concurrentHashMap.get(lVar);
        if (oVar != null) {
            return oVar;
        }
        C72179o oVar2 = new C72179o(C72184t.m106141Z(lVar, (C72149ag) null, 4), (Object) null);
        C72179o oVar3 = new C72179o(C72162ah.m105839W(oVar2, new C72210d(1, 1, 1, 0, 0, 0, 0, oVar2), (C72147ae) null), BuildConfig.FLAVOR);
        C72179o oVar4 = (C72179o) concurrentHashMap.putIfAbsent(lVar, oVar3);
        return oVar4 == null ? oVar3 : oVar4;
    }

    private Object readResolve() {
        C72132a aVar = this.f192053a;
        return aVar == null ? f192116G : m106099W(aVar.mo63325C());
    }

    /* access modifiers changed from: protected */
    /* renamed from: V */
    public final void mo63441V(C72154a aVar) {
        if (this.f192054b == null) {
            aVar.f191985E = new C72222l(new C72229s(this, aVar.f191985E), 543);
            aVar.f191986F = new C72216f(aVar.f191985E, C72283g.f192388d);
            aVar.f191982B = new C72222l(new C72229s(this, aVar.f191982B), 543);
            aVar.f191988H = new C72217g(new C72222l(aVar.f191986F, 99), C72283g.f192389e);
            C72217g gVar = (C72217g) aVar.f191988H;
            aVar.f191987G = new C72222l(new C72226p(gVar, gVar.f192177i), C72283g.f192390f, 1);
            aVar.f191983C = new C72222l(new C72226p(aVar.f191982B, C72283g.f192395k), C72283g.f192395k, 1);
            aVar.f191989I = f192114E;
        }
    }

    /* renamed from: d */
    public final C72132a mo63347d() {
        return f192116G;
    }

    /* renamed from: e */
    public final C72132a mo63348e(C72288l lVar) {
        if (lVar == null) {
            lVar = C72288l.m106789p();
        }
        if (lVar == mo63325C()) {
            return this;
        }
        return m106099W(lVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C72179o) {
            return mo63325C().equals(((C72179o) obj).mo63325C());
        }
        return false;
    }

    public final int hashCode() {
        return mo63325C().hashCode() + 499287079;
    }

    public final String toString() {
        C72288l C = mo63325C();
        if (C == null) {
            return "BuddhistChronology";
        }
        String str = C.f192423d;
        return "BuddhistChronology[" + str + "]";
    }
}
