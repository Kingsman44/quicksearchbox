package com.p232a.p233a;

import android.graphics.Paint;
import android.graphics.Typeface;

/* renamed from: com.a.a.bw */
/* compiled from: PG */
final class C4741bw implements Cloneable {

    /* renamed from: a */
    public C4706ao f14886a = C4706ao.m13074a();

    /* renamed from: b */
    public boolean f14887b;

    /* renamed from: c */
    public boolean f14888c;

    /* renamed from: d */
    public Paint f14889d;

    /* renamed from: e */
    public Paint f14890e;

    /* renamed from: f */
    public C4766m f14891f;

    /* renamed from: g */
    public C4766m f14892g;

    /* renamed from: h */
    public boolean f14893h;

    /* renamed from: i */
    public boolean f14894i;

    public C4741bw() {
        Paint paint = new Paint();
        this.f14889d = paint;
        paint.setFlags(385);
        this.f14889d.setStyle(Paint.Style.FILL);
        this.f14889d.setTypeface(Typeface.DEFAULT);
        Paint paint2 = new Paint();
        this.f14890e = paint2;
        paint2.setFlags(385);
        this.f14890e.setStyle(Paint.Style.STROKE);
        this.f14890e.setTypeface(Typeface.DEFAULT);
    }

    /* access modifiers changed from: protected */
    public final Object clone() {
        try {
            C4741bw bwVar = (C4741bw) super.clone();
            bwVar.f14886a = (C4706ao) this.f14886a.clone();
            bwVar.f14889d = new Paint(this.f14889d);
            bwVar.f14890e = new Paint(this.f14890e);
            return bwVar;
        } catch (CloneNotSupportedException e) {
            throw new InternalError(e.toString());
        }
    }
}
