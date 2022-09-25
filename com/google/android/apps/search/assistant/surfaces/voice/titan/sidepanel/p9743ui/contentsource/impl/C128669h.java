package com.google.android.apps.search.assistant.surfaces.voice.titan.sidepanel.p9743ui.contentsource.impl;

import com.google.android.apps.search.assistant.surfaces.voice.p9673j.p9674a.p9675a.p9677b.C128078b;
import com.google.android.apps.search.assistant.surfaces.voice.p9673j.p9674a.p9675a.p9677b.C128114o;
import com.google.android.apps.search.assistant.surfaces.voice.titan.sidepanel.p9743ui.voiceplatevisibility.impl.C128687a;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59094n;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.protobuf.C62963cj;
import p5462h.p5473f.p5475b.C69664n;
import p5488io.grpc.p5533i.C70862aj;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.titan.sidepanel.ui.contentsource.impl.h */
/* compiled from: PG */
public final class C128669h implements C70862aj {

    /* renamed from: a */
    final /* synthetic */ C128670i f353708a;

    public C128669h(C128670i iVar) {
        this.f353708a = iVar;
    }

    /* renamed from: a */
    public final void mo20121a() {
        C58976aa aaVar = C58975e.f156826a;
    }

    /* renamed from: b */
    public final void mo20122b(Throwable th) {
        C59052c cVar = (C59052c) C128670i.f353709a.mo56226d();
        cVar.mo56378ag(C58975e.f156826a, "SidePanelVPContentSrc");
        C59052c cVar2 = (C59052c) cVar.mo56382g(th);
        cVar2.mo56379ah(new C59094n(37942));
        cVar2.mo56386p("VoicePlateStateResponse stream error");
    }

    /* renamed from: c */
    public final /* synthetic */ void mo20123c(Object obj) {
        C128114o oVar = (C128114o) obj;
        C69664n.m101061g(oVar, "value");
        C58976aa aaVar = C58975e.f156826a;
        new C62963cj(oVar.f352493a, C128114o.f352490b);
        C128687a aVar = this.f353708a.f353718j;
        boolean contains = new C62963cj(oVar.f352493a, C128114o.f352490b).contains(C128078b.CLIENT_TITAN_VIS_VOICE_PLATE);
        if (aVar.f353753a != contains) {
            aVar.f353753a = contains;
            aVar.mo108619a();
        }
    }
}
