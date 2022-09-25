package com.google.android.libraries.search.assistant.invocation.p2655o.p2663f.p2664a;

import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;
import p5488io.grpc.C70334de;

@C69567e(mo61343b = "com.google.android.libraries.search.assistant.invocation.triggering.orchestrator.sources.InvocationSourceStateObserverImpl$observe$1", mo61344c = "InvocationSourceStateObserverImpl.kt", mo61345d = "invokeSuspend", mo61346e = {61})
/* renamed from: com.google.android.libraries.search.assistant.invocation.o.f.a.be */
/* compiled from: PG */
final class C34249be extends C69572j implements C69630p {

    /* renamed from: a */
    int f91113a;

    /* renamed from: b */
    /* synthetic */ Object f91114b;

    /* renamed from: c */
    final /* synthetic */ C34253bi f91115c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C34249be(C34253bi biVar, C69577g gVar) {
        super(2, gVar);
        this.f91115c = biVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C34249be) mo5194c((C34313w) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f91113a != 0) {
            C69714l.m101134b(obj);
        } else {
            C69714l.m101134b(obj);
            C34278cg cgVar = this.f91115c.f91125b;
            this.f91113a = 1;
            if (cgVar.mo39297b((C34313w) this.f91114b, new C70334de(), this) == aVar) {
                return aVar;
            }
        }
        return C69788q.f186170a;
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        C34249be beVar = new C34249be(this.f91115c, gVar);
        beVar.f91114b = obj;
        return beVar;
    }
}
