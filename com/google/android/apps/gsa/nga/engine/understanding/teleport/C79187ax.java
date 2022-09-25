package com.google.android.apps.gsa.nga.engine.understanding.teleport;

import p3186j$.util.Collection;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.gsa.nga.engine.understanding.teleport.ax */
/* compiled from: PG */
public final /* synthetic */ class C79187ax implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ C79214bx f217651a;

    public /* synthetic */ C79187ax(C79214bx bxVar) {
        this.f217651a = bxVar;
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
        C79214bx bxVar = this.f217651a;
        int i = C79204bn.f217670a;
        return Collection.EL.stream(bxVar.mo73841b()).anyMatch(new C79197bg((C79298f) obj));
    }
}
