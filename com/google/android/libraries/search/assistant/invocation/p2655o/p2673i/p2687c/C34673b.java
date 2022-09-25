package com.google.android.libraries.search.assistant.invocation.p2655o.p2673i.p2687c;

import com.google.android.libraries.search.assistant.invocation.p2655o.p2663f.p2664a.C34234aq;
import com.google.android.libraries.search.assistant.invocation.p2655o.p2673i.p2687c.p2688a.C34669b;
import com.google.android.libraries.search.assistant.invocation.p2655o.p2673i.p2687c.p2688a.C34670c;
import com.google.android.libraries.search.assistant.p2825x.C36785a;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;
import p5462h.p5473f.p5475b.C69664n;

@C69567e(mo61343b = "com.google.android.libraries.search.assistant.invocation.triggering.source.quickphrases.QuickPhrasesInvocationSource$initialize$1$coroutineContext$1", mo61344c = "QuickPhrasesInvocationSource.kt", mo61345d = "invokeSuspend", mo61346e = {})
/* renamed from: com.google.android.libraries.search.assistant.invocation.o.i.c.b */
/* compiled from: PG */
final class C34673b extends C69572j implements C69630p {

    /* renamed from: a */
    /* synthetic */ Object f92062a;

    /* renamed from: b */
    final /* synthetic */ C34683e f92063b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C34673b(C34683e eVar, C69577g gVar) {
        super(2, gVar);
        this.f92063b = eVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C34673b) mo5194c((C34234aq) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C34670c cVar;
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        C69714l.m101134b(obj);
        C34234aq aqVar = (C34234aq) this.f92062a;
        C36785a aVar2 = this.f92063b.f92087b;
        if (aqVar != null) {
            cVar = (C34670c) aqVar.mo39278a();
        } else {
            C34669b bVar = (C34669b) C34670c.f92054e.createBuilder();
            C69664n.m101060f(bVar, "newBuilder()");
            cVar = C69664n.m101061g(bVar, "builder").mo39462a();
        }
        aVar2.mo40400c(cVar, aqVar != null ? aqVar.f91084b.f90872a : null);
        return C69788q.f186170a;
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        C34673b bVar = new C34673b(this.f92063b, gVar);
        bVar.f92062a = obj;
        return bVar;
    }
}
