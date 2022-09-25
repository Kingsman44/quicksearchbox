package com.google.android.apps.search.assistant.platform.pcp.p9339i;

import java.util.List;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.search.assistant.platform.pcp.i.s */
/* compiled from: PG */
public final /* synthetic */ class C124133s implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ List f342821a;

    public /* synthetic */ C124133s(List list) {
        this.f342821a = list;
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
        return this.f342821a.contains((Integer) obj);
    }
}
