package android.support.p033v7.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;

/* renamed from: android.support.v7.widget.cg */
/* compiled from: PG */
final class C0564cg extends AnimatorListenerAdapter {

    /* renamed from: a */
    final /* synthetic */ C0566ci f2180a;

    /* renamed from: b */
    final /* synthetic */ ViewPropertyAnimator f2181b;

    /* renamed from: c */
    final /* synthetic */ View f2182c;

    /* renamed from: d */
    final /* synthetic */ C0568ck f2183d;

    public C0564cg(C0568ck ckVar, C0566ci ciVar, ViewPropertyAnimator viewPropertyAnimator, View view) {
        this.f2183d = ckVar;
        this.f2180a = ciVar;
        this.f2181b = viewPropertyAnimator;
        this.f2182c = view;
    }

    public final void onAnimationEnd(Animator animator) {
        this.f2181b.setListener((Animator.AnimatorListener) null);
        this.f2182c.setAlpha(1.0f);
        this.f2182c.setTranslationX(0.0f);
        this.f2182c.setTranslationY(0.0f);
        this.f2183d.mo2889m(this.f2180a.f2188a);
        this.f2183d.f2206g.remove(this.f2180a.f2188a);
        this.f2183d.mo2686b();
    }

    public final void onAnimationStart(Animator animator) {
        C0673gh ghVar = this.f2180a.f2188a;
    }
}
