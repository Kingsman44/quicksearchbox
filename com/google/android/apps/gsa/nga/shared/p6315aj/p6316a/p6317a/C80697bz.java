package com.google.android.apps.gsa.nga.shared.p6315aj.p6316a.p6317a;

import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.gsa.nga.shared.aj.a.a.bz */
/* compiled from: PG */
public final /* synthetic */ class C80697bz implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ int f221560a;

    public /* synthetic */ C80697bz(int i) {
        this.f221560a = i;
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
        int i = this.f221560a;
        C80701cc ccVar = C80701cc.f221566a;
        C80700cb cbVar = C80700cb.UNKNOWN;
        return ((C80700cb) obj).f221565d == i;
    }
}
