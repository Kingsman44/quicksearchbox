package com.google.android.apps.gsa.assistant.settings.p5781hq;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* renamed from: com.google.android.apps.gsa.assistant.settings.hq.d */
/* compiled from: PG */
final class C73714d extends AnimatorListenerAdapter {

    /* renamed from: a */
    final /* synthetic */ C73715e f194960a;

    public C73714d(C73715e eVar) {
        this.f194960a = eVar;
    }

    public final void onAnimationEnd(Animator animator) {
        this.f194960a.f194962a.setVisibility(8);
        this.f194960a.f194962a.setAlpha(1.0f);
    }

    public final void onAnimationStart(Animator animator) {
        this.f194960a.f194963b.setVisibility(0);
    }
}
