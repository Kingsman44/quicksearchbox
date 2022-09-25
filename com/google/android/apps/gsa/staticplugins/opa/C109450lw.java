package com.google.android.apps.gsa.staticplugins.opa;

import p3186j$.util.function.IntPredicate;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.lw */
/* compiled from: PG */
public final /* synthetic */ class C109450lw implements IntPredicate {

    /* renamed from: a */
    public final /* synthetic */ int f304786a;

    public /* synthetic */ C109450lw(int i) {
        this.f304786a = i;
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
        return this.f304786a <= i;
    }
}
