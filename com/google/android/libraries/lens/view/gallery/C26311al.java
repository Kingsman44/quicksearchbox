package com.google.android.libraries.lens.view.gallery;

import android.animation.ValueAnimator;

/* renamed from: com.google.android.libraries.lens.view.gallery.al */
/* compiled from: PG */
public final /* synthetic */ class C26311al implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a */
    public final /* synthetic */ GalleryFrameLayout f71528a;

    /* renamed from: b */
    public final /* synthetic */ float f71529b;

    public /* synthetic */ C26311al(GalleryFrameLayout galleryFrameLayout, float f) {
        this.f71528a = galleryFrameLayout;
        this.f71529b = f;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        GalleryFrameLayout galleryFrameLayout = this.f71528a;
        float f = this.f71529b;
        float animatedFraction = 1.0f - valueAnimator.getAnimatedFraction();
        C26312am amVar = galleryFrameLayout.f71458d;
        amVar.getClass();
        C26299ac acVar = (C26299ac) amVar;
        acVar.mo31507g(Math.max(0.0f, f * animatedFraction), (float) acVar.mo31501a());
        if (animatedFraction == 0.0f) {
            valueAnimator.removeAllUpdateListeners();
        }
    }
}
