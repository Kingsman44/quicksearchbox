package com.android.launcher3.util;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.graphics.Outline;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewOutlineProvider;
import com.android.launcher3.Utilities;

/* compiled from: PG */
public abstract class RevealOutlineAnimation extends ViewOutlineProvider {
    protected final Rect mOutline = new Rect();
    protected float mOutlineRadius;

    public final ValueAnimator createRevealAnimator(final View view, boolean z) {
        ValueAnimator ofFloat = z ? ValueAnimator.ofFloat(new float[]{1.0f, 0.0f}) : ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
        final float elevation = view.getElevation();
        ofFloat.addListener(new AnimatorListenerAdapter() {
            private boolean mWasCanceled = false;

            public final void onAnimationCancel(Animator animator) {
                this.mWasCanceled = true;
            }

            public final void onAnimationEnd(Animator animator) {
                if (!this.mWasCanceled) {
                    view.setOutlineProvider(ViewOutlineProvider.BACKGROUND);
                    view.setClipToOutline(false);
                    if (RevealOutlineAnimation.this.shouldRemoveElevationDuringAnimation()) {
                        view.setTranslationZ(0.0f);
                    }
                }
            }

            public final void onAnimationStart(Animator animator) {
                view.setOutlineProvider(RevealOutlineAnimation.this);
                view.setClipToOutline(true);
                if (RevealOutlineAnimation.this.shouldRemoveElevationDuringAnimation()) {
                    view.setTranslationZ(-elevation);
                }
            }
        });
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                RevealOutlineAnimation.this.setProgress(((Float) valueAnimator.getAnimatedValue()).floatValue());
                view.invalidateOutline();
                if (!Utilities.ATLEAST_LOLLIPOP_MR1) {
                    view.invalidate();
                }
            }
        });
        return ofFloat;
    }

    public final void getOutline(View view, Outline outline) {
        outline.setRoundRect(this.mOutline, this.mOutlineRadius);
    }

    public abstract void setProgress(float f);

    public abstract boolean shouldRemoveElevationDuringAnimation();
}
