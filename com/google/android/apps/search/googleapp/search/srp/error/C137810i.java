package com.google.android.apps.search.googleapp.search.srp.error;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.airbnb.lottie.LottieAnimationView;

/* renamed from: com.google.android.apps.search.googleapp.search.srp.error.i */
/* compiled from: PG */
final class C137810i extends AnimatorListenerAdapter {

    /* renamed from: a */
    final /* synthetic */ LottieAnimationView f374923a;

    public C137810i(LottieAnimationView lottieAnimationView) {
        this.f374923a = lottieAnimationView;
    }

    public final void onAnimationRepeat(Animator animator) {
        this.f374923a.mo9694e();
        this.f374923a.f15138d.mo9768h(128, 377);
        this.f374923a.mo9697h();
        this.f374923a.mo9696g(this);
    }
}
