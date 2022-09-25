package com.google.apps.p3589d.p3595f;

import com.google.apps.p3589d.p3591b.C45719j;
import com.google.common.p4535g.C59203do;

/* renamed from: com.google.apps.d.f.b */
/* compiled from: PG */
final class C45799b extends C45812o {

    /* renamed from: a */
    private final C45719j f120425a;

    public C45799b(C45719j jVar) {
        this.f120425a = jVar;
    }

    /* renamed from: a */
    public final double mo49927a() {
        return C59203do.f157270a;
    }

    /* renamed from: b */
    public final C45719j mo49928b() {
        return this.f120425a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C45812o) {
            C45812o oVar = (C45812o) obj;
            return Double.doubleToLongBits(C59203do.f157270a) == Double.doubleToLongBits(oVar.mo49927a()) && this.f120425a.equals(oVar.mo49928b());
        }
    }

    public final int hashCode() {
        long doubleToLongBits = Double.doubleToLongBits(C59203do.f157270a);
        return this.f120425a.f120220a.hashCode() ^ ((((int) (doubleToLongBits ^ (Double.doubleToLongBits(C59203do.f157270a) >>> 32))) ^ 1000003) * 1000003);
    }

    public final String toString() {
        String obj = this.f120425a.toString();
        return "GlyphAssembly{italicsCorrection=0.0, partRecords=" + obj + "}";
    }
}
