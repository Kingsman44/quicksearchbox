package com.google.android.libraries.search.assistant.invocation.p2655o.p2667h.p2672d;

import java.util.concurrent.CancellationException;
import kotlinx.coroutines.C71647ct;
import kotlinx.coroutines.p5574b.C71588o;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69631q;
import p5462h.p5473f.p5475b.C69648ae;

@C69567e(mo61343b = "com.google.android.libraries.search.assistant.invocation.triggering.service.platform.PlatformConfigurationTracker$initialize$1$coroutineContext$2", mo61344c = "PlatformConfigurationTracker.kt", mo61345d = "invokeSuspend", mo61346e = {})
/* renamed from: com.google.android.libraries.search.assistant.invocation.o.h.d.p */
/* compiled from: PG */
final class C34451p extends C69572j implements C69631q {

    /* renamed from: a */
    final /* synthetic */ C69648ae f91552a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C34451p(C69648ae aeVar, C69577g gVar) {
        super(3, gVar);
        this.f91552a = aeVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo17419a(Object obj, Object obj2, Object obj3) {
        C71588o oVar = (C71588o) obj;
        Throwable th = (Throwable) obj2;
        return new C34451p(this.f91552a, (C69577g) obj3).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        C69714l.m101134b(obj);
        for (C34449n nVar : (Iterable) this.f91552a.f186027a) {
            C71647ct.m104639c(nVar.f91546d, (CancellationException) null);
        }
        return C69788q.f186170a;
    }
}
