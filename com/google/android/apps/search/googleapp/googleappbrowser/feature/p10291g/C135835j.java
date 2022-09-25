package com.google.android.apps.search.googleapp.googleappbrowser.feature.p10291g;

import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.search.googleapp.googleappbrowser.feature.g.j */
/* compiled from: PG */
public final /* synthetic */ class C135835j implements Predicate {

    /* renamed from: a */
    public static final /* synthetic */ C135835j f369977a = new C135835j();

    private /* synthetic */ C135835j() {
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
