package kotlinx.coroutines.p5574b;

import p5462h.C69596e;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;
import p5462h.p5473f.p5475b.C69644aa;

@C69567e(mo61343b = "kotlinx.coroutines.flow.StartedLazily$command$1", mo61344c = "SharingStarted.kt", mo61345d = "invokeSuspend", mo61346e = {155})
/* renamed from: kotlinx.coroutines.b.dp */
/* compiled from: PG */
final class C71566dp extends C69572j implements C69630p {

    /* renamed from: a */
    int f190982a;

    /* renamed from: b */
    final /* synthetic */ C71571du f190983b;

    /* renamed from: c */
    private /* synthetic */ Object f190984c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C71566dp(C71571du duVar, C69577g gVar) {
        super(2, gVar);
        this.f190983b = duVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C71566dp) mo5194c((C71588o) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f190982a == 0) {
            C69714l.m101134b(obj);
            C69644aa aaVar = new C69644aa();
            C71571du duVar = this.f190983b;
            C71565do doVar = new C71565do(aaVar, (C71588o) this.f190984c);
            this.f190982a = 1;
            if (duVar.mo38165mp(doVar, this) == aVar) {
                return aVar;
            }
        } else {
            C69714l.m101134b(obj);
        }
        throw new C69596e();
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        C71566dp dpVar = new C71566dp(this.f190983b, gVar);
        dpVar.f190984c = obj;
        return dpVar;
    }
}
