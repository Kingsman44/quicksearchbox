package com.google.android.apps.gsa.shared.bisto;

import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.gsa.shared.bisto.ai */
/* compiled from: PG */
public final /* synthetic */ class C89611ai implements Predicate {

    /* renamed from: a */
    public static final /* synthetic */ C89611ai f242674a = new C89611ai();

    private /* synthetic */ C89611ai() {
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
        return !((String) obj).startsWith("//");
    }
}
