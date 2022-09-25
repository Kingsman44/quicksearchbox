package com.google.android.apps.gsa.nga.engine.p6260x.p6261a;

import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.gsa.nga.engine.x.a.e */
/* compiled from: PG */
public final /* synthetic */ class C79821e implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ String f218892a;

    public /* synthetic */ C79821e(String str) {
        this.f218892a = str;
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
        return this.f218892a.equals(((C79753bc) obj).f218652b);
    }
}
