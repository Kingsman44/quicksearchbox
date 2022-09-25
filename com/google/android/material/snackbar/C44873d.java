package com.google.android.material.snackbar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* renamed from: com.google.android.material.snackbar.d */
/* compiled from: PG */
final class C44873d extends AnimatorListenerAdapter {

    /* renamed from: a */
    final /* synthetic */ BaseTransientBottomBar f117120a;

    public C44873d(BaseTransientBottomBar baseTransientBottomBar) {
        this.f117120a = baseTransientBottomBar;
    }

    public final void onAnimationEnd(Animator animator) {
        this.f117120a.mo48342g();
    }

    public final void onAnimationStart(Animator animator) {
        BaseTransientBottomBar baseTransientBottomBar = this.f117120a;
        SnackbarContentLayout snackbarContentLayout = baseTransientBottomBar.f117099t;
        int i = baseTransientBottomBar.f117084e;
        int i2 = baseTransientBottomBar.f117082c;
        snackbarContentLayout.f117107a.setAlpha(0.0f);
        long j = (long) i2;
        long j2 = (long) (i - i2);
        snackbarContentLayout.f117107a.animate().alpha(1.0f).setDuration(j).setInterpolator(snackbarContentLayout.f117109c).setStartDelay(j2).start();
        if (snackbarContentLayout.f117108b.getVisibility() == 0) {
            snackbarContentLayout.f117108b.setAlpha(0.0f);
            snackbarContentLayout.f117108b.animate().alpha(1.0f).setDuration(j).setInterpolator(snackbarContentLayout.f117109c).setStartDelay(j2).start();
        }
    }
}
