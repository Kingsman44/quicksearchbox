package com.google.android.apps.gsa.staticplugins.images.viewer.p8017ui;

import android.animation.ValueAnimator;

/* renamed from: com.google.android.apps.gsa.staticplugins.images.viewer.ui.aq */
/* compiled from: PG */
final class C102317aq implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a */
    float f285556a;

    /* renamed from: b */
    final /* synthetic */ ImageViewerPage f285557b;

    public C102317aq(ImageViewerPage imageViewerPage) {
        this.f285557b = imageViewerPage;
        this.f285556a = imageViewerPage.f285467n;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        this.f285557b.mo93083n(0.0f, -(floatValue - this.f285556a));
        this.f285556a = floatValue;
    }
}
