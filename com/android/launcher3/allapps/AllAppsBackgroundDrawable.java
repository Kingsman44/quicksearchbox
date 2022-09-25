package com.android.launcher3.allapps;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import com.google.android.googlequicksearchbox.R;

/* compiled from: PG */
public class AllAppsBackgroundDrawable extends Drawable {
    public ObjectAnimator mBackgroundAnim;
    private final TransformedImageDrawable mHand;
    public final int mHeight;
    private final TransformedImageDrawable[] mIcons;
    public final int mWidth;

    public AllAppsBackgroundDrawable(Context context) {
        Resources resources = context.getResources();
        this.mHand = new TransformedImageDrawable(resources, R.drawable.ic_all_apps_bg_hand, 0.575f, 0.1f);
        TransformedImageDrawable[] transformedImageDrawableArr = new TransformedImageDrawable[4];
        this.mIcons = transformedImageDrawableArr;
        transformedImageDrawableArr[0] = new TransformedImageDrawable(resources, R.drawable.ic_all_apps_bg_icon_1, 0.375f, 0.0f);
        transformedImageDrawableArr[1] = new TransformedImageDrawable(resources, R.drawable.ic_all_apps_bg_icon_2, 0.3125f, 0.25f);
        transformedImageDrawableArr[2] = new TransformedImageDrawable(resources, R.drawable.ic_all_apps_bg_icon_3, 0.475f, 0.4f);
        transformedImageDrawableArr[3] = new TransformedImageDrawable(resources, R.drawable.ic_all_apps_bg_icon_4, 0.7f, 0.125f);
        this.mWidth = resources.getDimensionPixelSize(R.dimen.all_apps_background_canvas_width);
        this.mHeight = resources.getDimensionPixelSize(R.dimen.all_apps_background_canvas_height);
    }

    public static final void cancelAnimator$ar$ds$b7d8fd49_0(ObjectAnimator objectAnimator) {
        if (objectAnimator != null) {
            objectAnimator.removeAllListeners();
            objectAnimator.cancel();
        }
    }

    public final void draw(Canvas canvas) {
        this.mHand.draw(canvas);
        int i = 0;
        while (true) {
            TransformedImageDrawable[] transformedImageDrawableArr = this.mIcons;
            int length = transformedImageDrawableArr.length;
            if (i < 4) {
                transformedImageDrawableArr[i].draw(canvas);
                i++;
            } else {
                return;
            }
        }
    }

    public int getAlpha() {
        return this.mHand.mAlpha;
    }

    public final int getIntrinsicHeight() {
        return this.mHeight;
    }

    public final int getIntrinsicWidth() {
        return this.mWidth;
    }

    public final int getOpacity() {
        return -3;
    }

    /* access modifiers changed from: protected */
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.mHand.updateBounds(rect);
        int i = 0;
        while (true) {
            TransformedImageDrawable[] transformedImageDrawableArr = this.mIcons;
            int length = transformedImageDrawableArr.length;
            if (i < 4) {
                transformedImageDrawableArr[i].updateBounds(rect);
                i++;
            } else {
                invalidateSelf();
                return;
            }
        }
    }

    public void setAlpha(int i) {
        this.mHand.setAlpha(i);
        int i2 = 0;
        while (true) {
            TransformedImageDrawable[] transformedImageDrawableArr = this.mIcons;
            int length = transformedImageDrawableArr.length;
            if (i2 < 4) {
                transformedImageDrawableArr[i2].setAlpha(i);
                i2++;
            } else {
                invalidateSelf();
                return;
            }
        }
    }

    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
