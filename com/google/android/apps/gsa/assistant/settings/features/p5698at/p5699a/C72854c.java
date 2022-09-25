package com.google.android.apps.gsa.assistant.settings.features.p5698at.p5699a;

import android.animation.ValueAnimator;

/* renamed from: com.google.android.apps.gsa.assistant.settings.features.at.a.c */
/* compiled from: PG */
public final /* synthetic */ class C72854c implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a */
    public final /* synthetic */ e f193478a;

    public /* synthetic */ C72854c(e eVar) {
        this.f193478a = eVar;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f193478a.a.setBackgroundColor(((Integer) valueAnimator.getAnimatedValue()).intValue());
    }
}
