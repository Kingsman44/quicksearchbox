package com.google.android.libraries.material.featurehighlight;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* renamed from: com.google.android.libraries.material.featurehighlight.v */
/* compiled from: PG */
final class C28540v extends AnimatorListenerAdapter {

    /* renamed from: a */
    final /* synthetic */ C28512ac f77574a;

    public C28540v(C28512ac acVar) {
        this.f77574a = acVar;
    }

    public final void onAnimationEnd(Animator animator) {
        C28512ac acVar = this.f77574a;
        acVar.f77424q = null;
        if (!acVar.f77427t && !acVar.f77433z) {
            acVar.mo34015m(acVar.mo33998a());
        }
    }
}
