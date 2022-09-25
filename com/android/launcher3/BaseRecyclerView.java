package com.android.launcher3;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.support.p033v7.widget.C0657fs;
import android.support.p033v7.widget.C0658ft;
import android.support.p033v7.widget.RecyclerView;
import android.util.AttributeSet;
import android.view.MotionEvent;

/* compiled from: PG */
public abstract class BaseRecyclerView extends RecyclerView implements C0657fs {
    public Rect mBackgroundPadding;
    private float mDeltaThreshold;
    private int mDownX;
    private int mDownY;
    int mDy;
    private int mLastY;
    public BaseRecyclerViewFastScrollBar mScrollbar;

    /* compiled from: PG */
    final class ScrollListener extends C0658ft {
        public ScrollListener() {
        }

        public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
            BaseRecyclerView baseRecyclerView = BaseRecyclerView.this;
            baseRecyclerView.mDy = i2;
            baseRecyclerView.onUpdateScrollbar(i2);
        }
    }

    /* compiled from: PG */
    public final class ScrollPositionState {
        public int itemPos;
        public int rowIndex;
        public int rowTopOffset;
    }

    public BaseRecyclerView(Context context) {
        this(context, (AttributeSet) null);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0017, code lost:
        if (r0 != 3) goto L_0x0060;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final boolean handleTouchEvent(android.view.MotionEvent r5) {
        /*
            r4 = this;
            int r0 = r5.getAction()
            float r1 = r5.getX()
            int r1 = (int) r1
            float r2 = r5.getY()
            int r2 = (int) r2
            if (r0 == 0) goto L_0x0035
            r1 = 1
            if (r0 == r1) goto L_0x0026
            r1 = 2
            if (r0 == r1) goto L_0x001a
            r1 = 3
            if (r0 == r1) goto L_0x0026
            goto L_0x0060
        L_0x001a:
            r4.mLastY = r2
            com.android.launcher3.BaseRecyclerViewFastScrollBar r0 = r4.mScrollbar
            int r1 = r4.mDownX
            int r3 = r4.mDownY
            r0.handleTouchEvent(r5, r1, r3, r2)
            goto L_0x0060
        L_0x0026:
            r4.onFastScrollCompleted()
            com.android.launcher3.BaseRecyclerViewFastScrollBar r0 = r4.mScrollbar
            int r1 = r4.mDownX
            int r2 = r4.mDownY
            int r3 = r4.mLastY
            r0.handleTouchEvent(r5, r1, r2, r3)
            goto L_0x0060
        L_0x0035:
            r4.mDownX = r1
            r4.mLastY = r2
            r4.mDownY = r2
            int r0 = r5.getAction()
            if (r0 != 0) goto L_0x0055
            int r0 = r4.mDy
            int r0 = java.lang.Math.abs(r0)
            float r0 = (float) r0
            float r1 = r4.mDeltaThreshold
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x0055
            int r0 = r4.mScrollState
            if (r0 == 0) goto L_0x0055
            r4.stopScroll()
        L_0x0055:
            com.android.launcher3.BaseRecyclerViewFastScrollBar r0 = r4.mScrollbar
            int r1 = r4.mDownX
            int r2 = r4.mDownY
            int r3 = r4.mLastY
            r0.handleTouchEvent(r5, r1, r2, r3)
        L_0x0060:
            com.android.launcher3.BaseRecyclerViewFastScrollBar r5 = r4.mScrollbar
            boolean r5 = r5.mIsDragging
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.launcher3.BaseRecyclerView.handleTouchEvent(android.view.MotionEvent):boolean");
    }

    /* access modifiers changed from: protected */
    public void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        onUpdateScrollbar(0);
        BaseRecyclerViewFastScrollBar baseRecyclerViewFastScrollBar = this.mScrollbar;
        if (baseRecyclerViewFastScrollBar.mThumbOffset.x >= 0 && baseRecyclerViewFastScrollBar.mThumbOffset.y >= 0) {
            if (baseRecyclerViewFastScrollBar.mTrackPaint.getAlpha() > 0) {
                canvas.drawRect((float) baseRecyclerViewFastScrollBar.mThumbOffset.x, 0.0f, (float) (baseRecyclerViewFastScrollBar.mThumbOffset.x + baseRecyclerViewFastScrollBar.mThumbWidth), (float) baseRecyclerViewFastScrollBar.mRv.getHeight(), baseRecyclerViewFastScrollBar.mTrackPaint);
            }
            canvas.drawPath(baseRecyclerViewFastScrollBar.mThumbPath, baseRecyclerViewFastScrollBar.mThumbPaint);
            BaseRecyclerViewFastScrollPopup baseRecyclerViewFastScrollPopup = baseRecyclerViewFastScrollBar.mPopup;
            if (baseRecyclerViewFastScrollPopup.isVisible()) {
                int save = canvas.save();
                canvas.translate((float) baseRecyclerViewFastScrollPopup.mBgBounds.left, (float) baseRecyclerViewFastScrollPopup.mBgBounds.top);
                baseRecyclerViewFastScrollPopup.mTmpRect.set(baseRecyclerViewFastScrollPopup.mBgBounds);
                baseRecyclerViewFastScrollPopup.mTmpRect.offsetTo(0, 0);
                baseRecyclerViewFastScrollPopup.mBg.setBounds(baseRecyclerViewFastScrollPopup.mTmpRect);
                baseRecyclerViewFastScrollPopup.mBg.setAlpha((int) (baseRecyclerViewFastScrollPopup.mAlpha * 255.0f));
                baseRecyclerViewFastScrollPopup.mBg.draw(canvas);
                baseRecyclerViewFastScrollPopup.mTextPaint.setAlpha((int) (baseRecyclerViewFastScrollPopup.mAlpha * 255.0f));
                canvas.drawText(baseRecyclerViewFastScrollPopup.mSectionName, (float) ((baseRecyclerViewFastScrollPopup.mBgBounds.width() - baseRecyclerViewFastScrollPopup.mTextBounds.width()) / 2), (float) (baseRecyclerViewFastScrollPopup.mBgBounds.height() - ((baseRecyclerViewFastScrollPopup.mBgBounds.height() - baseRecyclerViewFastScrollPopup.mTextBounds.height()) / 2)), baseRecyclerViewFastScrollPopup.mTextPaint);
                canvas.restoreToCount(save);
            }
        }
    }

    /* access modifiers changed from: protected */
    public final int getAvailableScrollBarHeight() {
        return getVisibleHeight() - this.mScrollbar.mThumbHeight;
    }

    /* access modifiers changed from: protected */
    public final int getAvailableScrollHeight(int i) {
        return ((getPaddingTop() + getTop(i)) + getPaddingBottom()) - getVisibleHeight();
    }

    public int getFastScrollerTrackColor$ar$ds() {
        return -16777216;
    }

    /* access modifiers changed from: protected */
    public final int getScrollTop(ScrollPositionState scrollPositionState) {
        return (getPaddingTop() + getTop(scrollPositionState.rowIndex)) - scrollPositionState.rowTopOffset;
    }

    /* access modifiers changed from: protected */
    public abstract int getTop(int i);

    /* access modifiers changed from: protected */
    public final int getVisibleHeight() {
        return (getHeight() - this.mBackgroundPadding.top) - this.mBackgroundPadding.bottom;
    }

    /* access modifiers changed from: protected */
    public void onFastScrollCompleted() {
    }

    /* access modifiers changed from: protected */
    public void onFinishInflate() {
        super.onFinishInflate();
        this.mOnItemTouchListeners.add(this);
    }

    public final boolean onInterceptTouchEvent(RecyclerView recyclerView, MotionEvent motionEvent) {
        return handleTouchEvent(motionEvent);
    }

    public final void onRequestDisallowInterceptTouchEvent(boolean z) {
    }

    public final void onTouchEvent$ar$ds(MotionEvent motionEvent) {
        handleTouchEvent(motionEvent);
    }

    /* access modifiers changed from: protected */
    public abstract void onUpdateScrollbar(int i);

    /* access modifiers changed from: protected */
    public abstract String scrollToPositionAtProgress(float f);

    /* access modifiers changed from: protected */
    public boolean supportsFastScrolling() {
        return true;
    }

    /* access modifiers changed from: protected */
    public final void synchronizeScrollBarThumbOffsetToViewScroll(ScrollPositionState scrollPositionState, int i) {
        int i2;
        int availableScrollBarHeight = getAvailableScrollBarHeight();
        int availableScrollHeight = getAvailableScrollHeight(i);
        if (availableScrollHeight <= 0) {
            this.mScrollbar.setThumbOffset(-1, -1);
            return;
        }
        int scrollTop = this.mBackgroundPadding.top + ((int) ((((float) getScrollTop(scrollPositionState)) / ((float) availableScrollHeight)) * ((float) availableScrollBarHeight)));
        if (Utilities.isRtl(getResources())) {
            i2 = this.mBackgroundPadding.left;
        } else {
            i2 = (getWidth() - this.mBackgroundPadding.right) - this.mScrollbar.getThumbWidth();
        }
        this.mScrollbar.setThumbOffset(i2, scrollTop);
    }

    public BaseRecyclerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public BaseRecyclerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mDy = 0;
        this.mBackgroundPadding = new Rect();
        this.mDeltaThreshold = getResources().getDisplayMetrics().density * 4.0f;
        this.mScrollbar = new BaseRecyclerViewFastScrollBar(this, getResources());
        this.mScrollListener = new ScrollListener();
    }
}
