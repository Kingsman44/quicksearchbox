package com.google.android.apps.gsa.staticplugins.images.viewer.p8017ui;

import android.animation.ValueAnimator;

/* renamed from: com.google.android.apps.gsa.staticplugins.images.viewer.ui.ap */
/* compiled from: PG */
final class C102316ap implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a */
    float f285554a = 0.0f;

    /* renamed from: b */
    final /* synthetic */ ImageViewerPage f285555b;

    public C102316ap(ImageViewerPage imageViewerPage) {
        this.f285555b = imageViewerPage;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        this.f285555b.mo93083n(0.0f, -(floatValue - this.f285554a));
        this.f285554a = floatValue;
        this.f285555b.mo93079j();
    }
}
