package com.google.android.apps.gsa.search.core.p6517ak.p6518a;

import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.gsa.search.core.ak.a.h */
/* compiled from: PG */
public final /* synthetic */ class C84581h implements Predicate {

    /* renamed from: a */
    public static final /* synthetic */ C84581h f230181a = new C84581h();

    private /* synthetic */ C84581h() {
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
        return !((String) obj).isEmpty();
    }
}
