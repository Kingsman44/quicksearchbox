package com.google.android.apps.gsa.publicsearch;

import com.google.android.gms.common.C143701ac;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.gsa.publicsearch.n */
/* compiled from: PG */
public final /* synthetic */ class C84215n implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ C143701ac f229208a;

    public /* synthetic */ C84215n(C143701ac acVar) {
        this.f229208a = acVar;
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
        String str = (String) obj;
        return this.f229208a.mo119084c(str) || str.equals("com.android.systemui");
    }
}
