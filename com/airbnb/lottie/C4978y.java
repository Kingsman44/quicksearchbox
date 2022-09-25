package com.airbnb.lottie;

import android.animation.ValueAnimator;
import com.airbnb.lottie.p238c.p241c.C4879c;

/* renamed from: com.airbnb.lottie.y */
/* compiled from: PG */
final class C4978y implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a */
    final /* synthetic */ C4825ac f15796a;

    public C4978y(C4825ac acVar) {
        this.f15796a = acVar;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        C4825ac acVar = this.f15796a;
        C4879c cVar = acVar.f15351k;
        if (cVar != null) {
            cVar.mo9815l(acVar.f15342b.mo9874d());
        }
    }
}
