package com.google.android.libraries.search.assistant.invocation.p2655o.p2667h.p2670b;

import kotlinx.coroutines.p5574b.C71588o;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5463a.C69497an;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;

@C69567e(mo61343b = "com.google.android.libraries.search.assistant.invocation.triggering.service.debug.ApaTriggeringDebugDataProvider$asSubscriptionsFlow$1", mo61344c = "ApaTriggeringDebugDataProvider.kt", mo61345d = "invokeSuspend", mo61346e = {248})
/* renamed from: com.google.android.libraries.search.assistant.invocation.o.h.b.e */
/* compiled from: PG */
final class C34389e extends C69572j implements C69630p {

    /* renamed from: a */
    int f91420a;

    /* renamed from: b */
    private /* synthetic */ Object f91421b;

    public C34389e(C69577g gVar) {
        super(2, gVar);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C34389e) mo5194c((C71588o) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f91420a != 0) {
            C69714l.m101134b(obj);
        } else {
            C69714l.m101134b(obj);
            C69497an anVar = C69497an.f185919a;
            this.f91420a = 1;
            if (((C71588o) this.f91421b).mo20883a(anVar, this) == aVar) {
                return aVar;
            }
        }
        return C69788q.f186170a;
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        C34389e eVar = new C34389e(gVar);
        eVar.f91421b = obj;
        return eVar;
    }
}
