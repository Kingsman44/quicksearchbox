package com.google.android.apps.search.assistant.platform.p9080f.p9115j.p9116a;

import com.google.android.apps.search.assistant.platform.p9080f.p9125m.C120816a;
import com.google.speech.p5218j.C66776aq;
import com.google.speech.p5218j.C67020ib;
import com.google.speech.p5218j.C67035iq;
import com.google.speech.p5218j.C67037is;
import com.google.speech.p5218j.C67038it;
import com.google.speech.p5218j.C67086kn;
import com.google.speech.p5218j.C67087ko;
import kotlinx.coroutines.C71422aw;
import kotlinx.coroutines.p5574b.C71587n;
import kotlinx.coroutines.p5574b.C71592s;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;
import p5462h.p5473f.p5475b.C69664n;

@C69567e(mo61343b = "com.google.android.apps.search.assistant.platform.processing.ondevice.impl.OnDeviceStreamingController$processing$2", mo61344c = "OnDeviceStreamingController.kt", mo61345d = "invokeSuspend", mo61346e = {77})
/* renamed from: com.google.android.apps.search.assistant.platform.f.j.a.h */
/* compiled from: PG */
final class C120719h extends C69572j implements C69630p {

    /* renamed from: a */
    int f335752a;

    /* renamed from: b */
    final /* synthetic */ C120723l f335753b;

    /* renamed from: c */
    final /* synthetic */ C120816a f335754c;

    /* renamed from: d */
    private /* synthetic */ Object f335755d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C120719h(C120723l lVar, C120816a aVar, C69577g gVar) {
        super(2, gVar);
        this.f335753b = lVar;
        this.f335754c = aVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C120719h) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f335752a != 0) {
            C69714l.m101134b(obj);
        } else {
            C69714l.m101134b(obj);
            C120723l lVar = this.f335753b;
            C71587n a = lVar.f335767b.mo104910a(C71592s.m104510d(lVar.f335772g));
            C120718g gVar = new C120718g((C71422aw) this.f335755d, this.f335753b, this.f335754c);
            this.f335752a = 1;
            if (a.mo38165mp(gVar, this) == aVar) {
                return aVar;
            }
        }
        C120816a aVar2 = this.f335754c;
        C67086kn knVar = (C67086kn) C67087ko.f182366n.createBuilder();
        C69664n.m101060f(knVar, "newBuilder()");
        C67020ib a2 = C69664n.m101061g(knVar, "builder");
        C67035iq iqVar = (C67035iq) C67038it.f182220d.createBuilder();
        C69664n.m101060f(iqVar, "newBuilder()");
        C66776aq a3 = C69664n.m101061g(iqVar, "builder");
        a3.mo59740b(C67037is.END_OF_SPEECH);
        a2.mo59763b(a3.mo59739a());
        aVar2.mo104868a(a2.mo59762a());
        return C69788q.f186170a;
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        C120719h hVar = new C120719h(this.f335753b, this.f335754c, gVar);
        hVar.f335755d = obj;
        return hVar;
    }
}
