package kotlinx.coroutines.p5574b;

import kotlinx.coroutines.C71422aw;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;

@C69567e(mo61343b = "kotlinx.coroutines.flow.FlowKt__CollectKt$launchIn$1", mo61344c = "Collect.kt", mo61345d = "invokeSuspend", mo61346e = {50})
/* renamed from: kotlinx.coroutines.b.t */
/* compiled from: PG */
final class C71593t extends C69572j implements C69630p {

    /* renamed from: a */
    int f191029a;

    /* renamed from: b */
    final /* synthetic */ C71587n f191030b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C71593t(C71587n nVar, C69577g gVar) {
        super(2, gVar);
        this.f191030b = nVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C71593t) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f191029a != 0) {
            C69714l.m101134b(obj);
        } else {
            C69714l.m101134b(obj);
            C71587n nVar = this.f191030b;
            this.f191029a = 1;
            if (C71594u.m104514a(nVar, this) == aVar) {
                return aVar;
            }
        }
        return C69788q.f186170a;
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        return new C71593t(this.f191030b, gVar);
    }
}
