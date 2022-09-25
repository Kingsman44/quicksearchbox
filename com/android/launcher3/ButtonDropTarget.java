package com.android.launcher3;

import android.animation.AnimatorSet;
import android.animation.FloatArrayEvaluator;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.ColorFilter;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import android.widget.TextView;
import com.android.launcher3.DragController;
import com.android.launcher3.DropTarget;
import com.android.launcher3.accessibility.DragViewStateAnnouncer;
import com.evernote.android.state.BuildConfig;
import com.google.android.googlequicksearchbox.R;

/* compiled from: PG */
public abstract class ButtonDropTarget extends TextView implements DropTarget, DragController.DragListener, View.OnClickListener {
    private static int DRAG_VIEW_DROP_DURATION = 285;
    protected boolean mActive;
    private int mBottomDragPadding;
    private AnimatorSet mCurrentColorAnim;
    ColorMatrix mCurrentFilter;
    protected Drawable mDrawable;
    ColorMatrix mDstFilter;
    protected int mHoverColor;
    protected Launcher mLauncher;
    protected ColorStateList mOriginalTextColor;
    protected SearchDropTargetBar mSearchDropTargetBar;
    ColorMatrix mSrcFilter;

    public ButtonDropTarget(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    private final void animateTextColor(int i) {
        AnimatorSet animatorSet = this.mCurrentColorAnim;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.mCurrentColorAnim = animatorSet2;
        animatorSet2.setDuration(120);
        if (this.mSrcFilter == null) {
            this.mSrcFilter = new ColorMatrix();
            this.mDstFilter = new ColorMatrix();
            this.mCurrentFilter = new ColorMatrix();
        }
        DragView.setColorScale(getTextColor(), this.mSrcFilter);
        DragView.setColorScale(i, this.mDstFilter);
        ValueAnimator ofObject = ValueAnimator.ofObject(new FloatArrayEvaluator(this.mCurrentFilter.getArray()), new Object[]{this.mSrcFilter.getArray(), this.mDstFilter.getArray()});
        ofObject.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                ButtonDropTarget buttonDropTarget = ButtonDropTarget.this;
                buttonDropTarget.mDrawable.setColorFilter(new ColorMatrixColorFilter(buttonDropTarget.mCurrentFilter));
                ButtonDropTarget.this.invalidate();
            }
        });
        this.mCurrentColorAnim.play(ofObject);
        this.mCurrentColorAnim.play(ObjectAnimator.ofArgb(this, "textColor", new int[]{i}));
        this.mCurrentColorAnim.start();
    }

    public final boolean acceptDrop(DropTarget.DragObject dragObject) {
        return supportsDrop(dragObject.dragSource, dragObject.dragInfo);
    }

    public abstract void completeDrop(DropTarget.DragObject dragObject);

    public final void getHitRectRelativeToDragLayer(Rect rect) {
        super.getHitRect(rect);
        rect.bottom += this.mBottomDragPadding;
        int[] iArr = new int[2];
        Utilities.getDescendantCoordRelativeToParent(this, this.mLauncher.mDragLayer, iArr, false);
        rect.offsetTo(iArr[0], iArr[1]);
    }

    /* access modifiers changed from: protected */
    public final Rect getIconRect(int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        DragLayer dragLayer = this.mLauncher.mDragLayer;
        Rect rect = new Rect();
        dragLayer.getViewRectRelativeToSelf(this, rect);
        if (Utilities.isRtl(getResources())) {
            i6 = rect.right - getPaddingRight();
            i5 = i6 - i3;
        } else {
            i5 = getPaddingLeft() + rect.left;
            i6 = i5 + i3;
        }
        int measuredHeight = rect.top + ((getMeasuredHeight() - i4) / 2);
        rect.set(i5, measuredHeight, i6, measuredHeight + i4);
        rect.offset((-(i - i3)) / 2, (-(i2 - i4)) / 2);
        return rect;
    }

    public int getTextColor() {
        return getTextColors().getDefaultColor();
    }

    public final boolean isDropEnabled() {
        return this.mActive;
    }

    public final void onClick(View view) {
        LauncherAppState.getInstance().mAccessibilityDelegate.handleAccessibleDrop(this, (Rect) null, (String) null);
    }

    public final void onDragEnd() {
        this.mActive = false;
    }

    public final void onDragEnter(DropTarget.DragObject dragObject) {
        dragObject.dragView.setColor(this.mHoverColor);
        if (Utilities.ATLEAST_LOLLIPOP) {
            animateTextColor(this.mHoverColor);
        } else {
            if (this.mCurrentFilter == null) {
                this.mCurrentFilter = new ColorMatrix();
            }
            DragView.setColorScale(this.mHoverColor, this.mCurrentFilter);
            this.mDrawable.setColorFilter(new ColorMatrixColorFilter(this.mCurrentFilter));
            setTextColor(this.mHoverColor);
        }
        DragViewStateAnnouncer dragViewStateAnnouncer = dragObject.stateAnnouncer;
        if (dragViewStateAnnouncer != null) {
            dragViewStateAnnouncer.mTargetView.removeCallbacks(dragViewStateAnnouncer);
        }
        sendAccessibilityEvent(4);
    }

    public final void onDragExit(DropTarget.DragObject dragObject) {
        if (!dragObject.dragComplete) {
            dragObject.dragView.setColor(0);
            if (Utilities.ATLEAST_LOLLIPOP) {
                animateTextColor(this.mOriginalTextColor.getDefaultColor());
                return;
            }
            this.mDrawable.setColorFilter((ColorFilter) null);
            setTextColor(this.mOriginalTextColor);
            return;
        }
        dragObject.dragView.setColor(this.mHoverColor);
    }

    public final void onDragOver(DropTarget.DragObject dragObject) {
    }

    public final void onDragStart$ar$ds(DragSource dragSource, Object obj) {
        this.mActive = supportsDrop(dragSource, obj);
        this.mDrawable.setColorFilter((ColorFilter) null);
        AnimatorSet animatorSet = this.mCurrentColorAnim;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.mCurrentColorAnim = null;
        }
        setTextColor(this.mOriginalTextColor);
        ((ViewGroup) getParent()).setVisibility(true != this.mActive ? 8 : 0);
    }

    public void onDrop(final DropTarget.DragObject dragObject) {
        DragLayer dragLayer = this.mLauncher.mDragLayer;
        Rect rect = new Rect();
        dragLayer.getViewRectRelativeToSelf(dragObject.dragView, rect);
        Rect iconRect = getIconRect(dragObject.dragView.getMeasuredWidth(), dragObject.dragView.getMeasuredHeight(), this.mDrawable.getIntrinsicWidth(), this.mDrawable.getIntrinsicHeight());
        int width = iconRect.width();
        int width2 = rect.width();
        this.mSearchDropTargetBar.mDeferOnDragEnd = true;
        C52202 r11 = new Runnable() {
            public final void run() {
                ButtonDropTarget.this.completeDrop(dragObject);
                ButtonDropTarget.this.mSearchDropTargetBar.onDragEnd();
                ButtonDropTarget.this.mLauncher.exitSpringLoadedDragModeDelayed$ar$ds(true, 0);
            }
        };
        float f = ((float) width) / ((float) width2);
        dragLayer.animateView$ar$ds(dragObject.dragView, rect, iconRect, f, 0.1f, 0.1f, DRAG_VIEW_DROP_DURATION, new DecelerateInterpolator(2.0f), new LinearInterpolator(), r11, 0, (View) null);
    }

    /* access modifiers changed from: protected */
    public void onFinishInflate() {
        super.onFinishInflate();
        this.mOriginalTextColor = getTextColors();
        if (Launcher.getLauncher(getContext()).mDeviceProfile.isVerticalBarLayout()) {
            setText(BuildConfig.FLAVOR);
        }
    }

    public void onFlingToDelete(DropTarget.DragObject dragObject, PointF pointF) {
    }

    public final void prepareAccessibilityDrop() {
    }

    /* access modifiers changed from: protected */
    public final void setDrawable(int i) {
        this.mDrawable = getResources().getDrawable(i);
        if (Utilities.ATLEAST_JB_MR1) {
            setCompoundDrawablesRelativeWithIntrinsicBounds(this.mDrawable, (Drawable) null, (Drawable) null, (Drawable) null);
        } else {
            setCompoundDrawablesWithIntrinsicBounds(this.mDrawable, (Drawable) null, (Drawable) null, (Drawable) null);
        }
    }

    /* access modifiers changed from: protected */
    public abstract boolean supportsDrop(DragSource dragSource, Object obj);

    public ButtonDropTarget(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mHoverColor = 0;
        this.mBottomDragPadding = getResources().getDimensionPixelSize(R.dimen.drop_target_drag_padding);
    }
}
