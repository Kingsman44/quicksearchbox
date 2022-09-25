package com.google.android.apps.gsa.staticplugins.p7565bu.p7566a;

import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.gsa.staticplugins.bu.a.ar */
/* compiled from: PG */
public final /* synthetic */ class C96773ar implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ C96759ad f270670a;

    public /* synthetic */ C96773ar(C96759ad adVar) {
        this.f270670a = adVar;
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
        return ((C96762ag) obj).mo90339b().contains(this.f270670a);
    }
}
