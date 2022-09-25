package com.google.android.apps.gsa.staticplugins.opa.tapas.p8471a;

import p3186j$.util.Optional;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.a.cg */
/* compiled from: PG */
public final /* synthetic */ class C111046cg implements Predicate {

    /* renamed from: a */
    public static final /* synthetic */ C111046cg f309252a = new C111046cg();

    private /* synthetic */ C111046cg() {
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
