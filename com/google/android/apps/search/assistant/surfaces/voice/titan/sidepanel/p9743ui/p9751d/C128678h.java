package com.google.android.apps.search.assistant.surfaces.voice.titan.sidepanel.p9743ui.p9751d;

import com.google.android.apps.search.assistant.surfaces.voice.p9673j.p9674a.p9675a.p9677b.C128052aa;
import com.google.android.apps.search.assistant.surfaces.voice.p9673j.p9674a.p9675a.p9677b.C128071at;
import com.google.android.apps.search.assistant.surfaces.voice.p9673j.p9674a.p9675a.p9677b.C128073av;
import com.google.android.apps.search.assistant.surfaces.voice.p9673j.p9674a.p9675a.p9677b.C128075ax;
import com.google.android.apps.search.assistant.surfaces.voice.p9673j.p9674a.p9675a.p9677b.C128120u;
import com.google.android.apps.search.assistant.surfaces.voice.p9673j.p9674a.p9675a.p9677b.C128124y;
import com.google.android.apps.search.assistant.surfaces.voice.p9673j.p9674a.p9675a.p9677b.C128125z;
import com.google.android.apps.search.assistant.surfaces.voice.shared.p9733ui.p9736c.p9738b.C128583a;
import com.google.android.apps.search.assistant.surfaces.voice.titan.sidepanel.p9743ui.p9744a.p9745a.C128652a;
import com.google.android.apps.search.assistant.surfaces.voice.titan.sidepanel.p9743ui.p9744a.p9745a.C128653b;
import com.google.apps.tiktok.concurrent.futuresmixin.C46436b;
import com.google.apps.tiktok.concurrent.futuresmixin.C46438d;
import com.google.apps.tiktok.concurrent.futuresmixin.C46439e;
import com.google.apps.tiktok.p3674l.p3679c.C47388b;
import com.google.apps.tiktok.p3674l.p3679c.C47391d;
import com.google.apps.tiktok.p3674l.p3679c.C47392e;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.base.C58817ah;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.titan.sidepanel.ui.d.h */
/* compiled from: PG */
final class C128678h implements C47391d {

    /* renamed from: a */
    final /* synthetic */ C128676f f353738a;

    public C128678h(C128676f fVar) {
        this.f353738a = fVar;
    }

    /* renamed from: a */
    public final /* synthetic */ C47392e mo18069a(C47388b bVar) {
        C128676f fVar = this.f353738a;
        C69664n.m101061g((C128583a) bVar, "unused");
        C46439e eVar = fVar.f353729c;
        C128653b bVar2 = fVar.f353731e;
        C128120u uVar = bVar2.f353675b;
        if (uVar != null) {
            C128124y yVar = (C128124y) C128071at.f352396c.createBuilder();
            C69664n.m101060f(yVar, "newBuilder()");
            C128075ax a = C69664n.m101061g(yVar, "builder");
            C128125z zVar = (C128125z) C128052aa.f352355c.createBuilder();
            C69664n.m101060f(zVar, "newBuilder()");
            C128073av a2 = C69664n.m101061g(zVar, "builder");
            a2.mo108335b(bVar2.f353674a.mo108605a());
            a.mo108337b(a2.mo108334a());
            C60870cx c = uVar.mo108342c(a.mo108336a());
            C58817ah c2 = C47810es.m84963c(C128652a.f353673a);
            eVar.mo50445g(C46438d.m82810b(C60922j.m93044g(c, C47810es.m84963c(c2), C60826bg.f164896a)), new C46436b("stopInteraction"), fVar.f353735i);
            return C47392e.f123115a;
        }
        throw new IllegalStateException("Missing VoicePlateClassicServiceFutureStub");
    }
}
