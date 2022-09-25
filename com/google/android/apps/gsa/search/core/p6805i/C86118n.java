package com.google.android.apps.gsa.search.core.p6805i;

import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.gsa.search.core.i.n */
/* compiled from: PG */
public final /* synthetic */ class C86118n implements Predicate {

    /* renamed from: a */
    public static final /* synthetic */ C86118n f232765a = new C86118n();

    private /* synthetic */ C86118n() {
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
        return ((C86113i) obj).f232752b != 6;
    }
}
