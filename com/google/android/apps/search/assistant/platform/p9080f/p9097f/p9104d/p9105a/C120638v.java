package com.google.android.apps.search.assistant.platform.p9080f.p9097f.p9104d.p9105a;

import com.google.android.apps.search.assistant.platform.ondevice.fulfillment.p9278a.C122444ci;
import com.google.android.apps.search.assistant.platform.ondevice.fulfillment.p9278a.C122445cj;
import com.google.android.apps.search.assistant.platform.ondevice.fulfillment.p9278a.C122459n;
import com.google.android.apps.search.assistant.platform.ondevice.fulfillment.p9278a.C122461p;
import com.google.android.apps.search.assistant.platform.p9080f.p9097f.p9104d.C120643b;
import com.google.android.apps.search.assistant.platform.p9080f.p9097f.p9104d.p9105a.p9106a.C120613b;
import com.google.android.apps.search.assistant.platform.p9080f.p9123l.C120810c;
import com.google.android.apps.search.assistant.platform.p9080f.p9123l.C120811d;
import com.google.android.apps.search.assistant.platform.p9080f.p9123l.C120813f;
import com.google.android.apps.search.assistant.platform.p9080f.p9123l.C120815h;
import com.google.android.libraries.search.assistant.p2570h.p2578b.p2582d.C33470a;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59094n;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protos.p4985f.p5030q.C65189ew;
import com.google.protos.p4985f.p5030q.C65190ex;
import com.google.protos.p4985f.p5030q.C65206fm;
import com.google.speech.p5218j.C67050je;
import com.google.speech.p5218j.C67091ks;
import kotlinx.coroutines.C71422aw;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;
import p5462h.p5473f.p5475b.C69664n;

@C69567e(mo61343b = "com.google.android.apps.search.assistant.platform.processing.fulfillment.ondevice.impl.OnDeviceFulfillmentResultProducerModule$doPrefetch$1", mo61344c = "OnDeviceFulfillmentResultProducerModule.kt", mo61345d = "invokeSuspend", mo61346e = {39})
/* renamed from: com.google.android.apps.search.assistant.platform.f.f.d.a.v */
/* compiled from: PG */
final class C120638v extends C69572j implements C69630p {

    /* renamed from: a */
    int f335558a;

    /* renamed from: b */
    final /* synthetic */ C33470a f335559b;

    /* renamed from: c */
    final /* synthetic */ boolean f335560c;

    /* renamed from: d */
    final /* synthetic */ C120616ab f335561d;

    /* renamed from: e */
    final /* synthetic */ C120811d f335562e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C120638v(C33470a aVar, boolean z, C120616ab abVar, C120811d dVar, C69577g gVar) {
        super(2, gVar);
        this.f335559b = aVar;
        this.f335560c = z;
        this.f335561d = abVar;
        this.f335562e = dVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C120638v) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C120815h hVar;
        C120815h hVar2;
        C120813f fVar;
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f335558a != 0) {
            try {
                C69714l.m101134b(obj);
            } catch (Throwable th) {
                C59052c cVar = (C59052c) C120639w.f335563a.mo56226d();
                cVar.mo56378ag(C58975e.f156826a, "ConvEngine.OnDeviceFulfill");
                C59052c cVar2 = (C59052c) cVar.mo56382g(th);
                cVar2.mo56379ah(new C59094n(35539));
                cVar2.mo56386p("#doPrefetch: on-device fulfillment failed");
                throw th;
            }
        } else {
            C69714l.m101134b(obj);
            C33470a aVar2 = this.f335559b;
            String valueOf = String.valueOf(this.f335560c);
            C69664n.m101061g(valueOf, "value");
            aVar2.f89578a.mo38876c("Is Final Request:", valueOf);
            C58976aa aaVar = C58975e.f156826a;
            C120616ab abVar = this.f335561d;
            C120811d dVar = this.f335562e;
            C69664n.m101061g(dVar, "<this>");
            C122459n nVar = (C122459n) C122461p.f339487e.createBuilder();
            C69664n.m101060f(nVar, "newBuilder()");
            C69664n.m101061g(nVar, "builder");
            int b = C120810c.m200013b(dVar.f335967a);
            int i = b - 1;
            C67091ks ksVar = null;
            if (b != 0) {
                if (i == 0) {
                    C122444ci ciVar = (C122444ci) C122445cj.f339450b.createBuilder();
                    C69664n.m101060f(ciVar, "newBuilder()");
                    C69664n.m101061g(ciVar, "builder");
                    if (dVar.f335967a == 1) {
                        hVar = (C120815h) dVar.f335968b;
                    } else {
                        hVar = C120815h.f335972f;
                    }
                    String str = hVar.f335975b;
                    C69664n.m101060f(str, "request.speech.recognizedText");
                    C69664n.m101061g(str, "value");
                    ciVar.copyOnWrite();
                    str.getClass();
                    ((C122445cj) ciVar.instance).f339452a = str;
                    C62942bv build = ciVar.build();
                    C69664n.m101060f(build, "_builder.build()");
                    C122445cj cjVar = (C122445cj) build;
                    C69664n.m101061g(cjVar, "value");
                    nVar.copyOnWrite();
                    C122461p pVar = (C122461p) nVar.instance;
                    cjVar.getClass();
                    pVar.f339491c = cjVar;
                    pVar.f339490b = 1;
                    if (dVar.f335967a == 1) {
                        hVar2 = (C120815h) dVar.f335968b;
                    } else {
                        hVar2 = C120815h.f335972f;
                    }
                    C67050je jeVar = hVar2.f335977d;
                    if (jeVar == null) {
                        jeVar = C67050je.f182262f;
                    }
                    C69664n.m101060f(jeVar, "request.speech.hotwordEvent");
                    C69664n.m101061g(jeVar, "<this>");
                    if ((jeVar.f182264a & 4) != 0 && (ksVar = jeVar.f182267d) == null) {
                        ksVar = C67091ks.f182386h;
                    }
                    if (ksVar != null) {
                        nVar.copyOnWrite();
                        C122461p pVar2 = (C122461p) nVar.instance;
                        pVar2.f339492d = ksVar;
                        pVar2.f339489a |= 1;
                    }
                } else if (i == 1) {
                    C65189ew ewVar = (C65189ew) C65190ex.f176421b.createBuilder();
                    C69664n.m101060f(ewVar, "newBuilder()");
                    C65206fm a = C69664n.m101061g(ewVar, "builder");
                    a.mo59356c();
                    if (dVar.f335967a == 2) {
                        fVar = (C120813f) dVar.f335968b;
                    } else {
                        fVar = C120813f.f335969b;
                    }
                    C62971cq cqVar = fVar.f335971a;
                    C69664n.m101060f(cqVar, "request.singleShot.interactionsList");
                    a.mo59355b(cqVar);
                    C65190ex a2 = a.mo59354a();
                    C69664n.m101061g(a2, "value");
                    nVar.copyOnWrite();
                    C122461p pVar3 = (C122461p) nVar.instance;
                    a2.getClass();
                    pVar3.f339491c = a2;
                    pVar3.f339490b = 2;
                } else {
                    throw new C120619c("Prefetch type not set", C120613b.UNKNOWN_PREFETCH_TYPE);
                }
                C62942bv build2 = nVar.build();
                C69664n.m101060f(build2, "_builder.build()");
                this.f335558a = 1;
                obj = abVar.mo104857a((C122461p) build2, this);
                if (obj == aVar) {
                    return aVar;
                }
            } else {
                throw null;
            }
        }
        return (C120643b) obj;
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        return new C120638v(this.f335559b, this.f335560c, this.f335561d, this.f335562e, gVar);
    }
}
