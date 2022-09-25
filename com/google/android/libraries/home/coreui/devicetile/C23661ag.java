package com.google.android.libraries.home.coreui.devicetile;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.home.coreui.devicetile.ag */
/* compiled from: PG */
public final class C23661ag extends AnimatorListenerAdapter {

    /* renamed from: a */
    final /* synthetic */ C23674at f64720a;

    public C23661ag(C23674at atVar) {
        this.f64720a = atVar;
    }

    public final void onAnimationEnd(Animator animator) {
        C69664n.m101061g(animator, "animation");
        this.f64720a.f64743G = null;
    }
}
