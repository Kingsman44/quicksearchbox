package kotlinx.coroutines.p5574b.p5575a;

import kotlinx.coroutines.p5579e.C71715aw;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.C69585o;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5473f.p5474a.C69630p;
import p5462h.p5473f.p5475b.C69651ah;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: kotlinx.coroutines.b.a.h */
/* compiled from: PG */
public final class C71451h {
    /* JADX INFO: finally extract failed */
    /* renamed from: a */
    public static final Object m104249a(C69585o oVar, Object obj, Object obj2, C69630p pVar, C69577g gVar) {
        Object b = C71715aw.m104856b(oVar, obj2);
        try {
            C71441am amVar = new C71441am(gVar, oVar);
            C69651ah.m101037b(pVar, 2);
            Object a = pVar.mo5192a(obj, amVar);
            C71715aw.m104857c(oVar, b);
            if (a == C69554a.COROUTINE_SUSPENDED) {
                C69664n.m101061g(gVar, "frame");
            }
            return a;
        } catch (Throwable th) {
            C71715aw.m104857c(oVar, b);
            throw th;
        }
    }
}
