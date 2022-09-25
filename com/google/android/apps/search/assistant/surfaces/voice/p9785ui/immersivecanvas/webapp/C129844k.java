package com.google.android.apps.search.assistant.surfaces.voice.p9785ui.immersivecanvas.webapp;

import com.google.android.apps.search.assistant.surfaces.voice.shared.p9729a.C128548e;
import com.google.android.apps.search.assistant.surfaces.voice.shared.p9729a.C128559p;
import com.google.common.p4526f.C59052c;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.ui.immersivecanvas.webapp.k */
/* compiled from: PG */
final class C129844k implements C128559p {

    /* renamed from: a */
    private final Consumer f356243a;

    public C129844k(Consumer consumer) {
        this.f356243a = consumer;
    }

    /* renamed from: a */
    public final void mo107983a(Throwable th) {
        ((C59052c) ((C59052c) ((C59052c) CanvasWebAppFragmentPeer.f356144a.mo56225c()).mo56382g(th)).mo56372aa(38478)).mo56386p("Failed to process TTS mark event.");
    }

    /* renamed from: b */
    public final void mo107984b(C128548e eVar) {
        this.f356243a.accept(eVar);
    }
}
