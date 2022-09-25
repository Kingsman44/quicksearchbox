package com.google.android.material.progressindicator;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import com.google.android.material.p3505b.C44535e;

/* renamed from: com.google.android.material.progressindicator.h */
/* compiled from: PG */
final class C44850h extends C44863u {

    /* renamed from: c */
    private int f117021c = 1;

    /* renamed from: d */
    private float f117022d;

    /* renamed from: e */
    private float f117023e;

    /* renamed from: f */
    private float f117024f;

    public C44850h(C44856n nVar) {
        super(nVar);
    }

    /* renamed from: g */
    private final int m79599g() {
        C44856n nVar = (C44856n) this.f117062a;
        int i = nVar.f117040g;
        int i2 = nVar.f117041h;
        return i + i2 + i2;
    }

    /* renamed from: h */
    private final void m79600h(Canvas canvas, Paint paint, float f, float f2, float f3) {
        canvas.save();
        canvas.rotate(f3);
        float f4 = this.f117024f;
        float f5 = f / 2.0f;
        canvas.drawRoundRect(new RectF(f4 - f5, f2, f4 + f5, -f2), f2, f2, paint);
        canvas.restore();
    }

    /* renamed from: a */
    public final int mo48293a() {
        return m79599g();
    }

    /* renamed from: b */
    public final int mo48294b() {
        return m79599g();
    }

    /* renamed from: c */
    public final void mo48295c(Canvas canvas, Rect rect, float f) {
        float width = ((float) rect.width()) / ((float) m79599g());
        float height = ((float) rect.height()) / ((float) m79599g());
        C44856n nVar = (C44856n) this.f117062a;
        float f2 = (((float) nVar.f117040g) / 2.0f) + ((float) nVar.f117041h);
        canvas.translate((f2 * width) + ((float) rect.left), (f2 * height) + ((float) rect.top));
        canvas.scale(width, height);
        canvas.rotate(-90.0f);
        float f3 = -f2;
        canvas.clipRect(f3, f3, f2, f2);
        C44856n nVar2 = (C44856n) this.f117062a;
        this.f117021c = nVar2.f117042i == 0 ? 1 : -1;
        int i = nVar2.f117015a;
        this.f117022d = ((float) i) * f;
        this.f117023e = ((float) nVar2.f117016b) * f;
        this.f117024f = ((float) (nVar2.f117040g - i)) / 2.0f;
        if ((this.f117063b.mo48318f() && ((C44856n) this.f117062a).f117019e == 2) || (this.f117063b.mo48317e() && ((C44856n) this.f117062a).f117020f == 1)) {
            this.f117024f += ((1.0f - f) * ((float) ((C44856n) this.f117062a).f117015a)) / 2.0f;
        } else if ((this.f117063b.mo48318f() && ((C44856n) this.f117062a).f117019e == 1) || (this.f117063b.mo48317e() && ((C44856n) this.f117062a).f117020f == 2)) {
            this.f117024f -= ((1.0f - f) * ((float) ((C44856n) this.f117062a).f117015a)) / 2.0f;
        }
    }

    /* renamed from: d */
    public final void mo48296d(Canvas canvas, Paint paint, float f, float f2, int i) {
        Paint paint2 = paint;
        if (f != f2) {
            paint.setStyle(Paint.Style.STROKE);
            paint.setStrokeCap(Paint.Cap.BUTT);
            paint.setAntiAlias(true);
            paint.setColor(i);
            paint.setStrokeWidth(this.f117022d);
            float f3 = (float) this.f117021c;
            float f4 = f * 360.0f * f3;
            float f5 = (f2 >= f ? f2 - f : (1.0f + f2) - f) * 360.0f * f3;
            float f6 = this.f117024f;
            float f7 = -f6;
            canvas.drawArc(new RectF(f7, f7, f6, f6), f4, f5, false, paint);
            if (this.f117023e > 0.0f && Math.abs(f5) < 360.0f) {
                paint.setStyle(Paint.Style.FILL);
                Canvas canvas2 = canvas;
                Paint paint3 = paint;
                m79600h(canvas2, paint3, this.f117022d, this.f117023e, f4);
                m79600h(canvas2, paint3, this.f117022d, this.f117023e, f4 + f5);
            }
        }
    }

    /* renamed from: e */
    public final void mo48297e(Canvas canvas, Paint paint) {
        int a = C44535e.m78718a(((C44856n) this.f117062a).f117018d, this.f117063b.f117060i);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.BUTT);
        paint.setAntiAlias(true);
        paint.setColor(a);
        paint.setStrokeWidth(this.f117022d);
        float f = this.f117024f;
        float f2 = -f;
        canvas.drawArc(new RectF(f2, f2, f, f), 0.0f, 360.0f, false, paint);
    }
}
