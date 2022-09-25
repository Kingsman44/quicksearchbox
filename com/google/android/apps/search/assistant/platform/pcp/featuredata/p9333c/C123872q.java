package com.google.android.apps.search.assistant.platform.pcp.featuredata.p9333c;

import java.util.List;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.search.assistant.platform.pcp.featuredata.c.q */
/* compiled from: PG */
public final /* synthetic */ class C123872q implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ List f342161a;

    public /* synthetic */ C123872q(List list) {
        this.f342161a = list;
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
        return !this.f342161a.contains((String) obj);
    }
}
