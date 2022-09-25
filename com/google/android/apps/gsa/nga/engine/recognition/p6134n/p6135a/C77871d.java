package com.google.android.apps.gsa.nga.engine.recognition.p6134n.p6135a;

import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.gsa.nga.engine.recognition.n.a.d */
/* compiled from: PG */
public final /* synthetic */ class C77871d implements Predicate {

    /* renamed from: a */
    public static final /* synthetic */ C77871d f214518a = new C77871d();

    private /* synthetic */ C77871d() {
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
