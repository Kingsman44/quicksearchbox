package com.google.android.libraries.search.assistant.invocation.p2655o.p2667h.p2670b;

import com.google.android.libraries.search.assistant.invocation.p2655o.p2667h.p2668a.C34354a;
import kotlinx.coroutines.p5574b.C71588o;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69631q;

@C69567e(mo61343b = "com.google.android.libraries.search.assistant.invocation.triggering.service.debug.ApaTriggeringDebugDataProvider$createTracker$context$7", mo61344c = "ApaTriggeringDebugDataProvider.kt", mo61345d = "invokeSuspend", mo61346e = {})
/* renamed from: com.google.android.libraries.search.assistant.invocation.o.h.b.v */
/* compiled from: PG */
final class C34406v extends C69572j implements C69631q {

    /* renamed from: a */
    final /* synthetic */ C34382ag f91455a;

    /* renamed from: b */
    final /* synthetic */ C34354a f91456b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C34406v(C34382ag agVar, C34354a aVar, C69577g gVar) {
        super(3, gVar);
        this.f91455a = agVar;
        this.f91456b = aVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo17419a(Object obj, Object obj2, Object obj3) {
        C71588o oVar = (C71588o) obj;
        Throwable th = (Throwable) obj2;
        return new C34406v(this.f91455a, this.f91456b, (C69577g) obj3).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        C69714l.m101134b(obj);
        C34382ag agVar = this.f91455a;
        C34382ag.m63063b(agVar, this.f91456b, new C34405u(agVar));
        return C69788q.f186170a;
    }
}
