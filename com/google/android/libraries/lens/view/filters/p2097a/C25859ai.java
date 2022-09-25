package com.google.android.libraries.lens.view.filters.p2097a;

import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.libraries.lens.view.filters.a.ai */
/* compiled from: PG */
public final /* synthetic */ class C25859ai implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ C25851aa f70245a;

    public /* synthetic */ C25859ai(C25851aa aaVar) {
        this.f70245a = aaVar;
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
        return this.f70245a.shouldShowRequestPermissionRationale((String) obj);
    }
}
