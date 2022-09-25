package p5488io.grpc.p5526f;

import kotlinx.coroutines.C71423ax;
import kotlinx.coroutines.p5574b.C71588o;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;
import p5488io.grpc.C70334de;
import p5488io.grpc.C70338di;
import p5488io.grpc.C70851i;
import p5488io.grpc.C70888j;

@C69567e(mo61343b = "io.grpc.kotlin.ClientCalls$rpcImpl$1", mo61344c = "ClientCalls.kt", mo61345d = "invokeSuspend", mo61346e = {238})
/* renamed from: io.grpc.f.m */
/* compiled from: PG */
final class C70747m extends C69572j implements C69630p {

    /* renamed from: a */
    int f188532a;

    /* renamed from: b */
    final /* synthetic */ C70888j f188533b;

    /* renamed from: c */
    final /* synthetic */ C70338di f188534c;

    /* renamed from: d */
    final /* synthetic */ C70851i f188535d;

    /* renamed from: e */
    final /* synthetic */ C70334de f188536e;

    /* renamed from: f */
    final /* synthetic */ C70741g f188537f;

    /* renamed from: g */
    private /* synthetic */ Object f188538g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C70747m(C70888j jVar, C70338di diVar, C70851i iVar, C70334de deVar, C70741g gVar, C69577g gVar2) {
        super(2, gVar2);
        this.f188533b = jVar;
        this.f188534c = diVar;
        this.f188535d = iVar;
        this.f188536e = deVar;
        this.f188537f = gVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C70747m) mo5194c((C71588o) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f188532a != 0) {
            C69714l.m101134b(obj);
        } else {
            C69714l.m101134b(obj);
            C70746l lVar = new C70746l(this.f188533b, this.f188534c, this.f188535d, this.f188536e, (C71588o) this.f188538g, this.f188537f, (C69577g) null);
            this.f188532a = 1;
            if (C71423ax.m104196a(lVar, this) == aVar) {
                return aVar;
            }
        }
        return C69788q.f186170a;
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        C70747m mVar = new C70747m(this.f188533b, this.f188534c, this.f188535d, this.f188536e, this.f188537f, gVar);
        mVar.f188538g = obj;
        return mVar;
    }
}
