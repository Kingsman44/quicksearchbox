package p5488io.grpc.p5526f;

import kotlinx.coroutines.C71422aw;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;
import p5488io.grpc.C70898m;

@C69567e(mo61343b = "io.grpc.kotlin.ClientCalls$rpcImpl$1$1$sender$1", mo61344c = "ClientCalls.kt", mo61345d = "invokeSuspend", mo61346e = {272})
/* renamed from: io.grpc.f.k */
/* compiled from: PG */
final class C70745k extends C69572j implements C69630p {

    /* renamed from: a */
    int f188518a;

    /* renamed from: b */
    final /* synthetic */ C70741g f188519b;

    /* renamed from: c */
    final /* synthetic */ C70898m f188520c;

    /* renamed from: d */
    final /* synthetic */ C70756v f188521d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C70745k(C70741g gVar, C70898m mVar, C70756v vVar, C69577g gVar2) {
        super(2, gVar2);
        this.f188519b = gVar;
        this.f188520c = mVar;
        this.f188521d = vVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C70745k) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f188518a != 0) {
            try {
                C69714l.m101134b(obj);
            } catch (Exception e) {
                this.f188520c.mo27480d("Collection of requests completed exceptionally", e);
                throw e;
            }
        } else {
            C69714l.m101134b(obj);
            C70741g gVar = this.f188519b;
            C70898m mVar = this.f188520c;
            C70756v vVar = this.f188521d;
            this.f188518a = 1;
            if (gVar.mo62436a(mVar, vVar, this) == aVar) {
                return aVar;
            }
        }
        this.f188520c.mo27481f();
        return C69788q.f186170a;
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        return new C70745k(this.f188519b, this.f188520c, this.f188521d, gVar);
    }
}
