package com.google.android.libraries.lens.view.gleam;

import android.animation.ValueAnimator;

/* renamed from: com.google.android.libraries.lens.view.gleam.au */
/* compiled from: PG */
public final /* synthetic */ class C26462au implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a */
    public final /* synthetic */ C26463av f72077a;

    public /* synthetic */ C26462au(C26463av avVar) {
        this.f72077a = avVar;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f72077a.f72084g = ((Float) valueAnimator.getAnimatedValue()).floatValue();
    }
}
