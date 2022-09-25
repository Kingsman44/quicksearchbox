package com.p232a.p233a;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Picture;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;

/* renamed from: com.a.a.cb */
/* compiled from: PG */
public final class C4747cb extends Drawable {

    /* renamed from: a */
    private final C4734bp f14920a;

    /* renamed from: b */
    private final Picture f14921b;

    /* renamed from: c */
    private final Rect f14922c = new Rect();

    /* renamed from: d */
    private Bitmap f14923d;

    /* renamed from: e */
    private final Paint f14924e = new Paint();

    public C4747cb(C4734bp bpVar) {
        this.f14920a = bpVar;
        this.f14921b = bpVar.mo9624i();
    }

    public final void draw(Canvas canvas) {
        Rect bounds = getBounds();
        if (bounds.width() > 0 && bounds.height() > 0) {
            if (!bounds.equals(this.f14922c)) {
                copyBounds(this.f14922c);
                int width = bounds.width();
                int height = bounds.height();
                this.f14923d = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
                new Canvas(this.f14923d).drawPicture(this.f14921b, new Rect(0, 0, width, height));
            }
            canvas.drawBitmap(this.f14923d, (float) bounds.left, (float) bounds.top, this.f14924e);
        }
    }

    public final int getIntrinsicHeight() {
        return (int) Math.ceil((double) this.f14920a.mo9618a());
    }

    public final int getIntrinsicWidth() {
        return (int) Math.ceil((double) this.f14920a.mo9619b());
    }

    public final int getOpacity() {
        return -3;
    }

    public final void setAlpha(int i) {
        this.f14924e.setAlpha(i);
    }

    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
