package com.google.android.apps.gsa.staticplugins.opa.tapas.datasource.p8505c;

import p3186j$.util.Objects;
import p3186j$.util.Optional;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.datasource.c.ao */
/* compiled from: PG */
public final /* synthetic */ class C111438ao implements Predicate {

    /* renamed from: a */
    public static final /* synthetic */ C111438ao f310027a = new C111438ao();

    private /* synthetic */ C111438ao() {
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
        return Objects.nonNull((Optional) obj);
    }
}
