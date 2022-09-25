package com.google.android.apps.gsa.nga.engine.p6144ui.p6154e.p6188l.p6194e;

import p3186j$.util.Optional;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.gsa.nga.engine.ui.e.l.e.l */
/* compiled from: PG */
public final /* synthetic */ class C78685l implements Predicate {

    /* renamed from: a */
    public static final /* synthetic */ C78685l f216610a = new C78685l();

    private /* synthetic */ C78685l() {
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
