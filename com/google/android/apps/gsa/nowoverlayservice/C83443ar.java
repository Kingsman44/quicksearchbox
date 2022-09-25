package com.google.android.apps.gsa.nowoverlayservice;

import android.animation.ValueAnimator;

/* renamed from: com.google.android.apps.gsa.nowoverlayservice.ar */
/* compiled from: PG */
final class C83443ar implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a */
    final /* synthetic */ C83444as f227436a;

    public C83443ar(C83444as asVar) {
        this.f227436a = asVar;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float animatedFraction = this.f227436a.f227461l.getAnimatedFraction();
        C83444as asVar = this.f227436a;
        asVar.f227442F = ((1.0f - animatedFraction) * ((float) asVar.f227438B.height())) / 2.0f;
        C83444as asVar2 = this.f227436a;
        asVar2.f227460k.evaluate(animatedFraction, asVar2.f227475z, asVar2.f227437A);
        this.f227436a.f227452c.invalidateOutline();
    }
}
