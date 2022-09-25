package com.google.android.material.progressindicator;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import androidx.p198v.p199a.p200a.C4244c;
import java.util.List;

/* renamed from: com.google.android.material.progressindicator.q */
/* compiled from: PG */
final class C44859q extends AnimatorListenerAdapter {

    /* renamed from: a */
    final /* synthetic */ C44862t f117050a;

    public C44859q(C44862t tVar) {
        this.f117050a = tVar;
    }

    public final void onAnimationStart(Animator animator) {
        super.onAnimationStart(animator);
        C44862t tVar = this.f117050a;
        List<C4244c> list = tVar.f117057f;
        if (list != null && !tVar.f117058g) {
            for (C4244c c : list) {
                c.mo8947c(tVar);
            }
        }
    }
}
