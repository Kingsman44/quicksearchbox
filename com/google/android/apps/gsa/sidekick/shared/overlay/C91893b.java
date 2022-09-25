package com.google.android.apps.gsa.sidekick.shared.overlay;

import android.animation.ValueAnimator;

/* renamed from: com.google.android.apps.gsa.sidekick.shared.overlay.b */
/* compiled from: PG */
final class C91893b implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a */
    final /* synthetic */ C91896e f256226a;

    public C91893b(C91896e eVar) {
        this.f256226a = eVar;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f256226a.f256241m.mo83207b(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }
}
