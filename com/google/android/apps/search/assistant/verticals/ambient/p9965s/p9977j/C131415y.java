package com.google.android.apps.search.assistant.verticals.ambient.p9965s.p9977j;

import com.google.android.apps.search.assistant.platform.pcp.featuredata.mediarecommendations.C123976m;
import com.google.common.p4522b.C58528ij;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.search.assistant.verticals.ambient.s.j.y */
/* compiled from: PG */
public final /* synthetic */ class C131415y implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ C58528ij f359221a;

    public /* synthetic */ C131415y(C58528ij ijVar) {
        this.f359221a = ijVar;
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
        return this.f359221a.contains(((C123976m) obj).mo106214i());
    }
}
