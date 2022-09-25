package com.android.launcher3;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.content.res.Resources;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import com.google.android.googlequicksearchbox.R;

/* compiled from: PG */
public class BaseRecyclerViewFastScrollPopup {
    public float mAlpha;
    private Animator mAlphaAnimator;
    public Drawable mBg;
    public Rect mBgBounds = new Rect();
    public int mBgOriginalSize;
    public Rect mInvalidateRect = new Rect();
    public Resources mRes;
    public BaseRecyclerView mRv;
    public String mSectionName;
    public Rect mTextBounds = new Rect();
    public Paint mTextPaint;
    public Rect mTmpRect = new Rect();
    private boolean mVisible;

    public BaseRecyclerViewFastScrollPopup(BaseRecyclerView baseRecyclerView, Resources resources) {
        this.mRes = resources;
        this.mRv = baseRecyclerView;
        this.mBgOriginalSize = resources.getDimensionPixelSize(R.dimen.container_fastscroll_popup_size);
        Drawable drawable = resources.getDrawable(R.drawable.container_fastscroll_popup_bg);
        this.mBg = drawable;
        int i = this.mBgOriginalSize;
        drawable.setBounds(0, 0, i, i);
        Paint paint = new Paint();
        this.mTextPaint = paint;
        paint.setColor(-1);
        this.mTextPaint.setAntiAlias(true);
        this.mTextPaint.setTextSize((float) resources.getDimensionPixelSize(R.dimen.container_fastscroll_popup_text_size));
    }

    public final void animateVisibility(boolean z) {
        if (this.mVisible != z) {
            this.mVisible = z;
            Animator animator = this.mAlphaAnimator;
            if (animator != null) {
                animator.cancel();
            }
            float[] fArr = new float[1];
            fArr[0] = true != z ? 0.0f : 1.0f;
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, "alpha", fArr);
            this.mAlphaAnimator = ofFloat;
            ofFloat.setDuration(true != z ? 150 : 200);
            this.mAlphaAnimator.start();
        }
    }

    public float getAlpha() {
        return this.mAlpha;
    }

    public final boolean isVisible() {
        return this.mAlpha > 0.0f && this.mSectionName != null;
    }

    public void setAlpha(float f) {
        this.mAlpha = f;
        this.mRv.invalidate(this.mBgBounds);
    }
}
