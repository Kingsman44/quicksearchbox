package com.google.android.libraries.material.progress;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* renamed from: com.google.android.libraries.material.progress.f */
/* compiled from: PG */
final class C28580f extends AnimatorListenerAdapter {

    /* renamed from: a */
    final /* synthetic */ C28582h f77717a;

    public C28580f(C28582h hVar) {
        this.f77717a = hVar;
    }

    public final void onAnimationStart(Animator animator) {
        if (!this.f77717a.f77723a.isStarted()) {
            this.f77717a.f77723a.start();
        }
    }
}
