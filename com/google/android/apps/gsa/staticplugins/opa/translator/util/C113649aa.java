package com.google.android.apps.gsa.staticplugins.opa.translator.util;

import android.view.animation.Animation;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.translator.util.aa */
/* compiled from: PG */
final class C113649aa implements Animation.AnimationListener {

    /* renamed from: a */
    final /* synthetic */ InterpreterListeningBoxesView f314820a;

    public C113649aa(InterpreterListeningBoxesView interpreterListeningBoxesView) {
        this.f314820a = interpreterListeningBoxesView;
    }

    public final void onAnimationEnd(Animation animation) {
        C58976aa aaVar = C58975e.f156826a;
        this.f314820a.mo100410b();
        this.f314820a.f314748b.setAlpha(0.25f);
    }

    public final void onAnimationRepeat(Animation animation) {
        C58976aa aaVar = C58975e.f156826a;
    }

    public final void onAnimationStart(Animation animation) {
        C58976aa aaVar = C58975e.f156826a;
    }
}
