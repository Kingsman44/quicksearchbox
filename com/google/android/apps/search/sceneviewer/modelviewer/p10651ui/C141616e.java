package com.google.android.apps.search.sceneviewer.modelviewer.p10651ui;

import android.view.ViewTreeObserver;

/* renamed from: com.google.android.apps.search.sceneviewer.modelviewer.ui.e */
/* compiled from: PG */
final class C141616e implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: a */
    final /* synthetic */ PlacementHelpOverlay f384417a;

    public C141616e(PlacementHelpOverlay placementHelpOverlay) {
        this.f384417a = placementHelpOverlay;
    }

    public final void onGlobalLayout() {
        this.f384417a.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        this.f384417a.mo116605c();
    }
}
