package com.google.android.material.p3514k;

import android.graphics.Paint;
import android.graphics.Path;
import androidx.core.graphics.C1924a;

/* renamed from: com.google.android.material.k.a */
/* compiled from: PG */
public final class C44768a {

    /* renamed from: a */
    public final Paint f116709a;

    /* renamed from: b */
    public final Paint f116710b;

    /* renamed from: c */
    public int f116711c;

    /* renamed from: d */
    public final Paint f116712d;

    public C44768a() {
        this((byte[]) null);
    }

    /* renamed from: a */
    public final void mo48106a(int i) {
        this.f116711c = C1924a.m5189h(i, 68);
        C1924a.m5189h(i, 20);
        C1924a.m5189h(i, 0);
        this.f116709a.setColor(this.f116711c);
    }

    public C44768a(byte[] bArr) {
        new Path();
        Paint paint = new Paint();
        this.f116712d = paint;
        this.f116709a = new Paint();
        mo48106a(-16777216);
        paint.setColor(0);
        Paint paint2 = new Paint(4);
        this.f116710b = paint2;
        paint2.setStyle(Paint.Style.FILL);
        new Paint(paint2);
    }
}
