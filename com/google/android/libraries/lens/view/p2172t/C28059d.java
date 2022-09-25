package com.google.android.libraries.lens.view.p2172t;

import android.animation.ValueAnimator;

/* renamed from: com.google.android.libraries.lens.view.t.d */
/* compiled from: PG */
public final /* synthetic */ class C28059d implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a */
    public final /* synthetic */ C28063h f76367a;

    public /* synthetic */ C28059d(C28063h hVar) {
        this.f76367a = hVar;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f76367a.f76376f.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }
}
