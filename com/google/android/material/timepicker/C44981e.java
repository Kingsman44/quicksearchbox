package com.google.android.material.timepicker;

import android.animation.ValueAnimator;

/* renamed from: com.google.android.material.timepicker.e */
/* compiled from: PG */
public final /* synthetic */ class C44981e implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a */
    public final /* synthetic */ ClockHandView f117548a;

    public /* synthetic */ C44981e(ClockHandView clockHandView) {
        this.f117548a = clockHandView;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f117548a.mo48624c(((Float) valueAnimator.getAnimatedValue()).floatValue(), true);
    }
}
