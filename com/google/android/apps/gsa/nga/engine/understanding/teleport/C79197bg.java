package com.google.android.apps.gsa.nga.engine.understanding.teleport;

import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.gsa.nga.engine.understanding.teleport.bg */
/* compiled from: PG */
public final /* synthetic */ class C79197bg implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ C79298f f217663a;

    public /* synthetic */ C79197bg(C79298f fVar) {
        this.f217663a = fVar;
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
        return C79204bn.m127150c(this.f217663a, (C79212bv) obj).isPresent();
    }
}
