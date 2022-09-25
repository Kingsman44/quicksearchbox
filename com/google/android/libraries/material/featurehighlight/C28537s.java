package com.google.android.libraries.material.featurehighlight;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.view.View;
import com.google.android.libraries.material.p2205a.C28497j;

/* renamed from: com.google.android.libraries.material.featurehighlight.s */
/* compiled from: PG */
final class C28537s implements View.OnLayoutChangeListener {

    /* renamed from: a */
    final /* synthetic */ Runnable f77570a;

    /* renamed from: b */
    final /* synthetic */ C28512ac f77571b;

    public C28537s(C28512ac acVar, Runnable runnable) {
        this.f77571b = acVar;
        this.f77570a = runnable;
    }

    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        ((C28528j) this.f77570a).f77506a.mo34077d();
        this.f77571b.mo34014l();
        C28512ac acVar = this.f77571b;
        ObjectAnimator duration = ObjectAnimator.ofFloat(acVar.f77414g.mo33966a(), "alpha", new float[]{0.0f, 1.0f}).setDuration(350);
        duration.setInterpolator(acVar.mo33999b(C28497j.f77329a, 0.0f));
        float exactCenterX = acVar.f77408a.exactCenterX();
        float f = acVar.f77412e.f77465i;
        float exactCenterY = acVar.f77408a.exactCenterY();
        C28517ah ahVar = acVar.f77412e;
        Animator b = ahVar.mo34049b(exactCenterX - f, exactCenterY - ahVar.f77466j, 0.0f);
        Animator b2 = acVar.f77413f.mo34032b(0.0f);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(new Animator[]{duration, b, b2});
        animatorSet.addListener(new C28540v(acVar));
        acVar.mo34015m(animatorSet);
        this.f77571b.removeOnLayoutChangeListener(this);
    }
}
