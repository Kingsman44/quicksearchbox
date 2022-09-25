package com.google.android.apps.search.assistant.platform.p9044c.p9055c.p9056a.p9057a;

import kotlinx.coroutines.p5574b.C71548cy;
import kotlinx.coroutines.p5574b.C71588o;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5463a.C69498ao;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69631q;

@C69567e(mo61343b = "com.google.android.apps.search.assistant.platform.invocation.triggering.migration.flow.ApaFlowRoutingStateExchange$initialize$1$coroutine$3", mo61344c = "ApaFlowRoutingStateExchange.kt", mo61345d = "invokeSuspend", mo61346e = {})
/* renamed from: com.google.android.apps.search.assistant.platform.c.c.a.a.e */
/* compiled from: PG */
final class C120114e extends C69572j implements C69631q {

    /* renamed from: a */
    final /* synthetic */ C120123n f334339a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C120114e(C120123n nVar, C69577g gVar) {
        super(3, gVar);
        this.f334339a = nVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo17419a(Object obj, Object obj2, Object obj3) {
        C71588o oVar = (C71588o) obj;
        Throwable th = (Throwable) obj2;
        return new C120114e(this.f334339a, (C69577g) obj3).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        Object e;
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        C69714l.m101134b(obj);
        C71548cy cyVar = this.f334339a.f334353c;
        do {
            e = cyVar.mo62784e();
            C120110a aVar2 = (C120110a) e;
        } while (!cyVar.mo62808g(e, new C120110a(C69498ao.f185920a)));
        return C69788q.f186170a;
    }
}
