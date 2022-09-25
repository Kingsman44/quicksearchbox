package com.google.android.apps.search.assistant.platform.p9044c.p9055c.p9056a.p9057a;

import com.google.android.apps.gsa.nga.engine.p6029g.p6030a.C76043ar;
import com.google.android.apps.gsa.nga.engine.p6029g.p6030a.C76061m;
import com.google.common.p4526f.p4527a.C58970a;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;

@C69567e(mo61343b = "com.google.android.apps.search.assistant.platform.invocation.triggering.migration.flow.ApaFlowRoutingStateExchange$subscribe$subscription$3", mo61344c = "ApaFlowRoutingStateExchange.kt", mo61345d = "invokeSuspend", mo61346e = {})
/* renamed from: com.google.android.apps.search.assistant.platform.c.c.a.a.m */
/* compiled from: PG */
final class C120122m extends C69572j implements C69630p {

    /* renamed from: a */
    /* synthetic */ Object f334349a;

    /* renamed from: b */
    final /* synthetic */ C120111b f334350b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C120122m(C120111b bVar, C69577g gVar) {
        super(2, gVar);
        this.f334350b = bVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C120122m) mo5194c((C120110a) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        C69714l.m101134b(obj);
        C120111b bVar = this.f334350b;
        ((C58970a) ((C58970a) C76043ar.f210894a.mo56224b()).mo56372aa(3122)).mo56389s("onApaFlowRoutingChanged routing = %s", (C120110a) this.f334349a);
        ((C76043ar) bVar).mo72028i(C76061m.f210948a);
        return C69788q.f186170a;
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        C120122m mVar = new C120122m(this.f334350b, gVar);
        mVar.f334349a = obj;
        return mVar;
    }
}
