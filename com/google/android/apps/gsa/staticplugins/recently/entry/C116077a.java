package com.google.android.apps.gsa.staticplugins.recently.entry;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;

/* renamed from: com.google.android.apps.gsa.staticplugins.recently.entry.a */
/* compiled from: PG */
public final class C116077a extends Drawable {

    /* renamed from: a */
    public Bitmap f321869a;

    /* renamed from: b */
    private final int f321870b;

    /* renamed from: c */
    private final int f321871c;

    /* renamed from: d */
    private final Paint f321872d;

    /* renamed from: e */
    private final Rect f321873e = new Rect();

    /* renamed from: f */
    private final Rect f321874f = new Rect();

    public C116077a(int i, int i2, int i3) {
        Paint paint = new Paint();
        this.f321872d = paint;
        this.f321870b = i2;
        this.f321871c = i3;
        paint.setColor(i);
        paint.setFilterBitmap(true);
    }

    public final int getIntrinsicHeight() {
        return this.f321871c;
    }

    public final int getIntrinsicWidth() {
        return this.f321870b;
    }

    public final int getOpacity() {
        return -1;
    }

    public final void getOutline(Outline outline) {
        outline.setRoundRect(getBounds(), 0.0f);
    }

    public final void setAlpha(int i) {
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        this.f321872d.setColorFilter(colorFilter);
        invalidateSelf();
    }

    public final void draw(Canvas canvas) {
        Bitmap bitmap = this.f321869a;
        if (bitmap != null) {
            Rect bounds = getBounds();
            this.f321874f.set(bounds);
            if (bitmap.getWidth() > bitmap.getHeight()) {
                int width = bounds.width() * bitmap.getHeight();
                int height = (bounds.height() - (width / bitmap.getWidth())) / 2;
                int i = bounds.bottom - height;
                this.f321874f.set(bounds.left, height, bounds.right, i);
                canvas.drawRect((float) bounds.left, (float) bounds.top, (float) bounds.right, (float) height, this.f321872d);
                canvas.drawRect((float) bounds.left, (float) i, (float) bounds.right, (float) bounds.bottom, this.f321872d);
            }
            this.f321873e.set(0, 0, bitmap.getWidth(), (bitmap.getWidth() * this.f321874f.height()) / this.f321874f.width());
            canvas.drawBitmap(bitmap, this.f321873e, this.f321874f, this.f321872d);
            return;
        }
        canvas.drawRect(getBounds(), this.f321872d);
    }
}
