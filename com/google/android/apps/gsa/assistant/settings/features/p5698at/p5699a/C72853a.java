package com.google.android.apps.gsa.assistant.settings.features.p5698at.p5699a;

import android.animation.ValueAnimator;

/* renamed from: com.google.android.apps.gsa.assistant.settings.features.at.a.a */
/* compiled from: PG */
public final /* synthetic */ class C72853a implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a */
    public final /* synthetic */ e f193477a;

    public /* synthetic */ C72853a(e eVar) {
        this.f193477a = eVar;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f193477a.a.setBackgroundColor(((Integer) valueAnimator.getAnimatedValue()).intValue());
    }
}
