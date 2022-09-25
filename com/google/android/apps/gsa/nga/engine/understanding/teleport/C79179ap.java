package com.google.android.apps.gsa.nga.engine.understanding.teleport;

import java.util.List;
import p3186j$.util.function.IntPredicate;

/* renamed from: com.google.android.apps.gsa.nga.engine.understanding.teleport.ap */
/* compiled from: PG */
public final /* synthetic */ class C79179ap implements IntPredicate {

    /* renamed from: a */
    public final /* synthetic */ List f217642a;

    public /* synthetic */ C79179ap(List list) {
        this.f217642a = list;
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
        return ((Boolean) this.f217642a.get(i)).booleanValue();
    }
}
