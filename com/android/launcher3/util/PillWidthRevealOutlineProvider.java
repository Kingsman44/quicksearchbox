package com.android.launcher3.util;

import android.graphics.Rect;

/* compiled from: PG */
public final class PillWidthRevealOutlineProvider extends PillRevealOutlineProvider {
    private final int mStartLeft;
    private final int mStartRight;

    public PillWidthRevealOutlineProvider(Rect rect, int i, int i2) {
        super(0, 0, rect);
        this.mOutline.set(rect);
        this.mStartLeft = i;
        this.mStartRight = i2;
    }

    public final void setProgress(float f) {
        float f2 = 1.0f - f;
        this.mOutline.left = (int) ((((float) this.mPillRect.left) * f) + (((float) this.mStartLeft) * f2));
        this.mOutline.right = (int) ((f * ((float) this.mPillRect.right)) + (f2 * ((float) this.mStartRight)));
    }
}
