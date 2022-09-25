package com.google.android.libraries.home.coreui.devicetile;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import p5462h.p5473f.p5474a.C69615a;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.home.coreui.devicetile.aj */
/* compiled from: PG */
public final class C23664aj extends AnimatorListenerAdapter {

    /* renamed from: a */
    final /* synthetic */ C69615a f64727a;

    public C23664aj(C69615a aVar) {
        this.f64727a = aVar;
    }

    public final void onAnimationEnd(Animator animator) {
        C69664n.m101061g(animator, "animation");
        this.f64727a.mo5672a();
    }
}
