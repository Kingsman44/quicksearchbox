package com.google.android.libraries.componentview.components.base.p1688b;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.Layout;
import android.text.Spanned;
import android.text.style.LeadingMarginSpan;

/* renamed from: com.google.android.libraries.componentview.components.base.b.h */
/* compiled from: PG */
public final class C20038h implements LeadingMarginSpan {

    /* renamed from: a */
    private final int f56174a;

    /* renamed from: b */
    private final String f56175b;

    public C20038h(int i, String str) {
        this.f56174a = i;
        this.f56175b = str;
    }

    public final void drawLeadingMargin(Canvas canvas, Paint paint, int i, int i2, int i3, int i4, int i5, CharSequence charSequence, int i6, int i7, boolean z, Layout layout) {
        if (this.f56175b != null && ((Spanned) charSequence).getSpanStart(this) == i6) {
            Paint.Style style = paint.getStyle();
            Paint.Align textAlign = paint.getTextAlign();
            paint.setStyle(Paint.Style.FILL);
            paint.setTextAlign(Paint.Align.RIGHT);
            canvas.drawText(this.f56175b, (float) (i + (i2 * this.f56174a)), (float) i4, paint);
            paint.setTextAlign(textAlign);
            paint.setStyle(style);
        }
    }

    public final int getLeadingMargin(boolean z) {
        return this.f56174a;
    }
}
