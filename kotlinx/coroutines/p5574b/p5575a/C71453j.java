package kotlinx.coroutines.p5574b.p5575a;

import kotlinx.coroutines.p5573a.C71361ao;
import kotlinx.coroutines.p5573a.C71387t;
import kotlinx.coroutines.p5574b.C71587n;
import kotlinx.coroutines.p5574b.C71588o;
import kotlinx.coroutines.p5579e.C71715aw;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.C69579i;
import p5462h.p5466c.C69585o;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: kotlinx.coroutines.b.a.j */
/* compiled from: PG */
public abstract class C71453j extends C71450g {

    /* renamed from: d */
    protected final C71587n f190682d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C71453j(C71587n nVar, C69585o oVar, int i, C71387t tVar) {
        super(oVar, i, tVar);
        C69664n.m101061g(nVar, "flow");
        C69664n.m101061g(oVar, "context");
        C69664n.m101061g(tVar, "onBufferOverflow");
        this.f190682d = nVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final Object mo62794c(C71361ao aoVar, C69577g gVar) {
        Object g = mo62799g(new C71440al(aoVar), gVar);
        return g == C69554a.COROUTINE_SUSPENDED ? g : C69788q.f186170a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public abstract Object mo62799g(C71588o oVar, C69577g gVar);

    /* renamed from: mp */
    public final Object mo38165mp(C71588o oVar, C69577g gVar) {
        if (this.f190677b == -3) {
            C69585o lY = gVar.mo61340lY();
            C69585o plus = lY.plus(this.f190676a);
            if (C69664n.m101066l(plus, lY)) {
                Object g = mo62799g(oVar, gVar);
                if (g != C69554a.COROUTINE_SUSPENDED) {
                    return C69788q.f186170a;
                }
                return g;
            } else if (C69664n.m101066l(plus.get(C69579i.f185989a), lY.get(C69579i.f185989a))) {
                C69585o lY2 = gVar.mo61340lY();
                if (!(oVar instanceof C71440al) && !(oVar instanceof C71433ae)) {
                    oVar = new C71444ap(oVar, lY2);
                }
                Object a = C71451h.m104249a(plus, oVar, C71715aw.m104855a(plus), new C71452i(this, (C69577g) null), gVar);
                C69554a aVar = C69554a.COROUTINE_SUSPENDED;
                if (a != aVar) {
                    a = C69788q.f186170a;
                }
                if (a != aVar) {
                    return C69788q.f186170a;
                }
                return a;
            }
        }
        Object h = C71450g.m104241h(this, oVar, gVar);
        return h != C69554a.COROUTINE_SUSPENDED ? C69788q.f186170a : h;
    }

    public final String toString() {
        C71587n nVar = this.f190682d;
        String gVar = super.toString();
        return nVar + " -> " + gVar;
    }
}
