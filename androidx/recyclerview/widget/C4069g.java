package androidx.recyclerview.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.support.p033v7.widget.C0673gh;
import android.view.View;
import android.view.ViewPropertyAnimator;

/* renamed from: androidx.recyclerview.widget.g */
/* compiled from: PG */
final class C4069g extends AnimatorListenerAdapter {

    /* renamed from: a */
    final /* synthetic */ C4071i f13012a;

    /* renamed from: b */
    final /* synthetic */ ViewPropertyAnimator f13013b;

    /* renamed from: c */
    final /* synthetic */ View f13014c;

    /* renamed from: d */
    final /* synthetic */ C4073k f13015d;

    public C4069g(C4073k kVar, C4071i iVar, ViewPropertyAnimator viewPropertyAnimator, View view) {
        this.f13015d = kVar;
        this.f13012a = iVar;
        this.f13013b = viewPropertyAnimator;
        this.f13014c = view;
    }

    public final void onAnimationEnd(Animator animator) {
        this.f13013b.setListener((Animator.AnimatorListener) null);
        this.f13014c.setAlpha(1.0f);
        this.f13014c.setTranslationX(0.0f);
        this.f13014c.setTranslationY(0.0f);
        this.f13015d.mo2889m(this.f13012a.f13020a);
        this.f13015d.f13039n.remove(this.f13012a.f13020a);
        this.f13015d.mo8549a();
    }

    public final void onAnimationStart(Animator animator) {
        C0673gh ghVar = this.f13012a.f13020a;
    }
}
