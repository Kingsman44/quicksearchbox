package com.google.android.apps.search.assistant.platform.p9236j.p9237a;

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

@C69567e(mo61343b = "com.google.android.apps.search.assistant.platform.triggering.directactions.ApaDirectActionsBackendImpl$performDirectAction$1$1", mo61344c = "ApaDirectActionsBackendImpl.kt", mo61345d = "invokeSuspend", mo61346e = {81})
/* renamed from: com.google.android.apps.search.assistant.platform.j.a.h */
/* compiled from: PG */
final class C121651h extends C69572j implements C69630p {

    /* renamed from: a */
    int f337522a;

    /* renamed from: b */
    private /* synthetic */ Object f337523b;

    public C121651h(C69577g gVar) {
        super(2, gVar);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C121651h) mo5194c((C121633df) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f337522a != 0) {
            C69714l.m101134b(obj);
        } else {
            C69714l.m101134b(obj);
            C121559am amVar = (C121559am) C121560an.f337310b.createBuilder();
            C69664n.m101060f(amVar, "newBuilder()");
            C69664n.m101061g(amVar, "builder");
            C62942bv build = amVar.build();
            C69664n.m101060f(build, "_builder.build()");
            this.f337522a = 1;
            obj = ((C121633df) this.f337523b).mo105275b((C121560an) build, new C70334de(), this);
            if (obj == aVar) {
                return aVar;
            }
        }
        return obj;
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        C121651h hVar = new C121651h(gVar);
        hVar.f337523b = obj;
        return hVar;
    }
}
