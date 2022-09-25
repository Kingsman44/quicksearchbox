package com.google.android.apps.gsa.p8839t.p8847h;

import java.util.List;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.gsa.t.h.as */
/* compiled from: PG */
public final /* synthetic */ class C118399as implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ List f328634a;

    public /* synthetic */ C118399as(List list) {
        this.f328634a = list;
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
        return this.f328634a.contains((Integer) obj);
    }
}
