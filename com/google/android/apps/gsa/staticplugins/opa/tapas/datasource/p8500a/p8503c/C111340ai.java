package com.google.android.apps.gsa.staticplugins.opa.tapas.datasource.p8500a.p8503c;

import java.util.List;
import p3186j$.util.Objects;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.datasource.a.c.ai */
/* compiled from: PG */
public final /* synthetic */ class C111340ai implements Predicate {

    /* renamed from: a */
    public static final /* synthetic */ C111340ai f309827a = new C111340ai();

    private /* synthetic */ C111340ai() {
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
        return Objects.nonNull((List) obj);
    }
}
