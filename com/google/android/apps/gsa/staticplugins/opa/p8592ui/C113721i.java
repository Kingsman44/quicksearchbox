package com.google.android.apps.gsa.staticplugins.opa.p8592ui;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.ui.i */
/* compiled from: PG */
public final class C113721i extends Drawable {

    /* renamed from: a */
    private final Paint f314948a;

    /* renamed from: b */
    private final C113720h f314949b;

    /* renamed from: c */
    private RectF f314950c = new RectF();

    /* renamed from: d */
    private final float f314951d;

    /* renamed from: e */
    private final float f314952e;

    public C113721i(C113720h hVar, int i, float f, float f2) {
        this.f314949b = hVar;
        this.f314951d = f;
        this.f314952e = f2;
        Paint paint = new Paint();
        this.f314948a = paint;
        paint.setAntiAlias(true);
        paint.setFilterBitmap(true);
        paint.setDither(true);
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(i);
        paint.setShadowLayer((float) hVar.f314946b, 0.0f, (float) hVar.f314947c, hVar.f314945a);
    }

    public final void draw(Canvas canvas) {
        this.f314948a.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_OUT));
        canvas.drawRoundRect(this.f314950c, this.f314951d, this.f314952e, this.f314948a);
    }

    public final int getOpacity() {
        return 0;
    }

    /* access modifiers changed from: protected */
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        int i = rect.right - rect.left;
        int i2 = rect.bottom - rect.top;
        if (i > 0 && i2 > 0) {
            C113720h hVar = this.f314949b;
            int i3 = hVar.f314946b;
            int i4 = hVar.f314947c;
            this.f314950c = new RectF((float) i3, (float) (i3 - i4), (float) (i - i3), (float) ((i2 - i3) - i4));
            invalidateSelf();
        }
    }

    public final void setAlpha(int i) {
    }

    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
