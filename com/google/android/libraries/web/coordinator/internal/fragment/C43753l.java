package com.google.android.libraries.web.coordinator.internal.fragment;

import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.libraries.web.coordinator.internal.fragment.l */
/* compiled from: PG */
final class C43753l implements Runnable {

    /* renamed from: a */
    final /* synthetic */ WebCoordinatorInternal f114113a;

    /* renamed from: b */
    final /* synthetic */ Consumer f114114b;

    public C43753l(WebCoordinatorInternal webCoordinatorInternal, Consumer consumer) {
        this.f114113a = webCoordinatorInternal;
        this.f114114b = consumer;
    }

    public final void run() {
        this.f114113a.mo46775b(this.f114114b);
    }
}
