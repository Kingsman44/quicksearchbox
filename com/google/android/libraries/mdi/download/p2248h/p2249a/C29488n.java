package com.google.android.libraries.mdi.download.p2248h.p2249a;

import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.libraries.mdi.download.h.a.n */
/* compiled from: PG */
public final /* synthetic */ class C29488n implements Predicate {

    /* renamed from: a */
    public static final /* synthetic */ C29488n f79914a = new C29488n();

    private /* synthetic */ C29488n() {
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
