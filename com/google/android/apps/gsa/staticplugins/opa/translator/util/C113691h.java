package com.google.android.apps.gsa.staticplugins.opa.translator.util;

import android.view.animation.Animation;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.translator.util.h */
/* compiled from: PG */
public final class C113691h implements Animation.AnimationListener {

    /* renamed from: a */
    final /* synthetic */ InterpreterInputButtonPlateView f314888a;

    public C113691h(InterpreterInputButtonPlateView interpreterInputButtonPlateView) {
        this.f314888a = interpreterInputButtonPlateView;
    }

    public final void onAnimationEnd(Animation animation) {
        C58976aa aaVar = C58975e.f156826a;
        this.f314888a.mo100380i();
        InterpreterInputButtonPlateView interpreterInputButtonPlateView = this.f314888a;
        interpreterInputButtonPlateView.f314719i = false;
        interpreterInputButtonPlateView.mo100381j();
        InterpreterInputButtonPlateView interpreterInputButtonPlateView2 = this.f314888a;
        interpreterInputButtonPlateView2.f314716f.mo100524b(interpreterInputButtonPlateView2);
    }

    public final void onAnimationRepeat(Animation animation) {
        C58976aa aaVar = C58975e.f156826a;
    }

    public final void onAnimationStart(Animation animation) {
        C58976aa aaVar = C58975e.f156826a;
    }
}
