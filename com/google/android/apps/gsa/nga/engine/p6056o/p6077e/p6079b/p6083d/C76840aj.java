package com.google.android.apps.gsa.nga.engine.p6056o.p6077e.p6079b.p6083d;

import p3186j$.util.Optional;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.gsa.nga.engine.o.e.b.d.aj */
/* compiled from: PG */
public final /* synthetic */ class C76840aj implements Predicate {

    /* renamed from: a */
    public static final /* synthetic */ C76840aj f212243a = new C76840aj();

    private /* synthetic */ C76840aj() {
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
