package com.google.android.libraries.componentview.components.base.p1688b;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.style.ReplacementSpan;
import com.google.android.libraries.componentview.p1697d.C20482m;

/* renamed from: com.google.android.libraries.componentview.components.base.b.f */
/* compiled from: PG */
public final class C20036f extends ReplacementSpan {

    /* renamed from: a */
    private final int f56173a;

    public C20036f(Context context, float f) {
        this.f56173a = (int) (C20482m.m38433a(context) * f);
    }

    public final void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
    }

    public final int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        return this.f56173a;
    }
}
