package com.google.android.apps.gsa.staticplugins.opa.translator.util;

import android.view.animation.Animation;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.translator.util.f */
/* compiled from: PG */
public final class C113689f implements Animation.AnimationListener {

    /* renamed from: a */
    final /* synthetic */ InterpreterInputButtonPlateView f314886a;

    public C113689f(InterpreterInputButtonPlateView interpreterInputButtonPlateView) {
        this.f314886a = interpreterInputButtonPlateView;
    }

    public final void onAnimationEnd(Animation animation) {
        C58976aa aaVar = C58975e.f156826a;
        this.f314886a.mo100386o();
    }

    public final void onAnimationRepeat(Animation animation) {
        C58976aa aaVar = C58975e.f156826a;
    }

    public final void onAnimationStart(Animation animation) {
        C58976aa aaVar = C58975e.f156826a;
        this.f314886a.mo100378g().setVisibility(0);
        this.f314886a.mo100386o();
    }
}
