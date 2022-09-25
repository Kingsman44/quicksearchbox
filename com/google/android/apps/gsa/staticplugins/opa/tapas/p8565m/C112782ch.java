package com.google.android.apps.gsa.staticplugins.opa.tapas.p8565m;

import java.util.List;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.m.ch */
/* compiled from: PG */
public final /* synthetic */ class C112782ch implements Predicate {

    /* renamed from: a */
    public static final /* synthetic */ C112782ch f312600a = new C112782ch();

    private /* synthetic */ C112782ch() {
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
        return !((List) obj).isEmpty();
    }
}
