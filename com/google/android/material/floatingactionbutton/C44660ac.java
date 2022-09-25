package com.google.android.material.floatingactionbutton;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.StateListAnimator;
import android.graphics.Rect;
import android.view.View;
import java.util.ArrayList;

/* renamed from: com.google.android.material.floatingactionbutton.ac */
/* compiled from: PG */
final class C44660ac extends C44658aa {

    /* renamed from: F */
    private StateListAnimator f116419F;

    public C44660ac(FloatingActionButton floatingActionButton, C44678q qVar) {
        super(floatingActionButton, qVar);
    }

    /* renamed from: n */
    private final Animator m79152n(float f, float f2) {
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.play(ObjectAnimator.ofFloat(this.f116396C, "elevation", new float[]{f}).setDuration(0)).with(ObjectAnimator.ofFloat(this.f116396C, View.TRANSLATION_Z, new float[]{f2}).setDuration(100));
        animatorSet.setInterpolator(f116383a);
        return animatorSet;
    }

    /* renamed from: a */
    public final float mo47924a() {
        return this.f116396C.getElevation();
    }

    /* renamed from: e */
    public final void mo47928e(Rect rect) {
        if (this.f116398E.f116458a.f116369d) {
            super.mo47928e(rect);
        } else if (!mo47936m()) {
            int i = this.f116413u;
            FloatingActionButton floatingActionButton = this.f116396C;
            int c = (i - floatingActionButton.mo47897c(floatingActionButton.f116367b)) / 2;
            rect.set(c, c, c, c);
        } else {
            rect.set(0, 0, 0, 0);
        }
    }

    /* renamed from: f */
    public final void mo47929f(float f, float f2, float f3) {
        if (this.f116396C.getStateListAnimator() == this.f116419F) {
            StateListAnimator stateListAnimator = new StateListAnimator();
            stateListAnimator.addState(f116388f, m79152n(f, f3));
            stateListAnimator.addState(f116389g, m79152n(f, f2));
            stateListAnimator.addState(f116390h, m79152n(f, f2));
            stateListAnimator.addState(f116391i, m79152n(f, f2));
            AnimatorSet animatorSet = new AnimatorSet();
            ArrayList arrayList = new ArrayList();
            arrayList.add(ObjectAnimator.ofFloat(this.f116396C, "elevation", new float[]{f}).setDuration(0));
            arrayList.add(ObjectAnimator.ofFloat(this.f116396C, View.TRANSLATION_Z, new float[]{0.0f}).setDuration(100));
            animatorSet.playSequentially((Animator[]) arrayList.toArray(new Animator[0]));
            animatorSet.setInterpolator(f116383a);
            stateListAnimator.addState(f116392j, animatorSet);
            stateListAnimator.addState(f116393k, m79152n(0.0f, 0.0f));
            this.f116419F = stateListAnimator;
            this.f116396C.setStateListAnimator(this.f116419F);
        }
        if (mo47934k()) {
            mo47932i();
        }
    }

    /* renamed from: k */
    public final boolean mo47934k() {
        return this.f116398E.f116458a.f116369d || !mo47936m();
    }
}
