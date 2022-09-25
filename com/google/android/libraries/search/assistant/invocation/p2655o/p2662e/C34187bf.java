package com.google.android.libraries.search.assistant.invocation.p2655o.p2662e;

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

@C69567e(mo61343b = "com.google.android.libraries.search.assistant.invocation.triggering.oracle.PreferredClientOracleServiceImpl$onPreferredClientMappingChanged$2", mo61344c = "PreferredClientOracle.kt", mo61345d = "invokeSuspend", mo61346e = {})
/* renamed from: com.google.android.libraries.search.assistant.invocation.o.e.bf */
/* compiled from: PG */
final class C34187bf extends C69572j implements C69631q {
    public C34187bf(C69577g gVar) {
        super(3, gVar);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo17419a(Object obj, Object obj2, Object obj3) {
        C71588o oVar = (C71588o) obj;
        Throwable th = (Throwable) obj2;
        return new C34187bf((C69577g) obj3).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        C69714l.m101134b(obj);
        C59052c cVar = (C59052c) C34183bb.f91004a.mo56224b();
        cVar.mo56378ag(C58975e.f156826a, "TRG.ClientOracle");
        cVar.mo56379ah(new C59094n(51336));
        cVar.mo56386p("Preferred client mapping subscription completed.");
        return C69788q.f186170a;
    }
}
