package com.google.android.apps.search.assistant.verticals.ambient.p9930k.p9931a;

import p3186j$.util.Optional;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.search.assistant.verticals.ambient.k.a.j */
/* compiled from: PG */
public final /* synthetic */ class C130849j implements Predicate {

    /* renamed from: a */
    public static final /* synthetic */ C130849j f358107a = new C130849j();

    private /* synthetic */ C130849j() {
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
