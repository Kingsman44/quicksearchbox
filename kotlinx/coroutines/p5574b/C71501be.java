package kotlinx.coroutines.p5574b;

import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5473f.p5474a.C69630p;

/* renamed from: kotlinx.coroutines.b.be */
/* compiled from: PG */
public final class C71501be implements C71587n {

    /* renamed from: a */
    final /* synthetic */ C71587n f190819a;

    /* renamed from: b */
    final /* synthetic */ C69630p f190820b;

    public C71501be(C71587n nVar, C69630p pVar) {
        this.f190819a = nVar;
        this.f190820b = pVar;
    }

    /* renamed from: mp */
    public final Object mo38165mp(C71588o oVar, C69577g gVar) {
        Object mp = this.f190819a.mo38165mp(new C71500bd(oVar, this.f190820b), gVar);
        return mp == C69554a.COROUTINE_SUSPENDED ? mp : C69788q.f186170a;
    }
}
