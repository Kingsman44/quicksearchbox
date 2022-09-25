package com.google.android.libraries.onegoogle.accountmenu;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import com.google.android.libraries.onegoogle.account.disc.AccountParticleDisc;
import com.google.common.p4522b.C58485gu;

/* renamed from: com.google.android.libraries.onegoogle.accountmenu.ae */
/* compiled from: PG */
final class C30315ae extends AnimatorListenerAdapter {

    /* renamed from: a */
    final /* synthetic */ Runnable f81978a;

    /* renamed from: b */
    final /* synthetic */ AnimatorListenerAdapter f81979b;

    /* renamed from: c */
    final /* synthetic */ C30317ag f81980c;

    public C30315ae(C30317ag agVar, Runnable runnable, AnimatorListenerAdapter animatorListenerAdapter) {
        this.f81980c = agVar;
        this.f81978a = runnable;
        this.f81979b = animatorListenerAdapter;
    }

    public final void onAnimationEnd(Animator animator) {
        this.f81978a.run();
        C30317ag agVar = this.f81980c;
        AnimatorListenerAdapter animatorListenerAdapter = this.f81979b;
        AccountParticleDisc accountParticleDisc = agVar.f81984b.f81902c;
        C58485gu p = C58485gu.m89848p(ObjectAnimator.ofFloat(accountParticleDisc, "scaleX", new float[]{0.067f, 1.0f}).setDuration(233), ObjectAnimator.ofFloat(accountParticleDisc, "scaleY", new float[]{0.067f, 1.0f}).setDuration(233), ObjectAnimator.ofFloat(accountParticleDisc, "alpha", new float[]{0.125f, 1.0f}).setDuration(117));
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(p);
        animatorSet.addListener(animatorListenerAdapter);
        animatorSet.addListener(new C30316af(agVar, accountParticleDisc));
        animatorSet.start();
    }
}
