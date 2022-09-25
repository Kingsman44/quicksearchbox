package com.google.android.apps.gsa.nga.engine.understanding.teleport;

import com.google.android.apps.gsa.nga.shared.p6274a.C80047aa;
import com.google.common.p4522b.C58485gu;
import p3186j$.util.Collection;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.gsa.nga.engine.understanding.teleport.dx */
/* compiled from: PG */
public final /* synthetic */ class C79268dx implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ C58485gu f217735a;

    public /* synthetic */ C79268dx(C58485gu guVar) {
        this.f217735a = guVar;
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
        return Collection.EL.stream(this.f217735a).anyMatch(new C79233cp((C80047aa) obj));
    }
}
