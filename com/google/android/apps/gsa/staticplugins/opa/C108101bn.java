package com.google.android.apps.gsa.staticplugins.opa;

import android.animation.ValueAnimator;
import com.google.android.apps.gsa.search.shared.p6941ui.C88522b;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.bn */
/* compiled from: PG */
public final /* synthetic */ class C108101bn implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a */
    public final /* synthetic */ C109040fj f300705a;

    public /* synthetic */ C108101bn(C109040fj fjVar) {
        this.f300705a = fjVar;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        C109040fj fjVar = this.f300705a;
        ((C88522b) fjVar.f303254aN.mo56107c()).mo82143e(((Integer) valueAnimator.getAnimatedValue()).intValue());
    }
}
