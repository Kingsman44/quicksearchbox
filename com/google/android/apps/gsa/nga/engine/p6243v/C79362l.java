package com.google.android.apps.gsa.nga.engine.p6243v;

import com.google.common.p4522b.C58528ij;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.gsa.nga.engine.v.l */
/* compiled from: PG */
public final /* synthetic */ class C79362l implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ C58528ij f217903a;

    public /* synthetic */ C79362l(C58528ij ijVar) {
        this.f217903a = ijVar;
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
        return this.f217903a.contains((Integer) obj);
    }
}
