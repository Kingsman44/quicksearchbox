package com.google.android.libraries.p579ar.sceneviewer.p589ui;

import android.view.ViewTreeObserver;

/* renamed from: com.google.android.libraries.ar.sceneviewer.ui.a */
/* compiled from: PG */
final class C10757a implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: a */
    final /* synthetic */ FloatingButton f35717a;

    public C10757a(FloatingButton floatingButton) {
        this.f35717a = floatingButton;
    }

    public final void onGlobalLayout() {
        this.f35717a.fullyInflated = true;
        this.f35717a.getViewTreeObserver().removeOnGlobalLayoutListener(this);
    }
}
