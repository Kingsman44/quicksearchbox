package kotlinx.coroutines.p5574b.p5575a;

import kotlinx.coroutines.C71422aw;
import kotlinx.coroutines.p5574b.C71588o;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;
import p5462h.p5473f.p5474a.C69631q;

@C69567e(mo61343b = "kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest$flowCollect$3$1$2", mo61344c = "Merge.kt", mo61345d = "invokeSuspend", mo61346e = {34})
/* renamed from: kotlinx.coroutines.b.a.l */
/* compiled from: PG */
final class C71455l extends C69572j implements C69630p {

    /* renamed from: a */
    int f190683a;

    /* renamed from: b */
    final /* synthetic */ C71459p f190684b;

    /* renamed from: c */
    final /* synthetic */ C71588o f190685c;

    /* renamed from: d */
    final /* synthetic */ Object f190686d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C71455l(C71459p pVar, C71588o oVar, Object obj, C69577g gVar) {
        super(2, gVar);
        this.f190684b = pVar;
        this.f190685c = oVar;
        this.f190686d = obj;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C71455l) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f190683a != 0) {
            C69714l.m101134b(obj);
        } else {
            C69714l.m101134b(obj);
            C69631q qVar = this.f190684b.f190701e;
            C71588o oVar = this.f190685c;
            Object obj2 = this.f190686d;
            this.f190683a = 1;
            if (qVar.mo17419a(oVar, obj2, this) == aVar) {
                return aVar;
            }
        }
        return C69788q.f186170a;
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        return new C71455l(this.f190684b, this.f190685c, this.f190686d, gVar);
    }
}
