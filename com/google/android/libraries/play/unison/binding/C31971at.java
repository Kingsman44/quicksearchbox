package com.google.android.libraries.play.unison.binding;

/* renamed from: com.google.android.libraries.play.unison.binding.at */
/* compiled from: PG */
final class C31971at implements Runnable {

    /* renamed from: a */
    final /* synthetic */ C31978d f85966a;

    /* renamed from: b */
    final /* synthetic */ C31974aw f85967b;

    public C31971at(C31978d dVar, C31974aw awVar) {
        this.f85966a = dVar;
        this.f85967b = awVar;
    }

    public final void run() {
        if (!this.f85966a.mo37747j()) {
            this.f85967b.f85969a = null;
            return;
        }
        throw new IllegalStateException("Root Bindable is still bound at Lifecycle destruction. The required RootBindableController.unbind() call is missing.");
    }
}
