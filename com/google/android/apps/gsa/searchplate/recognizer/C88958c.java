package com.google.android.apps.gsa.searchplate.recognizer;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* renamed from: com.google.android.apps.gsa.searchplate.recognizer.c */
/* compiled from: PG */
final class C88958c extends AnimatorListenerAdapter {

    /* renamed from: a */
    final /* synthetic */ C88961f f241048a;

    public C88958c(C88961f fVar) {
        this.f241048a = fVar;
    }

    public final void onAnimationCancel(Animator animator) {
        this.f241048a.f241065m.end();
    }

    public final void onAnimationEnd(Animator animator) {
        C88961f fVar = this.f241048a;
        if (fVar.f241067o == 0.0f) {
            fVar.f241065m.end();
        }
    }
}
