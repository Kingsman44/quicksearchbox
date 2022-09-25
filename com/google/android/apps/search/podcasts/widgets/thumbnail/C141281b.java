package com.google.android.apps.search.podcasts.widgets.thumbnail;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.podcasts.widgets.thumbnail.b */
/* compiled from: PG */
public final class C141281b extends Drawable {

    /* renamed from: a */
    private final float f383568a;

    /* renamed from: b */
    private final Paint f383569b;

    /* renamed from: c */
    private final RectF f383570c = new RectF();

    /* renamed from: d */
    private final Rect f383571d = new Rect();

    public C141281b(float f, int i) {
        this.f383568a = f;
        Paint paint = new Paint(5);
        paint.setColor(i);
        this.f383569b = paint;
    }

    public final void draw(Canvas canvas) {
        C69664n.m101061g(canvas, "canvas");
        RectF rectF = this.f383570c;
        float f = this.f383568a;
        canvas.drawRoundRect(rectF, f, f, this.f383569b);
    }

    public final int getOpacity() {
        return -3;
    }

    public final void getOutline(Outline outline) {
        C69664n.m101061g(outline, "outline");
        outline.setRoundRect(this.f383571d, this.f383568a);
    }

    /* access modifiers changed from: protected */
    public final void onBoundsChange(Rect rect) {
        C69664n.m101061g(rect, "bounds");
        super.onBoundsChange(rect);
        this.f383570c.set((float) rect.left, (float) rect.top, (float) rect.right, (float) rect.bottom);
        this.f383571d.set(rect);
    }

    public final void setAlpha(int i) {
        this.f383569b.setAlpha(i);
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        this.f383569b.setColorFilter(colorFilter);
    }
}
