package android.support.p033v7.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;

/* renamed from: android.support.v7.widget.ch */
/* compiled from: PG */
final class C0565ch extends AnimatorListenerAdapter {

    /* renamed from: a */
    final /* synthetic */ C0566ci f2184a;

    /* renamed from: b */
    final /* synthetic */ ViewPropertyAnimator f2185b;

    /* renamed from: c */
    final /* synthetic */ View f2186c;

    /* renamed from: d */
    final /* synthetic */ C0568ck f2187d;

    public C0565ch(C0568ck ckVar, C0566ci ciVar, ViewPropertyAnimator viewPropertyAnimator, View view) {
        this.f2187d = ckVar;
        this.f2184a = ciVar;
        this.f2185b = viewPropertyAnimator;
        this.f2186c = view;
    }

    public final void onAnimationEnd(Animator animator) {
        this.f2185b.setListener((Animator.AnimatorListener) null);
        this.f2186c.setAlpha(1.0f);
        this.f2186c.setTranslationX(0.0f);
        this.f2186c.setTranslationY(0.0f);
        this.f2187d.mo2889m(this.f2184a.f2189b);
        this.f2187d.f2206g.remove(this.f2184a.f2189b);
        this.f2187d.mo2686b();
    }

    public final void onAnimationStart(Animator animator) {
        C0673gh ghVar = this.f2184a.f2189b;
    }
}
