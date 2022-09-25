package com.google.android.apps.gsa.searchplate.recognizer;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;

/* compiled from: PG */
public class CircleShadowDrawable extends Drawable {

    /* renamed from: a */
    private final Paint f240995a;

    /* renamed from: b */
    private float f240996b;

    /* renamed from: c */
    private float f240997c;

    /* renamed from: d */
    private int f240998d;

    /* renamed from: e */
    private int f240999e;

    /* renamed from: f */
    private float f241000f;

    public CircleShadowDrawable(float f) {
        this(f, -16777216);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo82848a() {
        float f = this.f240996b;
        if (f != 0.0f) {
            int i = this.f240999e;
            int i2 = this.f240998d;
            float f2 = this.f241000f;
            float f3 = f + f2;
            this.f240997c = f3;
            float max = Math.max(0.0f, (f - f2) / f3);
            float f4 = this.f240996b;
            float f5 = this.f240997c;
            int i3 = this.f240998d;
            this.f240995a.setShader(new RadialGradient(0.0f, 0.0f, f5, new int[]{i3, (((int) (((float) i) * 0.6f)) << 24) | (i2 & 16777215), i3 & 16777215}, new float[]{max, f4 / f5, 1.0f}, Shader.TileMode.CLAMP));
        }
    }

    public void draw(Canvas canvas) {
        if (this.f240996b != 0.0f) {
            Rect bounds = getBounds();
            int centerX = bounds.centerX();
            int centerY = bounds.centerY();
            float f = this.f241000f;
            canvas.save();
            canvas.translate((float) centerX, ((float) centerY) + (f * 0.6f));
            canvas.drawCircle(0.0f, 0.0f, this.f240997c, this.f240995a);
            canvas.restore();
        }
    }

    public int getAlpha() {
        return this.f240999e;
    }

    public int getOpacity() {
        return -2;
    }

    /* access modifiers changed from: protected */
    public final void onBoundsChange(Rect rect) {
        invalidateSelf();
    }

    public void setAlpha(int i) {
        if (this.f240999e != i) {
            this.f240999e = i;
            this.f240998d = Color.argb(i, Color.red(this.f240998d), Color.green(this.f240998d), Color.blue(this.f240998d));
            mo82848a();
            invalidateSelf();
        }
    }

    public void setBaseRadius(float f) {
        if (this.f240996b != f) {
            this.f240996b = f;
            mo82848a();
            invalidateSelf();
        }
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.f240995a.setColorFilter(colorFilter);
    }

    public void setZ(float f) {
        if (this.f241000f != f) {
            this.f241000f = f;
            mo82848a();
            invalidateSelf();
        }
    }

    public CircleShadowDrawable(float f, int i) {
        Paint paint = new Paint();
        this.f240995a = paint;
        paint.setDither(true);
        this.f240998d = i;
        this.f240999e = Color.alpha(i);
        this.f240996b = f;
        this.f241000f = 0.0f;
        mo82848a();
    }
}
