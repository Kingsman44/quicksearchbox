package kotlinx.coroutines.p5574b;

import kotlinx.coroutines.p5574b.p5575a.C71434af;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5473f.p5474a.C69626l;
import p5462h.p5473f.p5474a.C69630p;
import p5462h.p5473f.p5475b.C69648ae;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: kotlinx.coroutines.b.m */
/* compiled from: PG */
final class C71586m implements C71587n {

    /* renamed from: a */
    public final C69626l f191020a;

    /* renamed from: b */
    public final C69630p f191021b;

    /* renamed from: c */
    private final C71587n f191022c;

    public C71586m(C71587n nVar, C69626l lVar, C69630p pVar) {
        C69664n.m101061g(nVar, "upstream");
        this.f191022c = nVar;
        this.f191020a = lVar;
        this.f191021b = pVar;
    }

    /* renamed from: mp */
    public final Object mo38165mp(C71588o oVar, C69577g gVar) {
        C69648ae aeVar = new C69648ae();
        aeVar.f186027a = C71434af.f190644a;
        Object mp = this.f191022c.mo38165mp(new C71585l(this, aeVar, oVar), gVar);
        return mp == C69554a.COROUTINE_SUSPENDED ? mp : C69788q.f186170a;
    }
}
