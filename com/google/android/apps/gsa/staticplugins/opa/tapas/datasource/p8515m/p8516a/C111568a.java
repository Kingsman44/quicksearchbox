package com.google.android.apps.gsa.staticplugins.opa.tapas.datasource.p8515m.p8516a;

import com.google.android.apps.gsa.shared.p7066m.C90063do;
import com.google.protos.p4985f.p5046x.C65378c;
import com.google.protos.p4985f.p5046x.C65379d;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.datasource.m.a.a */
/* compiled from: PG */
public final /* synthetic */ class C111568a implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ C111573f f310290a;

    public /* synthetic */ C111568a(C111573f fVar) {
        this.f310290a = fVar;
    }

    public final /* synthetic */ Predicate and(Predicate predicate) {
        return Predicate.CC.$default$and(this, predicate);
    }

    public final /* synthetic */ Predicate negate() {
        return Predicate.CC.$default$negate(this);
    }

    /* renamed from: or */
    public final /* synthetic */ Predicate mo17950or(Predicate predicate) {
        return Predicate.CC.$default$or(this, predicate);
    }

    public final boolean test(Object obj) {
        C111573f fVar = this.f310290a;
        C65379d dVar = (C65379d) obj;
        if ((dVar.f177778a & 8) == 0) {
            return true;
        }
        C65378c cVar = dVar.f177783f;
        if (cVar == null) {
            cVar = C65378c.f177772b;
        }
        return ((long) cVar.f177774a) <= fVar.f310297a.mo79743a(C90063do.f249439dZ);
    }
}
