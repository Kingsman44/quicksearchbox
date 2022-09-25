package com.android.launcher3;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.view.View;

/* compiled from: PG */
final class AlphaUpdateListener extends AnimatorListenerAdapter implements ValueAnimator.AnimatorUpdateListener {
    private final boolean mAccessibilityEnabled;
    private final View mView;

    public AlphaUpdateListener(View view, boolean z) {
        this.mView = view;
        this.mAccessibilityEnabled = z;
    }

    public static void updateVisibility(View view, boolean z) {
        int i = true != z ? 4 : 8;
        if (view.getAlpha() < 0.01f && view.getVisibility() != i) {
            view.setVisibility(i);
        } else if (view.getAlpha() > 0.01f && view.getVisibility() != 0) {
            view.setVisibility(0);
        }
    }

    public final void onAnimationEnd(Animator animator) {
        updateVisibility(this.mView, this.mAccessibilityEnabled);
    }

    public final void onAnimationStart(Animator animator) {
        this.mView.setVisibility(0);
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        updateVisibility(this.mView, this.mAccessibilityEnabled);
    }
}
