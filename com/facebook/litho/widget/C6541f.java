package com.facebook.litho.widget;

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

/* renamed from: com.facebook.litho.widget.f */
/* compiled from: PG */
public final class C6541f extends Drawable {

    /* renamed from: a */
    public int f19474a;

    /* renamed from: b */
    public int f19475b;

    /* renamed from: c */
    public float f19476c;

    /* renamed from: d */
    public float f19477d;

    /* renamed from: e */
    public float f19478e = -1.0f;

    /* renamed from: f */
    public float f19479f = -1.0f;

    /* renamed from: g */
    public boolean f19480g = true;

    /* renamed from: h */
    private final Paint f19481h;

    /* renamed from: i */
    private final Path f19482i = new Path();

    /* renamed from: j */
    private final Path f19483j = new Path();

    /* renamed from: k */
    private final Path f19484k = new Path();

    /* renamed from: l */
    private final Path f19485l = new Path();

    /* renamed from: m */
    private final Paint f19486m;

    public C6541f() {
        Paint paint = new Paint(5);
        this.f19486m = paint;
        paint.setStyle(Paint.Style.FILL);
        Paint paint2 = new Paint(paint);
        this.f19481h = paint2;
        paint2.setAntiAlias(false);
    }

    /* renamed from: a */
    public static int m17804a(float f, float f2) {
        return (int) Math.ceil((double) (((float) m17808e(f)) + f2));
    }

    /* renamed from: b */
    public static int m17805b(float f, float f2) {
        return (int) Math.ceil((double) (((float) m17808e(f)) - f2));
    }

    /* renamed from: c */
    public static int m17806c(float f, float f2) {
        return (int) Math.ceil((double) (((float) m17808e(f)) + f2));
    }

    /* renamed from: d */
    public static int m17807d(float f, float f2) {
        return (int) Math.ceil((double) (((float) m17808e(f)) - f2));
    }

    /* renamed from: e */
    public static int m17808e(float f) {
        int i = (int) (f + 0.5f);
        return i % 2 == 1 ? i - 1 : i;
    }

    /* renamed from: f */
    private static float m17809f(float f) {
        return ((float) m17808e(f)) * 0.5f;
    }

    /* renamed from: g */
    private static void m17810g(Path path, int i, int i2, float f) {
        float f2 = (float) i;
        float f3 = (float) i2;
        float f4 = f + f;
        RectF rectF = new RectF(f2, f3, f2 + f4, f3 + f4);
        RectF rectF2 = new RectF(0.0f, 0.0f, f4, f4);
        path.reset();
        path.setFillType(Path.FillType.EVEN_ODD);
        float f5 = f2 + f;
        path.moveTo(f5, f3);
        path.arcTo(rectF, 270.0f, -90.0f, true);
        path.rLineTo((float) (-i), 0.0f);
        path.lineTo(0.0f, f);
        path.arcTo(rectF2, 180.0f, 90.0f, true);
        path.lineTo(f5, 0.0f);
        path.rLineTo(0.0f, f3);
        path.close();
    }

    public final void draw(Canvas canvas) {
        Canvas canvas2 = canvas;
        float f = 0.0f;
        if (this.f19480g) {
            float f2 = this.f19477d + this.f19476c;
            Paint paint = this.f19486m;
            int i = this.f19474a;
            float f3 = f2;
            float f4 = f2;
            float f5 = f2;
            paint.setShader(new RadialGradient(f3, f4, f5, new int[]{i, i, this.f19475b}, new float[]{0.0f, 0.2f, 1.0f}, Shader.TileMode.CLAMP));
            float f6 = this.f19478e;
            if (f6 == -1.0f) {
                f6 = 0.0f;
            }
            float f7 = this.f19479f;
            if (f7 == -1.0f) {
                f7 = m17809f(this.f19477d);
            }
            int b = m17805b(this.f19477d, f6);
            int c = m17806c(this.f19477d, f6);
            int d = m17807d(this.f19477d, f7);
            int a = m17804a(this.f19477d, f7);
            m17810g(this.f19482i, b, d, this.f19476c);
            m17810g(this.f19484k, c, d, this.f19476c);
            m17810g(this.f19483j, b, a, this.f19476c);
            m17810g(this.f19485l, c, a, this.f19476c);
            Paint paint2 = this.f19481h;
            int i2 = this.f19474a;
            float f8 = f2;
            paint2.setShader(new LinearGradient(0.0f, f8, 0.0f, 0.0f, new int[]{i2, i2, this.f19475b}, new float[]{0.0f, 0.2f, 1.0f}, Shader.TileMode.CLAMP));
            this.f19481h.setAntiAlias(false);
            this.f19480g = false;
        }
        Rect bounds = getBounds();
        int save = canvas.save();
        canvas2.translate((float) bounds.left, (float) bounds.top);
        canvas2.drawPath(this.f19482i, this.f19486m);
        canvas2.restoreToCount(save);
        int save2 = canvas.save();
        canvas2.translate((float) bounds.right, (float) bounds.top);
        canvas2.scale(-1.0f, 1.0f);
        canvas2.drawPath(this.f19484k, this.f19486m);
        canvas2.restoreToCount(save2);
        int save3 = canvas.save();
        canvas2.translate((float) bounds.right, (float) bounds.bottom);
        canvas2.scale(-1.0f, -1.0f);
        canvas2.drawPath(this.f19485l, this.f19486m);
        canvas2.restoreToCount(save3);
        int save4 = canvas.save();
        canvas2.translate((float) bounds.left, (float) bounds.bottom);
        canvas2.scale(1.0f, -1.0f);
        canvas2.drawPath(this.f19483j, this.f19486m);
        canvas2.restoreToCount(save4);
        float f9 = this.f19478e;
        if (f9 != -1.0f) {
            f = f9;
        }
        float f10 = this.f19479f;
        if (f10 == -1.0f) {
            f10 = m17809f(this.f19477d);
        }
        int b2 = m17805b(this.f19477d, f);
        int d2 = m17807d(this.f19477d, f10);
        int c2 = m17806c(this.f19477d, f);
        int a2 = m17804a(this.f19477d, f10);
        int save5 = canvas.save();
        canvas2.translate((float) bounds.left, (float) bounds.top);
        float f11 = (float) b2;
        float f12 = (float) c2;
        float f13 = (float) d2;
        canvas.drawRect(f11 + this.f19476c, 0.0f, (((float) bounds.width()) - this.f19476c) - f12, f13, this.f19481h);
        canvas2.restoreToCount(save5);
        int save6 = canvas.save();
        canvas2.translate((float) bounds.right, (float) bounds.bottom);
        canvas2.rotate(180.0f);
        float f14 = (float) a2;
        canvas.drawRect(f12 + this.f19476c, 0.0f, (((float) bounds.width()) - this.f19476c) - f11, f14, this.f19481h);
        canvas2.restoreToCount(save6);
        int save7 = canvas.save();
        canvas2.translate((float) bounds.left, (float) bounds.bottom);
        canvas2.rotate(270.0f);
        canvas.drawRect(f14 + this.f19476c, 0.0f, ((float) bounds.height()) - (this.f19476c + f13), f11, this.f19481h);
        canvas2.restoreToCount(save7);
        int save8 = canvas.save();
        canvas2.translate((float) bounds.right, (float) bounds.top);
        canvas2.rotate(90.0f);
        canvas.drawRect(f13 + this.f19476c, 0.0f, ((float) bounds.height()) - (this.f19476c + f14), f12, this.f19481h);
        canvas2.restoreToCount(save8);
    }

    public final int getOpacity() {
        return -3;
    }

    public final void setAlpha(int i) {
        this.f19486m.setAlpha(i);
        this.f19481h.setAlpha(i);
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        this.f19486m.setColorFilter(colorFilter);
        this.f19481h.setColorFilter(colorFilter);
    }
}
