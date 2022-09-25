package com.google.android.apps.gsa.nga.shared.p6407v;

import com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82889ee;
import com.google.android.apps.gsa.shared.util.debug.p7163a.C91006f;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.gsa.nga.shared.v.l */
/* compiled from: PG */
public final /* synthetic */ class C83323l implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ C83331t f227139a;

    /* renamed from: b */
    public final /* synthetic */ C91006f f227140b;

    public /* synthetic */ C83323l(C83331t tVar, C91006f fVar) {
        this.f227139a = tVar;
        this.f227140b = fVar;
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
        return !this.f227140b.mo85296v() || this.f227139a.f227148a.mo75571b((C82889ee) obj);
    }
}
