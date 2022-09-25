package com.google.android.libraries.assistant.ampactions;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* renamed from: com.google.android.libraries.assistant.ampactions.j */
/* compiled from: PG */
final class C11037j extends AnimatorListenerAdapter {

    /* renamed from: a */
    final /* synthetic */ Runnable f36252a;

    public C11037j(Runnable runnable) {
        this.f36252a = runnable;
    }

    public final void onAnimationEnd(Animator animator) {
        super.onAnimationEnd(animator);
        ((C11035h) this.f36252a).f36250a.mo19502a();
    }
}
