package com.google.android.libraries.lens.view.p2172t;

import android.animation.ValueAnimator;

/* renamed from: com.google.android.libraries.lens.view.t.e */
/* compiled from: PG */
public final /* synthetic */ class C28060e implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a */
    public final /* synthetic */ C28063h f76368a;

    public /* synthetic */ C28060e(C28063h hVar) {
        this.f76368a = hVar;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f76368a.f76376f.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }
}
