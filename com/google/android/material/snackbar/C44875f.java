package com.google.android.material.snackbar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* renamed from: com.google.android.material.snackbar.f */
/* compiled from: PG */
final class C44875f extends AnimatorListenerAdapter {

    /* renamed from: a */
    final /* synthetic */ int f117122a;

    /* renamed from: b */
    final /* synthetic */ BaseTransientBottomBar f117123b;

    public C44875f(BaseTransientBottomBar baseTransientBottomBar, int i) {
        this.f117123b = baseTransientBottomBar;
        this.f117122a = i;
    }

    public final void onAnimationEnd(Animator animator) {
        this.f117123b.mo48341f(this.f117122a);
    }

    public final void onAnimationStart(Animator animator) {
        BaseTransientBottomBar baseTransientBottomBar = this.f117123b;
        SnackbarContentLayout snackbarContentLayout = baseTransientBottomBar.f117099t;
        int i = baseTransientBottomBar.f117083d;
        snackbarContentLayout.f117107a.setAlpha(1.0f);
        long j = (long) i;
        snackbarContentLayout.f117107a.animate().alpha(0.0f).setDuration(j).setInterpolator(snackbarContentLayout.f117109c).setStartDelay(0).start();
        if (snackbarContentLayout.f117108b.getVisibility() == 0) {
            snackbarContentLayout.f117108b.setAlpha(1.0f);
            snackbarContentLayout.f117108b.animate().alpha(0.0f).setDuration(j).setInterpolator(snackbarContentLayout.f117109c).setStartDelay(0).start();
        }
    }
}
