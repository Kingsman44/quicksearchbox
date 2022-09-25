package com.google.android.apps.gsa.searchplate;

import android.animation.ValueAnimator;

/* renamed from: com.google.android.apps.gsa.searchplate.ag */
/* compiled from: PG */
final class C88905ag implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a */
    final /* synthetic */ C88906ah f240829a;

    public C88905ag(C88906ah ahVar) {
        this.f240829a = ahVar;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        C88907ai aiVar = this.f240829a.f240830a;
        aiVar.f240842b = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        aiVar.invalidateSelf();
    }
}
