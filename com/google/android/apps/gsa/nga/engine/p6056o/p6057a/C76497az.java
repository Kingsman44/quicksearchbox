package com.google.android.apps.gsa.nga.engine.p6056o.p6057a;

import java.util.Set;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.gsa.nga.engine.o.a.az */
/* compiled from: PG */
public final /* synthetic */ class C76497az implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ Set f211699a;

    public /* synthetic */ C76497az(Set set) {
        this.f211699a = set;
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
        return this.f211699a.contains((Integer) obj);
    }
}
