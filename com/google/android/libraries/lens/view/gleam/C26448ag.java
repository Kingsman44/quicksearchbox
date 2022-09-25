package com.google.android.libraries.lens.view.gleam;

import android.animation.ValueAnimator;

/* renamed from: com.google.android.libraries.lens.view.gleam.ag */
/* compiled from: PG */
public final /* synthetic */ class C26448ag implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a */
    public final /* synthetic */ C26453al f72015a;

    public /* synthetic */ C26448ag(C26453al alVar) {
        this.f72015a = alVar;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        C26453al alVar = this.f72015a;
        alVar.f72044v = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        ((C26559ej) alVar.f72037o).mo31827f();
    }
}
