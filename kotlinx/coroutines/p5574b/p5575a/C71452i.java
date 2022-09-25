package kotlinx.coroutines.p5574b.p5575a;

import kotlinx.coroutines.p5574b.C71588o;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;

@C69567e(mo61343b = "kotlinx.coroutines.flow.internal.ChannelFlowOperator$collectWithContextUndispatched$2", mo61344c = "ChannelFlow.kt", mo61345d = "invokeSuspend", mo61346e = {152})
/* renamed from: kotlinx.coroutines.b.a.i */
/* compiled from: PG */
final class C71452i extends C69572j implements C69630p {

    /* renamed from: a */
    int f190679a;

    /* renamed from: b */
    /* synthetic */ Object f190680b;

    /* renamed from: c */
    final /* synthetic */ C71453j f190681c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C71452i(C71453j jVar, C69577g gVar) {
        super(2, gVar);
        this.f190681c = jVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C71452i) mo5194c((C71588o) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f190679a != 0) {
            C69714l.m101134b(obj);
        } else {
            C69714l.m101134b(obj);
            C71453j jVar = this.f190681c;
            this.f190679a = 1;
            if (jVar.mo62799g((C71588o) this.f190680b, this) == aVar) {
                return aVar;
            }
        }
        return C69788q.f186170a;
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        C71452i iVar = new C71452i(this.f190681c, gVar);
        iVar.f190680b = obj;
        return iVar;
    }
}
