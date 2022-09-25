package com.google.android.libraries.search.assistant.invocation.p2655o.p2673i.p2674a.p2679c;

import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59094n;
import com.google.common.p4526f.p4527a.C58975e;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;

@C69567e(mo61343b = "com.google.android.libraries.search.assistant.invocation.triggering.source.hotword.consumer.HotwordConsumerFlowDelegate$flow$2", mo61344c = "HotwordConsumerFlow.kt", mo61345d = "invokeSuspend", mo61346e = {})
/* renamed from: com.google.android.libraries.search.assistant.invocation.o.i.a.c.g */
/* compiled from: PG */
final class C34571g extends C69572j implements C69630p {

    /* renamed from: a */
    /* synthetic */ Object f91845a;

    public C34571g(C69577g gVar) {
        super(2, gVar);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C34571g) mo5194c(obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        C69714l.m101134b(obj);
        Object obj2 = this.f91845a;
        C59052c cVar = (C59052c) C34573i.f91850a.mo56224b();
        cVar.mo56378ag(C58975e.f156826a, "TRG.HotwordConsumerFlow");
        cVar.mo56379ah(new C59094n(51409));
        cVar.mo56389s("On hotword consumer changed: %s.", obj2);
        return C69788q.f186170a;
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        C34571g gVar2 = new C34571g(gVar);
        gVar2.f91845a = obj;
        return gVar2;
    }
}
