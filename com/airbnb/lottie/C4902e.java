package com.airbnb.lottie;

/* renamed from: com.airbnb.lottie.e */
/* compiled from: PG */
final class C4902e implements C4827ae {

    /* renamed from: a */
    final /* synthetic */ LottieAnimationView f15640a;

    public C4902e(LottieAnimationView lottieAnimationView) {
        this.f15640a = lottieAnimationView;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo9783a(Object obj) {
        Throwable th = (Throwable) obj;
        LottieAnimationView lottieAnimationView = this.f15640a;
        int i = lottieAnimationView.f15137c;
        if (i != 0) {
            lottieAnimationView.setImageResource(i);
        }
        C4827ae aeVar = this.f15640a.f15136b;
        if (aeVar == null) {
            aeVar = LottieAnimationView.f15135a;
        }
        aeVar.mo9783a(th);
    }
}
