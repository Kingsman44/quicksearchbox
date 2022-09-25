package com.google.android.libraries.componentview.components.base.p1688b;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.text.style.ReplacementSpan;
import com.google.android.libraries.componentview.p1697d.C20482m;

/* renamed from: com.google.android.libraries.componentview.components.base.b.b */
/* compiled from: PG */
public final class C20032b extends ReplacementSpan {

    /* renamed from: a */
    private final int f56155a;

    /* renamed from: b */
    private final int f56156b;

    public C20032b(Context context, int i) {
        this.f56155a = (int) (C20482m.m38433a(context) * 3.0f);
        this.f56156b = i;
    }

    public final void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        Canvas canvas2 = canvas;
        float f2 = f;
        Paint paint2 = paint;
        float measureText = paint2.measureText(charSequence, i, i2);
        Paint paint3 = new Paint(paint2);
        paint3.setStyle(Paint.Style.STROKE);
        paint3.setAntiAlias(true);
        float f3 = (float) i4;
        float ascent = paint.ascent();
        int i6 = this.f56155a;
        RectF rectF = new RectF(f2, (ascent + f3) - 4.0f, measureText + f2 + ((float) (i6 + i6)), paint.descent() + f3 + 1.0f);
        int i7 = this.f56156b;
        if (i7 <= 0) {
            canvas.drawRect(rectF, paint3);
        } else {
            float f4 = (float) i7;
            canvas.drawRoundRect(rectF, f4, f4, paint3);
        }
        canvas.drawText(charSequence, i, i2, ((float) this.f56155a) + f2, f3, paint);
    }

    public final int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        int i3 = this.f56155a;
        return i3 + i3 + ((int) paint.measureText(charSequence, i, i2));
    }
}
