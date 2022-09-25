package com.google.android.apps.gsa.staticplugins.bisto.notifications;

import java.util.Set;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.notifications.d */
/* compiled from: PG */
public final /* synthetic */ class C95578d implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ Set f267477a;

    public /* synthetic */ C95578d(Set set) {
        this.f267477a = set;
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
        return this.f267477a.contains((Integer) obj);
    }
}
