package com.google.android.apps.gsa.nga.engine.understanding.p6231a.p6232a;

import p3186j$.util.Optional;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.gsa.nga.engine.understanding.a.a.v */
/* compiled from: PG */
public final /* synthetic */ class C78940v implements Predicate {

    /* renamed from: a */
    public static final /* synthetic */ C78940v f217179a = new C78940v();

    private /* synthetic */ C78940v() {
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
