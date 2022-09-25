package com.google.android.apps.gsa.nga.engine.understanding.teleport;

import java.util.Set;
import p3186j$.util.Collection;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.gsa.nga.engine.understanding.teleport.aw */
/* compiled from: PG */
public final /* synthetic */ class C79186aw implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ Set f217650a;

    public /* synthetic */ C79186aw(Set set) {
        this.f217650a = set;
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
        return Collection.EL.stream(this.f217650a).anyMatch(new C79188ay((String) obj));
    }
}
