package com.google.android.apps.gsa.search.core.p6507ag.p6508a;

import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.gsa.search.core.ag.a.k */
/* compiled from: PG */
public final /* synthetic */ class C84480k implements Predicate {

    /* renamed from: a */
    public static final /* synthetic */ C84480k f229906a = new C84480k();

    private /* synthetic */ C84480k() {
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
        return !((String) obj).isEmpty();
    }
}
