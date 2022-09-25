package com.google.android.apps.gsa.nga.shared.p6315aj.p6316a.p6318b;

import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.gsa.nga.shared.aj.a.b.aw */
/* compiled from: PG */
public final /* synthetic */ class C80844aw implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ String f221776a;

    public /* synthetic */ C80844aw(String str) {
        this.f221776a = str;
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
        String str = this.f221776a;
        C80845ax axVar = C80845ax.GO_BACK;
        return ((C80845ax) obj).f221781d.equals(str);
    }
}
