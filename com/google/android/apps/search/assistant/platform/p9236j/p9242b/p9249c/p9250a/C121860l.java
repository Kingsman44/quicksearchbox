package com.google.android.apps.search.assistant.platform.p9236j.p9242b.p9249c.p9250a;

import com.google.android.apps.search.assistant.platform.p9236j.p9242b.p9249c.C122057q;
import com.google.android.libraries.search.assistant.invocation.p2655o.p2656a.C34053bp;
import com.google.protobuf.C62942bv;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;
import p5462h.p5473f.p5475b.C69664n;
import p5488io.grpc.C70334de;

@C69567e(mo61343b = "com.google.android.apps.search.assistant.platform.triggering.invocations.vis.activitystarter.ApaInternalActivityStarterGrpcClient$startAssistantActivity$2", mo61344c = "ApaInternalActivityStarterGrpcClient.kt", mo61345d = "invokeSuspend", mo61346e = {47})
/* renamed from: com.google.android.apps.search.assistant.platform.j.b.c.a.l */
/* compiled from: PG */
final class C121860l extends C69572j implements C69630p {

    /* renamed from: a */
    int f338144a;

    /* renamed from: b */
    final /* synthetic */ C34053bp f338145b;

    /* renamed from: c */
    private /* synthetic */ Object f338146c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C121860l(C34053bp bpVar, C69577g gVar) {
        super(2, gVar);
        this.f338145b = bpVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C121860l) mo5194c((C122057q) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f338144a != 0) {
            C69714l.m101134b(obj);
        } else {
            C69714l.m101134b(obj);
            C122057q qVar = (C122057q) this.f338146c;
            C34053bp bpVar = this.f338145b;
            C121832ao aoVar = (C121832ao) C121833ap.f338067b.createBuilder();
            C69664n.m101060f(aoVar, "newBuilder()");
            C69664n.m101061g(aoVar, "builder");
            if (bpVar != null) {
                aoVar.copyOnWrite();
                ((C121833ap) aoVar.instance).f338069a = bpVar;
            }
            C62942bv build = aoVar.build();
            C69664n.m101060f(build, "_builder.build()");
            this.f338144a = 1;
            obj = qVar.mo105524b((C121833ap) build, new C70334de(), this);
            if (obj == aVar) {
                return aVar;
            }
        }
        return obj;
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        C121860l lVar = new C121860l(this.f338145b, gVar);
        lVar.f338146c = obj;
        return lVar;
    }
}
