package com.google.android.apps.search.assistant.verticals.p10035b;

import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.search.assistant.verticals.b.c */
/* compiled from: PG */
public final /* synthetic */ class C131927c implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ String f360213a;

    public /* synthetic */ C131927c(String str) {
        this.f360213a = str;
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
        return ((C131933i) obj).f360233a.equals(this.f360213a);
    }
}
