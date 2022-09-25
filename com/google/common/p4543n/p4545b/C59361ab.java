package com.google.common.p4543n.p4545b;

import p3186j$.util.function.BiPredicate;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.common.n.b.ab */
/* compiled from: PG */
public final /* synthetic */ class C59361ab implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ C59363ad f157561a;

    /* renamed from: b */
    public final /* synthetic */ BiPredicate f157562b;

    public /* synthetic */ C59361ab(C59363ad adVar, BiPredicate biPredicate) {
        this.f157561a = adVar;
        this.f157562b = biPredicate;
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
        C59363ad adVar = this.f157561a;
        return this.f157562b.test(adVar.f157566c.apply(obj), adVar.f157567d.apply(obj));
    }
}
