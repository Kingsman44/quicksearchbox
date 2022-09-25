package com.google.android.apps.gsa.nga.engine.education;

import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.gsa.nga.engine.education.at */
/* compiled from: PG */
public final /* synthetic */ class C75695at implements Predicate {

    /* renamed from: a */
    public static final /* synthetic */ C75695at f210124a = new C75695at();

    private /* synthetic */ C75695at() {
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
        return ((Boolean) obj).booleanValue();
    }
}
