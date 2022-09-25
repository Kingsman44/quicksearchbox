package com.google.android.libraries.p2460r.p2469c.p2471b;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.util.LruCache;

/* renamed from: com.google.android.libraries.r.c.b.m */
/* compiled from: PG */
public final class C32109m {

    /* renamed from: a */
    public final Canvas f86211a;

    /* renamed from: b */
    public final Paint f86212b = new Paint(1);

    /* renamed from: c */
    public final Paint f86213c;

    /* renamed from: d */
    public final LruCache f86214d;

    public C32109m() {
        Paint paint = new Paint(3);
        this.f86213c = paint;
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        this.f86211a = new Canvas();
        this.f86214d = new C32107k(this);
    }
}
