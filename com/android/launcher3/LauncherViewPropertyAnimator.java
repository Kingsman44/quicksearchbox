package com.android.launcher3;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.view.View;
import android.view.ViewPropertyAnimator;
import java.util.ArrayList;
import java.util.EnumSet;

/* compiled from: PG */
public final class LauncherViewPropertyAnimator extends Animator implements Animator.AnimatorListener {
    float mAlpha;
    long mDuration;
    FirstFrameAnimatorHelper mFirstFrameHelper;
    TimeInterpolator mInterpolator;
    final ArrayList mListeners = new ArrayList();
    public final EnumSet mPropertiesToSet = EnumSet.noneOf(Properties.class);
    boolean mRunning = false;
    float mScaleX;
    float mScaleY;
    long mStartDelay;
    final View mTarget;
    public float mTranslationX;
    float mTranslationY;
    ViewPropertyAnimator mViewPropertyAnimator;

    /* compiled from: PG */
    public enum Properties {
        TRANSLATION_X,
        TRANSLATION_Y,
        SCALE_X,
        SCALE_Y,
        ROTATION_Y,
        ALPHA,
        START_DELAY,
        DURATION,
        INTERPOLATOR,
        WITH_LAYER
    }

    public LauncherViewPropertyAnimator(View view) {
        this.mTarget = view;
    }

    public final void addListener(Animator.AnimatorListener animatorListener) {
        this.mListeners.add(animatorListener);
    }

    public final void alpha$ar$ds$936767f9_0(float f) {
        this.mPropertiesToSet.add(Properties.ALPHA);
        this.mAlpha = f;
    }

    public final void cancel() {
        ViewPropertyAnimator viewPropertyAnimator = this.mViewPropertyAnimator;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
    }

    public final Animator clone() {
        throw new RuntimeException("Not implemented");
    }

    public final void end() {
    }

    public final long getDuration() {
        return this.mDuration;
    }

    public final ArrayList getListeners() {
        return this.mListeners;
    }

    public final long getStartDelay() {
        return this.mStartDelay;
    }

    public final boolean isRunning() {
        return this.mRunning;
    }

    public final boolean isStarted() {
        return this.mViewPropertyAnimator != null;
    }

    public final void onAnimationCancel(Animator animator) {
        for (int i = 0; i < this.mListeners.size(); i++) {
            ((Animator.AnimatorListener) this.mListeners.get(i)).onAnimationCancel(this);
        }
        this.mRunning = false;
    }

    public final void onAnimationEnd(Animator animator) {
        for (int i = 0; i < this.mListeners.size(); i++) {
            ((Animator.AnimatorListener) this.mListeners.get(i)).onAnimationEnd(this);
        }
        this.mRunning = false;
    }

    public final void onAnimationRepeat(Animator animator) {
        for (int i = 0; i < this.mListeners.size(); i++) {
            ((Animator.AnimatorListener) this.mListeners.get(i)).onAnimationRepeat(this);
        }
    }

    public final void onAnimationStart(Animator animator) {
        this.mFirstFrameHelper.onAnimationStart(animator);
        for (int i = 0; i < this.mListeners.size(); i++) {
            ((Animator.AnimatorListener) this.mListeners.get(i)).onAnimationStart(this);
        }
        this.mRunning = true;
    }

    public final void removeAllListeners() {
        this.mListeners.clear();
    }

    public final void removeListener(Animator.AnimatorListener animatorListener) {
        this.mListeners.remove(animatorListener);
    }

    public final void scaleX$ar$ds(float f) {
        this.mPropertiesToSet.add(Properties.SCALE_X);
        this.mScaleX = f;
    }

    public final void scaleY$ar$ds(float f) {
        this.mPropertiesToSet.add(Properties.SCALE_Y);
        this.mScaleY = f;
    }

    public final Animator setDuration(long j) {
        this.mPropertiesToSet.add(Properties.DURATION);
        this.mDuration = j;
        return this;
    }

    public final void setInterpolator(TimeInterpolator timeInterpolator) {
        this.mPropertiesToSet.add(Properties.INTERPOLATOR);
        this.mInterpolator = timeInterpolator;
    }

    public final void setStartDelay(long j) {
        this.mPropertiesToSet.add(Properties.START_DELAY);
        this.mStartDelay = j;
    }

    public final void setTarget(Object obj) {
        throw new RuntimeException("Not implemented");
    }

    public final void setupEndValues() {
    }

    public final void setupStartValues() {
    }

    public final void start() {
        this.mViewPropertyAnimator = this.mTarget.animate();
        this.mFirstFrameHelper = new FirstFrameAnimatorHelper(this.mViewPropertyAnimator, this.mTarget);
        if (this.mPropertiesToSet.contains(Properties.TRANSLATION_X)) {
            this.mViewPropertyAnimator.translationX(this.mTranslationX);
        }
        if (this.mPropertiesToSet.contains(Properties.TRANSLATION_Y)) {
            this.mViewPropertyAnimator.translationY(this.mTranslationY);
        }
        if (this.mPropertiesToSet.contains(Properties.SCALE_X)) {
            this.mViewPropertyAnimator.scaleX(this.mScaleX);
        }
        if (this.mPropertiesToSet.contains(Properties.ROTATION_Y)) {
            this.mViewPropertyAnimator.rotationY(0.0f);
        }
        if (this.mPropertiesToSet.contains(Properties.SCALE_Y)) {
            this.mViewPropertyAnimator.scaleY(this.mScaleY);
        }
        if (this.mPropertiesToSet.contains(Properties.ALPHA)) {
            this.mViewPropertyAnimator.alpha(this.mAlpha);
        }
        if (this.mPropertiesToSet.contains(Properties.START_DELAY)) {
            this.mViewPropertyAnimator.setStartDelay(this.mStartDelay);
        }
        if (this.mPropertiesToSet.contains(Properties.DURATION)) {
            this.mViewPropertyAnimator.setDuration(this.mDuration);
        }
        if (this.mPropertiesToSet.contains(Properties.INTERPOLATOR)) {
            this.mViewPropertyAnimator.setInterpolator(this.mInterpolator);
        }
        if (this.mPropertiesToSet.contains(Properties.WITH_LAYER)) {
            this.mViewPropertyAnimator.withLayer();
        }
        this.mViewPropertyAnimator.setListener(this);
        this.mViewPropertyAnimator.start();
        this.mListeners.add(LauncherAnimUtils.sEndAnimListener);
    }

    public final void translationY$ar$ds$a88e89b9_0(float f) {
        this.mPropertiesToSet.add(Properties.TRANSLATION_Y);
        this.mTranslationY = f;
    }
}
