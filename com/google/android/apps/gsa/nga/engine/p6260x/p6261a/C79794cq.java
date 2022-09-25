package com.google.android.apps.gsa.nga.engine.p6260x.p6261a;

import com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82887ec;
import com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82889ee;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.gsa.nga.engine.x.a.cq */
/* compiled from: PG */
public final /* synthetic */ class C79794cq implements Predicate {

    /* renamed from: a */
    public static final /* synthetic */ C79794cq f218776a = new C79794cq();

    private /* synthetic */ C79794cq() {
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
        C82887ec a = C82887ec.m132416a(((C82889ee) obj).f226097b);
        if (a == null) {
            a = C82887ec.UNKNOWN;
        }
        return a == C82887ec.EXECUTION_SENSITIVE;
    }
}
