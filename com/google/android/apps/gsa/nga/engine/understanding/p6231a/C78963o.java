package com.google.android.apps.gsa.nga.engine.understanding.p6231a;

import com.google.android.apps.gsa.shared.p7066m.C89988b;
import com.google.android.apps.gsa.shared.p7066m.C90126fx;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.gsa.nga.engine.understanding.a.o */
/* compiled from: PG */
public final /* synthetic */ class C78963o implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ C78968t f217199a;

    public /* synthetic */ C78963o(C78968t tVar) {
        this.f217199a = tVar;
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
        return C89988b.m146551d(this.f217199a.f217215c.mo85403h(C90126fx.f251544kn)).contains(((C78954f) obj).mo73698d());
    }
}
