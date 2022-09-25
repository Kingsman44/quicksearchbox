package com.google.android.apps.gsa.staticplugins.opa;

import android.animation.ValueAnimator;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.bw */
/* compiled from: PG */
public final /* synthetic */ class C108111bw implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a */
    public final /* synthetic */ C109040fj f300715a;

    public /* synthetic */ C108111bw(C109040fj fjVar) {
        this.f300715a = fjVar;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        C109040fj fjVar = this.f300715a;
        Integer num = (Integer) valueAnimator.getAnimatedValue();
        fjVar.f303450o.mo95420i().getLayoutParams().height = num.intValue();
        fjVar.f303228N.setTranslationY((float) (-num.intValue()));
        fjVar.f303450o.mo95420i().requestLayout();
    }
}
