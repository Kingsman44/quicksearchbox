package com.google.android.libraries.search.assistant.invocation.p2655o.p2663f.p2664a;

import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;

@C69567e(mo61343b = "com.google.android.libraries.search.assistant.invocation.triggering.orchestrator.sources.InvocationSourceStateProviderImpl$SourceStateTracker$timeoutFirst$1$1", mo61344c = "InvocationSourceStateProviderImpl.kt", mo61345d = "invokeSuspend", mo61346e = {103})
/* renamed from: com.google.android.libraries.search.assistant.invocation.o.f.a.bq */
/* compiled from: PG */
final class C34261bq extends C69572j implements C69630p {

    /* renamed from: a */
    int f91146a;

    /* renamed from: b */
    final /* synthetic */ C34282ck f91147b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C34261bq(C34282ck ckVar, C69577g gVar) {
        super(2, gVar);
        this.f91147b = ckVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C34261bq) mo5194c(obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f91146a != 0) {
            C69714l.m101134b(obj);
        } else {
            C69714l.m101134b(obj);
            C34282ck ckVar = this.f91147b;
            this.f91146a = 1;
            if (ckVar.mo39299b(this) == aVar) {
                return aVar;
            }
        }
        return C69788q.f186170a;
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        return new C34261bq(this.f91147b, gVar);
    }
}
