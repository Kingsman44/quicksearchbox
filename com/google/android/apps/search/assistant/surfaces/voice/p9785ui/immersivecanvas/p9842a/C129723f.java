package com.google.android.apps.search.assistant.surfaces.voice.p9785ui.immersivecanvas.p9842a;

import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.immersivecanvas.C129739aa;
import com.google.android.apps.search.assistant.surfaces.voice.shared.p9729a.C128548e;
import com.google.android.apps.search.assistant.surfaces.voice.shared.p9729a.C128559p;
import com.google.common.p4526f.C59052c;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.ui.immersivecanvas.a.f */
/* compiled from: PG */
public final class C129723f implements C128559p {

    /* renamed from: a */
    private final Consumer f355975a;

    public C129723f(Consumer consumer) {
        this.f355975a = consumer;
    }

    /* renamed from: a */
    public final void mo107983a(Throwable th) {
        ((C59052c) ((C59052c) ((C59052c) C129739aa.f356023a.mo56225c()).mo56382g(th)).mo56372aa(38414)).mo56386p("Failed to process Continuous Match event.");
    }

    /* renamed from: b */
    public final void mo107984b(C128548e eVar) {
        this.f355975a.accept(eVar);
    }
}
