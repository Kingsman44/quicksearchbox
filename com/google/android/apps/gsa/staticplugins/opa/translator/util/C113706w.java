package com.google.android.apps.gsa.staticplugins.opa.translator.util;

import android.view.animation.Animation;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.translator.util.w */
/* compiled from: PG */
final class C113706w implements Animation.AnimationListener {

    /* renamed from: a */
    final /* synthetic */ InterpreterKeyboardInputView f314906a;

    public C113706w(InterpreterKeyboardInputView interpreterKeyboardInputView) {
        this.f314906a = interpreterKeyboardInputView;
    }

    public final void onAnimationEnd(Animation animation) {
        C58976aa aaVar = C58975e.f156826a;
        this.f314906a.setVisibility(8);
        this.f314906a.setAlpha(1.0f);
    }

    public final void onAnimationRepeat(Animation animation) {
        C58976aa aaVar = C58975e.f156826a;
    }

    public final void onAnimationStart(Animation animation) {
        C58976aa aaVar = C58975e.f156826a;
    }
}
