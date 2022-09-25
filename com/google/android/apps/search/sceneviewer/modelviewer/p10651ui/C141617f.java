package com.google.android.apps.search.sceneviewer.modelviewer.p10651ui;

import android.view.ViewTreeObserver;

/* renamed from: com.google.android.apps.search.sceneviewer.modelviewer.ui.f */
/* compiled from: PG */
final class C141617f implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: a */
    final /* synthetic */ PlacementHelpOverlay f384418a;

    public C141617f(PlacementHelpOverlay placementHelpOverlay) {
        this.f384418a = placementHelpOverlay;
    }

    public final void onGlobalLayout() {
        this.f384418a.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        this.f384418a.mo116604b();
    }
}
