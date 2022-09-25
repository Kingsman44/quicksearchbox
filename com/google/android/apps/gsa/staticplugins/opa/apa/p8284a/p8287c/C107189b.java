package com.google.android.apps.gsa.staticplugins.opa.apa.p8284a.p8287c;

import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.apa.a.c.b */
/* compiled from: PG */
public final /* synthetic */ class C107189b implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ long f298367a;

    public /* synthetic */ C107189b(long j) {
        this.f298367a = j;
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
        return ((C107191d) obj).mo95822a() == this.f298367a;
    }
}
