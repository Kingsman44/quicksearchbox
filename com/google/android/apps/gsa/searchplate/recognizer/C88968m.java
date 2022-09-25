package com.google.android.apps.gsa.searchplate.recognizer;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* renamed from: com.google.android.apps.gsa.searchplate.recognizer.m */
/* compiled from: PG */
final class C88968m extends AnimatorListenerAdapter {

    /* renamed from: a */
    final /* synthetic */ C88970o f241085a;

    public C88968m(C88970o oVar) {
        this.f241085a = oVar;
    }

    public final void onAnimationEnd(Animator animator) {
        C88970o oVar = this.f241085a;
        if (oVar.f241089b == 0.0f) {
            oVar.f241098k.end();
        }
    }
}
