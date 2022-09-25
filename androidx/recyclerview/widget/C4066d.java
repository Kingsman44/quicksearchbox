package androidx.recyclerview.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.support.p033v7.widget.C0673gh;
import android.view.View;
import android.view.ViewPropertyAnimator;

/* renamed from: androidx.recyclerview.widget.d */
/* compiled from: PG */
final class C4066d extends AnimatorListenerAdapter {

    /* renamed from: a */
    final /* synthetic */ C0673gh f12998a;

    /* renamed from: b */
    final /* synthetic */ ViewPropertyAnimator f12999b;

    /* renamed from: c */
    final /* synthetic */ View f13000c;

    /* renamed from: d */
    final /* synthetic */ C4073k f13001d;

    public C4066d(C4073k kVar, C0673gh ghVar, ViewPropertyAnimator viewPropertyAnimator, View view) {
        this.f13001d = kVar;
        this.f12998a = ghVar;
        this.f12999b = viewPropertyAnimator;
        this.f13000c = view;
    }

    public final void onAnimationEnd(Animator animator) {
        this.f12999b.setListener((Animator.AnimatorListener) null);
        this.f13000c.setAlpha(1.0f);
        this.f13001d.mo2889m(this.f12998a);
        this.f13001d.f13038g.remove(this.f12998a);
        this.f13001d.mo8549a();
    }

    public final void onAnimationStart(Animator animator) {
    }
}
