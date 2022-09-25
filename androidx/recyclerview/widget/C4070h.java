package androidx.recyclerview.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.support.p033v7.widget.C0673gh;
import android.view.View;
import android.view.ViewPropertyAnimator;

/* renamed from: androidx.recyclerview.widget.h */
/* compiled from: PG */
final class C4070h extends AnimatorListenerAdapter {

    /* renamed from: a */
    final /* synthetic */ C4071i f13016a;

    /* renamed from: b */
    final /* synthetic */ ViewPropertyAnimator f13017b;

    /* renamed from: c */
    final /* synthetic */ View f13018c;

    /* renamed from: d */
    final /* synthetic */ C4073k f13019d;

    public C4070h(C4073k kVar, C4071i iVar, ViewPropertyAnimator viewPropertyAnimator, View view) {
        this.f13019d = kVar;
        this.f13016a = iVar;
        this.f13017b = viewPropertyAnimator;
        this.f13018c = view;
    }

    public final void onAnimationEnd(Animator animator) {
        this.f13017b.setListener((Animator.AnimatorListener) null);
        this.f13018c.setAlpha(1.0f);
        this.f13018c.setTranslationX(0.0f);
        this.f13018c.setTranslationY(0.0f);
        this.f13019d.mo2889m(this.f13016a.f13021b);
        this.f13019d.f13039n.remove(this.f13016a.f13021b);
        this.f13019d.mo8549a();
    }

    public final void onAnimationStart(Animator animator) {
        C0673gh ghVar = this.f13016a.f13021b;
    }
}
