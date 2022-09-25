package com.google.android.apps.gsa.nga.engine.understanding.teleport;

import com.google.android.apps.gsa.nga.shared.p6274a.C80047aa;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.gsa.nga.engine.understanding.teleport.cp */
/* compiled from: PG */
public final /* synthetic */ class C79233cp implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ C80047aa f217703a;

    public /* synthetic */ C79233cp(C80047aa aaVar) {
        this.f217703a = aaVar;
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
        C80047aa aaVar = this.f217703a;
        C80047aa aaVar2 = (C80047aa) obj;
        return aaVar.f219660d <= aaVar2.f219660d && aaVar2.f219661e <= aaVar.f219661e;
    }
}
