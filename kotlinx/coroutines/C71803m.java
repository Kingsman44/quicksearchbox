package kotlinx.coroutines;

import kotlinx.coroutines.p5579e.C71706an;
import kotlinx.coroutines.p5579e.C71715aw;
import kotlinx.coroutines.p5580f.C71753a;
import kotlinx.coroutines.p5580f.C71754b;
import kotlinx.p5572a.C71340c;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.C69579i;
import p5462h.p5466c.C69585o;
import p5462h.p5466c.C69586p;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5473f.p5474a.C69626l;
import p5462h.p5473f.p5474a.C69630p;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: kotlinx.coroutines.m */
/* compiled from: PG */
public final /* synthetic */ class C71803m {
    /* JADX INFO: finally extract failed */
    /* renamed from: a */
    public static final Object m105040a(C69585o oVar, C69630p pVar, C69577g gVar) {
        C69585o oVar2;
        Object obj;
        C69585o lY = gVar.mo61340lY();
        C69664n.m101061g(lY, "<this>");
        C69664n.m101061g(oVar, "addedContext");
        if (!C71405al.m104173d(oVar)) {
            oVar2 = lY.plus(oVar);
        } else {
            oVar2 = C71405al.m104170a(lY, oVar, false);
        }
        C71647ct.m104641e(oVar2);
        if (oVar2 != lY) {
            if (!C69664n.m101066l(oVar2.get(C69579i.f185989a), lY.get(C69579i.f185989a))) {
                C71610bk bkVar = new C71610bk(oVar2, gVar);
                C71753a.m104941c(pVar, bkVar, bkVar, (C69626l) null);
                C71340c cVar = bkVar.f191045b;
                while (true) {
                    int i = cVar.f190526b;
                    if (i == 0) {
                        if (bkVar.f191045b.mo62672a(0, 1)) {
                            obj = C69554a.COROUTINE_SUSPENDED;
                            break;
                        }
                    } else if (i == 2) {
                        obj = C71666db.m104742b(bkVar.mo62913mh());
                        if (obj instanceof C71396ac) {
                            throw ((C71396ac) obj).f190604b;
                        }
                    } else {
                        throw new IllegalStateException("Already suspended");
                    }
                }
            } else {
                C71747ec ecVar = new C71747ec(oVar2, gVar);
                Object b = C71715aw.m104856b(oVar2, (Object) null);
                try {
                    Object a = C71754b.m104942a(ecVar, ecVar, pVar);
                    C71715aw.m104857c(oVar2, b);
                    obj = a;
                } catch (Throwable th) {
                    C71715aw.m104857c(oVar2, b);
                    throw th;
                }
            }
        } else {
            C71706an anVar = new C71706an(oVar2, gVar);
            obj = C71754b.m104942a(anVar, anVar, pVar);
        }
        if (obj == C69554a.COROUTINE_SUSPENDED) {
            C69664n.m101061g(gVar, "frame");
        }
        return obj;
    }

    /* renamed from: b */
    public static final C71643cp m105041b(C71422aw awVar, C69585o oVar, C71424ay ayVar, C69630p pVar) {
        C71345a aVar;
        C69664n.m101061g(awVar, "<this>");
        C69664n.m101061g(oVar, "context");
        C69664n.m101061g(ayVar, "start");
        C69585o b = C71405al.m104171b(awVar, oVar);
        if (ayVar.mo62780a()) {
            aVar = new C71668dd(b, pVar);
        } else {
            aVar = new C71681dq(b, true);
        }
        aVar.mo62684m(ayVar, aVar, pVar);
        return aVar;
    }

    /* renamed from: c */
    public static /* synthetic */ C71604be m105042c(C71422aw awVar, C69585o oVar, C71424ay ayVar, C69630p pVar, int i) {
        C71605bf bfVar;
        if ((i & 1) != 0) {
            oVar = C69586p.f185991a;
        }
        if ((i & 2) != 0) {
            ayVar = C71424ay.DEFAULT;
        }
        C69664n.m101061g(awVar, "<this>");
        C69664n.m101061g(oVar, "context");
        C69664n.m101061g(ayVar, "start");
        C69585o b = C71405al.m104171b(awVar, oVar);
        if (ayVar.mo62780a()) {
            bfVar = new C71667dc(b, pVar);
        } else {
            bfVar = new C71605bf(b, true);
        }
        bfVar.mo62684m(ayVar, bfVar, pVar);
        return bfVar;
    }

    /* renamed from: d */
    public static /* synthetic */ C71643cp m105043d(C71422aw awVar, C69585o oVar, C71424ay ayVar, C69630p pVar, int i) {
        if ((i & 1) != 0) {
            oVar = C69586p.f185991a;
        }
        if ((i & 2) != 0) {
            ayVar = C71424ay.DEFAULT;
        }
        return m105041b(awVar, oVar, ayVar, pVar);
    }
}
