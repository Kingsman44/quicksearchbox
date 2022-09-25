package com.google.android.apps.search.assistant.libraries.p8984ui.logoview.p8987c;

import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;

/* renamed from: com.google.android.apps.search.assistant.libraries.ui.logoview.c.d */
/* compiled from: PG */
public class C119469d {

    /* renamed from: a */
    public final RectF f333068a = new RectF();

    /* renamed from: b */
    protected final Matrix f333069b = new Matrix();

    /* renamed from: c */
    public final Path f333070c = new Path();

    /* renamed from: d */
    public final Path f333071d = new Path();

    /* renamed from: e */
    public float f333072e;

    /* renamed from: f */
    public float f333073f;

    /* renamed from: g */
    public Paint.Cap f333074g;

    /* renamed from: f */
    public final void mo104395f() {
        this.f333070c.reset();
        this.f333071d.reset();
        this.f333072e = 0.0f;
        this.f333073f = 0.0f;
        this.f333074g = Paint.Cap.ROUND;
    }

    /* renamed from: g */
    public final void mo104396g(float f, float f2, float f3) {
        this.f333069b.reset();
        this.f333069b.preScale(f3, f3);
        this.f333069b.preTranslate(f, f2);
        this.f333070c.transform(this.f333069b);
        this.f333071d.transform(this.f333069b);
        this.f333072e *= f3;
        this.f333073f *= f3;
    }
}
