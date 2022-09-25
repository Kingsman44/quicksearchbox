package com.google.android.libraries.lens.view.onboarding;

import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.text.style.ImageSpan;

/* renamed from: com.google.android.libraries.lens.view.onboarding.ay */
/* compiled from: PG */
final class C27492ay extends ImageSpan {

    /* renamed from: a */
    private final int f75179a;

    public C27492ay(Drawable drawable, int i) {
        super(drawable);
        this.f75179a = i;
    }

    public final int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        if (fontMetricsInt != null) {
            fontMetricsInt.ascent = -this.f75179a;
            fontMetricsInt.descent = 0;
            fontMetricsInt.top = fontMetricsInt.ascent;
            fontMetricsInt.bottom = 0;
        }
        return getDrawable().getBounds().right;
    }
}
