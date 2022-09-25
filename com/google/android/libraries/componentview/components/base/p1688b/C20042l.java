package com.google.android.libraries.componentview.components.base.p1688b;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.style.ReplacementSpan;

/* renamed from: com.google.android.libraries.componentview.components.base.b.l */
/* compiled from: PG */
public final class C20042l extends ReplacementSpan {
    public final void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        canvas.drawText(charSequence, i, i2, f, (float) i4, paint);
    }

    public final int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        return (int) paint.measureText(charSequence, i, i2);
    }
}
