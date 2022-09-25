package com.google.android.apps.search.assistant.platform.pcp.featuredata.p9333c;

import androidx.work.C4394ar;
import androidx.work.C4395as;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.search.assistant.platform.pcp.featuredata.c.aq */
/* compiled from: PG */
public final /* synthetic */ class C123844aq implements Predicate {

    /* renamed from: a */
    public static final /* synthetic */ C123844aq f342116a = new C123844aq();

    private /* synthetic */ C123844aq() {
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
        C4395as asVar = (C4395as) obj;
        int i = C123853az.f342128f;
        return asVar.f14027b.equals(C4394ar.ENQUEUED) || asVar.f14027b.equals(C4394ar.RUNNING);
    }
}
