package com.google.android.libraries.web.weblayer.contrib.p3452a;

import java.util.List;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.libraries.web.weblayer.contrib.a.m */
/* compiled from: PG */
public final /* synthetic */ class C44155m implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ List f114896a;

    public /* synthetic */ C44155m(List list) {
        this.f114896a = list;
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
        return !this.f114896a.contains((String) obj);
    }
}
