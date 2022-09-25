package com.google.android.libraries.web.coordinator.internal.fragment;

import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.libraries.web.coordinator.internal.fragment.m */
/* compiled from: PG */
final class C43754m implements Runnable {

    /* renamed from: a */
    final /* synthetic */ WebCoordinatorInternal f114115a;

    /* renamed from: b */
    final /* synthetic */ Consumer f114116b;

    public C43754m(WebCoordinatorInternal webCoordinatorInternal, Consumer consumer) {
        this.f114115a = webCoordinatorInternal;
        this.f114116b = consumer;
    }

    public final void run() {
        this.f114115a.mo46775b(this.f114116b);
    }
}
