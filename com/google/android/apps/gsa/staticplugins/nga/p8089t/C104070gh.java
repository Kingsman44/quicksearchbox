package com.google.android.apps.gsa.staticplugins.nga.p8089t;

import com.google.android.libraries.mdi.download.C28708an;
import com.google.common.p4522b.C58528ij;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.gsa.staticplugins.nga.t.gh */
/* compiled from: PG */
public final /* synthetic */ class C104070gh implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ C58528ij f289554a;

    public /* synthetic */ C104070gh(C58528ij ijVar) {
        this.f289554a = ijVar;
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
        return !this.f289554a.contains(((C28708an) obj).f77997b);
    }
}
