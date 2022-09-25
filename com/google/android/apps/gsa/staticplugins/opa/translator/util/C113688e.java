package com.google.android.apps.gsa.staticplugins.opa.translator.util;

import android.view.animation.Animation;
import com.google.android.googlequicksearchbox.R;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.translator.util.e */
/* compiled from: PG */
public final class C113688e implements Animation.AnimationListener {

    /* renamed from: a */
    final /* synthetic */ InterpreterInputButtonPlateView f314885a;

    public C113688e(InterpreterInputButtonPlateView interpreterInputButtonPlateView) {
        this.f314885a = interpreterInputButtonPlateView;
    }

    public final void onAnimationEnd(Animation animation) {
        C58976aa aaVar = C58975e.f156826a;
        if (this.f314885a.mo100378g().getVisibility() == 0 || this.f314885a.f314714d.mo100526d()) {
            this.f314885a.findViewById(R.id.auto_mic_plate).setVisibility(8);
            this.f314885a.findViewById(R.id.auto_mic_plate).setAlpha(1.0f);
            this.f314885a.findViewById(R.id.manual_mic_plate).setVisibility(8);
            this.f314885a.findViewById(R.id.manual_mic_plate).setAlpha(1.0f);
            this.f314885a.findViewById(R.id.keyboard_plate).setVisibility(8);
            this.f314885a.findViewById(R.id.keyboard_plate).setAlpha(1.0f);
        }
        this.f314885a.mo100386o();
    }

    public final void onAnimationRepeat(Animation animation) {
        C58976aa aaVar = C58975e.f156826a;
    }

    public final void onAnimationStart(Animation animation) {
        C58976aa aaVar = C58975e.f156826a;
        this.f314885a.mo100386o();
    }
}
