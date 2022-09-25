package com.google.android.apps.search.googleapp.googleappbrowser.feature.p10291g;

import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.search.googleapp.googleappbrowser.feature.g.l */
/* compiled from: PG */
public final /* synthetic */ class C135837l implements Predicate {

    /* renamed from: a */
    public static final /* synthetic */ C135837l f369979a = new C135837l();

    private /* synthetic */ C135837l() {
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
