package com.google.android.libraries.lens.view.gleam.region;

import android.animation.ValueAnimator;

/* renamed from: com.google.android.libraries.lens.view.gleam.region.q */
/* compiled from: PG */
public final /* synthetic */ class C26627q implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a */
    public final /* synthetic */ RegionView f72610a;

    public /* synthetic */ C26627q(RegionView regionView) {
        this.f72610a = regionView;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        RegionView regionView = this.f72610a;
        regionView.f72551j = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        regionView.invalidate();
    }
}
