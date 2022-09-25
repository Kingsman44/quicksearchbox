package com.google.android.libraries.search.assistant.invocation.p2655o.p2673i.p2674a;

import com.google.android.libraries.search.p3055n.C39264an;
import com.google.android.libraries.search.p3055n.C39265ao;
import com.google.android.libraries.search.p3055n.C39267aq;
import com.google.android.libraries.search.p3055n.C39268ar;
import com.google.android.libraries.search.p3055n.C39270at;
import com.google.android.libraries.search.p3055n.p3061c.C39379a;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59094n;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60870cx;
import com.google.protobuf.C62940bt;
import com.google.speech.p5218j.C67020ib;
import com.google.speech.p5218j.C67086kn;
import com.google.speech.p5218j.C67087ko;
import kotlinx.coroutines.C71422aw;
import kotlinx.coroutines.p5578d.C71663i;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;
import p5462h.p5473f.p5475b.C69664n;

@C69567e(mo61343b = "com.google.android.libraries.search.assistant.invocation.triggering.source.hotword.HotwordInvocationSource$verify$1", mo61344c = "HotwordInvocationSource.kt", mo61345d = "invokeSuspend", mo61346e = {113})
/* renamed from: com.google.android.libraries.search.assistant.invocation.o.i.a.x */
/* compiled from: PG */
final class C34657x extends C69572j implements C69630p {

    /* renamed from: a */
    int f92013a;

    /* renamed from: b */
    final /* synthetic */ C34658y f92014b;

    /* renamed from: c */
    final /* synthetic */ C39264an f92015c;

    /* renamed from: d */
    private /* synthetic */ Object f92016d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C34657x(C34658y yVar, C39264an anVar, C69577g gVar) {
        super(2, gVar);
        this.f92014b = yVar;
        this.f92015c = anVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C34657x) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C39379a aVar;
        C69554a aVar2 = C69554a.COROUTINE_SUSPENDED;
        if (this.f92013a != 0) {
            C69714l.m101134b(obj);
        } else {
            C69714l.m101134b(obj);
            C71422aw awVar = (C71422aw) this.f92016d;
            C34563bg bgVar = (C34563bg) this.f92014b.f92020d.get();
            if (bgVar == null || (aVar = (C39379a) bgVar.f91828d.mo62784e()) == null) {
                C59052c cVar = (C59052c) C34658y.f92017a.mo56226d();
                cVar.mo56378ag(C58975e.f156826a, "TRG.HotwordSource");
                cVar.mo56379ah(new C59094n(51364));
                cVar.mo56386p("No active frontend for external hotword verification.");
                C67086kn knVar = (C67086kn) C67087ko.f182366n.createBuilder();
                C69664n.m101060f(knVar, "newBuilder()");
                C67020ib a = C69664n.m101061g(knVar, "builder");
                C62940bt btVar = C39268ar.f103440e;
                C69664n.m101060f(btVar, "eventId");
                C39265ao aoVar = (C39265ao) C39268ar.f103439d.createBuilder();
                C69664n.m101060f(aoVar, "newBuilder()");
                C39270at a2 = C69664n.m101061g(aoVar, "builder");
                a2.mo41752b(C39267aq.INVALID_REQUEST);
                C39265ao aoVar2 = a2.f103445a;
                aoVar2.copyOnWrite();
                C39268ar arVar = (C39268ar) aoVar2.instance;
                arVar.f103442a |= 2;
                arVar.f103444c = "No active frontend for external hotword verification.";
                C39268ar a3 = a2.mo41751a();
                C69664n.m101061g(btVar, "extension");
                C69664n.m101061g(a3, "value");
                a.f182182a.mo58885m(btVar, a3);
                return a.mo59762a();
            }
            C60870cx d = aVar.mo41789d(this.f92015c);
            C69664n.m101060f(d, "delegate.verifyHotwordDetection(params)");
            this.f92013a = 1;
            obj = C71663i.m104690c(d, this);
            if (obj == aVar2) {
                return aVar2;
            }
        }
        C69664n.m101060f(obj, "delegate.verifyHotwordDetection(params).await()");
        return obj;
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        C34657x xVar = new C34657x(this.f92014b, this.f92015c, gVar);
        xVar.f92016d = obj;
        return xVar;
    }
}
