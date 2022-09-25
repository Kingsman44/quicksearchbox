package com.google.android.libraries.lens.view.filters.p2103f;

import com.google.android.libraries.lens.view.p2078at.C25504aj;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.libraries.lens.view.filters.f.d */
/* compiled from: PG */
public final /* synthetic */ class C26000d implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ C25504aj f70652a;

    public /* synthetic */ C26000d(C25504aj ajVar) {
        this.f70652a = ajVar;
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
        return this.f70652a.mo30536f((String) obj);
    }
}
