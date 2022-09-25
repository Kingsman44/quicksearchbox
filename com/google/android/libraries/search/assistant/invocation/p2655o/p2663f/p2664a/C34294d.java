package com.google.android.libraries.search.assistant.invocation.p2655o.p2663f.p2664a;

import kotlinx.coroutines.C71422aw;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69626l;
import p5462h.p5473f.p5474a.C69630p;

@C69567e(mo61343b = "com.google.android.libraries.search.assistant.invocation.triggering.orchestrator.sources.EnabledInvocationSources$value$1", mo61344c = "EnabledInvocationSources.kt", mo61345d = "invokeSuspend", mo61346e = {31})
/* renamed from: com.google.android.libraries.search.assistant.invocation.o.f.a.d */
/* compiled from: PG */
final class C34294d extends C69572j implements C69630p {

    /* renamed from: a */
    int f91201a;

    /* renamed from: b */
    final /* synthetic */ C34296f f91202b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C34294d(C34296f fVar, C69577g gVar) {
        super(2, gVar);
        this.f91202b = fVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C34294d) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f91201a != 0) {
            C69714l.m101134b(obj);
        } else {
            C69714l.m101134b(obj);
            C69626l lVar = this.f91202b.f91209b;
            this.f91201a = 1;
            obj = lVar.mo5761a(this);
            if (obj == aVar) {
                return aVar;
            }
        }
        return obj;
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        return new C34294d(this.f91202b, gVar);
    }
}
