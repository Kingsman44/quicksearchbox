package kotlinx.coroutines.p5580f;

import kotlinx.coroutines.C71396ac;
import kotlinx.coroutines.C71600ba;
import kotlinx.coroutines.C71666db;
import kotlinx.coroutines.p5579e.C71706an;
import kotlinx.coroutines.p5579e.C71707ao;
import p5462h.C69714l;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69566d;
import p5462h.p5473f.p5474a.C69630p;
import p5462h.p5473f.p5475b.C69651ah;

/* renamed from: kotlinx.coroutines.f.b */
/* compiled from: PG */
public final class C71754b {
    /* renamed from: a */
    public static final Object m104942a(C71706an anVar, Object obj, C69630p pVar) {
        Object obj2;
        try {
            C69651ah.m101037b(pVar, 2);
            obj2 = pVar.mo5192a(obj, anVar);
        } catch (Throwable th) {
            obj2 = new C71396ac(th, false);
        }
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (obj2 == aVar) {
            return aVar;
        }
        Object E = anVar.mo62901E(obj2);
        if (E == C71666db.f191120b) {
            return C69554a.COROUTINE_SUSPENDED;
        }
        if (!(E instanceof C71396ac)) {
            return C71666db.m104742b(E);
        }
        Throwable th2 = ((C71396ac) E).f190604b;
        C69577g gVar = anVar.f191173e;
        if (!C71600ba.f191037b || !(gVar instanceof C69566d)) {
            throw th2;
        }
        throw C71707ao.m104840a(th2, (C69566d) gVar);
    }

    /* renamed from: b */
    public static final void m104943b(C69630p pVar, Object obj, C69577g gVar) {
        try {
            C69651ah.m101037b(pVar, 2);
            Object a = pVar.mo5192a(obj, gVar);
            if (a != C69554a.COROUTINE_SUSPENDED) {
                gVar.mo61338mb(a);
            }
        } catch (Throwable th) {
            gVar.mo61338mb(C69714l.m101133a(th));
        }
    }
}
