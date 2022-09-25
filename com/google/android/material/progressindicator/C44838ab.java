package com.google.android.material.progressindicator;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* renamed from: com.google.android.material.progressindicator.ab */
/* compiled from: PG */
final class C44838ab extends AnimatorListenerAdapter {

    /* renamed from: a */
    final /* synthetic */ C44841ae f116979a;

    public C44838ab(C44841ae aeVar) {
        this.f116979a = aeVar;
    }

    public final void onAnimationRepeat(Animator animator) {
        super.onAnimationRepeat(animator);
        C44841ae aeVar = this.f116979a;
        aeVar.f116986e = (aeVar.f116986e + 1) % aeVar.f116985d.f117017c.length;
        aeVar.f116987f = true;
    }
}
