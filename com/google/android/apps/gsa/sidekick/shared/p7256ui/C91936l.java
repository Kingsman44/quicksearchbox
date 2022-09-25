package com.google.android.apps.gsa.sidekick.shared.p7256ui;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.text.style.ImageSpan;
import android.widget.TextView;

/* renamed from: com.google.android.apps.gsa.sidekick.shared.ui.l */
/* compiled from: PG */
public class C91936l extends ImageSpan {

    /* renamed from: a */
    private final TextView f256403a;

    public C91936l(Drawable drawable, TextView textView) {
        super(drawable, 1);
        this.f256403a = textView;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo86637a(RuntimeException runtimeException) {
        throw runtimeException;
    }

    public final void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        int i6;
        Canvas canvas2 = canvas;
        Drawable drawable = getDrawable();
        if (this.f256403a.getLineCount() > 1) {
            i6 = (((int) (((float) (i5 - i3)) / this.f256403a.getLineSpacingMultiplier())) - drawable.getBounds().height()) / 2;
        } else {
            i6 = ((i5 - i3) - drawable.getBounds().height()) / 2;
        }
        canvas.save();
        float f2 = f;
        canvas.translate(f, (float) (i3 + i6));
        try {
            drawable.draw(canvas);
        } catch (RuntimeException e) {
            mo86637a(e);
        }
        canvas.restore();
        canvas.drawText(charSequence, i, i2, f, (float) ((i3 - paint.getFontMetricsInt().ascent) + i6), paint);
    }
}
