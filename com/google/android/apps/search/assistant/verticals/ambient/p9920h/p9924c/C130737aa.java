package com.google.android.apps.search.assistant.verticals.ambient.p9920h.p9924c;

import com.google.assistant.p3860as.C49746ai;
import com.google.common.p4522b.C58495hd;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.search.assistant.verticals.ambient.h.c.aa */
/* compiled from: PG */
public final /* synthetic */ class C130737aa implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ double f357929a;

    public /* synthetic */ C130737aa(double d) {
        this.f357929a = d;
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
        double d = this.f357929a;
        C58495hd hdVar = C130739ac.f357930a;
        return ((C49746ai) obj).f128460e >= d;
    }
}
