package com.google.android.material.progressindicator;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import com.google.android.material.p3505b.C44535e;

/* renamed from: com.google.android.material.progressindicator.x */
/* compiled from: PG */
final class C44866x extends C44863u {

    /* renamed from: c */
    private float f117069c = 300.0f;

    /* renamed from: d */
    private float f117070d;

    /* renamed from: e */
    private float f117071e;

    public C44866x(C44842af afVar) {
        super(afVar);
    }

    /* renamed from: a */
    public final int mo48293a() {
        return ((C44842af) this.f117062a).f117015a;
    }

    /* renamed from: b */
    public final int mo48294b() {
        return -1;
    }

    /* renamed from: c */
    public final void mo48295c(Canvas canvas, Rect rect, float f) {
        this.f117069c = (float) rect.width();
        float f2 = (float) ((C44842af) this.f117062a).f117015a;
        canvas.translate(((float) rect.left) + (((float) rect.width()) / 2.0f), ((float) rect.top) + (((float) rect.height()) / 2.0f) + Math.max(0.0f, ((float) (rect.height() - ((C44842af) this.f117062a).f117015a)) / 2.0f));
        if (((C44842af) this.f117062a).f116994i) {
            canvas.scale(-1.0f, 1.0f);
        }
        if ((this.f117063b.mo48318f() && ((C44842af) this.f117062a).f117019e == 1) || (this.f117063b.mo48317e() && ((C44842af) this.f117062a).f117020f == 2)) {
            canvas.scale(1.0f, -1.0f);
        }
        if (this.f117063b.mo48318f() || this.f117063b.mo48317e()) {
            canvas.translate(0.0f, (((float) ((C44842af) this.f117062a).f117015a) * (-1.0f + f)) / 2.0f);
        }
        float f3 = this.f117069c;
        canvas.clipRect((-f3) / 2.0f, (-f2) / 2.0f, f3 / 2.0f, f2 / 2.0f);
        C44842af afVar = (C44842af) this.f117062a;
        this.f117070d = ((float) afVar.f117015a) * f;
        this.f117071e = ((float) afVar.f117016b) * f;
    }

    /* renamed from: d */
    public final void mo48296d(Canvas canvas, Paint paint, float f, float f2, int i) {
        if (f != f2) {
            float f3 = this.f117069c;
            float f4 = (-f3) / 2.0f;
            float f5 = this.f117071e;
            float f6 = f5 + f5;
            float f7 = f3 - f6;
            paint.setStyle(Paint.Style.FILL);
            paint.setAntiAlias(true);
            paint.setColor(i);
            float f8 = this.f117070d;
            RectF rectF = new RectF((f * f7) + f4, (-f8) / 2.0f, f4 + (f2 * f7) + f6, f8 / 2.0f);
            float f9 = this.f117071e;
            canvas.drawRoundRect(rectF, f9, f9, paint);
        }
    }

    /* renamed from: e */
    public final void mo48297e(Canvas canvas, Paint paint) {
        int a = C44535e.m78718a(((C44842af) this.f117062a).f117018d, this.f117063b.f117060i);
        paint.setStyle(Paint.Style.FILL);
        paint.setAntiAlias(true);
        paint.setColor(a);
        float f = this.f117069c;
        float f2 = this.f117070d;
        RectF rectF = new RectF((-f) / 2.0f, (-f2) / 2.0f, f / 2.0f, f2 / 2.0f);
        float f3 = this.f117071e;
        canvas.drawRoundRect(rectF, f3, f3, paint);
    }
}
