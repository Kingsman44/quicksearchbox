package com.google.android.apps.gsa.staticplugins.opa.tapas.logging;

import com.google.common.p4552o.p4553a.C59525cv;
import p3186j$.util.Objects;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.logging.as */
/* compiled from: PG */
public final /* synthetic */ class C112681as implements Predicate {

    /* renamed from: a */
    public static final /* synthetic */ C112681as f312323a = new C112681as();

    private /* synthetic */ C112681as() {
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
        return Objects.nonNull((C59525cv) obj);
    }
}
