package com.google.android.apps.gsa.staticplugins.opa.valyrian.p8601ui;

import android.animation.ValueAnimator;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.valyrian.ui.n */
/* compiled from: PG */
public final /* synthetic */ class C114144n implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a */
    public final /* synthetic */ C114150t f316429a;

    public /* synthetic */ C114144n(C114150t tVar) {
        this.f316429a = tVar;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        C114150t tVar = this.f316429a;
        int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        C58976aa aaVar = C58975e.f156826a;
        tVar.mo101198h(intValue);
    }
}
