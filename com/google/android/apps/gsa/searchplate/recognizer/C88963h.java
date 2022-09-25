package com.google.android.apps.gsa.searchplate.recognizer;

import android.animation.ValueAnimator;
import android.graphics.Color;

/* renamed from: com.google.android.apps.gsa.searchplate.recognizer.h */
/* compiled from: PG */
final class C88963h implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a */
    final /* synthetic */ OrbDrawable f241080a;

    public C88963h(OrbDrawable orbDrawable) {
        this.f241080a = orbDrawable;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        OrbDrawable orbDrawable = this.f241080a;
        float f = orbDrawable.f241007g;
        orbDrawable.f241003c = ((1.0f - f) * floatValue) + f;
        int alpha = Color.alpha(orbDrawable.f241002b);
        OrbDrawable orbDrawable2 = this.f241080a;
        int i = orbDrawable2.f241008h;
        orbDrawable.f241001a = (int) ((((float) (alpha - i)) * floatValue) + ((float) i));
        orbDrawable2.invalidateSelf();
    }
}
