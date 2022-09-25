package com.google.android.apps.search.googleapp.search.voicesearch.logoview.p10475c;

import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;

/* renamed from: com.google.android.apps.search.googleapp.search.voicesearch.logoview.c.d */
/* compiled from: PG */
public class C138830d {

    /* renamed from: a */
    public final RectF f377669a = new RectF();

    /* renamed from: b */
    protected final Matrix f377670b = new Matrix();

    /* renamed from: c */
    public final Path f377671c = new Path();

    /* renamed from: d */
    public final Path f377672d = new Path();

    /* renamed from: e */
    public float f377673e;

    /* renamed from: f */
    public float f377674f;

    /* renamed from: g */
    public Paint.Cap f377675g;

    /* renamed from: f */
    public final void mo114596f() {
        this.f377671c.reset();
        this.f377672d.reset();
        this.f377673e = 0.0f;
        this.f377674f = 0.0f;
        this.f377675g = Paint.Cap.ROUND;
    }

    /* renamed from: g */
    public final void mo114597g(float f, float f2, float f3) {
        this.f377670b.reset();
        this.f377670b.preScale(f3, f3);
        this.f377670b.preTranslate(f, f2);
        this.f377671c.transform(this.f377670b);
        this.f377672d.transform(this.f377670b);
        this.f377673e *= f3;
        this.f377674f *= f3;
    }
}
