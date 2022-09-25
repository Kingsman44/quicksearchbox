package com.google.android.apps.search.assistant.surfaces.voice.controller.p9532ui.p9534b;

import com.google.android.apps.search.assistant.surfaces.voice.shared.p9729a.C128548e;
import com.google.android.apps.search.assistant.surfaces.voice.shared.p9729a.C128559p;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.controller.ui.b.e */
/* compiled from: PG */
final class C127171e implements C128559p {

    /* renamed from: a */
    private final Consumer f350109a;

    /* renamed from: b */
    private final Consumer f350110b;

    public C127171e(Consumer consumer, Consumer consumer2) {
        this.f350109a = consumer;
        this.f350110b = consumer2;
    }

    /* renamed from: a */
    public final void mo107983a(Throwable th) {
        this.f350110b.accept(th);
    }

    /* renamed from: b */
    public final void mo107984b(C128548e eVar) {
        this.f350109a.accept(eVar);
    }
}
