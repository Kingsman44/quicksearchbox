package com.google.android.apps.gsa.staticplugins.opa.valyrian;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.ViewGroup;
import com.google.android.apps.gsa.staticplugins.opa.valyrian.p8598c.C113987f;
import com.google.common.base.C58833ax;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.valyrian.di */
/* compiled from: PG */
final class C114043di extends AnimatorListenerAdapter {

    /* renamed from: a */
    final /* synthetic */ C114071eg f315723a;

    public C114043di(C114071eg egVar) {
        this.f315723a = egVar;
    }

    public final void onAnimationEnd(Animator animator) {
        int i;
        C114071eg egVar = this.f315723a;
        egVar.f315892bb = C58833ax.m90834k(Integer.valueOf(egVar.f315985u.getLayoutParams().height));
        ViewGroup.LayoutParams layoutParams = this.f315723a.f315985u.getLayoutParams();
        C114071eg egVar2 = this.f315723a;
        if (C113987f.m188690a(egVar2.f315982r)) {
            i = egVar2.f315981q.getResources().getDimensionPixelSize(C114071eg.m188842aM(egVar2.f315822aF));
        } else {
            i = egVar2.f315864av.mo96647T();
        }
        layoutParams.height = i;
    }
}
