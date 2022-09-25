package com.google.android.libraries.material.featurehighlight;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.widget.TextView;

/* renamed from: com.google.android.libraries.material.featurehighlight.o */
/* compiled from: PG */
final class C28533o extends AnimatorListenerAdapter {

    /* renamed from: a */
    final /* synthetic */ Runnable f77565a;

    /* renamed from: b */
    final /* synthetic */ C28512ac f77566b;

    public C28533o(C28512ac acVar, Runnable runnable) {
        this.f77566b = acVar;
        this.f77565a = runnable;
    }

    public final void onAnimationEnd(Animator animator) {
        C28512ac acVar = this.f77566b;
        acVar.f77427t = false;
        if (acVar.mo34017o()) {
            C28512ac acVar2 = this.f77566b;
            ((TextView) acVar2.f77415h).setTextColor(acVar2.f77417j);
        }
        C28512ac acVar3 = this.f77566b;
        if (acVar3.mo34024p()) {
            acVar3.f77415h.setDrawingCacheEnabled(acVar3.f77422o);
        }
        this.f77566b.setVisibility(8);
        this.f77566b.f77424q = null;
        Runnable runnable = this.f77565a;
        if (runnable != null) {
            runnable.run();
        }
    }

    public final void onAnimationStart(Animator animator) {
        this.f77566b.f77427t = true;
    }
}
