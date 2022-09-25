package com.google.android.apps.gsa.sidekick.shared.p7256ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.text.BoringLayout;
import android.text.TextPaint;
import android.text.style.ReplacementSpan;
import com.google.android.googlequicksearchbox.R;

/* renamed from: com.google.android.apps.gsa.sidekick.shared.ui.s */
/* compiled from: PG */
public final class C91943s extends ReplacementSpan {

    /* renamed from: a */
    private final Drawable f256414a;

    /* renamed from: b */
    private final int f256415b;

    /* renamed from: c */
    private final int f256416c;

    /* renamed from: d */
    private final int f256417d;

    /* renamed from: e */
    private final Rect f256418e = new Rect();

    /* renamed from: f */
    private final Rect f256419f = new Rect();

    public C91943s(Context context, int i, int i2) {
        this.f256415b = context.getResources().getDimensionPixelSize(R.dimen.qp_nano_padding);
        this.f256416c = context.getResources().getDimensionPixelSize(R.dimen.qp_badge_vertical_padding);
        this.f256417d = i2;
        Drawable mutate = context.getResources().getDrawable(R.drawable.qp_badge_background).mutate();
        this.f256414a = mutate;
        if (mutate instanceof GradientDrawable) {
            ((GradientDrawable) mutate).setColor(i);
        }
    }

    public final void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        int i6;
        Canvas canvas2 = canvas;
        float f2 = f;
        int i7 = i3;
        canvas.save();
        this.f256414a.copyBounds(this.f256419f);
        int i8 = ((i5 - i7) - (this.f256419f.bottom - this.f256419f.top)) / 2;
        if (i8 > 0) {
            this.f256418e.left = this.f256419f.left;
            this.f256418e.top = this.f256419f.top + i8;
            this.f256418e.right = this.f256419f.right;
            this.f256418e.bottom = this.f256419f.bottom + i8;
            this.f256414a.setBounds(this.f256418e);
            i6 = i8;
        } else {
            i6 = 0;
        }
        canvas.translate(f, (float) i7);
        this.f256414a.draw(canvas);
        canvas.restore();
        Paint paint2 = paint;
        paint2.setColor(this.f256417d);
        canvas.drawText(charSequence, i, i2, f2 + ((float) this.f256415b), (float) ((i7 - paint.getFontMetricsInt().ascent) + this.f256416c + i6), paint2);
        if (i6 > 0) {
            this.f256414a.setBounds(this.f256419f);
        }
    }

    public final int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        int i3;
        int i4;
        Rect rect = new Rect();
        String substring = charSequence.toString().substring(i, i2);
        paint.getTextBounds(substring, 0, substring.length(), rect);
        BoringLayout.Metrics isBoring = BoringLayout.isBoring(substring, (TextPaint) paint);
        int i5 = this.f256415b;
        int i6 = i5 + i5;
        int i7 = this.f256416c;
        int i8 = i7 + i7;
        if (isBoring != null) {
            i3 = i6 + isBoring.width;
            i4 = i8 + (isBoring.descent - isBoring.ascent);
        } else {
            i3 = i6 + rect.width();
            i4 = i8 + rect.height();
        }
        this.f256414a.setBounds(0, 0, i3, i4);
        if (fontMetricsInt != null) {
            Paint.FontMetricsInt fontMetricsInt2 = paint.getFontMetricsInt();
            fontMetricsInt.ascent = fontMetricsInt2.ascent - this.f256416c;
            fontMetricsInt.descent = fontMetricsInt2.descent + this.f256416c;
            fontMetricsInt.top = fontMetricsInt.ascent;
            fontMetricsInt.bottom = fontMetricsInt.descent;
        }
        return i3;
    }
}
