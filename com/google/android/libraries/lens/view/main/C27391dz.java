package com.google.android.libraries.lens.view.main;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.material.progressindicator.CircularProgressIndicator;

/* renamed from: com.google.android.libraries.lens.view.main.dz */
/* compiled from: PG */
final class C27391dz extends AnimatorListenerAdapter {

    /* renamed from: a */
    final /* synthetic */ CircularProgressIndicator f75013a;

    public C27391dz(CircularProgressIndicator circularProgressIndicator) {
        this.f75013a = circularProgressIndicator;
    }

    public final void onAnimationEnd(Animator animator) {
        this.f75013a.mo48272e();
        this.f75013a.setAlpha(1.0f);
    }
}
