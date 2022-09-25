package com.google.android.libraries.gsa.p1859d.p1861b;

import android.animation.ValueAnimator;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.libraries.gsa.d.b.y */
/* compiled from: PG */
public final /* synthetic */ class C22779y implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a */
    public final /* synthetic */ C22754ad f62713a;

    public /* synthetic */ C22779y(C22754ad adVar) {
        this.f62713a = adVar;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        C22754ad adVar = this.f62713a;
        float animatedFraction = valueAnimator.getAnimatedFraction();
        C58976aa aaVar = C58975e.f156826a;
        adVar.mo27965g(animatedFraction);
    }
}
