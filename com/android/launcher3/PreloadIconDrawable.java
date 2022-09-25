package com.android.launcher3;

import android.animation.ObjectAnimator;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import com.android.launcher3.FastBitmapDrawable;
import org.chromium.net.PrivateKeyType;

/* compiled from: PG */
public class PreloadIconDrawable extends Drawable {
    private static final Rect sTempRect = new Rect();
    public float mAnimationProgress = -1.0f;
    public ObjectAnimator mAnimator;
    private Drawable mBgDrawable;
    final Drawable mIcon;
    private int mIndicatorColor = 0;
    private final RectF mIndicatorRect = new RectF();
    private boolean mIndicatorRectDirty;
    private final Paint mPaint;
    private int mProgress = 0;
    public int mRingOutset;

    public PreloadIconDrawable(Drawable drawable, Resources.Theme theme) {
        this.mIcon = drawable;
        Paint paint = new Paint(1);
        this.mPaint = paint;
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.ROUND);
        setBounds(drawable.getBounds());
        applyPreloaderTheme(theme);
        onLevelChange(0);
    }

    public final void applyPreloaderTheme(Resources.Theme theme) {
        TypedArray obtainStyledAttributes = theme.obtainStyledAttributes(R$styleable.PreloadIconDrawable);
        Drawable drawable = obtainStyledAttributes.getDrawable(0);
        this.mBgDrawable = drawable;
        drawable.setFilterBitmap(true);
        this.mPaint.setStrokeWidth(obtainStyledAttributes.getDimension(1, 0.0f));
        this.mRingOutset = obtainStyledAttributes.getDimensionPixelSize(2, 0);
        obtainStyledAttributes.recycle();
        onBoundsChange(getBounds());
        invalidateSelf();
    }

    public final void draw(Canvas canvas) {
        Rect rect = new Rect(getBounds());
        Rect rect2 = sTempRect;
        if (!canvas.getClipBounds(rect2) || Rect.intersects(rect2, rect)) {
            if (this.mIndicatorRectDirty) {
                Drawable drawable = this.mBgDrawable;
                Rect bounds = drawable.getBounds();
                drawable.getPadding(rect2);
                float width = ((float) bounds.width()) / ((float) drawable.getIntrinsicWidth());
                float height = ((float) bounds.height()) / ((float) drawable.getIntrinsicHeight());
                this.mIndicatorRect.set(((float) bounds.left) + (((float) rect2.left) * width), ((float) bounds.top) + (((float) rect2.top) * height), ((float) bounds.right) - (((float) rect2.right) * width), ((float) bounds.bottom) - (((float) rect2.bottom) * height));
                float strokeWidth = this.mPaint.getStrokeWidth() / 2.0f;
                this.mIndicatorRect.inset(strokeWidth, strokeWidth);
                this.mIndicatorRectDirty = false;
            }
            float f = this.mAnimationProgress;
            float f2 = 1.0f;
            if (f >= 0.0f && f < 1.0f) {
                this.mPaint.setAlpha((int) ((1.0f - f) * 255.0f));
                this.mBgDrawable.setAlpha(this.mPaint.getAlpha());
                this.mBgDrawable.draw(canvas);
                canvas.drawOval(this.mIndicatorRect, this.mPaint);
                f2 = (this.mAnimationProgress * 0.5f) + 0.5f;
            } else if (f == -1.0f) {
                this.mPaint.setAlpha(PrivateKeyType.INVALID);
                this.mBgDrawable.setAlpha(PrivateKeyType.INVALID);
                this.mBgDrawable.draw(canvas);
                int i = this.mProgress;
                if (i >= 100) {
                    canvas.drawOval(this.mIndicatorRect, this.mPaint);
                } else if (i > 0) {
                    canvas.drawArc(this.mIndicatorRect, -90.0f, ((float) i) * 3.6f, false, this.mPaint);
                }
                f2 = 0.5f;
            }
            canvas.save();
            canvas.scale(f2, f2, rect.exactCenterX(), rect.exactCenterY());
            this.mIcon.draw(canvas);
            canvas.restore();
        }
    }

    public float getAnimationProgress() {
        return this.mAnimationProgress;
    }

    public final int getIntrinsicHeight() {
        return this.mIcon.getIntrinsicHeight();
    }

    public final int getIntrinsicWidth() {
        return this.mIcon.getIntrinsicWidth();
    }

    public final int getOpacity() {
        return -3;
    }

    /* access modifiers changed from: protected */
    public final void onBoundsChange(Rect rect) {
        this.mIcon.setBounds(rect);
        if (this.mBgDrawable != null) {
            Rect rect2 = sTempRect;
            rect2.set(rect);
            int i = -this.mRingOutset;
            rect2.inset(i, i);
            this.mBgDrawable.setBounds(rect2);
        }
        this.mIndicatorRectDirty = true;
    }

    /* access modifiers changed from: protected */
    public final boolean onLevelChange(int i) {
        this.mProgress = i;
        ObjectAnimator objectAnimator = this.mAnimator;
        if (objectAnimator != null) {
            objectAnimator.cancel();
            this.mAnimator = null;
        }
        this.mAnimationProgress = -1.0f;
        if (i > 0) {
            Paint paint = this.mPaint;
            int i2 = this.mIndicatorColor;
            if (i2 == 0) {
                Drawable drawable = this.mIcon;
                if (!(drawable instanceof FastBitmapDrawable)) {
                    this.mIndicatorColor = -16738680;
                } else {
                    int findDominantColorByHue$ar$ds = Utilities.findDominantColorByHue$ar$ds(((FastBitmapDrawable) drawable).mBitmap);
                    this.mIndicatorColor = findDominantColorByHue$ar$ds;
                    float[] fArr = new float[3];
                    Color.colorToHSV(findDominantColorByHue$ar$ds, fArr);
                    if (fArr[1] < 0.2f) {
                        this.mIndicatorColor = -16738680;
                    } else {
                        fArr[2] = Math.max(0.6f, fArr[2]);
                        i2 = Color.HSVToColor(fArr);
                        this.mIndicatorColor = i2;
                    }
                }
                i2 = -16738680;
            }
            paint.setColor(i2);
        }
        Drawable drawable2 = this.mIcon;
        if (drawable2 instanceof FastBitmapDrawable) {
            ((FastBitmapDrawable) drawable2).setState(i <= 0 ? FastBitmapDrawable.State.DISABLED : FastBitmapDrawable.State.NORMAL);
        }
        invalidateSelf();
        return true;
    }

    public final void setAlpha(int i) {
        this.mIcon.setAlpha(i);
    }

    public void setAnimationProgress(float f) {
        if (f != this.mAnimationProgress) {
            this.mAnimationProgress = f;
            invalidateSelf();
        }
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        this.mIcon.setColorFilter(colorFilter);
    }
}
