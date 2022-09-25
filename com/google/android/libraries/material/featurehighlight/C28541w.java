package com.google.android.libraries.material.featurehighlight;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* renamed from: com.google.android.libraries.material.featurehighlight.w */
/* compiled from: PG */
final class C28541w extends AnimatorListenerAdapter {

    /* renamed from: a */
    final /* synthetic */ C28512ac f77575a;

    public C28541w(C28512ac acVar) {
        this.f77575a = acVar;
    }

    public final void onAnimationEnd(Animator animator) {
        C28512ac acVar = this.f77575a;
        acVar.f77424q = null;
        if (!acVar.f77427t) {
            acVar.mo34015m(acVar.mo33998a());
        }
    }
}
