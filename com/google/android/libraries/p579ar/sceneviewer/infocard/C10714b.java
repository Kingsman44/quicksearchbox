package com.google.android.libraries.p579ar.sceneviewer.infocard;

import android.view.ViewTreeObserver;

/* renamed from: com.google.android.libraries.ar.sceneviewer.infocard.b */
/* compiled from: PG */
final class C10714b implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: a */
    final /* synthetic */ BottomViewGroup f35637a;

    public C10714b(BottomViewGroup bottomViewGroup) {
        this.f35637a = bottomViewGroup;
    }

    public final void onGlobalLayout() {
        this.f35637a.fullyInflated = true;
        this.f35637a.getViewTreeObserver().removeOnGlobalLayoutListener(this);
    }
}
