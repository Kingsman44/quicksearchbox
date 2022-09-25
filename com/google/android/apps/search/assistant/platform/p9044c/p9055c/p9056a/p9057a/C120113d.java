package com.google.android.apps.search.assistant.platform.p9044c.p9055c.p9056a.p9057a;

import kotlinx.coroutines.p5574b.C71548cy;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;

@C69567e(mo61343b = "com.google.android.apps.search.assistant.platform.invocation.triggering.migration.flow.ApaFlowRoutingStateExchange$initialize$1$coroutine$2", mo61344c = "ApaFlowRoutingStateExchange.kt", mo61345d = "invokeSuspend", mo61346e = {})
/* renamed from: com.google.android.apps.search.assistant.platform.c.c.a.a.d */
/* compiled from: PG */
final class C120113d extends C69572j implements C69630p {

    /* renamed from: a */
    /* synthetic */ Object f334337a;

    /* renamed from: b */
    final /* synthetic */ C120123n f334338b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C120113d(C120123n nVar, C69577g gVar) {
        super(2, gVar);
        this.f334338b = nVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C120113d) mo5194c((C120110a) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        Object e;
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        C69714l.m101134b(obj);
        C120110a aVar2 = (C120110a) this.f334337a;
        C71548cy cyVar = this.f334338b.f334353c;
        do {
            e = cyVar.mo62784e();
            C120110a aVar3 = (C120110a) e;
        } while (!cyVar.mo62808g(e, aVar2));
        return C69788q.f186170a;
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        C120113d dVar = new C120113d(this.f334338b, gVar);
        dVar.f334337a = obj;
        return dVar;
    }
}
