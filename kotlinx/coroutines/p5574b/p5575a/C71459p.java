package kotlinx.coroutines.p5574b.p5575a;

import kotlinx.coroutines.C71423ax;
import kotlinx.coroutines.C71600ba;
import kotlinx.coroutines.p5573a.C71387t;
import kotlinx.coroutines.p5574b.C71587n;
import kotlinx.coroutines.p5574b.C71588o;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.C69585o;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5473f.p5474a.C69631q;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: kotlinx.coroutines.b.a.p */
/* compiled from: PG */
public final class C71459p extends C71453j {

    /* renamed from: e */
    public final C69631q f190701e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C71459p(C69631q qVar, C71587n nVar, C69585o oVar, int i, C71387t tVar) {
        super(nVar, oVar, i, tVar);
        C69664n.m101061g(nVar, "flow");
        C69664n.m101061g(oVar, "context");
        C69664n.m101061g(tVar, "onBufferOverflow");
        this.f190701e = qVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C71450g mo62793b(C69585o oVar, int i, C71387t tVar) {
        C69664n.m101061g(oVar, "context");
        C69664n.m101061g(tVar, "onBufferOverflow");
        return new C71459p(this.f190701e, this.f190682d, oVar, i, tVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public final Object mo62799g(C71588o oVar, C69577g gVar) {
        boolean z = C71600ba.f191036a;
        Object a = C71423ax.m104196a(new C71458o(this, oVar, (C69577g) null), gVar);
        return a == C69554a.COROUTINE_SUSPENDED ? a : C69788q.f186170a;
    }
}
