package com.google.android.apps.gsa.nga.engine.warmactions.p6248a;

import com.google.android.apps.gsa.nga.engine.warmactions.p6255g.C79570b;
import com.google.common.p4522b.C58528ij;
import com.google.common.p4526f.p4527a.C58974d;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.gsa.nga.engine.warmactions.a.q */
/* compiled from: PG */
public final /* synthetic */ class C79459q implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ C58528ij f218138a;

    public /* synthetic */ C79459q(C58528ij ijVar) {
        this.f218138a = ijVar;
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
        C58528ij ijVar = this.f218138a;
        C58974d dVar = C79418an.f218059a;
        return ijVar.contains(C79570b.m127648a(((Integer) obj).intValue()));
    }
}
