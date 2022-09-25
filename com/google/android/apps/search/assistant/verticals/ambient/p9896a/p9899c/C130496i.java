package com.google.android.apps.search.assistant.verticals.ambient.p9896a.p9899c;

import p3186j$.util.Optional;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.search.assistant.verticals.ambient.a.c.i */
/* compiled from: PG */
public final /* synthetic */ class C130496i implements Predicate {

    /* renamed from: a */
    public static final /* synthetic */ C130496i f357487a = new C130496i();

    private /* synthetic */ C130496i() {
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
        return ((Optional) obj).isPresent();
    }
}
