package com.google.android.apps.gsa.staticplugins.opa.translator.util;

import android.view.animation.Animation;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.translator.util.g */
/* compiled from: PG */
public final class C113690g implements Animation.AnimationListener {

    /* renamed from: a */
    final /* synthetic */ InterpreterInputButtonPlateView f314887a;

    public C113690g(InterpreterInputButtonPlateView interpreterInputButtonPlateView) {
        this.f314887a = interpreterInputButtonPlateView;
    }

    public final void onAnimationEnd(Animation animation) {
        C58976aa aaVar = C58975e.f156826a;
        this.f314887a.mo100378g().setVisibility(8);
        this.f314887a.mo100386o();
    }

    public final void onAnimationRepeat(Animation animation) {
        C58976aa aaVar = C58975e.f156826a;
    }

    public final void onAnimationStart(Animation animation) {
        C58976aa aaVar = C58975e.f156826a;
        this.f314887a.mo100386o();
    }
}
