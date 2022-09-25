package com.google.android.apps.gsa.search.core.p6507ag.p6508a;

import java.util.Map;
import p3186j$.util.Objects;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.gsa.search.core.ag.a.i */
/* compiled from: PG */
public final /* synthetic */ class C84478i implements Predicate {

    /* renamed from: a */
    public static final /* synthetic */ C84478i f229904a = new C84478i();

    private /* synthetic */ C84478i() {
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
        return Objects.nonNull((Map) obj);
    }
}
