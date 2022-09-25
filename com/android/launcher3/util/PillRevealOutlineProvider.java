package com.android.launcher3.util;

import android.graphics.Rect;

/* compiled from: PG */
public class PillRevealOutlineProvider extends RevealOutlineAnimation {
    private final int mCenterX;
    private final int mCenterY;
    protected final Rect mPillRect;

    public PillRevealOutlineProvider(int i, int i2, Rect rect) {
        this.mCenterX = i;
        this.mCenterY = i2;
        this.mPillRect = rect;
        this.mOutlineRadius = ((float) rect.height()) / 2.0f;
    }

    public void setProgress(float f) {
        int max = (int) (f * ((float) Math.max(this.mCenterX, this.mPillRect.width() - this.mCenterX)));
        this.mOutline.left = Math.max(this.mPillRect.left, this.mCenterX - max);
        this.mOutline.top = Math.max(this.mPillRect.top, this.mCenterY - max);
        this.mOutline.right = Math.min(this.mPillRect.right, this.mCenterX + max);
        this.mOutline.bottom = Math.min(this.mPillRect.bottom, this.mCenterY + max);
        this.mOutlineRadius = (float) (this.mOutline.height() / 2);
    }

    public final boolean shouldRemoveElevationDuringAnimation() {
        return false;
    }
}
