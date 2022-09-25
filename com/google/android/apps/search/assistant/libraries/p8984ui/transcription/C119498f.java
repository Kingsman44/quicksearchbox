package com.google.android.apps.search.assistant.libraries.p8984ui.transcription;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.style.ReplacementSpan;
import androidx.core.p092d.C1886a;

/* renamed from: com.google.android.apps.search.assistant.libraries.ui.transcription.f */
/* compiled from: PG */
final class C119498f extends ReplacementSpan {

    /* renamed from: a */
    public float f333102a;

    /* renamed from: b */
    final /* synthetic */ TranscriptionView f333103b;

    /* renamed from: c */
    private final float f333104c;

    public C119498f(TranscriptionView transcriptionView) {
        this.f333103b = transcriptionView;
        this.f333102a = 0.0f;
        this.f333104c = 0.0f;
    }

    public final void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        float f2 = this.f333104c;
        float f3 = 1.0f;
        if (f2 != 1.0f) {
            f3 = C1886a.m5144b(((1.0f - f2) * this.f333102a) + f2, 0.0f, 1.0f);
        }
        Paint paint2 = paint;
        paint2.setAlpha((int) Math.ceil((double) (f3 * 255.0f)));
        canvas.drawText(charSequence, i, i2, f, (float) i4, paint2);
    }

    public final int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        return (int) Math.ceil((double) this.f333103b.getPaint().measureText(charSequence, i, i2));
    }

    public C119498f(TranscriptionView transcriptionView, C119498f fVar) {
        this.f333103b = transcriptionView;
        this.f333102a = 0.0f;
        this.f333104c = C1886a.m5144b(fVar.f333102a, 0.0f, 1.0f);
    }
}
