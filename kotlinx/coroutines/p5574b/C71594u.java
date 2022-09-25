package kotlinx.coroutines.p5574b;

import kotlinx.coroutines.C71422aw;
import kotlinx.coroutines.C71424ay;
import kotlinx.coroutines.C71643cp;
import kotlinx.coroutines.C71803m;
import kotlinx.coroutines.p5573a.C71387t;
import kotlinx.coroutines.p5574b.p5575a.C71433ae;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.C69585o;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5473f.p5474a.C69630p;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: kotlinx.coroutines.b.u */
/* compiled from: PG */
public final /* synthetic */ class C71594u {
    /* renamed from: a */
    public static final Object m104514a(C71587n nVar, C69577g gVar) {
        Object mp = nVar.mo38165mp(C71433ae.f190643a, gVar);
        return mp == C69554a.COROUTINE_SUSPENDED ? mp : C69788q.f186170a;
    }

    /* renamed from: b */
    public static final Object m104515b(C71587n nVar, C69630p pVar, C69577g gVar) {
        Object a = m104514a(C71598y.m104521a(C71506bj.m104336b(nVar, pVar), 0, C71387t.SUSPEND), gVar);
        return a == C69554a.COROUTINE_SUSPENDED ? a : C69788q.f186170a;
    }

    /* renamed from: c */
    public static final Object m104516c(C71588o oVar, C71587n nVar, C69577g gVar) {
        C71477ah.m104297d(oVar);
        Object mp = nVar.mo38165mp(oVar, gVar);
        return mp == C69554a.COROUTINE_SUSPENDED ? mp : C69788q.f186170a;
    }

    /* renamed from: d */
    public static final C71643cp m104517d(C71587n nVar, C71422aw awVar) {
        C69664n.m101061g(nVar, "<this>");
        C69664n.m101061g(awVar, "scope");
        return C71803m.m105043d(awVar, (C69585o) null, (C71424ay) null, new C71593t(nVar, (C69577g) null), 3);
    }
}
