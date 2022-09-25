package com.google.android.libraries.lens.view.filters.translation;

import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.libraries.lens.view.filters.translation.da */
/* compiled from: PG */
public final /* synthetic */ class C26118da implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ C26119db f70974a;

    public /* synthetic */ C26118da(C26119db dbVar) {
        this.f70974a = dbVar;
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
        return ((C26119db) obj).equals(this.f70974a);
    }
}
