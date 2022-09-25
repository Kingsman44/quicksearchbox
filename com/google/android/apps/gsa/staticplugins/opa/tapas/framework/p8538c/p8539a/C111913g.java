package com.google.android.apps.gsa.staticplugins.opa.tapas.framework.p8538c.p8539a;

import java.util.List;
import java.util.Map;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.framework.c.a.g */
/* compiled from: PG */
public final /* synthetic */ class C111913g implements Predicate {

    /* renamed from: a */
    public static final /* synthetic */ C111913g f310942a = new C111913g();

    private /* synthetic */ C111913g() {
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
        return ((List) ((Map.Entry) obj).getValue()).isEmpty();
    }
}
