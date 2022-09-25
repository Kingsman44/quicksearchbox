package com.google.android.apps.search.sceneviewer.modelviewer.p10651ui;

import android.view.ViewTreeObserver;

/* renamed from: com.google.android.apps.search.sceneviewer.modelviewer.ui.c */
/* compiled from: PG */
final class C141614c implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: a */
    final /* synthetic */ PlacementHelpOverlay f384409a;

    public C141614c(PlacementHelpOverlay placementHelpOverlay) {
        this.f384409a = placementHelpOverlay;
    }

    public final void onGlobalLayout() {
        PlacementHelpOverlay placementHelpOverlay = this.f384409a;
        placementHelpOverlay.f384404d = true;
        placementHelpOverlay.mo116604b();
        this.f384409a.mo116605c();
        this.f384409a.getViewTreeObserver().removeOnGlobalLayoutListener(this);
    }
}
