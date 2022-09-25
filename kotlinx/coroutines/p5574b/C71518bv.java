package kotlinx.coroutines.p5574b;

import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;

@C69567e(mo61343b = "kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharing$1$1", mo61344c = "Share.kt", mo61345d = "invokeSuspend", mo61346e = {})
/* renamed from: kotlinx.coroutines.b.bv */
/* compiled from: PG */
final class C71518bv extends C69572j implements C69630p {

    /* renamed from: a */
    /* synthetic */ int f190862a;

    public C71518bv(C69577g gVar) {
        super(2, gVar);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C71518bv) mo5194c(Integer.valueOf(((Number) obj).intValue()), (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        C69714l.m101134b(obj);
        return Boolean.valueOf(this.f190862a > 0);
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        C71518bv bvVar = new C71518bv(gVar);
        bvVar.f190862a = ((Number) obj).intValue();
        return bvVar;
    }
}
