package com.google.android.libraries.lens.view.main;

import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.libraries.lens.view.main.bv */
/* compiled from: PG */
public final /* synthetic */ class C27332bv implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ C27292ai f74823a;

    public /* synthetic */ C27332bv(C27292ai aiVar) {
        this.f74823a = aiVar;
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
        return this.f74823a.shouldShowRequestPermissionRationale((String) obj);
    }
}
