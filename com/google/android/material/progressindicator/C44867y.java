package com.google.android.material.progressindicator;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* renamed from: com.google.android.material.progressindicator.y */
/* compiled from: PG */
final class C44867y extends AnimatorListenerAdapter {

    /* renamed from: a */
    final /* synthetic */ C44837aa f117072a;

    public C44867y(C44837aa aaVar) {
        this.f117072a = aaVar;
    }

    public final void onAnimationRepeat(Animator animator) {
        super.onAnimationRepeat(animator);
        C44837aa aaVar = this.f117072a;
        aaVar.f116975c = (aaVar.f116975c + 1) % aaVar.f116974b.f117017c.length;
        aaVar.f116976d = true;
    }
}
