package com.google.android.libraries.gsa.p1859d.p1861b;

import android.animation.ValueAnimator;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.libraries.gsa.d.b.w */
/* compiled from: PG */
public final /* synthetic */ class C22777w implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a */
    public final /* synthetic */ C22754ad f62711a;

    public /* synthetic */ C22777w(C22754ad adVar) {
        this.f62711a = adVar;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        C22754ad adVar = this.f62711a;
        float animatedFraction = valueAnimator.getAnimatedFraction();
        C58976aa aaVar = C58975e.f156826a;
        adVar.mo27965g(1.0f - animatedFraction);
    }
}
