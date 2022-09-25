package com.google.android.apps.gsa.nga.shared.p6309ag;

import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.gsa.nga.shared.ag.r */
/* compiled from: PG */
public final /* synthetic */ class C80623r implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ C80627v f221304a;

    public /* synthetic */ C80623r(C80627v vVar) {
        this.f221304a = vVar;
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
        C80627v vVar = this.f221304a;
        C80624s sVar = C80624s.NEURAL_MATCHING_ENCODER;
        return ((C80624s) obj).f221332x.equals(vVar);
    }
}
