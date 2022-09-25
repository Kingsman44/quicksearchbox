package com.google.android.apps.search.googleapp.search.srp.error;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.airbnb.lottie.LottieAnimationView;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.googleapp.search.srp.error.n */
/* compiled from: PG */
public final class C137815n extends AnimatorListenerAdapter {

    /* renamed from: a */
    final /* synthetic */ LottieAnimationView f374943a;

    public C137815n(LottieAnimationView lottieAnimationView) {
        this.f374943a = lottieAnimationView;
    }

    public final void onAnimationRepeat(Animator animator) {
        C69664n.m101061g(animator, "animation");
        this.f374943a.mo9694e();
        this.f374943a.f15138d.mo9768h(128, 377);
        this.f374943a.mo9697h();
        this.f374943a.mo9696g(this);
    }
}
