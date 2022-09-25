package com.google.common.p4543n.p4545b;

import java.util.Map;
import p3186j$.util.function.BiPredicate;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.common.n.b.k */
/* compiled from: PG */
public final /* synthetic */ class C59377k implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ BiPredicate f157582a;

    public /* synthetic */ C59377k(BiPredicate biPredicate) {
        this.f157582a = biPredicate;
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
        Map.Entry entry = (Map.Entry) obj;
        return this.f157582a.test(entry.getKey(), entry.getValue());
    }
}
