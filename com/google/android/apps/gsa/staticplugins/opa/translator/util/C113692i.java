package com.google.android.apps.gsa.staticplugins.opa.translator.util;

import android.view.animation.Animation;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.translator.util.i */
/* compiled from: PG */
final class C113692i implements Animation.AnimationListener {

    /* renamed from: a */
    final /* synthetic */ Animation.AnimationListener f314889a;

    /* renamed from: b */
    final /* synthetic */ C113693j f314890b;

    public C113692i(C113693j jVar, Animation.AnimationListener animationListener) {
        this.f314890b = jVar;
        this.f314889a = animationListener;
    }

    public final void onAnimationEnd(Animation animation) {
        if (this.f314890b.f314893c) {
            C58976aa aaVar = C58975e.f156826a;
        } else {
            this.f314889a.onAnimationEnd(animation);
        }
    }

    public final void onAnimationRepeat(Animation animation) {
        if (this.f314890b.f314893c) {
            C58976aa aaVar = C58975e.f156826a;
        } else {
            this.f314889a.onAnimationRepeat(animation);
        }
    }

    public final void onAnimationStart(Animation animation) {
        C113693j jVar = this.f314890b;
        if (jVar.f314893c) {
            C58976aa aaVar = C58975e.f156826a;
            return;
        }
        if (!jVar.f314892b) {
            C58976aa aaVar2 = C58975e.f156826a;
        }
        this.f314890b.f314892b = false;
        this.f314889a.onAnimationStart(animation);
    }
}
