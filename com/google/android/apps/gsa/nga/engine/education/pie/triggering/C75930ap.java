package com.google.android.apps.gsa.nga.engine.education.pie.triggering;

import com.google.android.apps.gsa.nga.shared.p6275aa.p6279d.p6280a.C80213bg;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.gsa.nga.engine.education.pie.triggering.ap */
/* compiled from: PG */
public final /* synthetic */ class C75930ap implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ C80213bg f210679a;

    public /* synthetic */ C75930ap(C80213bg bgVar) {
        this.f210679a = bgVar;
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
        return ((C80213bg) obj).f220082d.equals(this.f210679a.f220082d);
    }
}
