package com.google.android.apps.gsa.staticplugins.opa.tapas.datasource.p8519o.p8520a;

import java.util.List;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.datasource.o.a.u */
/* compiled from: PG */
public final /* synthetic */ class C111684u implements Predicate {

    /* renamed from: a */
    public static final /* synthetic */ C111684u f310487a = new C111684u();

    private /* synthetic */ C111684u() {
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
        return !((List) obj).isEmpty();
    }
}
