package com.google.android.libraries.elements.p1727f;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import com.facebook.litho.C6110au;
import com.facebook.yoga.C6575k;
import org.chromium.net.PrivateKeyType;

/* renamed from: com.google.android.libraries.elements.f.s */
/* compiled from: PG */
final class C21170s extends Drawable {

    /* renamed from: a */
    private static final int f59376a;

    /* renamed from: b */
    private static final int f59377b;

    /* renamed from: c */
    private static final int f59378c;

    /* renamed from: d */
    private static final int f59379d;

    /* renamed from: e */
    private static final Paint f59380e;

    /* renamed from: f */
    private static final Paint f59381f;

    /* renamed from: g */
    private static final Paint f59382g;

    /* renamed from: h */
    private static final Paint f59383h;

    /* renamed from: i */
    private final Path f59384i;

    /* renamed from: j */
    private final Path f59385j;

    /* renamed from: k */
    private final Path f59386k;

    /* renamed from: l */
    private final Path f59387l;

    static {
        int argb = Color.argb(168, 246, 178, 107);
        f59376a = argb;
        int argb2 = Color.argb(168, PrivateKeyType.INVALID, 229, 153);
        f59377b = argb2;
        int argb3 = Color.argb(140, 147, 196, 125);
        f59378c = argb3;
        int argb4 = Color.argb(168, 111, 168, 220);
        f59379d = argb4;
        f59380e = C21171t.m39760a(argb);
        f59381f = C21171t.m39760a(argb2);
        f59382g = C21171t.m39760a(argb3);
        f59383h = C21171t.m39760a(argb4);
    }

    public C21170s(C6110au auVar) {
        Path path = new Path();
        this.f59384i = path;
        Path path2 = new Path();
        this.f59385j = path2;
        Path path3 = new Path();
        this.f59386k = path3;
        Path path4 = new Path();
        this.f59387l = path4;
        C6575k h = auVar.mo12864h();
        RectF rectF = new RectF(auVar.mo12860a());
        RectF rectF2 = new RectF(rectF.left - h.mo13668S(1), rectF.top - h.mo13668S(2), rectF.right + h.mo13668S(3), rectF.bottom + h.mo13668S(4));
        RectF rectF3 = new RectF(rectF.left + h.mo13667R(1), rectF.top + h.mo13667R(2), rectF.right - h.mo13667R(3), rectF.bottom - h.mo13667R(4));
        RectF rectF4 = new RectF(rectF3.left + h.mo13669T(1), rectF3.top + h.mo13669T(2), rectF3.right - h.mo13669T(3), rectF3.bottom - h.mo13669T(4));
        path.addRect(rectF2, Path.Direction.CW);
        path.addRect(rectF, Path.Direction.CCW);
        path2.addRect(rectF, Path.Direction.CW);
        path2.addRect(rectF3, Path.Direction.CCW);
        path3.addRect(rectF3, Path.Direction.CW);
        path3.addRect(rectF4, Path.Direction.CCW);
        path4.addRect(rectF4, Path.Direction.CW);
    }

    public final void draw(Canvas canvas) {
        canvas.drawPath(this.f59384i, f59380e);
        canvas.drawPath(this.f59385j, f59381f);
        canvas.drawPath(this.f59386k, f59382g);
        canvas.drawPath(this.f59387l, f59383h);
    }

    public final int getOpacity() {
        return -3;
    }

    public final void setAlpha(int i) {
    }

    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
