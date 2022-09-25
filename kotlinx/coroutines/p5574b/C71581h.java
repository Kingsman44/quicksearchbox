package kotlinx.coroutines.p5574b;

import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: kotlinx.coroutines.b.h */
/* compiled from: PG */
final class C71581h implements C71577e {

    /* renamed from: a */
    private final C71587n f191010a;

    public C71581h(C71587n nVar) {
        C69664n.m101061g(nVar, "flow");
        this.f191010a = nVar;
    }

    /* renamed from: mp */
    public final Object mo38165mp(C71588o oVar, C69577g gVar) {
        Object mp = this.f191010a.mo38165mp(new C71580g(oVar), gVar);
        return mp == C69554a.COROUTINE_SUSPENDED ? mp : C69788q.f186170a;
    }
}
