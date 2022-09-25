package com.google.android.apps.gsa.staticplugins.p7388al;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.airbnb.lottie.LottieAnimationView;

/* renamed from: com.google.android.apps.gsa.staticplugins.al.i */
/* compiled from: PG */
final class C93935i extends AnimatorListenerAdapter {

    /* renamed from: a */
    final /* synthetic */ LottieAnimationView f262310a;

    /* renamed from: b */
    final /* synthetic */ C93943q f262311b;

    public C93935i(C93943q qVar, LottieAnimationView lottieAnimationView) {
        this.f262311b = qVar;
        this.f262310a = lottieAnimationView;
    }

    public final void onAnimationRepeat(Animator animator) {
        C93943q qVar = this.f262311b;
        if (!qVar.f262351w) {
            qVar.f262351w = true;
            this.f262310a.mo9700j("4_device_looking_loop_360.json");
            this.f262310a.mo9695f();
        }
    }
}
