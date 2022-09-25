package com.google.android.libraries.search.assistant.invocation.p2655o.p2667h.p2671c;

import kotlinx.coroutines.C71608bi;
import kotlinx.coroutines.p5574b.C71588o;
import p5462h.C69596e;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;

@C69567e(mo61343b = "com.google.android.libraries.search.assistant.invocation.triggering.service.lifecycle.WhileClientConnectedEligibility$eligible$1", mo61344c = "ApaTriggeringManagedLifecycleManager.kt", mo61345d = "invokeSuspend", mo61346e = {145, 146})
/* renamed from: com.google.android.libraries.search.assistant.invocation.o.h.c.t */
/* compiled from: PG */
final class C34430t extends C69572j implements C69630p {

    /* renamed from: a */
    int f91497a;

    /* renamed from: b */
    private /* synthetic */ Object f91498b;

    public C34430t(C69577g gVar) {
        super(2, gVar);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C34430t) mo5194c((C71588o) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        int i = this.f91497a;
        if (i == 0) {
            C69714l.m101134b(obj);
            this.f91497a = 1;
            if (((C71588o) this.f91498b).mo20883a(true, this) == aVar) {
                return aVar;
            }
        } else if (i == 1) {
            C69714l.m101134b(obj);
        } else {
            C69714l.m101134b(obj);
            throw new C69596e();
        }
        this.f91497a = 2;
        if (C71608bi.m104550b(this) == aVar) {
            return aVar;
        }
        throw new C69596e();
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        C34430t tVar = new C34430t(gVar);
        tVar.f91498b = obj;
        return tVar;
    }
}
