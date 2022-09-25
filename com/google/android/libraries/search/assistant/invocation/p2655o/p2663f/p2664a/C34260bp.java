package com.google.android.libraries.search.assistant.invocation.p2655o.p2663f.p2664a;

import kotlinx.coroutines.p5574b.C71587n;
import kotlinx.coroutines.p5574b.C71588o;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;

@C69567e(mo61343b = "com.google.android.libraries.search.assistant.invocation.triggering.orchestrator.sources.InvocationSourceStateProviderImpl$SourceStateTracker$forClient$$inlined$transform$1", mo61344c = "InvocationSourceStateProviderImpl.kt", mo61345d = "invokeSuspend", mo61346e = {40})
/* renamed from: com.google.android.libraries.search.assistant.invocation.o.f.a.bp */
/* compiled from: PG */
public final class C34260bp extends C69572j implements C69630p {

    /* renamed from: a */
    int f91140a;

    /* renamed from: b */
    final /* synthetic */ C71587n f91141b;

    /* renamed from: c */
    final /* synthetic */ String f91142c;

    /* renamed from: d */
    final /* synthetic */ long f91143d;

    /* renamed from: e */
    final /* synthetic */ C34266bv f91144e;

    /* renamed from: f */
    private /* synthetic */ Object f91145f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C34260bp(C71587n nVar, C69577g gVar, String str, long j, C34266bv bvVar) {
        super(2, gVar);
        this.f91141b = nVar;
        this.f91142c = str;
        this.f91143d = j;
        this.f91144e = bvVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C34260bp) mo5194c((C71588o) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f91140a != 0) {
            C69714l.m101134b(obj);
        } else {
            C69714l.m101134b(obj);
            C71587n nVar = this.f91141b;
            C34259bo boVar = new C34259bo((C71588o) this.f91145f, this.f91142c, this.f91143d, this.f91144e);
            this.f91140a = 1;
            if (nVar.mo38165mp(boVar, this) == aVar) {
                return aVar;
            }
        }
        return C69788q.f186170a;
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        C34260bp bpVar = new C34260bp(this.f91141b, gVar, this.f91142c, this.f91143d, this.f91144e);
        bpVar.f91145f = obj;
        return bpVar;
    }
}
