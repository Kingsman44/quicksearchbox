package com.android.launcher3.shortcuts;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.android.launcher3.HolographicOutlineHelper;
import com.android.launcher3.Launcher;
import com.android.launcher3.Utilities;
import com.android.launcher3.graphics.DragPreviewProvider;
import com.google.android.googlequicksearchbox.R;

/* compiled from: PG */
public final class ShortcutDragPreviewProvider extends DragPreviewProvider {
    private final Point mPositionShift;

    public ShortcutDragPreviewProvider(View view, Point point) {
        super(view);
        this.mPositionShift = point;
    }

    private final Bitmap drawScaledPreview(Canvas canvas) {
        Drawable background = this.mView.getBackground();
        Rect drawableBounds = getDrawableBounds(background);
        int i = Launcher.getLauncher(this.mView.getContext()).mDeviceProfile.iconSizePx;
        int i2 = i + 2;
        Bitmap createBitmap = Bitmap.createBitmap(i2, i2, Bitmap.Config.ARGB_8888);
        canvas.setBitmap(createBitmap);
        canvas.save();
        canvas.translate(1.0f, 1.0f);
        float f = (float) i;
        canvas.scale(f / ((float) drawableBounds.width()), f / ((float) drawableBounds.height()), 0.0f, 0.0f);
        canvas.translate((float) drawableBounds.left, (float) drawableBounds.top);
        background.draw(canvas);
        canvas.restore();
        return createBitmap;
    }

    public final Bitmap createDragBitmap(Canvas canvas) {
        Bitmap drawScaledPreview = drawScaledPreview(canvas);
        canvas.setBitmap((Bitmap) null);
        return drawScaledPreview;
    }

    public final Bitmap createDragOutline(Canvas canvas) {
        Bitmap drawScaledPreview = drawScaledPreview(canvas);
        int color = this.mView.getResources().getColor(R.color.outline_color);
        HolographicOutlineHelper.obtain(this.mView.getContext()).applyExpensiveOutlineWithBlur(drawScaledPreview, canvas, color, color, true);
        canvas.setBitmap((Bitmap) null);
        return drawScaledPreview;
    }

    public final float getScaleAndPosition(Bitmap bitmap, int[] iArr) {
        Launcher launcher = Launcher.getLauncher(this.mView.getContext());
        int width = getDrawableBounds(this.mView.getBackground()).width();
        float locationInDragLayer = launcher.mDragLayer.getLocationInDragLayer(this.mView, iArr);
        int paddingStart = this.mView.getPaddingStart();
        if (Utilities.isRtl(this.mView.getResources())) {
            paddingStart = (this.mView.getWidth() - width) - paddingStart;
        }
        float f = ((float) width) * locationInDragLayer;
        iArr[0] = iArr[0] + Math.round((((float) paddingStart) * locationInDragLayer) + ((f - ((float) bitmap.getWidth())) / 2.0f) + ((float) this.mPositionShift.x));
        iArr[1] = iArr[1] + Math.round((((locationInDragLayer * ((float) this.mView.getHeight())) - ((float) bitmap.getHeight())) / 2.0f) + ((float) this.mPositionShift.y));
        return f / ((float) launcher.mDeviceProfile.iconSizePx);
    }
}
