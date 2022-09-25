package com.google.android.libraries.search.assistant.invocation.p2655o.p2673i.p2674a;

import com.google.android.libraries.search.p3055n.C39251aa;
import com.google.android.libraries.search.p3055n.C39253ac;
import com.google.android.libraries.search.p3055n.p3061c.C39379a;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69631q;
import p5462h.p5473f.p5475b.C69664n;

@C69567e(mo61343b = "com.google.android.libraries.search.assistant.invocation.triggering.source.hotword.HotwordTriggeringFrontend$hotwordInvocationSourceState$1", mo61344c = "HotwordTriggeringFrontend.kt", mo61345d = "invokeSuspend", mo61346e = {})
/* renamed from: com.google.android.libraries.search.assistant.invocation.o.i.a.aw */
/* compiled from: PG */
final class C34547aw extends C69572j implements C69631q {

    /* renamed from: a */
    /* synthetic */ Object f91791a;

    /* renamed from: b */
    /* synthetic */ Object f91792b;

    public C34547aw(C69577g gVar) {
        super(3, gVar);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo17419a(Object obj, Object obj2, Object obj3) {
        C34547aw awVar = new C34547aw((C69577g) obj3);
        awVar.f91791a = (C34526ab) obj;
        awVar.f91792b = (C39379a) obj2;
        return awVar.mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        C69714l.m101134b(obj);
        Object obj2 = this.f91791a;
        if (this.f91792b != null) {
            return obj2;
        }
        C34525aa aaVar = (C34525aa) C34526ab.f91759c.createBuilder();
        C69664n.m101060f(aaVar, "newBuilder()");
        C34528ad a = C69664n.m101061g(aaVar, "builder");
        C39251aa aaVar2 = (C39251aa) C39253ac.f103396c.createBuilder();
        C69664n.m101060f(aaVar2, "newBuilder()");
        a.mo39384b(C69664n.m101061g(aaVar2, "builder").mo41749a());
        return a.mo39383a();
    }
}
