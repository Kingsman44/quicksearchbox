package com.google.android.libraries.lens.view.p2066aj;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* renamed from: com.google.android.libraries.lens.view.aj.c */
/* compiled from: PG */
final class C25191c extends AnimatorListenerAdapter {

    /* renamed from: a */
    final /* synthetic */ C25192d f68610a;

    public C25191c(C25192d dVar) {
        this.f68610a = dVar;
    }

    public final void onAnimationEnd(Animator animator) {
        this.f68610a.mo30337c();
    }

    public final void onAnimationRepeat(Animator animator) {
        C25192d dVar = this.f68610a;
        if (!dVar.f68614d) {
            dVar.f68614d = true;
            dVar.f68616f.f15138d.f15342b.setRepeatCount(0);
            int i = (dVar.f68615e + 3) & 3;
            int[] iArr = C25192d.f68612b;
            dVar.mo30335a(iArr[i], iArr[i + 1] - 1);
            return;
        }
        int[] iArr2 = C25192d.f68611a;
        int i2 = dVar.f68615e;
        dVar.mo30335a(iArr2[i2], iArr2[i2 + 1] - 1);
        C25192d dVar2 = this.f68610a;
        dVar2.f68615e = (dVar2.f68615e + 1) & 3;
    }
}
