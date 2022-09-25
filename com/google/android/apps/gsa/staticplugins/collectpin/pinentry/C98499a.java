package com.google.android.apps.gsa.staticplugins.collectpin.pinentry;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.style.ReplacementSpan;

/* renamed from: com.google.android.apps.gsa.staticplugins.collectpin.pinentry.a */
/* compiled from: PG */
public final class C98499a extends ReplacementSpan {

    /* renamed from: a */
    private final float f275053a;

    /* renamed from: b */
    private final int f275054b;

    /* renamed from: c */
    private final int f275055c;

    /* renamed from: d */
    private final float f275056d;

    /* renamed from: e */
    private final float f275057e;

    public C98499a(float f, int i, int i2, float f2, float f3) {
        this.f275053a = f;
        this.f275054b = i;
        this.f275055c = i2;
        this.f275056d = f2;
        this.f275057e = f3;
    }

    public final void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        paint.setStrokeWidth(this.f275056d);
        while (i < i2) {
            float f2 = this.f275057e;
            float f3 = this.f275053a / 2.0f;
            float f4 = (f2 / 2.0f) + f + f3;
            float f5 = ((float) i5) - f3;
            if (!Character.isWhitespace(charSequence.charAt(i))) {
                paint.setColor(this.f275055c);
                paint.setStyle(Paint.Style.FILL);
                canvas.drawCircle(f4, f5, this.f275053a / 2.0f, paint);
            } else {
                paint.setColor(this.f275054b);
                paint.setStyle(Paint.Style.STROKE);
                canvas.drawCircle(f4, f5, (this.f275053a / 2.0f) - this.f275056d, paint);
            }
            f += this.f275053a + this.f275057e;
            i++;
        }
    }

    public final int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        if (fontMetricsInt != null) {
            fontMetricsInt.ascent = (int) (-this.f275053a);
            fontMetricsInt.descent = 0;
            fontMetricsInt.top = fontMetricsInt.ascent;
            fontMetricsInt.bottom = 0;
        }
        return (i2 - i) * ((int) (this.f275053a + this.f275057e));
    }
}
