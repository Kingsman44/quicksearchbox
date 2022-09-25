package com.google.android.material.progressindicator;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import androidx.p198v.p199a.p200a.C4244c;

/* renamed from: com.google.android.material.progressindicator.ac */
/* compiled from: PG */
final class C44839ac extends AnimatorListenerAdapter {

    /* renamed from: a */
    final /* synthetic */ C44841ae f116980a;

    public C44839ac(C44841ae aeVar) {
        this.f116980a = aeVar;
    }

    public final void onAnimationEnd(Animator animator) {
        super.onAnimationEnd(animator);
        this.f116980a.mo48257a();
        C44841ae aeVar = this.f116980a;
        C4244c cVar = aeVar.f116989h;
        if (cVar != null) {
            cVar.mo8946b(aeVar.f117064j);
        }
    }
}
