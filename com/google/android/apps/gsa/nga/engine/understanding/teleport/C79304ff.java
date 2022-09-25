package com.google.android.apps.gsa.nga.engine.understanding.teleport;

import com.google.common.p4522b.C58528ij;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.gsa.nga.engine.understanding.teleport.ff */
/* compiled from: PG */
public final /* synthetic */ class C79304ff implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ C58528ij f217798a;

    public /* synthetic */ C79304ff(C58528ij ijVar) {
        this.f217798a = ijVar;
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
        return this.f217798a.contains((String) obj);
    }
}
