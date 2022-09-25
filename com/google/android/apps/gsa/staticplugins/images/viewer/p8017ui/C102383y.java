package com.google.android.apps.gsa.staticplugins.images.viewer.p8017ui;

import android.animation.ValueAnimator;

/* renamed from: com.google.android.apps.gsa.staticplugins.images.viewer.ui.y */
/* compiled from: PG */
public final /* synthetic */ class C102383y implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a */
    public final /* synthetic */ ImageViewerPage f285720a;

    public /* synthetic */ C102383y(ImageViewerPage imageViewerPage) {
        this.f285720a = imageViewerPage;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        ImageViewerPage imageViewerPage = this.f285720a;
        if (imageViewerPage.f285454a.f285689k) {
            imageViewerPage.mo93082m(((Float) valueAnimator.getAnimatedValue()).floatValue(), (float) (imageViewerPage.getWidth() / 2), (float) (imageViewerPage.getHeight() / 2));
        } else {
            imageViewerPage.mo93082m(((Float) valueAnimator.getAnimatedValue()).floatValue(), imageViewerPage.f285468o, imageViewerPage.f285469p);
        }
    }
}
