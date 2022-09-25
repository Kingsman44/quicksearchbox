package com.google.android.libraries.search.assistant.invocation.p2655o.p2673i.p2674a.p2675a.p2677b;

import com.google.android.apps.gsa.search.shared.service.C87673aa;
import com.google.android.apps.gsa.search.shared.service.C88489j;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87739bu;
import com.google.android.apps.gsa.shared.speech.HotwordDetectedEventData;
import p5462h.C69788q;
import p5462h.p5473f.p5474a.C69615a;
import p5462h.p5473f.p5475b.C69665o;

/* renamed from: com.google.android.libraries.search.assistant.invocation.o.i.a.a.b.h */
/* compiled from: PG */
final class C34501h extends C69665o implements C69615a {

    /* renamed from: a */
    final /* synthetic */ HotwordDetectedEventData f91683a;

    /* renamed from: b */
    final /* synthetic */ C87673aa f91684b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C34501h(HotwordDetectedEventData hotwordDetectedEventData, C87673aa aaVar) {
        super(0);
        this.f91683a = hotwordDetectedEventData;
        this.f91684b = aaVar;
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo5672a() {
        C88489j jVar = new C88489j(C87739bu.HOTWORD_DETECTED_IN_INTERACTOR);
        jVar.mo82015c(this.f91683a);
        this.f91684b.mo81937i(jVar.mo82013a());
        return C69788q.f186170a;
    }
}
