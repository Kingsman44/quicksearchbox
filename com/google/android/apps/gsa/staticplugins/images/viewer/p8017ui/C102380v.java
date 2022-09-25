package com.google.android.apps.gsa.staticplugins.images.viewer.p8017ui;

import android.animation.ValueAnimator;

/* renamed from: com.google.android.apps.gsa.staticplugins.images.viewer.ui.v */
/* compiled from: PG */
public final /* synthetic */ class C102380v implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a */
    public final /* synthetic */ ImageViewerPage f285715a;

    /* renamed from: b */
    public final /* synthetic */ float f285716b;

    /* renamed from: c */
    public final /* synthetic */ float f285717c;

    public /* synthetic */ C102380v(ImageViewerPage imageViewerPage, float f, float f2) {
        this.f285715a = imageViewerPage;
        this.f285716b = f;
        this.f285717c = f2;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f285715a.mo93082m(((Float) valueAnimator.getAnimatedValue()).floatValue(), this.f285716b, this.f285717c);
    }
}
