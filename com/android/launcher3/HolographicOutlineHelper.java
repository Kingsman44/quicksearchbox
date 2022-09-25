package com.android.launcher3;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.SparseArray;
import com.google.android.googlequicksearchbox.R;

/* compiled from: PG */
public final class HolographicOutlineHelper {
    private static HolographicOutlineHelper sInstance;
    private final SparseArray mBitmapCache;
    private final Paint mBlurPaint;
    private final Canvas mCanvas = new Canvas();
    private final Paint mDrawPaint;
    private final Paint mErasePaint;
    private final BlurMaskFilter mMediumInnerBlurMaskFilter;
    private final BlurMaskFilter mMediumOuterBlurMaskFilter;
    private final BlurMaskFilter mShadowBlurMaskFilter;
    private final BlurMaskFilter mThinOuterBlurMaskFilter;

    private HolographicOutlineHelper(Context context) {
        Paint paint = new Paint();
        this.mDrawPaint = paint;
        Paint paint2 = new Paint();
        this.mBlurPaint = paint2;
        Paint paint3 = new Paint();
        this.mErasePaint = paint3;
        this.mBitmapCache = new SparseArray(4);
        Resources resources = context.getResources();
        float dimension = resources.getDimension(R.dimen.blur_size_medium_outline);
        this.mMediumOuterBlurMaskFilter = new BlurMaskFilter(dimension, BlurMaskFilter.Blur.OUTER);
        this.mMediumInnerBlurMaskFilter = new BlurMaskFilter(dimension, BlurMaskFilter.Blur.NORMAL);
        this.mThinOuterBlurMaskFilter = new BlurMaskFilter(resources.getDimension(R.dimen.blur_size_thin_outline), BlurMaskFilter.Blur.OUTER);
        this.mShadowBlurMaskFilter = new BlurMaskFilter(resources.getDimension(R.dimen.blur_size_click_shadow), BlurMaskFilter.Blur.NORMAL);
        paint.setFilterBitmap(true);
        paint.setAntiAlias(true);
        paint2.setFilterBitmap(true);
        paint2.setAntiAlias(true);
        paint3.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        paint3.setFilterBitmap(true);
        paint3.setAntiAlias(true);
    }

    public static HolographicOutlineHelper obtain(Context context) {
        if (sInstance == null) {
            sInstance = new HolographicOutlineHelper(context);
        }
        return sInstance;
    }

    public final void applyExpensiveOutlineWithBlur(Bitmap bitmap, Canvas canvas, int i, int i2, boolean z) {
        Canvas canvas2 = canvas;
        if (z) {
            int width = bitmap.getWidth() * bitmap.getHeight();
            int[] iArr = new int[width];
            bitmap.getPixels(iArr, 0, bitmap.getWidth(), 0, 0, bitmap.getWidth(), bitmap.getHeight());
            for (int i3 = 0; i3 < width; i3++) {
                if ((iArr[i3] >>> 24) < 188) {
                    iArr[i3] = 0;
                }
            }
            bitmap.setPixels(iArr, 0, bitmap.getWidth(), 0, 0, bitmap.getWidth(), bitmap.getHeight());
        }
        Bitmap extractAlpha = bitmap.extractAlpha();
        this.mBlurPaint.setMaskFilter(this.mMediumOuterBlurMaskFilter);
        int[] iArr2 = new int[2];
        Bitmap extractAlpha2 = extractAlpha.extractAlpha(this.mBlurPaint, iArr2);
        this.mBlurPaint.setMaskFilter(this.mThinOuterBlurMaskFilter);
        int[] iArr3 = new int[2];
        Bitmap extractAlpha3 = extractAlpha.extractAlpha(this.mBlurPaint, iArr3);
        canvas2.setBitmap(extractAlpha);
        canvas2.drawColor(-16777216, PorterDuff.Mode.SRC_OUT);
        this.mBlurPaint.setMaskFilter(this.mMediumInnerBlurMaskFilter);
        int[] iArr4 = new int[2];
        Bitmap extractAlpha4 = extractAlpha.extractAlpha(this.mBlurPaint, iArr4);
        canvas2.setBitmap(extractAlpha4);
        canvas2.drawBitmap(extractAlpha, (float) (-iArr4[0]), (float) (-iArr4[1]), this.mErasePaint);
        canvas.drawRect(0.0f, 0.0f, (float) (-iArr4[0]), (float) extractAlpha4.getHeight(), this.mErasePaint);
        canvas.drawRect(0.0f, 0.0f, (float) extractAlpha4.getWidth(), (float) (-iArr4[1]), this.mErasePaint);
        canvas2.setBitmap(bitmap);
        canvas2.drawColor(0, PorterDuff.Mode.CLEAR);
        this.mDrawPaint.setColor(i);
        canvas2.drawBitmap(extractAlpha4, (float) iArr4[0], (float) iArr4[1], this.mDrawPaint);
        canvas2.drawBitmap(extractAlpha2, (float) iArr2[0], (float) iArr2[1], this.mDrawPaint);
        this.mDrawPaint.setColor(i2);
        canvas2.drawBitmap(extractAlpha3, (float) iArr3[0], (float) iArr3[1], this.mDrawPaint);
        canvas2.setBitmap((Bitmap) null);
        extractAlpha3.recycle();
        extractAlpha2.recycle();
        extractAlpha4.recycle();
        extractAlpha.recycle();
    }

    /* access modifiers changed from: package-private */
    public final Bitmap createMediumDropShadow(BubbleTextView bubbleTextView) {
        Drawable drawable = bubbleTextView.mIcon;
        if (drawable == null) {
            return null;
        }
        Rect bounds = drawable.getBounds();
        int width = (int) (((float) bounds.width()) * bubbleTextView.getScaleX());
        int height = (int) (((float) bounds.height()) * bubbleTextView.getScaleY());
        if (height <= 0 || width <= 0) {
            return null;
        }
        int i = (width << 16) | height;
        Bitmap bitmap = (Bitmap) this.mBitmapCache.get(i);
        if (bitmap == null) {
            bitmap = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
            this.mCanvas.setBitmap(bitmap);
            this.mBitmapCache.put(i, bitmap);
        } else {
            this.mCanvas.setBitmap(bitmap);
            this.mCanvas.drawColor(0, PorterDuff.Mode.CLEAR);
        }
        this.mCanvas.save();
        this.mCanvas.scale(bubbleTextView.getScaleX(), bubbleTextView.getScaleY());
        this.mCanvas.translate((float) (-bounds.left), (float) (-bounds.top));
        drawable.draw(this.mCanvas);
        this.mCanvas.restore();
        this.mCanvas.setBitmap((Bitmap) null);
        this.mBlurPaint.setMaskFilter(this.mShadowBlurMaskFilter);
        return bitmap.extractAlpha(this.mBlurPaint, (int[]) null);
    }
}
