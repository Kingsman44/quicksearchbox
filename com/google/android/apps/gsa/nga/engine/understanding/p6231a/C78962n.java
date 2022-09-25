package com.google.android.apps.gsa.nga.engine.understanding.p6231a;

import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.gsa.nga.engine.understanding.a.n */
/* compiled from: PG */
public final /* synthetic */ class C78962n implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ String f217198a;

    public /* synthetic */ C78962n(String str) {
        this.f217198a = str;
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
        return ((C78954f) obj).mo73695a().contains(this.f217198a);
    }
}
