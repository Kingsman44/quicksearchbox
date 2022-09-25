package com.google.android.libraries.home.coreui.devicetile;

import android.animation.ValueAnimator;
import android.graphics.drawable.Drawable;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.home.coreui.devicetile.bx */
/* compiled from: PG */
final class C23705bx implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a */
    final /* synthetic */ C23707bz f64832a;

    public C23705bx(C23707bz bzVar) {
        this.f64832a = bzVar;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        C69664n.m101061g(valueAnimator, "it");
        Drawable drawable = this.f64832a.f64836b;
        if (drawable == null) {
            C69664n.m101065k("clipLayer");
            drawable = null;
        }
        Object animatedValue = valueAnimator.getAnimatedValue();
        C69664n.m101059e(animatedValue, "null cannot be cast to non-null type kotlin.Int");
        drawable.setLevel(((Integer) animatedValue).intValue());
    }
}
