package com.google.android.material.progressindicator;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import androidx.p198v.p199a.p200a.C4244c;
import java.util.List;

/* renamed from: com.google.android.material.progressindicator.r */
/* compiled from: PG */
final class C44860r extends AnimatorListenerAdapter {

    /* renamed from: a */
    final /* synthetic */ C44862t f117051a;

    public C44860r(C44862t tVar) {
        this.f117051a = tVar;
    }

    public final void onAnimationEnd(Animator animator) {
        super.onAnimationEnd(animator);
        C44860r.super.setVisible(false, false);
        C44862t tVar = this.f117051a;
        List<C4244c> list = tVar.f117057f;
        if (list != null && !tVar.f117058g) {
            for (C4244c b : list) {
                b.mo8946b(tVar);
            }
        }
    }
}
