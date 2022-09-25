package com.google.android.apps.gsa.staticplugins.opa.tapas.datasource.p8515m;

import android.net.Uri;
import p3186j$.util.Objects;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.datasource.m.o */
/* compiled from: PG */
public final /* synthetic */ class C111590o implements Predicate {

    /* renamed from: a */
    public static final /* synthetic */ C111590o f310325a = new C111590o();

    private /* synthetic */ C111590o() {
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
        return Objects.nonNull((Uri) obj);
    }
}
