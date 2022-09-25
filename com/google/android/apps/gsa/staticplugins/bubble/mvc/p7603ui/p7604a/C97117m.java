package com.google.android.apps.gsa.staticplugins.bubble.mvc.p7603ui.p7604a;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import com.google.android.libraries.p10982ad.C147446j;
import com.google.android.libraries.p10982ad.C147454r;

/* renamed from: com.google.android.apps.gsa.staticplugins.bubble.mvc.ui.a.m */
/* compiled from: PG */
public final class C97117m {

    /* renamed from: a */
    public final View f271357a;

    /* renamed from: b */
    public Animator f271358b;

    public C97117m(View view) {
        this.f271357a = view;
    }

    /* renamed from: a */
    public final C147446j mo90503a(float f, float f2) {
        C147446j jVar = new C147446j(0.0f);
        jVar.f397996b = new C147454r(500.0f, 0.4f);
        jVar.mo124188n(new C97115k(this, jVar));
        jVar.mo124186l(f);
        jVar.mo124179e(f2);
        return jVar;
    }

    /* renamed from: b */
    public final void mo90504b(float f) {
        Animator animator = this.f271358b;
        if (animator != null) {
            animator.cancel();
            this.f271358b = null;
        }
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.play(ObjectAnimator.ofFloat(this.f271357a, View.SCALE_X, new float[]{((Float) View.SCALE_X.get(this.f271357a)).floatValue(), f})).with(ObjectAnimator.ofFloat(this.f271357a, View.SCALE_Y, new float[]{((Float) View.SCALE_Y.get(this.f271357a)).floatValue(), f}));
        animatorSet.setDuration(200);
        animatorSet.setInterpolator(new DecelerateInterpolator());
        animatorSet.addListener(new C97116l(this));
        animatorSet.start();
        this.f271358b = animatorSet;
    }
}
