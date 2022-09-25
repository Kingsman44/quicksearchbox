package com.google.android.apps.gsa.staticplugins.opa.tapas.p8572q;

import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.p7066m.C90063do;
import com.google.common.p4535g.C59203do;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.q.bz */
/* compiled from: PG */
public final class C113168bz {

    /* renamed from: a */
    private final C86124t f313485a;

    public C113168bz(C86124t tVar) {
        this.f313485a = tVar;
    }

    /* renamed from: a */
    public final double mo99895a(boolean z, long j, long j2) {
        if (!z) {
            double d = (double) j;
            Double.isNaN(d);
            double d2 = (double) j2;
            Double.isNaN(d2);
            double d3 = (d / 8.64E7d) + (d2 / 8.64E7d);
            return d3 < C59203do.f157270a ? C59203do.f157270a : (-Math.exp(-Math.pow(d3, 0.01d))) + 1.0d;
        }
        double m = this.f313485a.mo79747m(C90063do.f249285ae);
        double d4 = (double) j;
        Double.isNaN(d4);
        double d5 = m * (d4 / 8.64E7d);
        double m2 = this.f313485a.mo79747m(C90063do.f249253Z);
        double d6 = (double) j2;
        Double.isNaN(d6);
        return d5 + (m2 * (d6 / 8.64E7d));
    }
}
