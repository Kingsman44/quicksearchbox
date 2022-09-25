package com.google.android.libraries.search.assistant.invocation.p2617f.p2624c.p2625a.p2626a;

import android.os.Bundle;
import com.google.android.libraries.search.assistant.invocation.android.voiceinteraction.session.p2594d.C33515a;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59094n;
import com.google.common.p4526f.p4527a.C58975e;
import p3186j$.time.Duration;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69626l;
import p5462h.p5473f.p5475b.C69664n;

@C69567e(mo61343b = "com.google.android.libraries.search.assistant.invocation.core.voiceinteraction.session.callbacks.ApaVoiceInteractionSessionCallbacksImpl$onShowEffective$1", mo61344c = "ApaVoiceInteractionSessionCallbacksImpl.kt", mo61345d = "invokeSuspend", mo61346e = {113, 113, 113})
/* renamed from: com.google.android.libraries.search.assistant.invocation.f.c.a.a.ag */
/* compiled from: PG */
final class C33767ag extends C69572j implements C69626l {

    /* renamed from: a */
    int f90180a;

    /* renamed from: b */
    final /* synthetic */ C33768ah f90181b;

    /* renamed from: c */
    final /* synthetic */ Bundle f90182c;

    /* renamed from: d */
    final /* synthetic */ int f90183d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C33767ag(C33768ah ahVar, Bundle bundle, int i, C69577g gVar) {
        super(1, gVar);
        this.f90181b = ahVar;
        this.f90182c = bundle;
        this.f90183d = i;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5761a(Object obj) {
        return new C33767ag(this.f90181b, this.f90182c, this.f90183d, (C69577g) obj).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f90180a != 0) {
            C69714l.m101134b(obj);
        } else {
            C69714l.m101134b(obj);
            C33768ah ahVar = this.f90181b;
            C33777aq aqVar = ahVar.f90191g;
            Bundle bundle = this.f90182c;
            int i = this.f90183d;
            if (!C33515a.m62108a(aqVar.f90228e, bundle)) {
                C58976aa aaVar = C58975e.f156826a;
                ahVar.f90189e.mo39075a();
                ahVar.f90192h.mo105260b(i);
                C33787b bVar = ahVar.f90186b;
                this.f90180a = 1;
                if (bVar.mo39076a(bundle, i, this) == aVar) {
                    return aVar;
                }
            } else if (aqVar.f90226c.compareTo(Duration.ZERO) <= 0) {
                C58976aa aaVar2 = C58975e.f156826a;
                ahVar.f90189e.mo39075a();
                ahVar.f90192h.mo105260b(i);
                C33787b bVar2 = ahVar.f90186b;
                this.f90180a = 2;
                if (bVar2.mo39076a(bundle, i, this) == aVar) {
                    return aVar;
                }
            } else {
                Duration ofMillis = Duration.ofMillis(aqVar.f90225b.mo26871c());
                C69664n.m101060f(ofMillis, "ofMillis(clock.elapsedRealtime())");
                if (ofMillis.compareTo(aqVar.f90227d.plus(aqVar.f90226c)) >= 0) {
                    aqVar.f90227d = ofMillis;
                    C58976aa aaVar3 = C58975e.f156826a;
                    ahVar.f90189e.mo39075a();
                    ahVar.f90192h.mo105260b(i);
                    C33787b bVar3 = ahVar.f90186b;
                    this.f90180a = 3;
                    if (bVar3.mo39076a(bundle, i, this) == aVar) {
                        return aVar;
                    }
                } else {
                    C59052c cVar = (C59052c) C33777aq.f90224a.mo56226d();
                    cVar.mo56378ag(C58975e.f156826a, "VIS.Callbacks");
                    cVar.mo56379ah(new C59094n(51289));
                    cVar.mo56386p("Reject: invocation within rejection period.");
                }
            }
        }
        return C69788q.f186170a;
    }
}
