package com.google.android.apps.gsa.staticplugins.opa.translator.util;

import android.view.View;
import android.view.animation.Animation;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.translator.util.z */
/* compiled from: PG */
final class C113709z implements Animation.AnimationListener {

    /* renamed from: a */
    final /* synthetic */ View f314909a;

    public C113709z(View view) {
        this.f314909a = view;
    }

    public final void onAnimationEnd(Animation animation) {
        C58976aa aaVar = C58975e.f156826a;
        this.f314909a.getId();
        this.f314909a.setVisibility(8);
    }

    public final void onAnimationRepeat(Animation animation) {
    }

    public final void onAnimationStart(Animation animation) {
    }
}
