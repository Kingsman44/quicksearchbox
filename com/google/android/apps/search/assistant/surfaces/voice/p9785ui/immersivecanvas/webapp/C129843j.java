package com.google.android.apps.search.assistant.surfaces.voice.p9785ui.immersivecanvas.webapp;

import com.google.android.apps.search.assistant.surfaces.voice.shared.p9729a.C128548e;
import com.google.android.apps.search.assistant.surfaces.voice.shared.p9729a.C128559p;
import com.google.common.p4526f.C59052c;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.ui.immersivecanvas.webapp.j */
/* compiled from: PG */
final class C129843j implements C128559p {

    /* renamed from: a */
    private final Consumer f356242a;

    public C129843j(Consumer consumer) {
        this.f356242a = consumer;
    }

    /* renamed from: a */
    public final void mo107983a(Throwable th) {
        ((C59052c) ((C59052c) ((C59052c) CanvasWebAppFragmentPeer.f356144a.mo56225c()).mo56382g(th)).mo56372aa(38477)).mo56386p("Failed to process timepoint event.");
    }

    /* renamed from: b */
    public final void mo107984b(C128548e eVar) {
        this.f356242a.accept(eVar);
    }
}
