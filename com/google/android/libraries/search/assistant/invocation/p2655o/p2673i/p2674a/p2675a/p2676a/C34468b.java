package com.google.android.libraries.search.assistant.invocation.p2655o.p2673i.p2674a.p2675a.p2676a;

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

@C69567e(mo61343b = "com.google.android.libraries.search.assistant.invocation.triggering.source.hotword.adapter.bisto.BistoHotwordListener$onReady$3", mo61344c = "BistoHotwordListener.kt", mo61345d = "invokeSuspend", mo61346e = {})
/* renamed from: com.google.android.libraries.search.assistant.invocation.o.i.a.a.a.b */
/* compiled from: PG */
final class C34468b extends C69572j implements C69630p {

    /* renamed from: a */
    /* synthetic */ Object f91587a;

    public C34468b(C69577g gVar) {
        super(2, gVar);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C34468b) mo5194c((C34485s) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        C69714l.m101134b(obj);
        C59052c cVar = (C59052c) C34471e.f91591a.mo56224b();
        cVar.mo56378ag(C58975e.f156826a, "TRG.BistoHotwordStatus");
        cVar.mo56379ah(new C59094n(51391));
        cVar.mo56389s("On new legacy external hotword consumer configuration: %s.", (C34485s) this.f91587a);
        return C69788q.f186170a;
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        C34468b bVar = new C34468b(gVar);
        bVar.f91587a = obj;
        return bVar;
    }
}
