package com.google.android.apps.gsa.nga.shared.p6345h.p6346a;

import com.google.android.apps.gsa.nga.shared.p6345h.C81282bm;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.gsa.nga.shared.h.a.p */
/* compiled from: PG */
public final /* synthetic */ class C81225p implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ int f222367a;

    public /* synthetic */ C81225p(int i) {
        this.f222367a = i;
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
        C81282bm bmVar = (C81282bm) obj;
        return bmVar.f222513c == this.f222367a && bmVar.f222514d;
    }
}
