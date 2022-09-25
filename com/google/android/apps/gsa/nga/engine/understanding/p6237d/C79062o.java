package com.google.android.apps.gsa.nga.engine.understanding.p6237d;

import com.google.android.apps.gsa.nga.engine.geniefm.C76106l;
import com.google.android.apps.gsa.nga.engine.geniefm.C76110p;
import com.google.common.p4522b.C58532in;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.gsa.nga.engine.understanding.d.o */
/* compiled from: PG */
public final /* synthetic */ class C79062o implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ C58532in f217408a;

    /* renamed from: b */
    public final /* synthetic */ C76106l f217409b;

    public /* synthetic */ C79062o(C58532in inVar, C76106l lVar) {
        this.f217408a = inVar;
        this.f217409b = lVar;
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
        return this.f217408a.mo54952E(this.f217409b.f210998a, ((C76110p) obj).f211007a);
    }
}
