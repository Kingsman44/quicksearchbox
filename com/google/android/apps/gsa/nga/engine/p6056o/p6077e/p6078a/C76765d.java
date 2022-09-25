package com.google.android.apps.gsa.nga.engine.p6056o.p6077e.p6078a;

import com.google.common.base.C58890d;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.gsa.nga.engine.o.e.a.d */
/* compiled from: PG */
public final /* synthetic */ class C76765d implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ String f212137a;

    public /* synthetic */ C76765d(String str) {
        this.f212137a = str;
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
        return C58890d.m90990e((String) obj, this.f212137a);
    }
}
