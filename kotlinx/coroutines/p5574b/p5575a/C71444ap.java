package kotlinx.coroutines.p5574b.p5575a;

import kotlinx.coroutines.p5574b.C71588o;
import kotlinx.coroutines.p5579e.C71715aw;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.C69585o;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5473f.p5474a.C69630p;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: kotlinx.coroutines.b.a.ap */
/* compiled from: PG */
final class C71444ap implements C71588o {

    /* renamed from: a */
    private final C69585o f190661a;

    /* renamed from: b */
    private final Object f190662b;

    /* renamed from: c */
    private final C69630p f190663c;

    public C71444ap(C71588o oVar, C69585o oVar2) {
        C69664n.m101061g(oVar, "downstream");
        C69664n.m101061g(oVar2, "emitContext");
        this.f190661a = oVar2;
        this.f190662b = C71715aw.m104855a(oVar2);
        this.f190663c = new C71443ao(oVar, (C69577g) null);
    }

    /* renamed from: a */
    public final Object mo20883a(Object obj, C69577g gVar) {
        Object a = C71451h.m104249a(this.f190661a, obj, this.f190662b, this.f190663c, gVar);
        return a == C69554a.COROUTINE_SUSPENDED ? a : C69788q.f186170a;
    }
}
