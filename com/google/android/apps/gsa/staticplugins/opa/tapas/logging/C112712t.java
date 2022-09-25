package com.google.android.apps.gsa.staticplugins.opa.tapas.logging;

import p3186j$.util.Optional;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.logging.t */
/* compiled from: PG */
public final /* synthetic */ class C112712t implements Predicate {

    /* renamed from: a */
    public static final /* synthetic */ C112712t f312453a = new C112712t();

    private /* synthetic */ C112712t() {
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
