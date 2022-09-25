package com.google.android.apps.search.assistant.surfaces.voice.p9785ui.immersivecanvas.webapp;

import com.google.android.apps.search.assistant.surfaces.voice.p9696m.p9710l.p9711a.C128365b;
import com.google.android.apps.search.assistant.surfaces.voice.p9696m.p9710l.p9711a.C128366c;
import com.google.android.apps.search.assistant.surfaces.voice.p9696m.p9710l.p9711a.C128368e;
import com.google.android.apps.search.assistant.surfaces.voice.p9696m.p9710l.p9711a.C128369f;
import com.google.android.apps.search.assistant.surfaces.voice.shared.p9729a.C128547d;
import com.google.android.apps.search.assistant.surfaces.voice.shared.p9729a.C128548e;
import com.google.common.p4580v.C60948g;
import com.google.protobuf.C63042fg;
import com.google.protobuf.p4750c.C62950b;
import p3186j$.time.Duration;
import p3186j$.time.Instant;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.ui.immersivecanvas.webapp.e */
/* compiled from: PG */
public final /* synthetic */ class C129838e implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ CanvasWebAppFragmentPeer f356232a;

    public /* synthetic */ C129838e(CanvasWebAppFragmentPeer canvasWebAppFragmentPeer) {
        this.f356232a = canvasWebAppFragmentPeer;
    }

    public final void accept(Object obj) {
        CanvasWebAppFragmentPeer canvasWebAppFragmentPeer = this.f356232a;
        C128548e eVar = (C128548e) obj;
        C128547d b = eVar.mo108513b((Runnable) null);
        C128365b bVar = (C128365b) eVar.f353476a;
        if ((bVar.f353035a & 2) != 0) {
            CanvasWebAppViewModel canvasWebAppViewModel = canvasWebAppFragmentPeer.f356170x;
            canvasWebAppViewModel.getClass();
            String str = bVar.f353036b;
            C60948g gVar = C60948g.f165068a;
            Instant now = Instant.now();
            C63042fg fgVar = ((C128365b) eVar.f353476a).f353037c;
            if (fgVar == null) {
                fgVar = C63042fg.f170152c;
            }
            canvasWebAppViewModel.f356176a.mo109285a(str, Duration.between(now, C62950b.m95474e(fgVar)));
            C128366c cVar = (C128366c) C128369f.f353045c.createBuilder();
            C128368e eVar2 = C128368e.SUCCESS;
            cVar.copyOnWrite();
            C128369f fVar = (C128369f) cVar.instance;
            fVar.f353048b = eVar2.f353044e;
            fVar.f353047a |= 1;
            b.mo108511a((C128369f) cVar.build());
            return;
        }
        canvasWebAppFragmentPeer.mo109270e(bVar.f353036b);
        C128366c cVar2 = (C128366c) C128369f.f353045c.createBuilder();
        C128368e eVar3 = C128368e.SUCCESS;
        cVar2.copyOnWrite();
        C128369f fVar2 = (C128369f) cVar2.instance;
        fVar2.f353048b = eVar3.f353044e;
        fVar2.f353047a |= 1;
        b.mo108511a((C128369f) cVar2.build());
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
