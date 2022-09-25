package com.google.android.apps.gsa.nga.engine.understanding.p6241h.p6242a;

import com.google.android.apps.gsa.nga.shared.p6275aa.p6285g.C80410ab;
import p3186j$.util.function.IntPredicate;

/* renamed from: com.google.android.apps.gsa.nga.engine.understanding.h.a.d */
/* compiled from: PG */
public final /* synthetic */ class C79146d implements IntPredicate {

    /* renamed from: a */
    public final /* synthetic */ C80410ab f217556a;

    public /* synthetic */ C79146d(C80410ab abVar) {
        this.f217556a = abVar;
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
        C80410ab abVar = this.f217556a;
        int i2 = C79149g.f217559b;
        return !abVar.f220686b.mo58924g(i);
    }
}
