package com.google.android.libraries.search.assistant.invocation.p2655o.p2673i.p2674a;

import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;

@C69567e(mo61343b = "com.google.android.libraries.search.assistant.invocation.triggering.source.hotword.HotwordTriggeringFrontend$Companion$attemptRetry$1", mo61344c = "HotwordTriggeringFrontend.kt", mo61345d = "invokeSuspend", mo61346e = {333})
/* renamed from: com.google.android.libraries.search.assistant.invocation.o.i.a.af */
/* compiled from: PG */
final class C34530af extends C69572j implements C69630p {

    /* renamed from: a */
    int f91766a;

    /* renamed from: b */
    /* synthetic */ Object f91767b;

    /* renamed from: c */
    final /* synthetic */ C69630p f91768c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C34530af(C69630p pVar, C69577g gVar) {
        super(2, gVar);
        this.f91768c = pVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C34530af) mo5194c((Throwable) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f91766a != 0) {
            C69714l.m101134b(obj);
        } else {
            C69714l.m101134b(obj);
            C69630p pVar = this.f91768c;
            this.f91766a = 1;
            if (pVar.mo5192a((Throwable) this.f91767b, this) == aVar) {
                return aVar;
            }
        }
        return true;
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        C34530af afVar = new C34530af(this.f91768c, gVar);
        afVar.f91767b = obj;
        return afVar;
    }
}
