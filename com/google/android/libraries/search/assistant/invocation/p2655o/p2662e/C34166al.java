package com.google.android.libraries.search.assistant.invocation.p2655o.p2662e;

import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59094n;
import com.google.common.p4526f.p4527a.C58975e;
import java.util.Set;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;

@C69567e(mo61343b = "com.google.android.libraries.search.assistant.invocation.triggering.oracle.InvocationRoutingOracleImpl$routing$1", mo61344c = "InvocationRoutingOracleImpl.kt", mo61345d = "invokeSuspend", mo61346e = {})
/* renamed from: com.google.android.libraries.search.assistant.invocation.o.e.al */
/* compiled from: PG */
final class C34166al extends C69572j implements C69630p {

    /* renamed from: a */
    /* synthetic */ Object f90948a;

    public C34166al(C69577g gVar) {
        super(2, gVar);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C34166al) mo5194c((Set) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        C69714l.m101134b(obj);
        C59052c cVar = (C59052c) C34173as.f90966a.mo56224b();
        cVar.mo56378ag(C58975e.f156826a, "TRG.RoutingOracle");
        cVar.mo56379ah(new C59094n(51332));
        cVar.mo56389s("Client connections changed: %s.", (Set) this.f90948a);
        return C69788q.f186170a;
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        C34166al alVar = new C34166al(gVar);
        alVar.f90948a = obj;
        return alVar;
    }
}
