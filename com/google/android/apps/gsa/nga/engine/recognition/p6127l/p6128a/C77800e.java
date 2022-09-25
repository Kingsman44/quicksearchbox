package com.google.android.apps.gsa.nga.engine.recognition.p6127l.p6128a;

import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.gsa.nga.engine.recognition.l.a.e */
/* compiled from: PG */
public final /* synthetic */ class C77800e implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ int f214331a;

    public /* synthetic */ C77800e(int i) {
        this.f214331a = i;
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
        return ((String) obj).length() >= this.f214331a;
    }
}
