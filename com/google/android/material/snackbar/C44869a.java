package com.google.android.material.snackbar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* renamed from: com.google.android.material.snackbar.a */
/* compiled from: PG */
final class C44869a extends AnimatorListenerAdapter {

    /* renamed from: a */
    final /* synthetic */ int f117111a;

    /* renamed from: b */
    final /* synthetic */ BaseTransientBottomBar f117112b;

    public C44869a(BaseTransientBottomBar baseTransientBottomBar, int i) {
        this.f117112b = baseTransientBottomBar;
        this.f117111a = i;
    }

    public final void onAnimationEnd(Animator animator) {
        this.f117112b.mo48341f(this.f117111a);
    }
}
