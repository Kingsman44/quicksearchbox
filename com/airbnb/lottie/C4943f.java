package com.airbnb.lottie;

import android.content.Context;
import java.util.concurrent.Callable;

/* renamed from: com.airbnb.lottie.f */
/* compiled from: PG */
final class C4943f implements Callable {

    /* renamed from: a */
    final /* synthetic */ int f15706a;

    /* renamed from: b */
    final /* synthetic */ LottieAnimationView f15707b;

    public C4943f(LottieAnimationView lottieAnimationView, int i) {
        this.f15707b = lottieAnimationView;
        this.f15706a = i;
    }

    public final /* bridge */ /* synthetic */ Object call() {
        LottieAnimationView lottieAnimationView = this.f15707b;
        boolean z = lottieAnimationView.f15139e;
        Context context = lottieAnimationView.getContext();
        if (!z) {
            return C4972s.m13746d(context, this.f15706a, (String) null);
        }
        int i = this.f15706a;
        return C4972s.m13746d(context, i, C4972s.m13754l(context, i));
    }
}
