package com.android.launcher3.util;

/* compiled from: PG */
public final class CircleRevealOutlineProvider extends RevealOutlineAnimation {
    private final int mCenterX;
    private final int mCenterY;
    private final float mRadius0;
    private final float mRadius1;

    public CircleRevealOutlineProvider(int i, int i2, float f, float f2) {
        this.mCenterX = i;
        this.mCenterY = i2;
        this.mRadius0 = f;
        this.mRadius1 = f2;
    }

    public final void setProgress(float f) {
        float f2 = ((1.0f - f) * this.mRadius0) + (f * this.mRadius1);
        this.mOutlineRadius = f2;
        this.mOutline.left = (int) (((float) this.mCenterX) - f2);
        this.mOutline.top = (int) (((float) this.mCenterY) - this.mOutlineRadius);
        this.mOutline.right = (int) (((float) this.mCenterX) + this.mOutlineRadius);
        this.mOutline.bottom = (int) (((float) this.mCenterY) + this.mOutlineRadius);
    }

    public final boolean shouldRemoveElevationDuringAnimation() {
        return true;
    }
}
