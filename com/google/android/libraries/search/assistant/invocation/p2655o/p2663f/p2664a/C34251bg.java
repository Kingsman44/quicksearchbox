package com.google.android.libraries.search.assistant.invocation.p2655o.p2663f.p2664a;

import com.google.android.libraries.search.assistant.invocation.p2655o.p2656a.C34043bf;
import com.google.android.libraries.search.assistant.invocation.p2655o.p2656a.C34048bk;
import com.google.android.libraries.search.assistant.invocation.p2655o.p2656a.C34049bl;
import kotlinx.coroutines.C71422aw;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;
import p5462h.p5473f.p5475b.C69664n;
import p5488io.grpc.C70334de;

@C69567e(mo61343b = "com.google.android.libraries.search.assistant.invocation.triggering.orchestrator.sources.InvocationSourceStateObserverImpl$observe$3$1", mo61344c = "InvocationSourceStateObserverImpl.kt", mo61345d = "invokeSuspend", mo61346e = {70})
/* renamed from: com.google.android.libraries.search.assistant.invocation.o.f.a.bg */
/* compiled from: PG */
final class C34251bg extends C69572j implements C69630p {

    /* renamed from: a */
    int f91118a;

    /* renamed from: b */
    final /* synthetic */ C34253bi f91119b;

    /* renamed from: c */
    final /* synthetic */ C34043bf f91120c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C34251bg(C34253bi biVar, C34043bf bfVar, C69577g gVar) {
        super(2, gVar);
        this.f91119b = biVar;
        this.f91120c = bfVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C34251bg) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f91118a != 0) {
            C69714l.m101134b(obj);
        } else {
            C69714l.m101134b(obj);
            C34278cg cgVar = this.f91119b.f91125b;
            C34043bf bfVar = this.f91120c;
            C34305o oVar = (C34305o) C34313w.f91242e.createBuilder();
            C69664n.m101060f(oVar, "newBuilder()");
            C34291ct a = C69664n.m101061g(oVar, "builder");
            a.mo39306b(bfVar);
            C34048bk bkVar = (C34048bk) C34049bl.f90749a.createBuilder();
            C69664n.m101060f(bkVar, "newBuilder()");
            a.mo39307c(C69664n.m101061g(bkVar, "builder").mo39196a());
            C34311u uVar = (C34311u) C34312v.f91240a.createBuilder();
            C69664n.m101060f(uVar, "newBuilder()");
            a.mo39308d(C69664n.m101061g(uVar, "builder").mo39309a());
            C34313w a2 = a.mo39305a();
            this.f91118a = 1;
            if (cgVar.mo39297b(a2, new C70334de(), this) == aVar) {
                return aVar;
            }
        }
        return C69788q.f186170a;
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        return new C34251bg(this.f91119b, this.f91120c, gVar);
    }
}
