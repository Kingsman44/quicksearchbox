package androidx.recyclerview.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.support.p033v7.widget.C0673gh;
import android.view.View;
import android.view.ViewPropertyAnimator;

/* renamed from: androidx.recyclerview.widget.e */
/* compiled from: PG */
final class C4067e extends AnimatorListenerAdapter {

    /* renamed from: a */
    final /* synthetic */ C0673gh f13002a;

    /* renamed from: b */
    final /* synthetic */ View f13003b;

    /* renamed from: c */
    final /* synthetic */ ViewPropertyAnimator f13004c;

    /* renamed from: d */
    final /* synthetic */ C4073k f13005d;

    public C4067e(C4073k kVar, C0673gh ghVar, View view, ViewPropertyAnimator viewPropertyAnimator) {
        this.f13005d = kVar;
        this.f13002a = ghVar;
        this.f13003b = view;
        this.f13004c = viewPropertyAnimator;
    }

    public final void onAnimationCancel(Animator animator) {
        this.f13003b.setAlpha(1.0f);
    }

    public final void onAnimationEnd(Animator animator) {
        this.f13004c.setListener((Animator.AnimatorListener) null);
        this.f13005d.mo2889m(this.f13002a);
        this.f13005d.f13036e.remove(this.f13002a);
        this.f13005d.mo8549a();
    }

    public final void onAnimationStart(Animator animator) {
    }
}
