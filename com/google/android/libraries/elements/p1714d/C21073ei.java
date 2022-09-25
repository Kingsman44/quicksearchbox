package com.google.android.libraries.elements.p1714d;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.style.ImageSpan;

/* renamed from: com.google.android.libraries.elements.d.ei */
/* compiled from: PG */
public final class C21073ei extends ImageSpan {

    /* renamed from: a */
    private final Paint.FontMetricsInt f59073a = new Paint.FontMetricsInt();

    public C21073ei(Drawable drawable) {
        super(drawable, 0);
    }

    public final void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        Drawable drawable = getDrawable();
        canvas.save();
        paint.getFontMetricsInt(this.f59073a);
        Rect bounds = drawable.getBounds();
        canvas.translate(f, (float) ((((i4 + this.f59073a.bottom) - ((this.f59073a.bottom - this.f59073a.top) / 2)) - (bounds.height() / 2)) + 1));
        drawable.draw(canvas);
        canvas.restore();
    }

    public final int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        Rect bounds = getDrawable().getBounds();
        paint.getFontMetricsInt(this.f59073a);
        int i3 = this.f59073a.ascent - this.f59073a.top;
        int i4 = this.f59073a.bottom - this.f59073a.descent;
        int i5 = this.f59073a.bottom - ((this.f59073a.bottom - this.f59073a.top) / 2);
        int height = bounds.height() / 2;
        if (fontMetricsInt != null) {
            fontMetricsInt.ascent = i5 - height;
            fontMetricsInt.descent = i5 + height;
            fontMetricsInt.top = fontMetricsInt.ascent - i3;
            fontMetricsInt.bottom = fontMetricsInt.descent + i4;
        }
        return bounds.right;
    }
}
