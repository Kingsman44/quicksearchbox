package kotlinx.coroutines.p5574b.p5575a;

import kotlinx.coroutines.C71647ct;
import kotlinx.coroutines.p5574b.C71588o;
import p5462h.C69702k;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.C69585o;
import p5462h.p5466c.C69586p;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69565c;
import p5462h.p5466c.p5468b.p5469a.C69566d;
import p5462h.p5473f.p5474a.C69631q;
import p5462h.p5473f.p5475b.C69664n;
import p5462h.p5483m.C69764m;

/* renamed from: kotlinx.coroutines.b.a.ah */
/* compiled from: PG */
public final class C71436ah extends C69565c implements C71588o, C69566d {

    /* renamed from: a */
    public final C71588o f190647a;

    /* renamed from: b */
    public final C69585o f190648b;

    /* renamed from: c */
    public final int f190649c;

    /* renamed from: d */
    private C69585o f190650d;

    /* renamed from: e */
    private C69577g f190651e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C71436ah(C71588o oVar, C69585o oVar2) {
        super(C71432ad.f190641a, C69586p.f185991a);
        C69664n.m101061g(oVar, "collector");
        C69664n.m101061g(oVar2, "collectContext");
        this.f190647a = oVar;
        this.f190648b = oVar2;
        this.f190649c = ((Number) oVar2.fold(0, C71435ag.f190646a)).intValue();
    }

    /* renamed from: a */
    public final Object mo20883a(Object obj, C69577g gVar) {
        try {
            C69585o lY = gVar.mo61340lY();
            C71647ct.m104641e(lY);
            C69585o oVar = this.f190650d;
            if (oVar != lY) {
                if (!(oVar instanceof C71468y)) {
                    C69664n.m101061g(lY, "currentContext");
                    if (((Number) lY.fold(0, new C71439ak(this))).intValue() == this.f190649c) {
                        this.f190650d = lY;
                    } else {
                        C69585o oVar2 = this.f190648b;
                        throw new IllegalStateException("Flow invariant is violated:\n\t\tFlow was collected in " + oVar2 + ",\n\t\tbut emission happened in " + lY + ".\n\t\tPlease refer to 'flow' documentation or use 'flowOn' instead");
                    }
                } else {
                    Throwable th = ((C71468y) oVar).f190726a;
                    throw new IllegalStateException(C69764m.m101223c("\n            Flow exception transparency is violated:\n                Previous 'emit' call has thrown exception " + th + ", but then emission attempt of value '" + obj + "' has been detected.\n                Emissions from 'catch' blocks are prohibited in order to avoid unspecified behaviour, 'Flow.catch' operator can be used instead.\n                For a more detailed explanation, please refer to Flow documentation.\n            ").toString());
                }
            }
            this.f190651e = gVar;
            C69631q qVar = C71438aj.f190653a;
            C71588o oVar3 = this.f190647a;
            C69664n.m101059e(oVar3, "null cannot be cast to non-null type kotlinx.coroutines.flow.FlowCollector<kotlin.Any?>");
            Object a = qVar.mo17419a(oVar3, obj, this);
            if (!C69664n.m101066l(a, C69554a.COROUTINE_SUSPENDED)) {
                this.f190651e = null;
            }
            if (a == C69554a.COROUTINE_SUSPENDED) {
                C69664n.m101061g(gVar, "frame");
            }
            if (a == C69554a.COROUTINE_SUSPENDED) {
                return a;
            }
            return C69788q.f186170a;
        } catch (Throwable th2) {
            this.f190650d = new C71468y(th2, gVar.mo61340lY());
            throw th2;
        }
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        Throwable a = C69702k.m101124a(obj);
        if (a != null) {
            this.f190650d = new C71468y(a, mo61340lY());
        }
        C69577g gVar = this.f190651e;
        if (gVar != null) {
            gVar.mo61338mb(obj);
        }
        return C69554a.COROUTINE_SUSPENDED;
    }

    /* renamed from: eL */
    public final StackTraceElement mo61335eL() {
        return null;
    }

    /* renamed from: eM */
    public final C69566d mo61336eM() {
        C69577g gVar = this.f190651e;
        if (gVar instanceof C69566d) {
            return (C69566d) gVar;
        }
        return null;
    }

    /* renamed from: i */
    public final void mo61337i() {
        super.mo61337i();
    }

    /* renamed from: lY */
    public final C69585o mo61340lY() {
        C69585o oVar = this.f190650d;
        return oVar == null ? C69586p.f185991a : oVar;
    }
}
