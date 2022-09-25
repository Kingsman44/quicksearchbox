package com.google.android.libraries.search.assistant.invocation.p2655o.p2667h.p2671c;

import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;

@C69567e(mo61343b = "com.google.android.libraries.search.assistant.invocation.triggering.service.lifecycle.LifecycleContainer$launchIn$1", mo61344c = "ApaTriggeringManagedLifecycleManager.kt", mo61345d = "invokeSuspend", mo61346e = {102, 104})
/* renamed from: com.google.android.libraries.search.assistant.invocation.o.h.c.p */
/* compiled from: PG */
public final class C34426p extends C69572j implements C69630p {

    /* renamed from: a */
    Object f91485a;

    /* renamed from: b */
    int f91486b;

    /* renamed from: c */
    /* synthetic */ boolean f91487c;

    /* renamed from: d */
    final /* synthetic */ C34428r f91488d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C34426p(C34428r rVar, C69577g gVar) {
        super(2, gVar);
        this.f91488d = rVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C34426p) mo5194c(Boolean.valueOf(((Boolean) obj).booleanValue()), (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        Object obj2;
        Object obj3;
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        int i = this.f91486b;
        if (i == 0) {
            C69714l.m101134b(obj);
            if (this.f91487c) {
                C34428r rVar = this.f91488d;
                if (rVar.f91495c == null) {
                    this.f91485a = rVar;
                    this.f91486b = 1;
                    Object a = rVar.mo39350a((C34421k) rVar.f91493a.f91462a.mo17428b(), this);
                    if (a == aVar) {
                        return aVar;
                    }
                    obj3 = rVar;
                    obj = a;
                }
            } else {
                C34428r rVar2 = this.f91488d;
                C34423m mVar = rVar2.f91495c;
                if (mVar != null) {
                    this.f91485a = rVar2;
                    this.f91486b = 2;
                    if (C34428r.m63122b(mVar, this) == aVar) {
                        return aVar;
                    }
                    obj2 = rVar2;
                    ((C34428r) obj2).f91495c = null;
                }
            }
            return C69788q.f186170a;
        } else if (i != 1) {
            obj2 = this.f91485a;
            C69714l.m101134b(obj);
            ((C34428r) obj2).f91495c = null;
            return C69788q.f186170a;
        } else {
            obj3 = this.f91485a;
            C69714l.m101134b(obj);
        }
        ((C34428r) obj3).f91495c = (C34423m) obj;
        return C69788q.f186170a;
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        C34426p pVar = new C34426p(this.f91488d, gVar);
        pVar.f91487c = ((Boolean) obj).booleanValue();
        return pVar;
    }
}
