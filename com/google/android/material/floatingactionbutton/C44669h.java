package com.google.android.material.floatingactionbutton;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* renamed from: com.google.android.material.floatingactionbutton.h */
/* compiled from: PG */
final class C44669h extends AnimatorListenerAdapter {

    /* renamed from: a */
    final /* synthetic */ C44661ad f116450a;

    /* renamed from: b */
    private boolean f116451b;

    public C44669h(C44661ad adVar) {
        this.f116450a = adVar;
    }

    public final void onAnimationCancel(Animator animator) {
        this.f116451b = true;
        this.f116450a.mo47939e();
    }

    public final void onAnimationEnd(Animator animator) {
        this.f116450a.mo47940f();
        if (!this.f116451b) {
            this.f116450a.mo47945k();
        }
    }

    public final void onAnimationStart(Animator animator) {
        this.f116450a.mo47941g(animator);
        this.f116451b = false;
    }
}
