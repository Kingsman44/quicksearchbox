package com.android.launcher3;

import android.animation.ValueAnimator;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.View;
import com.android.launcher3.DragLayer;
import com.google.android.googlequicksearchbox.R;

/* compiled from: PG */
public final class DragView extends View {
    public final ValueAnimator mAnim;
    public int mAnimatedShiftX;
    public int mAnimatedShiftY;
    private final Bitmap mBitmap;
    public Bitmap mCrossFadeBitmap;
    float mCrossFadeProgress = 0.0f;
    float[] mCurrentFilter;
    private DragLayer mDragLayer = null;
    public Rect mDragRegion = null;
    public Point mDragVisualizeOffset = null;
    private ValueAnimator mFilterAnimator;
    public boolean mHasDrawn = false;
    public float mIntrinsicIconScale = 1.0f;
    private int mLastTouchX;
    private int mLastTouchY;
    Paint mPaint;
    private final int mRegistrationX;
    private final int mRegistrationY;

    public DragView(Launcher launcher, Bitmap bitmap, int i, int i2, final float f, float f2) {
        super(launcher);
        this.mDragLayer = launcher.mDragLayer;
        int width = bitmap.getWidth();
        int width2 = bitmap.getWidth();
        setScaleX(f);
        setScaleY(f);
        ValueAnimator ofFloat$ar$ds = LauncherAnimUtils.ofFloat$ar$ds(0.0f, 1.0f);
        this.mAnim = ofFloat$ar$ds;
        ofFloat$ar$ds.setDuration(150);
        final float f3 = (((float) width) + f2) / ((float) width2);
        ofFloat$ar$ds.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                DragView dragView = DragView.this;
                float f = f;
                dragView.setScaleX(f + ((f3 - f) * floatValue));
                DragView dragView2 = DragView.this;
                float f2 = f;
                dragView2.setScaleY(f2 + (floatValue * (f3 - f2)));
                if (DragView.this.getParent() == null) {
                    valueAnimator.cancel();
                    return;
                }
                DragView dragView3 = DragView.this;
                dragView3.setTranslationX(dragView3.getTranslationX() + 0.0f);
                DragView dragView4 = DragView.this;
                dragView4.setTranslationY(dragView4.getTranslationY() + 0.0f);
            }
        });
        this.mBitmap = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight());
        this.mDragRegion = new Rect(0, 0, bitmap.getWidth(), bitmap.getHeight());
        this.mRegistrationX = i;
        this.mRegistrationY = i2;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        measure(makeMeasureSpec, makeMeasureSpec);
        this.mPaint = new Paint(2);
        if (Utilities.ATLEAST_LOLLIPOP) {
            setElevation(getResources().getDimension(R.dimen.drag_elevation));
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v2, resolved type: java.lang.Object[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void animateFilterTo(float[] r5) {
        /*
            r4 = this;
            float[] r0 = r4.mCurrentFilter
            if (r0 != 0) goto L_0x000d
            android.graphics.ColorMatrix r0 = new android.graphics.ColorMatrix
            r0.<init>()
            float[] r0 = r0.getArray()
        L_0x000d:
            int r1 = r0.length
            float[] r1 = java.util.Arrays.copyOf(r0, r1)
            r4.mCurrentFilter = r1
            android.animation.ValueAnimator r1 = r4.mFilterAnimator
            if (r1 == 0) goto L_0x001b
            r1.cancel()
        L_0x001b:
            android.animation.FloatArrayEvaluator r1 = new android.animation.FloatArrayEvaluator
            float[] r2 = r4.mCurrentFilter
            r1.<init>(r2)
            r2 = 2
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = 0
            r2[r3] = r0
            r0 = 1
            r2[r0] = r5
            android.animation.ValueAnimator r5 = android.animation.ValueAnimator.ofObject(r1, r2)
            r4.mFilterAnimator = r5
            r0 = 120(0x78, double:5.93E-322)
            r5.setDuration(r0)
            android.animation.ValueAnimator r5 = r4.mFilterAnimator
            com.android.launcher3.DragView$3 r0 = new com.android.launcher3.DragView$3
            r0.<init>()
            r5.addUpdateListener(r0)
            android.animation.ValueAnimator r5 = r4.mFilterAnimator
            r5.start()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.launcher3.DragView.animateFilterTo(float[]):void");
    }

    public static void setColorScale(int i, ColorMatrix colorMatrix) {
        colorMatrix.setScale(((float) Color.red(i)) / 255.0f, ((float) Color.green(i)) / 255.0f, ((float) Color.blue(i)) / 255.0f, ((float) Color.alpha(i)) / 255.0f);
    }

    public final void applyTranslation() {
        setTranslationX((float) ((this.mLastTouchX - this.mRegistrationX) + this.mAnimatedShiftX));
        setTranslationY((float) ((this.mLastTouchY - this.mRegistrationY) + this.mAnimatedShiftY));
    }

    public final void move(int i, int i2) {
        this.mLastTouchX = i;
        this.mLastTouchY = i2;
        applyTranslation();
    }

    /* access modifiers changed from: protected */
    public final void onDraw(Canvas canvas) {
        boolean z = true;
        this.mHasDrawn = true;
        float f = this.mCrossFadeProgress;
        boolean z2 = false;
        if (f > 0.0f && this.mCrossFadeBitmap != null) {
            z2 = true;
        }
        if (z2) {
            this.mPaint.setAlpha((int) ((1.0f - f) * 255.0f));
        } else {
            z = z2;
        }
        canvas.drawBitmap(this.mBitmap, 0.0f, 0.0f, this.mPaint);
        if (z) {
            this.mPaint.setAlpha((int) (this.mCrossFadeProgress * 255.0f));
            canvas.save();
            canvas.scale(((float) this.mBitmap.getWidth()) / ((float) this.mCrossFadeBitmap.getWidth()), ((float) this.mBitmap.getHeight()) / ((float) this.mCrossFadeBitmap.getHeight()));
            canvas.drawBitmap(this.mCrossFadeBitmap, 0.0f, 0.0f, this.mPaint);
            canvas.restore();
        }
    }

    /* access modifiers changed from: protected */
    public final void onMeasure(int i, int i2) {
        setMeasuredDimension(this.mBitmap.getWidth(), this.mBitmap.getHeight());
    }

    public final void remove() {
        if (getParent() != null) {
            this.mDragLayer.removeView(this);
        }
    }

    public final void setAlpha(float f) {
        super.setAlpha(f);
        this.mPaint.setAlpha((int) (f * 255.0f));
        invalidate();
    }

    public final void setColor(int i) {
        if (this.mPaint == null) {
            this.mPaint = new Paint(2);
        }
        if (i != 0) {
            ColorMatrix colorMatrix = new ColorMatrix();
            colorMatrix.setSaturation(0.0f);
            ColorMatrix colorMatrix2 = new ColorMatrix();
            setColorScale(i, colorMatrix2);
            colorMatrix.postConcat(colorMatrix2);
            if (Utilities.ATLEAST_LOLLIPOP) {
                animateFilterTo(colorMatrix.getArray());
                return;
            }
            this.mPaint.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
            invalidate();
        } else if (!Utilities.ATLEAST_LOLLIPOP || this.mCurrentFilter == null) {
            this.mPaint.setColorFilter((ColorFilter) null);
            invalidate();
        } else {
            animateFilterTo(new ColorMatrix().getArray());
        }
    }

    public final void show(int i, int i2) {
        this.mDragLayer.addView(this);
        DragLayer.LayoutParams layoutParams = new DragLayer.LayoutParams(0, 0);
        layoutParams.width = this.mBitmap.getWidth();
        layoutParams.height = this.mBitmap.getHeight();
        layoutParams.customPosition = true;
        setLayoutParams(layoutParams);
        move(i, i2);
        post(new Runnable() {
            public final void run() {
                DragView.this.mAnim.start();
            }
        });
    }
}
