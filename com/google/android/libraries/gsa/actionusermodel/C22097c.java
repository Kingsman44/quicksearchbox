package com.google.android.libraries.gsa.actionusermodel;

import java.util.List;
import p3186j$.util.function.IntPredicate;

/* renamed from: com.google.android.libraries.gsa.actionusermodel.c */
/* compiled from: PG */
public final /* synthetic */ class C22097c implements IntPredicate {

    /* renamed from: a */
    public final /* synthetic */ List f60907a;

    public /* synthetic */ C22097c(List list) {
        this.f60907a = list;
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
        return ((C22021a) this.f60907a.get(i)).mo27334f();
    }
}
