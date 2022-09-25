package com.p232a.p233a;

import android.graphics.Path;

/* renamed from: com.a.a.bs */
/* compiled from: PG */
final class C4737bs implements C4699ah {

    /* renamed from: a */
    final Path f14874a = new Path();

    /* renamed from: b */
    float f14875b;

    /* renamed from: c */
    float f14876c;

    public C4737bs(C4698ag agVar) {
        if (agVar != null) {
            agVar.mo9597e(this);
        }
    }

    /* renamed from: b */
    public final void mo9594b(float f, float f2, float f3, boolean z, boolean z2, float f4, float f5) {
        C4746ca.m13179c(this.f14875b, this.f14876c, f, f2, f3, z, z2, f4, f5, this);
        this.f14875b = f4;
        this.f14876c = f5;
    }

    /* renamed from: c */
    public final void mo9595c() {
        this.f14874a.close();
    }

    /* renamed from: d */
    public final void mo9596d(float f, float f2, float f3, float f4, float f5, float f6) {
        this.f14874a.cubicTo(f, f2, f3, f4, f5, f6);
        this.f14875b = f5;
        this.f14876c = f6;
    }

    /* renamed from: f */
    public final void mo9598f(float f, float f2) {
        this.f14874a.lineTo(f, f2);
        this.f14875b = f;
        this.f14876c = f2;
    }

    /* renamed from: g */
    public final void mo9599g(float f, float f2) {
        this.f14874a.moveTo(f, f2);
        this.f14875b = f;
        this.f14876c = f2;
    }

    /* renamed from: h */
    public final void mo9600h(float f, float f2, float f3, float f4) {
        this.f14874a.quadTo(f, f2, f3, f4);
        this.f14875b = f3;
        this.f14876c = f4;
    }
}
