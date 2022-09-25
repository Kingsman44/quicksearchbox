package com.google.android.apps.search.googleapp.googleappbrowser.feature.p10285c;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* renamed from: com.google.android.apps.search.googleapp.googleappbrowser.feature.c.f */
/* compiled from: PG */
final class C135731f extends AnimatorListenerAdapter {

    /* renamed from: a */
    final /* synthetic */ Runnable f369704a;

    public C135731f(Runnable runnable) {
        this.f369704a = runnable;
    }

    public final void onAnimationEnd(Animator animator) {
        this.f369704a.run();
    }
}
