package com.google.android.apps.gsa.shared.p7038f.p7039a;

import p3186j$.util.Optional;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.gsa.shared.f.a.l */
/* compiled from: PG */
public final /* synthetic */ class C89752l implements Predicate {

    /* renamed from: a */
    public static final /* synthetic */ C89752l f242936a = new C89752l();

    private /* synthetic */ C89752l() {
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
