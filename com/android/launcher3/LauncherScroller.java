package com.android.launcher3;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.view.ViewConfiguration;
import android.view.animation.AnimationUtils;

/* compiled from: PG */
public final class LauncherScroller {
    public static float DECELERATION_RATE = ((float) (Math.log(0.78d) / Math.log(0.9d)));
    public static final float[] SPLINE_POSITION = new float[101];
    private static final float[] SPLINE_TIME = new float[101];
    private static float sViscousFluidNormalize;
    private static float sViscousFluidScale = 8.0f;
    public float mCurrVelocity;
    public int mCurrX;
    public int mCurrY;
    public final float mDeceleration;
    public float mDeltaX;
    public int mDistance;
    public int mDuration;
    public float mDurationReciprocal;
    public int mFinalX;
    public int mFinalY;
    public boolean mFinished;
    public final float mFlingFriction;
    public final boolean mFlywheel;
    public TimeInterpolator mInterpolator;
    public int mMaxX;
    public int mMinX;
    public int mMode;
    public final float mPhysicalCoeff;
    private final float mPpi;
    public long mStartTime;
    public int mStartX;
    public int mStartY;
    public float mVelocity;

    static {
        float f;
        float f2;
        float f3;
        float f4;
        float f5;
        float f6;
        float f7;
        float f8;
        float f9 = 0.0f;
        float f10 = 0.0f;
        for (int i = 0; i < 100; i++) {
            float f11 = ((float) i) / 100.0f;
            float f12 = 1.0f;
            while (true) {
                f = ((f12 - f9) / 2.0f) + f9;
                f2 = 1.0f - f;
                f3 = f * 3.0f * f2;
                f4 = f * f * f;
                float f13 = (((f2 * 0.175f) + (f * 0.35000002f)) * f3) + f4;
                if (((double) Math.abs(f13 - f11)) < 1.0E-5d) {
                    break;
                } else if (f13 > f11) {
                    f12 = f;
                } else {
                    f9 = f;
                }
            }
            float f14 = 0.5f;
            SPLINE_POSITION[i] = (f3 * ((f2 * 0.5f) + f)) + f4;
            float f15 = 1.0f;
            while (true) {
                f5 = ((f15 - f10) / 2.0f) + f10;
                f6 = 1.0f - f5;
                f7 = f5 * 3.0f * f6;
                f8 = f5 * f5 * f5;
                float f16 = (((f6 * f14) + f5) * f7) + f8;
                if (((double) Math.abs(f16 - f11)) < 1.0E-5d) {
                    break;
                }
                if (f16 > f11) {
                    f15 = f5;
                } else {
                    f10 = f5;
                }
                f14 = 0.5f;
            }
            SPLINE_TIME[i] = (f7 * ((f6 * 0.175f) + (f5 * 0.35000002f))) + f8;
        }
        float[] fArr = SPLINE_POSITION;
        SPLINE_TIME[100] = 1.0f;
        fArr[100] = 1.0f;
        sViscousFluidNormalize = 1.0f;
        sViscousFluidNormalize = 1.0f / viscousFluid(1.0f);
    }

    public LauncherScroller(Context context) {
        boolean z = context.getApplicationInfo().targetSdkVersion >= 11;
        this.mFlingFriction = ViewConfiguration.getScrollFriction();
        this.mFinished = true;
        this.mInterpolator = null;
        this.mPpi = context.getResources().getDisplayMetrics().density * 160.0f;
        this.mDeceleration = computeDeceleration(ViewConfiguration.getScrollFriction());
        this.mFlywheel = z;
        this.mPhysicalCoeff = computeDeceleration(0.84f);
    }

    private final float computeDeceleration(float f) {
        return this.mPpi * 386.0878f * f;
    }

    static float viscousFluid(float f) {
        float f2;
        float f3 = f * sViscousFluidScale;
        if (f3 < 1.0f) {
            f2 = f3 - (1.0f - ((float) Math.exp((double) (-f3))));
        } else {
            f2 = 0.36787945f + ((1.0f - ((float) Math.exp((double) (1.0f - f3)))) * 0.63212055f);
        }
        return f2 * sViscousFluidNormalize;
    }

    public final double getSplineDeceleration(float f) {
        return Math.log((double) ((Math.abs(f) * 0.35f) / (this.mFlingFriction * this.mPhysicalCoeff)));
    }

    public final void startScroll$ar$ds(int i, int i2, int i3) {
        this.mMode = 0;
        this.mFinished = false;
        this.mDuration = i3;
        this.mStartTime = AnimationUtils.currentAnimationTimeMillis();
        this.mStartX = i;
        this.mStartY = 0;
        this.mFinalX = i + i2;
        this.mFinalY = 0;
        this.mDeltaX = (float) i2;
        this.mDurationReciprocal = 1.0f / ((float) this.mDuration);
    }
}
