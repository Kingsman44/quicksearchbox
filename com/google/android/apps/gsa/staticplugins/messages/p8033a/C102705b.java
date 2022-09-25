package com.google.android.apps.gsa.staticplugins.messages.p8033a;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.airbnb.lottie.LottieAnimationView;

/* renamed from: com.google.android.apps.gsa.staticplugins.messages.a.b */
/* compiled from: PG */
public final class C102705b extends AnimatorListenerAdapter {

    /* renamed from: a */
    final /* synthetic */ LottieAnimationView f286720a;

    /* renamed from: b */
    final /* synthetic */ int[] f286721b;

    public C102705b(LottieAnimationView lottieAnimationView, int[] iArr) {
        this.f286720a = lottieAnimationView;
        this.f286721b = iArr;
    }

    public final void onAnimationRepeat(Animator animator) {
        this.f286720a.mo9694e();
        LottieAnimationView lottieAnimationView = this.f286720a;
        int[] iArr = this.f286721b;
        lottieAnimationView.f15138d.mo9768h(iArr[0], iArr[1]);
        this.f286720a.mo9697h();
        LottieAnimationView lottieAnimationView2 = this.f286720a;
        lottieAnimationView2.post(new C102704a(this, lottieAnimationView2));
    }
}
