package com.google.android.libraries.lens.view.p2172t;

import android.animation.ValueAnimator;

/* renamed from: com.google.android.libraries.lens.view.t.c */
/* compiled from: PG */
public final /* synthetic */ class C28058c implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a */
    public final /* synthetic */ C28063h f76366a;

    public /* synthetic */ C28058c(C28063h hVar) {
        this.f76366a = hVar;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        C28063h hVar = this.f76366a;
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        int i = hVar.f76373c;
        hVar.mo33516b(hVar.f76376f, Math.round((((float) i) - (((float) (i - hVar.f76374d)) * floatValue)) / 2.0f));
        hVar.mo33516b(hVar.f76375e, Math.round((((float) hVar.f76374d) * floatValue) / 2.0f));
        hVar.f76375e.setAlpha(floatValue * 0.3f);
    }
}
