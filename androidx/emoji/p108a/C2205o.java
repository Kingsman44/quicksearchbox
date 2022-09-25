package androidx.emoji.p108a;

import android.graphics.Paint;
import android.text.style.ReplacementSpan;
import androidx.core.p097i.C1974i;
import androidx.p191s.p192a.p193a.C4080a;

/* renamed from: androidx.emoji.a.o */
/* compiled from: PG */
public abstract class C2205o extends ReplacementSpan {

    /* renamed from: a */
    public final C2201k f6245a;

    /* renamed from: b */
    private final Paint.FontMetricsInt f6246b = new Paint.FontMetricsInt();

    /* renamed from: c */
    private short f6247c = -1;

    /* renamed from: d */
    private float f6248d = 1.0f;

    public C2205o(C2201k kVar) {
        C1974i.m5319g(kVar, "metadata cannot be null");
        this.f6245a = kVar;
    }

    public final int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        paint.getFontMetricsInt(this.f6246b);
        this.f6248d = ((float) Math.abs(this.f6246b.descent - this.f6246b.ascent)) / ((float) this.f6245a.mo5518a().mo8578d());
        this.f6245a.mo5518a().mo8578d();
        C4080a a = this.f6245a.mo5518a();
        int e = a.mo8580e(12);
        this.f6247c = (short) ((int) (((float) (e != 0 ? a.f13069b.getShort(e + a.f13068a) : 0)) * this.f6248d));
        if (fontMetricsInt != null) {
            fontMetricsInt.ascent = this.f6246b.ascent;
            fontMetricsInt.descent = this.f6246b.descent;
            fontMetricsInt.top = this.f6246b.top;
            fontMetricsInt.bottom = this.f6246b.bottom;
        }
        return this.f6247c;
    }
}
