package kotlinx.coroutines.p5574b.p5575a;

import kotlinx.coroutines.p5573a.C71361ao;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;

@C69567e(mo61343b = "kotlinx.coroutines.flow.internal.ChannelFlow$collectToFun$1", mo61344c = "ChannelFlow.kt", mo61345d = "invokeSuspend", mo61346e = {60})
/* renamed from: kotlinx.coroutines.b.a.f */
/* compiled from: PG */
final class C71449f extends C69572j implements C69630p {

    /* renamed from: a */
    int f190673a;

    /* renamed from: b */
    /* synthetic */ Object f190674b;

    /* renamed from: c */
    final /* synthetic */ C71450g f190675c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C71449f(C71450g gVar, C69577g gVar2) {
        super(2, gVar2);
        this.f190675c = gVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C71449f) mo5194c((C71361ao) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f190673a != 0) {
            C69714l.m101134b(obj);
        } else {
            C69714l.m101134b(obj);
            C71450g gVar = this.f190675c;
            this.f190673a = 1;
            if (gVar.mo62794c((C71361ao) this.f190674b, this) == aVar) {
                return aVar;
            }
        }
        return C69788q.f186170a;
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        C71449f fVar = new C71449f(this.f190675c, gVar);
        fVar.f190674b = obj;
        return fVar;
    }
}
