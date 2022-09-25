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

@C69567e(mo61343b = "com.google.android.apps.search.assistant.platform.triggering.directactions.ApaDirectActionsBackendImpl$requestDirectActions$1$1", mo61344c = "ApaDirectActionsBackendImpl.kt", mo61345d = "invokeSuspend", mo61346e = {63})
/* renamed from: com.google.android.apps.search.assistant.platform.j.a.j */
/* compiled from: PG */
final class C121653j extends C69572j implements C69630p {

    /* renamed from: a */
    int f337530a;

    /* renamed from: b */
    final /* synthetic */ String f337531b;

    /* renamed from: c */
    private /* synthetic */ Object f337532c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C121653j(String str, C69577g gVar) {
        super(2, gVar);
        this.f337531b = str;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C121653j) mo5194c((C121633df) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f337530a != 0) {
            C69714l.m101134b(obj);
        } else {
            C69714l.m101134b(obj);
            String str = this.f337531b;
            C121563aq aqVar = (C121563aq) C121564ar.f337316c.createBuilder();
            C69664n.m101060f(aqVar, "newBuilder()");
            C69664n.m101061g(aqVar, "builder");
            C69664n.m101061g(str, "value");
            aqVar.copyOnWrite();
            str.getClass();
            ((C121564ar) aqVar.instance).f337319b = str;
            C62942bv build = aqVar.build();
            C69664n.m101060f(build, "_builder.build()");
            this.f337530a = 1;
            obj = ((C121633df) this.f337532c).mo105276c((C121564ar) build, new C70334de(), this);
            if (obj == aVar) {
                return aVar;
            }
        }
        return obj;
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        C121653j jVar = new C121653j(this.f337531b, gVar);
        jVar.f337532c = obj;
        return jVar;
    }
}
