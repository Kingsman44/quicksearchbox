package com.google.android.libraries.gsa.logoview.p1883c;

import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;

/* renamed from: com.google.android.libraries.gsa.logoview.c.d */
/* compiled from: PG */
public class C22910d {

    /* renamed from: a */
    public final RectF f63098a = new RectF();

    /* renamed from: b */
    protected final Matrix f63099b = new Matrix();

    /* renamed from: c */
    public final Path f63100c = new Path();

    /* renamed from: d */
    public final Path f63101d = new Path();

    /* renamed from: e */
    public float f63102e;

    /* renamed from: f */
    public float f63103f;

    /* renamed from: g */
    public Paint.Cap f63104g;

    /* renamed from: f */
    public final void mo28276f() {
        this.f63100c.reset();
        this.f63101d.reset();
        this.f63102e = 0.0f;
        this.f63103f = 0.0f;
        this.f63104g = Paint.Cap.ROUND;
    }

    /* renamed from: g */
    public final void mo28277g(float f, float f2, float f3) {
        this.f63099b.reset();
        this.f63099b.preScale(f3, f3);
        this.f63099b.preTranslate(f, f2);
        this.f63100c.transform(this.f63099b);
        this.f63101d.transform(this.f63099b);
        this.f63102e *= f3;
        this.f63103f *= f3;
    }
}
