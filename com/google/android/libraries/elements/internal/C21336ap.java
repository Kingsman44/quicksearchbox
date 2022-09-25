package com.google.android.libraries.elements.internal;

import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;

/* renamed from: com.google.android.libraries.elements.internal.ap */
/* compiled from: PG */
public final class C21336ap extends MetricAffectingSpan {

    /* renamed from: a */
    private final float f59697a;

    public C21336ap(float f) {
        this.f59697a = f;
    }

    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setLetterSpacing(this.f59697a);
    }

    public final void updateMeasureState(TextPaint textPaint) {
        textPaint.setLetterSpacing(this.f59697a);
    }
}
