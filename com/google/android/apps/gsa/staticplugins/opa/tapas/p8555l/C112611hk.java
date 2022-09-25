package com.google.android.apps.gsa.staticplugins.opa.tapas.p8555l;

import p3186j$.util.Optional;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.l.hk */
/* compiled from: PG */
public final /* synthetic */ class C112611hk implements Predicate {

    /* renamed from: a */
    public static final /* synthetic */ C112611hk f312213a = new C112611hk();

    private /* synthetic */ C112611hk() {
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
