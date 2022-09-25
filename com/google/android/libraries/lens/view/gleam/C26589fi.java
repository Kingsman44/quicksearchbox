package com.google.android.libraries.lens.view.gleam;

import android.animation.ValueAnimator;

/* renamed from: com.google.android.libraries.lens.view.gleam.fi */
/* compiled from: PG */
public final /* synthetic */ class C26589fi implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a */
    public final /* synthetic */ ScrimView f72491a;

    public /* synthetic */ C26589fi(ScrimView scrimView) {
        this.f72491a = scrimView;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f72491a.invalidate();
    }
}
