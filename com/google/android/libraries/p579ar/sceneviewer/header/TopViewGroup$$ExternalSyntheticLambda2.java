package com.google.android.libraries.p579ar.sceneviewer.header;

import android.view.ViewTreeObserver;

/* renamed from: com.google.android.libraries.ar.sceneviewer.header.TopViewGroup$$ExternalSyntheticLambda2 */
/* compiled from: PG */
public final /* synthetic */ class TopViewGroup$$ExternalSyntheticLambda2 implements ViewTreeObserver.OnGlobalLayoutListener {
    public /* synthetic */ TopViewGroup f$0;

    public /* synthetic */ TopViewGroup$$ExternalSyntheticLambda2(TopViewGroup topViewGroup) {
        this.f$0 = topViewGroup;
    }

    public final void onGlobalLayout() {
        this.f$0.updateOcclusionPopupPosition();
    }
}
