package com.google.android.apps.search.assistant.verticals.ambient.p9946p.p9949b;

import p3186j$.util.Optional;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.search.assistant.verticals.ambient.p.b.y */
/* compiled from: PG */
public final /* synthetic */ class C131153y implements Predicate {

    /* renamed from: a */
    public static final /* synthetic */ C131153y f358665a = new C131153y();

    private /* synthetic */ C131153y() {
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
