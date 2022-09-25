package p5462h.p5466c.p5467a;

import p5462h.p5466c.C69577g;
import p5462h.p5466c.C69579i;
import p5462h.p5466c.C69585o;
import p5462h.p5466c.C69586p;
import p5462h.p5466c.p5468b.p5469a.C69563a;
import p5462h.p5466c.p5468b.p5469a.C69565c;
import p5462h.p5473f.p5474a.C69630p;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: h.c.a.g */
/* compiled from: PG */
class C69560g {
    /* renamed from: a */
    public static final C69577g m100960a(C69630p pVar, Object obj, C69577g gVar) {
        C69664n.m101061g(pVar, "<this>");
        C69664n.m101061g(gVar, "completion");
        C69664n.m101061g(gVar, "completion");
        if (pVar instanceof C69563a) {
            return ((C69563a) pVar).mo5194c(obj, gVar);
        }
        C69585o lY = gVar.mo61340lY();
        if (lY == C69586p.f185991a) {
            return new C69558e(gVar, pVar, obj);
        }
        return new C69559f(gVar, lY, pVar, obj);
    }

    /* renamed from: b */
    public static final C69577g m100961b(C69577g gVar) {
        C69664n.m101061g(gVar, "<this>");
        C69565c cVar = gVar instanceof C69565c ? (C69565c) gVar : null;
        if (cVar == null) {
            return gVar;
        }
        C69577g gVar2 = cVar.f185975t;
        if (gVar2 == null) {
            C69579i iVar = (C69579i) cVar.mo61340lY().get(C69579i.f185989a);
            if (iVar == null || (gVar2 = iVar.mo61352lW(cVar)) == null) {
                gVar2 = cVar;
            }
            cVar.f185975t = gVar2;
        }
        return gVar2 != null ? gVar2 : gVar;
    }
}
