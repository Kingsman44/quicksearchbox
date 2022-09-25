package com.google.android.apps.gsa.nga.engine.p6260x.p6261a;

import com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82889ee;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.gsa.nga.engine.x.a.n */
/* compiled from: PG */
public final /* synthetic */ class C79830n implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ C79814dj f218901a;

    public /* synthetic */ C79830n(C79814dj djVar) {
        this.f218901a = djVar;
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
        return C79754bd.m127821l((C82889ee) obj, this.f218901a);
    }
}
