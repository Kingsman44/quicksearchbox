package com.google.android.apps.search.assistant.verticals.ambient.p9946p.p9949b;

import com.google.common.p4535g.C59226t;
import com.google.common.p4575r.C60763t;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.search.assistant.verticals.ambient.p.b.j */
/* compiled from: PG */
public final /* synthetic */ class C131138j implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ C59226t f358644a;

    public /* synthetic */ C131138j(C59226t tVar) {
        this.f358644a = tVar;
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
        return C60763t.m92764a(((Long) obj).longValue(), this.f358644a.mo56678y().f157334b) >= 0;
    }
}
