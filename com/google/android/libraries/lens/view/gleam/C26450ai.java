package com.google.android.libraries.lens.view.gleam;

import android.animation.ValueAnimator;

/* renamed from: com.google.android.libraries.lens.view.gleam.ai */
/* compiled from: PG */
public final /* synthetic */ class C26450ai implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a */
    public final /* synthetic */ C26453al f72017a;

    public /* synthetic */ C26450ai(C26453al alVar) {
        this.f72017a = alVar;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        C26453al alVar = this.f72017a;
        alVar.f72044v = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        ((C26559ej) alVar.f72037o).mo31827f();
    }
}
