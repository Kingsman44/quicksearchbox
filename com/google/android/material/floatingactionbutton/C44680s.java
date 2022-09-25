package com.google.android.material.floatingactionbutton;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* renamed from: com.google.android.material.floatingactionbutton.s */
/* compiled from: PG */
final class C44680s extends AnimatorListenerAdapter {

    /* renamed from: a */
    final /* synthetic */ C44658aa f116461a;

    public C44680s(C44658aa aaVar) {
        this.f116461a = aaVar;
    }

    public final void onAnimationEnd(Animator animator) {
        C44658aa aaVar = this.f116461a;
        aaVar.f116395B = 0;
        aaVar.f116414v = null;
    }

    public final void onAnimationStart(Animator animator) {
        this.f116461a.f116396C.mo48051g(0, false);
        C44658aa aaVar = this.f116461a;
        aaVar.f116395B = 2;
        aaVar.f116414v = animator;
    }
}
