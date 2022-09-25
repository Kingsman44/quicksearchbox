package com.google.android.apps.gsa.staticplugins.nga.p8089t;

import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.gsa.staticplugins.nga.t.bm */
/* compiled from: PG */
public final /* synthetic */ class C103940bm implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ boolean f289272a;

    public /* synthetic */ C103940bm(boolean z) {
        this.f289272a = z;
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
        boolean z = this.f289272a;
        Boolean bool = (Boolean) obj;
        C103942bo boVar = C103942bo.HARD_CODED;
        return z;
    }
}
