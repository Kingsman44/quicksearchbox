package com.google.android.libraries.search.assistant.invocation.p2655o.p2673i.p2674a.p2675a.p2676a;

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

@C69567e(mo61343b = "com.google.android.libraries.search.assistant.invocation.triggering.source.hotword.adapter.bisto.InEnrollmentStatusProvider$inEnrollmentStatus$3", mo61344c = "InEnrollmentStatusProvider.kt", mo61345d = "invokeSuspend", mo61346e = {})
/* renamed from: com.google.android.libraries.search.assistant.invocation.o.i.a.a.a.q */
/* compiled from: PG */
final class C34483q extends C69572j implements C69631q {

    /* renamed from: a */
    /* synthetic */ Object f91634a;

    public C34483q(C69577g gVar) {
        super(3, gVar);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo17419a(Object obj, Object obj2, Object obj3) {
        C71588o oVar = (C71588o) obj;
        C34483q qVar = new C34483q((C69577g) obj3);
        qVar.f91634a = (Throwable) obj2;
        return qVar.mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        C69714l.m101134b(obj);
        Object obj2 = this.f91634a;
        if (obj2 == null) {
            C59052c cVar = (C59052c) C34484r.f91635a.mo56224b();
            cVar.mo56378ag(C58975e.f156826a, "TRG.IEStatusProv");
            cVar.mo56379ah(new C59094n(51405));
            cVar.mo56386p("InEnrollmentStatus flow completed.");
        } else {
            C59052c cVar2 = (C59052c) C34484r.f91635a.mo56226d();
            cVar2.mo56378ag(C58975e.f156826a, "TRG.IEStatusProv");
            C59052c cVar3 = (C59052c) cVar2.mo56382g((Throwable) obj2);
            cVar3.mo56379ah(new C59094n(51404));
            cVar3.mo56386p("InEnrollmentStatus flow completed due to failure.");
        }
        return C69788q.f186170a;
    }
}
