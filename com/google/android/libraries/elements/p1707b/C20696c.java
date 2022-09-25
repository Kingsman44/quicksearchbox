package com.google.android.libraries.elements.p1707b;

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
import android.widget.ImageView;
import com.google.android.libraries.elements.interfaces.C21259bb;

/* renamed from: com.google.android.libraries.elements.b.c */
/* compiled from: PG */
public class C20696c extends Drawable {

    /* renamed from: a */
    protected final Matrix f57984a = new Matrix();

    /* renamed from: b */
    protected final Paint f57985b = new Paint(3);

    /* renamed from: c */
    public final RectF f57986c = new RectF();

    /* renamed from: d */
    protected final ImageView.ScaleType f57987d;

    /* renamed from: e */
    protected final Bitmap f57988e;

    /* renamed from: f */
    public boolean f57989f;

    /* renamed from: g */
    public final C21259bb f57990g;

    /* renamed from: h */
    private final RectF f57991h;

    /* renamed from: i */
    private boolean f57992i;

    public C20696c(Bitmap bitmap, ImageView.ScaleType scaleType, C21259bb bbVar) {
        RectF rectF = new RectF();
        this.f57991h = rectF;
        this.f57989f = false;
        this.f57992i = false;
        this.f57988e = bitmap;
        rectF.set(0.0f, 0.0f, (float) bitmap.getWidth(), (float) bitmap.getHeight());
        this.f57987d = scaleType;
        this.f57990g = bbVar;
    }

    /* renamed from: b */
    private final boolean mo25962b() {
        boolean z = this.f57989f && getLayoutDirection() == 1;
        if (this.f57992i == z) {
            return false;
        }
        this.f57992i = z;
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo25783a(Rect rect) {
        float f;
        float f2;
        float f3;
        float width = (float) this.f57988e.getWidth();
        float height = (float) this.f57988e.getHeight();
        float width2 = (float) rect.width();
        float height2 = (float) rect.height();
        this.f57984a.reset();
        if (width > 0.0f && height > 0.0f && width2 > 0.0f && height2 > 0.0f) {
            ImageView.ScaleType scaleType = this.f57987d;
            if (scaleType == ImageView.ScaleType.CENTER_INSIDE) {
                scaleType = (width > width2 || height > height2) ? ImageView.ScaleType.FIT_CENTER : ImageView.ScaleType.CENTER;
            }
            int i = C20695b.f57983a[scaleType.ordinal()];
            if (i == 1) {
                float centerX = ((float) rect.centerX()) - this.f57991h.centerX();
                float centerY = ((float) rect.centerY()) - this.f57991h.centerY();
                this.f57984a.setTranslate(centerX, centerY);
                this.f57986c.set(this.f57991h);
                this.f57986c.offset(centerX, centerY);
                this.f57986c.intersect((float) rect.left, (float) rect.top, (float) rect.right, (float) rect.bottom);
            } else if (i == 2) {
                if (width * height2 > width2 * height) {
                    f = height2 / height;
                    f3 = ((float) rect.left) + ((width2 - (width * f)) * 0.5f);
                    f2 = (float) rect.top;
                } else {
                    float f4 = width2 / width;
                    float f5 = ((float) rect.top) + ((height2 - (height * f4)) * 0.5f);
                    f = f4;
                    f2 = f5;
                    f3 = (float) rect.left;
                }
                this.f57984a.setScale(f, f);
                this.f57984a.postTranslate((float) Math.round(f3), (float) Math.round(f2));
                this.f57986c.set(rect);
            } else if (i != 3) {
                this.f57986c.set(rect);
                this.f57984a.setRectToRect(this.f57991h, this.f57986c, Matrix.ScaleToFit.FILL);
            } else {
                this.f57986c.set(rect);
                this.f57984a.setRectToRect(this.f57991h, this.f57986c, Matrix.ScaleToFit.CENTER);
                this.f57984a.mapRect(this.f57986c, this.f57991h);
            }
            if (this.f57992i) {
                this.f57984a.preTranslate(width, 0.0f);
                this.f57984a.preScale(-1.0f, 1.0f);
            }
        }
    }

    public void draw(Canvas canvas) {
        BitmapShader bitmapShader = new BitmapShader(this.f57988e, Shader.TileMode.CLAMP, Shader.TileMode.CLAMP);
        bitmapShader.setLocalMatrix(this.f57984a);
        this.f57985b.setShader(bitmapShader);
        canvas.drawRect(this.f57986c, this.f57985b);
    }

    public final int getAlpha() {
        return this.f57985b.getAlpha();
    }

    public int getOpacity() {
        if (this.f57985b.getAlpha() == 255) {
            return -1;
        }
        return this.f57985b.getAlpha() == 0 ? -2 : -3;
    }

    public final boolean isAutoMirrored() {
        return this.f57989f;
    }

    /* access modifiers changed from: protected */
    public final void onBoundsChange(Rect rect) {
        mo25962b();
        mo25783a(rect);
        invalidateSelf();
    }

    public final boolean onLayoutDirectionChanged(int i) {
        if (!mo25962b()) {
            return false;
        }
        mo25783a(getBounds());
        invalidateSelf();
        return true;
    }

    public final void setAlpha(int i) {
        this.f57985b.setAlpha(i);
        invalidateSelf();
    }

    public final void setAutoMirrored(boolean z) {
        if (this.f57989f != z) {
            this.f57989f = z;
            if (mo25962b()) {
                mo25783a(getBounds());
                invalidateSelf();
            }
        }
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        this.f57985b.setColorFilter(colorFilter);
        invalidateSelf();
    }
}
