package com.google.android.apps.gsa.staticplugins.opa.translator.util;

import android.view.animation.Animation;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.translator.util.m */
/* compiled from: PG */
public final class C113696m implements Animation.AnimationListener {

    /* renamed from: a */
    final /* synthetic */ InterpreterIntroView f314896a;

    public C113696m(InterpreterIntroView interpreterIntroView) {
        this.f314896a = interpreterIntroView;
    }

    public final void onAnimationEnd(Animation animation) {
        C58976aa aaVar = C58975e.f156826a;
        this.f314896a.setAlpha(1.0f);
        this.f314896a.setVisibility(8);
    }

    public final void onAnimationRepeat(Animation animation) {
        C58976aa aaVar = C58975e.f156826a;
    }

    public final void onAnimationStart(Animation animation) {
        C58976aa aaVar = C58975e.f156826a;
    }
}
