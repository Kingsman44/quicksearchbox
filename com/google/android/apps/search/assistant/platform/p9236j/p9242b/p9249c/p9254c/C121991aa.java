package com.google.android.apps.search.assistant.platform.p9236j.p9242b.p9249c.p9254c;

import com.google.android.apps.search.assistant.platform.p9236j.p9242b.p9249c.p9252b.C121952m;
import com.google.protobuf.C62942bv;
import kotlinx.coroutines.C71422aw;
import kotlinx.coroutines.p5574b.C71477ah;
import kotlinx.coroutines.p5574b.C71536cm;
import kotlinx.coroutines.p5574b.C71594u;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;
import p5462h.p5473f.p5475b.C69664n;
import p5488io.grpc.C70334de;
import p5488io.grpc.p5526f.C70748n;

@C69567e(mo61343b = "com.google.android.apps.search.assistant.platform.triggering.invocations.vis.vistoken.ApaVisTokenClientImpl$subscribeToStates$subscription$1", mo61344c = "ApaVisTokenClientImpl.kt", mo61345d = "invokeSuspend", mo61346e = {})
/* renamed from: com.google.android.apps.search.assistant.platform.j.b.c.c.aa */
/* compiled from: PG */
final class C121991aa extends C69572j implements C69630p {

    /* renamed from: a */
    final /* synthetic */ C121992ab f338516a;

    /* renamed from: b */
    final /* synthetic */ C121952m f338517b;

    /* renamed from: c */
    private /* synthetic */ Object f338518c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C121991aa(C121992ab abVar, C121952m mVar, C69577g gVar) {
        super(2, gVar);
        this.f338516a = abVar;
        this.f338517b = mVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C121991aa) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        C69714l.m101134b(obj);
        C122000aj ajVar = this.f338516a.f338521c;
        C122032o oVar = (C122032o) C122033p.f338581a.createBuilder();
        C69664n.m101060f(oVar, "newBuilder()");
        C69664n.m101061g(oVar, "builder");
        C62942bv build = oVar.build();
        C69664n.m101060f(build, "_builder.build()");
        C122033p pVar = (C122033p) build;
        C70334de deVar = new C70334de();
        C69664n.m101061g(pVar, "request");
        C71594u.m104517d(C71477ah.m104295b(C121992ab.m201495d(C71536cm.m104384b(C71477ah.m104296c(C70748n.m103449b(ajVar.f189039a, C121995ae.m201503c(), pVar, ajVar.f189040b, deVar), new C122041x((C69577g) null)), new C122042y(this.f338517b, (C69577g) null)), "subscribeToStates"), new C122043z(this.f338517b, (C69577g) null)), (C71422aw) this.f338518c);
        return C69788q.f186170a;
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        C121991aa aaVar = new C121991aa(this.f338516a, this.f338517b, gVar);
        aaVar.f338518c = obj;
        return aaVar;
    }
}
