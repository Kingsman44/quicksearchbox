package com.google.android.libraries.gsa.actionusermodel;

import com.google.android.libraries.gsa.actionusermodel.p1830c.C22106i;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.libraries.gsa.actionusermodel.bo */
/* compiled from: PG */
public final /* synthetic */ class C22085bo implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ C22086bp f60884a;

    public /* synthetic */ C22085bo(C22086bp bpVar) {
        this.f60884a = bpVar;
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
        return this.f60884a.f60885a.mo57444a().minusMillis(((C22106i) obj).f60934c).toEpochMilli() <= 60000;
    }
}
