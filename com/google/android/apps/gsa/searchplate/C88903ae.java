package com.google.android.apps.gsa.searchplate;

import android.animation.ValueAnimator;
import android.view.View;

/* renamed from: com.google.android.apps.gsa.searchplate.ae */
/* compiled from: PG */
final class C88903ae implements ValueAnimator.AnimatorUpdateListener {
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        C88904af afVar = (C88904af) valueAnimator;
        if (afVar.f240826c == 0) {
            afVar.cancel();
            return;
        }
        float floatValue = ((Float) afVar.getAnimatedValue()).floatValue();
        boolean z = afVar.f240824a;
        View view = afVar.f240825b;
        int i = afVar.f240826c;
        if (i == 6) {
            view.setScaleX(floatValue);
            afVar.f240825b.setScaleY(floatValue);
            afVar.f240825b.setRotation((-1.0f + floatValue) * 45.0f);
        } else if (i == 7) {
            view.setScaleX(floatValue);
            afVar.f240825b.setScaleY(floatValue);
            afVar.f240825b.setAlpha(floatValue);
        } else {
            view.setAlpha(floatValue);
        }
        float f = afVar.f240827d;
        if (f != 0.0f) {
            View view2 = afVar.f240825b;
            double d = (double) floatValue;
            Double.isNaN(d);
            double d2 = (double) f;
            Double.isNaN(d2);
            view2.setTranslationX((float) ((1.0d - d) * d2));
        }
    }
}
