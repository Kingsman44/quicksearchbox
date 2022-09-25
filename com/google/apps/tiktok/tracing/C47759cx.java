package com.google.apps.tiktok.tracing;

import android.animation.Animator;

/* renamed from: com.google.apps.tiktok.tracing.cx */
/* compiled from: PG */
public final class C47759cx implements Animator.AnimatorListener {

    /* renamed from: a */
    final /* synthetic */ Animator.AnimatorListener f123743a;

    /* renamed from: b */
    final /* synthetic */ String f123744b;

    /* renamed from: c */
    final /* synthetic */ C47770dh f123745c;

    public C47759cx(C47770dh dhVar, Animator.AnimatorListener animatorListener, String str) {
        this.f123745c = dhVar;
        this.f123743a = animatorListener;
        this.f123744b = str;
    }

    public final void onAnimationCancel(Animator animator) {
        this.f123743a.onAnimationCancel(animator);
    }

    public final void onAnimationEnd(Animator animator) {
        if (C47831fm.m85027v()) {
            this.f123743a.onAnimationEnd(animator);
            return;
        }
        C47538ax c = this.f123745c.mo51613c(this.f123744b);
        try {
            this.f123743a.onAnimationEnd(animator);
            if (c != null) {
                c.close();
                return;
            }
            return;
        } catch (Throwable th) {
            C47757cv.m84913a(th, th);
        }
        throw th;
    }

    public final void onAnimationRepeat(Animator animator) {
        C47538ax c = this.f123745c.mo51613c(this.f123744b);
        try {
            this.f123743a.onAnimationRepeat(animator);
            if (c != null) {
                c.close();
                return;
            }
            return;
        } catch (Throwable th) {
            C47757cv.m84913a(th, th);
        }
        throw th;
    }

    public final void onAnimationStart(Animator animator) {
        this.f123743a.onAnimationStart(animator);
    }

    public void onAnimationStart(Animator animator, boolean z) {
        this.f123743a.onAnimationStart(animator, z);
    }

    public void onAnimationEnd(Animator animator, boolean z) {
        if (C47831fm.m85027v()) {
            this.f123743a.onAnimationEnd(animator, z);
            return;
        }
        C47538ax c = this.f123745c.mo51613c(this.f123744b);
        try {
            this.f123743a.onAnimationEnd(animator, z);
            if (c != null) {
                c.close();
                return;
            }
            return;
        } catch (Throwable th) {
            C47757cv.m84913a(th, th);
        }
        throw th;
    }
}
