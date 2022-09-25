package com.google.android.libraries.elements.p1714d;

import android.graphics.Paint;
import android.text.style.LineHeightSpan;

/* renamed from: com.google.android.libraries.elements.d.cz */
/* compiled from: PG */
public final class C20875cz implements LineHeightSpan {

    /* renamed from: a */
    private final float f58543a;

    public C20875cz(float f) {
        this.f58543a = f;
    }

    public final void chooseHeight(CharSequence charSequence, int i, int i2, int i3, int i4, Paint.FontMetricsInt fontMetricsInt) {
        float f = this.f58543a;
        if (f > 0.0f) {
            double d = (double) ((f - ((float) (fontMetricsInt.bottom - fontMetricsInt.top))) / 2.0f);
            double d2 = (double) fontMetricsInt.top;
            double floor = Math.floor(d);
            Double.isNaN(d2);
            fontMetricsInt.top = (int) (d2 - floor);
            double d3 = (double) fontMetricsInt.bottom;
            double ceil = Math.ceil(d);
            Double.isNaN(d3);
            fontMetricsInt.bottom = (int) (d3 + ceil);
            fontMetricsInt.ascent = fontMetricsInt.top;
            fontMetricsInt.descent = fontMetricsInt.bottom;
        }
    }
}
