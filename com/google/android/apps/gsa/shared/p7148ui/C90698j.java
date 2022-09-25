package com.google.android.apps.gsa.shared.p7148ui;

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

/* renamed from: com.google.android.apps.gsa.shared.ui.j */
/* compiled from: PG */
public final class C90698j extends Drawable {

    /* renamed from: a */
    private final Paint f253703a;

    /* renamed from: b */
    private final BitmapShader f253704b;

    /* renamed from: c */
    private final RectF f253705c;

    /* renamed from: d */
    private float f253706d;

    /* renamed from: e */
    private float f253707e;

    /* renamed from: f */
    private float f253708f;

    /* renamed from: g */
    private int f253709g;

    /* renamed from: h */
    private boolean f253710h;

    public C90698j(Bitmap bitmap) {
        this(bitmap, 2.14748365E9f, true);
    }

    public final void draw(Canvas canvas) {
        canvas.drawCircle(this.f253706d, this.f253707e, this.f253708f, this.f253703a);
    }

    public final int getIntrinsicHeight() {
        if (this.f253710h) {
            return this.f253709g;
        }
        return -1;
    }

    public final int getIntrinsicWidth() {
        if (this.f253710h) {
            return this.f253709g;
        }
        return -1;
    }

    public final int getOpacity() {
        return -2;
    }

    /* access modifiers changed from: protected */
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.f253706d = (float) rect.centerX();
        float centerY = (float) rect.centerY();
        this.f253707e = centerY;
        this.f253708f = Math.min(this.f253708f, Math.min(this.f253706d, centerY));
        Matrix matrix = new Matrix();
        float f = this.f253706d;
        float f2 = this.f253708f;
        float f3 = this.f253707e;
        matrix.setRectToRect(this.f253705c, new RectF(f - f2, f3 - f2, f + f2, f3 + f2), Matrix.ScaleToFit.FILL);
        this.f253704b.setLocalMatrix(matrix);
        this.f253703a.setShader(this.f253704b);
    }

    public final void setAlpha(int i) {
        this.f253703a.setAlpha(i);
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        this.f253703a.setColorFilter(colorFilter);
    }

    public C90698j(Bitmap bitmap, float f, boolean z) {
        this.f253710h = true;
        BitmapShader bitmapShader = new BitmapShader(bitmap, Shader.TileMode.CLAMP, Shader.TileMode.CLAMP);
        this.f253704b = bitmapShader;
        this.f253705c = new RectF(0.0f, 0.0f, (float) bitmap.getWidth(), (float) bitmap.getHeight());
        this.f253708f = f;
        this.f253710h = z;
        this.f253709g = Math.min(bitmap.getScaledWidth(bitmap.getDensity()), bitmap.getScaledHeight(bitmap.getDensity()));
        Paint paint = new Paint();
        this.f253703a = paint;
        paint.setAntiAlias(true);
        paint.setShader(bitmapShader);
    }
}
