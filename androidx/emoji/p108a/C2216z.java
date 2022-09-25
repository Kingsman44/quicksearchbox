package androidx.emoji.p108a;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Typeface;

/* renamed from: androidx.emoji.a.z */
/* compiled from: PG */
public final class C2216z extends C2205o {
    public C2216z(C2201k kVar) {
        super(kVar);
    }

    public final void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        Paint paint2 = paint;
        C2200j.m6088b();
        C2201k kVar = this.f6245a;
        Typeface typeface = kVar.f6233b.f6268d;
        Typeface typeface2 = paint.getTypeface();
        paint2.setTypeface(typeface);
        int i6 = kVar.f6232a;
        canvas.drawText(kVar.f6233b.f6266b, i6 + i6, 2, f, (float) i4, paint);
        paint2.setTypeface(typeface2);
    }
}
