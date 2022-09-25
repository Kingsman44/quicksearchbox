package com.google.android.libraries.lens.view.filters.p2097a;

import com.google.android.libraries.lens.view.p2078at.C25504aj;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.libraries.lens.view.filters.a.p */
/* compiled from: PG */
public final /* synthetic */ class C25883p implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ C25504aj f70319a;

    public /* synthetic */ C25883p(C25504aj ajVar) {
        this.f70319a = ajVar;
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
        return this.f70319a.mo30536f((String) obj);
    }
}
