package com.google.android.libraries.search.assistant.invocation.p2655o.p2667h.p2670b;

import com.google.android.libraries.search.assistant.invocation.p2655o.p2659c.C34120b;
import com.google.android.libraries.search.assistant.invocation.p2655o.p2667h.p2668a.C34354a;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;

@C69567e(mo61343b = "com.google.android.libraries.search.assistant.invocation.triggering.service.debug.ApaTriggeringDebugDataProvider$createTracker$context$1", mo61344c = "ApaTriggeringDebugDataProvider.kt", mo61345d = "invokeSuspend", mo61346e = {})
/* renamed from: com.google.android.libraries.search.assistant.invocation.o.h.b.p */
/* compiled from: PG */
final class C34400p extends C69572j implements C69630p {

    /* renamed from: a */
    /* synthetic */ Object f91444a;

    /* renamed from: b */
    final /* synthetic */ C34354a f91445b;

    /* renamed from: c */
    final /* synthetic */ C34382ag f91446c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C34400p(C34354a aVar, C34382ag agVar, C69577g gVar) {
        super(2, gVar);
        this.f91445b = aVar;
        this.f91446c = agVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C34400p) mo5194c((C34120b) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        C69714l.m101134b(obj);
        C34382ag agVar = this.f91446c;
        C34354a aVar2 = this.f91445b;
        C34382ag.m63063b(agVar, aVar2, new C34399o((C34120b) this.f91444a, aVar2, agVar));
        return C69788q.f186170a;
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        C34400p pVar = new C34400p(this.f91445b, this.f91446c, gVar);
        pVar.f91444a = obj;
        return pVar;
    }
}
