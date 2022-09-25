package android.support.p033v7.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;

/* renamed from: android.support.v7.widget.cf */
/* compiled from: PG */
final class C0563cf extends AnimatorListenerAdapter {

    /* renamed from: a */
    final /* synthetic */ C0673gh f2174a;

    /* renamed from: b */
    final /* synthetic */ int f2175b;

    /* renamed from: c */
    final /* synthetic */ View f2176c;

    /* renamed from: d */
    final /* synthetic */ int f2177d;

    /* renamed from: e */
    final /* synthetic */ ViewPropertyAnimator f2178e;

    /* renamed from: f */
    final /* synthetic */ C0568ck f2179f;

    public C0563cf(C0568ck ckVar, C0673gh ghVar, int i, View view, int i2, ViewPropertyAnimator viewPropertyAnimator) {
        this.f2179f = ckVar;
        this.f2174a = ghVar;
        this.f2175b = i;
        this.f2176c = view;
        this.f2177d = i2;
        this.f2178e = viewPropertyAnimator;
    }

    public final void onAnimationCancel(Animator animator) {
        if (this.f2175b != 0) {
            this.f2176c.setTranslationX(0.0f);
        }
        if (this.f2177d != 0) {
            this.f2176c.setTranslationY(0.0f);
        }
    }

    public final void onAnimationEnd(Animator animator) {
        this.f2178e.setListener((Animator.AnimatorListener) null);
        this.f2179f.mo2889m(this.f2174a);
        this.f2179f.f2204e.remove(this.f2174a);
        this.f2179f.mo2686b();
    }

    public final void onAnimationStart(Animator animator) {
    }
}
