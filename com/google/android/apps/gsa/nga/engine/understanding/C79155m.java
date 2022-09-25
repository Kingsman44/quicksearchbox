package com.google.android.apps.gsa.nga.engine.understanding;

import com.google.common.p4522b.C58528ij;
import com.google.protos.p4883as.p4884a.C63775d;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.gsa.nga.engine.understanding.m */
/* compiled from: PG */
public final /* synthetic */ class C79155m implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ C63775d f217602a;

    public /* synthetic */ C79155m(C63775d dVar) {
        this.f217602a = dVar;
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
        C63775d dVar = this.f217602a;
        C58528ij ijVar = C79158p.f217605a;
        return dVar.f172523d.equals(((C63775d) obj).f172523d);
    }
}
