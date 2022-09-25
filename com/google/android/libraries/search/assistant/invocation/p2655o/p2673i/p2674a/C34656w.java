package com.google.android.libraries.search.assistant.invocation.p2655o.p2673i.p2674a;

import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59094n;
import com.google.common.p4526f.p4527a.C58975e;
import kotlinx.coroutines.C71422aw;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;

@C69567e(mo61343b = "com.google.android.libraries.search.assistant.invocation.triggering.source.hotword.HotwordInvocationSource$onShutdown$2", mo61344c = "HotwordInvocationSource.kt", mo61345d = "invokeSuspend", mo61346e = {95})
/* renamed from: com.google.android.libraries.search.assistant.invocation.o.i.a.w */
/* compiled from: PG */
final class C34656w extends C69572j implements C69630p {

    /* renamed from: a */
    int f92011a;

    /* renamed from: b */
    final /* synthetic */ C34658y f92012b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C34656w(C34658y yVar, C69577g gVar) {
        super(2, gVar);
        this.f92012b = yVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C34656w) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f92011a != 0) {
            C69714l.m101134b(obj);
        } else {
            C69714l.m101134b(obj);
            Object andSet = this.f92012b.f92020d.getAndSet((Object) null);
            if (andSet != null) {
                C59052c cVar = (C59052c) C34658y.f92017a.mo56224b();
                cVar.mo56378ag(C58975e.f156826a, "TRG.HotwordSource");
                cVar.mo56379ah(new C59094n(51363));
                cVar.mo56386p("Shutting down hotword frontend.");
                this.f92011a = 1;
                if (((C34563bg) andSet).mo39414b(this) == aVar) {
                    return aVar;
                }
            } else {
                throw new IllegalArgumentException("Inconsistent lifecycle event, frontend doesn't exist.");
            }
        }
        return C69788q.f186170a;
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        return new C34656w(this.f92012b, gVar);
    }
}
