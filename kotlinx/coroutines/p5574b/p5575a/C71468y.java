package kotlinx.coroutines.p5574b.p5575a;

import p5462h.p5466c.C69582l;
import p5462h.p5466c.C69583m;
import p5462h.p5466c.C69585o;
import p5462h.p5473f.p5474a.C69630p;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: kotlinx.coroutines.b.a.y */
/* compiled from: PG */
public final class C71468y implements C69585o {

    /* renamed from: a */
    public final Throwable f190726a;

    /* renamed from: b */
    private final /* synthetic */ C69585o f190727b;

    public C71468y(Throwable th, C69585o oVar) {
        C69664n.m101061g(oVar, "originalContext");
        this.f190726a = th;
        this.f190727b = oVar;
    }

    public final Object fold(Object obj, C69630p pVar) {
        C69664n.m101061g(pVar, "operation");
        return this.f190727b.fold(obj, pVar);
    }

    public final C69582l get(C69583m mVar) {
        C69664n.m101061g(mVar, "key");
        return this.f190727b.get(mVar);
    }

    public final C69585o minusKey(C69583m mVar) {
        C69664n.m101061g(mVar, "key");
        return this.f190727b.minusKey(mVar);
    }

    public final C69585o plus(C69585o oVar) {
        C69664n.m101061g(oVar, "context");
        return this.f190727b.plus(oVar);
    }
}
