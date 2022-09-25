package com.google.android.apps.gsa.staticplugins.opa.util;

import java.util.Set;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.util.bp */
/* compiled from: PG */
public final /* synthetic */ class C113800bp implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ Set f315171a;

    public /* synthetic */ C113800bp(Set set) {
        this.f315171a = set;
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
        return !this.f315171a.contains((String) obj);
    }
}
