package com.google.android.apps.gsa.staticplugins.opa.translator.util;

import android.view.animation.Animation;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.translator.util.d */
/* compiled from: PG */
public final class C113687d implements Animation.AnimationListener {

    /* renamed from: a */
    final /* synthetic */ InterpreterInputButtonPlateView f314884a;

    public C113687d(InterpreterInputButtonPlateView interpreterInputButtonPlateView) {
        this.f314884a = interpreterInputButtonPlateView;
    }

    public final void onAnimationEnd(Animation animation) {
        C58976aa aaVar = C58975e.f156826a;
        this.f314884a.mo100386o();
        this.f314884a.mo100379h();
    }

    public final void onAnimationRepeat(Animation animation) {
        C58976aa aaVar = C58975e.f156826a;
    }

    public final void onAnimationStart(Animation animation) {
        C58976aa aaVar = C58975e.f156826a;
        this.f314884a.mo100382k();
        this.f314884a.mo100386o();
    }
}
