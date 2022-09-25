package com.google.android.apps.gsa.staticplugins.opa.tapas.p8565m;

import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.m.bm */
/* compiled from: PG */
public final /* synthetic */ class C112760bm implements Predicate {

    /* renamed from: a */
    public static final /* synthetic */ C112760bm f312547a = new C112760bm();

    private /* synthetic */ C112760bm() {
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
        return !((String) obj).isEmpty();
    }
}
