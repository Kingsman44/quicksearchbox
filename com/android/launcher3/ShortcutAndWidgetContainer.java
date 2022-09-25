package com.android.launcher3;

import android.app.WallpaperManager;
import android.content.Context;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import com.android.launcher3.CellLayout;

/* compiled from: PG */
public final class ShortcutAndWidgetContainer extends ViewGroup {
    public int mCellHeight;
    public int mCellWidth;
    public int mContainerType = 0;
    public int mCountX;
    public int mHeightGap;
    public boolean mInvertIfRtl = false;
    public final Launcher mLauncher;
    private final int[] mTmpCellXY = new int[2];
    private final WallpaperManager mWallpaperManager;
    public int mWidthGap;

    public ShortcutAndWidgetContainer(Context context) {
        super(context);
        this.mLauncher = Launcher.getLauncher(context);
        this.mWallpaperManager = WallpaperManager.getInstance(context);
    }

    public final void cancelLongPress() {
        super.cancelLongPress();
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            getChildAt(i).cancelLongPress();
        }
    }

    /* access modifiers changed from: package-private */
    public final int getCellContentHeight() {
        DeviceProfile deviceProfile = this.mLauncher.mDeviceProfile;
        int i = deviceProfile.cellHeightPx;
        int i2 = this.mContainerType;
        if (i2 == 1) {
            i = deviceProfile.hotseatCellHeightPx;
        } else if (i2 == 2) {
            i = deviceProfile.folderCellHeightPx;
        }
        return Math.min(getMeasuredHeight(), i);
    }

    public final View getChildAt(int i, int i2) {
        int i3;
        int childCount = getChildCount();
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt = getChildAt(i4);
            CellLayout.LayoutParams layoutParams = (CellLayout.LayoutParams) childAt.getLayoutParams();
            int i5 = layoutParams.cellX;
            if (i5 <= i && i < i5 + layoutParams.cellHSpan && (i3 = layoutParams.cellY) <= i2 && i2 < i3 + layoutParams.cellVSpan) {
                return childAt;
            }
        }
        return null;
    }

    public final boolean invertLayoutHorizontally() {
        return this.mInvertIfRtl && Utilities.isRtl(getResources());
    }

    public final void measureChild(View view) {
        int i = this.mCellWidth;
        int i2 = this.mCellHeight;
        CellLayout.LayoutParams layoutParams = (CellLayout.LayoutParams) view.getLayoutParams();
        boolean z = layoutParams.isFullscreen;
        DeviceProfile deviceProfile = this.mLauncher.mDeviceProfile;
        if (view instanceof LauncherAppWidgetHostView) {
            layoutParams.setup$ar$ds$9c4dc3d3_0(i, i2, invertLayoutHorizontally(), this.mCountX, deviceProfile.appWidgetScale.x, deviceProfile.appWidgetScale.y);
        } else {
            layoutParams.setup$ar$ds$9c4dc3d3_0(i, i2, invertLayoutHorizontally(), this.mCountX, 1.0f, 1.0f);
            float max = Math.max(0.0f, ((float) (layoutParams.height - getCellContentHeight())) / 2.0f);
            int i3 = (int) (((float) deviceProfile.edgeMarginPx) / 2.0f);
            view.setPadding(i3, (int) max, i3, 0);
        }
        view.measure(View.MeasureSpec.makeMeasureSpec(layoutParams.width, 1073741824), View.MeasureSpec.makeMeasureSpec(layoutParams.height, 1073741824));
    }

    /* access modifiers changed from: protected */
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int childCount = getChildCount();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            if (childAt.getVisibility() != 8) {
                CellLayout.LayoutParams layoutParams = (CellLayout.LayoutParams) childAt.getLayoutParams();
                if (childAt instanceof LauncherAppWidgetHostView) {
                    LauncherAppWidgetHostView launcherAppWidgetHostView = (LauncherAppWidgetHostView) childAt;
                    DeviceProfile deviceProfile = this.mLauncher.mDeviceProfile;
                    float f = deviceProfile.appWidgetScale.x;
                    float f2 = deviceProfile.appWidgetScale.y;
                    float min = Math.min(f, f2);
                    launcherAppWidgetHostView.mScaleToFit = min;
                    launcherAppWidgetHostView.setScaleX(min);
                    launcherAppWidgetHostView.setScaleY(min);
                    float f3 = (-(((float) layoutParams.width) - (((float) layoutParams.width) * f))) / 2.0f;
                    float f4 = (-(((float) layoutParams.height) - (((float) layoutParams.height) * f2))) / 2.0f;
                    launcherAppWidgetHostView.mTranslationForCentering.set(f3, f4);
                    launcherAppWidgetHostView.setTranslationX(f3);
                    launcherAppWidgetHostView.setTranslationY(f4);
                }
                int i6 = layoutParams.f16547x;
                int i7 = layoutParams.f16548y;
                childAt.layout(i6, i7, layoutParams.width + i6, layoutParams.height + i7);
                if (layoutParams.dropped) {
                    layoutParams.dropped = false;
                    int[] iArr = this.mTmpCellXY;
                    getLocationOnScreen(iArr);
                    this.mWallpaperManager.sendWallpaperCommand(getWindowToken(), "android.home.drop", iArr[0] + i6 + (layoutParams.width / 2), iArr[1] + i7 + (layoutParams.height / 2), 0, (Bundle) null);
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    public final void onMeasure(int i, int i2) {
        int childCount = getChildCount();
        setMeasuredDimension(View.MeasureSpec.getSize(i), View.MeasureSpec.getSize(i2));
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            if (childAt.getVisibility() != 8) {
                measureChild(childAt);
            }
        }
    }

    public final void requestChildFocus(View view, View view2) {
        super.requestChildFocus(view, view2);
        if (view != null) {
            Rect rect = new Rect();
            view.getDrawingRect(rect);
            requestRectangleOnScreen(rect);
        }
    }

    public final void setCellDimensions$ar$ds$bb6a3296_0(int i, int i2, int i3) {
        this.mCellWidth = i;
        this.mCellHeight = i2;
        this.mWidthGap = 0;
        this.mHeightGap = 0;
        this.mCountX = i3;
    }

    /* access modifiers changed from: protected */
    public final void setChildrenDrawingCacheEnabled(boolean z) {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            childAt.setDrawingCacheEnabled(z);
            if (!childAt.isHardwareAccelerated() && z) {
                childAt.buildDrawingCache(true);
            }
        }
    }

    /* access modifiers changed from: protected */
    public final void setChildrenDrawnWithCacheEnabled(boolean z) {
        super.setChildrenDrawnWithCacheEnabled(z);
    }

    public final boolean shouldDelayChildPressedState() {
        return false;
    }
}
