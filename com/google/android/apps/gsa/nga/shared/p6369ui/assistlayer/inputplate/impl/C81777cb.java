package com.google.android.apps.gsa.nga.shared.p6369ui.assistlayer.inputplate.impl;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.style.ReplacementSpan;
import androidx.core.p092d.C1886a;
import com.google.android.apps.gsa.nga.shared.p6369ui.assistlayer.p6400q.C81965ab;

/* renamed from: com.google.android.apps.gsa.nga.shared.ui.assistlayer.inputplate.impl.cb */
/* compiled from: PG */
final class C81777cb extends ReplacementSpan {

    /* renamed from: a */
    public float f223702a;

    /* renamed from: b */
    final /* synthetic */ TranscriptionView f223703b;

    /* renamed from: c */
    private final float f223704c;

    public C81777cb(TranscriptionView transcriptionView) {
        this.f223703b = transcriptionView;
        this.f223702a = 0.0f;
        this.f223704c = 0.0f;
    }

    public final void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        int i6 = i4;
        float f2 = this.f223704c;
        float f3 = 1.0f;
        if (f2 != 1.0f) {
            f3 = C1886a.m5144b(((1.0f - f2) * this.f223702a) + f2, 0.0f, 1.0f);
        }
        paint.setAlpha((int) Math.ceil((double) (f3 * 255.0f)));
        if (C81965ab.m130205a(this.f223703b)) {
            canvas.drawText(charSequence, i, i2, (float) this.f223703b.f223512b.left, (float) i6, paint);
            return;
        }
        canvas.drawText(charSequence, i, i2, f, (float) i6, paint);
    }

    public final int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        return (int) Math.ceil((double) this.f223703b.getPaint().measureText(charSequence, 0, charSequence.length()));
    }

    public C81777cb(TranscriptionView transcriptionView, C81777cb cbVar) {
        this.f223703b = transcriptionView;
        this.f223702a = 0.0f;
        this.f223704c = C1886a.m5144b(cbVar.f223702a, 0.0f, 1.0f);
    }
}
