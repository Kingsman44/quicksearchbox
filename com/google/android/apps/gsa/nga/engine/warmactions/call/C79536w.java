package com.google.android.apps.gsa.nga.engine.warmactions.call;

import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.gsa.nga.engine.warmactions.call.w */
/* compiled from: PG */
public final /* synthetic */ class C79536w implements Predicate {

    /* renamed from: a */
    public static final /* synthetic */ C79536w f218252a = new C79536w();

    private /* synthetic */ C79536w() {
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
