package com.android.launcher3;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;

/* compiled from: PG */
public final class InterruptibleInOutAnimator {
    public final ValueAnimator mAnimator;
    private boolean mFirstRun = true;
    private final long mOriginalDuration;
    private final float mOriginalToValue;
    public Object mTag = null;

    public InterruptibleInOutAnimator(long j, float f) {
        ValueAnimator duration = LauncherAnimUtils.ofFloat$ar$ds(0.0f, f).setDuration(j);
        this.mAnimator = duration;
        this.mOriginalDuration = j;
        this.mOriginalToValue = f;
        duration.addListener(new AnimatorListenerAdapter() {
            public final void onAnimationEnd(Animator animator) {
            }
        });
    }

    public final void animate(int i) {
        long currentPlayTime = this.mAnimator.getCurrentPlayTime();
        float f = 0.0f;
        float f2 = i == 1 ? this.mOriginalToValue : 0.0f;
        if (!this.mFirstRun) {
            f = ((Float) this.mAnimator.getAnimatedValue()).floatValue();
        }
        this.mAnimator.cancel();
        long j = this.mOriginalDuration;
        this.mAnimator.setDuration(Math.max(0, Math.min(j - currentPlayTime, j)));
        this.mAnimator.setFloatValues(new float[]{f, f2});
        this.mAnimator.start();
        this.mFirstRun = false;
    }
}
