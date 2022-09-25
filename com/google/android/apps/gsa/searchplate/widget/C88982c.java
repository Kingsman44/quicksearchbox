package com.google.android.apps.gsa.searchplate.widget;

import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.UpdateAppearance;

/* renamed from: com.google.android.apps.gsa.searchplate.widget.c */
/* compiled from: PG */
final class C88982c extends CharacterStyle implements UpdateAppearance {

    /* renamed from: a */
    public int f241141a = 0;

    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setAlpha(this.f241141a);
    }
}
