package com.google.android.apps.search.assistant.verticals.ambient.p9965s.p9981n.p9982a;

import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.search.assistant.verticals.ambient.s.n.a.c */
/* compiled from: PG */
public final /* synthetic */ class C131437c implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ String f359257a;

    public /* synthetic */ C131437c(String str) {
        this.f359257a = str;
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
        return this.f359257a.contains((String) obj);
    }
}
