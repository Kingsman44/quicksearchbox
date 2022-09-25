package com.google.android.apps.gsa.staticplugins.opa.tapas.p8471a;

import java.util.Map;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.a.bc */
/* compiled from: PG */
public final /* synthetic */ class C111006bc implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ String f309188a;

    public /* synthetic */ C111006bc(String str) {
        this.f309188a = str;
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
        return ((String) ((Map.Entry) obj).getKey()).contains(this.f309188a);
    }
}
