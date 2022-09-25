package com.google.android.libraries.componentview.components.p1689c;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;

/* renamed from: com.google.android.libraries.componentview.components.c.bt */
/* compiled from: PG */
public final class C20227bt extends AnimatorListenerAdapter implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a */
    public final C20228bu f56806a;

    public C20227bt(C20228bu buVar) {
        this.f56806a = buVar;
    }

    public final void onAnimationEnd(Animator animator) {
        this.f56806a.mo25304a();
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f56806a.mo25306c(valueAnimator.getAnimatedFraction());
    }
}
