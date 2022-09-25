package com.google.android.material.snackbar;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;

/* renamed from: com.google.android.material.snackbar.o */
/* compiled from: PG */
final class C44884o implements Runnable {

    /* renamed from: a */
    final /* synthetic */ BaseTransientBottomBar f117131a;

    public C44884o(BaseTransientBottomBar baseTransientBottomBar) {
        this.f117131a = baseTransientBottomBar;
    }

    public final void run() {
        C44890u uVar = this.f117131a.f117089j;
        if (uVar != null) {
            if (uVar.getParent() != null) {
                this.f117131a.f117089j.setVisibility(0);
            }
            BaseTransientBottomBar baseTransientBottomBar = this.f117131a;
            if (baseTransientBottomBar.f117089j.f117139c == 1) {
                ValueAnimator c = baseTransientBottomBar.mo48338c(0.0f, 1.0f);
                ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.8f, 1.0f});
                ofFloat.setInterpolator(baseTransientBottomBar.f117086g);
                ofFloat.addUpdateListener(new C44872c(baseTransientBottomBar));
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.playTogether(new Animator[]{c, ofFloat});
                animatorSet.setDuration((long) baseTransientBottomBar.f117082c);
                animatorSet.addListener(new C44885p(baseTransientBottomBar));
                animatorSet.start();
                return;
            }
            int b = baseTransientBottomBar.mo48337b();
            baseTransientBottomBar.f117089j.setTranslationY((float) b);
            ValueAnimator valueAnimator = new ValueAnimator();
            valueAnimator.setIntValues(new int[]{b, 0});
            valueAnimator.setInterpolator(baseTransientBottomBar.f117085f);
            valueAnimator.setDuration((long) baseTransientBottomBar.f117084e);
            valueAnimator.addListener(new C44873d(baseTransientBottomBar));
            valueAnimator.addUpdateListener(new C44874e(baseTransientBottomBar));
            valueAnimator.start();
        }
    }
}
