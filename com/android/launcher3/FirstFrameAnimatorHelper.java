package com.android.launcher3;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.view.ViewTreeObserver;

/* compiled from: PG */
public final class FirstFrameAnimatorHelper extends AnimatorListenerAdapter implements ValueAnimator.AnimatorUpdateListener {
    public static ViewTreeObserver.OnDrawListener sGlobalDrawListener;
    static long sGlobalFrameCounter;
    public static boolean sVisible;
    private boolean mAdjustedSecondFrameTime;
    private boolean mHandlingOnAnimationUpdate;
    private long mStartFrame;
    private long mStartTime = -1;
    private final View mTarget;

    public FirstFrameAnimatorHelper(ValueAnimator valueAnimator, View view) {
        this.mTarget = view;
        valueAnimator.addUpdateListener(this);
    }

    public final void onAnimationStart(Animator animator) {
        ValueAnimator valueAnimator = (ValueAnimator) animator;
        valueAnimator.addUpdateListener(this);
        onAnimationUpdate(valueAnimator);
    }

    public final void onAnimationUpdate(final ValueAnimator valueAnimator) {
        long currentTimeMillis = System.currentTimeMillis();
        if (this.mStartTime == -1) {
            this.mStartFrame = sGlobalFrameCounter;
            this.mStartTime = currentTimeMillis;
        }
        long currentPlayTime = valueAnimator.getCurrentPlayTime();
        int compare = Float.compare(1.0f, valueAnimator.getAnimatedFraction());
        if (!this.mHandlingOnAnimationUpdate && sVisible && currentPlayTime < valueAnimator.getDuration() && compare != 0) {
            this.mHandlingOnAnimationUpdate = true;
            long j = sGlobalFrameCounter - this.mStartFrame;
            if (j == 0) {
                if (currentTimeMillis >= this.mStartTime + 1000 || currentPlayTime <= 0) {
                    j = 0;
                } else {
                    this.mTarget.getRootView().invalidate();
                    valueAnimator.setCurrentPlayTime(0);
                    this.mHandlingOnAnimationUpdate = false;
                }
            }
            if (j == 1) {
                long j2 = this.mStartTime;
                if (currentTimeMillis >= 1000 + j2 || this.mAdjustedSecondFrameTime || currentTimeMillis <= j2 + 16 || currentPlayTime <= 16) {
                    j = 1;
                } else {
                    valueAnimator.setCurrentPlayTime(16);
                    this.mAdjustedSecondFrameTime = true;
                    this.mHandlingOnAnimationUpdate = false;
                }
            }
            if (j > 1) {
                this.mTarget.post(new Runnable() {
                    public final void run() {
                        valueAnimator.removeUpdateListener(FirstFrameAnimatorHelper.this);
                    }
                });
            }
            this.mHandlingOnAnimationUpdate = false;
        }
    }

    public FirstFrameAnimatorHelper(ViewPropertyAnimator viewPropertyAnimator, View view) {
        this.mTarget = view;
        viewPropertyAnimator.setListener(this);
    }
}
