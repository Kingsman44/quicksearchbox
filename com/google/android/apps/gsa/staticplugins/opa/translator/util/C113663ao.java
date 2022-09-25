package com.google.android.apps.gsa.staticplugins.opa.translator.util;

import android.view.animation.Animation;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.translator.util.ao */
/* compiled from: PG */
public final class C113663ao implements Animation.AnimationListener {

    /* renamed from: a */
    final /* synthetic */ InterpreterMainTextView f314846a;

    public C113663ao(InterpreterMainTextView interpreterMainTextView) {
        this.f314846a = interpreterMainTextView;
    }

    public final void onAnimationEnd(Animation animation) {
        C59071e eVar = InterpreterMainTextView.f314755a;
        C58976aa aaVar = C58975e.f156826a;
        this.f314846a.setVisibility(8);
        this.f314846a.mo100435x();
        this.f314846a.f314773r = false;
    }

    public final void onAnimationRepeat(Animation animation) {
        C59071e eVar = InterpreterMainTextView.f314755a;
        C58976aa aaVar = C58975e.f156826a;
    }

    public final void onAnimationStart(Animation animation) {
        C59071e eVar = InterpreterMainTextView.f314755a;
        C58976aa aaVar = C58975e.f156826a;
    }
}
