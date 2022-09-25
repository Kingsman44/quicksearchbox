package com.google.android.libraries.lens.view.p2172t;

import android.animation.ValueAnimator;

/* renamed from: com.google.android.libraries.lens.view.t.f */
/* compiled from: PG */
public final /* synthetic */ class C28061f implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a */
    public final /* synthetic */ C28063h f76369a;

    public /* synthetic */ C28061f(C28063h hVar) {
        this.f76369a = hVar;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f76369a.f76375e.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }
}
