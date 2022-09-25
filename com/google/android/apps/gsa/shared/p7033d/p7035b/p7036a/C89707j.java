package com.google.android.apps.gsa.shared.p7033d.p7035b.p7036a;

import kotlinx.coroutines.p5574b.C71588o;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69631q;

@C69567e(mo61343b = "com.google.android.apps.gsa.shared.apa.triggering.hotword.LegacyHotwordInvocationSource$initialize$1$2", mo61344c = "LegacyHotwordInvocationSource.kt", mo61345d = "invokeSuspend", mo61346e = {})
/* renamed from: com.google.android.apps.gsa.shared.d.b.a.j */
/* compiled from: PG */
final class C89707j extends C69572j implements C69631q {

    /* renamed from: a */
    final /* synthetic */ C89712o f242847a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C89707j(C89712o oVar, C69577g gVar) {
        super(3, gVar);
        this.f242847a = oVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo17419a(Object obj, Object obj2, Object obj3) {
        C71588o oVar = (C71588o) obj;
        Throwable th = (Throwable) obj2;
        return new C89707j(this.f242847a, (C69577g) obj3).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        C69714l.m101134b(obj);
        this.f242847a.f242858e.set(false);
        return C69788q.f186170a;
    }
}
