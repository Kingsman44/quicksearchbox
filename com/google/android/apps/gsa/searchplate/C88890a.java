package com.google.android.apps.gsa.searchplate;

import android.animation.ArgbEvaluator;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import org.chromium.net.PrivateKeyType;

/* renamed from: com.google.android.apps.gsa.searchplate.a */
/* compiled from: PG */
public final class C88890a extends Drawable {

    /* renamed from: a */
    public int f240789a;

    /* renamed from: b */
    public int f240790b;

    /* renamed from: c */
    final ArgbEvaluator f240791c;

    /* renamed from: d */
    public boolean f240792d;

    /* renamed from: e */
    private final Paint f240793e = new Paint();

    /* renamed from: f */
    private final Paint f240794f;

    /* renamed from: g */
    private final int f240795g;

    /* renamed from: h */
    private final int f240796h;

    /* renamed from: i */
    private final int f240797i;

    /* renamed from: j */
    private int f240798j;

    /* renamed from: k */
    private boolean f240799k;

    public C88890a(int i, int i2, int i3, int i4) {
        Paint paint = new Paint();
        this.f240794f = paint;
        this.f240791c = new ArgbEvaluator();
        this.f240789a = i;
        this.f240795g = -16777216 | i2;
        this.f240796h = Color.alpha(i3);
        paint.setColor(i3);
        this.f240797i = i4;
        this.f240799k = true;
        mo82736a();
    }

    /* renamed from: a */
    public final void mo82736a() {
        int i;
        float f = ((float) this.f240798j) / 255.0f;
        if (this.f240799k) {
            i = ((Integer) this.f240791c.evaluate(f, Integer.valueOf(this.f240789a), Integer.valueOf(this.f240795g))).intValue();
        } else {
            i = this.f240795g;
        }
        int i2 = this.f240790b;
        int alpha = Color.alpha(i);
        this.f240793e.setColor(i);
        this.f240793e.setAlpha((i2 * alpha) / PrivateKeyType.INVALID);
        this.f240794f.setAlpha(((this.f240796h * this.f240798j) * this.f240790b) / 65025);
    }

    /* renamed from: b */
    public final void mo82737b(boolean z) {
        this.f240799k = z;
        mo82736a();
        invalidateSelf();
    }

    /* renamed from: c */
    public final void mo82738c(int i) {
        this.f240798j = i;
        mo82736a();
        invalidateSelf();
    }

    public final void draw(Canvas canvas) {
        canvas.drawPaint(this.f240793e);
        if (this.f240796h > 0 && !this.f240792d) {
            canvas.drawRect(0.0f, 0.0f, (float) canvas.getWidth(), (float) this.f240797i, this.f240794f);
        }
    }

    public final int getAlpha() {
        return this.f240790b;
    }

    public final int getOpacity() {
        return (this.f240798j < 255 || this.f240790b < 255) ? -3 : -1;
    }

    public final void setAlpha(int i) {
        this.f240790b = i;
        mo82736a();
        invalidateSelf();
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        this.f240793e.setColorFilter(colorFilter);
    }
}
