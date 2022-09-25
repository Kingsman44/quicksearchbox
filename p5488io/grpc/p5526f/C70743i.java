package p5488io.grpc.p5526f;

import kotlinx.coroutines.C71422aw;
import kotlinx.coroutines.C71643cp;
import kotlinx.coroutines.C71647ct;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;
import p5488io.grpc.C70898m;

@C69567e(mo61343b = "io.grpc.kotlin.ClientCalls$rpcImpl$1$1$2", mo61344c = "ClientCalls.kt", mo61345d = "invokeSuspend", mo61346e = {288})
/* renamed from: io.grpc.f.i */
/* compiled from: PG */
final class C70743i extends C69572j implements C69630p {

    /* renamed from: a */
    int f188513a;

    /* renamed from: b */
    final /* synthetic */ C71643cp f188514b;

    /* renamed from: c */
    final /* synthetic */ Exception f188515c;

    /* renamed from: d */
    final /* synthetic */ C70898m f188516d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C70743i(C71643cp cpVar, Exception exc, C70898m mVar, C69577g gVar) {
        super(2, gVar);
        this.f188514b = cpVar;
        this.f188515c = exc;
        this.f188516d = mVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C70743i) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f188513a != 0) {
            C69714l.m101134b(obj);
        } else {
            C69714l.m101134b(obj);
            C71643cp cpVar = this.f188514b;
            Exception exc = this.f188515c;
            this.f188513a = 1;
            C71647ct.m104640d(cpVar, "Collection of responses completed exceptionally", exc);
            Object o = cpVar.mo62869o(this);
            if (o != C69554a.COROUTINE_SUSPENDED) {
                o = C69788q.f186170a;
            }
            if (o == aVar) {
                return aVar;
            }
        }
        this.f188516d.mo27480d("Collection of responses completed exceptionally", this.f188515c);
        return C69788q.f186170a;
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        return new C70743i(this.f188514b, this.f188515c, this.f188516d, gVar);
    }
}
