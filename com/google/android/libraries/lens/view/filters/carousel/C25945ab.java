package com.google.android.libraries.lens.view.filters.carousel;

import android.animation.ValueAnimator;

/* renamed from: com.google.android.libraries.lens.view.filters.carousel.ab */
/* compiled from: PG */
public final /* synthetic */ class C25945ab implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a */
    public final /* synthetic */ WhiteChipView f70518a;

    public /* synthetic */ C25945ab(WhiteChipView whiteChipView) {
        this.f70518a = whiteChipView;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f70518a.mo31121a(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }
}
