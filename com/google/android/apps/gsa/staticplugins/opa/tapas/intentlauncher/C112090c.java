package com.google.android.apps.gsa.staticplugins.opa.tapas.intentlauncher;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.intentlauncher.c */
/* compiled from: PG */
final class C112090c extends AnimatorListenerAdapter {

    /* renamed from: a */
    final /* synthetic */ View f311295a;

    /* renamed from: b */
    final /* synthetic */ C112101i f311296b;

    public C112090c(C112101i iVar, View view) {
        this.f311296b = iVar;
        this.f311295a = view;
    }

    public final void onAnimationCancel(Animator animator) {
        C58976aa aaVar = C58975e.f156826a;
        this.f311295a.setAlpha(1.0f);
        this.f311296b.mo99395b();
    }

    public final void onAnimationEnd(Animator animator) {
        C58976aa aaVar = C58975e.f156826a;
        this.f311296b.mo99395b();
    }

    public final void onAnimationStart(Animator animator) {
        C58976aa aaVar = C58975e.f156826a;
        this.f311295a.setAlpha(0.0f);
    }
}
