package com.google.android.libraries.lens.view.gleam;

import android.animation.ValueAnimator;

/* renamed from: com.google.android.libraries.lens.view.gleam.aj */
/* compiled from: PG */
public final /* synthetic */ class C26451aj implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a */
    public final /* synthetic */ C26453al f72018a;

    public /* synthetic */ C26451aj(C26453al alVar) {
        this.f72018a = alVar;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        C26453al alVar = this.f72018a;
        alVar.f72045w = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        ((C26559ej) alVar.f72037o).mo31827f();
    }
}
