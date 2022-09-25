package com.google.android.apps.search.assistant.surfaces.voice.titan.sidepanel.p9743ui.p9751d;

import com.google.android.apps.search.assistant.surfaces.voice.p9673j.p9674a.p9675a.p9677b.C128067ap;
import com.google.android.apps.search.assistant.surfaces.voice.p9673j.p9674a.p9675a.p9677b.C128069ar;
import com.google.android.apps.search.assistant.surfaces.voice.p9673j.p9674a.p9675a.p9677b.C128070as;
import com.google.android.apps.search.assistant.surfaces.voice.p9673j.p9674a.p9675a.p9677b.C128071at;
import com.google.android.apps.search.assistant.surfaces.voice.p9673j.p9674a.p9675a.p9677b.C128075ax;
import com.google.android.apps.search.assistant.surfaces.voice.p9673j.p9674a.p9675a.p9677b.C128120u;
import com.google.android.apps.search.assistant.surfaces.voice.p9673j.p9674a.p9675a.p9677b.C128124y;
import com.google.android.apps.search.assistant.surfaces.voice.shared.p9733ui.p9736c.p9738b.C128584b;
import com.google.apps.tiktok.concurrent.futuresmixin.C46436b;
import com.google.apps.tiktok.concurrent.futuresmixin.C46438d;
import com.google.apps.tiktok.concurrent.futuresmixin.C46439e;
import com.google.apps.tiktok.p3674l.p3679c.C47388b;
import com.google.apps.tiktok.p3674l.p3679c.C47391d;
import com.google.apps.tiktok.p3674l.p3679c.C47392e;
import com.google.protobuf.C62942bv;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.titan.sidepanel.ui.d.i */
/* compiled from: PG */
final class C128679i implements C47391d {

    /* renamed from: a */
    final /* synthetic */ C128676f f353739a;

    public C128679i(C128676f fVar) {
        this.f353739a = fVar;
    }

    /* renamed from: a */
    public final /* synthetic */ C47392e mo18069a(C47388b bVar) {
        C128676f fVar = this.f353739a;
        C69664n.m101061g((C128584b) bVar, "unused");
        C46439e eVar = fVar.f353729c;
        C128120u uVar = fVar.f353731e.f353675b;
        if (uVar != null) {
            C128124y yVar = (C128124y) C128071at.f352396c.createBuilder();
            C69664n.m101060f(yVar, "newBuilder()");
            C128075ax a = C69664n.m101061g(yVar, "builder");
            C128067ap apVar = (C128067ap) C128070as.f352392c.createBuilder();
            C69664n.m101060f(apVar, "newBuilder()");
            C69664n.m101061g(apVar, "builder");
            C128069ar arVar = C128069ar.MIC;
            C69664n.m101061g(arVar, "value");
            apVar.copyOnWrite();
            C128070as asVar = (C128070as) apVar.instance;
            asVar.f352395b = arVar.f352391c;
            asVar.f352394a |= 1;
            C62942bv build = apVar.build();
            C69664n.m101060f(build, "_builder.build()");
            C128070as asVar2 = (C128070as) build;
            C69664n.m101061g(asVar2, "value");
            C128124y yVar2 = a.f352402a;
            yVar2.copyOnWrite();
            C128071at atVar = (C128071at) yVar2.instance;
            asVar2.getClass();
            atVar.f352399b = asVar2;
            atVar.f352398a = 1;
            eVar.mo50445g(C46438d.m82810b(uVar.mo108342c(a.mo108336a())), new C46436b("startVoiceInteraction"), fVar.f353735i);
            return C47392e.f123115a;
        }
        throw new IllegalStateException("Missing VoicePlateClassicServiceFutureStub");
    }
}
