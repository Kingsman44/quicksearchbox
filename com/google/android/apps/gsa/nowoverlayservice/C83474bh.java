package com.google.android.apps.gsa.nowoverlayservice;

import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import com.google.android.googlequicksearchbox.R;

/* renamed from: com.google.android.apps.gsa.nowoverlayservice.bh */
/* compiled from: PG */
final class C83474bh extends Drawable {

    /* renamed from: a */
    private int f227594a;

    /* renamed from: b */
    private final Paint f227595b;

    /* renamed from: c */
    private final int f227596c;

    /* renamed from: d */
    private final int f227597d;

    public C83474bh(Resources resources) {
        Paint paint = new Paint();
        this.f227595b = paint;
        this.f227596c = Math.abs(resources.getDimensionPixelSize(R.dimen.search_bg_9_baked_margin));
        this.f227597d = Math.abs(resources.getDimensionPixelSize(R.dimen.divider_left_right_padding));
        paint.setColor(resources.getColor(R.color.qsb_line_paint_color));
        paint.setStrokeWidth((float) Math.abs(resources.getDimensionPixelSize(R.dimen.search_plate_line_stroke)));
    }

    public final void draw(Canvas canvas) {
        Rect bounds = getBounds();
        canvas.drawLine((float) (bounds.left + this.f227597d), (float) (bounds.bottom - this.f227596c), (float) (bounds.right - this.f227597d), (float) (bounds.bottom - this.f227596c), this.f227595b);
    }

    public final int getOpacity() {
        return this.f227594a;
    }

    public final void setAlpha(int i) {
        this.f227594a = i;
        this.f227595b.setAlpha(i);
        invalidateSelf();
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        this.f227595b.setColorFilter(colorFilter);
    }
}
