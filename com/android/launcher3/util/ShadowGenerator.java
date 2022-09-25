package com.android.launcher3.util;

import android.graphics.Bitmap;
import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.Paint;
import com.android.launcher3.LauncherAppState;
import org.chromium.net.PrivateKeyType;

/* compiled from: PG */
public final class ShadowGenerator {
    private static final Object LOCK = new Object();
    private static ShadowGenerator sShadowGenerator;
    private final Paint mBlurPaint;
    private final Canvas mCanvas = new Canvas();
    private final Paint mDrawPaint;
    private final int mIconSize;

    private ShadowGenerator() {
        int i = LauncherAppState.getInstance().mInvariantDeviceProfile.iconBitmapSize;
        this.mIconSize = i;
        Paint paint = new Paint(3);
        this.mBlurPaint = paint;
        paint.setMaskFilter(new BlurMaskFilter(((float) i) * 0.010416667f, BlurMaskFilter.Blur.NORMAL));
        this.mDrawPaint = new Paint(3);
    }

    public static ShadowGenerator getInstance() {
        synchronized (LOCK) {
            if (sShadowGenerator == null) {
                sShadowGenerator = new ShadowGenerator();
            }
        }
        return sShadowGenerator;
    }

    public final synchronized Bitmap recreateIcon(Bitmap bitmap) {
        Bitmap createBitmap;
        int[] iArr = new int[2];
        Bitmap extractAlpha = bitmap.extractAlpha(this.mBlurPaint, iArr);
        int i = this.mIconSize;
        createBitmap = Bitmap.createBitmap(i, i, Bitmap.Config.ARGB_8888);
        this.mCanvas.setBitmap(createBitmap);
        this.mDrawPaint.setAlpha(30);
        this.mCanvas.drawBitmap(extractAlpha, (float) iArr[0], (float) iArr[1], this.mDrawPaint);
        this.mDrawPaint.setAlpha(61);
        this.mCanvas.drawBitmap(extractAlpha, (float) iArr[0], ((float) iArr[1]) + (((float) this.mIconSize) * 0.020833334f), this.mDrawPaint);
        this.mDrawPaint.setAlpha(PrivateKeyType.INVALID);
        this.mCanvas.drawBitmap(bitmap, 0.0f, 0.0f, this.mDrawPaint);
        this.mCanvas.setBitmap((Bitmap) null);
        return createBitmap;
    }
}
