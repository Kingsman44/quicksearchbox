package com.android.launcher3;

import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.View;
import com.google.android.googlequicksearchbox.R;

/* compiled from: PG */
public class FocusIndicatorView extends View implements View.OnFocusChangeListener {
    private ObjectAnimator mCurrentAnimation;
    private final int[] mIndicatorPos;
    private boolean mInitiated;
    private View mLastFocusedView;
    private Pair mPendingCall;
    private ViewAnimState mTargetState;
    private final int[] mTargetViewPos;

    /* compiled from: PG */
    final class ViewAnimState {
        float scaleX;
        float scaleY;

        /* renamed from: x */
        float f16554x;

        /* renamed from: y */
        float f16555y;
    }

    public FocusIndicatorView(Context context) {
        this(context, (AttributeSet) null);
    }

    private final void applyState(ViewAnimState viewAnimState) {
        setTranslationX(viewAnimState.f16554x);
        setTranslationY(viewAnimState.f16555y);
        setScaleX(viewAnimState.scaleX);
        setScaleY(viewAnimState.scaleY);
    }

    private static void computeLocationRelativeToParent(View view, View view2, int[] iArr) {
        iArr[1] = 0;
        iArr[0] = 0;
        computeLocationRelativeToParentHelper(view, view2, iArr);
        iArr[0] = (int) (((float) iArr[0]) + (((1.0f - view.getScaleX()) * ((float) view.getWidth())) / 2.0f));
        iArr[1] = (int) (((float) iArr[1]) + (((1.0f - view.getScaleY()) * ((float) view.getHeight())) / 2.0f));
    }

    private static void computeLocationRelativeToParentHelper(View view, View view2, int[] iArr) {
        View view3 = (View) view.getParent();
        iArr[0] = iArr[0] + view.getLeft();
        iArr[1] = iArr[1] + view.getTop();
        if (view3 instanceof PagedView) {
            PagedView pagedView = (PagedView) view3;
            iArr[0] = iArr[0] - pagedView.getScrollForPage(pagedView.indexOfChild(view));
        }
        if (view3 != view2) {
            computeLocationRelativeToParentHelper(view3, view2, iArr);
        }
    }

    public final void endCurrentAnimation() {
        ObjectAnimator objectAnimator = this.mCurrentAnimation;
        if (objectAnimator != null) {
            objectAnimator.cancel();
            this.mCurrentAnimation = null;
        }
        ViewAnimState viewAnimState = this.mTargetState;
        if (viewAnimState != null) {
            applyState(viewAnimState);
            this.mTargetState = null;
        }
    }

    /* access modifiers changed from: protected */
    public final void onDraw(Canvas canvas) {
        Pair pair = this.mPendingCall;
        if (pair != null) {
            onFocusChange((View) pair.first, ((Boolean) this.mPendingCall.second).booleanValue());
        }
    }

    public final void onFocusChange(View view, boolean z) {
        this.mPendingCall = null;
        if (this.mInitiated || getWidth() != 0) {
            if (!this.mInitiated) {
                computeLocationRelativeToParent(this, (View) getParent(), this.mIndicatorPos);
                this.mInitiated = true;
            }
            if (z) {
                int width = getWidth();
                int height = getHeight();
                endCurrentAnimation();
                ViewAnimState viewAnimState = new ViewAnimState();
                float f = (float) width;
                viewAnimState.scaleX = (view.getScaleX() * ((float) view.getWidth())) / f;
                float f2 = (float) height;
                viewAnimState.scaleY = (view.getScaleY() * ((float) view.getHeight())) / f2;
                computeLocationRelativeToParent(view, (View) getParent(), this.mTargetViewPos);
                int[] iArr = this.mTargetViewPos;
                int i = iArr[0];
                int[] iArr2 = this.mIndicatorPos;
                viewAnimState.f16554x = ((float) (i - iArr2[0])) - (((1.0f - viewAnimState.scaleX) * f) / 2.0f);
                viewAnimState.f16555y = ((float) (iArr[1] - iArr2[1])) - (((1.0f - viewAnimState.scaleY) * f2) / 2.0f);
                if (getAlpha() > 0.2f) {
                    this.mTargetState = viewAnimState;
                    this.mCurrentAnimation = LauncherAnimUtils.ofPropertyValuesHolder(this, PropertyValuesHolder.ofFloat(View.ALPHA, new float[]{1.0f}), PropertyValuesHolder.ofFloat(View.TRANSLATION_X, new float[]{this.mTargetState.f16554x}), PropertyValuesHolder.ofFloat(View.TRANSLATION_Y, new float[]{this.mTargetState.f16555y}), PropertyValuesHolder.ofFloat(View.SCALE_X, new float[]{this.mTargetState.scaleX}), PropertyValuesHolder.ofFloat(View.SCALE_Y, new float[]{this.mTargetState.scaleY}));
                } else {
                    applyState(viewAnimState);
                    this.mCurrentAnimation = LauncherAnimUtils.ofPropertyValuesHolder(this, PropertyValuesHolder.ofFloat(View.ALPHA, new float[]{1.0f}));
                }
                this.mLastFocusedView = view;
            } else if (this.mLastFocusedView == view) {
                this.mLastFocusedView = null;
                endCurrentAnimation();
                this.mCurrentAnimation = LauncherAnimUtils.ofPropertyValuesHolder(this, PropertyValuesHolder.ofFloat(View.ALPHA, new float[]{0.0f}));
            }
            ObjectAnimator objectAnimator = this.mCurrentAnimation;
            if (objectAnimator != null) {
                objectAnimator.setDuration(150).start();
                return;
            }
            return;
        }
        this.mPendingCall = Pair.create(view, Boolean.valueOf(z));
        invalidate();
    }

    /* access modifiers changed from: protected */
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        View view = this.mLastFocusedView;
        if (view != null) {
            this.mPendingCall = Pair.create(view, Boolean.TRUE);
            invalidate();
        }
    }

    public FocusIndicatorView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mIndicatorPos = new int[2];
        this.mTargetViewPos = new int[2];
        setAlpha(0.0f);
        setBackgroundColor(getResources().getColor(R.color.focused_background));
    }
}
