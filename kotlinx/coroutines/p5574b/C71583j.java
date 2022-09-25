package kotlinx.coroutines.p5574b;

import kotlinx.coroutines.p5573a.C71361ao;
import kotlinx.coroutines.p5573a.C71387t;
import kotlinx.coroutines.p5574b.p5575a.C71450g;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.C69585o;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5473f.p5474a.C69630p;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: kotlinx.coroutines.b.j */
/* compiled from: PG */
class C71583j extends C71450g {

    /* renamed from: d */
    private final C69630p f191013d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C71583j(C69630p pVar, C69585o oVar, int i, C71387t tVar) {
        super(oVar, i, tVar);
        C69664n.m101061g(oVar, "context");
        C69664n.m101061g(tVar, "onBufferOverflow");
        this.f191013d = pVar;
    }

    /* renamed from: g */
    static /* synthetic */ Object m104495g(C71583j jVar, C71361ao aoVar, C69577g gVar) {
        Object a = jVar.f191013d.mo5192a(aoVar, gVar);
        return a == C69554a.COROUTINE_SUSPENDED ? a : C69788q.f186170a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public C71450g mo62793b(C69585o oVar, int i, C71387t tVar) {
        C69664n.m101061g(oVar, "context");
        C69664n.m101061g(tVar, "onBufferOverflow");
        return new C71583j(this.f191013d, oVar, i, tVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public Object mo62794c(C71361ao aoVar, C69577g gVar) {
        return m104495g(this, aoVar, gVar);
    }

    public final String toString() {
        C69630p pVar = this.f191013d;
        String gVar = super.toString();
        return "block[" + pVar + "] -> " + gVar;
    }
}
