package com.google.android.apps.gsa.staticplugins.opa.tapas.p8491c.p8492a;

import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.c.a.i */
/* compiled from: PG */
public final /* synthetic */ class C111246i implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ C111255r f309567a;

    public /* synthetic */ C111246i(C111255r rVar) {
        this.f309567a = rVar;
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
        return ((C111250m) obj).mo99079a().equals(this.f309567a);
    }
}
