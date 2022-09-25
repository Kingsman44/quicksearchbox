package com.android.launcher3.allapps;

import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;

/* compiled from: PG */
final class TransformedImageDrawable {
    public int mAlpha;
    private final Drawable mImage;
    private final float mXPercent;
    private final float mYPercent;

    public TransformedImageDrawable(Resources resources, int i, float f, float f2) {
        this.mImage = resources.getDrawable(i);
        this.mXPercent = f;
        this.mYPercent = f2;
    }

    public final void draw(Canvas canvas) {
        int save = canvas.save();
        this.mImage.draw(canvas);
        canvas.restoreToCount(save);
    }

    public final void setAlpha(int i) {
        this.mImage.setAlpha(i);
        this.mAlpha = i;
    }

    public final void updateBounds(Rect rect) {
        int intrinsicWidth = this.mImage.getIntrinsicWidth();
        int intrinsicHeight = this.mImage.getIntrinsicHeight();
        int i = rect.left;
        float f = this.mXPercent;
        int width = rect.width();
        int height = rect.top + ((int) (this.mYPercent * ((float) rect.height())));
        int i2 = (i + ((int) (f * ((float) width)))) - (intrinsicWidth / 2);
        this.mImage.setBounds(i2, height, intrinsicWidth + i2, intrinsicHeight + height);
    }
}
