package com.android.launcher3;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.googlequicksearchbox.R;

/* compiled from: PG */
public final class ClickShadowView extends View {
    private Bitmap mBitmap;
    private final Paint mPaint;
    private final float mShadowOffset = getResources().getDimension(R.dimen.click_shadow_high_shift);
    private final float mShadowPadding = getResources().getDimension(R.dimen.blur_size_click_shadow);

    public ClickShadowView(Context context) {
        super(context);
        Paint paint = new Paint(2);
        this.mPaint = paint;
        paint.setColor(-16777216);
    }

    public final void alignWithIconView(BubbleTextView bubbleTextView, ViewGroup viewGroup) {
        int left = bubbleTextView.getLeft();
        int left2 = viewGroup.getLeft();
        int left3 = getLeft();
        int top = bubbleTextView.getTop();
        int top2 = viewGroup.getTop();
        int top3 = getTop();
        int right = bubbleTextView.getRight() - bubbleTextView.getLeft();
        int compoundPaddingRight = bubbleTextView.getCompoundPaddingRight();
        setTranslationX(((((((float) ((left + left2) - left3)) + viewGroup.getTranslationX()) + (((float) bubbleTextView.getCompoundPaddingLeft()) * bubbleTextView.getScaleX())) + (((((float) ((right - compoundPaddingRight) - bubbleTextView.getCompoundPaddingLeft())) - ((float) bubbleTextView.mIcon.getBounds().width())) * bubbleTextView.getScaleX()) / 2.0f)) + ((((float) right) * (1.0f - bubbleTextView.getScaleX())) / 2.0f)) - this.mShadowPadding);
        setTranslationY((((((float) ((top + top2) - top3)) + viewGroup.getTranslationY()) + (((float) bubbleTextView.getPaddingTop()) * bubbleTextView.getScaleY())) + ((((float) bubbleTextView.getHeight()) * (1.0f - bubbleTextView.getScaleY())) / 2.0f)) - this.mShadowPadding);
    }

    public final void animateShadow() {
        setAlpha(0.0f);
        animate().alpha(1.0f).setDuration(2000).setInterpolator(FastBitmapDrawable.CLICK_FEEDBACK_INTERPOLATOR).start();
    }

    public final int getExtraSize() {
        return (int) (this.mShadowPadding * 3.0f);
    }

    /* access modifiers changed from: protected */
    public final void onDraw(Canvas canvas) {
        if (this.mBitmap != null) {
            this.mPaint.setAlpha(30);
            canvas.drawBitmap(this.mBitmap, 0.0f, 0.0f, this.mPaint);
            this.mPaint.setAlpha(60);
            canvas.drawBitmap(this.mBitmap, 0.0f, this.mShadowOffset, this.mPaint);
        }
    }

    public final boolean setBitmap(Bitmap bitmap) {
        if (bitmap == this.mBitmap) {
            return false;
        }
        this.mBitmap = bitmap;
        invalidate();
        return true;
    }
}
