package com.google.android.libraries.search.assistant.invocation.p2655o.p2662e;

import java.util.Map;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;

@C69567e(mo61343b = "com.google.android.libraries.search.assistant.invocation.triggering.oracle.InvocationRoutingDebugDataProvider$initialize$1$coroutine$2", mo61344c = "InvocationRoutingDebugDataProvider.kt", mo61345d = "invokeSuspend", mo61346e = {})
/* renamed from: com.google.android.libraries.search.assistant.invocation.o.e.q */
/* compiled from: PG */
final class C34206q extends C69572j implements C69630p {

    /* renamed from: a */
    /* synthetic */ Object f91029a;

    /* renamed from: b */
    final /* synthetic */ C34212w f91030b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C34206q(C34212w wVar, C69577g gVar) {
        super(2, gVar);
        this.f91030b = wVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C34206q) mo5194c((Map) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        C69714l.m101134b(obj);
        this.f91030b.mo39255b((Map) this.f91029a);
        return C69788q.f186170a;
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        C34206q qVar = new C34206q(this.f91030b, gVar);
        qVar.f91029a = obj;
        return qVar;
    }
}
