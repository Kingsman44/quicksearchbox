package com.google.common.p4543n.p4545b;

import p3186j$.util.function.BiPredicate;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.common.n.b.z */
/* compiled from: PG */
public final /* synthetic */ class C59392z implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ C59363ad f157597a;

    /* renamed from: b */
    public final /* synthetic */ BiPredicate f157598b;

    public /* synthetic */ C59392z(C59363ad adVar, BiPredicate biPredicate) {
        this.f157597a = adVar;
        this.f157598b = biPredicate;
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
        C59363ad adVar = this.f157597a;
        return this.f157598b.test(adVar.f157566c.apply(obj), adVar.f157567d.apply(obj));
    }
}
