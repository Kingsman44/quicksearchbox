package androidx.recyclerview.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.support.p033v7.widget.C0673gh;
import android.view.View;
import android.view.ViewPropertyAnimator;

/* renamed from: androidx.recyclerview.widget.f */
/* compiled from: PG */
final class C4068f extends AnimatorListenerAdapter {

    /* renamed from: a */
    final /* synthetic */ C0673gh f13006a;

    /* renamed from: b */
    final /* synthetic */ int f13007b;

    /* renamed from: c */
    final /* synthetic */ View f13008c;

    /* renamed from: d */
    final /* synthetic */ int f13009d;

    /* renamed from: e */
    final /* synthetic */ ViewPropertyAnimator f13010e;

    /* renamed from: f */
    final /* synthetic */ C4073k f13011f;

    public C4068f(C4073k kVar, C0673gh ghVar, int i, View view, int i2, ViewPropertyAnimator viewPropertyAnimator) {
        this.f13011f = kVar;
        this.f13006a = ghVar;
        this.f13007b = i;
        this.f13008c = view;
        this.f13009d = i2;
        this.f13010e = viewPropertyAnimator;
    }

    public final void onAnimationCancel(Animator animator) {
        if (this.f13007b != 0) {
            this.f13008c.setTranslationX(0.0f);
        }
        if (this.f13009d != 0) {
            this.f13008c.setTranslationY(0.0f);
        }
    }

    public final void onAnimationEnd(Animator animator) {
        this.f13010e.setListener((Animator.AnimatorListener) null);
        this.f13011f.mo2889m(this.f13006a);
        this.f13011f.f13037f.remove(this.f13006a);
        this.f13011f.mo8549a();
    }

    public final void onAnimationStart(Animator animator) {
    }
}
