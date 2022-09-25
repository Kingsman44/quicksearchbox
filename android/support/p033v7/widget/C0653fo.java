package android.support.p033v7.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.p033v7.p037c.C0408a;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.animation.Interpolator;
import androidx.core.p098j.C2043bi;
import androidx.core.p098j.p099a.C1989i;
import androidx.core.p098j.p099a.C1991k;
import java.util.ArrayList;

/* renamed from: android.support.v7.widget.fo */
/* compiled from: PG */
public abstract class C0653fo {
    boolean mAutoMeasure = false;
    C0550bt mChildHelper;
    private int mHeight;
    private int mHeightMode;
    C0754jh mHorizontalBoundCheck;
    private final C0753jg mHorizontalBoundCheckCallback;
    boolean mIsAttachedToWindow = false;
    private boolean mItemPrefetchEnabled = true;
    private boolean mMeasurementCacheEnabled = true;
    int mPrefetchMaxCountObserved;
    boolean mPrefetchMaxObservedInInitialPrefetch;
    RecyclerView mRecyclerView;
    boolean mRequestedSimpleAnimations = false;
    C0669gd mSmoothScroller;
    C0754jh mVerticalBoundCheck;
    private final C0753jg mVerticalBoundCheckCallback;
    private int mWidth;
    private int mWidthMode;

    public C0653fo() {
        C0649fk fkVar = new C0649fk(this);
        this.mHorizontalBoundCheckCallback = fkVar;
        C0650fl flVar = new C0650fl(this);
        this.mVerticalBoundCheckCallback = flVar;
        this.mHorizontalBoundCheck = new C0754jh(fkVar);
        this.mVerticalBoundCheck = new C0754jh(flVar);
    }

    private void addViewInt(View view, int i, boolean z) {
        C0673gh childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
        if (z || childViewHolderInt.isRemoved()) {
            this.mRecyclerView.mViewInfoStore.mo3264b(childViewHolderInt);
        } else {
            this.mRecyclerView.mViewInfoStore.mo3268f(childViewHolderInt);
        }
        C0654fp fpVar = (C0654fp) view.getLayoutParams();
        if (childViewHolderInt.wasReturnedFromScrap() || childViewHolderInt.isScrap()) {
            if (childViewHolderInt.isScrap()) {
                childViewHolderInt.mScrapContainer.mo3037n(childViewHolderInt);
            } else {
                childViewHolderInt.clearReturnedFromScrapFlag();
            }
            this.mChildHelper.mo2607g(view, i, view.getLayoutParams(), false);
        } else if (view.getParent() == this.mRecyclerView) {
            int c = this.mChildHelper.mo2603c(view);
            if (i == -1) {
                i = this.mChildHelper.mo2601a();
            }
            if (c == -1) {
                throw new IllegalStateException("Added View has RecyclerView as parent but view is not a real child. Unfiltered index:" + this.mRecyclerView.indexOfChild(view) + this.mRecyclerView.exceptionLabel());
            } else if (c != i) {
                this.mRecyclerView.mLayout.moveView(c, i);
            }
        } else {
            this.mChildHelper.mo2606f(view, i, false);
            fpVar.f2422e = true;
            C0669gd gdVar = this.mSmoothScroller;
            if (gdVar != null && gdVar.f2453k && gdVar.f2450h.getChildLayoutPosition(view) == gdVar.f2449g) {
                gdVar.f2454l = view;
            }
        }
        if (fpVar.f2423f) {
            childViewHolderInt.itemView.invalidate();
            fpVar.f2423f = false;
        }
    }

    public static int chooseSize(int i, int i2, int i3) {
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        if (mode != Integer.MIN_VALUE) {
            return mode != 1073741824 ? Math.max(i2, i3) : size;
        }
        return Math.min(size, Math.max(i2, i3));
    }

    private void detachViewInternal(int i, View view) {
        this.mChildHelper.mo2608h(i);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0016, code lost:
        if (r4 == 1073741824) goto L_0x0020;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int getChildMeasureSpec(int r3, int r4, int r5, int r6, boolean r7) {
        /*
            int r3 = r3 - r5
            r5 = 0
            int r3 = java.lang.Math.max(r5, r3)
            r0 = -1
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = 1073741824(0x40000000, float:2.0)
            if (r7 == 0) goto L_0x0019
            if (r6 < 0) goto L_0x0010
            goto L_0x001b
        L_0x0010:
            if (r6 != r0) goto L_0x002f
            if (r4 == r1) goto L_0x0020
            if (r4 == 0) goto L_0x002f
            if (r4 == r2) goto L_0x0020
            goto L_0x002f
        L_0x0019:
            if (r6 < 0) goto L_0x001e
        L_0x001b:
            r4 = 1073741824(0x40000000, float:2.0)
            goto L_0x0031
        L_0x001e:
            if (r6 != r0) goto L_0x0022
        L_0x0020:
            r6 = r3
            goto L_0x0031
        L_0x0022:
            r7 = -2
            if (r6 != r7) goto L_0x002f
            if (r4 == r1) goto L_0x002c
            if (r4 != r2) goto L_0x002a
            goto L_0x002c
        L_0x002a:
            r4 = 0
            goto L_0x0020
        L_0x002c:
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            goto L_0x0020
        L_0x002f:
            r4 = 0
            r6 = 0
        L_0x0031:
            int r3 = android.view.View.MeasureSpec.makeMeasureSpec(r6, r4)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p033v7.widget.C0653fo.getChildMeasureSpec(int, int, int, int, boolean):int");
    }

    private int[] getChildRectangleOnScreenScrollAmount(View view, Rect rect) {
        int[] iArr = new int[2];
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int width = getWidth();
        int paddingRight = getPaddingRight();
        int height = getHeight();
        int paddingBottom = getPaddingBottom();
        int left = (view.getLeft() + rect.left) - view.getScrollX();
        int top = (view.getTop() + rect.top) - view.getScrollY();
        int width2 = rect.width();
        int height2 = rect.height();
        int i = left - paddingLeft;
        int min = Math.min(0, i);
        int i2 = top - paddingTop;
        int min2 = Math.min(0, i2);
        int i3 = (left + width2) - (width - paddingRight);
        int max = Math.max(0, i3);
        int max2 = Math.max(0, (top + height2) - (height - paddingBottom));
        if (getLayoutDirection() == 1) {
            if (max != 0) {
                min = max;
            } else {
                min = Math.max(min, i3);
            }
        } else if (min == 0) {
            min = Math.min(i, max);
        }
        if (min2 == 0) {
            min2 = Math.min(i2, max2);
        }
        iArr[0] = min;
        iArr[1] = min2;
        return iArr;
    }

    public static C0652fn getProperties(Context context, AttributeSet attributeSet, int i, int i2) {
        C0652fn fnVar = new C0652fn();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0408a.f1383a, i, i2);
        fnVar.f2416a = obtainStyledAttributes.getInt(0, 1);
        fnVar.f2417b = obtainStyledAttributes.getInt(10, 1);
        fnVar.f2418c = obtainStyledAttributes.getBoolean(9, false);
        fnVar.f2419d = obtainStyledAttributes.getBoolean(11, false);
        obtainStyledAttributes.recycle();
        return fnVar;
    }

    private boolean isFocusedChildVisibleAfterScrolling(RecyclerView recyclerView, int i, int i2) {
        View focusedChild = recyclerView.getFocusedChild();
        if (focusedChild == null) {
            return false;
        }
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int width = getWidth();
        int paddingRight = getPaddingRight();
        int height = getHeight() - getPaddingBottom();
        Rect rect = this.mRecyclerView.mTempRect;
        getDecoratedBoundsWithMargins(focusedChild, rect);
        if (rect.left - i >= width - paddingRight || rect.right - i <= paddingLeft || rect.top - i2 >= height || rect.bottom - i2 <= paddingTop) {
            return false;
        }
        return true;
    }

    private static boolean isMeasurementUpToDate(int i, int i2, int i3) {
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        if (i3 > 0 && i != i3) {
            return false;
        }
        if (mode == Integer.MIN_VALUE) {
            return size >= i;
        }
        if (mode != 0) {
            return mode == 1073741824 && size == i;
        }
        return true;
    }

    private void scrapOrRecycleView(C0661fw fwVar, int i, View view) {
        C0673gh childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
        if (!childViewHolderInt.shouldIgnore()) {
            if (!childViewHolderInt.isInvalid() || childViewHolderInt.isRemoved() || this.mRecyclerView.mAdapter.mHasStableIds) {
                detachViewAt(i);
                fwVar.mo3035l(view);
                this.mRecyclerView.mViewInfoStore.mo3268f(childViewHolderInt);
                return;
            }
            removeViewAt(i);
            fwVar.mo3034k(childViewHolderInt);
        }
    }

    public void addDisappearingView(View view) {
        addDisappearingView(view, -1);
    }

    public void addView(View view) {
        addView(view, -1);
    }

    public void assertInLayoutOrScroll(String str) {
        RecyclerView recyclerView = this.mRecyclerView;
        if (recyclerView != null && !recyclerView.isComputingLayout()) {
            if (str == null) {
                throw new IllegalStateException("Cannot call this method unless RecyclerView is computing a layout or scrolling".concat(recyclerView.exceptionLabel()));
            }
            throw new IllegalStateException(str.concat(recyclerView.exceptionLabel()));
        }
    }

    public void assertNotInLayoutOrScroll(String str) {
        RecyclerView recyclerView = this.mRecyclerView;
        if (recyclerView != null) {
            recyclerView.assertNotInLayoutOrScroll(str);
        }
    }

    public void attachView(View view) {
        attachView(view, -1);
    }

    public void calculateItemDecorationsForChild(View view, Rect rect) {
        RecyclerView recyclerView = this.mRecyclerView;
        if (recyclerView == null) {
            rect.set(0, 0, 0, 0);
        } else {
            rect.set(recyclerView.getItemDecorInsetsForChild(view));
        }
    }

    public boolean canScrollHorizontally() {
        return false;
    }

    public boolean canScrollVertically() {
        return false;
    }

    public boolean checkLayoutParams(C0654fp fpVar) {
        return fpVar != null;
    }

    public void collectAdjacentPrefetchPositions(int i, int i2, C0670ge geVar, C0651fm fmVar) {
    }

    public void collectInitialPrefetchPositions(int i, C0651fm fmVar) {
    }

    public int computeHorizontalScrollExtent(C0670ge geVar) {
        return 0;
    }

    public int computeHorizontalScrollOffset(C0670ge geVar) {
        return 0;
    }

    public int computeHorizontalScrollRange(C0670ge geVar) {
        return 0;
    }

    public int computeVerticalScrollExtent(C0670ge geVar) {
        return 0;
    }

    public int computeVerticalScrollOffset(C0670ge geVar) {
        return 0;
    }

    public int computeVerticalScrollRange(C0670ge geVar) {
        return 0;
    }

    public void detachAndScrapAttachedViews(C0661fw fwVar) {
        int childCount = getChildCount();
        while (true) {
            childCount--;
            if (childCount >= 0) {
                scrapOrRecycleView(fwVar, childCount, getChildAt(childCount));
            } else {
                return;
            }
        }
    }

    public void detachAndScrapView(View view, C0661fw fwVar) {
        scrapOrRecycleView(fwVar, this.mChildHelper.mo2603c(view), view);
    }

    public void detachAndScrapViewAt(int i, C0661fw fwVar) {
        scrapOrRecycleView(fwVar, i, getChildAt(i));
    }

    public void detachView(View view) {
        int c = this.mChildHelper.mo2603c(view);
        if (c >= 0) {
            detachViewInternal(c, view);
        }
    }

    public void detachViewAt(int i) {
        detachViewInternal(i, getChildAt(i));
    }

    public void dispatchAttachedToWindow(RecyclerView recyclerView) {
        this.mIsAttachedToWindow = true;
        onAttachedToWindow(recyclerView);
    }

    public void dispatchDetachedFromWindow(RecyclerView recyclerView, C0661fw fwVar) {
        this.mIsAttachedToWindow = false;
        onDetachedFromWindow(recyclerView, fwVar);
    }

    public void endAnimation(View view) {
        C0646fh fhVar = this.mRecyclerView.mItemAnimator;
        if (fhVar != null) {
            fhVar.mo2687c(RecyclerView.getChildViewHolderInt(view));
        }
    }

    public View findContainingItemView(View view) {
        View findContainingItemView;
        RecyclerView recyclerView = this.mRecyclerView;
        if (recyclerView == null || (findContainingItemView = recyclerView.findContainingItemView(view)) == null || this.mChildHelper.mo2611k(findContainingItemView)) {
            return null;
        }
        return findContainingItemView;
    }

    public View findViewByPosition(int i) {
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            C0673gh childViewHolderInt = RecyclerView.getChildViewHolderInt(childAt);
            if (childViewHolderInt != null && childViewHolderInt.getLayoutPosition() == i && !childViewHolderInt.shouldIgnore() && (this.mRecyclerView.mState.f2462g || !childViewHolderInt.isRemoved())) {
                return childAt;
            }
        }
        return null;
    }

    public abstract C0654fp generateDefaultLayoutParams();

    public C0654fp generateLayoutParams(Context context, AttributeSet attributeSet) {
        return new C0654fp(context, attributeSet);
    }

    public int getBaseline() {
        return -1;
    }

    public int getBottomDecorationHeight(View view) {
        return ((C0654fp) view.getLayoutParams()).f2421d.bottom;
    }

    public View getChildAt(int i) {
        C0550bt btVar = this.mChildHelper;
        if (btVar != null) {
            return btVar.mo2604d(i);
        }
        return null;
    }

    public int getChildCount() {
        C0550bt btVar = this.mChildHelper;
        if (btVar != null) {
            return btVar.mo2601a();
        }
        return 0;
    }

    public boolean getClipToPadding() {
        RecyclerView recyclerView = this.mRecyclerView;
        return recyclerView != null && recyclerView.mClipToPadding;
    }

    public int getColumnCountForAccessibility(C0661fw fwVar, C0670ge geVar) {
        return -1;
    }

    public int getDecoratedBottom(View view) {
        return view.getBottom() + getBottomDecorationHeight(view);
    }

    public void getDecoratedBoundsWithMargins(View view, Rect rect) {
        RecyclerView.getDecoratedBoundsWithMarginsInt(view, rect);
    }

    public int getDecoratedLeft(View view) {
        return view.getLeft() - getLeftDecorationWidth(view);
    }

    public int getDecoratedMeasuredHeight(View view) {
        Rect rect = ((C0654fp) view.getLayoutParams()).f2421d;
        return view.getMeasuredHeight() + rect.top + rect.bottom;
    }

    public int getDecoratedMeasuredWidth(View view) {
        Rect rect = ((C0654fp) view.getLayoutParams()).f2421d;
        return view.getMeasuredWidth() + rect.left + rect.right;
    }

    public int getDecoratedRight(View view) {
        return view.getRight() + getRightDecorationWidth(view);
    }

    public int getDecoratedTop(View view) {
        return view.getTop() - getTopDecorationHeight(view);
    }

    public View getFocusedChild() {
        View focusedChild;
        RecyclerView recyclerView = this.mRecyclerView;
        if (recyclerView == null || (focusedChild = recyclerView.getFocusedChild()) == null || this.mChildHelper.mo2611k(focusedChild)) {
            return null;
        }
        return focusedChild;
    }

    public int getHeight() {
        return this.mHeight;
    }

    public int getHeightMode() {
        return this.mHeightMode;
    }

    public int getItemCount() {
        RecyclerView recyclerView = this.mRecyclerView;
        C0640fb fbVar = recyclerView != null ? recyclerView.mAdapter : null;
        if (fbVar != null) {
            return fbVar.getItemCount();
        }
        return 0;
    }

    public int getItemViewType(View view) {
        return RecyclerView.getChildViewHolderInt(view).mItemViewType;
    }

    public int getLayoutDirection() {
        return C2043bi.m5577f(this.mRecyclerView);
    }

    public int getLeftDecorationWidth(View view) {
        return ((C0654fp) view.getLayoutParams()).f2421d.left;
    }

    public int getMinimumHeight() {
        return C2043bi.m5579h(this.mRecyclerView);
    }

    public int getMinimumWidth() {
        return C2043bi.m5580i(this.mRecyclerView);
    }

    public int getPaddingBottom() {
        RecyclerView recyclerView = this.mRecyclerView;
        if (recyclerView != null) {
            return recyclerView.getPaddingBottom();
        }
        return 0;
    }

    public int getPaddingEnd() {
        RecyclerView recyclerView = this.mRecyclerView;
        if (recyclerView != null) {
            return C2043bi.m5582k(recyclerView);
        }
        return 0;
    }

    public int getPaddingLeft() {
        RecyclerView recyclerView = this.mRecyclerView;
        if (recyclerView != null) {
            return recyclerView.getPaddingLeft();
        }
        return 0;
    }

    public int getPaddingRight() {
        RecyclerView recyclerView = this.mRecyclerView;
        if (recyclerView != null) {
            return recyclerView.getPaddingRight();
        }
        return 0;
    }

    public int getPaddingStart() {
        RecyclerView recyclerView = this.mRecyclerView;
        if (recyclerView != null) {
            return C2043bi.m5583l(recyclerView);
        }
        return 0;
    }

    public int getPaddingTop() {
        RecyclerView recyclerView = this.mRecyclerView;
        if (recyclerView != null) {
            return recyclerView.getPaddingTop();
        }
        return 0;
    }

    public int getPosition(View view) {
        return ((C0654fp) view.getLayoutParams()).f2420c.getLayoutPosition();
    }

    public int getRightDecorationWidth(View view) {
        return ((C0654fp) view.getLayoutParams()).f2421d.right;
    }

    public int getRowCountForAccessibility(C0661fw fwVar, C0670ge geVar) {
        return -1;
    }

    public int getSelectionModeForAccessibility(C0661fw fwVar, C0670ge geVar) {
        return 0;
    }

    public int getTopDecorationHeight(View view) {
        return ((C0654fp) view.getLayoutParams()).f2421d.top;
    }

    public void getTransformedBoundingBox(View view, boolean z, Rect rect) {
        Matrix matrix;
        if (z) {
            Rect rect2 = ((C0654fp) view.getLayoutParams()).f2421d;
            rect.set(-rect2.left, -rect2.top, view.getWidth() + rect2.right, view.getHeight() + rect2.bottom);
        } else {
            rect.set(0, 0, view.getWidth(), view.getHeight());
        }
        if (!(this.mRecyclerView == null || (matrix = view.getMatrix()) == null || matrix.isIdentity())) {
            RectF rectF = this.mRecyclerView.mTempRectF;
            rectF.set(rect);
            matrix.mapRect(rectF);
            rect.set((int) Math.floor((double) rectF.left), (int) Math.floor((double) rectF.top), (int) Math.ceil((double) rectF.right), (int) Math.ceil((double) rectF.bottom));
        }
        rect.offset(view.getLeft(), view.getTop());
    }

    public int getWidth() {
        return this.mWidth;
    }

    public int getWidthMode() {
        return this.mWidthMode;
    }

    public boolean hasFlexibleChildInBothOrientations() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            ViewGroup.LayoutParams layoutParams = getChildAt(i).getLayoutParams();
            if (layoutParams.width < 0 && layoutParams.height < 0) {
                return true;
            }
        }
        return false;
    }

    public boolean hasFocus() {
        RecyclerView recyclerView = this.mRecyclerView;
        return recyclerView != null && recyclerView.hasFocus();
    }

    public void ignoreView(View view) {
        ViewParent parent = view.getParent();
        RecyclerView recyclerView = this.mRecyclerView;
        if (parent != recyclerView || recyclerView.indexOfChild(view) == -1) {
            throw new IllegalArgumentException("View should be fully attached to be ignored".concat(this.mRecyclerView.exceptionLabel()));
        }
        C0673gh childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
        childViewHolderInt.mFlags |= 128;
        this.mRecyclerView.mViewInfoStore.mo3269g(childViewHolderInt);
    }

    public boolean isAttachedToWindow() {
        return this.mIsAttachedToWindow;
    }

    public boolean isAutoMeasureEnabled() {
        return this.mAutoMeasure;
    }

    public boolean isFocused() {
        RecyclerView recyclerView = this.mRecyclerView;
        return recyclerView != null && recyclerView.isFocused();
    }

    public final boolean isItemPrefetchEnabled() {
        return this.mItemPrefetchEnabled;
    }

    public boolean isLayoutHierarchical(C0661fw fwVar, C0670ge geVar) {
        return false;
    }

    public boolean isMeasurementCacheEnabled() {
        return this.mMeasurementCacheEnabled;
    }

    public boolean isSmoothScrolling() {
        C0669gd gdVar = this.mSmoothScroller;
        return gdVar != null && gdVar.f2453k;
    }

    public boolean isViewPartiallyVisible(View view, boolean z, boolean z2) {
        boolean z3 = this.mHorizontalBoundCheck.mo3262b(view) && this.mVerticalBoundCheck.mo3262b(view);
        if (z) {
            return z3;
        }
        return !z3;
    }

    public void layoutDecorated(View view, int i, int i2, int i3, int i4) {
        Rect rect = ((C0654fp) view.getLayoutParams()).f2421d;
        view.layout(i + rect.left, i2 + rect.top, i3 - rect.right, i4 - rect.bottom);
    }

    public void layoutDecoratedWithMargins(View view, int i, int i2, int i3, int i4) {
        C0654fp fpVar = (C0654fp) view.getLayoutParams();
        Rect rect = fpVar.f2421d;
        view.layout(i + rect.left + fpVar.leftMargin, i2 + rect.top + fpVar.topMargin, (i3 - rect.right) - fpVar.rightMargin, (i4 - rect.bottom) - fpVar.bottomMargin);
    }

    public void measureChild(View view, int i, int i2) {
        C0654fp fpVar = (C0654fp) view.getLayoutParams();
        Rect itemDecorInsetsForChild = this.mRecyclerView.getItemDecorInsetsForChild(view);
        int i3 = itemDecorInsetsForChild.left;
        int i4 = itemDecorInsetsForChild.right;
        int i5 = itemDecorInsetsForChild.top;
        int i6 = itemDecorInsetsForChild.bottom;
        int childMeasureSpec = getChildMeasureSpec(getWidth(), getWidthMode(), getPaddingLeft() + getPaddingRight() + i + i3 + i4, fpVar.width, canScrollHorizontally());
        int childMeasureSpec2 = getChildMeasureSpec(getHeight(), getHeightMode(), getPaddingTop() + getPaddingBottom() + i2 + i5 + i6, fpVar.height, canScrollVertically());
        if (shouldMeasureChild(view, childMeasureSpec, childMeasureSpec2, fpVar)) {
            view.measure(childMeasureSpec, childMeasureSpec2);
        }
    }

    public void measureChildWithMargins(View view, int i, int i2) {
        C0654fp fpVar = (C0654fp) view.getLayoutParams();
        Rect itemDecorInsetsForChild = this.mRecyclerView.getItemDecorInsetsForChild(view);
        int i3 = itemDecorInsetsForChild.left;
        int i4 = itemDecorInsetsForChild.right;
        int i5 = itemDecorInsetsForChild.top;
        int i6 = itemDecorInsetsForChild.bottom;
        int childMeasureSpec = getChildMeasureSpec(getWidth(), getWidthMode(), getPaddingLeft() + getPaddingRight() + fpVar.leftMargin + fpVar.rightMargin + i + i3 + i4, fpVar.width, canScrollHorizontally());
        int childMeasureSpec2 = getChildMeasureSpec(getHeight(), getHeightMode(), getPaddingTop() + getPaddingBottom() + fpVar.topMargin + fpVar.bottomMargin + i2 + i5 + i6, fpVar.height, canScrollVertically());
        if (shouldMeasureChild(view, childMeasureSpec, childMeasureSpec2, fpVar)) {
            view.measure(childMeasureSpec, childMeasureSpec2);
        }
    }

    public void moveView(int i, int i2) {
        View childAt = getChildAt(i);
        if (childAt != null) {
            detachViewAt(i);
            attachView(childAt, i2);
            return;
        }
        throw new IllegalArgumentException("Cannot move a child from non-existing index:" + i + this.mRecyclerView.toString());
    }

    public void offsetChildrenHorizontal(int i) {
        RecyclerView recyclerView = this.mRecyclerView;
        if (recyclerView != null) {
            int a = recyclerView.mChildHelper.mo2601a();
            for (int i2 = 0; i2 < a; i2++) {
                recyclerView.mChildHelper.mo2604d(i2).offsetLeftAndRight(i);
            }
        }
    }

    public void offsetChildrenVertical(int i) {
        RecyclerView recyclerView = this.mRecyclerView;
        if (recyclerView != null) {
            int a = recyclerView.mChildHelper.mo2601a();
            for (int i2 = 0; i2 < a; i2++) {
                recyclerView.mChildHelper.mo2604d(i2).offsetTopAndBottom(i);
            }
        }
    }

    public void onAdapterChanged(C0640fb fbVar, C0640fb fbVar2) {
    }

    public boolean onAddFocusables(RecyclerView recyclerView, ArrayList arrayList, int i, int i2) {
        return false;
    }

    public void onAttachedToWindow(RecyclerView recyclerView) {
    }

    @Deprecated
    public void onDetachedFromWindow(RecyclerView recyclerView) {
    }

    public void onDetachedFromWindow(RecyclerView recyclerView, C0661fw fwVar) {
        onDetachedFromWindow(recyclerView);
    }

    public View onFocusSearchFailed(View view, int i, C0661fw fwVar, C0670ge geVar) {
        return null;
    }

    public void onInitializeAccessibilityEvent(C0661fw fwVar, C0670ge geVar, AccessibilityEvent accessibilityEvent) {
        RecyclerView recyclerView = this.mRecyclerView;
        if (recyclerView != null && accessibilityEvent != null) {
            boolean z = true;
            if (!recyclerView.canScrollVertically(1) && !this.mRecyclerView.canScrollVertically(-1) && !this.mRecyclerView.canScrollHorizontally(-1) && !this.mRecyclerView.canScrollHorizontally(1)) {
                z = false;
            }
            accessibilityEvent.setScrollable(z);
            C0640fb fbVar = this.mRecyclerView.mAdapter;
            if (fbVar != null) {
                accessibilityEvent.setItemCount(fbVar.getItemCount());
            }
        }
    }

    public void onInitializeAccessibilityNodeInfo(C0661fw fwVar, C0670ge geVar, C1991k kVar) {
        if (this.mRecyclerView.canScrollVertically(-1) || this.mRecyclerView.canScrollHorizontally(-1)) {
            kVar.f5921a.addAction(8192);
            kVar.f5921a.setScrollable(true);
        }
        if (this.mRecyclerView.canScrollVertically(1) || this.mRecyclerView.canScrollHorizontally(1)) {
            kVar.f5921a.addAction(4096);
            kVar.f5921a.setScrollable(true);
        }
        kVar.mo5154c(C1989i.m5331a(getRowCountForAccessibility(fwVar, geVar), getColumnCountForAccessibility(fwVar, geVar), isLayoutHierarchical(fwVar, geVar), getSelectionModeForAccessibility(fwVar, geVar)));
    }

    public void onInitializeAccessibilityNodeInfoForItem(C0661fw fwVar, C0670ge geVar, View view, C1991k kVar) {
    }

    public void onInitializeAccessibilityNodeInfoForItem(View view, C1991k kVar) {
        C0673gh childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
        if (childViewHolderInt != null && !childViewHolderInt.isRemoved() && !this.mChildHelper.mo2611k(childViewHolderInt.itemView)) {
            RecyclerView recyclerView = this.mRecyclerView;
            onInitializeAccessibilityNodeInfoForItem(recyclerView.mRecycler, recyclerView.mState, view, kVar);
        }
    }

    public View onInterceptFocusSearch(View view, int i) {
        return null;
    }

    public void onItemsAdded(RecyclerView recyclerView, int i, int i2) {
    }

    public void onItemsChanged(RecyclerView recyclerView) {
    }

    public void onItemsMoved(RecyclerView recyclerView, int i, int i2, int i3) {
    }

    public void onItemsRemoved(RecyclerView recyclerView, int i, int i2) {
    }

    public void onItemsUpdated(RecyclerView recyclerView, int i, int i2) {
    }

    public void onItemsUpdated(RecyclerView recyclerView, int i, int i2, Object obj) {
        onItemsUpdated(recyclerView, i, i2);
    }

    public void onLayoutChildren(C0661fw fwVar, C0670ge geVar) {
        Log.e("RecyclerView", "You must override onLayoutChildren(Recycler recycler, State state) ");
    }

    public void onLayoutCompleted(C0670ge geVar) {
    }

    public void onMeasure(C0661fw fwVar, C0670ge geVar, int i, int i2) {
        this.mRecyclerView.defaultOnMeasure(i, i2);
    }

    public boolean onRequestChildFocus(RecyclerView recyclerView, C0670ge geVar, View view, View view2) {
        return onRequestChildFocus(recyclerView, view, view2);
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
    }

    public Parcelable onSaveInstanceState() {
        return null;
    }

    public void onScrollStateChanged(int i) {
    }

    public void onSmoothScrollerStopped(C0669gd gdVar) {
        if (this.mSmoothScroller == gdVar) {
            this.mSmoothScroller = null;
        }
    }

    public boolean performAccessibilityAction(int i, Bundle bundle) {
        RecyclerView recyclerView = this.mRecyclerView;
        return performAccessibilityAction(recyclerView.mRecycler, recyclerView.mState, i, bundle);
    }

    public boolean performAccessibilityActionForItem(C0661fw fwVar, C0670ge geVar, View view, int i, Bundle bundle) {
        return false;
    }

    public boolean performAccessibilityActionForItem(View view, int i, Bundle bundle) {
        RecyclerView recyclerView = this.mRecyclerView;
        return performAccessibilityActionForItem(recyclerView.mRecycler, recyclerView.mState, view, i, bundle);
    }

    public void postOnAnimation(Runnable runnable) {
        RecyclerView recyclerView = this.mRecyclerView;
        if (recyclerView != null) {
            C2043bi.m5520N(recyclerView, runnable);
        }
    }

    public void removeAllViews() {
        int childCount = getChildCount();
        while (true) {
            childCount--;
            if (childCount >= 0) {
                this.mChildHelper.mo2610j(childCount);
            } else {
                return;
            }
        }
    }

    public void removeAndRecycleAllViews(C0661fw fwVar) {
        int childCount = getChildCount();
        while (true) {
            childCount--;
            if (childCount < 0) {
                return;
            }
            if (!RecyclerView.getChildViewHolderInt(getChildAt(childCount)).shouldIgnore()) {
                removeAndRecycleViewAt(childCount, fwVar);
            }
        }
    }

    public void removeAndRecycleScrapInt(C0661fw fwVar) {
        int size = fwVar.f2431a.size();
        for (int i = size - 1; i >= 0; i--) {
            View view = ((C0673gh) fwVar.f2431a.get(i)).itemView;
            C0673gh childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
            if (!childViewHolderInt.shouldIgnore()) {
                childViewHolderInt.setIsRecyclable(false);
                if (childViewHolderInt.isTmpDetached()) {
                    this.mRecyclerView.removeDetachedView(view, false);
                }
                C0646fh fhVar = this.mRecyclerView.mItemAnimator;
                if (fhVar != null) {
                    fhVar.mo2687c(childViewHolderInt);
                }
                childViewHolderInt.setIsRecyclable(true);
                fwVar.mo3030g(view);
            }
        }
        fwVar.f2431a.clear();
        ArrayList arrayList = fwVar.f2432b;
        if (arrayList != null) {
            arrayList.clear();
        }
        if (size > 0) {
            this.mRecyclerView.invalidate();
        }
    }

    public void removeAndRecycleView(View view, C0661fw fwVar) {
        removeView(view);
        fwVar.mo3033j(view);
    }

    public void removeAndRecycleViewAt(int i, C0661fw fwVar) {
        View childAt = getChildAt(i);
        removeViewAt(i);
        fwVar.mo3033j(childAt);
    }

    public boolean removeCallbacks(Runnable runnable) {
        RecyclerView recyclerView = this.mRecyclerView;
        if (recyclerView != null) {
            return recyclerView.removeCallbacks(runnable);
        }
        return false;
    }

    public void removeDetachedView(View view) {
        this.mRecyclerView.removeDetachedView(view, false);
    }

    public void removeView(View view) {
        C0550bt btVar = this.mChildHelper;
        int indexOfChild = btVar.f2143c.f2402a.indexOfChild(view);
        if (indexOfChild >= 0) {
            if (btVar.f2141a.mo2599g(indexOfChild)) {
                btVar.mo2612l(view);
            }
            btVar.f2143c.mo2863b(indexOfChild);
        }
    }

    public void removeViewAt(int i) {
        if (getChildAt(i) != null) {
            this.mChildHelper.mo2610j(i);
        }
    }

    public boolean requestChildRectangleOnScreen(RecyclerView recyclerView, View view, Rect rect, boolean z) {
        return requestChildRectangleOnScreen(recyclerView, view, rect, z, false);
    }

    public void requestLayout() {
        RecyclerView recyclerView = this.mRecyclerView;
        if (recyclerView != null) {
            recyclerView.requestLayout();
        }
    }

    public void requestSimpleAnimationsInNextLayout() {
        this.mRequestedSimpleAnimations = true;
    }

    public int scrollHorizontallyBy(int i, C0661fw fwVar, C0670ge geVar) {
        return 0;
    }

    public void scrollToPosition(int i) {
    }

    public int scrollVerticallyBy(int i, C0661fw fwVar, C0670ge geVar) {
        return 0;
    }

    @Deprecated
    public void setAutoMeasureEnabled(boolean z) {
        this.mAutoMeasure = z;
    }

    public void setExactMeasureSpecsFrom(RecyclerView recyclerView) {
        setMeasureSpecs(View.MeasureSpec.makeMeasureSpec(recyclerView.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(recyclerView.getHeight(), 1073741824));
    }

    public final void setItemPrefetchEnabled(boolean z) {
        if (z != this.mItemPrefetchEnabled) {
            this.mItemPrefetchEnabled = z;
            this.mPrefetchMaxCountObserved = 0;
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView != null) {
                recyclerView.mRecycler.mo3038o();
            }
        }
    }

    public void setMeasureSpecs(int i, int i2) {
        this.mWidth = View.MeasureSpec.getSize(i);
        int mode = View.MeasureSpec.getMode(i);
        this.mWidthMode = mode;
        if (mode == 0 && !RecyclerView.ALLOW_SIZE_IN_UNSPECIFIED_SPEC) {
            this.mWidth = 0;
        }
        this.mHeight = View.MeasureSpec.getSize(i2);
        int mode2 = View.MeasureSpec.getMode(i2);
        this.mHeightMode = mode2;
        if (mode2 == 0 && !RecyclerView.ALLOW_SIZE_IN_UNSPECIFIED_SPEC) {
            this.mHeight = 0;
        }
    }

    public void setMeasuredDimension(int i, int i2) {
        this.mRecyclerView.setMeasuredDimension(i, i2);
    }

    public void setMeasuredDimensionFromChildren(int i, int i2) {
        int childCount = getChildCount();
        if (childCount != 0) {
            int i3 = LinearLayoutManager.INVALID_OFFSET;
            int i4 = LinearLayoutManager.INVALID_OFFSET;
            int i5 = Integer.MAX_VALUE;
            int i6 = Integer.MAX_VALUE;
            for (int i7 = 0; i7 < childCount; i7++) {
                View childAt = getChildAt(i7);
                Rect rect = this.mRecyclerView.mTempRect;
                getDecoratedBoundsWithMargins(childAt, rect);
                if (rect.left < i5) {
                    i5 = rect.left;
                }
                if (rect.right > i3) {
                    i3 = rect.right;
                }
                if (rect.top < i6) {
                    i6 = rect.top;
                }
                if (rect.bottom > i4) {
                    i4 = rect.bottom;
                }
            }
            this.mRecyclerView.mTempRect.set(i5, i6, i3, i4);
            setMeasuredDimension(this.mRecyclerView.mTempRect, i, i2);
            return;
        }
        this.mRecyclerView.defaultOnMeasure(i, i2);
    }

    public void setMeasurementCacheEnabled(boolean z) {
        this.mMeasurementCacheEnabled = z;
    }

    public void setRecyclerView(RecyclerView recyclerView) {
        if (recyclerView == null) {
            this.mRecyclerView = null;
            this.mChildHelper = null;
            this.mWidth = 0;
            this.mHeight = 0;
        } else {
            this.mRecyclerView = recyclerView;
            this.mChildHelper = recyclerView.mChildHelper;
            this.mWidth = recyclerView.getWidth();
            this.mHeight = recyclerView.getHeight();
        }
        this.mWidthMode = 1073741824;
        this.mHeightMode = 1073741824;
    }

    public boolean shouldMeasureChild(View view, int i, int i2, C0654fp fpVar) {
        return view.isLayoutRequested() || !this.mMeasurementCacheEnabled || !isMeasurementUpToDate(view.getWidth(), i, fpVar.width) || !isMeasurementUpToDate(view.getHeight(), i2, fpVar.height);
    }

    public boolean shouldMeasureTwice() {
        return false;
    }

    public boolean shouldReMeasureChild(View view, int i, int i2, C0654fp fpVar) {
        return !this.mMeasurementCacheEnabled || !isMeasurementUpToDate(view.getMeasuredWidth(), i, fpVar.width) || !isMeasurementUpToDate(view.getMeasuredHeight(), i2, fpVar.height);
    }

    public void smoothScrollToPosition(RecyclerView recyclerView, C0670ge geVar, int i) {
        Log.e("RecyclerView", "You must override smoothScrollToPosition to support smooth scrolling");
    }

    public void startSmoothScroll(C0669gd gdVar) {
        C0669gd gdVar2 = this.mSmoothScroller;
        if (!(gdVar2 == null || gdVar == gdVar2 || !gdVar2.f2453k)) {
            gdVar2.mo3051l();
        }
        this.mSmoothScroller = gdVar;
        RecyclerView recyclerView = this.mRecyclerView;
        recyclerView.mViewFlinger.mo3060d();
        if (gdVar.f2455m) {
            Log.w("RecyclerView", "An instance of " + gdVar.getClass().getSimpleName() + " was started more than once. Each instance of" + gdVar.getClass().getSimpleName() + " is intended to only be used once. You should create a new instance for each use.");
        }
        gdVar.f2450h = recyclerView;
        gdVar.f2451i = this;
        int i = gdVar.f2449g;
        if (i != -1) {
            RecyclerView recyclerView2 = gdVar.f2450h;
            recyclerView2.mState.f2456a = i;
            gdVar.f2453k = true;
            gdVar.f2452j = true;
            gdVar.f2454l = recyclerView2.mLayout.findViewByPosition(gdVar.f2449g);
            gdVar.f2450h.mViewFlinger.mo3058b();
            gdVar.f2455m = true;
            return;
        }
        throw new IllegalArgumentException("Invalid target position");
    }

    public void stopIgnoringView(View view) {
        C0673gh childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
        childViewHolderInt.mFlags &= -129;
        childViewHolderInt.resetInternal();
        childViewHolderInt.mFlags |= 4;
    }

    public void stopSmoothScroller() {
        C0669gd gdVar = this.mSmoothScroller;
        if (gdVar != null) {
            gdVar.mo3051l();
        }
    }

    public boolean supportsPredictiveItemAnimations() {
        return false;
    }

    public void addDisappearingView(View view, int i) {
        addViewInt(view, i, true);
    }

    public void addView(View view, int i) {
        addViewInt(view, i, false);
    }

    public void attachView(View view, int i) {
        attachView(view, i, (C0654fp) view.getLayoutParams());
    }

    public C0654fp generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof C0654fp) {
            return new C0654fp((C0654fp) layoutParams);
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new C0654fp((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new C0654fp(layoutParams);
    }

    @Deprecated
    public boolean onRequestChildFocus(RecyclerView recyclerView, View view, View view2) {
        return isSmoothScrolling() || recyclerView.isComputingLayout();
    }

    /* JADX WARNING: Removed duplicated region for block: B:29:0x008e  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0092  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean performAccessibilityAction(android.support.p033v7.widget.C0661fw r3, android.support.p033v7.widget.C0670ge r4, int r5, android.os.Bundle r6) {
        /*
            r2 = this;
            android.support.v7.widget.RecyclerView r3 = r2.mRecyclerView
            r4 = 0
            if (r3 != 0) goto L_0x0006
            return r4
        L_0x0006:
            int r3 = r2.getHeight()
            int r6 = r2.getWidth()
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            android.support.v7.widget.RecyclerView r1 = r2.mRecyclerView
            android.graphics.Matrix r1 = r1.getMatrix()
            boolean r1 = r1.isIdentity()
            if (r1 == 0) goto L_0x002f
            android.support.v7.widget.RecyclerView r1 = r2.mRecyclerView
            boolean r1 = r1.getGlobalVisibleRect(r0)
            if (r1 == 0) goto L_0x002f
            int r3 = r0.height()
            int r6 = r0.width()
        L_0x002f:
            r0 = 4096(0x1000, float:5.74E-42)
            r1 = 1
            if (r5 == r0) goto L_0x0065
            r0 = 8192(0x2000, float:1.14794E-41)
            if (r5 == r0) goto L_0x003b
            r3 = 0
        L_0x0039:
            r5 = 0
            goto L_0x008c
        L_0x003b:
            android.support.v7.widget.RecyclerView r5 = r2.mRecyclerView
            r0 = -1
            boolean r5 = r5.canScrollVertically(r0)
            if (r5 == 0) goto L_0x0050
            int r5 = r2.getPaddingTop()
            int r3 = r3 - r5
            int r5 = r2.getPaddingBottom()
            int r3 = r3 - r5
            int r3 = -r3
            goto L_0x0051
        L_0x0050:
            r3 = 0
        L_0x0051:
            android.support.v7.widget.RecyclerView r5 = r2.mRecyclerView
            boolean r5 = r5.canScrollHorizontally(r0)
            if (r5 == 0) goto L_0x0039
            int r5 = r2.getPaddingLeft()
            int r6 = r6 - r5
            int r5 = r2.getPaddingRight()
            int r6 = r6 - r5
            int r5 = -r6
            goto L_0x008c
        L_0x0065:
            android.support.v7.widget.RecyclerView r5 = r2.mRecyclerView
            boolean r5 = r5.canScrollVertically(r1)
            if (r5 == 0) goto L_0x0078
            int r5 = r2.getPaddingTop()
            int r3 = r3 - r5
            int r5 = r2.getPaddingBottom()
            int r3 = r3 - r5
            goto L_0x0079
        L_0x0078:
            r3 = 0
        L_0x0079:
            android.support.v7.widget.RecyclerView r5 = r2.mRecyclerView
            boolean r5 = r5.canScrollHorizontally(r1)
            if (r5 == 0) goto L_0x0039
            int r5 = r2.getPaddingLeft()
            int r6 = r6 - r5
            int r5 = r2.getPaddingRight()
            int r5 = r6 - r5
        L_0x008c:
            if (r3 != 0) goto L_0x0092
            if (r5 == 0) goto L_0x0091
            goto L_0x0093
        L_0x0091:
            return r4
        L_0x0092:
            r4 = r3
        L_0x0093:
            android.support.v7.widget.RecyclerView r3 = r2.mRecyclerView
            r6 = 0
            r3.smoothScrollBy$ar$ds$a5e2b4f9_0(r5, r4, r6, r1)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p033v7.widget.C0653fo.performAccessibilityAction(android.support.v7.widget.fw, android.support.v7.widget.ge, int, android.os.Bundle):boolean");
    }

    public boolean requestChildRectangleOnScreen(RecyclerView recyclerView, View view, Rect rect, boolean z, boolean z2) {
        int[] childRectangleOnScreenScrollAmount = getChildRectangleOnScreenScrollAmount(view, rect);
        int i = childRectangleOnScreenScrollAmount[0];
        int i2 = childRectangleOnScreenScrollAmount[1];
        if (!z2 || isFocusedChildVisibleAfterScrolling(recyclerView, i, i2)) {
            if (i == 0) {
                if (i2 != 0) {
                    i = 0;
                }
            }
            if (z) {
                recyclerView.scrollBy(i, i2);
            } else {
                recyclerView.smoothScrollBy$ar$ds$a5e2b4f9_0(i, i2, (Interpolator) null, false);
            }
            return true;
        }
        return false;
    }

    public void setMeasuredDimension(Rect rect, int i, int i2) {
        int width = rect.width();
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        int height = rect.height();
        int paddingTop = getPaddingTop();
        setMeasuredDimension(chooseSize(i, width + paddingLeft + paddingRight, getMinimumWidth()), chooseSize(i2, height + paddingTop + getPaddingBottom(), getMinimumHeight()));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000a, code lost:
        if (r3 >= 0) goto L_0x0011;
     */
    @java.lang.Deprecated
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int getChildMeasureSpec(int r1, int r2, int r3, boolean r4) {
        /*
            int r1 = r1 - r2
            r2 = 0
            int r1 = java.lang.Math.max(r2, r1)
            r0 = 1073741824(0x40000000, float:2.0)
            if (r4 == 0) goto L_0x000f
            if (r3 < 0) goto L_0x000d
            goto L_0x0011
        L_0x000d:
            r3 = 0
            goto L_0x0021
        L_0x000f:
            if (r3 < 0) goto L_0x0014
        L_0x0011:
            r2 = 1073741824(0x40000000, float:2.0)
            goto L_0x0021
        L_0x0014:
            r4 = -1
            if (r3 != r4) goto L_0x001b
            r2 = 1073741824(0x40000000, float:2.0)
        L_0x0019:
            r3 = r1
            goto L_0x0021
        L_0x001b:
            r4 = -2
            if (r3 != r4) goto L_0x000d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            goto L_0x0019
        L_0x0021:
            int r1 = android.view.View.MeasureSpec.makeMeasureSpec(r3, r2)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p033v7.widget.C0653fo.getChildMeasureSpec(int, int, int, boolean):int");
    }

    public void attachView(View view, int i, C0654fp fpVar) {
        C0673gh childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
        if (childViewHolderInt.isRemoved()) {
            this.mRecyclerView.mViewInfoStore.mo3264b(childViewHolderInt);
        } else {
            this.mRecyclerView.mViewInfoStore.mo3268f(childViewHolderInt);
        }
        this.mChildHelper.mo2607g(view, i, fpVar, childViewHolderInt.isRemoved());
    }

    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        RecyclerView recyclerView = this.mRecyclerView;
        onInitializeAccessibilityEvent(recyclerView.mRecycler, recyclerView.mState, accessibilityEvent);
    }

    public void onInitializeAccessibilityNodeInfo(C1991k kVar) {
        RecyclerView recyclerView = this.mRecyclerView;
        onInitializeAccessibilityNodeInfo(recyclerView.mRecycler, recyclerView.mState, kVar);
    }
}
