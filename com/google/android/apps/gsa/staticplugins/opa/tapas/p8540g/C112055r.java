package com.google.android.apps.gsa.staticplugins.opa.tapas.p8540g;

import com.google.common.p4522b.C58528ij;
import com.google.p4184bj.p4214f.C56028b;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.g.r */
/* compiled from: PG */
public final /* synthetic */ class C112055r implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ C58528ij f311229a;

    public /* synthetic */ C112055r(C58528ij ijVar) {
        this.f311229a = ijVar;
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
        return this.f311229a.contains(((C56028b) obj).f149207c);
    }
}
