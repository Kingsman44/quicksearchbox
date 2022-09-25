package kotlinx.coroutines.p5574b.p5575a;

import kotlinx.coroutines.p5574b.C71588o;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;

@C69567e(mo61343b = "kotlinx.coroutines.flow.internal.UndispatchedContextCollector$emitRef$1", mo61344c = "ChannelFlow.kt", mo61345d = "invokeSuspend", mo61346e = {212})
/* renamed from: kotlinx.coroutines.b.a.ao */
/* compiled from: PG */
final class C71443ao extends C69572j implements C69630p {

    /* renamed from: a */
    int f190658a;

    /* renamed from: b */
    /* synthetic */ Object f190659b;

    /* renamed from: c */
    final /* synthetic */ C71588o f190660c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C71443ao(C71588o oVar, C69577g gVar) {
        super(2, gVar);
        this.f190660c = oVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C71443ao) mo5194c(obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f190658a != 0) {
            C69714l.m101134b(obj);
        } else {
            C69714l.m101134b(obj);
            Object obj2 = this.f190659b;
            C71588o oVar = this.f190660c;
            this.f190658a = 1;
            if (oVar.mo20883a(obj2, this) == aVar) {
                return aVar;
            }
        }
        return C69788q.f186170a;
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        C71443ao aoVar = new C71443ao(this.f190660c, gVar);
        aoVar.f190659b = obj;
        return aoVar;
    }
}
