package com.google.android.apps.gsa.nga.engine.p6260x.p6261a;

import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.gsa.nga.engine.x.a.f */
/* compiled from: PG */
public final /* synthetic */ class C79822f implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ long f218893a;

    public /* synthetic */ C79822f(long j) {
        this.f218893a = j;
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
        return C79754bd.m127820k(this.f218893a, ((C79753bc) obj).f218651a, 90000);
    }
}
