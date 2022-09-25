package com.google.android.apps.search.googleapp.saves.p10388b;

import p3186j$.util.Objects;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.search.googleapp.saves.b.q */
/* compiled from: PG */
public final /* synthetic */ class C137222q implements Predicate {

    /* renamed from: a */
    public static final /* synthetic */ C137222q f373346a = new C137222q();

    private /* synthetic */ C137222q() {
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
        return Objects.nonNull((String) obj);
    }
}
