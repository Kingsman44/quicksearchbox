package com.google.android.apps.gsa.shared.p7148ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.Paint;
import android.view.View;

/* renamed from: com.google.android.apps.gsa.shared.ui.f */
/* compiled from: PG */
final class C90675f extends AnimatorListenerAdapter {

    /* renamed from: a */
    final /* synthetic */ C90687h f253572a;

    public C90675f(C90687h hVar) {
        this.f253572a = hVar;
    }

    public final void onAnimationCancel(Animator animator) {
        this.f253572a.f253611e = null;
    }

    public final void onAnimationEnd(Animator animator) {
        C90687h hVar = (C90687h) animator;
        View.OnLayoutChangeListener onLayoutChangeListener = C90687h.f253606a;
        float f = 0.0f;
        if (hVar.f253612f != 5) {
            hVar.f253610d.setTranslationX(0.0f);
            hVar.f253610d.setRotation(0.0f);
            hVar.f253610d.setAlpha(1.0f);
            if (C90687h.m148062c(hVar.f253612f)) {
                hVar.f253610d.setLayerType(0, (Paint) null);
            }
        }
        if (hVar.f253612f == 1) {
            View view = hVar.f253610d;
            if (!hVar.f253608b) {
                f = (float) hVar.f253609c;
            }
            C90687h.m148063d(view, f);
        }
        if (hVar.f253612f == 8) {
            hVar.f253610d.removeOnLayoutChangeListener(C90687h.f253606a);
        }
        this.f253572a.f253611e = null;
    }
}
