package com.google.android.apps.gsa.searchbox.p6960ui.suggestions;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.text.style.ImageSpan;

/* renamed from: com.google.android.apps.gsa.searchbox.ui.suggestions.ak */
/* compiled from: PG */
final class C88766ak extends ImageSpan {

    /* renamed from: a */
    private Drawable f240179a;

    public C88766ak(Context context, int i) {
        super(context, i);
    }

    public final void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        if (this.f240179a == null) {
            this.f240179a = getDrawable();
        }
        Drawable drawable = this.f240179a;
        canvas.save();
        canvas.translate(f, (float) ((i5 - drawable.getBounds().bottom) / 2));
        drawable.draw(canvas);
        canvas.restore();
    }
}
