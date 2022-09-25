package com.google.android.apps.gsa.staticplugins.nowcards.base;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import com.airbnb.lottie.LottieAnimationView;

/* renamed from: com.google.android.apps.gsa.staticplugins.nowcards.base.s */
/* compiled from: PG */
final class C104355s extends AnimatorListenerAdapter {

    /* renamed from: a */
    final /* synthetic */ View f290381a;

    /* renamed from: b */
    final /* synthetic */ LottieAnimationView f290382b;

    /* renamed from: c */
    final /* synthetic */ boolean f290383c;

    public C104355s(View view, LottieAnimationView lottieAnimationView, boolean z) {
        this.f290381a = view;
        this.f290382b = lottieAnimationView;
        this.f290383c = z;
    }

    public final void onAnimationCancel(Animator animator) {
        this.f290382b.f15138d.mo9773j(true != this.f290383c ? 0.0f : 1.0f);
    }

    public final void onAnimationStart(Animator animator) {
        this.f290381a.setVisibility(0);
        this.f290382b.setVisibility(0);
    }
}
