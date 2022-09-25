package com.google.android.libraries.lens.view.gleam.region;

import android.animation.ValueAnimator;

/* renamed from: com.google.android.libraries.lens.view.gleam.region.p */
/* compiled from: PG */
public final /* synthetic */ class C26626p implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a */
    public final /* synthetic */ RegionView f72609a;

    public /* synthetic */ C26626p(RegionView regionView) {
        this.f72609a = regionView;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        RegionView regionView = this.f72609a;
        regionView.f72550i = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        regionView.invalidate();
    }
}
