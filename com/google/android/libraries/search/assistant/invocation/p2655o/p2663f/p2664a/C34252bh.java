package com.google.android.libraries.search.assistant.invocation.p2655o.p2663f.p2664a;

import com.google.android.libraries.search.assistant.invocation.p2655o.p2656a.C34043bf;
import kotlinx.coroutines.C71671dg;
import kotlinx.coroutines.C71803m;
import kotlinx.coroutines.p5574b.C71588o;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69631q;

@C69567e(mo61343b = "com.google.android.libraries.search.assistant.invocation.triggering.orchestrator.sources.InvocationSourceStateObserverImpl$observe$3", mo61344c = "InvocationSourceStateObserverImpl.kt", mo61345d = "invokeSuspend", mo61346e = {69})
/* renamed from: com.google.android.libraries.search.assistant.invocation.o.f.a.bh */
/* compiled from: PG */
final class C34252bh extends C69572j implements C69631q {

    /* renamed from: a */
    int f91121a;

    /* renamed from: b */
    final /* synthetic */ C34253bi f91122b;

    /* renamed from: c */
    final /* synthetic */ C34043bf f91123c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C34252bh(C34253bi biVar, C34043bf bfVar, C69577g gVar) {
        super(3, gVar);
        this.f91122b = biVar;
        this.f91123c = bfVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo17419a(Object obj, Object obj2, Object obj3) {
        C71588o oVar = (C71588o) obj;
        Throwable th = (Throwable) obj2;
        return new C34252bh(this.f91122b, this.f91123c, (C69577g) obj3).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f91121a != 0) {
            C69714l.m101134b(obj);
        } else {
            C69714l.m101134b(obj);
            C71671dg dgVar = C71671dg.f191128a;
            C34251bg bgVar = new C34251bg(this.f91122b, this.f91123c, (C69577g) null);
            this.f91121a = 1;
            if (C71803m.m105040a(dgVar, bgVar, this) == aVar) {
                return aVar;
            }
        }
        return C69788q.f186170a;
    }
}
