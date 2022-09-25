package com.google.android.apps.gsa.nga.engine.recognition.p6101a.p6104b.p6105a;

import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.gsa.nga.engine.recognition.a.b.a.d */
/* compiled from: PG */
public final /* synthetic */ class C77506d implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ C77507e f213565a;

    public /* synthetic */ C77506d(C77507e eVar) {
        this.f213565a = eVar;
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
        return !this.f213565a.f213566a.mo74814b(((Integer) obj).intValue());
    }
}
