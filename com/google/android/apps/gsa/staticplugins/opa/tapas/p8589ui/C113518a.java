package com.google.android.apps.gsa.staticplugins.opa.tapas.p8589ui;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import org.chromium.net.PrivateKeyType;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.ui.a */
/* compiled from: PG */
public final class C113518a extends Drawable {

    /* renamed from: a */
    public static final Bitmap.Config f314289a = Bitmap.Config.ARGB_8888;

    /* renamed from: b */
    public Bitmap f314290b;

    /* renamed from: c */
    private final Paint f314291c = new Paint();

    /* renamed from: d */
    private int f314292d = PrivateKeyType.INVALID;

    /* renamed from: e */
    private final RectF f314293e = new RectF();

    /* renamed from: f */
    private final Matrix f314294f = new Matrix();

    public final void draw(Canvas canvas) {
        float f;
        Rect bounds = getBounds();
        if (!bounds.isEmpty()) {
            this.f314293e.set(new RectF((float) bounds.left, (float) bounds.top, (float) bounds.right, (float) bounds.bottom));
            if (this.f314290b != null) {
                float min = ((float) Math.min(bounds.width(), bounds.height())) / 2.0f;
                this.f314291c.setFilterBitmap(true);
                this.f314291c.setAntiAlias(true);
                Bitmap bitmap = this.f314290b;
                bitmap.getClass();
                BitmapShader bitmapShader = new BitmapShader(bitmap, Shader.TileMode.CLAMP, Shader.TileMode.CLAMP);
                Bitmap bitmap2 = this.f314290b;
                bitmap2.getClass();
                int width = bitmap2.getWidth();
                Bitmap bitmap3 = this.f314290b;
                bitmap3.getClass();
                int height = bitmap3.getHeight();
                this.f314294f.set((Matrix) null);
                if (bounds.height() * width > bounds.width() * height) {
                    f = ((float) bounds.height()) / ((float) height);
                } else {
                    f = ((float) bounds.width()) / ((float) width);
                }
                this.f314294f.setScale(f, f);
                bitmapShader.setLocalMatrix(this.f314294f);
                this.f314291c.setShader(bitmapShader);
                canvas.drawCircle(bounds.exactCenterX(), bounds.exactCenterY(), min, this.f314291c);
            }
        }
    }

    public final int getOpacity() {
        return -3;
    }

    public final void setAlpha(int i) {
        int i2 = this.f314292d;
        this.f314292d = i;
        if (i2 != i) {
            invalidateSelf();
        }
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        this.f314291c.setColorFilter(colorFilter);
        invalidateSelf();
    }
}
