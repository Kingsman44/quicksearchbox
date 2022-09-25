package com.google.android.apps.gsa.staticplugins.opa.tapas.p8471a;

import com.google.android.apps.gsa.shared.p7066m.C90063do;
import com.google.common.base.C58835az;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.a.by */
/* compiled from: PG */
public final /* synthetic */ class C111028by implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ C111029bz f309213a;

    public /* synthetic */ C111028by(C111029bz bzVar) {
        this.f309213a = bzVar;
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
        return ((Double) ((C58835az) obj).f156632b).doubleValue() > this.f309213a.f309214a.mo79747m(C90063do.f249552fg);
    }
}
