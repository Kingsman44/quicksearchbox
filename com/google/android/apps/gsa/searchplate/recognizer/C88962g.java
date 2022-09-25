package com.google.android.apps.gsa.searchplate.recognizer;

import android.animation.ValueAnimator;
import android.graphics.Color;

/* renamed from: com.google.android.apps.gsa.searchplate.recognizer.g */
/* compiled from: PG */
final class C88962g implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a */
    final /* synthetic */ OrbDrawable f241079a;

    public C88962g(OrbDrawable orbDrawable) {
        this.f241079a = orbDrawable;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        OrbDrawable orbDrawable = this.f241079a;
        float f = orbDrawable.f241009i;
        orbDrawable.f241004d = ((1.0f - f) * floatValue) + f;
        orbDrawable.f241005e = (int) (((float) Color.alpha(orbDrawable.f241006f)) * floatValue);
        this.f241079a.invalidateSelf();
    }
}
