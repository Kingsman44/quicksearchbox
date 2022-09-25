package com.google.android.apps.gsa.searchplate.recognizer;

import android.animation.ValueAnimator;

/* renamed from: com.google.android.apps.gsa.searchplate.recognizer.e */
/* compiled from: PG */
final class C88960e implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a */
    final /* synthetic */ C88961f f241050a;

    public C88960e(C88961f fVar) {
        this.f241050a = fVar;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        C88961f fVar = this.f241050a;
        float f = fVar.f241059g * (fVar.f241066n + 1.0f + (floatValue * fVar.f241067o));
        fVar.f241054b.setRadius(f);
        this.f241050a.f241055c.setBaseRadius(f);
    }
}
