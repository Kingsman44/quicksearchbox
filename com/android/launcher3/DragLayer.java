package com.android.launcher3;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Point;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.android.launcher3.CellLayout;
import com.android.launcher3.DragController;
import com.android.launcher3.InsettableFrameLayout;
import com.android.launcher3.accessibility.LauncherAccessibilityDelegate;
import com.android.launcher3.shortcuts.DeepShortcutsContainer;
import com.google.android.googlequicksearchbox.R;
import java.util.ArrayList;

/* compiled from: PG */
public class DragLayer extends InsettableFrameLayout {
    View mAnchorView = null;
    int mAnchorViewInitialScrollX = 0;
    public float mBackgroundAlpha = 0.0f;
    private int mChildCountOnLastUpdate = -1;
    private final TimeInterpolator mCubicEaseOutInterpolator = new DecelerateInterpolator(1.5f);
    private AppWidgetResizeFrame mCurrentResizeFrame;
    DragController mDragController;
    private ValueAnimator mDropAnim = null;
    public DragView mDropView = null;
    private final Rect mHitRect = new Rect();
    private boolean mHoverPointClosesFolder = false;
    private boolean mInScrollArea;
    private final boolean mIsRtl;
    public Launcher mLauncher;
    private Drawable mLeftHoverDrawable;
    private Drawable mLeftHoverDrawableActive;
    public View mOverlayView;
    public final ArrayList mResizeFrames = new ArrayList();
    private Drawable mRightHoverDrawable;
    private Drawable mRightHoverDrawableActive;
    public final Rect mScrollChildPosition = new Rect();
    public boolean mShowPageHints;
    private final int[] mTmpXY = new int[2];
    private int mTopViewIndex;
    public TouchCompleteListener mTouchCompleteListener;
    private int mXDown;
    private int mYDown;

    /* compiled from: PG */
    public class LayoutParams extends InsettableFrameLayout.LayoutParams {
        public boolean customPosition = false;

        /* renamed from: x */
        public int f16550x;

        /* renamed from: y */
        public int f16551y;

        public LayoutParams(int i, int i2) {
            super(i, i2);
        }

        public int getHeight() {
            return this.height;
        }

        public int getWidth() {
            return this.width;
        }

        public int getX() {
            return this.f16550x;
        }

        public int getY() {
            return this.f16551y;
        }

        public void setHeight(int i) {
            this.height = i;
        }

        public void setWidth(int i) {
            this.width = i;
        }

        public void setX(int i) {
            this.f16550x = i;
        }

        public void setY(int i) {
            this.f16551y = i;
        }

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public LayoutParams(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }
    }

    /* compiled from: PG */
    public interface TouchCompleteListener {
        void onTouchComplete();
    }

    public DragLayer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setMotionEventSplittingEnabled(false);
        setChildrenDrawingOrderEnabled(true);
        Resources resources = getResources();
        this.mLeftHoverDrawable = resources.getDrawable(R.drawable.page_hover_left);
        this.mRightHoverDrawable = resources.getDrawable(R.drawable.page_hover_right);
        this.mLeftHoverDrawableActive = resources.getDrawable(R.drawable.page_hover_left_active);
        this.mRightHoverDrawableActive = resources.getDrawable(R.drawable.page_hover_right_active);
        this.mIsRtl = Utilities.isRtl(resources);
    }

    protected static final LayoutParams generateDefaultLayoutParams$ar$ds$91cae437_0() {
        return new LayoutParams(-2, -2);
    }

    private final boolean handleTouchDown(MotionEvent motionEvent, boolean z) {
        MotionEvent motionEvent2 = motionEvent;
        Rect rect = new Rect();
        int x = (int) motionEvent.getX();
        int y = (int) motionEvent.getY();
        ArrayList arrayList = this.mResizeFrames;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            AppWidgetResizeFrame appWidgetResizeFrame = (AppWidgetResizeFrame) arrayList.get(i);
            appWidgetResizeFrame.getHitRect(rect);
            if (rect.contains(x, y)) {
                int left = x - appWidgetResizeFrame.getLeft();
                int top = y - appWidgetResizeFrame.getTop();
                int i2 = appWidgetResizeFrame.mResizeMode;
                int i3 = i2 & 1;
                boolean z2 = (i2 & 2) != 0;
                appWidgetResizeFrame.mLeftBorderActive = left < appWidgetResizeFrame.mTouchTargetWidth && i3 != 0;
                int width = appWidgetResizeFrame.getWidth();
                int i4 = appWidgetResizeFrame.mTouchTargetWidth;
                appWidgetResizeFrame.mRightBorderActive = left > width - i4 && i3 != 0;
                appWidgetResizeFrame.mTopBorderActive = top < i4 + appWidgetResizeFrame.mTopTouchRegionAdjustment && z2;
                boolean z3 = top > (appWidgetResizeFrame.getHeight() - appWidgetResizeFrame.mTouchTargetWidth) + appWidgetResizeFrame.mBottomTouchRegionAdjustment && z2;
                appWidgetResizeFrame.mBottomBorderActive = z3;
                boolean z4 = appWidgetResizeFrame.mLeftBorderActive || appWidgetResizeFrame.mRightBorderActive || appWidgetResizeFrame.mTopBorderActive || z3;
                appWidgetResizeFrame.mBaselineWidth = appWidgetResizeFrame.getMeasuredWidth();
                appWidgetResizeFrame.mBaselineHeight = appWidgetResizeFrame.getMeasuredHeight();
                appWidgetResizeFrame.mBaselineX = appWidgetResizeFrame.getLeft();
                appWidgetResizeFrame.mBaselineY = appWidgetResizeFrame.getTop();
                if (z4) {
                    float f = 0.0f;
                    appWidgetResizeFrame.mLeftHandle.setAlpha(true != appWidgetResizeFrame.mLeftBorderActive ? 0.0f : 1.0f);
                    appWidgetResizeFrame.mRightHandle.setAlpha(true != appWidgetResizeFrame.mRightBorderActive ? 0.0f : 1.0f);
                    appWidgetResizeFrame.mTopHandle.setAlpha(true != appWidgetResizeFrame.mTopBorderActive ? 0.0f : 1.0f);
                    ImageView imageView = appWidgetResizeFrame.mBottomHandle;
                    if (true == appWidgetResizeFrame.mBottomBorderActive) {
                        f = 1.0f;
                    }
                    imageView.setAlpha(f);
                    this.mCurrentResizeFrame = appWidgetResizeFrame;
                    this.mXDown = x;
                    this.mYDown = y;
                    requestDisallowInterceptTouchEvent(true);
                    return true;
                }
            }
        }
        DeepShortcutsContainer openShortcutsContainer = this.mLauncher.getOpenShortcutsContainer();
        if (openShortcutsContainer != null) {
            if (isEventOverView(openShortcutsContainer, motionEvent2)) {
                return false;
            }
            if (!isInAccessibleDrag$ar$ds()) {
                this.mLauncher.closeShortcutsContainer(true);
                if (!isEventOverView(openShortcutsContainer.mDeferredDragIcon, motionEvent2)) {
                    return true;
                }
                return false;
            } else if (!isEventOverDropTargetBar(motionEvent)) {
                return true;
            }
        }
        Folder openFolder = this.mLauncher.mWorkspace.getOpenFolder();
        if (openFolder == null || !z) {
            return false;
        }
        if (openFolder.mIsEditingName) {
            getDescendantRectRelativeToSelf(openFolder.mFolderName, this.mHitRect);
            if (!this.mHitRect.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                openFolder.dismissEditingName();
                return true;
            }
        }
        if (isEventOverFolder(openFolder, motionEvent2)) {
            return false;
        }
        if (!isInAccessibleDrag$ar$ds()) {
            this.mLauncher.closeFolder(true);
            return true;
        } else if (!isEventOverDropTargetBar(motionEvent)) {
            return true;
        } else {
            return false;
        }
    }

    private final boolean isEventOverDropTargetBar(MotionEvent motionEvent) {
        getDescendantRectRelativeToSelf(this.mLauncher.mSearchDropTargetBar, this.mHitRect);
        return this.mHitRect.contains((int) motionEvent.getX(), (int) motionEvent.getY());
    }

    private final boolean isEventOverFolder(Folder folder, MotionEvent motionEvent) {
        getDescendantRectRelativeToSelf(folder, this.mHitRect);
        return this.mHitRect.contains((int) motionEvent.getX(), (int) motionEvent.getY());
    }

    private static final boolean isInAccessibleDrag$ar$ds() {
        LauncherAccessibilityDelegate launcherAccessibilityDelegate = LauncherAppState.getInstance().mAccessibilityDelegate;
        return launcherAccessibilityDelegate != null && launcherAccessibilityDelegate.isInAccessibleDrag();
    }

    private final void sendTapOutsideFolderAccessibilityEvent(boolean z) {
        Utilities.sendCustomAccessibilityEvent(this, 8, getContext().getString(true != z ? R.string.folder_tap_to_close : R.string.folder_tap_to_rename));
    }

    private final void updateChildIndices() {
        this.mTopViewIndex = -1;
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            if (getChildAt(i) instanceof DragView) {
                this.mTopViewIndex = i;
            }
        }
        this.mChildCountOnLastUpdate = childCount;
    }

    public final void addChildrenForAccessibility(ArrayList arrayList) {
        View topFloatingView = this.mLauncher.getTopFloatingView();
        if (topFloatingView != null) {
            arrayList.add(topFloatingView);
            if (isInAccessibleDrag$ar$ds()) {
                arrayList.add(this.mLauncher.mSearchDropTargetBar);
                return;
            }
            return;
        }
        super.addChildrenForAccessibility(arrayList);
    }

    public final void addFocusables(ArrayList arrayList, int i, int i2) {
        View topFloatingView = this.mLauncher.getTopFloatingView();
        if (topFloatingView != null) {
            topFloatingView.addFocusables(arrayList, i);
        } else {
            super.addFocusables(arrayList, i, i2);
        }
    }

    public final void animateView(DragView dragView, ValueAnimator.AnimatorUpdateListener animatorUpdateListener, int i, TimeInterpolator timeInterpolator, final Runnable runnable, final int i2, View view) {
        ValueAnimator valueAnimator = this.mDropAnim;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.mDropView = dragView;
        ValueAnimator valueAnimator2 = dragView.mAnim;
        if (valueAnimator2 != null && valueAnimator2.isRunning()) {
            dragView.mAnim.cancel();
        }
        this.mDropView.requestLayout();
        if (view != null) {
            this.mAnchorViewInitialScrollX = view.getScrollX();
        }
        this.mAnchorView = view;
        ValueAnimator valueAnimator3 = new ValueAnimator();
        this.mDropAnim = valueAnimator3;
        valueAnimator3.setInterpolator(timeInterpolator);
        this.mDropAnim.setDuration((long) i);
        this.mDropAnim.setFloatValues(new float[]{0.0f, 1.0f});
        this.mDropAnim.addUpdateListener(animatorUpdateListener);
        this.mDropAnim.addListener(new AnimatorListenerAdapter() {
            public final void onAnimationEnd(Animator animator) {
                Runnable runnable = runnable;
                if (runnable != null) {
                    runnable.run();
                }
                if (i2 == 0) {
                    DragLayer.this.clearAnimatedView();
                }
            }
        });
        this.mDropAnim.start();
    }

    public final void animateView$ar$ds(DragView dragView, Rect rect, Rect rect2, float f, float f2, float f3, int i, Interpolator interpolator, Interpolator interpolator2, Runnable runnable, int i2, View view) {
        int i3;
        Rect rect3 = rect;
        Rect rect4 = rect2;
        float hypot = (float) Math.hypot((double) (rect4.left - rect3.left), (double) (rect4.top - rect3.top));
        Resources resources = getResources();
        float integer = (float) resources.getInteger(R.integer.config_dropAnimMaxDist);
        if (i < 0) {
            int integer2 = resources.getInteger(R.integer.config_dropAnimMaxDuration);
            if (hypot < integer) {
                integer2 = (int) (((float) integer2) * this.mCubicEaseOutInterpolator.getInterpolation(hypot / integer));
            }
            i3 = Math.max(integer2, resources.getInteger(R.integer.config_dropAnimMinDuration));
        } else {
            i3 = i;
        }
        TimeInterpolator timeInterpolator = (interpolator2 == null || interpolator == null) ? this.mCubicEaseOutInterpolator : null;
        final float alpha = dragView.getAlpha();
        final float scaleX = dragView.getScaleX();
        final DragView dragView2 = dragView;
        final Interpolator interpolator3 = interpolator2;
        final Interpolator interpolator4 = interpolator;
        final float f4 = f2;
        final float f5 = f3;
        final float f6 = f;
        final Rect rect5 = rect;
        final Rect rect6 = rect2;
        animateView(dragView, new ValueAnimator.AnimatorUpdateListener() {
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                float f;
                float f2;
                int i;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                int measuredWidth = dragView2.getMeasuredWidth();
                int measuredHeight = dragView2.getMeasuredHeight();
                Interpolator interpolator = interpolator3;
                if (interpolator == null) {
                    f = floatValue;
                } else {
                    f = interpolator.getInterpolation(floatValue);
                }
                Interpolator interpolator2 = interpolator4;
                if (interpolator2 == null) {
                    f2 = floatValue;
                } else {
                    f2 = interpolator2.getInterpolation(floatValue);
                }
                float f3 = scaleX;
                float f4 = (1.0f - floatValue) * f3;
                float f5 = (f4 * floatValue) + f4;
                float f6 = (f5 * floatValue) + f4;
                float f7 = (f6 * f) + (alpha * (1.0f - f));
                float f8 = f3 - 4.0f;
                float f9 = ((float) rect5.left) + ((((float) measuredWidth) * f8) / 2.0f);
                float f10 = ((float) rect5.top) + ((f8 * ((float) measuredHeight)) / 2.0f);
                int round = (int) (f9 + ((float) Math.round((((float) rect6.left) - f9) * f2)));
                int round2 = (int) (f10 + ((float) Math.round((((float) rect6.top) - f10) * f2)));
                View view = DragLayer.this.mAnchorView;
                if (view == null) {
                    i = 0;
                } else {
                    float scaleX = view.getScaleX();
                    DragLayer dragLayer = DragLayer.this;
                    i = (int) (scaleX * ((float) (dragLayer.mAnchorViewInitialScrollX - dragLayer.mAnchorView.getScrollX())));
                }
                int scrollX = DragLayer.this.mDropView.getScrollX();
                int scrollY = DragLayer.this.mDropView.getScrollY();
                DragLayer.this.mDropView.setTranslationX((float) ((round - scrollX) + i));
                DragLayer.this.mDropView.setTranslationY((float) (round2 - scrollY));
                DragLayer.this.mDropView.setScaleX(f5);
                DragLayer.this.mDropView.setScaleY(f6);
                DragLayer.this.mDropView.setAlpha(f7);
            }
        }, i3, timeInterpolator, runnable, i2, view);
    }

    public final void animateViewIntoPosition(DragView dragView, View view, int i, Runnable runnable, View view2) {
        float f;
        int i2;
        int i3;
        int i4;
        int round;
        DragView dragView2 = dragView;
        final View view3 = view;
        CellLayout.LayoutParams layoutParams = (CellLayout.LayoutParams) view.getLayoutParams();
        ((ShortcutAndWidgetContainer) view.getParent()).measureChild(view3);
        Rect rect = new Rect();
        getViewRectRelativeToSelf(dragView, rect);
        float scaleX = view.getScaleX();
        float f2 = 1.0f - scaleX;
        int[] iArr = {layoutParams.f16547x + ((int) ((((float) view.getMeasuredWidth()) * f2) / 2.0f)), layoutParams.f16548y + ((int) ((((float) view.getMeasuredHeight()) * f2) / 2.0f))};
        float descendantCoordRelativeToParent = Utilities.getDescendantCoordRelativeToParent((View) view.getParent(), this, iArr, false) * scaleX;
        int i5 = iArr[0];
        int i6 = iArr[1];
        if (view3 instanceof TextView) {
            float f3 = descendantCoordRelativeToParent / dragView2.mIntrinsicIconScale;
            i2 = (int) (((float) (i6 + Math.round(((float) ((TextView) view3).getPaddingTop()) * f3))) - ((((float) dragView.getMeasuredHeight()) * (1.0f - f3)) / 2.0f));
            Point point = dragView2.mDragVisualizeOffset;
            if (point != null) {
                i2 -= Math.round(((float) point.y) * f3);
            }
            i3 = i5 - ((dragView.getMeasuredWidth() - Math.round(descendantCoordRelativeToParent * ((float) view.getMeasuredWidth()))) / 2);
            f = f3;
        } else {
            if (view3 instanceof FolderIcon) {
                round = (int) (((float) ((int) (((float) (i6 + Math.round(((float) (view.getPaddingTop() - dragView2.mDragRegion.top)) * descendantCoordRelativeToParent))) - ((descendantCoordRelativeToParent + descendantCoordRelativeToParent) / 2.0f)))) - (((1.0f - descendantCoordRelativeToParent) * ((float) dragView.getMeasuredHeight())) / 2.0f));
                i4 = (dragView.getMeasuredWidth() - Math.round(((float) view.getMeasuredWidth()) * descendantCoordRelativeToParent)) / 2;
            } else {
                round = i6 - (Math.round(((float) (dragView.getHeight() - view.getMeasuredHeight())) * descendantCoordRelativeToParent) / 2);
                i4 = Math.round(((float) (dragView.getMeasuredWidth() - view.getMeasuredWidth())) * descendantCoordRelativeToParent) / 2;
            }
            f = descendantCoordRelativeToParent;
            i3 = i5 - i4;
        }
        int i7 = rect.left;
        int i8 = rect.top;
        view3.setVisibility(4);
        final Runnable runnable2 = runnable;
        animateViewIntoPosition$ar$ds(dragView, i7, i8, i3, i2, 1.0f, f, f, new Runnable() {
            public final void run() {
                view3.setVisibility(0);
                Runnable runnable = runnable2;
                if (runnable != null) {
                    runnable.run();
                }
            }
        }, 0, i, view2);
    }

    public final void animateViewIntoPosition$ar$ds(DragView dragView, int i, int i2, int i3, int i4, float f, float f2, float f3, Runnable runnable, int i5, int i6, View view) {
        int i7 = i2;
        int i8 = i3;
        int i9 = i4;
        animateView$ar$ds(dragView, new Rect(i, i7, dragView.getMeasuredWidth() + i, dragView.getMeasuredHeight() + i7), new Rect(i8, i9, dragView.getMeasuredWidth() + i8, dragView.getMeasuredHeight() + i9), f, f2, f3, i6, (Interpolator) null, (Interpolator) null, runnable, i5, view);
    }

    public final void bringChildToFront(View view) {
        super.bringChildToFront(view);
        View view2 = this.mOverlayView;
        if (!(view == view2 || view2 == null)) {
            view2.bringToFront();
        }
        updateChildIndices();
    }

    /* access modifiers changed from: protected */
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof LayoutParams;
    }

    public final void clearAllResizeFrames() {
        if (this.mResizeFrames.size() > 0) {
            ArrayList arrayList = this.mResizeFrames;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                AppWidgetResizeFrame appWidgetResizeFrame = (AppWidgetResizeFrame) arrayList.get(i);
                appWidgetResizeFrame.resizeWidgetIfNeeded(true);
                appWidgetResizeFrame.requestLayout();
                removeView(appWidgetResizeFrame);
            }
            this.mResizeFrames.clear();
        }
    }

    public final void clearAnimatedView() {
        ValueAnimator valueAnimator = this.mDropAnim;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        DragView dragView = this.mDropView;
        if (dragView != null) {
            DragController dragController = this.mDragController;
            dragView.remove();
            if (dragController.mDragObject.deferDragViewCleanupPostAnimation) {
                ArrayList arrayList = new ArrayList(dragController.mListeners);
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    ((DragController.DragListener) arrayList.get(i)).onDragEnd();
                }
            }
        }
        this.mDropView = null;
        invalidate();
    }

    /* access modifiers changed from: protected */
    public final void dispatchDraw(Canvas canvas) {
        float f = this.mBackgroundAlpha;
        if (f > 0.0f) {
            canvas.drawColor(((int) (f * 255.0f)) << 24);
        }
        super.dispatchDraw(canvas);
    }

    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return this.mDragController.mDragging || super.dispatchKeyEvent(keyEvent);
    }

    public final boolean dispatchUnhandledMove(View view, int i) {
        View view2 = this.mDragController.mMoveTarget;
        return view2 != null && view2.dispatchUnhandledMove(view, i);
    }

    /* access modifiers changed from: protected */
    public final boolean drawChild(Canvas canvas, View view, long j) {
        Drawable drawable;
        Drawable drawable2;
        boolean drawChild = super.drawChild(canvas, view, j);
        if ((view instanceof Workspace) && this.mShowPageHints) {
            Workspace workspace = this.mLauncher.mWorkspace;
            int measuredWidth = getMeasuredWidth();
            int nextPage = workspace.getNextPage();
            CellLayout cellLayout = (CellLayout) workspace.getChildAt(this.mIsRtl ? nextPage + 1 : nextPage - 1);
            CellLayout cellLayout2 = (CellLayout) workspace.getChildAt(this.mIsRtl ? nextPage - 1 : nextPage + 1);
            if (cellLayout != null && cellLayout.mIsDragTarget) {
                if (!this.mInScrollArea || !cellLayout.mIsDragOverlapping) {
                    drawable2 = this.mLeftHoverDrawable;
                } else {
                    drawable2 = this.mLeftHoverDrawableActive;
                }
                drawable2.setBounds(0, this.mScrollChildPosition.top, drawable2.getIntrinsicWidth(), this.mScrollChildPosition.bottom);
                drawable2.draw(canvas);
            }
            if (cellLayout2 != null && cellLayout2.mIsDragTarget) {
                if (!this.mInScrollArea || !cellLayout2.mIsDragOverlapping) {
                    drawable = this.mRightHoverDrawable;
                } else {
                    drawable = this.mRightHoverDrawableActive;
                }
                drawable.setBounds(measuredWidth - drawable.getIntrinsicWidth(), this.mScrollChildPosition.top, measuredWidth, this.mScrollChildPosition.bottom);
                drawable.draw(canvas);
            }
        }
        return drawChild;
    }

    /* access modifiers changed from: protected */
    public final int getChildDrawingOrder(int i, int i2) {
        if (this.mChildCountOnLastUpdate != i) {
            updateChildIndices();
        }
        int i3 = this.mTopViewIndex;
        if (i3 == -1) {
            return i2;
        }
        if (i2 == i - 1) {
            return i3;
        }
        return i2 < i3 ? i2 : i2 + 1;
    }

    public final float getDescendantRectRelativeToSelf(View view, Rect rect) {
        int[] iArr = this.mTmpXY;
        iArr[0] = 0;
        iArr[1] = 0;
        float descendantCoordRelativeToParent = Utilities.getDescendantCoordRelativeToParent(view, this, iArr, false);
        int[] iArr2 = this.mTmpXY;
        int i = iArr2[0];
        rect.set(i, iArr2[1], (int) (((float) i) + (((float) view.getMeasuredWidth()) * descendantCoordRelativeToParent)), (int) (((float) this.mTmpXY[1]) + (((float) view.getMeasuredHeight()) * descendantCoordRelativeToParent)));
        return descendantCoordRelativeToParent;
    }

    public final float getLocationInDragLayer(View view, int[] iArr) {
        iArr[0] = 0;
        iArr[1] = 0;
        return Utilities.getDescendantCoordRelativeToParent(view, this, iArr, false);
    }

    public final void getViewRectRelativeToSelf(View view, Rect rect) {
        int[] iArr = new int[2];
        getLocationInWindow(iArr);
        int i = iArr[0];
        int i2 = iArr[1];
        view.getLocationInWindow(iArr);
        int i3 = iArr[0] - i;
        int i4 = iArr[1] - i2;
        rect.set(i3, i4, view.getMeasuredWidth() + i3, view.getMeasuredHeight() + i4);
    }

    public final boolean isEventOverView(View view, MotionEvent motionEvent) {
        getDescendantRectRelativeToSelf(view, this.mHitRect);
        return this.mHitRect.contains((int) motionEvent.getX(), (int) motionEvent.getY());
    }

    public final void onChildViewAdded(View view, View view2) {
        super.onChildViewAdded(view, view2);
        View view3 = this.mOverlayView;
        if (view3 != null) {
            view3.bringToFront();
        }
        updateChildIndices();
    }

    public final void onChildViewRemoved(View view, View view2) {
        updateChildIndices();
    }

    /* access modifiers changed from: package-private */
    public final void onEnterScrollArea$ar$ds() {
        this.mInScrollArea = true;
        invalidate();
    }

    /* access modifiers changed from: package-private */
    public final void onExitScrollArea() {
        this.mInScrollArea = false;
        invalidate();
    }

    public final boolean onHoverEvent(MotionEvent motionEvent) {
        return false;
    }

    public final boolean onInterceptHoverEvent(MotionEvent motionEvent) {
        Workspace workspace;
        Folder openFolder;
        Launcher launcher = this.mLauncher;
        if (!(launcher == null || (workspace = launcher.mWorkspace) == null || (openFolder = workspace.getOpenFolder()) == null || !((AccessibilityManager) getContext().getSystemService("accessibility")).isTouchExplorationEnabled())) {
            int action = motionEvent.getAction();
            if (action != 7) {
                if (action == 9) {
                    if (isEventOverFolder(openFolder, motionEvent) || (isInAccessibleDrag$ar$ds() && isEventOverDropTargetBar(motionEvent))) {
                        this.mHoverPointClosesFolder = false;
                    } else {
                        sendTapOutsideFolderAccessibilityEvent(openFolder.mIsEditingName);
                        this.mHoverPointClosesFolder = true;
                        return true;
                    }
                }
            } else if (isEventOverFolder(openFolder, motionEvent) || (isInAccessibleDrag$ar$ds() && isEventOverDropTargetBar(motionEvent))) {
                this.mHoverPointClosesFolder = false;
            } else {
                if (!this.mHoverPointClosesFolder) {
                    sendTapOutsideFolderAccessibilityEvent(openFolder.mIsEditingName);
                    this.mHoverPointClosesFolder = true;
                }
                return true;
            }
        }
        return false;
    }

    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        PointF pointF = null;
        if (action == 0) {
            if (handleTouchDown(motionEvent, true)) {
                return true;
            }
        } else if (action == 1 || action == 3) {
            TouchCompleteListener touchCompleteListener = this.mTouchCompleteListener;
            if (touchCompleteListener != null) {
                touchCompleteListener.onTouchComplete();
            }
            this.mTouchCompleteListener = null;
        }
        clearAllResizeFrames();
        DragController dragController = this.mDragController;
        if (dragController.mIsAccessibleDrag) {
            return false;
        }
        dragController.acquireVelocityTrackerAndAddMovement(motionEvent);
        int action2 = motionEvent.getAction();
        int[] clampedDragLayerPos = dragController.getClampedDragLayerPos(motionEvent.getX(), motionEvent.getY());
        int i = clampedDragLayerPos[0];
        int i2 = clampedDragLayerPos[1];
        if (action2 == 0) {
            dragController.mMotionDownX = i;
            dragController.mMotionDownY = i2;
            dragController.mLastDropTarget = null;
        } else if (action2 == 1) {
            dragController.mLastTouchUpTime = System.currentTimeMillis();
            if (dragController.mDragging) {
                PointF isFlingingToDelete = dragController.isFlingingToDelete(dragController.mDragObject.dragSource);
                if (true == DeleteDropTarget.supportsDrop(dragController.mDragObject.dragInfo)) {
                    pointF = isFlingingToDelete;
                }
                if (pointF != null) {
                    dragController.dropOnFlingToDeleteTarget$ar$ds(pointF);
                } else {
                    dragController.drop((float) i, (float) i2);
                }
            }
            dragController.endDrag();
        } else if (action2 == 3) {
            dragController.cancelDrag();
        }
        return dragController.mDragging;
    }

    /* access modifiers changed from: protected */
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        int childCount = getChildCount();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            if (layoutParams instanceof LayoutParams) {
                LayoutParams layoutParams2 = (LayoutParams) layoutParams;
                if (layoutParams2.customPosition) {
                    int i6 = layoutParams2.f16550x;
                    childAt.layout(i6, layoutParams2.f16551y, layoutParams2.width + i6, layoutParams2.f16551y + layoutParams2.height);
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    public final boolean onRequestFocusInDescendants(int i, Rect rect) {
        View topFloatingView = this.mLauncher.getTopFloatingView();
        if (topFloatingView != null) {
            return topFloatingView.requestFocus(i, rect);
        }
        return super.onRequestFocusInDescendants(i, rect);
    }

    public final boolean onRequestSendAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        View topFloatingView = this.mLauncher.getTopFloatingView();
        if (topFloatingView == null) {
            return super.onRequestSendAccessibilityEvent(view, accessibilityEvent);
        }
        if (view == topFloatingView) {
            return super.onRequestSendAccessibilityEvent(view, accessibilityEvent);
        }
        if (!isInAccessibleDrag$ar$ds() || !(view instanceof SearchDropTargetBar)) {
            return false;
        }
        return super.onRequestSendAccessibilityEvent(view, accessibilityEvent);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0033, code lost:
        if (r0 != 3) goto L_0x006f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean onTouchEvent(android.view.MotionEvent r9) {
        /*
            r8 = this;
            int r0 = r9.getAction()
            float r1 = r9.getX()
            int r1 = (int) r1
            float r2 = r9.getY()
            int r2 = (int) r2
            r3 = 0
            r4 = 3
            r5 = 0
            r6 = 1
            if (r0 != 0) goto L_0x001c
            boolean r7 = r8.handleTouchDown(r9, r5)
            if (r7 != 0) goto L_0x001b
            goto L_0x002a
        L_0x001b:
            return r6
        L_0x001c:
            if (r0 == r6) goto L_0x0021
            if (r0 != r4) goto L_0x002a
            r0 = 3
        L_0x0021:
            com.android.launcher3.DragLayer$TouchCompleteListener r7 = r8.mTouchCompleteListener
            if (r7 == 0) goto L_0x0028
            r7.onTouchComplete()
        L_0x0028:
            r8.mTouchCompleteListener = r3
        L_0x002a:
            com.android.launcher3.AppWidgetResizeFrame r7 = r8.mCurrentResizeFrame
            if (r7 == 0) goto L_0x0070
            if (r0 == r6) goto L_0x0040
            r9 = 2
            if (r0 == r9) goto L_0x0036
            if (r0 == r4) goto L_0x0040
            goto L_0x006f
        L_0x0036:
            int r9 = r8.mXDown
            int r1 = r1 - r9
            int r9 = r8.mYDown
            int r2 = r2 - r9
            r7.visualizeResizeForDelta$ar$ds(r1, r2)
            goto L_0x006f
        L_0x0040:
            int r9 = r8.mXDown
            int r1 = r1 - r9
            int r9 = r8.mYDown
            int r2 = r2 - r9
            r7.visualizeResizeForDelta$ar$ds(r1, r2)
            com.android.launcher3.AppWidgetResizeFrame r9 = r8.mCurrentResizeFrame
            com.android.launcher3.CellLayout r0 = r9.mCellLayout
            int r1 = r0.mCellWidth
            int r2 = r0.mWidthGap
            int r2 = r0.mCellHeight
            int r0 = r0.mHeightGap
            int r0 = r9.mRunningHInc
            int r0 = r0 * r1
            r9.mDeltaXAddOn = r0
            int r0 = r9.mRunningVInc
            int r0 = r0 * r2
            r9.mDeltaYAddOn = r0
            r9.mDeltaX = r5
            r9.mDeltaY = r5
            com.android.launcher3.AppWidgetResizeFrame$1 r0 = new com.android.launcher3.AppWidgetResizeFrame$1
            r0.<init>()
            r9.post(r0)
            r8.mCurrentResizeFrame = r3
        L_0x006f:
            return r6
        L_0x0070:
            com.android.launcher3.DragController r0 = r8.mDragController
            boolean r9 = r0.onTouchEvent(r9)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.launcher3.DragLayer.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public final void setBackgroundAlpha(float f) {
        if (f != this.mBackgroundAlpha) {
            this.mBackgroundAlpha = f;
            invalidate();
        }
    }

    public final LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }
}
