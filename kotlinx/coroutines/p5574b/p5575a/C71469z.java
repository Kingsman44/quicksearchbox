package kotlinx.coroutines.p5574b.p5575a;

import kotlinx.coroutines.p5579e.C71706an;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.C69585o;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: kotlinx.coroutines.b.a.z */
/* compiled from: PG */
final class C71469z extends C71706an {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C71469z(C69585o oVar, C69577g gVar) {
        super(oVar, gVar);
        C69664n.m101061g(oVar, "context");
        C69664n.m101061g(gVar, "uCont");
    }

    /* renamed from: N */
    public final boolean mo62801N(Throwable th) {
        C69664n.m101061g(th, "cause");
        if (th instanceof C71462s) {
            return true;
        }
        return mo62907M(th);
    }
}
