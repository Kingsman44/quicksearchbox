package com.google.android.apps.gsa.nga.shared.p6407v;

import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.gsa.nga.shared.v.s */
/* compiled from: PG */
public final /* synthetic */ class C83330s implements Predicate {

    /* renamed from: a */
    public static final /* synthetic */ C83330s f227147a = new C83330s();

    private /* synthetic */ C83330s() {
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
        return !((String) obj).contains("feedback");
    }
}
