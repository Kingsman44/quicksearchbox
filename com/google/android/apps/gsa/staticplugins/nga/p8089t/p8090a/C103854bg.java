package com.google.android.apps.gsa.staticplugins.nga.p8089t.p8090a;

import p3186j$.util.Optional;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.gsa.staticplugins.nga.t.a.bg */
/* compiled from: PG */
public final /* synthetic */ class C103854bg implements Predicate {

    /* renamed from: a */
    public static final /* synthetic */ C103854bg f289108a = new C103854bg();

    private /* synthetic */ C103854bg() {
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
