package com.airbnb.lottie;

import android.content.Context;
import java.util.concurrent.Callable;

/* renamed from: com.airbnb.lottie.g */
/* compiled from: PG */
final class C4955g implements Callable {

    /* renamed from: a */
    final /* synthetic */ String f15728a;

    /* renamed from: b */
    final /* synthetic */ LottieAnimationView f15729b;

    public C4955g(LottieAnimationView lottieAnimationView, String str) {
        this.f15729b = lottieAnimationView;
        this.f15728a = str;
    }

    public final /* bridge */ /* synthetic */ Object call() {
        LottieAnimationView lottieAnimationView = this.f15729b;
        boolean z = lottieAnimationView.f15139e;
        Context context = lottieAnimationView.getContext();
        return z ? C4972s.m13743a(context, this.f15728a) : C4972s.m13744b(context, this.f15728a, (String) null);
    }
}
