package com.google.android.apps.search.assistant.verticals.ambient.p9965s.p9967b;

import p3186j$.util.Optional;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.search.assistant.verticals.ambient.s.b.d */
/* compiled from: PG */
public final /* synthetic */ class C131269d implements Predicate {

    /* renamed from: a */
    public static final /* synthetic */ C131269d f358920a = new C131269d();

    private /* synthetic */ C131269d() {
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
