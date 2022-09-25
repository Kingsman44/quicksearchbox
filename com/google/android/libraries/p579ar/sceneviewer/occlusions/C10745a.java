package com.google.android.libraries.p579ar.sceneviewer.occlusions;

import android.view.ViewTreeObserver;

/* renamed from: com.google.android.libraries.ar.sceneviewer.occlusions.a */
/* compiled from: PG */
final class C10745a implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: a */
    final /* synthetic */ OcclusionsPopup f35706a;

    public C10745a(OcclusionsPopup occlusionsPopup) {
        this.f35706a = occlusionsPopup;
    }

    public final void onGlobalLayout() {
        if (!this.f35706a.isReady) {
            this.f35706a.isReady = true;
            if (this.f35706a.targetView != null) {
                OcclusionsPopup occlusionsPopup = this.f35706a;
                occlusionsPopup.show(occlusionsPopup.targetView);
            }
            this.f35706a.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        }
    }
}
