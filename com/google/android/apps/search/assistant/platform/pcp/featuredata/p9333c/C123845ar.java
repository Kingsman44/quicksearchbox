package com.google.android.apps.search.assistant.platform.pcp.featuredata.p9333c;

import androidx.work.C4394ar;
import androidx.work.C4395as;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.search.assistant.platform.pcp.featuredata.c.ar */
/* compiled from: PG */
public final /* synthetic */ class C123845ar implements Predicate {

    /* renamed from: a */
    public static final /* synthetic */ C123845ar f342117a = new C123845ar();

    private /* synthetic */ C123845ar() {
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
