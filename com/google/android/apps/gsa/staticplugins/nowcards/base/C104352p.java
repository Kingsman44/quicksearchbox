package com.google.android.apps.gsa.staticplugins.nowcards.base;

import android.animation.ValueAnimator;
import com.airbnb.lottie.LottieAnimationView;

/* renamed from: com.google.android.apps.gsa.staticplugins.nowcards.base.p */
/* compiled from: PG */
public final /* synthetic */ class C104352p implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a */
    public final /* synthetic */ LottieAnimationView f290375a;

    public /* synthetic */ C104352p(LottieAnimationView lottieAnimationView) {
        this.f290375a = lottieAnimationView;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        LottieAnimationView lottieAnimationView = this.f290375a;
        int i = C104356t.f290384m;
        lottieAnimationView.f15138d.mo9773j(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }
}
