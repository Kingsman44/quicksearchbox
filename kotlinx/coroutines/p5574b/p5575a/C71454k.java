package kotlinx.coroutines.p5574b.p5575a;

import kotlinx.coroutines.p5573a.C71387t;
import kotlinx.coroutines.p5574b.C71587n;
import kotlinx.coroutines.p5574b.C71588o;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.C69585o;
import p5462h.p5466c.C69586p;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: kotlinx.coroutines.b.a.k */
/* compiled from: PG */
public final class C71454k extends C71453j {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C71454k(C71587n nVar, C69585o oVar, int i, C71387t tVar) {
        super(nVar, oVar, i, tVar);
        C69664n.m101061g(nVar, "flow");
        C69664n.m101061g(oVar, "context");
        C69664n.m101061g(tVar, "onBufferOverflow");
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C71450g mo62793b(C69585o oVar, int i, C71387t tVar) {
        C69664n.m101061g(oVar, "context");
        C69664n.m101061g(tVar, "onBufferOverflow");
        return new C71454k(this.f190682d, oVar, i, tVar);
    }

    /* renamed from: f */
    public final C71587n mo62797f() {
        return this.f190682d;
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public final Object mo62799g(C71588o oVar, C69577g gVar) {
        Object mp = this.f190682d.mo38165mp(oVar, gVar);
        return mp == C69554a.COROUTINE_SUSPENDED ? mp : C69788q.f186170a;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C71454k(C71587n nVar, C69585o oVar, int i, C71387t tVar, int i2) {
        this(nVar, (i2 & 2) != 0 ? C69586p.f185991a : oVar, (i2 & 4) != 0 ? -3 : i, (i2 & 8) != 0 ? C71387t.SUSPEND : tVar);
    }
}
