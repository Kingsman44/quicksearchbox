package com.google.android.libraries.lens.view.gleam;

import android.animation.ValueAnimator;

/* renamed from: com.google.android.libraries.lens.view.gleam.ah */
/* compiled from: PG */
public final /* synthetic */ class C26449ah implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a */
    public final /* synthetic */ C26453al f72016a;

    public /* synthetic */ C26449ah(C26453al alVar) {
        this.f72016a = alVar;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        C26453al alVar = this.f72016a;
        alVar.f72045w = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        ((C26559ej) alVar.f72037o).mo31827f();
    }
}
