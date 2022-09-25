package com.p232a.p233a;

import android.graphics.Path;

/* renamed from: com.a.a.bv */
/* compiled from: PG */
final class C4740bv extends C4743by {

    /* renamed from: a */
    public float f14882a;

    /* renamed from: b */
    public final float f14883b;

    /* renamed from: c */
    public final Path f14884c;

    /* renamed from: d */
    final /* synthetic */ C4746ca f14885d;

    public C4740bv(C4746ca caVar, float f, float f2, Path path) {
        this.f14885d = caVar;
        this.f14882a = f;
        this.f14883b = f2;
        this.f14884c = path;
    }

    /* renamed from: a */
    public final void mo9628a(String str) {
        if (this.f14885d.mo9636i()) {
            Path path = new Path();
            this.f14885d.f14916d.f14889d.getTextPath(str, 0, str.length(), this.f14882a, this.f14883b, path);
            this.f14884c.addPath(path);
        }
        this.f14882a += this.f14885d.f14916d.f14889d.measureText(str);
    }

    /* renamed from: b */
    public final boolean mo9629b(C4727bi biVar) {
        if (!(biVar instanceof C4728bj)) {
            return true;
        }
        C4746ca.m13181h("Using <textPath> elements in a clip path is not supported.", new Object[0]);
        return false;
    }
}
