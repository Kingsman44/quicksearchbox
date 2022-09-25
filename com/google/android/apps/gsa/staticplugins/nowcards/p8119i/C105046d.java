package com.google.android.apps.gsa.staticplugins.nowcards.p8119i;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.text.style.ImageSpan;

/* renamed from: com.google.android.apps.gsa.staticplugins.nowcards.i.d */
/* compiled from: PG */
public final class C105046d extends ImageSpan {
    public C105046d(Context context, int i) {
        super(context, i, 1);
    }

    public final void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        Drawable drawable = getDrawable();
        canvas.save();
        canvas.translate(f, (float) Math.max((-paint.getFontMetricsInt().top) - (drawable.getBounds().bottom - drawable.getBounds().top), 0));
        drawable.draw(canvas);
        canvas.restore();
    }
}
