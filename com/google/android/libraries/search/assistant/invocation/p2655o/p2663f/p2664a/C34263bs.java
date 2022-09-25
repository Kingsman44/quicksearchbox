package com.google.android.libraries.search.assistant.invocation.p2655o.p2663f.p2664a;

import kotlinx.coroutines.p5573a.C71361ao;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69626l;

@C69567e(mo61343b = "com.google.android.libraries.search.assistant.invocation.triggering.orchestrator.sources.InvocationSourceStateProviderImpl$SourceStateTracker$timeoutFirst$1$3", mo61344c = "InvocationSourceStateProviderImpl.kt", mo61345d = "invokeSuspend", mo61346e = {105})
/* renamed from: com.google.android.libraries.search.assistant.invocation.o.f.a.bs */
/* compiled from: PG */
final class C34263bs extends C69572j implements C69626l {

    /* renamed from: a */
    int f91151a;

    /* renamed from: b */
    final /* synthetic */ Object f91152b;

    /* renamed from: c */
    final /* synthetic */ C71361ao f91153c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C34263bs(C71361ao aoVar, Object obj, C69577g gVar) {
        super(1, gVar);
        this.f91153c = aoVar;
        this.f91152b = obj;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5761a(Object obj) {
        return new C34263bs(this.f91153c, this.f91152b, (C69577g) obj).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f91151a != 0) {
            C69714l.m101134b(obj);
        } else {
            C69714l.m101134b(obj);
            C71361ao aoVar = this.f91153c;
            Object obj2 = this.f91152b;
            this.f91151a = 1;
            if (aoVar.mo62729v(obj2, this) == aVar) {
                return aVar;
            }
        }
        return C69788q.f186170a;
    }
}
