package com.google.android.apps.gsa.assistant.settings.p5781hq.agentdirectory;

import android.animation.ValueAnimator;
import android.view.View;

/* renamed from: com.google.android.apps.gsa.assistant.settings.hq.agentdirectory.fj */
/* compiled from: PG */
public final /* synthetic */ class C73681fj implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a */
    public final /* synthetic */ View f194895a;

    public /* synthetic */ C73681fj(View view) {
        this.f194895a = view;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        View view = this.f194895a;
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        view.setScaleX(floatValue);
        view.setScaleY(floatValue);
    }
}
