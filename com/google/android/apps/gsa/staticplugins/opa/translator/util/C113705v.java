package com.google.android.apps.gsa.staticplugins.opa.translator.util;

import android.view.animation.Animation;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.translator.util.v */
/* compiled from: PG */
final class C113705v implements Animation.AnimationListener {

    /* renamed from: a */
    final /* synthetic */ InterpreterKeyboardInputView f314905a;

    public C113705v(InterpreterKeyboardInputView interpreterKeyboardInputView) {
        this.f314905a = interpreterKeyboardInputView;
    }

    public final void onAnimationEnd(Animation animation) {
        C58976aa aaVar = C58975e.f156826a;
        this.f314905a.setVisibility(8);
        this.f314905a.setAlpha(1.0f);
    }

    public final void onAnimationRepeat(Animation animation) {
        C58976aa aaVar = C58975e.f156826a;
    }

    public final void onAnimationStart(Animation animation) {
        C58976aa aaVar = C58975e.f156826a;
    }
}
