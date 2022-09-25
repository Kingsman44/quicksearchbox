package com.google.android.libraries.onegoogle.account.disc;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import com.google.common.base.C58838bb;

/* renamed from: com.google.android.libraries.onegoogle.account.disc.ap */
/* compiled from: PG */
final class C30188ap extends Drawable {

    /* renamed from: a */
    private static final int[][] f81625a = {new int[]{-279548, 155, 50}, new int[]{-1490379, 205, 105}, new int[]{-12417548, 310, 100}, new int[]{-13326253, 50, 105}};

    /* renamed from: b */
    private final Paint f81626b;

    /* renamed from: c */
    private final RectF f81627c = new RectF();

    /* renamed from: d */
    private final C30196ax f81628d;

    public C30188ap(C30196ax axVar) {
        this.f81628d = axVar;
        Paint paint = new Paint();
        this.f81626b = paint;
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.STROKE);
    }

    public final void draw(Canvas canvas) {
        int[][] iArr = f81625a;
        for (int i = 0; i < 4; i++) {
            int[] iArr2 = iArr[i];
            this.f81626b.setColor(iArr2[0]);
            canvas.drawArc(this.f81627c, (float) iArr2[1], (float) iArr2[2], false, this.f81626b);
        }
    }

    public final int getOpacity() {
        return -3;
    }

    /* access modifiers changed from: protected */
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        C58838bb.m90869d(rect.width() == rect.height(), "Width and height for G1RingDrawable bounds must be equal.");
        int round = Math.round(this.f81628d.f81639a.mo35655b(rect.width()));
        this.f81627c.set(C30193au.m56125a(round, rect));
        this.f81626b.setStrokeWidth((float) round);
        invalidateSelf();
    }

    public final void setAlpha(int i) {
        this.f81626b.setAlpha(i);
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        this.f81626b.setColorFilter(colorFilter);
    }
}
