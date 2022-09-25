package com.google.android.apps.gsa.staticplugins.opa.translator.util;

import android.animation.ValueAnimator;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.assistant.p1614t.C19391a;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.translator.util.aq */
/* compiled from: PG */
public final class C113665aq implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a */
    final /* synthetic */ InterpreterMainTextView f314848a;

    /* renamed from: b */
    private boolean f314849b;

    public C113665aq(InterpreterMainTextView interpreterMainTextView) {
        this.f314848a = interpreterMainTextView;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        if (!this.f314849b && valueAnimator.getAnimatedFraction() >= 1.0f) {
            C59071e eVar = InterpreterMainTextView.f314755a;
            C58976aa aaVar = C58975e.f156826a;
            this.f314849b = true;
            InterpreterMainTextView interpreterMainTextView = this.f314848a;
            interpreterMainTextView.mo100431t(interpreterMainTextView.mo100426n(), C19391a.m36980a(this.f314848a.getContext(), R.attr.colorOnSurfaceVariant));
        }
    }
}
