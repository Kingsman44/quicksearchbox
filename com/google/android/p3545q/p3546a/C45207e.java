package com.google.android.p3545q.p3546a;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.text.style.ImageSpan;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.q.a.e */
/* compiled from: PG */
public final class C45207e extends ImageSpan {

    /* renamed from: a */
    private final C45206d f117970a;

    public C45207e(C45206d dVar) {
        super(dVar, 1);
        this.f117970a = dVar;
    }

    public final void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        C69664n.m101061g(canvas, "canvas");
        C69664n.m101061g(paint, "paint");
        if (this.mVerticalAlignment != 1) {
            super.draw(canvas, charSequence, i, i2, f, i3, i4, i5, paint);
        }
        int save = canvas.save();
        canvas.translate(f, ((float) i4) - ((float) Math.ceil((double) ((((float) this.f117970a.mo49037e()) / ((float) this.f117970a.getIntrinsicHeight())) * ((float) this.f117970a.getBounds().height())))));
        this.f117970a.draw(canvas);
        canvas.restoreToCount(save);
    }

    public final int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        C69664n.m101061g(paint, "paint");
        if (this.f117970a.getBounds().isEmpty()) {
            return this.f117970a.getBounds().right;
        }
        if (this.mVerticalAlignment != 1) {
            return super.getSize(paint, charSequence, i, i2, fontMetricsInt);
        }
        this.f117970a.mo49045j(paint);
        Rect bounds = this.f117970a.getBounds();
        C69664n.m101060f(bounds, "drawable.bounds");
        if (fontMetricsInt != null) {
            fontMetricsInt.ascent = -((int) ((float) Math.ceil((double) ((((float) this.f117970a.mo49037e()) / ((float) this.f117970a.getIntrinsicHeight())) * ((float) bounds.height())))));
            fontMetricsInt.descent = (int) ((float) Math.ceil((double) ((((float) this.f117970a.mo49038f()) / ((float) this.f117970a.getIntrinsicHeight())) * ((float) bounds.height()))));
            fontMetricsInt.top = fontMetricsInt.ascent;
            fontMetricsInt.bottom = fontMetricsInt.descent;
        }
        return bounds.right;
    }
}
