package com.google.android.libraries.appactions.p11035a;

import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.libraries.appactions.a.r */
/* compiled from: PG */
public final /* synthetic */ class C147850r implements Predicate {

    /* renamed from: a */
    public static final /* synthetic */ C147850r f398874a = new C147850r();

    private /* synthetic */ C147850r() {
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
