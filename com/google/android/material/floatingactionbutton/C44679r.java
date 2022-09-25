package com.google.android.material.floatingactionbutton;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* renamed from: com.google.android.material.floatingactionbutton.r */
/* compiled from: PG */
final class C44679r extends AnimatorListenerAdapter {

    /* renamed from: a */
    final /* synthetic */ C44658aa f116459a;

    /* renamed from: b */
    private boolean f116460b;

    public C44679r(C44658aa aaVar) {
        this.f116459a = aaVar;
    }

    public final void onAnimationCancel(Animator animator) {
        this.f116460b = true;
    }

    public final void onAnimationEnd(Animator animator) {
        C44658aa aaVar = this.f116459a;
        aaVar.f116395B = 0;
        aaVar.f116414v = null;
        if (!this.f116460b) {
            aaVar.f116396C.mo48051g(4, false);
        }
    }

    public final void onAnimationStart(Animator animator) {
        this.f116459a.f116396C.mo48051g(0, false);
        C44658aa aaVar = this.f116459a;
        aaVar.f116395B = 1;
        aaVar.f116414v = animator;
        this.f116460b = false;
    }
}
