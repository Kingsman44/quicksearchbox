package com.google.android.libraries.lens.view.gleam;

import android.animation.ValueAnimator;

/* renamed from: com.google.android.libraries.lens.view.gleam.ae */
/* compiled from: PG */
public final /* synthetic */ class C26446ae implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a */
    public final /* synthetic */ C26447af f71986a;

    public /* synthetic */ C26446ae(C26447af afVar) {
        this.f71986a = afVar;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        C26447af afVar = this.f71986a;
        afVar.f72007r = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        ((C26559ej) afVar.f71997h).mo31827f();
    }
}
