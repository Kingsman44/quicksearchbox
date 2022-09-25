package com.google.android.apps.gsa.p8839t.p8847h;

import java.util.List;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.gsa.t.h.ak */
/* compiled from: PG */
public final /* synthetic */ class C118391ak implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ List f328620a;

    public /* synthetic */ C118391ak(List list) {
        this.f328620a = list;
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
        return this.f328620a.contains((String) obj);
    }
}
