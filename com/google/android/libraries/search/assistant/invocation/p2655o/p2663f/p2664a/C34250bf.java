package com.google.android.libraries.search.assistant.invocation.p2655o.p2663f.p2664a;

import com.google.android.libraries.search.assistant.invocation.p2655o.p2656a.C34043bf;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59094n;
import com.google.common.p4526f.p4527a.C58975e;
import kotlinx.coroutines.p5574b.C71588o;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69631q;

@C69567e(mo61343b = "com.google.android.libraries.search.assistant.invocation.triggering.orchestrator.sources.InvocationSourceStateObserverImpl$observe$2", mo61344c = "InvocationSourceStateObserverImpl.kt", mo61345d = "invokeSuspend", mo61346e = {})
/* renamed from: com.google.android.libraries.search.assistant.invocation.o.f.a.bf */
/* compiled from: PG */
final class C34250bf extends C69572j implements C69631q {

    /* renamed from: a */
    /* synthetic */ Object f91116a;

    /* renamed from: b */
    final /* synthetic */ C34043bf f91117b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C34250bf(C34043bf bfVar, C69577g gVar) {
        super(3, gVar);
        this.f91117b = bfVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo17419a(Object obj, Object obj2, Object obj3) {
        C71588o oVar = (C71588o) obj;
        C34250bf bfVar = new C34250bf(this.f91117b, (C69577g) obj3);
        bfVar.f91116a = (Throwable) obj2;
        return bfVar.mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        C69714l.m101134b(obj);
        Object obj2 = this.f91116a;
        C59052c cVar = (C59052c) C34253bi.f91124a.mo56226d();
        cVar.mo56378ag(C58975e.f156826a, "TRG.SourceStateObserver");
        C59052c cVar2 = (C59052c) cVar.mo56382g((Throwable) obj2);
        String name = this.f91117b.name();
        cVar2.mo56379ah(new C59094n(51345));
        cVar2.mo56389s("Failure while observing invocation source(%s) state.", name);
        return C69788q.f186170a;
    }
}
