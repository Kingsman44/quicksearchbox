package com.google.android.apps.gsa.shared.p6993ao;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;

/* renamed from: com.google.android.apps.gsa.shared.ao.a */
/* compiled from: PG */
public final class C89236a extends AnimatorListenerAdapter {

    /* renamed from: a */
    public final ValueAnimator f241970a;

    /* renamed from: b */
    public Runnable f241971b;

    public C89236a() {
        ValueAnimator valueAnimator = new ValueAnimator();
        this.f241970a = valueAnimator;
        valueAnimator.setDuration(300);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo83186a() {
        if (this.f241970a.isRunning()) {
            this.f241970a.cancel();
            this.f241970a.removeAllListeners();
        }
    }

    public final void onAnimationEnd(Animator animator) {
        this.f241970a.removeAllListeners();
        Runnable runnable = this.f241971b;
        if (runnable != null) {
            C89240e.m145156b(((C89238c) runnable).f241973a);
            this.f241971b = null;
        }
    }
}
