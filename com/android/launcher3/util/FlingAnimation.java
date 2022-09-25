package com.android.launcher3.util;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.graphics.PointF;
import android.graphics.Rect;
import android.view.animation.DecelerateInterpolator;
import com.android.launcher3.DragLayer;
import com.android.launcher3.DragView;
import com.android.launcher3.DropTarget;

/* compiled from: PG */
public final class FlingAnimation implements ValueAnimator.AnimatorUpdateListener {
    protected final float mAX;
    protected final float mAY;
    protected final TimeInterpolator mAlphaInterpolator = new DecelerateInterpolator(0.75f);
    protected final float mAnimationTimeFraction;
    protected final DragLayer mDragLayer;
    public final int mDuration;
    protected final Rect mFrom;
    protected final Rect mIconRect;
    protected final float mUX;
    protected final float mUY;

    public FlingAnimation(DropTarget.DragObject dragObject, PointF pointF, Rect rect, DragLayer dragLayer) {
        float f = pointF.x / 1000.0f;
        this.mUX = f;
        float f2 = pointF.y / 1000.0f;
        this.mUY = f2;
        this.mIconRect = rect;
        this.mDragLayer = dragLayer;
        Rect rect2 = new Rect();
        this.mFrom = rect2;
        dragLayer.getViewRectRelativeToSelf(dragObject.dragView, rect2);
        float scaleX = dragObject.dragView.getScaleX() - 4.0f;
        float measuredWidth = (((float) dragObject.dragView.getMeasuredWidth()) * scaleX) / 2.0f;
        float measuredHeight = (scaleX * ((float) dragObject.dragView.getMeasuredHeight())) / 2.0f;
        rect2.left = (int) (((float) rect2.left) + measuredWidth);
        rect2.right = (int) (((float) rect2.right) - measuredWidth);
        rect2.top = (int) (((float) rect2.top) + measuredHeight);
        rect2.bottom = (int) (((float) rect2.bottom) - measuredHeight);
        float f3 = (float) (-rect2.bottom);
        float f4 = f2 * f2;
        float f5 = ((f3 + f3) * 0.5f) + f4;
        if (f5 >= 0.0f) {
            this.mAY = 0.5f;
        } else {
            float f6 = -f3;
            this.mAY = f4 / (f6 + f6);
            f5 = 0.0f;
        }
        double d = (double) (-f2);
        double sqrt = Math.sqrt((double) f5);
        Double.isNaN(d);
        double d2 = d - sqrt;
        double d3 = (double) this.mAY;
        Double.isNaN(d3);
        double d4 = d2 / d3;
        double exactCenterX = (double) ((-rect2.exactCenterX()) + rect.exactCenterX());
        double d5 = (double) f;
        Double.isNaN(d5);
        Double.isNaN(exactCenterX);
        double d6 = exactCenterX - (d5 * d4);
        this.mAX = (float) ((d6 + d6) / (d4 * d4));
        int round = (int) Math.round(d4);
        this.mDuration = round;
        this.mAnimationTimeFraction = ((float) round) / ((float) (round + 300));
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float animatedFraction = valueAnimator.getAnimatedFraction();
        float f = this.mAnimationTimeFraction;
        float f2 = animatedFraction > f ? 1.0f : animatedFraction / f;
        DragView dragView = this.mDragLayer.mDropView;
        float f3 = ((float) this.mDuration) * f2;
        dragView.setTranslationX((this.mUX * f3) + ((float) this.mFrom.left) + (((this.mAX * f3) * f3) / 2.0f));
        dragView.setTranslationY((this.mUY * f3) + ((float) this.mFrom.top) + (((this.mAY * f3) * f3) / 2.0f));
        dragView.setAlpha(1.0f - this.mAlphaInterpolator.getInterpolation(f2));
    }
}
