package com.google.android.apps.gsa.staticplugins.actionsui.modular;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.transition.TransitionValues;
import android.transition.Visibility;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: com.google.android.apps.gsa.staticplugins.actionsui.modular.di */
/* compiled from: PG */
public final class C93612di extends Visibility {

    /* renamed from: a */
    public final float f261343a;

    public C93612di(float f) {
        this.f261343a = f;
    }

    public final Animator onAppear(ViewGroup viewGroup, TransitionValues transitionValues, int i, TransitionValues transitionValues2, int i2) {
        if (transitionValues2 == null) {
            return null;
        }
        View view = transitionValues2.view;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, "scaleX", new float[]{this.f261343a, 1.0f});
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(view, "scaleY", new float[]{this.f261343a, 1.0f});
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(new Animator[]{ofFloat, ofFloat2});
        animatorSet.addListener(new C93610dg(this, view));
        return animatorSet;
    }

    public final Animator onDisappear(ViewGroup viewGroup, TransitionValues transitionValues, int i, TransitionValues transitionValues2, int i2) {
        View view = transitionValues2 != null ? transitionValues2.view : transitionValues != null ? transitionValues.view : null;
        if (view == null) {
            return null;
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, "scaleX", new float[]{1.0f, this.f261343a});
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(view, "scaleY", new float[]{1.0f, this.f261343a});
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(new Animator[]{ofFloat, ofFloat2});
        animatorSet.addListener(new C93611dh(this, view, i, i2));
        return animatorSet;
    }
}
