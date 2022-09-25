package com.google.android.apps.gsa.opaonboarding.p6463ui.checkableflip;

import android.animation.ValueAnimator;

/* renamed from: com.google.android.apps.gsa.opaonboarding.ui.checkableflip.e */
/* compiled from: PG */
public final /* synthetic */ class C84006e implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a */
    public final /* synthetic */ C84007f f228846a;

    public /* synthetic */ C84006e(C84007f fVar) {
        this.f228846a = fVar;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        C84007f fVar = this.f228846a;
        float f = fVar.f228851e;
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        fVar.f228851e = floatValue;
        if (f != floatValue) {
            fVar.invalidateSelf();
        }
    }
}
