package kotlinx.coroutines.p5574b.p5575a;

import kotlinx.coroutines.C71422aw;
import kotlinx.coroutines.p5574b.C71587n;
import kotlinx.coroutines.p5574b.C71588o;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;
import p5462h.p5473f.p5475b.C69648ae;

@C69567e(mo61343b = "kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest$flowCollect$3", mo61344c = "Merge.kt", mo61345d = "invokeSuspend", mo61346e = {27})
/* renamed from: kotlinx.coroutines.b.a.o */
/* compiled from: PG */
final class C71458o extends C69572j implements C69630p {

    /* renamed from: a */
    int f190697a;

    /* renamed from: b */
    final /* synthetic */ C71459p f190698b;

    /* renamed from: c */
    final /* synthetic */ C71588o f190699c;

    /* renamed from: d */
    private /* synthetic */ Object f190700d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C71458o(C71459p pVar, C71588o oVar, C69577g gVar) {
        super(2, gVar);
        this.f190698b = pVar;
        this.f190699c = oVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C71458o) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f190697a != 0) {
            C69714l.m101134b(obj);
        } else {
            C69714l.m101134b(obj);
            C69648ae aeVar = new C69648ae();
            C71459p pVar = this.f190698b;
            C71587n nVar = pVar.f190682d;
            C71457n nVar2 = new C71457n(aeVar, (C71422aw) this.f190700d, pVar, this.f190699c);
            this.f190697a = 1;
            if (nVar.mo38165mp(nVar2, this) == aVar) {
                return aVar;
            }
        }
        return C69788q.f186170a;
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        C71458o oVar = new C71458o(this.f190698b, this.f190699c, gVar);
        oVar.f190700d = obj;
        return oVar;
    }
}
