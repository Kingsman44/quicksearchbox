package com.google.android.p10906l.p10907a;

import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;

/* renamed from: com.google.android.l.a.g */
/* compiled from: PG */
public final class C146616g extends Drawable {

    /* renamed from: l */
    static C146613d f395988l;

    /* renamed from: a */
    final int f395989a;

    /* renamed from: b */
    public final Paint f395990b;

    /* renamed from: c */
    final Paint f395991c;

    /* renamed from: d */
    final Paint f395992d;

    /* renamed from: e */
    final RectF f395993e;

    /* renamed from: f */
    public float f395994f;

    /* renamed from: g */
    Path f395995g;

    /* renamed from: h */
    public float f395996h;

    /* renamed from: i */
    float f395997i;

    /* renamed from: j */
    public float f395998j;

    /* renamed from: k */
    public boolean f395999k = true;

    /* renamed from: m */
    private final int f396000m = C146615f.f395986b;

    /* renamed from: n */
    private final int f396001n = C146615f.f395987c;

    /* renamed from: o */
    private boolean f396002o = false;

    static {
        Math.cos(Math.toRadians(45.0d));
    }

    public C146616g(Resources resources, int i, float f, float f2, float f3) {
        this.f395989a = (int) C146615f.m238856a(0.0f, resources);
        Paint paint = new Paint(5);
        this.f395990b = paint;
        paint.setColor(i);
        Paint paint2 = new Paint(5);
        this.f395991c = paint2;
        paint2.setStyle(Paint.Style.FILL);
        this.f395994f = (float) ((int) (f + 0.5f));
        this.f395993e = new RectF();
        Paint paint3 = new Paint(paint2);
        this.f395992d = paint3;
        paint3.setAntiAlias(false);
        mo123414c(f2, f3);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final float mo123412a() {
        float f = this.f395996h;
        float max = Math.max(f, this.f395994f + ((float) this.f395989a) + ((f * 1.5f) / 2.0f));
        float f2 = (this.f395996h * 1.5f) + ((float) this.f395989a);
        return max + max + f2 + f2;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final float mo123413b() {
        float f = this.f395996h;
        float max = Math.max(f, this.f395994f + ((float) this.f395989a) + (f / 2.0f));
        float f2 = this.f395996h + ((float) this.f395989a);
        return max + max + f2 + f2;
    }

    public final void draw(Canvas canvas) {
        int i;
        Canvas canvas2 = canvas;
        if (this.f395994f + this.f395997i != 0.0f) {
            if (this.f395999k) {
                this.f395993e.set(getBounds());
                float f = this.f395994f;
                float f2 = -f;
                RectF rectF = new RectF(f2, f2, f, f);
                RectF rectF2 = new RectF(rectF);
                float f3 = -this.f395997i;
                rectF2.inset(f3, f3);
                Path path = this.f395995g;
                if (path == null) {
                    this.f395995g = new Path();
                } else {
                    path.reset();
                }
                this.f395995g.setFillType(Path.FillType.EVEN_ODD);
                this.f395995g.moveTo(-this.f395994f, 0.0f);
                this.f395995g.rLineTo(-this.f395997i, 0.0f);
                this.f395995g.arcTo(rectF2, 180.0f, 90.0f, false);
                this.f395995g.arcTo(rectF, 270.0f, -90.0f, false);
                this.f395995g.close();
                float f4 = this.f395994f;
                float f5 = f4 + this.f395997i;
                Paint paint = this.f395991c;
                int i2 = this.f396000m;
                paint.setShader(new RadialGradient(0.0f, 0.0f, f5, new int[]{i2, i2, this.f396001n}, new float[]{0.0f, f4 / f5, 1.0f}, Shader.TileMode.CLAMP));
                Paint paint2 = this.f395992d;
                float f6 = -this.f395994f;
                float f7 = this.f395997i;
                int i3 = this.f396000m;
                paint2.setShader(new LinearGradient(0.0f, f6 + f7, 0.0f, f6 - f7, new int[]{i3, i3, this.f396001n}, new float[]{0.0f, 0.5f, 1.0f}, Shader.TileMode.CLAMP));
                this.f395992d.setAntiAlias(false);
                this.f395999k = false;
            }
            canvas2.translate(0.0f, this.f395998j / 2.0f);
            float f8 = this.f395994f;
            float f9 = (-f8) - this.f395997i;
            float f10 = f8 + ((float) this.f395989a) + (this.f395998j / 2.0f);
            float f11 = f10 + f10;
            boolean z = this.f395993e.width() - f11 > 0.0f;
            boolean z2 = this.f395993e.height() - f11 > 0.0f;
            int save = canvas.save();
            canvas2.translate(this.f395993e.left + f10, this.f395993e.top + f10);
            canvas2.drawPath(this.f395995g, this.f395991c);
            if (z) {
                i = save;
                canvas.drawRect(0.0f, f9, this.f395993e.width() - f11, -this.f395994f, this.f395992d);
            } else {
                i = save;
            }
            canvas2.restoreToCount(i);
            int save2 = canvas.save();
            canvas2.translate(this.f395993e.right - f10, this.f395993e.bottom - f10);
            canvas2.rotate(180.0f);
            canvas2.drawPath(this.f395995g, this.f395991c);
            if (z) {
                canvas.drawRect(0.0f, f9, this.f395993e.width() - f11, (-this.f395994f) + this.f395997i, this.f395992d);
            }
            canvas2.restoreToCount(save2);
            int save3 = canvas.save();
            canvas2.translate(this.f395993e.left + f10, this.f395993e.bottom - f10);
            canvas2.rotate(270.0f);
            canvas2.drawPath(this.f395995g, this.f395991c);
            if (z2) {
                canvas.drawRect(0.0f, f9, this.f395993e.height() - f11, -this.f395994f, this.f395992d);
            }
            canvas2.restoreToCount(save3);
            int save4 = canvas.save();
            canvas2.translate(this.f395993e.right - f10, this.f395993e.top + f10);
            canvas2.rotate(90.0f);
            canvas2.drawPath(this.f395995g, this.f395991c);
            if (z2) {
                canvas.drawRect(0.0f, f9, this.f395993e.height() - f11, -this.f395994f, this.f395992d);
            }
            canvas2.restoreToCount(save4);
            canvas2.translate(0.0f, (-this.f395998j) / 2.0f);
            RectF rectF3 = this.f395993e;
            float f12 = this.f395994f;
            canvas2.drawRoundRect(rectF3, f12, f12, this.f395990b);
        }
    }

    public final int getOpacity() {
        return -3;
    }

    /* access modifiers changed from: protected */
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.f395999k = true;
    }

    public final void setAlpha(int i) {
        this.f395990b.setAlpha(i);
        this.f395991c.setAlpha(i);
        this.f395992d.setAlpha(i);
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        this.f395990b.setColorFilter(colorFilter);
        this.f395991c.setColorFilter(colorFilter);
        this.f395992d.setColorFilter(colorFilter);
    }

    /* renamed from: c */
    public final void mo123414c(float f, float f2) {
        if (f < 0.0f) {
            throw new IllegalArgumentException("Invalid shadow size " + f + ". Must be >= 0");
        } else if (f2 >= 0.0f) {
            if (f > f2) {
                if (!this.f396002o) {
                    this.f396002o = true;
                }
                f = f2;
            }
            if (this.f395998j != f || this.f395996h != f2) {
                this.f395998j = f;
                this.f395996h = f2;
                this.f395997i = (float) ((int) (f * 1.5f));
                this.f395999k = true;
                invalidateSelf();
            }
        } else {
            throw new IllegalArgumentException("Invalid max shadow size " + f2 + ". Must be >= 0");
        }
    }
}
