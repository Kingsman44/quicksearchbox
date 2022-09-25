package com.google.android.libraries.search.assistant.invocation.p2655o.p2663f.p2664a;

import kotlinx.coroutines.C71422aw;
import kotlinx.coroutines.C71816z;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;

@C69567e(mo61343b = "com.google.android.libraries.search.assistant.invocation.triggering.orchestrator.sources.InvocationSourceStateTimeout$Condition$onTimeout$2", mo61344c = "InvocationSourceStateTimeout.kt", mo61345d = "invokeSuspend", mo61346e = {30})
/* renamed from: com.google.android.libraries.search.assistant.invocation.o.f.a.ci */
/* compiled from: PG */
final class C34280ci extends C69572j implements C69630p {

    /* renamed from: a */
    int f91184a;

    /* renamed from: b */
    final /* synthetic */ C34282ck f91185b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C34280ci(C34282ck ckVar, C69577g gVar) {
        super(2, gVar);
        this.f91185b = ckVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C34280ci) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f91184a != 0) {
            C69714l.m101134b(obj);
        } else {
            C69714l.m101134b(obj);
            C71816z zVar = this.f91185b.f91193b;
            this.f91184a = 1;
            if (zVar.mo62825a(this) == aVar) {
                return aVar;
            }
        }
        return C69788q.f186170a;
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        return new C34280ci(this.f91185b, gVar);
    }
}
