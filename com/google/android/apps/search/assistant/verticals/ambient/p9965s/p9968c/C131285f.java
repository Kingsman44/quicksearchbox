package com.google.android.apps.search.assistant.verticals.ambient.p9965s.p9968c;

import com.google.assistant.p3886c.C50818do;
import com.google.common.p4522b.C58485gu;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.search.assistant.verticals.ambient.s.c.f */
/* compiled from: PG */
public final /* synthetic */ class C131285f implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ C58485gu f358948a;

    public /* synthetic */ C131285f(C58485gu guVar) {
        this.f358948a = guVar;
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
        return !this.f358948a.contains(Integer.valueOf(((C50818do) obj).f132307d));
    }
}
