package kotlinx.coroutines;

import p5462h.p5466c.C69577g;
import p5462h.p5466c.C69579i;
import p5462h.p5466c.C69585o;
import p5462h.p5466c.C69586p;
import p5462h.p5466c.p5468b.p5469a.C69566d;
import p5462h.p5473f.p5475b.C69648ae;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: kotlinx.coroutines.al */
/* compiled from: PG */
public final class C71405al {
    /* renamed from: a */
    public static final C69585o m104170a(C69585o oVar, C69585o oVar2, boolean z) {
        boolean d = m104173d(oVar);
        boolean d2 = m104173d(oVar2);
        if (!d && !d2) {
            return oVar.plus(oVar2);
        }
        C69648ae aeVar = new C69648ae();
        aeVar.f186027a = oVar2;
        C69585o oVar3 = (C69585o) oVar.fold(C69586p.f185991a, new C71403aj(aeVar, z));
        if (d2) {
            aeVar.f186027a = ((C69585o) aeVar.f186027a).fold(C69586p.f185991a, C71402ai.f190608a);
        }
        return oVar3.plus((C69585o) aeVar.f186027a);
    }

    /* renamed from: b */
    public static final C69585o m104171b(C71422aw awVar, C69585o oVar) {
        C69664n.m101061g(awVar, "<this>");
        C69664n.m101061g(oVar, "context");
        C69585o a = m104170a(awVar.mo5702lZ(), oVar, true);
        C69585o plus = C71600ba.f191036a ? a.plus(new C71419at(C71600ba.f191038c.incrementAndGet())) : a;
        return (a == C71613bn.f191047a || a.get(C69579i.f185989a) != null) ? plus : plus.plus(C71613bn.f191047a);
    }

    /* renamed from: c */
    public static final C71747ec m104172c(C69577g gVar, C69585o oVar, Object obj) {
        C69664n.m101061g(gVar, "<this>");
        C69664n.m101061g(oVar, "context");
        C71747ec ecVar = null;
        if (!(gVar instanceof C69566d)) {
            return null;
        }
        if (oVar.get(C71748ed.f191231a) != null) {
            C69566d dVar = (C69566d) gVar;
            C69664n.m101061g(dVar, "<this>");
            while (true) {
                if (!(dVar instanceof C71610bk) && (dVar = dVar.mo61336eM()) != null) {
                    if (dVar instanceof C71747ec) {
                        ecVar = (C71747ec) dVar;
                        break;
                    }
                } else {
                    break;
                }
            }
            if (ecVar != null) {
                ecVar.mo62989S(oVar, obj);
            }
        }
        return ecVar;
    }

    /* renamed from: d */
    public static final boolean m104173d(C69585o oVar) {
        return ((Boolean) oVar.fold(false, C71404ak.f190611a)).booleanValue();
    }
}
