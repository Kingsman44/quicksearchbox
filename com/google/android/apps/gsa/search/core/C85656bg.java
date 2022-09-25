package com.google.android.apps.gsa.search.core;

import com.google.android.apps.gsa.nga.engine.warmactions.p6255g.C79570b;
import java.util.Set;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.gsa.search.core.bg */
/* compiled from: PG */
public final /* synthetic */ class C85656bg implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ Set f231522a;

    public /* synthetic */ C85656bg(Set set) {
        this.f231522a = set;
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
        Set set = this.f231522a;
        return set.isEmpty() || set.contains((C79570b) obj);
    }
}
