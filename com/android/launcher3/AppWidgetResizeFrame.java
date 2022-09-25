package com.android.launcher3;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.ValueAnimator;
import android.appwidget.AppWidgetHostView;
import android.content.Context;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.android.launcher3.CellLayout;
import com.android.launcher3.DragLayer;
import com.android.launcher3.accessibility.DragViewStateAnnouncer;
import com.android.launcher3.util.FocusLogic;
import com.google.android.googlequicksearchbox.R;

/* compiled from: PG */
public final class AppWidgetResizeFrame extends FrameLayout implements View.OnKeyListener {
    private static final Rect sTmpRect = new Rect();
    private final int mBackgroundPadding;
    public int mBaselineHeight;
    public int mBaselineWidth;
    public int mBaselineX;
    public int mBaselineY;
    public boolean mBottomBorderActive;
    public final ImageView mBottomHandle;
    public int mBottomTouchRegionAdjustment = 0;
    public final CellLayout mCellLayout;
    public int mDeltaX;
    public int mDeltaXAddOn;
    public int mDeltaY;
    public int mDeltaYAddOn;
    private final int[] mDirectionVector = new int[2];
    private final DragLayer mDragLayer;
    private final int[] mLastDirectionVector = new int[2];
    private final Launcher mLauncher;
    public boolean mLeftBorderActive;
    public final ImageView mLeftHandle;
    private final int mMinHSpan;
    private final int mMinVSpan;
    public final int mResizeMode;
    public boolean mRightBorderActive;
    public final ImageView mRightHandle;
    public int mRunningHInc;
    public int mRunningVInc;
    private final DragViewStateAnnouncer mStateAnnouncer;
    public boolean mTopBorderActive;
    public final ImageView mTopHandle;
    public int mTopTouchRegionAdjustment = 0;
    public final int mTouchTargetWidth;
    private final Rect mWidgetPadding;
    private final LauncherAppWidgetHostView mWidgetView;

    public AppWidgetResizeFrame(Context context, LauncherAppWidgetHostView launcherAppWidgetHostView, CellLayout cellLayout, DragLayer dragLayer) {
        super(context);
        this.mLauncher = Launcher.getLauncher(context);
        this.mCellLayout = cellLayout;
        this.mWidgetView = launcherAppWidgetHostView;
        LauncherAppWidgetProviderInfo launcherAppWidgetProviderInfo = (LauncherAppWidgetProviderInfo) launcherAppWidgetHostView.getAppWidgetInfo();
        int i = launcherAppWidgetProviderInfo.resizeMode;
        this.mResizeMode = i;
        this.mDragLayer = dragLayer;
        this.mMinHSpan = launcherAppWidgetProviderInfo.minSpanX;
        this.mMinVSpan = launcherAppWidgetProviderInfo.minSpanY;
        this.mStateAnnouncer = DragViewStateAnnouncer.createFor(this);
        setBackgroundResource(R.drawable.widget_resize_shadow);
        setForeground(getResources().getDrawable(R.drawable.widget_resize_frame));
        setPadding(0, 0, 0, 0);
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.widget_handle_margin);
        ImageView imageView = new ImageView(context);
        this.mLeftHandle = imageView;
        imageView.setImageResource(R.drawable.ic_widget_resize_handle);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2, 19);
        layoutParams.leftMargin = dimensionPixelSize;
        addView(imageView, layoutParams);
        ImageView imageView2 = new ImageView(context);
        this.mRightHandle = imageView2;
        imageView2.setImageResource(R.drawable.ic_widget_resize_handle);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-2, -2, 21);
        layoutParams2.rightMargin = dimensionPixelSize;
        addView(imageView2, layoutParams2);
        ImageView imageView3 = new ImageView(context);
        this.mTopHandle = imageView3;
        imageView3.setImageResource(R.drawable.ic_widget_resize_handle);
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-2, -2, 49);
        layoutParams3.topMargin = dimensionPixelSize;
        addView(imageView3, layoutParams3);
        ImageView imageView4 = new ImageView(context);
        this.mBottomHandle = imageView4;
        imageView4.setImageResource(R.drawable.ic_widget_resize_handle);
        FrameLayout.LayoutParams layoutParams4 = new FrameLayout.LayoutParams(-2, -2, 81);
        layoutParams4.bottomMargin = dimensionPixelSize;
        addView(imageView4, layoutParams4);
        boolean z = launcherAppWidgetProviderInfo.isCustomWidget;
        this.mWidgetPadding = AppWidgetHostView.getDefaultPaddingForWidget(context, launcherAppWidgetHostView.getAppWidgetInfo().provider, (Rect) null);
        if (i == 1) {
            imageView3.setVisibility(8);
            imageView4.setVisibility(8);
        } else if (i == 2) {
            imageView.setVisibility(8);
            imageView2.setVisibility(8);
        }
        int dimensionPixelSize2 = getResources().getDimensionPixelSize(R.dimen.resize_frame_background_padding);
        this.mBackgroundPadding = dimensionPixelSize2;
        this.mTouchTargetWidth = dimensionPixelSize2 + dimensionPixelSize2;
        cellLayout.markCellsAsUnoccupiedForView(launcherAppWidgetHostView);
        setOnKeyListener(this);
    }

    private final void getSnappedRectRelativeToDragLayer(Rect rect) {
        Rect rect2 = rect;
        DeviceProfile deviceProfile = this.mLauncher.mDeviceProfile;
        float min = Math.min(deviceProfile.appWidgetScale.x, deviceProfile.appWidgetScale.y);
        this.mDragLayer.getViewRectRelativeToSelf(this.mWidgetView, rect2);
        int i = this.mBackgroundPadding;
        int width = rect.width();
        int i2 = this.mWidgetPadding.left;
        int i3 = this.mWidgetPadding.right;
        int i4 = this.mBackgroundPadding;
        int height = rect.height();
        int i5 = this.mWidgetPadding.top;
        int i6 = this.mWidgetPadding.bottom;
        int i7 = rect2.left;
        int i8 = this.mBackgroundPadding;
        int i9 = this.mWidgetPadding.left;
        int i10 = rect2.top;
        int i11 = this.mBackgroundPadding;
        int i12 = i6;
        int i13 = this.mWidgetPadding.top;
        rect2.left = (int) (((float) (i7 - i8)) + (((float) i9) * min));
        rect2.top = (int) (((float) (i10 - i11)) + (((float) i13) * min));
        rect2.right = rect2.left + i + i + ((int) (((float) ((width - i2) - i3)) * min));
        rect2.bottom = rect2.top + i4 + i4 + ((int) (min * ((float) ((height - i5) - i12))));
    }

    public static void getWidgetSizeRanges$ar$ds(BaseActivity baseActivity, int i, int i2, Rect rect) {
        if (rect == null) {
            rect = new Rect();
        }
        Rect cellLayoutMetrics = Workspace.getCellLayoutMetrics(baseActivity, 0);
        Rect cellLayoutMetrics2 = Workspace.getCellLayoutMetrics(baseActivity, 1);
        float f = baseActivity.getResources().getDisplayMetrics().density;
        int i3 = cellLayoutMetrics.left;
        int i4 = cellLayoutMetrics.top;
        int i5 = cellLayoutMetrics.right;
        int i6 = i - 1;
        int i7 = i2 - 1;
        rect.set((int) (((float) ((cellLayoutMetrics2.left * i) + (cellLayoutMetrics2.right * i6))) / f), (int) (((float) ((i4 * i2) + (cellLayoutMetrics.bottom * i7))) / f), (int) (((float) ((i * i3) + (i6 * i5))) / f), (int) (((float) ((i2 * cellLayoutMetrics2.top) + (i7 * cellLayoutMetrics2.bottom))) / f));
    }

    static void updateWidgetSizeRanges(AppWidgetHostView appWidgetHostView, Launcher launcher, int i, int i2) {
        Rect rect = sTmpRect;
        getWidgetSizeRanges$ar$ds(launcher, i, i2, rect);
        appWidgetHostView.updateAppWidgetSize((Bundle) null, rect.left, rect.top, rect.right, rect.bottom);
    }

    public final boolean onKey(View view, int i, KeyEvent keyEvent) {
        if (!FocusLogic.shouldConsume(i)) {
            return false;
        }
        this.mDragLayer.clearAllResizeFrames();
        this.mWidgetView.requestFocus();
        return true;
    }

    public final void resizeWidgetIfNeeded(boolean z) {
        int i;
        int i2;
        int i3;
        int i4;
        boolean z2 = z;
        CellLayout cellLayout = this.mCellLayout;
        int i5 = cellLayout.mCellWidth;
        int i6 = cellLayout.mWidthGap;
        int i7 = cellLayout.mCellHeight;
        int i8 = cellLayout.mHeightGap;
        int i9 = this.mDeltaX;
        int i10 = this.mDeltaXAddOn;
        int i11 = this.mDeltaY;
        int i12 = this.mDeltaYAddOn;
        float f = (((float) (i9 + i10)) / ((float) i5)) - ((float) this.mRunningHInc);
        float f2 = (((float) (i11 + i12)) / ((float) i7)) - ((float) this.mRunningVInc);
        int i13 = cellLayout.mCountX;
        int i14 = cellLayout.mCountY;
        int round = Math.abs(f) > 0.66f ? Math.round(f) : 0;
        int round2 = Math.abs(f2) > 0.66f ? Math.round(f2) : 0;
        if (!z2 && round == 0) {
            if (round2 != 0) {
                round = 0;
            } else {
                return;
            }
        }
        CellLayout.LayoutParams layoutParams = (CellLayout.LayoutParams) this.mWidgetView.getLayoutParams();
        int i15 = layoutParams.cellHSpan;
        int i16 = layoutParams.cellVSpan;
        boolean z3 = layoutParams.useTmpCoords;
        int i17 = z3 ? layoutParams.tmpCellX : layoutParams.cellX;
        int i18 = z3 ? layoutParams.tmpCellY : layoutParams.cellY;
        if (this.mLeftBorderActive) {
            i2 = Math.min(layoutParams.cellHSpan - this.mMinHSpan, Math.max(-i17, round));
            round = Math.max(-(layoutParams.cellHSpan - this.mMinHSpan), Math.min(i17, -round));
            i = -round;
        } else if (this.mRightBorderActive) {
            round = Math.max(-(layoutParams.cellHSpan - this.mMinHSpan), Math.min(i13 - (i17 + i15), round));
            i = round;
            i2 = 0;
        } else {
            i2 = 0;
            i = 0;
        }
        if (this.mTopBorderActive) {
            i4 = Math.min(layoutParams.cellVSpan - this.mMinVSpan, Math.max(-i18, round2));
            round2 = Math.max(-(layoutParams.cellVSpan - this.mMinVSpan), Math.min(i18, -round2));
            i3 = -round2;
        } else if (this.mBottomBorderActive) {
            round2 = Math.max(-(layoutParams.cellVSpan - this.mMinVSpan), Math.min(i14 - (i18 + i16), round2));
            i3 = round2;
            i4 = 0;
        } else {
            i4 = 0;
            i3 = 0;
        }
        int[] iArr = this.mDirectionVector;
        iArr[0] = 0;
        iArr[1] = 0;
        boolean z4 = this.mLeftBorderActive;
        int i19 = -1;
        if (z4 || this.mRightBorderActive) {
            i15 += round;
            i17 += i2;
            if (i != 0) {
                iArr[0] = true != z4 ? 1 : -1;
            }
        }
        boolean z5 = this.mTopBorderActive;
        if (z5 || this.mBottomBorderActive) {
            i16 += round2;
            i18 += i4;
            if (i3 != 0) {
                if (true != z5) {
                    i19 = 1;
                }
                iArr[1] = i19;
            }
        }
        if (z2 || i3 != 0 || i != 0) {
            if (z2) {
                int[] iArr2 = this.mLastDirectionVector;
                iArr[0] = iArr2[0];
                iArr[1] = iArr2[1];
            } else {
                int[] iArr3 = this.mLastDirectionVector;
                iArr3[0] = iArr[0];
                iArr3[1] = iArr[1];
            }
            CellLayout cellLayout2 = this.mCellLayout;
            LauncherAppWidgetHostView launcherAppWidgetHostView = this.mWidgetView;
            int[] iArr4 = new int[2];
            cellLayout2.regionToCenterPoint(i17, i18, i15, i16, iArr4);
            CellLayout.ItemConfiguration findReorderSolution = cellLayout2.findReorderSolution(iArr4[0], iArr4[1], i15, i16, i15, i16, iArr, launcherAppWidgetHostView, true, new CellLayout.ItemConfiguration());
            cellLayout2.setUseTempCoords(true);
            if (findReorderSolution != null && findReorderSolution.isSolution) {
                cellLayout2.copySolutionToTempState(findReorderSolution, launcherAppWidgetHostView);
                cellLayout2.mItemPlacementDirty = true;
                cellLayout2.animateItemsToSolution(findReorderSolution, launcherAppWidgetHostView, z2);
                if (z2) {
                    cellLayout2.commitTempPlacement();
                    cellLayout2.completeAndClearReorderPreviewAnimations();
                    cellLayout2.mItemPlacementDirty = false;
                } else {
                    cellLayout2.beginOrAdjustReorderPreviewAnimations$ar$ds(findReorderSolution, launcherAppWidgetHostView, 1);
                }
                cellLayout2.mShortcutsAndWidgets.requestLayout();
            }
            if (findReorderSolution.isSolution) {
                DragViewStateAnnouncer dragViewStateAnnouncer = this.mStateAnnouncer;
                if (!(dragViewStateAnnouncer == null || (layoutParams.cellHSpan == i15 && layoutParams.cellVSpan == i16))) {
                    dragViewStateAnnouncer.announce(this.mLauncher.getString(R.string.widget_resized, new Object[]{Integer.valueOf(i15), Integer.valueOf(i16)}));
                }
                layoutParams.tmpCellX = i17;
                layoutParams.tmpCellY = i18;
                layoutParams.cellHSpan = i15;
                layoutParams.cellVSpan = i16;
                this.mRunningVInc += i3;
                this.mRunningHInc += i;
                if (!z2) {
                    updateWidgetSizeRanges(this.mWidgetView, this.mLauncher, i15, i16);
                }
            }
            this.mWidgetView.requestLayout();
        }
    }

    public final void snapToWidget(boolean z) {
        Rect rect = sTmpRect;
        getSnappedRectRelativeToDragLayer(rect);
        int width = rect.width();
        int height = rect.height();
        int i = rect.left;
        int i2 = rect.top;
        if (i2 < 0) {
            this.mTopTouchRegionAdjustment = -i2;
        } else {
            this.mTopTouchRegionAdjustment = 0;
        }
        int i3 = i2 + height;
        if (i3 > this.mDragLayer.getHeight()) {
            this.mBottomTouchRegionAdjustment = -(i3 - this.mDragLayer.getHeight());
        } else {
            this.mBottomTouchRegionAdjustment = 0;
        }
        DragLayer.LayoutParams layoutParams = (DragLayer.LayoutParams) getLayoutParams();
        if (!z) {
            layoutParams.width = width;
            layoutParams.height = height;
            layoutParams.f16550x = i;
            layoutParams.f16551y = i2;
            this.mLeftHandle.setAlpha(1.0f);
            this.mRightHandle.setAlpha(1.0f);
            this.mTopHandle.setAlpha(1.0f);
            this.mBottomHandle.setAlpha(1.0f);
            requestLayout();
        } else {
            ObjectAnimator ofPropertyValuesHolder = LauncherAnimUtils.ofPropertyValuesHolder(layoutParams, this, PropertyValuesHolder.ofInt("width", new int[]{layoutParams.width, width}), PropertyValuesHolder.ofInt("height", new int[]{layoutParams.height, height}), PropertyValuesHolder.ofInt("x", new int[]{layoutParams.f16550x, i}), PropertyValuesHolder.ofInt("y", new int[]{layoutParams.f16551y, i2}));
            ObjectAnimator ofFloat = LauncherAnimUtils.ofFloat(this.mLeftHandle, "alpha", 1.0f);
            ObjectAnimator ofFloat2 = LauncherAnimUtils.ofFloat(this.mRightHandle, "alpha", 1.0f);
            ObjectAnimator ofFloat3 = LauncherAnimUtils.ofFloat(this.mTopHandle, "alpha", 1.0f);
            ObjectAnimator ofFloat4 = LauncherAnimUtils.ofFloat(this.mBottomHandle, "alpha", 1.0f);
            ofPropertyValuesHolder.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    AppWidgetResizeFrame.this.requestLayout();
                }
            });
            AnimatorSet createAnimatorSet = LauncherAnimUtils.createAnimatorSet();
            int i4 = this.mResizeMode;
            if (i4 == 2) {
                createAnimatorSet.playTogether(new Animator[]{ofPropertyValuesHolder, ofFloat3, ofFloat4});
            } else if (i4 == 1) {
                createAnimatorSet.playTogether(new Animator[]{ofPropertyValuesHolder, ofFloat, ofFloat2});
            } else {
                createAnimatorSet.playTogether(new Animator[]{ofPropertyValuesHolder, ofFloat, ofFloat2, ofFloat3, ofFloat4});
            }
            createAnimatorSet.setDuration(150);
            createAnimatorSet.start();
        }
        setFocusableInTouchMode(true);
        requestFocus();
    }

    public final void visualizeResizeForDelta$ar$ds(int i, int i2) {
        if (this.mLeftBorderActive) {
            int max = Math.max(-this.mBaselineX, i);
            this.mDeltaX = max;
            int i3 = this.mBaselineWidth;
            int i4 = this.mTouchTargetWidth;
            this.mDeltaX = Math.min(i3 - (i4 + i4), max);
        } else if (this.mRightBorderActive) {
            int min = Math.min(this.mDragLayer.getWidth() - (this.mBaselineX + this.mBaselineWidth), i);
            this.mDeltaX = min;
            int i5 = this.mBaselineWidth;
            int i6 = this.mTouchTargetWidth;
            this.mDeltaX = Math.max((-i5) + i6 + i6, min);
        }
        if (this.mTopBorderActive) {
            int max2 = Math.max(-this.mBaselineY, i2);
            this.mDeltaY = max2;
            int i7 = this.mBaselineHeight;
            int i8 = this.mTouchTargetWidth;
            this.mDeltaY = Math.min(i7 - (i8 + i8), max2);
        } else if (this.mBottomBorderActive) {
            int min2 = Math.min(this.mDragLayer.getHeight() - (this.mBaselineY + this.mBaselineHeight), i2);
            this.mDeltaY = min2;
            int i9 = this.mBaselineHeight;
            int i10 = this.mTouchTargetWidth;
            this.mDeltaY = Math.max((-i9) + i10 + i10, min2);
        }
        DragLayer.LayoutParams layoutParams = (DragLayer.LayoutParams) getLayoutParams();
        if (this.mLeftBorderActive) {
            int i11 = this.mBaselineX;
            int i12 = this.mDeltaX;
            layoutParams.f16550x = i11 + i12;
            layoutParams.width = this.mBaselineWidth - i12;
        } else if (this.mRightBorderActive) {
            layoutParams.width = this.mBaselineWidth + this.mDeltaX;
        }
        if (this.mTopBorderActive) {
            int i13 = this.mBaselineY;
            int i14 = this.mDeltaY;
            layoutParams.f16551y = i13 + i14;
            layoutParams.height = this.mBaselineHeight - i14;
        } else if (this.mBottomBorderActive) {
            layoutParams.height = this.mBaselineHeight + this.mDeltaY;
        }
        resizeWidgetIfNeeded(false);
        Rect rect = sTmpRect;
        getSnappedRectRelativeToDragLayer(rect);
        if (this.mLeftBorderActive) {
            layoutParams.width = (rect.width() + rect.left) - layoutParams.f16550x;
        }
        if (this.mTopBorderActive) {
            layoutParams.height = (rect.height() + rect.top) - layoutParams.f16551y;
        }
        if (this.mRightBorderActive) {
            layoutParams.f16550x = rect.left;
        }
        if (this.mBottomBorderActive) {
            layoutParams.f16551y = rect.top;
        }
        requestLayout();
    }
}
