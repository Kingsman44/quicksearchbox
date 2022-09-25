package com.google.android.libraries.lens.view.imageviewer;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.airbnb.lottie.LottieAnimationView;

/* renamed from: com.google.android.libraries.lens.view.imageviewer.g */
/* compiled from: PG */
final class C26943g extends AnimatorListenerAdapter {

    /* renamed from: a */
    final /* synthetic */ LottieAnimationView f73440a;

    public C26943g(LottieAnimationView lottieAnimationView) {
        this.f73440a = lottieAnimationView;
    }

    public final void onAnimationEnd(Animator animator) {
        this.f73440a.setVisibility(8);
        this.f73440a.mo9692c();
    }
}
