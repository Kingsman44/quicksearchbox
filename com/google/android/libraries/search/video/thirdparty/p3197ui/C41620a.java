package com.google.android.libraries.search.video.thirdparty.p3197ui;

import android.animation.ValueAnimator;

/* renamed from: com.google.android.libraries.search.video.thirdparty.ui.a */
/* compiled from: PG */
public final /* synthetic */ class C41620a implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a */
    public final /* synthetic */ EqualizerView f108789a;

    /* renamed from: b */
    public final /* synthetic */ int f108790b;

    public /* synthetic */ C41620a(EqualizerView equalizerView, int i) {
        this.f108789a = equalizerView;
        this.f108790b = i;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        EqualizerView equalizerView = this.f108789a;
        equalizerView.f108784a[this.f108790b] = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        equalizerView.invalidate();
    }
}
