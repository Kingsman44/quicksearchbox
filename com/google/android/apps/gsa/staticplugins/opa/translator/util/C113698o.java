package com.google.android.apps.gsa.staticplugins.opa.translator.util;

import android.view.animation.Animation;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.translator.util.o */
/* compiled from: PG */
public final class C113698o implements Animation.AnimationListener {

    /* renamed from: a */
    final /* synthetic */ InterpreterIntroView f314898a;

    public C113698o(InterpreterIntroView interpreterIntroView) {
        this.f314898a = interpreterIntroView;
    }

    public final void onAnimationEnd(Animation animation) {
        C58976aa aaVar = C58975e.f156826a;
        InterpreterIntroView interpreterIntroView = this.f314898a;
        interpreterIntroView.mo100392b(interpreterIntroView.f314736k);
        this.f314898a.f314728c.setStartOffset(0);
        InterpreterIntroView interpreterIntroView2 = this.f314898a;
        interpreterIntroView2.startAnimation(interpreterIntroView2.f314728c);
    }

    public final void onAnimationRepeat(Animation animation) {
        C58976aa aaVar = C58975e.f156826a;
    }

    public final void onAnimationStart(Animation animation) {
        C58976aa aaVar = C58975e.f156826a;
    }
}
