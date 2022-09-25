package com.android.launcher3;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.LayoutTransition;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Bundle;
import android.support.p033v7.widget.LinearLayoutManager;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import com.android.launcher3.PageIndicator;
import com.android.launcher3.util.LauncherEdgeEffect;
import com.google.android.googlequicksearchbox.R;
import java.util.ArrayList;
import org.chromium.net.PrivateKeyType;

/* compiled from: PG */
public abstract class PagedView extends ViewGroup implements ViewGroup.OnHierarchyChangeListener {
    private static final int[] sTmpIntPoint = new int[2];
    private static final Matrix sTmpInvMatrix = new Matrix();
    private static final float[] sTmpPoint = new float[2];
    private static final Rect sTmpRect = new Rect();
    private static final RectF sTmpRectF = new RectF();
    private int NUM_ANIMATIONS_RUNNING_BEFORE_ZOOM_OUT;
    protected int mActivePointerId;
    protected boolean mAllowOverScroll;
    private boolean mCancelTap;
    protected boolean mCenterPagesVertically;
    protected int mChildCountOnLastLayout;
    public int mCurrentPage;
    private Interpolator mDefaultInterpolator;
    private float mDownMotionX;
    private float mDownMotionY;
    private float mDownScrollX;
    protected View mDragView;
    public float mDragViewBaselineLeft;
    private final LauncherEdgeEffect mEdgeGlowLeft;
    private final LauncherEdgeEffect mEdgeGlowRight;
    protected boolean mFirstLayout;
    protected int mFlingThresholdVelocity;
    protected boolean mForceScreenScrolled;
    private boolean mFreeScroll;
    private int mFreeScrollMaxScrollX;
    private int mFreeScrollMinScrollX;
    protected final Rect mInsets;
    protected boolean mIsPageMoving;
    public boolean mIsReordering;
    protected final boolean mIsRtl;
    protected float mLastMotionX;
    protected float mLastMotionXRemainder;
    protected float mLastMotionY;
    private int mLastScreenCenter;
    protected View.OnLongClickListener mLongClickListener;
    protected int mMaxScrollX;
    private int mMaximumVelocity;
    protected int mMinFlingVelocity;
    public float mMinScale;
    protected int mMinSnapVelocity;
    protected int mNextPage;
    public int mNormalChildHeight;
    PageIndicator mPageIndicator;
    int mPageIndicatorViewId;
    private int[] mPageScrolls;
    int mPageSpacing;
    public PageSwitchListener mPageSwitchListener;
    private float mParentDownMotionX;
    private float mParentDownMotionY;
    private int mPostReorderingPreZoomInRemainingAnimationCount;
    private Runnable mPostReorderingPreZoomInRunnable;
    public boolean mReorderingStarted;
    protected int mRestorePage;
    protected LauncherScroller mScroller;
    int mSidePageHoverIndex;
    private Runnable mSidePageHoverRunnable;
    protected int[] mTempVisiblePagesRange;
    protected float mTotalMotionX;
    protected int mTouchSlop;
    protected int mTouchState;
    protected float mTouchX;
    public boolean mUseMinScale;
    private VelocityTracker mVelocityTracker;
    public Rect mViewport;
    protected boolean mWasInOverscroll;

    /* compiled from: PG */
    public final class LayoutParams extends ViewGroup.LayoutParams {
        public final boolean isFullScreenPage = false;

        public LayoutParams() {
            super(-2, -2);
        }

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public LayoutParams(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }
    }

    /* compiled from: PG */
    public interface PageSwitchListener {
    }

    /* compiled from: PG */
    final class ScrollInterpolator implements Interpolator {
        public final float getInterpolation(float f) {
            float f2 = f - 4.0f;
            return (f2 * f2 * f2 * f2 * f2) + 1.0f;
        }
    }

    public PagedView(Context context) {
        this(context, (AttributeSet) null);
    }

    private final void abortScrollerAnimation(boolean z) {
        LauncherScroller launcherScroller = this.mScroller;
        launcherScroller.mCurrX = launcherScroller.mFinalX;
        launcherScroller.mCurrY = launcherScroller.mFinalY;
        launcherScroller.mFinished = true;
        if (z) {
            this.mNextPage = -1;
        }
    }

    private final void acquireVelocityTrackerAndAddMovement(MotionEvent motionEvent) {
        if (this.mVelocityTracker == null) {
            this.mVelocityTracker = VelocityTracker.obtain();
        }
        this.mVelocityTracker.addMovement(motionEvent);
    }

    private final void forceFinishScroller() {
        this.mScroller.mFinished = true;
        this.mNextPage = -1;
    }

    private final boolean isTouchPointInViewportWithBuffer(int i, int i2) {
        Rect rect = sTmpRect;
        rect.set(this.mViewport.left - (this.mViewport.width() / 2), this.mViewport.top, this.mViewport.right + (this.mViewport.width() / 2), this.mViewport.bottom);
        return rect.contains(i, i2);
    }

    private static final float[] mapPointFromParentToView$ar$ds(View view, float f, float f2) {
        float[] fArr = sTmpPoint;
        fArr[0] = f - ((float) view.getLeft());
        fArr[1] = f2 - ((float) view.getTop());
        Matrix matrix = view.getMatrix();
        Matrix matrix2 = sTmpInvMatrix;
        matrix.invert(matrix2);
        matrix2.mapPoints(fArr);
        return fArr;
    }

    private static final float[] mapPointFromViewToParent$ar$ds(View view, float f, float f2) {
        float[] fArr = sTmpPoint;
        fArr[0] = f;
        fArr[1] = f2;
        view.getMatrix().mapPoints(fArr);
        fArr[0] = fArr[0] + ((float) view.getLeft());
        fArr[1] = fArr[1] + ((float) view.getTop());
        return fArr;
    }

    private final void onSecondaryPointerUp(MotionEvent motionEvent) {
        int action = (motionEvent.getAction() >> 8) & PrivateKeyType.INVALID;
        if (motionEvent.getPointerId(action) == this.mActivePointerId) {
            int i = action == 0 ? 1 : 0;
            float x = motionEvent.getX(i);
            this.mDownMotionX = x;
            this.mLastMotionX = x;
            this.mLastMotionY = motionEvent.getY(i);
            this.mLastMotionXRemainder = 0.0f;
            this.mActivePointerId = motionEvent.getPointerId(i);
            VelocityTracker velocityTracker = this.mVelocityTracker;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    private final void releaseVelocityTracker() {
        VelocityTracker velocityTracker = this.mVelocityTracker;
        if (velocityTracker != null) {
            velocityTracker.clear();
            this.mVelocityTracker.recycle();
            this.mVelocityTracker = null;
        }
    }

    private final void removeMarkerForView(int i) {
        PageIndicator pageIndicator = this.mPageIndicator;
        if (pageIndicator != null && !isReordering(false)) {
            pageIndicator.removeMarker$ar$ds(i);
        }
    }

    private final void resetTouchState() {
        releaseVelocityTracker();
        if (this.mReorderingStarted) {
            this.mReorderingStarted = false;
            this.mPostReorderingPreZoomInRunnable = new Runnable() {
                public final void run() {
                    PagedView.this.onEndReordering();
                    PagedView.this.enableFreeScroll$ar$ds();
                }
            };
            this.mPostReorderingPreZoomInRemainingAnimationCount = this.NUM_ANIMATIONS_RUNNING_BEFORE_ZOOM_OUT;
            snapToPage(indexOfChild(this.mDragView), 0, false, (TimeInterpolator) null);
            if (this.mDragView != null) {
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.setDuration(200);
                animatorSet.playTogether(new Animator[]{ObjectAnimator.ofFloat(this.mDragView, "translationX", new float[]{0.0f}), ObjectAnimator.ofFloat(this.mDragView, "translationY", new float[]{0.0f}), ObjectAnimator.ofFloat(this.mDragView, "scaleX", new float[]{1.0f}), ObjectAnimator.ofFloat(this.mDragView, "scaleY", new float[]{1.0f})});
                animatorSet.addListener(new AnimatorListenerAdapter() {
                    public final void onAnimationEnd(Animator animator) {
                        PagedView.this.onPostReorderingAnimationCompleted();
                    }
                });
                animatorSet.start();
            }
        }
        this.mCancelTap = false;
        this.mTouchState = 0;
        this.mActivePointerId = -1;
        this.mEdgeGlowLeft.onRelease();
        this.mEdgeGlowRight.onRelease();
    }

    private final void updateDragViewTranslationDuringDrag() {
        if (this.mDragView != null) {
            float f = this.mLastMotionX;
            float f2 = this.mDownMotionX;
            int scrollX = getScrollX();
            float f3 = this.mDownScrollX;
            float f4 = this.mDragViewBaselineLeft;
            int left = this.mDragView.getLeft();
            float f5 = this.mLastMotionY;
            float f6 = this.mDownMotionY;
            this.mDragView.setTranslationX((f - f2) + (((float) scrollX) - f3) + (f4 - ((float) left)));
            this.mDragView.setTranslationY(f5 - f6);
        }
    }

    private final void updatePageIndicator() {
        PageIndicator pageIndicator = this.mPageIndicator;
        if (pageIndicator != null) {
            pageIndicator.setContentDescription(getPageIndicatorDescription());
            if (!isReordering(false)) {
                this.mPageIndicator.setActiveMarker(getNextPage());
            }
        }
    }

    private final int validateNewPage(int i) {
        if (this.mFreeScroll) {
            getFreeScrollPageRange(this.mTempVisiblePagesRange);
            int[] iArr = this.mTempVisiblePagesRange;
            i = Math.max(iArr[0], Math.min(i, iArr[1]));
        }
        return Math.max(0, Math.min(i, getChildCount() - 1));
    }

    public final void addFocusables(ArrayList arrayList, int i, int i2) {
        if (getDescendantFocusability() != 393216) {
            int i3 = this.mCurrentPage;
            if (i3 >= 0 && i3 < getChildCount()) {
                getPageAt(this.mCurrentPage).addFocusables(arrayList, i, i2);
            }
            if (i == 17) {
                int i4 = this.mCurrentPage;
                if (i4 > 0) {
                    getPageAt(i4 - 1).addFocusables(arrayList, 17, i2);
                }
            } else if (i == 66 && this.mCurrentPage < getChildCount() - 1) {
                getPageAt(this.mCurrentPage + 1).addFocusables(arrayList, 66, i2);
            }
        }
    }

    /* access modifiers changed from: protected */
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof LayoutParams;
    }

    public void computeScroll() {
        computeScrollHelper$ar$ds();
    }

    /* access modifiers changed from: protected */
    public final void computeScrollHelper$ar$ds() {
        float f;
        float f2;
        LauncherScroller launcherScroller = this.mScroller;
        if (!launcherScroller.mFinished) {
            int currentAnimationTimeMillis = (int) (AnimationUtils.currentAnimationTimeMillis() - launcherScroller.mStartTime);
            int i = launcherScroller.mDuration;
            if (currentAnimationTimeMillis < i) {
                float f3 = 0.0f;
                if (launcherScroller.mMode != 0) {
                    float f4 = (float) i;
                    float f5 = ((float) currentAnimationTimeMillis) / f4;
                    int i2 = (int) (f5 * 100.0f);
                    if (i2 < 100) {
                        float f6 = ((float) i2) / 100.0f;
                        int i3 = i2 + 1;
                        float[] fArr = LauncherScroller.SPLINE_POSITION;
                        float f7 = fArr[i2];
                        float f8 = (fArr[i3] - f7) / ((((float) i3) / 100.0f) - f6);
                        f2 = f7 + ((f5 - f6) * f8);
                        f3 = f8;
                    } else {
                        f2 = 1.0f;
                    }
                    launcherScroller.mCurrVelocity = ((f3 * ((float) launcherScroller.mDistance)) / f4) * 1000.0f;
                    int i4 = launcherScroller.mStartX;
                    int round = i4 + Math.round(((float) (launcherScroller.mFinalX - i4)) * f2);
                    launcherScroller.mCurrX = round;
                    int min = Math.min(round, launcherScroller.mMaxX);
                    launcherScroller.mCurrX = min;
                    launcherScroller.mCurrX = Math.max(min, launcherScroller.mMinX);
                    int i5 = launcherScroller.mStartY;
                    int round2 = i5 + Math.round(f2 * ((float) (launcherScroller.mFinalY - i5)));
                    launcherScroller.mCurrY = round2;
                    int min2 = Math.min(round2, 0);
                    launcherScroller.mCurrY = min2;
                    int max = Math.max(min2, 0);
                    launcherScroller.mCurrY = max;
                    if (launcherScroller.mCurrX == launcherScroller.mFinalX && max == launcherScroller.mFinalY) {
                        launcherScroller.mFinished = true;
                    }
                } else {
                    float f9 = ((float) currentAnimationTimeMillis) * launcherScroller.mDurationReciprocal;
                    TimeInterpolator timeInterpolator = launcherScroller.mInterpolator;
                    if (timeInterpolator == null) {
                        f = LauncherScroller.viscousFluid(f9);
                    } else {
                        f = timeInterpolator.getInterpolation(f9);
                    }
                    launcherScroller.mCurrX = launcherScroller.mStartX + Math.round(launcherScroller.mDeltaX * f);
                    launcherScroller.mCurrY = launcherScroller.mStartY + Math.round(f * 0.0f);
                }
            } else {
                launcherScroller.mCurrX = launcherScroller.mFinalX;
                launcherScroller.mCurrY = launcherScroller.mFinalY;
                launcherScroller.mFinished = true;
            }
            if (!(getScrollX() == this.mScroller.mCurrX && getScrollY() == this.mScroller.mCurrY)) {
                float scaleX = this.mFreeScroll ? getScaleX() : 1.0f;
                LauncherScroller launcherScroller2 = this.mScroller;
                scrollTo((int) (((float) launcherScroller2.mCurrX) * (1.0f / scaleX)), launcherScroller2.mCurrY);
            }
            invalidate();
        } else if (this.mNextPage != -1) {
            if (((AccessibilityManager) getContext().getSystemService("accessibility")).isEnabled() && this.mCurrentPage != getNextPage()) {
                AccessibilityEvent obtain = AccessibilityEvent.obtain(4096);
                obtain.setScrollable(true);
                obtain.setScrollX(getScrollX());
                obtain.setScrollY(getScrollY());
                obtain.setMaxScrollX(this.mMaxScrollX);
                obtain.setMaxScrollY(0);
                sendAccessibilityEventUnchecked(obtain);
            }
            this.mCurrentPage = validateNewPage(this.mNextPage);
            this.mNextPage = -1;
            notifyPageSwitchListener();
            if (this.mTouchState == 0) {
                pageEndMoving();
            }
            onPostReorderingAnimationCompleted();
            if (((AccessibilityManager) getContext().getSystemService("accessibility")).isEnabled()) {
                announceForAccessibility(getCurrentPageDescription());
            }
        }
    }

    /* access modifiers changed from: protected */
    public final void dampedOverScroll(float f) {
        float width = f / ((float) this.mViewport.width());
        if (width < 0.0f) {
            this.mEdgeGlowLeft.onPull$ar$ds$b5e92ffc_0(-width);
        } else if (width > 0.0f) {
            this.mEdgeGlowRight.onPull$ar$ds$b5e92ffc_0(width);
        } else {
            return;
        }
        invalidate();
    }

    /* access modifiers changed from: protected */
    public void determineScrollingStart(MotionEvent motionEvent) {
        determineScrollingStart(motionEvent, 1.0f);
    }

    /* access modifiers changed from: protected */
    public final void dispatchDraw(Canvas canvas) {
        int childCount = getChildCount();
        if (childCount > 0) {
            int scrollX = getScrollX() + (this.mViewport.width() / 2);
            if (scrollX != this.mLastScreenCenter || this.mForceScreenScrolled) {
                this.mForceScreenScrolled = false;
                screenScrolled(scrollX);
                this.mLastScreenCenter = scrollX;
            }
            getVisiblePages(this.mTempVisiblePagesRange);
            int[] iArr = this.mTempVisiblePagesRange;
            int i = iArr[0];
            int i2 = iArr[1];
            if (i != -1 && i2 != -1) {
                long drawingTime = getDrawingTime();
                canvas.save();
                canvas.clipRect(getScrollX(), getScrollY(), (getScrollX() + getRight()) - getLeft(), (getScrollY() + getBottom()) - getTop());
                for (int i3 = childCount - 1; i3 >= 0; i3--) {
                    View pageAt = getPageAt(i3);
                    if (pageAt != this.mDragView && i <= i3 && i3 <= i2 && shouldDrawChild(pageAt)) {
                        drawChild(canvas, pageAt, drawingTime);
                    }
                }
                View view = this.mDragView;
                if (view != null) {
                    drawChild(canvas, view, drawingTime);
                }
                canvas.restore();
            }
        }
    }

    public boolean dispatchUnhandledMove(View view, int i) {
        if (super.dispatchUnhandledMove(view, i)) {
            return true;
        }
        if (this.mIsRtl) {
            if (i == 17) {
                i = 66;
            } else if (i == 66) {
                i = 17;
            }
        }
        if (i == 17) {
            int i2 = this.mCurrentPage;
            if (i2 > 0) {
                snapToPage(i2 - 1, 750, false, (TimeInterpolator) null);
                return true;
            }
        } else if (i == 66 && this.mCurrentPage < getChildCount() - 1) {
            snapToPage(this.mCurrentPage + 1, 750, false, (TimeInterpolator) null);
            return true;
        }
        return false;
    }

    public final void draw(Canvas canvas) {
        int i;
        super.draw(canvas);
        if (getChildCount() > 0) {
            if (!this.mEdgeGlowLeft.isFinished()) {
                int save = canvas.save();
                Rect rect = this.mViewport;
                canvas.translate((float) rect.left, (float) rect.top);
                canvas.rotate(270.0f);
                int[] iArr = sTmpIntPoint;
                getEdgeVerticalPostion(iArr);
                canvas.translate((float) (rect.top - iArr[1]), 0.0f);
                this.mEdgeGlowLeft.setSize(iArr[1] - iArr[0], rect.width());
                if (this.mEdgeGlowLeft.draw(canvas)) {
                    postInvalidateOnAnimation();
                }
                canvas.restoreToCount(save);
            }
            if (!this.mEdgeGlowRight.isFinished()) {
                int save2 = canvas.save();
                Rect rect2 = this.mViewport;
                int i2 = rect2.left;
                int[] iArr2 = this.mPageScrolls;
                if (this.mIsRtl) {
                    i = 0;
                } else {
                    i = getChildCount() - 1;
                }
                canvas.translate((float) (i2 + iArr2[i]), (float) rect2.top);
                canvas.rotate(90.0f);
                int[] iArr3 = sTmpIntPoint;
                getEdgeVerticalPostion(iArr3);
                canvas.translate((float) (iArr3[0] - rect2.top), (float) (-rect2.width()));
                this.mEdgeGlowRight.setSize(iArr3[1] - iArr3[0], rect2.width());
                if (this.mEdgeGlowRight.draw(canvas)) {
                    postInvalidateOnAnimation();
                }
                canvas.restoreToCount(save2);
            }
        }
    }

    public void enableFreeScroll$ar$ds() {
        setEnableFreeScroll(true);
    }

    public final void focusableViewAvailable(View view) {
        View pageAt = getPageAt(getNextPage());
        View view2 = view;
        while (view2 != pageAt) {
            if (view2 != this && (view2.getParent() instanceof View)) {
                view2 = (View) view2.getParent();
            } else {
                return;
            }
        }
        super.focusableViewAvailable(view);
    }

    /* access modifiers changed from: protected */
    public final /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new LayoutParams();
    }

    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    /* access modifiers changed from: protected */
    public int getChildGap() {
        return 0;
    }

    /* access modifiers changed from: protected */
    public final int getChildOffset(int i) {
        if (i < 0 || i > getChildCount() - 1) {
            return 0;
        }
        return getPageAt(i).getLeft() - getViewportOffsetX();
    }

    /* access modifiers changed from: protected */
    public String getCurrentPageDescription() {
        return String.format(getContext().getString(R.string.default_scroll_format), new Object[]{Integer.valueOf(getNextPage() + 1), Integer.valueOf(getChildCount())});
    }

    /* access modifiers changed from: protected */
    public abstract void getEdgeVerticalPostion(int[] iArr);

    /* access modifiers changed from: protected */
    public void getFreeScrollPageRange(int[] iArr) {
        iArr[0] = 0;
        iArr[1] = Math.max(0, getChildCount() - 1);
    }

    public final int getLayoutTransitionOffsetForPage(int i) {
        int[] iArr = this.mPageScrolls;
        if (iArr == null || i >= iArr.length || i < 0) {
            return 0;
        }
        View childAt = getChildAt(i);
        boolean z = ((LayoutParams) childAt.getLayoutParams()).isFullScreenPage;
        int paddingRight = this.mIsRtl ? getPaddingRight() : getPaddingLeft();
        return (int) (childAt.getX() - ((float) ((this.mPageScrolls[i] + paddingRight) + getViewportOffsetX())));
    }

    /* access modifiers changed from: package-private */
    public final int getNextPage() {
        int i = this.mNextPage;
        return i != -1 ? i : this.mCurrentPage;
    }

    public View getPageAt(int i) {
        return getChildAt(i);
    }

    /* access modifiers changed from: protected */
    public View.OnClickListener getPageIndicatorClickListener() {
        return null;
    }

    /* access modifiers changed from: protected */
    public String getPageIndicatorDescription() {
        return getCurrentPageDescription();
    }

    /* access modifiers changed from: protected */
    public PageIndicator.PageMarkerResources getPageIndicatorMarker(int i) {
        throw null;
    }

    /* access modifiers changed from: package-private */
    public final int getPageNearestToCenterOfScreen() {
        int viewportOffsetX = getViewportOffsetX() + getScrollX() + (this.mViewport.width() / 2);
        int childCount = getChildCount();
        int i = Integer.MAX_VALUE;
        int i2 = -1;
        for (int i3 = 0; i3 < childCount; i3++) {
            int abs = Math.abs(((getViewportOffsetX() + getChildOffset(i3)) + (getPageAt(i3).getMeasuredWidth() / 2)) - viewportOffsetX);
            if (abs < i) {
                i2 = i3;
            }
            if (abs < i) {
                i = abs;
            }
        }
        return i2;
    }

    /* access modifiers changed from: protected */
    public Matrix getPageShiftMatrix() {
        return getMatrix();
    }

    public final int getScrollForPage(int i) {
        int[] iArr = this.mPageScrolls;
        if (iArr == null || i >= iArr.length || i < 0) {
            return 0;
        }
        return iArr[i];
    }

    /* access modifiers changed from: protected */
    public int getUnboundedScrollX() {
        return getScrollX();
    }

    /* access modifiers changed from: package-private */
    public final int getViewportOffsetX() {
        return (getMeasuredWidth() - this.mViewport.width()) / 2;
    }

    /* access modifiers changed from: protected */
    public final void getVisiblePages(int[] iArr) {
        int childCount = getChildCount();
        iArr[0] = -1;
        iArr[1] = -1;
        if (childCount > 0) {
            int i = -getLeft();
            int width = this.mViewport.width() + i;
            Matrix pageShiftMatrix = getPageShiftMatrix();
            int i2 = 0;
            for (int i3 = 0; i3 < childCount; i3++) {
                View pageAt = getPageAt(i3);
                RectF rectF = sTmpRectF;
                rectF.left = 0.0f;
                rectF.right = (float) pageAt.getMeasuredWidth();
                pageAt.getMatrix().mapRect(rectF);
                rectF.offset((float) (pageAt.getLeft() - getScrollX()), 0.0f);
                pageShiftMatrix.mapRect(rectF);
                if (rectF.left > ((float) width) || rectF.right < ((float) i)) {
                    if (iArr[0] != -1) {
                        break;
                    }
                } else {
                    if (iArr[0] < 0) {
                        iArr[0] = i3;
                    }
                    i2 = i3;
                }
            }
            iArr[1] = i2;
            return;
        }
        iArr[0] = -1;
        iArr[1] = -1;
    }

    /* access modifiers changed from: package-private */
    public final boolean isReordering(boolean z) {
        boolean z2 = this.mIsReordering;
        if (!z) {
            return z2;
        }
        return (this.mTouchState == 4) & z2;
    }

    /* access modifiers changed from: protected */
    public void notifyPageSwitchListener() {
        if (this.mPageSwitchListener != null) {
            getPageAt(getNextPage());
        }
        updatePageIndicator();
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        int i;
        super.onAttachedToWindow();
        ViewGroup viewGroup = (ViewGroup) ((ViewGroup) getParent()).getParent();
        if (this.mPageIndicator == null && (i = this.mPageIndicatorViewId) >= 0) {
            PageIndicator pageIndicator = (PageIndicator) viewGroup.findViewById(i);
            this.mPageIndicator = pageIndicator;
            pageIndicator.removeAllMarkers$ar$ds();
            ArrayList arrayList = new ArrayList();
            for (int i2 = 0; i2 < getChildCount(); i2++) {
                arrayList.add(getPageIndicatorMarker(i2));
            }
            PageIndicator pageIndicator2 = this.mPageIndicator;
            for (int i3 = 0; i3 < arrayList.size(); i3++) {
                pageIndicator2.addMarker$ar$ds(Integer.MAX_VALUE, (PageIndicator.PageMarkerResources) arrayList.get(i3));
            }
            View.OnClickListener pageIndicatorClickListener = getPageIndicatorClickListener();
            if (pageIndicatorClickListener != null) {
                this.mPageIndicator.setOnClickListener(pageIndicatorClickListener);
            }
            this.mPageIndicator.setContentDescription(getPageIndicatorDescription());
        }
    }

    public void onChildViewAdded(View view, View view2) {
        if (this.mPageIndicator != null && !isReordering(false)) {
            int indexOfChild = indexOfChild(view2);
            this.mPageIndicator.addMarker$ar$ds(indexOfChild, getPageIndicatorMarker(indexOfChild));
        }
        this.mForceScreenScrolled = true;
        updateFreescrollBounds();
        invalidate();
    }

    public final void onChildViewRemoved(View view, View view2) {
        this.mForceScreenScrolled = true;
        updateFreescrollBounds();
        invalidate();
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.mPageIndicator = null;
    }

    public void onEndReordering() {
        this.mIsReordering = false;
    }

    public boolean onGenericMotionEvent(MotionEvent motionEvent) {
        float f;
        float f2;
        if ((motionEvent.getSource() & 2) != 0 && motionEvent.getAction() == 8) {
            if ((motionEvent.getMetaState() & 1) != 0) {
                f2 = motionEvent.getAxisValue(9);
                f = 0.0f;
            } else {
                float axisValue = motionEvent.getAxisValue(10);
                f = -motionEvent.getAxisValue(9);
                f2 = axisValue;
            }
            if (!(f2 == 0.0f && f == 0.0f)) {
                if (!this.mIsRtl ? f2 > 0.0f || f > 0.0f : f2 < 0.0f || f < 0.0f) {
                    scrollRight();
                } else {
                    scrollLeft();
                }
                return true;
            }
        }
        return super.onGenericMotionEvent(motionEvent);
    }

    public final boolean onHoverEvent(MotionEvent motionEvent) {
        return true;
    }

    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        boolean z = true;
        if (getChildCount() <= 1) {
            z = false;
        }
        accessibilityEvent.setScrollable(z);
    }

    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        boolean z = true;
        if (getChildCount() <= 1) {
            z = false;
        }
        accessibilityNodeInfo.setScrollable(z);
        if (this.mCurrentPage < getChildCount() - 1) {
            accessibilityNodeInfo.addAction(4096);
        }
        if (this.mCurrentPage > 0) {
            accessibilityNodeInfo.addAction(8192);
        }
        accessibilityNodeInfo.setClassName(getClass().getName());
        accessibilityNodeInfo.setLongClickable(false);
        if (Utilities.ATLEAST_LOLLIPOP) {
            accessibilityNodeInfo.removeAction(AccessibilityNodeInfo.AccessibilityAction.ACTION_LONG_CLICK);
        }
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        acquireVelocityTrackerAndAddMovement(motionEvent);
        if (getChildCount() <= 0) {
            return super.onInterceptTouchEvent(motionEvent);
        }
        int action = motionEvent.getAction();
        if (action == 2) {
            if (this.mTouchState == 1) {
                return true;
            }
            action = 2;
        }
        int i = action & PrivateKeyType.INVALID;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i == 6) {
                            onSecondaryPointerUp(motionEvent);
                            releaseVelocityTracker();
                        }
                    }
                } else if (this.mActivePointerId != -1) {
                    determineScrollingStart(motionEvent);
                }
            }
            resetTouchState();
        } else {
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            this.mDownMotionX = x;
            this.mDownMotionY = y;
            this.mDownScrollX = (float) getScrollX();
            this.mLastMotionX = x;
            this.mLastMotionY = y;
            float[] mapPointFromViewToParent$ar$ds = mapPointFromViewToParent$ar$ds(this, x, y);
            this.mParentDownMotionX = mapPointFromViewToParent$ar$ds[0];
            this.mParentDownMotionY = mapPointFromViewToParent$ar$ds[1];
            this.mLastMotionXRemainder = 0.0f;
            this.mTotalMotionX = 0.0f;
            this.mActivePointerId = motionEvent.getPointerId(0);
            LauncherScroller launcherScroller = this.mScroller;
            int abs = Math.abs(launcherScroller.mFinalX - launcherScroller.mCurrX);
            boolean z = this.mScroller.mFinished;
            if (z || abs < this.mTouchSlop / 3) {
                this.mTouchState = 0;
                if (!z && !this.mFreeScroll) {
                    setCurrentPage(getNextPage());
                    pageEndMoving();
                }
            } else if (isTouchPointInViewportWithBuffer((int) this.mDownMotionX, (int) this.mDownMotionY)) {
                this.mTouchState = 1;
            } else {
                this.mTouchState = 0;
            }
        }
        return this.mTouchState != 0;
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        if (getChildCount() != 0) {
            int childCount = getChildCount();
            int viewportOffsetX = getViewportOffsetX();
            int measuredHeight = (getMeasuredHeight() - this.mViewport.height()) / 2;
            this.mViewport.offset(viewportOffsetX, measuredHeight);
            boolean z2 = this.mIsRtl;
            int i6 = z2 ? childCount - 1 : 0;
            int i7 = -1;
            int i8 = true != z2 ? childCount : -1;
            if (true != z2) {
                i7 = 1;
            }
            int paddingTop = getPaddingTop() + getPaddingBottom();
            boolean z3 = ((LayoutParams) getChildAt(i6).getLayoutParams()).isFullScreenPage;
            int paddingLeft = getPaddingLeft() + viewportOffsetX;
            if (this.mPageScrolls == null || childCount != this.mChildCountOnLastLayout) {
                this.mPageScrolls = new int[childCount];
            }
            while (i6 != i8) {
                View pageAt = getPageAt(i6);
                if (pageAt.getVisibility() != 8) {
                    LayoutParams layoutParams = (LayoutParams) pageAt.getLayoutParams();
                    boolean z4 = layoutParams.isFullScreenPage;
                    int paddingTop2 = getPaddingTop() + measuredHeight + this.mInsets.top;
                    if (this.mCenterPagesVertically) {
                        paddingTop2 += ((((this.mViewport.height() - this.mInsets.top) - this.mInsets.bottom) - paddingTop) - pageAt.getMeasuredHeight()) / 2;
                    }
                    int measuredWidth = pageAt.getMeasuredWidth();
                    pageAt.layout(paddingLeft, paddingTop2, paddingLeft + pageAt.getMeasuredWidth(), pageAt.getMeasuredHeight() + paddingTop2);
                    boolean z5 = layoutParams.isFullScreenPage;
                    this.mPageScrolls[i6] = (paddingLeft - getPaddingLeft()) - viewportOffsetX;
                    int i9 = this.mPageSpacing;
                    int i10 = i6 + i7;
                    if (i10 != i8) {
                        LayoutParams layoutParams2 = (LayoutParams) getPageAt(i10).getLayoutParams();
                    }
                    boolean z6 = layoutParams.isFullScreenPage;
                    paddingLeft += measuredWidth + i9 + getChildGap();
                }
                i6 += i7;
            }
            LayoutTransition layoutTransition = getLayoutTransition();
            if (layoutTransition == null || !layoutTransition.isRunning()) {
                updateMaxScrollX();
            } else {
                layoutTransition.addTransitionListener(new LayoutTransition.TransitionListener() {
                    public final void endTransition(LayoutTransition layoutTransition, ViewGroup viewGroup, View view, int i) {
                        if (!layoutTransition.isRunning()) {
                            layoutTransition.removeTransitionListener(this);
                            PagedView.this.updateMaxScrollX();
                        }
                    }

                    public final void startTransition(LayoutTransition layoutTransition, ViewGroup viewGroup, View view, int i) {
                    }
                });
            }
            if (this.mFirstLayout && (i5 = this.mCurrentPage) >= 0 && i5 < childCount) {
                updateCurrentPageScroll();
                this.mFirstLayout = false;
            }
            if (this.mScroller.mFinished && this.mChildCountOnLastLayout != childCount) {
                int i11 = this.mRestorePage;
                if (i11 != -1001) {
                    setCurrentPage(i11);
                    this.mRestorePage = -1001;
                } else {
                    setCurrentPage(getNextPage());
                }
            }
            this.mChildCountOnLastLayout = childCount;
            if (isReordering(true)) {
                updateDragViewTranslationDuringDrag();
            }
        }
    }

    /* access modifiers changed from: protected */
    public final void onMeasure(int i, int i2) {
        int i3;
        int i4;
        if (getChildCount() == 0) {
            super.onMeasure(i, i2);
            return;
        }
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i2);
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        float max = (float) Math.max(displayMetrics.widthPixels + this.mInsets.left + this.mInsets.right, displayMetrics.heightPixels + this.mInsets.top + this.mInsets.bottom);
        int i5 = (int) (max + max);
        if (this.mUseMinScale) {
            i4 = (int) (((float) i5) / this.mMinScale);
            i3 = i4;
        } else {
            i4 = size;
            i3 = size2;
        }
        this.mViewport.set(0, 0, size, size2);
        if (mode == 0 || mode2 == 0) {
            super.onMeasure(i, i2);
        } else if (size <= 0 || size2 <= 0) {
            super.onMeasure(i, i2);
        } else {
            int paddingTop = getPaddingTop() + getPaddingBottom();
            int paddingLeft = getPaddingLeft() + getPaddingRight();
            int childCount = getChildCount();
            for (int i6 = 0; i6 < childCount; i6++) {
                View pageAt = getPageAt(i6);
                if (pageAt.getVisibility() != 8) {
                    LayoutParams layoutParams = (LayoutParams) pageAt.getLayoutParams();
                    boolean z = layoutParams.isFullScreenPage;
                    int i7 = layoutParams.width;
                    int i8 = LinearLayoutManager.INVALID_OFFSET;
                    int i9 = i7 == -2 ? LinearLayoutManager.INVALID_OFFSET : 1073741824;
                    if (layoutParams.height != -2) {
                        i8 = 1073741824;
                    }
                    int width = this.mViewport.width();
                    int i10 = this.mInsets.left;
                    int i11 = this.mInsets.right;
                    int height = ((this.mViewport.height() - paddingTop) - this.mInsets.top) - this.mInsets.bottom;
                    this.mNormalChildHeight = height;
                    pageAt.measure(View.MeasureSpec.makeMeasureSpec(((width - paddingLeft) - i10) - i11, i9), View.MeasureSpec.makeMeasureSpec(height, i8));
                }
            }
            setMeasuredDimension(i4, i3);
        }
    }

    /* access modifiers changed from: protected */
    public void onPageBeginMoving() {
    }

    /* access modifiers changed from: protected */
    public void onPageEndMoving() {
        this.mWasInOverscroll = false;
    }

    /* access modifiers changed from: package-private */
    public final void onPostReorderingAnimationCompleted() {
        int i = this.mPostReorderingPreZoomInRemainingAnimationCount - 1;
        this.mPostReorderingPreZoomInRemainingAnimationCount = i;
        Runnable runnable = this.mPostReorderingPreZoomInRunnable;
        if (runnable != null && i == 0) {
            runnable.run();
            this.mPostReorderingPreZoomInRunnable = null;
        }
    }

    /* access modifiers changed from: protected */
    public final boolean onRequestFocusInDescendants(int i, Rect rect) {
        int i2 = this.mNextPage;
        if (i2 == -1) {
            i2 = this.mCurrentPage;
        }
        View pageAt = getPageAt(i2);
        if (pageAt != null) {
            return pageAt.requestFocus(i, rect);
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public void onScrollInteractionBegin() {
    }

    /* access modifiers changed from: protected */
    public void onScrollInteractionEnd() {
    }

    public void onStartReordering() {
        throw null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:129:0x02d1  */
    /* JADX WARNING: Removed duplicated region for block: B:130:0x02d4  */
    /* JADX WARNING: Removed duplicated region for block: B:133:0x02db  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean onTouchEvent(android.view.MotionEvent r19) {
        /*
            r18 = this;
            r0 = r18
            r1 = r19
            super.onTouchEvent(r19)
            int r2 = r18.getChildCount()
            if (r2 > 0) goto L_0x0012
            boolean r1 = super.onTouchEvent(r19)
            return r1
        L_0x0012:
            r18.acquireVelocityTrackerAndAddMovement(r19)
            int r2 = r19.getAction()
            r2 = r2 & 255(0xff, float:3.57E-43)
            r3 = 0
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L_0x03c7
            r7 = 4
            r8 = 3
            r9 = 1065353216(0x3f800000, float:1.0)
            r10 = 2
            r11 = -1
            if (r2 == r4) goto L_0x0143
            if (r2 == r10) goto L_0x0044
            if (r2 == r8) goto L_0x0039
            r3 = 6
            if (r2 == r3) goto L_0x0032
        L_0x002f:
            r5 = 1
            goto L_0x040e
        L_0x0032:
            r18.onSecondaryPointerUp(r19)
            r18.releaseVelocityTracker()
            goto L_0x002f
        L_0x0039:
            int r1 = r0.mTouchState
            if (r1 != r4) goto L_0x0040
            r18.snapToDestination()
        L_0x0040:
            r18.resetTouchState()
            goto L_0x002f
        L_0x0044:
            int r2 = r0.mTouchState
            if (r2 != r4) goto L_0x0083
            int r2 = r0.mActivePointerId
            int r2 = r1.findPointerIndex(r2)
            if (r2 != r11) goto L_0x0051
            return r4
        L_0x0051:
            float r1 = r1.getX(r2)
            float r2 = r0.mLastMotionX
            float r3 = r0.mLastMotionXRemainder
            float r2 = r2 + r3
            float r2 = r2 - r1
            float r3 = r0.mTotalMotionX
            float r6 = java.lang.Math.abs(r2)
            float r3 = r3 + r6
            r0.mTotalMotionX = r3
            float r3 = java.lang.Math.abs(r2)
            int r3 = (r3 > r9 ? 1 : (r3 == r9 ? 0 : -1))
            if (r3 < 0) goto L_0x007f
            float r3 = r0.mTouchX
            float r3 = r3 + r2
            r0.mTouchX = r3
            int r3 = (int) r2
            java.lang.System.nanoTime()
            r0.scrollBy(r3, r5)
            r0.mLastMotionX = r1
            float r1 = (float) r3
            float r2 = r2 - r1
            r0.mLastMotionXRemainder = r2
            goto L_0x002f
        L_0x007f:
            r18.awakenScrollBars()
            goto L_0x002f
        L_0x0083:
            if (r2 != r7) goto L_0x013e
            float r2 = r19.getX()
            r0.mLastMotionX = r2
            float r1 = r19.getY()
            r0.mLastMotionY = r1
            float r2 = r0.mLastMotionX
            float[] r1 = mapPointFromViewToParent$ar$ds(r0, r2, r1)
            r2 = r1[r5]
            r0.mParentDownMotionX = r2
            r1 = r1[r4]
            r0.mParentDownMotionY = r1
            r18.updateDragViewTranslationDuringDrag()
            android.view.View r1 = r0.mDragView
            int r1 = r0.indexOfChild(r1)
            android.view.View r2 = r0.mDragView
            if (r2 == 0) goto L_0x00f6
            int r2 = r2.getLeft()
            android.view.View r3 = r0.mDragView
            int r3 = r3.getMeasuredWidth()
            int r3 = r3 / r10
            int r2 = r2 + r3
            float r2 = (float) r2
            android.view.View r3 = r0.mDragView
            float r3 = r3.getTranslationX()
            float r2 = r2 + r3
            int r2 = (int) r2
            int[] r3 = r0.mTempVisiblePagesRange
            r0.getFreeScrollPageRange(r3)
            android.view.View r3 = r0.mDragView
            int r3 = r0.indexOfChild(r3)
            int[] r7 = r0.mTempVisiblePagesRange
            r7 = r7[r5]
            r6 = 2147483647(0x7fffffff, float:NaN)
        L_0x00d3:
            int[] r8 = r0.mTempVisiblePagesRange
            r8 = r8[r4]
            if (r7 > r8) goto L_0x00f7
            android.view.View r8 = r0.getPageAt(r7)
            int r9 = r8.getLeft()
            int r8 = r8.getMeasuredWidth()
            int r8 = r8 / r10
            int r9 = r9 + r8
            int r8 = r2 - r9
            int r8 = java.lang.Math.abs(r8)
            if (r8 >= r6) goto L_0x00f0
            r3 = r7
        L_0x00f0:
            if (r8 >= r6) goto L_0x00f3
            r6 = r8
        L_0x00f3:
            int r7 = r7 + 1
            goto L_0x00d3
        L_0x00f6:
            r3 = -1
        L_0x00f7:
            if (r3 < 0) goto L_0x0135
            android.view.View r2 = r0.mDragView
            int r2 = r0.indexOfChild(r2)
            if (r3 == r2) goto L_0x0135
            int[] r2 = r0.mTempVisiblePagesRange
            r2[r5] = r5
            int r6 = r18.getChildCount()
            int r6 = r6 + r11
            r2[r4] = r6
            int[] r2 = r0.mTempVisiblePagesRange
            r0.getFreeScrollPageRange(r2)
            int[] r2 = r0.mTempVisiblePagesRange
            r5 = r2[r5]
            if (r5 > r3) goto L_0x002f
            r2 = r2[r4]
            if (r3 > r2) goto L_0x002f
            int r2 = r0.mSidePageHoverIndex
            if (r3 == r2) goto L_0x002f
            com.android.launcher3.LauncherScroller r2 = r0.mScroller
            boolean r2 = r2.mFinished
            if (r2 == 0) goto L_0x002f
            r0.mSidePageHoverIndex = r3
            com.android.launcher3.PagedView$2 r2 = new com.android.launcher3.PagedView$2
            r2.<init>(r3, r1)
            r0.mSidePageHoverRunnable = r2
            r5 = 80
            r0.postDelayed(r2, r5)
            goto L_0x002f
        L_0x0135:
            java.lang.Runnable r1 = r0.mSidePageHoverRunnable
            r0.removeCallbacks(r1)
            r0.mSidePageHoverIndex = r11
            goto L_0x002f
        L_0x013e:
            r18.determineScrollingStart(r19)
            goto L_0x002f
        L_0x0143:
            int r2 = r0.mTouchState
            if (r2 != r4) goto L_0x0357
            int r2 = r0.mActivePointerId
            int r7 = r1.findPointerIndex(r2)
            if (r7 != r11) goto L_0x0150
            return r4
        L_0x0150:
            float r1 = r1.getX(r7)
            android.view.VelocityTracker r7 = r0.mVelocityTracker
            int r8 = r0.mMaximumVelocity
            float r8 = (float) r8
            r10 = 1000(0x3e8, float:1.401E-42)
            r7.computeCurrentVelocity(r10, r8)
            float r2 = r7.getXVelocity(r2)
            int r2 = (int) r2
            float r7 = r0.mDownMotionX
            float r7 = r1 - r7
            int r7 = (int) r7
            int r8 = r0.mCurrentPage
            android.view.View r8 = r0.getPageAt(r8)
            int r8 = r8.getMeasuredWidth()
            float r8 = (float) r8
            int r10 = java.lang.Math.abs(r7)
            float r10 = (float) r10
            r12 = 1053609165(0x3ecccccd, float:0.4)
            float r12 = r12 * r8
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 <= 0) goto L_0x0183
            r10 = 1
            goto L_0x0184
        L_0x0183:
            r10 = 0
        L_0x0184:
            float r12 = r0.mTotalMotionX
            float r13 = r0.mLastMotionX
            float r14 = r0.mLastMotionXRemainder
            float r13 = r13 + r14
            float r13 = r13 - r1
            float r1 = java.lang.Math.abs(r13)
            float r12 = r12 + r1
            r0.mTotalMotionX = r12
            r1 = 1103626240(0x41c80000, float:25.0)
            int r1 = (r12 > r1 ? 1 : (r12 == r1 ? 0 : -1))
            if (r1 <= 0) goto L_0x01a3
            int r1 = java.lang.Math.abs(r2)
            int r12 = r0.mFlingThresholdVelocity
            if (r1 <= r12) goto L_0x01a3
            r1 = 1
            goto L_0x01a4
        L_0x01a3:
            r1 = 0
        L_0x01a4:
            boolean r12 = r0.mFreeScroll
            if (r12 != 0) goto L_0x021a
            int r3 = java.lang.Math.abs(r7)
            float r3 = (float) r3
            r6 = 1051260355(0x3ea8f5c3, float:0.33)
            float r8 = r8 * r6
            int r3 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
            if (r3 <= 0) goto L_0x01c8
            float r3 = (float) r2
            float r3 = java.lang.Math.signum(r3)
            float r6 = (float) r7
            float r6 = java.lang.Math.signum(r6)
            int r3 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            if (r3 == 0) goto L_0x01c8
            if (r1 == 0) goto L_0x01c8
            r3 = 1
            goto L_0x01c9
        L_0x01c8:
            r3 = 0
        L_0x01c9:
            boolean r6 = r0.mIsRtl
            if (r6 == 0) goto L_0x01d0
            if (r7 <= 0) goto L_0x01d4
            goto L_0x01d2
        L_0x01d0:
            if (r7 >= 0) goto L_0x01d4
        L_0x01d2:
            r7 = 1
            goto L_0x01d5
        L_0x01d4:
            r7 = 0
        L_0x01d5:
            if (r6 == 0) goto L_0x01da
            if (r2 <= 0) goto L_0x01dd
            goto L_0x01dc
        L_0x01da:
            if (r2 >= 0) goto L_0x01dd
        L_0x01dc:
            r5 = 1
        L_0x01dd:
            if (r10 == 0) goto L_0x01e3
            if (r7 != 0) goto L_0x01e3
            if (r1 == 0) goto L_0x01e7
        L_0x01e3:
            if (r1 == 0) goto L_0x01f5
            if (r5 != 0) goto L_0x01f5
        L_0x01e7:
            int r6 = r0.mCurrentPage
            if (r6 <= 0) goto L_0x01f5
            if (r3 == 0) goto L_0x01ee
            goto L_0x01f0
        L_0x01ee:
            int r6 = r6 + -1
        L_0x01f0:
            r0.snapToPageWithVelocity(r6, r2)
            goto L_0x0353
        L_0x01f5:
            if (r10 == 0) goto L_0x01fb
            if (r7 == 0) goto L_0x01fb
            if (r1 == 0) goto L_0x01ff
        L_0x01fb:
            if (r1 == 0) goto L_0x0215
            if (r5 == 0) goto L_0x0215
        L_0x01ff:
            int r1 = r0.mCurrentPage
            int r5 = r18.getChildCount()
            int r5 = r5 + r11
            if (r1 >= r5) goto L_0x0215
            if (r3 == 0) goto L_0x020d
            int r1 = r0.mCurrentPage
            goto L_0x0210
        L_0x020d:
            int r1 = r0.mCurrentPage
            int r1 = r1 + r4
        L_0x0210:
            r0.snapToPageWithVelocity(r1, r2)
            goto L_0x0353
        L_0x0215:
            r18.snapToDestination()
            goto L_0x0353
        L_0x021a:
            com.android.launcher3.LauncherScroller r1 = r0.mScroller
            boolean r1 = r1.mFinished
            if (r1 != 0) goto L_0x0223
            r0.abortScrollerAnimation(r4)
        L_0x0223:
            float r1 = r18.getScaleX()
            int r2 = -r2
            float r2 = (float) r2
            float r2 = r2 * r1
            int r2 = (int) r2
            int r7 = r18.getScrollX()
            float r7 = (float) r7
            float r7 = r7 * r1
            int r1 = (int) r7
            com.android.launcher3.LauncherScroller r7 = r0.mScroller
            android.view.animation.Interpolator r8 = r0.mDefaultInterpolator
            r7.mInterpolator = r8
            int r8 = r18.getScrollY()
            boolean r10 = r7.mFlywheel
            if (r10 == 0) goto L_0x0297
            boolean r10 = r7.mFinished
            if (r10 != 0) goto L_0x0297
            int r10 = r7.mMode
            if (r10 != r4) goto L_0x024d
            float r10 = r7.mCurrVelocity
            goto L_0x0260
        L_0x024d:
            float r10 = r7.mVelocity
            float r11 = r7.mDeceleration
            long r12 = android.view.animation.AnimationUtils.currentAnimationTimeMillis()
            long r14 = r7.mStartTime
            long r12 = r12 - r14
            int r13 = (int) r12
            float r12 = (float) r13
            float r11 = r11 * r12
            r12 = 1157234688(0x44fa0000, float:2000.0)
            float r11 = r11 / r12
            float r10 = r10 - r11
        L_0x0260:
            int r11 = r7.mFinalX
            int r12 = r7.mStartX
            int r11 = r11 - r12
            float r11 = (float) r11
            int r12 = r7.mFinalY
            int r13 = r7.mStartY
            int r12 = r12 - r13
            float r12 = (float) r12
            double r13 = (double) r11
            double r5 = (double) r12
            double r5 = java.lang.Math.hypot(r13, r5)
            float r5 = (float) r5
            float r11 = r11 / r5
            float r11 = r11 * r10
            float r12 = r12 / r5
            float r12 = r12 * r10
            float r5 = (float) r2
            float r6 = java.lang.Math.signum(r5)
            float r10 = java.lang.Math.signum(r11)
            int r6 = (r6 > r10 ? 1 : (r6 == r10 ? 0 : -1))
            if (r6 != 0) goto L_0x0297
            float r6 = java.lang.Math.signum(r3)
            float r10 = java.lang.Math.signum(r12)
            int r6 = (r6 > r10 ? 1 : (r6 == r10 ? 0 : -1))
            if (r6 != 0) goto L_0x0297
            float r5 = r5 + r11
            int r2 = (int) r5
            float r12 = r12 + r3
            int r5 = (int) r12
            goto L_0x0298
        L_0x0297:
            r5 = 0
        L_0x0298:
            r7.mMode = r4
            r6 = 0
            r7.mFinished = r6
            double r10 = (double) r2
            double r12 = (double) r5
            double r10 = java.lang.Math.hypot(r10, r12)
            float r6 = (float) r10
            r7.mVelocity = r6
            double r10 = r7.getSplineDeceleration(r6)
            float r12 = com.android.launcher3.LauncherScroller.DECELERATION_RATE
            double r12 = (double) r12
            r16 = -4616189618054758400(0xbff0000000000000, double:-1.0)
            java.lang.Double.isNaN(r12)
            double r12 = r12 + r16
            double r10 = r10 / r12
            double r10 = java.lang.Math.exp(r10)
            r12 = 4652007308841189376(0x408f400000000000, double:1000.0)
            double r10 = r10 * r12
            int r10 = (int) r10
            r7.mDuration = r10
            long r10 = android.view.animation.AnimationUtils.currentAnimationTimeMillis()
            r7.mStartTime = r10
            r7.mStartX = r1
            r7.mStartY = r8
            int r10 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
            if (r10 != 0) goto L_0x02d4
            r2 = 1065353216(0x3f800000, float:1.0)
            goto L_0x02d6
        L_0x02d4:
            float r2 = (float) r2
            float r2 = r2 / r6
        L_0x02d6:
            int r3 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
            if (r3 != 0) goto L_0x02db
            goto L_0x02de
        L_0x02db:
            float r3 = (float) r5
            float r9 = r3 / r6
        L_0x02de:
            double r10 = r7.getSplineDeceleration(r6)
            float r3 = com.android.launcher3.LauncherScroller.DECELERATION_RATE
            double r12 = (double) r3
            float r3 = r7.mFlingFriction
            float r5 = r7.mPhysicalCoeff
            float r3 = r3 * r5
            double r4 = (double) r3
            java.lang.Double.isNaN(r12)
            double r16 = r12 + r16
            java.lang.Double.isNaN(r12)
            double r12 = r12 / r16
            double r12 = r12 * r10
            double r10 = java.lang.Math.exp(r12)
            java.lang.Double.isNaN(r4)
            double r4 = r4 * r10
            float r3 = java.lang.Math.signum(r6)
            double r10 = (double) r3
            java.lang.Double.isNaN(r10)
            double r10 = r10 * r4
            int r3 = (int) r10
            r7.mDistance = r3
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r7.mMinX = r3
            r3 = 2147483647(0x7fffffff, float:NaN)
            r7.mMaxX = r3
            double r2 = (double) r2
            java.lang.Double.isNaN(r2)
            double r2 = r2 * r4
            long r2 = java.lang.Math.round(r2)
            int r3 = (int) r2
            int r1 = r1 + r3
            r7.mFinalX = r1
            int r2 = r7.mMaxX
            int r1 = java.lang.Math.min(r1, r2)
            r7.mFinalX = r1
            int r2 = r7.mMinX
            int r1 = java.lang.Math.max(r1, r2)
            r7.mFinalX = r1
            double r1 = (double) r9
            java.lang.Double.isNaN(r1)
            double r4 = r4 * r1
            long r1 = java.lang.Math.round(r4)
            int r2 = (int) r1
            int r8 = r8 + r2
            r7.mFinalY = r8
            r3 = 0
            int r1 = java.lang.Math.min(r8, r3)
            r7.mFinalY = r1
            int r1 = java.lang.Math.max(r1, r3)
            r7.mFinalY = r1
            r18.invalidate()
        L_0x0353:
            r18.onScrollInteractionEnd()
            goto L_0x03bd
        L_0x0357:
            r3 = 0
            r4 = 0
            r5 = 750(0x2ee, float:1.051E-42)
            if (r2 != r10) goto L_0x0370
            int r1 = r0.mCurrentPage
            int r1 = r1 + r11
            int r1 = java.lang.Math.max(r3, r1)
            int r2 = r0.mCurrentPage
            if (r1 == r2) goto L_0x036c
            r0.snapToPage(r1, r5, r3, r4)
            goto L_0x03bd
        L_0x036c:
            r18.snapToDestination()
            goto L_0x03bd
        L_0x0370:
            if (r2 != r8) goto L_0x038c
            int r1 = r18.getChildCount()
            int r1 = r1 + r11
            int r2 = r0.mCurrentPage
            r3 = 1
            int r2 = r2 + r3
            int r1 = java.lang.Math.min(r1, r2)
            int r2 = r0.mCurrentPage
            if (r1 == r2) goto L_0x0388
            r3 = 0
            r0.snapToPage(r1, r5, r3, r4)
            goto L_0x03bd
        L_0x0388:
            r18.snapToDestination()
            goto L_0x03bd
        L_0x038c:
            r3 = 0
            if (r2 != r7) goto L_0x03ae
            float r2 = r19.getX()
            r0.mLastMotionX = r2
            float r1 = r19.getY()
            r0.mLastMotionY = r1
            float r2 = r0.mLastMotionX
            float[] r1 = mapPointFromViewToParent$ar$ds(r0, r2, r1)
            r2 = r1[r3]
            r0.mParentDownMotionX = r2
            r2 = 1
            r1 = r1[r2]
            r0.mParentDownMotionY = r1
            r18.updateDragViewTranslationDuringDrag()
            goto L_0x03bd
        L_0x03ae:
            boolean r1 = r0.mCancelTap
            if (r1 != 0) goto L_0x03bd
            android.content.Context r1 = r18.getContext()
            com.android.launcher3.Launcher r1 = com.android.launcher3.Launcher.getLauncher(r1)
            r1.onClick(r0)
        L_0x03bd:
            java.lang.Runnable r1 = r0.mSidePageHoverRunnable
            r0.removeCallbacks(r1)
            r18.resetTouchState()
            goto L_0x002f
        L_0x03c7:
            com.android.launcher3.LauncherScroller r2 = r0.mScroller
            boolean r2 = r2.mFinished
            if (r2 != 0) goto L_0x03d1
            r2 = 0
            r0.abortScrollerAnimation(r2)
        L_0x03d1:
            float r2 = r19.getX()
            r0.mLastMotionX = r2
            r0.mDownMotionX = r2
            float r2 = r19.getY()
            r0.mLastMotionY = r2
            r0.mDownMotionY = r2
            int r2 = r18.getScrollX()
            float r2 = (float) r2
            r0.mDownScrollX = r2
            float r2 = r0.mLastMotionX
            float r4 = r0.mLastMotionY
            float[] r2 = mapPointFromViewToParent$ar$ds(r0, r2, r4)
            r4 = 0
            r5 = r2[r4]
            r0.mParentDownMotionX = r5
            r5 = 1
            r2 = r2[r5]
            r0.mParentDownMotionY = r2
            r0.mLastMotionXRemainder = r3
            r0.mTotalMotionX = r3
            int r1 = r1.getPointerId(r4)
            r0.mActivePointerId = r1
            int r1 = r0.mTouchState
            if (r1 != r5) goto L_0x040e
            r18.onScrollInteractionBegin()
            r18.pageBeginMoving()
        L_0x040e:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.launcher3.PagedView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    /* access modifiers changed from: protected */
    public void overScroll(float f) {
        dampedOverScroll(f);
    }

    /* access modifiers changed from: protected */
    public final void pageBeginMoving() {
        if (!this.mIsPageMoving) {
            this.mIsPageMoving = true;
            onPageBeginMoving();
        }
    }

    /* access modifiers changed from: protected */
    public final void pageEndMoving() {
        if (this.mIsPageMoving) {
            this.mIsPageMoving = false;
            onPageEndMoving();
        }
    }

    public final boolean performAccessibilityAction(int i, Bundle bundle) {
        if (super.performAccessibilityAction(i, bundle)) {
            return true;
        }
        if (i != 4096) {
            if (i != 8192 || this.mCurrentPage <= 0) {
                return false;
            }
            scrollLeft();
            return true;
        } else if (this.mCurrentPage >= getChildCount() - 1) {
            return false;
        } else {
            scrollRight();
            return true;
        }
    }

    public final boolean performLongClick() {
        this.mCancelTap = true;
        return super.performLongClick();
    }

    public final void removeAllViewsInLayout() {
        PageIndicator pageIndicator = this.mPageIndicator;
        if (pageIndicator != null) {
            pageIndicator.removeAllMarkers$ar$ds();
        }
        super.removeAllViewsInLayout();
    }

    public final void removeView(View view) {
        removeMarkerForView(indexOfChild(view));
        super.removeView(view);
    }

    public final void removeViewAt(int i) {
        removeMarkerForView(i);
        super.removeViewAt(i);
    }

    public final void removeViewInLayout(View view) {
        removeMarkerForView(indexOfChild(view));
        super.removeViewInLayout(view);
    }

    public final void requestChildFocus(View view, View view2) {
        super.requestChildFocus(view, view2);
        int indexOfChild = indexOfChild(view);
        if (indexOfChild >= 0 && indexOfChild != this.mCurrentPage && !isInTouchMode()) {
            snapToPage(indexOfChild, 750, false, (TimeInterpolator) null);
        }
    }

    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
        int indexOfChild = indexOfChild(view);
        if (indexOfChild == this.mCurrentPage && this.mScroller.mFinished) {
            return false;
        }
        snapToPage(indexOfChild, 750, false, (TimeInterpolator) null);
        return true;
    }

    public final void requestDisallowInterceptTouchEvent(boolean z) {
        if (z) {
            getPageAt(this.mCurrentPage).cancelLongPress();
        }
        super.requestDisallowInterceptTouchEvent(z);
    }

    /* access modifiers changed from: protected */
    public void screenScrolled(int i) {
    }

    public final void scrollBy(int i, int i2) {
        scrollTo(getUnboundedScrollX() + i, getScrollY() + i2);
    }

    public void scrollLeft() {
        if (getNextPage() > 0) {
            snapToPage(getNextPage() - 1, 750, false, (TimeInterpolator) null);
        }
    }

    public void scrollRight() {
        if (getNextPage() < getChildCount() - 1) {
            snapToPage(getNextPage() + 1, 750, false, (TimeInterpolator) null);
        }
    }

    public void scrollTo(int i, int i2) {
        int i3;
        if (this.mFreeScroll) {
            if (!this.mScroller.mFinished && (i > this.mFreeScrollMaxScrollX || i < this.mFreeScrollMinScrollX)) {
                forceFinishScroller();
            }
            i = Math.max(Math.min(i, this.mFreeScrollMaxScrollX), this.mFreeScrollMinScrollX);
        }
        boolean z = this.mIsRtl;
        boolean z2 = !z ? i < 0 : i > this.mMaxScrollX;
        boolean z3 = !z ? i > this.mMaxScrollX : i < 0;
        if (z2) {
            super.scrollTo(z ? this.mMaxScrollX : 0, i2);
            if (this.mAllowOverScroll) {
                this.mWasInOverscroll = true;
                if (this.mIsRtl) {
                    overScroll((float) (i - this.mMaxScrollX));
                } else {
                    overScroll((float) i);
                }
            }
        } else if (z3) {
            if (z) {
                i3 = 0;
            } else {
                i3 = this.mMaxScrollX;
            }
            super.scrollTo(i3, i2);
            if (this.mAllowOverScroll) {
                this.mWasInOverscroll = true;
                if (this.mIsRtl) {
                    overScroll((float) i);
                } else {
                    overScroll((float) (i - this.mMaxScrollX));
                }
            }
        } else {
            if (this.mWasInOverscroll) {
                overScroll(0.0f);
                this.mWasInOverscroll = false;
            }
            super.scrollTo(i, i2);
        }
        this.mTouchX = (float) i;
        System.nanoTime();
        if (isReordering(true)) {
            float[] mapPointFromParentToView$ar$ds = mapPointFromParentToView$ar$ds(this, this.mParentDownMotionX, this.mParentDownMotionY);
            this.mLastMotionX = mapPointFromParentToView$ar$ds[0];
            this.mLastMotionY = mapPointFromParentToView$ar$ds[1];
            updateDragViewTranslationDuringDrag();
        }
    }

    public final void sendAccessibilityEvent(int i) {
        if (i != 4096) {
            super.sendAccessibilityEvent(i);
        }
    }

    public final void setCurrentPage(int i) {
        if (!this.mScroller.mFinished) {
            abortScrollerAnimation(true);
        }
        if (getChildCount() != 0) {
            this.mForceScreenScrolled = true;
            this.mCurrentPage = validateNewPage(i);
            updateCurrentPageScroll();
            notifyPageSwitchListener();
            invalidate();
        }
    }

    /* access modifiers changed from: protected */
    public final void setEdgeGlowColor(int i) {
        this.mEdgeGlowLeft.mPaint.setColor(i);
        this.mEdgeGlowRight.mPaint.setColor(i);
    }

    public final void setEnableFreeScroll(boolean z) {
        this.mFreeScroll = z;
        if (z) {
            updateFreescrollBounds();
            getFreeScrollPageRange(this.mTempVisiblePagesRange);
            int i = this.mCurrentPage;
            int[] iArr = this.mTempVisiblePagesRange;
            int i2 = iArr[0];
            if (i < i2) {
                setCurrentPage(i2);
            } else {
                int i3 = iArr[1];
                if (i > i3) {
                    setCurrentPage(i3);
                }
            }
        }
        this.mAllowOverScroll = !z;
    }

    public final void setOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        this.mLongClickListener = onLongClickListener;
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            getPageAt(i).setOnLongClickListener(onLongClickListener);
        }
        super.setOnLongClickListener(onLongClickListener);
    }

    public final void setScaleX(float f) {
        super.setScaleX(f);
        if (isReordering(true)) {
            float[] mapPointFromParentToView$ar$ds = mapPointFromParentToView$ar$ds(this, this.mParentDownMotionX, this.mParentDownMotionY);
            this.mLastMotionX = mapPointFromParentToView$ar$ds[0];
            this.mLastMotionY = mapPointFromParentToView$ar$ds[1];
            updateDragViewTranslationDuringDrag();
        }
    }

    /* access modifiers changed from: protected */
    public boolean shouldDrawChild(View view) {
        return view.getVisibility() == 0;
    }

    /* access modifiers changed from: protected */
    public void snapToDestination() {
        snapToPage(getPageNearestToCenterOfScreen(), 750, false, (TimeInterpolator) null);
    }

    /* access modifiers changed from: protected */
    public final void snapToPage(int i, int i2, int i3, boolean z, TimeInterpolator timeInterpolator) {
        this.mNextPage = validateNewPage(i);
        pageBeginMoving();
        awakenScrollBars(i3);
        if (z) {
            i3 = 0;
        } else if (i3 == 0) {
            i3 = Math.abs(i2);
        }
        if (!this.mScroller.mFinished) {
            abortScrollerAnimation(false);
        }
        if (timeInterpolator != null) {
            this.mScroller.mInterpolator = timeInterpolator;
        } else {
            this.mScroller.mInterpolator = this.mDefaultInterpolator;
        }
        this.mScroller.startScroll$ar$ds(getUnboundedScrollX(), i2, i3);
        updatePageIndicator();
        if (z) {
            computeScroll();
        }
        this.mForceScreenScrolled = true;
        invalidate();
    }

    /* access modifiers changed from: protected */
    public final void snapToPageWithVelocity(int i, int i2) {
        int validateNewPage = validateNewPage(i);
        int width = this.mViewport.width() / 2;
        int scrollForPage = getScrollForPage(validateNewPage) - getUnboundedScrollX();
        if (Math.abs(i2) < this.mMinFlingVelocity) {
            snapToPage(validateNewPage, 750, false, (TimeInterpolator) null);
            return;
        }
        float f = (float) width;
        double min = (double) (Math.min(1.0f, ((float) Math.abs(scrollForPage)) / ((float) (width + width))) - 8.0f);
        Double.isNaN(min);
        snapToPage(validateNewPage, scrollForPage, Math.round(Math.abs((f + (((float) Math.sin((double) ((float) (min * 0.4712389167638204d)))) * f)) / ((float) Math.max(this.mMinSnapVelocity, Math.abs(i2)))) * 1000.0f) * 4, false, (TimeInterpolator) null);
    }

    /* access modifiers changed from: protected */
    public final void updateCurrentPageScroll() {
        int i = this.mCurrentPage;
        int scrollForPage = (i < 0 || i >= getChildCount()) ? 0 : getScrollForPage(this.mCurrentPage);
        scrollTo(scrollForPage, 0);
        LauncherScroller launcherScroller = this.mScroller;
        launcherScroller.mFinalX = scrollForPage;
        launcherScroller.mDeltaX = (float) (scrollForPage - launcherScroller.mStartX);
        launcherScroller.mFinished = false;
        forceFinishScroller();
    }

    /* access modifiers changed from: package-private */
    public final void updateFreescrollBounds() {
        getFreeScrollPageRange(this.mTempVisiblePagesRange);
        if (this.mIsRtl) {
            this.mFreeScrollMinScrollX = getScrollForPage(this.mTempVisiblePagesRange[1]);
            this.mFreeScrollMaxScrollX = getScrollForPage(this.mTempVisiblePagesRange[0]);
            return;
        }
        this.mFreeScrollMinScrollX = getScrollForPage(this.mTempVisiblePagesRange[0]);
        this.mFreeScrollMaxScrollX = getScrollForPage(this.mTempVisiblePagesRange[1]);
    }

    /* access modifiers changed from: package-private */
    public final void updateMaxScrollX() {
        int childCount = getChildCount();
        int i = 0;
        if (childCount > 0) {
            if (!this.mIsRtl) {
                i = childCount - 1;
            }
            this.mMaxScrollX = getScrollForPage(i);
            return;
        }
        this.mMaxScrollX = 0;
    }

    public PagedView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* access modifiers changed from: protected */
    public void determineScrollingStart(MotionEvent motionEvent, float f) {
        int findPointerIndex = motionEvent.findPointerIndex(this.mActivePointerId);
        if (findPointerIndex != -1) {
            float x = motionEvent.getX(findPointerIndex);
            if (isTouchPointInViewportWithBuffer((int) x, (int) motionEvent.getY(findPointerIndex)) && ((int) Math.abs(x - this.mLastMotionX)) > Math.round(f * ((float) this.mTouchSlop))) {
                this.mTouchState = 1;
                this.mTotalMotionX += Math.abs(this.mLastMotionX - x);
                this.mLastMotionX = x;
                this.mLastMotionXRemainder = 0.0f;
                this.mTouchX = (float) (getViewportOffsetX() + getScrollX());
                System.nanoTime();
                onScrollInteractionBegin();
                pageBeginMoving();
            }
        }
    }

    /* access modifiers changed from: protected */
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new LayoutParams(layoutParams);
    }

    public PagedView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mFreeScroll = false;
        this.mFreeScrollMinScrollX = -1;
        this.mFreeScrollMaxScrollX = -1;
        this.mFirstLayout = true;
        this.mRestorePage = -1001;
        this.mNextPage = -1;
        this.mPageSpacing = 0;
        this.mLastScreenCenter = -1;
        this.mTouchState = 0;
        this.mForceScreenScrolled = false;
        this.mAllowOverScroll = true;
        this.mTempVisiblePagesRange = new int[2];
        this.mActivePointerId = -1;
        this.mIsPageMoving = false;
        this.mWasInOverscroll = false;
        this.mViewport = new Rect();
        this.mMinScale = 1.0f;
        this.mUseMinScale = false;
        this.mSidePageHoverIndex = -1;
        this.mReorderingStarted = false;
        this.NUM_ANIMATIONS_RUNNING_BEFORE_ZOOM_OUT = 2;
        this.mInsets = new Rect();
        this.mEdgeGlowLeft = new LauncherEdgeEffect();
        this.mEdgeGlowRight = new LauncherEdgeEffect();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.PagedView, i, 0);
        obtainStyledAttributes.getDimensionPixelSize(2, 0);
        obtainStyledAttributes.getDimensionPixelSize(1, 0);
        this.mPageIndicatorViewId = obtainStyledAttributes.getResourceId(0, -1);
        obtainStyledAttributes.recycle();
        setHapticFeedbackEnabled(false);
        this.mIsRtl = Utilities.isRtl(getResources());
        this.mScroller = new LauncherScroller(getContext());
        ScrollInterpolator scrollInterpolator = new ScrollInterpolator();
        this.mDefaultInterpolator = scrollInterpolator;
        this.mScroller.mInterpolator = scrollInterpolator;
        this.mCurrentPage = 0;
        this.mCenterPagesVertically = true;
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        this.mTouchSlop = viewConfiguration.getScaledPagingTouchSlop();
        this.mMaximumVelocity = viewConfiguration.getScaledMaximumFlingVelocity();
        float f = getResources().getDisplayMetrics().density;
        this.mFlingThresholdVelocity = (int) (500.0f * f);
        this.mMinFlingVelocity = (int) (250.0f * f);
        this.mMinSnapVelocity = (int) (f * 1500.0f);
        setOnHierarchyChangeListener(this);
        setWillNotDraw(false);
    }

    public final void snapToPage(int i, int i2, boolean z, TimeInterpolator timeInterpolator) {
        int validateNewPage = validateNewPage(i);
        snapToPage(validateNewPage, getScrollForPage(validateNewPage) - getUnboundedScrollX(), i2, z, timeInterpolator);
    }
}
