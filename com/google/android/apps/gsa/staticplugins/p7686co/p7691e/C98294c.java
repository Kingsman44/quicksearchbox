package com.google.android.apps.gsa.staticplugins.p7686co.p7691e;

import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.gsa.staticplugins.co.e.c */
/* compiled from: PG */
public final /* synthetic */ class C98294c implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ long f274399a;

    public /* synthetic */ C98294c(long j) {
        this.f274399a = j;
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
        return ((C98305n) obj).f274419b == this.f274399a;
    }
}
