package com.google.android.apps.gsa.nga.engine.p6044n.p6052e.p6053a;

import com.google.android.apps.gsa.nga.shared.p6274a.C80056b;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.gsa.nga.engine.n.e.a.i */
/* compiled from: PG */
public final /* synthetic */ class C76411i implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ String f211554a;

    public /* synthetic */ C76411i(String str) {
        this.f211554a = str;
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
        return ((C80056b) obj).f219688a.equals(this.f211554a);
    }
}
