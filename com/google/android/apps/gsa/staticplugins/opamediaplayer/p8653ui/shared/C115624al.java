package com.google.android.apps.gsa.staticplugins.opamediaplayer.p8653ui.shared;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* renamed from: com.google.android.apps.gsa.staticplugins.opamediaplayer.ui.shared.al */
/* compiled from: PG */
final class C115624al extends Drawable {

    /* renamed from: a */
    private final float f320751a;

    /* renamed from: b */
    private final Paint f320752b;

    /* renamed from: c */
    private final RectF f320753c = new RectF();

    /* renamed from: d */
    private final Rect f320754d = new Rect();

    public C115624al(float f, int i) {
        this.f320751a = f;
        Paint paint = new Paint(5);
        this.f320752b = paint;
        paint.setColor(i);
    }

    public final void draw(Canvas canvas) {
        RectF rectF = this.f320753c;
        float f = this.f320751a;
        canvas.drawRoundRect(rectF, f, f, this.f320752b);
    }

    public final int getOpacity() {
        return -3;
    }

    public final void getOutline(Outline outline) {
        outline.setRoundRect(this.f320754d, this.f320751a);
    }

    /* access modifiers changed from: protected */
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        if (rect == null) {
            rect = getBounds();
        }
        this.f320753c.set((float) rect.left, (float) rect.top, (float) rect.right, (float) rect.bottom);
        this.f320754d.set(rect);
    }

    public final void setAlpha(int i) {
        this.f320752b.setAlpha(i);
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        this.f320752b.setColorFilter(colorFilter);
    }
}
