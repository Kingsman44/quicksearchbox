package com.google.android.apps.gsa.staticplugins.opa.tapas.datasource.p8514l;

import p3186j$.util.Optional;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.datasource.l.c */
/* compiled from: PG */
public final /* synthetic */ class C111553c implements Predicate {

    /* renamed from: a */
    public static final /* synthetic */ C111553c f310260a = new C111553c();

    private /* synthetic */ C111553c() {
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
        return ((Optional) obj).isPresent();
    }
}
