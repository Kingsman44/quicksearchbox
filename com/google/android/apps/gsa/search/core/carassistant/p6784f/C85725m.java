package com.google.android.apps.gsa.search.core.carassistant.p6784f;

import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.gsa.search.core.carassistant.f.m */
/* compiled from: PG */
public final /* synthetic */ class C85725m implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ String f231788a;

    public /* synthetic */ C85725m(String str) {
        this.f231788a = str;
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
        return this.f231788a.contains((String) obj);
    }
}
