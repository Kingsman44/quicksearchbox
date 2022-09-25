package kotlinx.coroutines.p5574b.p5575a;

import kotlinx.coroutines.C71422aw;
import kotlinx.coroutines.p5573a.C71363aq;
import kotlinx.coroutines.p5574b.C71588o;
import kotlinx.coroutines.p5574b.C71592s;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;

@C69567e(mo61343b = "kotlinx.coroutines.flow.internal.ChannelFlow$collect$2", mo61344c = "ChannelFlow.kt", mo61345d = "invokeSuspend", mo61346e = {123})
/* renamed from: kotlinx.coroutines.b.a.e */
/* compiled from: PG */
final class C71448e extends C69572j implements C69630p {

    /* renamed from: a */
    int f190669a;

    /* renamed from: b */
    final /* synthetic */ C71588o f190670b;

    /* renamed from: c */
    final /* synthetic */ C71450g f190671c;

    /* renamed from: d */
    private /* synthetic */ Object f190672d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C71448e(C71588o oVar, C71450g gVar, C69577g gVar2) {
        super(2, gVar2);
        this.f190670b = oVar;
        this.f190671c = gVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C71448e) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f190669a != 0) {
            C69714l.m101134b(obj);
        } else {
            C69714l.m101134b(obj);
            C71588o oVar = this.f190670b;
            C71363aq e = this.f190671c.mo62796e((C71422aw) this.f190672d);
            this.f190669a = 1;
            if (C71592s.m104507a(oVar, e, this) == aVar) {
                return aVar;
            }
        }
        return C69788q.f186170a;
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        C71448e eVar = new C71448e(this.f190670b, this.f190671c, gVar);
        eVar.f190672d = obj;
        return eVar;
    }
}
