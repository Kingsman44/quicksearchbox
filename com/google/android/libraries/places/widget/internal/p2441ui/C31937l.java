package com.google.android.libraries.places.widget.internal.p2441ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.support.p033v7.widget.C0673gh;
import android.view.View;
import android.view.ViewPropertyAnimator;
import com.google.android.libraries.places.p2424a.p2425a.C31775f;

/* renamed from: com.google.android.libraries.places.widget.internal.ui.l */
/* compiled from: PG */
final class C31937l extends AnimatorListenerAdapter {

    /* renamed from: a */
    final /* synthetic */ View f85900a;

    /* renamed from: b */
    final /* synthetic */ C0673gh f85901b;

    /* renamed from: c */
    final /* synthetic */ ViewPropertyAnimator f85902c;

    /* renamed from: d */
    final /* synthetic */ C31938m f85903d;

    public C31937l(C31938m mVar, View view, C0673gh ghVar, ViewPropertyAnimator viewPropertyAnimator) {
        this.f85903d = mVar;
        this.f85900a = view;
        this.f85901b = ghVar;
        this.f85902c = viewPropertyAnimator;
    }

    public final void onAnimationEnd(Animator animator) {
        try {
            this.f85902c.setListener((Animator.AnimatorListener) null);
            this.f85903d.mo2889m(this.f85901b);
            this.f85903d.f85904n.remove(this.f85901b);
            this.f85903d.mo37709x();
            this.f85902c.setStartDelay(0);
        } catch (Error | RuntimeException e) {
            C31775f.m59130a(e);
            throw e;
        }
    }

    public final void onAnimationCancel(Animator animator) {
        try {
            C31938m.m59499y(this.f85900a);
        } catch (Error | RuntimeException e) {
            C31775f.m59130a(e);
            throw e;
        }
    }

    public final void onAnimationStart(Animator animator) {
        try {
            this.f85900a.setAlpha(0.0f);
        } catch (Error | RuntimeException e) {
            C31775f.m59130a(e);
            throw e;
        }
    }
}
