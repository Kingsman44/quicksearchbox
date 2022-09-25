package com.google.android.apps.gsa.staticplugins.p7887eb;

import p3186j$.util.Objects;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.gsa.staticplugins.eb.e */
/* compiled from: PG */
public final /* synthetic */ class C100359e implements Predicate {

    /* renamed from: a */
    public static final /* synthetic */ C100359e f280651a = new C100359e();

    private /* synthetic */ C100359e() {
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
        return Objects.nonNull((Boolean) obj);
    }
}
