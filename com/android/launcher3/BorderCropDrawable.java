package com.android.launcher3;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;

/* compiled from: PG */
public final class BorderCropDrawable extends Drawable {
    private final Rect mBoundsShift;
    private final Drawable mChild;
    private final Rect mPadding;

    public BorderCropDrawable(Drawable drawable) {
        this.mChild = drawable;
        Rect rect = new Rect();
        this.mBoundsShift = rect;
        Rect rect2 = new Rect();
        this.mPadding = rect2;
        drawable.getPadding(rect2);
        rect.left = -rect2.left;
        rect2.left = 0;
        rect.top = -rect2.top;
        rect2.top = 0;
        rect.right = rect2.right;
        rect2.right = 0;
    }

    public final void draw(Canvas canvas) {
        this.mChild.draw(canvas);
    }

    public final int getOpacity() {
        return this.mChild.getOpacity();
    }

    public final boolean getPadding(Rect rect) {
        rect.set(this.mPadding);
        return (rect.bottom | ((rect.left | rect.top) | rect.right)) != 0;
    }

    /* access modifiers changed from: protected */
    public final void onBoundsChange(Rect rect) {
        this.mChild.setBounds(rect.left + this.mBoundsShift.left, rect.top + this.mBoundsShift.top, rect.right + this.mBoundsShift.right, rect.bottom + this.mBoundsShift.bottom);
    }

    public final void setAlpha(int i) {
        this.mChild.setAlpha(i);
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        this.mChild.setColorFilter(colorFilter);
    }
}
