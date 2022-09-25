package com.airbnb.lottie.p245f;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

/* renamed from: com.airbnb.lottie.f.a */
/* compiled from: PG */
public class C4944a extends ValueAnimator {

    /* renamed from: a */
    public final Set f15708a = new CopyOnWriteArraySet();

    /* renamed from: b */
    private final Set f15709b = new CopyOnWriteArraySet();

    /* renamed from: a */
    public final void mo9860a() {
        for (Animator.AnimatorListener onAnimationCancel : this.f15708a) {
            onAnimationCancel.onAnimationCancel(this);
        }
    }

    public final void addListener(Animator.AnimatorListener animatorListener) {
        this.f15708a.add(animatorListener);
    }

    public final void addUpdateListener(ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        this.f15709b.add(animatorUpdateListener);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo9863b(boolean z) {
        for (Animator.AnimatorListener onAnimationEnd : this.f15708a) {
            onAnimationEnd.onAnimationEnd(this, z);
        }
    }

    /* renamed from: c */
    public final void mo9864c() {
        for (ValueAnimator.AnimatorUpdateListener onAnimationUpdate : this.f15709b) {
            onAnimationUpdate.onAnimationUpdate(this);
        }
    }

    public final long getStartDelay() {
        throw new UnsupportedOperationException("LottieAnimator does not support getStartDelay.");
    }

    public final void removeAllListeners() {
        this.f15708a.clear();
    }

    public final void removeAllUpdateListeners() {
        this.f15709b.clear();
    }

    public final void removeListener(Animator.AnimatorListener animatorListener) {
        this.f15708a.remove(animatorListener);
    }

    public final void removeUpdateListener(ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        this.f15709b.remove(animatorUpdateListener);
    }

    public final void setInterpolator(TimeInterpolator timeInterpolator) {
        throw new UnsupportedOperationException("LottieAnimator does not support setInterpolator.");
    }

    public final void setStartDelay(long j) {
        throw new UnsupportedOperationException("LottieAnimator does not support setStartDelay.");
    }

    public final ValueAnimator setDuration(long j) {
        throw new UnsupportedOperationException("LottieAnimator does not support setDuration.");
    }
}
