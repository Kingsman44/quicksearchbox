package com.google.android.libraries.search.assistant.invocation.p2655o.p2667h.p2671c;

import kotlinx.coroutines.p5574b.C71588o;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69631q;

@C69567e(mo61343b = "com.google.android.libraries.search.assistant.invocation.triggering.service.lifecycle.LifecycleContainer$launchIn$2", mo61344c = "ApaTriggeringManagedLifecycleManager.kt", mo61345d = "invokeSuspend", mo61346e = {107})
/* renamed from: com.google.android.libraries.search.assistant.invocation.o.h.c.q */
/* compiled from: PG */
public final class C34427q extends C69572j implements C69631q {

    /* renamed from: a */
    Object f91489a;

    /* renamed from: b */
    int f91490b;

    /* renamed from: c */
    final /* synthetic */ C34428r f91491c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C34427q(C34428r rVar, C69577g gVar) {
        super(3, gVar);
        this.f91491c = rVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo17419a(Object obj, Object obj2, Object obj3) {
        C71588o oVar = (C71588o) obj;
        Throwable th = (Throwable) obj2;
        return new C34427q(this.f91491c, (C69577g) obj3).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        Object obj2;
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f91490b != 0) {
            obj2 = this.f91489a;
            C69714l.m101134b(obj);
        } else {
            C69714l.m101134b(obj);
            C34428r rVar = this.f91491c;
            C34423m mVar = rVar.f91495c;
            if (mVar != null) {
                this.f91489a = rVar;
                this.f91490b = 1;
                if (C34428r.m63122b(mVar, this) == aVar) {
                    return aVar;
                }
            }
            obj2 = rVar;
        }
        ((C34428r) obj2).f91495c = null;
        return C69788q.f186170a;
    }
}
