package p5488io.grpc.p5526f;

import kotlinx.coroutines.p5574b.C71587n;
import kotlinx.coroutines.p5574b.C71588o;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69626l;
import p5462h.p5473f.p5474a.C69630p;
import p5488io.grpc.C70338di;

@C69567e(mo61343b = "io.grpc.kotlin.ServerCalls$serverStreamingServerMethodDefinition$2$1", mo61344c = "ServerCalls.kt", mo61345d = "invokeSuspend", mo61346e = {134})
/* renamed from: io.grpc.f.af */
/* compiled from: PG */
final class C70729af extends C69572j implements C69630p {

    /* renamed from: a */
    int f188484a;

    /* renamed from: b */
    final /* synthetic */ C71587n f188485b;

    /* renamed from: c */
    final /* synthetic */ C70338di f188486c;

    /* renamed from: d */
    final /* synthetic */ C69626l f188487d;

    /* renamed from: e */
    private /* synthetic */ Object f188488e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C70729af(C71587n nVar, C70338di diVar, C69626l lVar, C69577g gVar) {
        super(2, gVar);
        this.f188485b = nVar;
        this.f188486c = diVar;
        this.f188487d = lVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C70729af) mo5194c((C71588o) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f188484a != 0) {
            C69714l.m101134b(obj);
        } else {
            C69714l.m101134b(obj);
            C71587n a = C70754t.m103459a(this.f188485b, this.f188486c);
            C70728ae aeVar = new C70728ae(this.f188487d, (C71588o) this.f188488e);
            this.f188484a = 1;
            if (a.mo38165mp(aeVar, this) == aVar) {
                return aVar;
            }
        }
        return C69788q.f186170a;
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        C70729af afVar = new C70729af(this.f188485b, this.f188486c, this.f188487d, gVar);
        afVar.f188488e = obj;
        return afVar;
    }
}
