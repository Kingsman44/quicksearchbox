package com.google.android.libraries.lens.view.gallery;

import android.animation.ValueAnimator;

/* renamed from: com.google.android.libraries.lens.view.gallery.j */
/* compiled from: PG */
public final /* synthetic */ class C26423j implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a */
    public final /* synthetic */ C26299ac f71910a;

    /* renamed from: b */
    public final /* synthetic */ int f71911b;

    public /* synthetic */ C26423j(C26299ac acVar, int i) {
        this.f71910a = acVar;
        this.f71911b = i;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        C26299ac acVar = this.f71910a;
        int i = this.f71911b;
        float animatedFraction = valueAnimator.getAnimatedFraction();
        float f = (float) i;
        acVar.mo31507g((1.0f - animatedFraction) * f, f);
        if (animatedFraction == 1.0f) {
            valueAnimator.removeAllUpdateListeners();
            acVar.mo31508h(true);
        }
    }
}
