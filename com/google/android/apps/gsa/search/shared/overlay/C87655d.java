package com.google.android.apps.gsa.search.shared.overlay;

import android.view.MotionEvent;
import android.view.View;

/* renamed from: com.google.android.apps.gsa.search.shared.overlay.d */
/* compiled from: PG */
final class C87655d implements View.OnTouchListener {

    /* renamed from: a */
    final /* synthetic */ OverlaySearchPlateContainer f236914a;

    public C87655d(OverlaySearchPlateContainer overlaySearchPlateContainer) {
        this.f236914a = overlaySearchPlateContainer;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        return (this.f236914a.f236698b == 0 || view.getVisibility() == 0) ? false : true;
    }
}
