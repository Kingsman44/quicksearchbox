package com.google.android.apps.search.assistant.surfaces.voice.p9785ui.immersivecanvas.webapp;

import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.immersivecanvas.webapp.p9852b.p9853a.p9854a.C129821b;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.immersivecanvas.webapp.p9852b.p9853a.p9854a.C129822c;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.immersivecanvas.webapp.p9852b.p9853a.p9854a.C129825f;
import com.google.android.apps.search.assistant.surfaces.voice.shared.p9729a.C128547d;
import com.google.android.apps.search.assistant.surfaces.voice.shared.p9729a.C128548e;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.ui.immersivecanvas.webapp.f */
/* compiled from: PG */
public final /* synthetic */ class C129839f implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ CanvasWebAppFragmentPeer f356233a;

    public /* synthetic */ C129839f(CanvasWebAppFragmentPeer canvasWebAppFragmentPeer) {
        this.f356233a = canvasWebAppFragmentPeer;
    }

    public final void accept(Object obj) {
        CanvasWebAppFragmentPeer canvasWebAppFragmentPeer = this.f356233a;
        C128548e eVar = (C128548e) obj;
        C128547d b = eVar.mo108513b((Runnable) null);
        canvasWebAppFragmentPeer.mo109270e(((C129821b) eVar.f353476a).f356202b);
        C129822c cVar = (C129822c) C129825f.f356204c.createBuilder();
        cVar.copyOnWrite();
        C129825f fVar = (C129825f) cVar.instance;
        fVar.f356207b = 1;
        fVar.f356206a = 1 | fVar.f356206a;
        b.mo108511a((C129825f) cVar.build());
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
