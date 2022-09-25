package com.google.android.libraries.search.assistant.invocation.p2655o.p2667h.p2668a.p2669a;

import kotlinx.coroutines.p5573a.C71361ao;
import kotlinx.coroutines.p5574b.C71588o;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69631q;

@C69567e(mo61343b = "com.google.android.libraries.search.assistant.invocation.triggering.service.connections.impl.TriggeringConnectionManagerImpl$connect$1$2", mo61344c = "TriggeringConnectionManagerImpl.kt", mo61345d = "invokeSuspend", mo61346e = {})
/* renamed from: com.google.android.libraries.search.assistant.invocation.o.h.a.a.n */
/* compiled from: PG */
final class C34368n extends C69572j implements C69631q {

    /* renamed from: a */
    /* synthetic */ Object f91366a;

    /* renamed from: b */
    final /* synthetic */ C71361ao f91367b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C34368n(C71361ao aoVar, C69577g gVar) {
        super(3, gVar);
        this.f91367b = aoVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo17419a(Object obj, Object obj2, Object obj3) {
        C71588o oVar = (C71588o) obj;
        C34368n nVar = new C34368n(this.f91367b, (C69577g) obj3);
        nVar.f91366a = (Throwable) obj2;
        return nVar.mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        C69714l.m101134b(obj);
        this.f91367b.mo62727D((Throwable) this.f91366a);
        return C69788q.f186170a;
    }
}
