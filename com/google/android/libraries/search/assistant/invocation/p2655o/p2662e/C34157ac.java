package com.google.android.libraries.search.assistant.invocation.p2655o.p2662e;

import java.util.Set;
import kotlinx.coroutines.p5574b.C71588o;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5463a.C69531o;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69631q;

@C69567e(mo61343b = "com.google.android.libraries.search.assistant.invocation.triggering.oracle.InvocationRoutingOracleImpl$asRouteCandidatesFlow$$inlined$combine$1$3", mo61344c = "InvocationRoutingOracleImpl.kt", mo61345d = "invokeSuspend", mo61346e = {333})
/* renamed from: com.google.android.libraries.search.assistant.invocation.o.e.ac */
/* compiled from: PG */
public final class C34157ac extends C69572j implements C69631q {

    /* renamed from: a */
    int f90928a;

    /* renamed from: b */
    /* synthetic */ Object f90929b;

    /* renamed from: c */
    private /* synthetic */ Object f90930c;

    public C34157ac(C69577g gVar) {
        super(3, gVar);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo17419a(Object obj, Object obj2, Object obj3) {
        C34157ac acVar = new C34157ac((C69577g) obj3);
        acVar.f90930c = (C71588o) obj;
        acVar.f90929b = (Object[]) obj2;
        return acVar.mo5193b(C69788q.f186170a);
    }

    /* JADX WARNING: type inference failed for: r4v2, types: [java.lang.Object, kotlinx.coroutines.b.o] */
    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        Object obj2 = C69554a.COROUTINE_SUSPENDED;
        if (this.f90928a != 0) {
            C69714l.m101134b(obj);
        } else {
            C69714l.m101134b(obj);
            ? r4 = this.f90930c;
            Set p = C69531o.m100939p((C34175au[]) ((Object[]) this.f90929b));
            this.f90928a = 1;
            if (r4.mo20883a(p, this) == obj2) {
                return obj2;
            }
        }
        return C69788q.f186170a;
    }
}
