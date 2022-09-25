package com.google.android.libraries.componentview.components.base.p1688b;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.text.style.ImageSpan;

/* renamed from: com.google.android.libraries.componentview.components.base.b.a */
/* compiled from: PG */
public final class C20031a extends ImageSpan {
    public C20031a(Drawable drawable) {
        super(drawable, 1);
    }

    public final void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        Drawable drawable = getDrawable();
        canvas.save();
        canvas.translate(f, (float) ((i4 - drawable.getBounds().bottom) + 1));
        drawable.draw(canvas);
        canvas.restore();
    }
}
