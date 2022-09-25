package android.support.p033v7.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;

/* renamed from: android.support.v7.widget.ce */
/* compiled from: PG */
final class C0562ce extends AnimatorListenerAdapter {

    /* renamed from: a */
    final /* synthetic */ C0673gh f2170a;

    /* renamed from: b */
    final /* synthetic */ View f2171b;

    /* renamed from: c */
    final /* synthetic */ ViewPropertyAnimator f2172c;

    /* renamed from: d */
    final /* synthetic */ C0568ck f2173d;

    public C0562ce(C0568ck ckVar, C0673gh ghVar, View view, ViewPropertyAnimator viewPropertyAnimator) {
        this.f2173d = ckVar;
        this.f2170a = ghVar;
        this.f2171b = view;
        this.f2172c = viewPropertyAnimator;
    }

    public final void onAnimationCancel(Animator animator) {
        this.f2171b.setAlpha(1.0f);
    }

    public final void onAnimationEnd(Animator animator) {
        this.f2172c.setListener((Animator.AnimatorListener) null);
        this.f2173d.mo2889m(this.f2170a);
        this.f2173d.f2203d.remove(this.f2170a);
        this.f2173d.mo2686b();
    }

    public final void onAnimationStart(Animator animator) {
    }
}
