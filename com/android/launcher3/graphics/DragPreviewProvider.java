package com.android.launcher3.graphics;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.TextView;
import com.android.launcher3.DeviceProfile;
import com.android.launcher3.FolderIcon;
import com.android.launcher3.HolographicOutlineHelper;
import com.android.launcher3.Launcher;
import com.android.launcher3.LauncherAppWidgetHostView;
import com.android.launcher3.PreloadIconDrawable;
import com.android.launcher3.Workspace;
import com.google.android.googlequicksearchbox.R;

/* compiled from: PG */
public class DragPreviewProvider {
    private final Rect mTempRect = new Rect();
    protected final View mView;
    public final int previewPadding;

    public DragPreviewProvider(View view) {
        this.mView = view;
        if (view instanceof TextView) {
            Rect drawableBounds = getDrawableBounds(Workspace.getTextViewIcon((TextView) view));
            this.previewPadding = (2 - drawableBounds.left) - drawableBounds.top;
            return;
        }
        this.previewPadding = 2;
    }

    private final void drawDragView(Canvas canvas) {
        canvas.save();
        View view = this.mView;
        if (view instanceof TextView) {
            Drawable textViewIcon = Workspace.getTextViewIcon((TextView) view);
            Rect drawableBounds = getDrawableBounds(textViewIcon);
            canvas.translate((float) (1 - drawableBounds.left), (float) (1 - drawableBounds.top));
            textViewIcon.draw(canvas);
        } else {
            Rect rect = this.mTempRect;
            view.getDrawingRect(rect);
            View view2 = this.mView;
            boolean z = false;
            if ((view2 instanceof FolderIcon) && ((FolderIcon) view2).mFolderName.getVisibility() == 0) {
                ((FolderIcon) this.mView).setTextVisible(false);
                z = true;
            }
            canvas.translate((float) ((-this.mView.getScrollX()) + 1), (float) ((-this.mView.getScrollY()) + 1));
            canvas.clipRect(rect);
            this.mView.draw(canvas);
            if (z) {
                ((FolderIcon) this.mView).setTextVisible(true);
            }
        }
        canvas.restore();
    }

    protected static Rect getDrawableBounds(Drawable drawable) {
        Rect rect = new Rect();
        drawable.copyBounds(rect);
        if (rect.width() == 0 || rect.height() == 0) {
            rect.set(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
        } else {
            rect.offsetTo(0, 0);
        }
        if (drawable instanceof PreloadIconDrawable) {
            int i = -((PreloadIconDrawable) drawable).mRingOutset;
            rect.inset(i, i);
        }
        return rect;
    }

    public Bitmap createDragBitmap(Canvas canvas) {
        int width = this.mView.getWidth();
        int height = this.mView.getHeight();
        View view = this.mView;
        float f = 1.0f;
        if (view instanceof TextView) {
            Rect drawableBounds = getDrawableBounds(Workspace.getTextViewIcon((TextView) view));
            int width2 = drawableBounds.width();
            height = drawableBounds.height();
            width = width2;
        } else if (view instanceof LauncherAppWidgetHostView) {
            f = ((LauncherAppWidgetHostView) view).mScaleToFit;
            width = (int) (((float) view.getWidth()) * f);
            height = (int) (((float) this.mView.getHeight()) * f);
        }
        Bitmap createBitmap = Bitmap.createBitmap(width + 2, height + 2, Bitmap.Config.ARGB_8888);
        canvas.setBitmap(createBitmap);
        canvas.save();
        canvas.scale(f, f);
        drawDragView(canvas);
        canvas.restore();
        canvas.setBitmap((Bitmap) null);
        return createBitmap;
    }

    public Bitmap createDragOutline(Canvas canvas) {
        float f;
        int width = this.mView.getWidth();
        int height = this.mView.getHeight();
        View view = this.mView;
        if (view instanceof LauncherAppWidgetHostView) {
            float f2 = ((LauncherAppWidgetHostView) view).mScaleToFit;
            int floor = (int) Math.floor((double) (((float) this.mView.getHeight()) * f2));
            f = f2;
            width = (int) Math.floor((double) (((float) view.getWidth()) * f2));
            height = floor;
        } else {
            f = 1.0f;
        }
        Bitmap createBitmap = Bitmap.createBitmap(width + 2, height + 2, Bitmap.Config.ALPHA_8);
        canvas.setBitmap(createBitmap);
        canvas.save();
        canvas.scale(f, f);
        drawDragView(canvas);
        canvas.restore();
        int color = this.mView.getResources().getColor(R.color.outline_color);
        HolographicOutlineHelper.obtain(this.mView.getContext()).applyExpensiveOutlineWithBlur(createBitmap, canvas, color, color, true);
        canvas.setBitmap((Bitmap) null);
        return createBitmap;
    }

    public float getScaleAndPosition(Bitmap bitmap, int[] iArr) {
        float locationInDragLayer = Launcher.getLauncher(this.mView.getContext()).mDragLayer.getLocationInDragLayer(this.mView, iArr);
        DeviceProfile deviceProfile = Launcher.getLauncher(this.mView.getContext()).mDeviceProfile;
        View view = this.mView;
        if (view instanceof LauncherAppWidgetHostView) {
            locationInDragLayer /= ((LauncherAppWidgetHostView) view).mScaleToFit;
        }
        iArr[0] = Math.round(((float) iArr[0]) - ((((float) bitmap.getWidth()) - ((((float) this.mView.getWidth()) * locationInDragLayer) * this.mView.getScaleX())) / 2.0f));
        iArr[1] = Math.round((((float) iArr[1]) - (((1.0f - locationInDragLayer) * ((float) bitmap.getHeight())) / 2.0f)) - ((float) (this.previewPadding / 2)));
        return locationInDragLayer;
    }
}
