package kotlinx.coroutines.p5574b.p5575a;

import kotlinx.coroutines.p5574b.C71587n;
import kotlinx.coroutines.p5574b.C71588o;
import kotlinx.coroutines.p5580f.C71754b;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5473f.p5474a.C69615a;
import p5462h.p5473f.p5474a.C69631q;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: kotlinx.coroutines.b.a.x */
/* compiled from: PG */
public final class C71467x {
    /* renamed from: a */
    public static final Object m104283a(C71588o oVar, C71587n[] nVarArr, C69615a aVar, C69631q qVar, C69577g gVar) {
        C71466w wVar = new C71466w(nVarArr, aVar, qVar, oVar, (C69577g) null);
        C71469z zVar = new C71469z(gVar.mo61340lY(), gVar);
        Object a = C71754b.m104942a(zVar, zVar, wVar);
        if (a == C69554a.COROUTINE_SUSPENDED) {
            C69664n.m101061g(gVar, "frame");
        }
        return a == C69554a.COROUTINE_SUSPENDED ? a : C69788q.f186170a;
    }
}
