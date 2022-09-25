package com.google.android.libraries.search.assistant.invocation.p2655o.p2663f.p2664a;

import kotlinx.coroutines.p5573a.C71361ao;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;

@C69567e(mo61343b = "com.google.android.libraries.search.assistant.invocation.triggering.orchestrator.sources.InvocationSourceStateProviderImpl$SourceStateTracker$timeoutFirst$1$2", mo61344c = "InvocationSourceStateProviderImpl.kt", mo61345d = "invokeSuspend", mo61346e = {103})
/* renamed from: com.google.android.libraries.search.assistant.invocation.o.f.a.br */
/* compiled from: PG */
final class C34262br extends C69572j implements C69630p {

    /* renamed from: a */
    int f91148a;

    /* renamed from: b */
    /* synthetic */ Object f91149b;

    /* renamed from: c */
    final /* synthetic */ C71361ao f91150c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C34262br(C71361ao aoVar, C69577g gVar) {
        super(2, gVar);
        this.f91150c = aoVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C34262br) mo5194c(obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f91148a != 0) {
            C69714l.m101134b(obj);
        } else {
            C69714l.m101134b(obj);
            Object obj2 = this.f91149b;
            C71361ao aoVar = this.f91150c;
            this.f91148a = 1;
            if (aoVar.mo62729v(obj2, this) == aVar) {
                return aVar;
            }
        }
        return C69788q.f186170a;
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        C34262br brVar = new C34262br(this.f91150c, gVar);
        brVar.f91149b = obj;
        return brVar;
    }
}
