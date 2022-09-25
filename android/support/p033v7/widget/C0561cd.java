package android.support.p033v7.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;

/* renamed from: android.support.v7.widget.cd */
/* compiled from: PG */
final class C0561cd extends AnimatorListenerAdapter {

    /* renamed from: a */
    final /* synthetic */ C0673gh f2166a;

    /* renamed from: b */
    final /* synthetic */ ViewPropertyAnimator f2167b;

    /* renamed from: c */
    final /* synthetic */ View f2168c;

    /* renamed from: d */
    final /* synthetic */ C0568ck f2169d;

    public C0561cd(C0568ck ckVar, C0673gh ghVar, ViewPropertyAnimator viewPropertyAnimator, View view) {
        this.f2169d = ckVar;
        this.f2166a = ghVar;
        this.f2167b = viewPropertyAnimator;
        this.f2168c = view;
    }

    public final void onAnimationEnd(Animator animator) {
        this.f2167b.setListener((Animator.AnimatorListener) null);
        this.f2168c.setAlpha(1.0f);
        this.f2169d.mo2889m(this.f2166a);
        this.f2169d.f2205f.remove(this.f2166a);
        this.f2169d.mo2686b();
    }

    public final void onAnimationStart(Animator animator) {
    }
}
