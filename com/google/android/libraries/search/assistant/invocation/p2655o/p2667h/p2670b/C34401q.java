package com.google.android.libraries.search.assistant.invocation.p2655o.p2667h.p2670b;

import com.google.android.libraries.search.assistant.invocation.p2655o.p2656a.C34013ac;
import com.google.android.libraries.search.assistant.invocation.p2655o.p2656a.C34014ad;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69631q;
import p5462h.p5473f.p5475b.C69664n;

@C69567e(mo61343b = "com.google.android.libraries.search.assistant.invocation.triggering.service.debug.ApaTriggeringDebugDataProvider$createTracker$context$3", mo61344c = "ApaTriggeringDebugDataProvider.kt", mo61345d = "invokeSuspend", mo61346e = {})
/* renamed from: com.google.android.libraries.search.assistant.invocation.o.h.b.q */
/* compiled from: PG */
final class C34401q extends C69572j implements C69631q {

    /* renamed from: a */
    /* synthetic */ Object f91447a;

    /* renamed from: b */
    /* synthetic */ Object f91448b;

    public C34401q(C69577g gVar) {
        super(3, gVar);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo17419a(Object obj, Object obj2, Object obj3) {
        C34401q qVar = new C34401q((C69577g) obj3);
        qVar.f91447a = (C34014ad) obj;
        qVar.f91448b = (C34014ad) obj2;
        return qVar.mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        C69714l.m101134b(obj);
        Object obj2 = this.f91447a;
        Object obj3 = this.f91448b;
        if (obj2 != null) {
            return obj3;
        }
        C34013ac acVar = (C34013ac) C34014ad.f90663f.createBuilder();
        C69664n.m101060f(acVar, "newBuilder()");
        if (C69664n.m101066l(obj3, C69664n.m101061g(acVar, "builder").mo39188a())) {
            return null;
        }
        return obj3;
    }
}
