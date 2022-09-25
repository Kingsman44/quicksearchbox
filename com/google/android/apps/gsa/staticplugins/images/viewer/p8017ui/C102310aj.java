package com.google.android.apps.gsa.staticplugins.images.viewer.p8017ui;

import android.view.ViewTreeObserver;

/* renamed from: com.google.android.apps.gsa.staticplugins.images.viewer.ui.aj */
/* compiled from: PG */
final class C102310aj implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: a */
    final /* synthetic */ Runnable f285547a;

    /* renamed from: b */
    final /* synthetic */ ImageViewerPage f285548b;

    public C102310aj(ImageViewerPage imageViewerPage, Runnable runnable) {
        this.f285548b = imageViewerPage;
        this.f285547a = runnable;
    }

    public final void onGlobalLayout() {
        this.f285547a.run();
        this.f285548b.getViewTreeObserver().removeOnGlobalLayoutListener(this);
    }
}
