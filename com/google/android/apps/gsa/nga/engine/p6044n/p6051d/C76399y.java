package com.google.android.apps.gsa.nga.engine.p6044n.p6051d;

import com.google.common.p4522b.C58485gu;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.gsa.nga.engine.n.d.y */
/* compiled from: PG */
public final /* synthetic */ class C76399y implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ C58485gu f211539a;

    public /* synthetic */ C76399y(C58485gu guVar) {
        this.f211539a = guVar;
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
        return this.f211539a.contains((String) obj);
    }
}
