package kotlinx.coroutines.p5574b.p5575a;

import kotlinx.coroutines.C71422aw;
import kotlinx.coroutines.p5574b.C71587n;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;

@C69567e(mo61343b = "kotlinx.coroutines.flow.internal.ChannelLimitedFlowMerge$collectTo$2$1", mo61344c = "Merge.kt", mo61345d = "invokeSuspend", mo61346e = {96})
/* renamed from: kotlinx.coroutines.b.a.q */
/* compiled from: PG */
final class C71460q extends C69572j implements C69630p {

    /* renamed from: a */
    int f190702a;

    /* renamed from: b */
    final /* synthetic */ C71587n f190703b;

    /* renamed from: c */
    final /* synthetic */ C71440al f190704c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C71460q(C71587n nVar, C71440al alVar, C69577g gVar) {
        super(2, gVar);
        this.f190703b = nVar;
        this.f190704c = alVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C71460q) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f190702a != 0) {
            C69714l.m101134b(obj);
        } else {
            C69714l.m101134b(obj);
            C71587n nVar = this.f190703b;
            C71440al alVar = this.f190704c;
            this.f190702a = 1;
            if (nVar.mo38165mp(alVar, this) == aVar) {
                return aVar;
            }
        }
        return C69788q.f186170a;
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        return new C71460q(this.f190703b, this.f190704c, gVar);
    }
}
