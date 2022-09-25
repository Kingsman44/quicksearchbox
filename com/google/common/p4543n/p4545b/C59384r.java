package com.google.common.p4543n.p4545b;

import p3186j$.util.function.BiPredicate;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.common.n.b.r */
/* compiled from: PG */
public final /* synthetic */ class C59384r implements BiPredicate {

    /* renamed from: a */
    public final /* synthetic */ Predicate f157589a;

    public /* synthetic */ C59384r(Predicate predicate) {
        this.f157589a = predicate;
    }

    public final /* synthetic */ BiPredicate and(BiPredicate biPredicate) {
        return BiPredicate.CC.$default$and(this, biPredicate);
    }

    public final /* synthetic */ BiPredicate negate() {
        return BiPredicate.CC.$default$negate(this);
    }

    /* renamed from: or */
    public final /* synthetic */ BiPredicate mo19296or(BiPredicate biPredicate) {
        return BiPredicate.CC.$default$or(this, biPredicate);
    }

    public final boolean test(Object obj, Object obj2) {
        return this.f157589a.test(obj);
    }
}
