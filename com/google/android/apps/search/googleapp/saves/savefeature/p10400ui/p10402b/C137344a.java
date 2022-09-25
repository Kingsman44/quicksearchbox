package com.google.android.apps.search.googleapp.saves.savefeature.p10400ui.p10402b;

import android.animation.ValueAnimator;
import android.view.View;

/* renamed from: com.google.android.apps.search.googleapp.saves.savefeature.ui.b.a */
/* compiled from: PG */
public final /* synthetic */ class C137344a implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a */
    public final /* synthetic */ View f373595a;

    public /* synthetic */ C137344a(View view) {
        this.f373595a = view;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f373595a.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }
}
