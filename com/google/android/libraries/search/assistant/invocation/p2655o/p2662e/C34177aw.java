package com.google.android.libraries.search.assistant.invocation.p2655o.p2662e;

import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59094n;
import com.google.common.p4526f.p4527a.C58975e;
import java.util.Map;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69631q;

@C69567e(mo61343b = "com.google.android.libraries.search.assistant.invocation.triggering.oracle.PreferredClientOracle$mapping$3", mo61344c = "PreferredClientOracle.kt", mo61345d = "invokeSuspend", mo61346e = {})
/* renamed from: com.google.android.libraries.search.assistant.invocation.o.e.aw */
/* compiled from: PG */
final class C34177aw extends C69572j implements C69631q {

    /* renamed from: a */
    /* synthetic */ Object f90982a;

    /* renamed from: b */
    /* synthetic */ Object f90983b;

    public C34177aw(C69577g gVar) {
        super(3, gVar);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo17419a(Object obj, Object obj2, Object obj3) {
        C34177aw awVar = new C34177aw((C69577g) obj3);
        awVar.f90982a = (Map) obj;
        awVar.f90983b = (Map) obj2;
        return awVar.mo5193b(C69788q.f186170a);
    }

    /* JADX WARNING: type inference failed for: r6v1, types: [java.util.Map, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r0v1, types: [java.util.Map, java.lang.Object] */
    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        C69714l.m101134b(obj);
        ? r6 = this.f90982a;
        ? r0 = this.f90983b;
        C59052c cVar = (C59052c) C34183bb.f91004a.mo56224b();
        cVar.mo56378ag(C58975e.f156826a, "TRG.ClientOracle");
        String b = C34215z.m62845b(r6);
        String b2 = C34215z.m62845b(r0);
        cVar.mo56379ah(new C59094n(51334));
        cVar.mo56354G("Preferred client routing has changed from\n%s\nto\n%s", b, b2);
        return r0;
    }
}
