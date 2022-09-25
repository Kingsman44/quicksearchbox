package com.google.android.apps.gsa.nga.shared.p6315aj.p6316a.p6318b;

import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.gsa.nga.shared.aj.a.b.bb */
/* compiled from: PG */
public final /* synthetic */ class C80850bb implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ int f221786a;

    public /* synthetic */ C80850bb(int i) {
        this.f221786a = i;
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
        int i = this.f221786a;
        C80851bc bcVar = C80851bc.DEFAULT;
        return ((C80851bc) obj).f221793f == i;
    }
}
