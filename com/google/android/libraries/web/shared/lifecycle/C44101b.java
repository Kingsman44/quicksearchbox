package com.google.android.libraries.web.shared.lifecycle;

import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.libraries.web.shared.lifecycle.b */
/* compiled from: PG */
public final /* synthetic */ class C44101b implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ WebFragmentModelMixin$2 f114792a;

    /* renamed from: b */
    public final /* synthetic */ Consumer f114793b;

    public /* synthetic */ C44101b(WebFragmentModelMixin$2 webFragmentModelMixin$2, Consumer consumer) {
        this.f114792a = webFragmentModelMixin$2;
        this.f114793b = consumer;
    }

    public final void run() {
        WebFragmentModelMixin$2 webFragmentModelMixin$2 = this.f114792a;
        Consumer consumer = this.f114793b;
        C44107h hVar = webFragmentModelMixin$2.f114786d.f114808c;
        if (hVar != null) {
            consumer.accept(hVar);
        }
    }
}
