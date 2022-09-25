package com.google.android.apps.gsa.nga.engine.p6056o.p6077e.p6079b.p6080a;

import p3186j$.util.function.IntPredicate;

/* renamed from: com.google.android.apps.gsa.nga.engine.o.e.b.a.a */
/* compiled from: PG */
public final /* synthetic */ class C76798a implements IntPredicate {

    /* renamed from: a */
    public static final /* synthetic */ C76798a f212197a = new C76798a();

    private /* synthetic */ C76798a() {
    }

    public final /* synthetic */ IntPredicate and(IntPredicate intPredicate) {
        return IntPredicate.CC.$default$and(this, intPredicate);
    }

    public final /* synthetic */ IntPredicate negate() {
        return IntPredicate.CC.$default$negate(this);
    }

    /* renamed from: or */
    public final /* synthetic */ IntPredicate mo19598or(IntPredicate intPredicate) {
        return IntPredicate.CC.$default$or(this, intPredicate);
    }

    public final boolean test(int i) {
        return i % 2 == 0;
    }
}
