package com.google.android.apps.gsa.nga.shared.p6345h.p6346a;

import com.google.android.apps.gsa.nga.shared.p6345h.C81294by;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.gsa.nga.shared.h.a.v */
/* compiled from: PG */
public final /* synthetic */ class C81231v implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ String f222373a;

    public /* synthetic */ C81231v(String str) {
        this.f222373a = str;
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
        return ((C81294by) obj).f222539b.equals(this.f222373a);
    }
}
