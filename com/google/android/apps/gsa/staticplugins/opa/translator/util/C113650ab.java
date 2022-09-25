package com.google.android.apps.gsa.staticplugins.opa.translator.util;

import android.view.animation.Animation;
import android.widget.ImageView;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.translator.util.ab */
/* compiled from: PG */
final class C113650ab implements Animation.AnimationListener {

    /* renamed from: a */
    final /* synthetic */ ImageView f314821a;

    /* renamed from: b */
    final /* synthetic */ InterpreterListeningBoxesView f314822b;

    public C113650ab(InterpreterListeningBoxesView interpreterListeningBoxesView, ImageView imageView) {
        this.f314822b = interpreterListeningBoxesView;
        this.f314821a = imageView;
    }

    public final void onAnimationEnd(Animation animation) {
        C58976aa aaVar = C58975e.f156826a;
        this.f314822b.mo100410b();
        this.f314821a.setAlpha(0.25f);
    }

    public final void onAnimationRepeat(Animation animation) {
        C58976aa aaVar = C58975e.f156826a;
    }

    public final void onAnimationStart(Animation animation) {
        C58976aa aaVar = C58975e.f156826a;
    }
}
