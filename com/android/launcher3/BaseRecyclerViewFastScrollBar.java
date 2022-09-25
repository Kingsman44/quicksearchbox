package com.android.launcher3;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ArgbEvaluator;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.res.Resources;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import com.android.launcher3.FastBitmapDrawable;
import com.google.android.googlequicksearchbox.R;

/* compiled from: PG */
public class BaseRecyclerViewFastScrollBar {
    public boolean mCanThumbDetach;
    private boolean mIgnoreDragGesture;
    private Rect mInvalidateRect = new Rect();
    public boolean mIsDragging;
    public boolean mIsThumbDetached;
    public float mLastTouchY;
    public BaseRecyclerViewFastScrollPopup mPopup;
    BaseRecyclerView mRv;
    private AnimatorSet mScrollbarAnimator;
    private int mThumbActiveColor;
    private int mThumbCurvature;
    int mThumbHeight;
    private int mThumbInactiveColor;
    public int mThumbMaxWidth;
    private int mThumbMinWidth;
    public Point mThumbOffset = new Point(-1, -1);
    Paint mThumbPaint;
    public Path mThumbPath = new Path();
    int mThumbWidth;
    private Rect mTmpRect = new Rect();
    private int mTouchInset;
    private int mTouchOffset;
    public Paint mTrackPaint;
    private int mTrackWidth;

    /* compiled from: PG */
    public interface FastScrollFocusableView {
        void setFastScrollFocusState(FastBitmapDrawable.State state, boolean z);
    }

    public BaseRecyclerViewFastScrollBar(BaseRecyclerView baseRecyclerView, Resources resources) {
        this.mRv = baseRecyclerView;
        this.mPopup = new BaseRecyclerViewFastScrollPopup(baseRecyclerView, resources);
        Paint paint = new Paint();
        this.mTrackPaint = paint;
        paint.setColor(baseRecyclerView.getFastScrollerTrackColor$ar$ds());
        this.mTrackPaint.setAlpha(30);
        this.mThumbInactiveColor = resources.getColor(R.color.container_fastscroll_thumb_inactive_color);
        this.mThumbActiveColor = resources.getColor(R.color.container_fastscroll_thumb_active_color);
        Paint paint2 = new Paint();
        this.mThumbPaint = paint2;
        paint2.setAntiAlias(true);
        this.mThumbPaint.setColor(this.mThumbInactiveColor);
        this.mThumbPaint.setStyle(Paint.Style.FILL);
        int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.container_fastscroll_thumb_min_width);
        this.mThumbMinWidth = dimensionPixelSize;
        this.mThumbWidth = dimensionPixelSize;
        this.mThumbMaxWidth = resources.getDimensionPixelSize(R.dimen.container_fastscroll_thumb_max_width);
        this.mThumbHeight = resources.getDimensionPixelSize(R.dimen.container_fastscroll_thumb_height);
        this.mThumbCurvature = this.mThumbMaxWidth - this.mThumbMinWidth;
        this.mTouchInset = resources.getDimensionPixelSize(R.dimen.container_fastscroll_thumb_touch_inset);
    }

    private final boolean isNearThumb(int i, int i2) {
        this.mTmpRect.set(this.mThumbOffset.x, this.mThumbOffset.y, this.mThumbOffset.x + this.mThumbWidth, this.mThumbOffset.y + this.mThumbHeight);
        Rect rect = this.mTmpRect;
        int i3 = this.mTouchInset;
        rect.inset(i3, i3);
        return this.mTmpRect.contains(i, i2);
    }

    private final void showActiveScrollbar(boolean z) {
        int i;
        int i2;
        int i3;
        AnimatorSet animatorSet = this.mScrollbarAnimator;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        this.mScrollbarAnimator = new AnimatorSet();
        int[] iArr = new int[1];
        if (z) {
            i = this.mThumbMaxWidth;
        } else {
            i = this.mThumbMinWidth;
        }
        iArr[0] = i;
        ObjectAnimator ofInt = ObjectAnimator.ofInt(this, "trackWidth", iArr);
        int[] iArr2 = new int[1];
        if (z) {
            i2 = this.mThumbMaxWidth;
        } else {
            i2 = this.mThumbMinWidth;
        }
        iArr2[0] = i2;
        ObjectAnimator ofInt2 = ObjectAnimator.ofInt(this, "thumbWidth", iArr2);
        this.mScrollbarAnimator.playTogether(new Animator[]{ofInt, ofInt2});
        if (this.mThumbActiveColor != this.mThumbInactiveColor) {
            ArgbEvaluator argbEvaluator = new ArgbEvaluator();
            Object[] objArr = new Object[2];
            objArr[0] = Integer.valueOf(this.mThumbPaint.getColor());
            if (z) {
                i3 = this.mThumbActiveColor;
            } else {
                i3 = this.mThumbInactiveColor;
            }
            objArr[1] = Integer.valueOf(i3);
            ValueAnimator ofObject = ValueAnimator.ofObject(argbEvaluator, objArr);
            ofObject.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    BaseRecyclerViewFastScrollBar.this.mThumbPaint.setColor(((Integer) valueAnimator.getAnimatedValue()).intValue());
                    BaseRecyclerViewFastScrollBar baseRecyclerViewFastScrollBar = BaseRecyclerViewFastScrollBar.this;
                    BaseRecyclerView baseRecyclerView = baseRecyclerViewFastScrollBar.mRv;
                    int i = baseRecyclerViewFastScrollBar.mThumbOffset.x;
                    int i2 = BaseRecyclerViewFastScrollBar.this.mThumbOffset.y;
                    int i3 = BaseRecyclerViewFastScrollBar.this.mThumbOffset.x;
                    BaseRecyclerViewFastScrollBar baseRecyclerViewFastScrollBar2 = BaseRecyclerViewFastScrollBar.this;
                    baseRecyclerView.invalidate(i, i2, i3 + baseRecyclerViewFastScrollBar2.mThumbWidth, baseRecyclerViewFastScrollBar2.mThumbOffset.y + BaseRecyclerViewFastScrollBar.this.mThumbHeight);
                }
            });
            this.mScrollbarAnimator.play(ofObject);
        }
        this.mScrollbarAnimator.setDuration(150);
        this.mScrollbarAnimator.start();
    }

    private final void updateThumbPath() {
        this.mThumbCurvature = this.mThumbMaxWidth - this.mThumbWidth;
        this.mThumbPath.reset();
        this.mThumbPath.moveTo((float) (this.mThumbOffset.x + this.mThumbWidth), (float) this.mThumbOffset.y);
        this.mThumbPath.lineTo((float) (this.mThumbOffset.x + this.mThumbWidth), (float) (this.mThumbOffset.y + this.mThumbHeight));
        this.mThumbPath.lineTo((float) this.mThumbOffset.x, (float) (this.mThumbOffset.y + this.mThumbHeight));
        this.mThumbPath.cubicTo((float) this.mThumbOffset.x, (float) (this.mThumbOffset.y + this.mThumbHeight), (float) (this.mThumbOffset.x - this.mThumbCurvature), (float) (this.mThumbOffset.y + (this.mThumbHeight / 2)), (float) this.mThumbOffset.x, (float) this.mThumbOffset.y);
        this.mThumbPath.close();
    }

    public int getThumbWidth() {
        return this.mThumbWidth;
    }

    public int getTrackWidth() {
        return this.mTrackWidth;
    }

    public final void handleTouchEvent(MotionEvent motionEvent, int i, int i2, int i3) {
        ViewConfiguration viewConfiguration = ViewConfiguration.get(this.mRv.getContext());
        int action = motionEvent.getAction();
        int y = (int) motionEvent.getY();
        if (action != 0) {
            if (action != 1) {
                if (action == 2) {
                    int i4 = y - i2;
                    boolean z = this.mIgnoreDragGesture | (Math.abs(i4) > viewConfiguration.getScaledPagingTouchSlop());
                    this.mIgnoreDragGesture = z;
                    if (!this.mIsDragging && !z && this.mRv.supportsFastScrolling() && isNearThumb(i, i3) && Math.abs(i4) > viewConfiguration.getScaledTouchSlop()) {
                        this.mRv.getParent().requestDisallowInterceptTouchEvent(true);
                        this.mIsDragging = true;
                        if (this.mCanThumbDetach) {
                            this.mIsThumbDetached = true;
                        }
                        this.mTouchOffset += i3 - i2;
                        this.mPopup.animateVisibility(true);
                        showActiveScrollbar(true);
                    }
                    if (this.mIsDragging) {
                        int i5 = this.mRv.mBackgroundPadding.top;
                        int height = (this.mRv.getHeight() - this.mRv.mBackgroundPadding.bottom) - this.mThumbHeight;
                        float max = (float) Math.max(i5, Math.min(height, y - this.mTouchOffset));
                        String scrollToPositionAtProgress = this.mRv.scrollToPositionAtProgress((max - ((float) i5)) / ((float) (height - i5)));
                        BaseRecyclerViewFastScrollPopup baseRecyclerViewFastScrollPopup = this.mPopup;
                        if (!scrollToPositionAtProgress.equals(baseRecyclerViewFastScrollPopup.mSectionName)) {
                            baseRecyclerViewFastScrollPopup.mSectionName = scrollToPositionAtProgress;
                            baseRecyclerViewFastScrollPopup.mTextPaint.getTextBounds(scrollToPositionAtProgress, 0, scrollToPositionAtProgress.length(), baseRecyclerViewFastScrollPopup.mTextBounds);
                            Rect rect = baseRecyclerViewFastScrollPopup.mTextBounds;
                            rect.right = (int) (((float) rect.left) + baseRecyclerViewFastScrollPopup.mTextPaint.measureText(scrollToPositionAtProgress));
                        }
                        this.mPopup.animateVisibility(!scrollToPositionAtProgress.isEmpty());
                        BaseRecyclerView baseRecyclerView = this.mRv;
                        BaseRecyclerViewFastScrollPopup baseRecyclerViewFastScrollPopup2 = this.mPopup;
                        baseRecyclerViewFastScrollPopup2.mInvalidateRect.set(baseRecyclerViewFastScrollPopup2.mBgBounds);
                        if (baseRecyclerViewFastScrollPopup2.isVisible()) {
                            int i6 = baseRecyclerViewFastScrollPopup2.mRv.mScrollbar.mThumbMaxWidth;
                            int height2 = (baseRecyclerViewFastScrollPopup2.mBgOriginalSize - baseRecyclerViewFastScrollPopup2.mTextBounds.height()) / 2;
                            int i7 = baseRecyclerViewFastScrollPopup2.mBgOriginalSize;
                            int max2 = Math.max(i7, baseRecyclerViewFastScrollPopup2.mTextBounds.width() + height2 + height2);
                            if (Utilities.isRtl(baseRecyclerViewFastScrollPopup2.mRes)) {
                                Rect rect2 = baseRecyclerViewFastScrollPopup2.mBgBounds;
                                int i8 = baseRecyclerViewFastScrollPopup2.mRv.mBackgroundPadding.left;
                                int i9 = baseRecyclerViewFastScrollPopup2.mRv.mScrollbar.mThumbMaxWidth;
                                rect2.left = i8 + i9 + i9;
                                Rect rect3 = baseRecyclerViewFastScrollPopup2.mBgBounds;
                                rect3.right = rect3.left + max2;
                            } else {
                                Rect rect4 = baseRecyclerViewFastScrollPopup2.mBgBounds;
                                int width = baseRecyclerViewFastScrollPopup2.mRv.getWidth();
                                int i10 = baseRecyclerViewFastScrollPopup2.mRv.mBackgroundPadding.right;
                                int i11 = baseRecyclerViewFastScrollPopup2.mRv.mScrollbar.mThumbMaxWidth;
                                rect4.right = (width - i10) - (i11 + i11);
                                Rect rect5 = baseRecyclerViewFastScrollPopup2.mBgBounds;
                                rect5.left = rect5.right - max2;
                            }
                            baseRecyclerViewFastScrollPopup2.mBgBounds.top = i3 - ((int) (((float) i7) * 1.5f));
                            Rect rect6 = baseRecyclerViewFastScrollPopup2.mBgBounds;
                            rect6.top = Math.max(i6, Math.min(rect6.top, (baseRecyclerViewFastScrollPopup2.mRv.getHeight() - i6) - i7));
                            Rect rect7 = baseRecyclerViewFastScrollPopup2.mBgBounds;
                            rect7.bottom = rect7.top + i7;
                        } else {
                            baseRecyclerViewFastScrollPopup2.mBgBounds.setEmpty();
                        }
                        baseRecyclerViewFastScrollPopup2.mInvalidateRect.union(baseRecyclerViewFastScrollPopup2.mBgBounds);
                        baseRecyclerView.invalidate(baseRecyclerViewFastScrollPopup2.mInvalidateRect);
                        this.mLastTouchY = max;
                        return;
                    }
                    return;
                } else if (action != 3) {
                    return;
                }
            }
            this.mTouchOffset = 0;
            this.mLastTouchY = 0.0f;
            this.mIgnoreDragGesture = false;
            if (this.mIsDragging) {
                this.mIsDragging = false;
                this.mPopup.animateVisibility(false);
                showActiveScrollbar(false);
            }
        } else if (isNearThumb(i, i2)) {
            this.mTouchOffset = i2 - this.mThumbOffset.y;
        }
    }

    public final void setThumbOffset(int i, int i2) {
        if (this.mThumbOffset.x != i || this.mThumbOffset.y != i2) {
            this.mInvalidateRect.set(this.mThumbOffset.x - this.mThumbCurvature, this.mThumbOffset.y, this.mThumbOffset.x + this.mThumbWidth, this.mThumbOffset.y + this.mThumbHeight);
            this.mThumbOffset.set(i, i2);
            updateThumbPath();
            this.mInvalidateRect.union(this.mThumbOffset.x - this.mThumbCurvature, this.mThumbOffset.y, this.mThumbOffset.x + this.mThumbWidth, this.mThumbOffset.y + this.mThumbHeight);
            this.mRv.invalidate(this.mInvalidateRect);
        }
    }

    public void setThumbWidth(int i) {
        this.mInvalidateRect.set(this.mThumbOffset.x - this.mThumbCurvature, this.mThumbOffset.y, this.mThumbOffset.x + this.mThumbWidth, this.mThumbOffset.y + this.mThumbHeight);
        this.mThumbWidth = i;
        updateThumbPath();
        this.mInvalidateRect.union(this.mThumbOffset.x - this.mThumbCurvature, this.mThumbOffset.y, this.mThumbOffset.x + this.mThumbWidth, this.mThumbOffset.y + this.mThumbHeight);
        this.mRv.invalidate(this.mInvalidateRect);
    }

    public void setTrackWidth(int i) {
        this.mInvalidateRect.set(this.mThumbOffset.x - this.mThumbCurvature, 0, this.mThumbOffset.x + this.mThumbWidth, this.mRv.getHeight());
        this.mTrackWidth = i;
        updateThumbPath();
        this.mInvalidateRect.union(this.mThumbOffset.x - this.mThumbCurvature, 0, this.mThumbOffset.x + this.mThumbWidth, this.mRv.getHeight());
        this.mRv.invalidate(this.mInvalidateRect);
    }
}
