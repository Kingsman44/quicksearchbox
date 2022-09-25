package com.google.android.apps.gsa.shared.p6993ao;

import android.animation.ValueAnimator;

/* renamed from: com.google.android.apps.gsa.shared.ao.b */
/* compiled from: PG */
public final /* synthetic */ class C89237b implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a */
    public final /* synthetic */ C89240e f241972a;

    public /* synthetic */ C89237b(C89240e eVar) {
        this.f241972a = eVar;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f241972a.f241977b.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }
}
