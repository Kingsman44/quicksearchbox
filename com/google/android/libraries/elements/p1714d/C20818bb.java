package com.google.android.libraries.elements.p1714d;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;

/* renamed from: com.google.android.libraries.elements.d.bb */
/* compiled from: PG */
public final class C20818bb extends Drawable {

    /* renamed from: a */
    public Drawable f58300a;

    /* renamed from: b */
    private final Rect f58301b;

    /* renamed from: c */
    private final int f58302c;

    /* renamed from: d */
    private final int f58303d;

    private C20818bb(Rect rect, int i, int i2) {
        this.f58301b = rect;
        this.f58302c = i;
        this.f58303d = i2;
    }

    /* renamed from: a */
    static C20818bb m39089a(int i, int i2, int i3, int i4, int i5, int i6) {
        int max = Math.max(i, 0);
        int max2 = Math.max(i2, 0);
        int max3 = Math.max(i3, 0);
        int max4 = Math.max(i4, 0);
        int max5 = Math.max(i5, 0);
        int max6 = Math.max(i6, 0);
        Rect rect = new Rect(0, 0, max, max2);
        Rect rect2 = new Rect(0, 0, max + max3 + max5, max2 + max4 + max6);
        C20818bb bbVar = new C20818bb(rect, max3, max4);
        bbVar.setBounds(rect2);
        return bbVar;
    }

    public final void draw(Canvas canvas) {
        Drawable drawable = this.f58300a;
        if (drawable != null) {
            canvas.save();
            canvas.translate((float) this.f58302c, (float) this.f58303d);
            drawable.setBounds(this.f58301b);
            drawable.draw(canvas);
            canvas.restore();
        }
    }

    public final int getOpacity() {
        return 0;
    }

    public final void setAlpha(int i) {
    }

    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
