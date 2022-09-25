package com.google.android.apps.gsa.shared.p7148ui;

import android.animation.ValueAnimator;
import android.view.View;

/* renamed from: com.google.android.apps.gsa.shared.ui.g */
/* compiled from: PG */
final class C90677g implements ValueAnimator.AnimatorUpdateListener {
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        C90687h hVar = (C90687h) valueAnimator;
        View.OnLayoutChangeListener onLayoutChangeListener = C90687h.f253606a;
        if (hVar.f253611e == null) {
            float floatValue = ((Float) hVar.getAnimatedValue()).floatValue();
            int i = hVar.f253612f;
            int i2 = i - 1;
            if (i == 0) {
                throw null;
            } else if (i2 == 0) {
                C90687h.m148063d(hVar.f253610d, ((float) hVar.f253609c) * (1.0f - floatValue));
            } else if (i2 == 1) {
                hVar.mo84986a(hVar.f253610d, floatValue, true ^ hVar.f253608b);
            } else if (i2 == 2) {
                hVar.mo84986a(hVar.f253610d, floatValue, hVar.f253608b);
            } else if (i2 == 3 || i2 == 5) {
                hVar.f253610d.setAlpha(floatValue);
            } else if (i2 == 6) {
                hVar.mo84986a(hVar.f253610d, (floatValue * 0.5f) + 0.5f, hVar.f253608b);
            } else if (i2 != 7) {
                hVar.cancel();
            } else {
                View view = hVar.f253610d;
                view.setBottom(view.getTop() + ((int) (floatValue * ((float) view.getMeasuredHeight()))));
            }
        }
    }
}
