package com.google.android.apps.gsa.staticplugins.opa.tapas.p8589ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.apps.gsa.staticplugins.opa.p8313ay.C107658ar;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.ui.bi */
/* compiled from: PG */
final class C113554bi extends AnimatorListenerAdapter {

    /* renamed from: a */
    final /* synthetic */ C113558bm f314367a;

    public C113554bi(C113558bm bmVar) {
        this.f314367a = bmVar;
    }

    public final void onAnimationEnd(Animator animator) {
        C107658ar arVar;
        if (this.f314367a.f314414d.getAlpha() == 1.0f && (arVar = this.f314367a.f314427q) != null) {
            arVar.mo96204f();
        }
    }
}
