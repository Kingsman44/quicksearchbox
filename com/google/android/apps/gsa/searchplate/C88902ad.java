package com.google.android.apps.gsa.searchplate;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.Paint;

/* renamed from: com.google.android.apps.gsa.searchplate.ad */
/* compiled from: PG */
final class C88902ad extends AnimatorListenerAdapter {
    public final void onAnimationEnd(Animator animator) {
        C88904af afVar = (C88904af) animator;
        int i = afVar.f240826c;
        if (i != 0) {
            if (afVar.f240824a) {
                if (i == 6) {
                    afVar.f240825b.setScaleX(1.0f);
                    afVar.f240825b.setScaleY(1.0f);
                    afVar.f240825b.setRotation(0.0f);
                } else if (i == 7) {
                    afVar.f240825b.setScaleX(1.0f);
                    afVar.f240825b.setScaleY(1.0f);
                    afVar.f240825b.setAlpha(1.0f);
                } else {
                    afVar.f240825b.setAlpha(1.0f);
                }
            }
            if (afVar.f240827d != 0.0f) {
                afVar.f240825b.setTranslationX(0.0f);
            }
            afVar.f240825b.setLayerType(0, (Paint) null);
        }
    }
}
