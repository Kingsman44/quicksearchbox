package com.android.launcher3.util;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.view.animation.AnimationUtils;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;

/* compiled from: PG */
public final class LauncherEdgeEffect {
    private static final float COS = ((float) Math.cos(0.5235987755982988d));
    private static final float SIN = ((float) Math.sin(0.5235987755982988d));
    private float mBaseGlowScale;
    private final Rect mBounds = new Rect();
    private float mDisplacement;
    private float mDuration;
    private float mGlowAlpha;
    private float mGlowAlphaFinish;
    private float mGlowAlphaStart;
    private float mGlowScaleY;
    private float mGlowScaleYFinish;
    private float mGlowScaleYStart;
    private final Interpolator mInterpolator;
    public final Paint mPaint;
    private float mPullDistance;
    private float mRadius;
    private long mStartTime;
    private int mState = 0;
    private float mTargetDisplacement;

    public LauncherEdgeEffect() {
        Paint paint = new Paint();
        this.mPaint = paint;
        this.mDisplacement = 0.5f;
        this.mTargetDisplacement = 0.5f;
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.FILL);
        this.mInterpolator = new DecelerateInterpolator();
    }

    public final boolean draw(Canvas canvas) {
        boolean z;
        float min = Math.min(((float) (AnimationUtils.currentAnimationTimeMillis() - this.mStartTime)) / this.mDuration, 1.0f);
        float interpolation = this.mInterpolator.getInterpolation(min);
        float f = this.mGlowAlphaStart;
        this.mGlowAlpha = f + ((this.mGlowAlphaFinish - f) * interpolation);
        float f2 = this.mGlowScaleYStart;
        this.mGlowScaleY = f2 + ((this.mGlowScaleYFinish - f2) * interpolation);
        this.mDisplacement = (this.mDisplacement + this.mTargetDisplacement) / 2.0f;
        int i = 3;
        if (min >= 0.999f) {
            int i2 = this.mState;
            if (i2 == 1) {
                this.mState = 4;
                this.mStartTime = AnimationUtils.currentAnimationTimeMillis();
                this.mDuration = 2000.0f;
                this.mGlowAlphaStart = this.mGlowAlpha;
                this.mGlowScaleYStart = this.mGlowScaleY;
                this.mGlowAlphaFinish = 0.0f;
                this.mGlowScaleYFinish = 0.0f;
            } else if (i2 == 2) {
                this.mState = 3;
                this.mStartTime = AnimationUtils.currentAnimationTimeMillis();
                this.mDuration = 600.0f;
                this.mGlowAlphaStart = this.mGlowAlpha;
                this.mGlowScaleYStart = this.mGlowScaleY;
                this.mGlowAlphaFinish = 0.0f;
                this.mGlowScaleYFinish = 0.0f;
            } else if (i2 == 3) {
                this.mState = 0;
            } else if (i2 == 4) {
                this.mState = 3;
            }
        }
        float centerX = (float) this.mBounds.centerX();
        int height = this.mBounds.height();
        float f3 = this.mRadius;
        canvas.scale(1.0f, Math.min(this.mGlowScaleY, 1.0f) * this.mBaseGlowScale, centerX, 0.0f);
        float max = Math.max(0.0f, Math.min(this.mDisplacement, 1.0f));
        int width = this.mBounds.width();
        this.mPaint.setAlpha((int) (this.mGlowAlpha * 255.0f));
        canvas.drawCircle(centerX + ((((float) width) * (max - 8.0f)) / 2.0f), ((float) height) - f3, this.mRadius, this.mPaint);
        int i3 = this.mState;
        if (i3 != 3) {
            i = i3;
        } else if (this.mGlowScaleY == 0.0f) {
            this.mState = 0;
            z = true;
            i = 0;
            return i == 0 || z;
        }
        z = false;
        if (i == 0) {
        }
    }

    public final boolean isFinished() {
        return this.mState == 0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x001c, code lost:
        if (r3 != 1) goto L_0x001e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onPull$ar$ds$b5e92ffc_0(float r8) {
        /*
            r7 = this;
            long r0 = android.view.animation.AnimationUtils.currentAnimationTimeMillis()
            r2 = 1056964608(0x3f000000, float:0.5)
            r7.mTargetDisplacement = r2
            int r3 = r7.mState
            r4 = 4
            r5 = 1
            r6 = 0
            if (r3 != r4) goto L_0x001c
            long r3 = r7.mStartTime
            long r3 = r0 - r3
            float r3 = (float) r3
            float r4 = r7.mDuration
            int r3 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r3 < 0) goto L_0x001b
            goto L_0x001e
        L_0x001b:
            return
        L_0x001c:
            if (r3 == r5) goto L_0x0026
        L_0x001e:
            float r3 = r7.mGlowScaleY
            float r3 = java.lang.Math.max(r6, r3)
            r7.mGlowScaleY = r3
        L_0x0026:
            r7.mState = r5
            r7.mStartTime = r0
            r0 = 1126629376(0x43270000, float:167.0)
            r7.mDuration = r0
            float r0 = r7.mPullDistance
            float r0 = r0 + r8
            r7.mPullDistance = r0
            float r8 = java.lang.Math.abs(r8)
            float r0 = r7.mGlowAlpha
            r1 = 1061997773(0x3f4ccccd, float:0.8)
            float r8 = r8 * r1
            float r0 = r0 + r8
            float r8 = java.lang.Math.min(r2, r0)
            r7.mGlowAlphaStart = r8
            r7.mGlowAlpha = r8
            float r8 = r7.mPullDistance
            int r0 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r0 != 0) goto L_0x0052
            r7.mGlowScaleYStart = r6
            r7.mGlowScaleY = r6
            goto L_0x0080
        L_0x0052:
            float r8 = java.lang.Math.abs(r8)
            android.graphics.Rect r0 = r7.mBounds
            int r0 = r0.height()
            float r0 = (float) r0
            float r8 = r8 * r0
            double r0 = (double) r8
            double r0 = java.lang.Math.sqrt(r0)
            r2 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            double r0 = r2 / r0
            double r2 = r2 - r0
            r0 = -4624296097384025293(0xbfd3333333333333, double:-0.3)
            double r2 = r2 + r0
            r0 = 0
            double r0 = java.lang.Math.max(r0, r2)
            r2 = 4604480259023595110(0x3fe6666666666666, double:0.7)
            double r0 = r0 / r2
            float r6 = (float) r0
            r7.mGlowScaleYStart = r6
            r7.mGlowScaleY = r6
        L_0x0080:
            float r8 = r7.mGlowAlpha
            r7.mGlowAlphaFinish = r8
            r7.mGlowScaleYFinish = r6
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.launcher3.util.LauncherEdgeEffect.onPull$ar$ds$b5e92ffc_0(float):void");
    }

    public final void onRelease() {
        this.mPullDistance = 0.0f;
        int i = this.mState;
        if (i == 1 || i == 4) {
            this.mState = 3;
            this.mGlowAlphaStart = this.mGlowAlpha;
            this.mGlowScaleYStart = this.mGlowScaleY;
            this.mGlowAlphaFinish = 0.0f;
            this.mGlowScaleYFinish = 0.0f;
            this.mStartTime = AnimationUtils.currentAnimationTimeMillis();
            this.mDuration = 600.0f;
        }
    }

    public final void setSize(int i, int i2) {
        float f = SIN;
        float f2 = (((float) i) * 0.5f) / f;
        float f3 = COS;
        float f4 = f2 - (f3 * f2);
        float f5 = (float) i2;
        float f6 = (0.75f * f5) / f;
        float f7 = f6 - (f3 * f6);
        this.mRadius = f2;
        float f8 = 1.0f;
        if (f4 > 0.0f) {
            f8 = Math.min(f7 / f4, 1.0f);
        }
        this.mBaseGlowScale = f8;
        Rect rect = this.mBounds;
        rect.set(rect.left, this.mBounds.top, i, (int) Math.min(f5, f4));
    }
}
