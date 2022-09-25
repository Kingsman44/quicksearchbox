package com.google.android.libraries.search.rendering.xuikit.bubbles.p3123e.p3124a;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import com.google.android.libraries.p10982ad.C147446j;
import com.google.android.libraries.p10982ad.C147454r;

/* renamed from: com.google.android.libraries.search.rendering.xuikit.bubbles.e.a.n */
/* compiled from: PG */
public final class C40142n {

    /* renamed from: a */
    public final View f105443a;

    /* renamed from: b */
    public final C40129aa f105444b;

    /* renamed from: c */
    public Animator f105445c;

    public C40142n(View view, C40129aa aaVar) {
        this.f105443a = view;
        this.f105444b = aaVar;
    }

    /* renamed from: a */
    public final C147446j mo42250a(float f, float f2) {
        C147446j jVar = new C147446j(0.0f);
        jVar.f397996b = new C147454r(500.0f, 0.4f);
        jVar.mo124188n(new C40139k(this, jVar));
        jVar.mo124186l(f);
        jVar.mo124179e(f2);
        return jVar;
    }

    /* renamed from: b */
    public final void mo42251b(float f) {
        Animator animator = this.f105445c;
        if (animator != null) {
            animator.cancel();
            this.f105445c = null;
        }
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.play(ObjectAnimator.ofFloat(this.f105443a, View.SCALE_X, new float[]{((Float) View.SCALE_X.get(this.f105443a)).floatValue(), f})).with(ObjectAnimator.ofFloat(this.f105443a, View.SCALE_Y, new float[]{((Float) View.SCALE_Y.get(this.f105443a)).floatValue(), f}));
        animatorSet.setDuration(200);
        animatorSet.setInterpolator(new DecelerateInterpolator());
        animatorSet.addListener(new C40141m(this));
        animatorSet.start();
        this.f105445c = animatorSet;
    }
}
