package com.google.android.libraries.elements.internal;

import android.graphics.Paint;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.text.style.TypefaceSpan;

/* compiled from: PG */
public final class Spans$CustomTypefaceSpan extends TypefaceSpan {

    /* renamed from: a */
    private final Typeface f59681a;

    public Spans$CustomTypefaceSpan(String str, Typeface typeface) {
        super(str);
        this.f59681a = typeface;
    }

    /* renamed from: a */
    private static void m40326a(Paint paint, Typeface typeface) {
        if (typeface != null) {
            paint.setTypeface(typeface);
        }
    }

    public final void updateDrawState(TextPaint textPaint) {
        m40326a(textPaint, this.f59681a);
    }

    public final void updateMeasureState(TextPaint textPaint) {
        m40326a(textPaint, this.f59681a);
    }
}
