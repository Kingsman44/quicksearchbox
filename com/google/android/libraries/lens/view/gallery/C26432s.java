package com.google.android.libraries.lens.view.gallery;

import android.animation.ValueAnimator;

/* renamed from: com.google.android.libraries.lens.view.gallery.s */
/* compiled from: PG */
public final /* synthetic */ class C26432s implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a */
    public final /* synthetic */ C26299ac f71920a;

    /* renamed from: b */
    public final /* synthetic */ float f71921b;

    /* renamed from: c */
    public final /* synthetic */ float f71922c;

    /* renamed from: d */
    public final /* synthetic */ float f71923d;

    public /* synthetic */ C26432s(C26299ac acVar, float f, float f2, float f3) {
        this.f71920a = acVar;
        this.f71921b = f;
        this.f71922c = f2;
        this.f71923d = f3;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        C26299ac acVar = this.f71920a;
        float f = this.f71921b;
        float f2 = this.f71922c;
        float f3 = this.f71923d;
        float animatedFraction = valueAnimator.getAnimatedFraction();
        if (acVar.f71500h.mo33017b()) {
            acVar.mo31507g(f + (f2 * animatedFraction), f3);
        } else {
            acVar.mo31507g(f + (animatedFraction * f2), f2 * 0.8f);
        }
        if (animatedFraction == 1.0f) {
            valueAnimator.removeAllUpdateListeners();
            acVar.mo31506f();
        }
    }
}
