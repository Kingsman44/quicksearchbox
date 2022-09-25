package com.google.android.libraries.lens.view.gleam;

import android.animation.ValueAnimator;
import com.google.android.libraries.lens.view.p2146j.C27212a;

/* renamed from: com.google.android.libraries.lens.view.gleam.ad */
/* compiled from: PG */
public final /* synthetic */ class C26445ad implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a */
    public final /* synthetic */ C26447af f71985a;

    public /* synthetic */ C26445ad(C26447af afVar) {
        this.f71985a = afVar;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        C26447af afVar = this.f71985a;
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        afVar.f72005p = floatValue;
        afVar.f72002m.setAlpha(C27212a.m50467c(floatValue));
        ((C26559ej) afVar.f71997h).mo31827f();
    }
}
