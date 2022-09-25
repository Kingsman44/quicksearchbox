package com.google.android.apps.gsa.staticplugins.images.viewer.p8017ui;

import android.view.ViewTreeObserver;

/* renamed from: com.google.android.apps.gsa.staticplugins.images.viewer.ui.ak */
/* compiled from: PG */
final class C102311ak implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: a */
    final /* synthetic */ ImageViewerPage f285549a;

    public C102311ak(ImageViewerPage imageViewerPage) {
        this.f285549a = imageViewerPage;
    }

    public final void onGlobalLayout() {
        ((C102384z) this.f285549a.f285473t).f285721a.mo93074e();
        this.f285549a.getViewTreeObserver().removeOnGlobalLayoutListener(this);
    }
}
