package com.google.android.apps.search.assistant.platform.pcp.p9339i;

import java.util.List;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.search.assistant.platform.pcp.i.cd */
/* compiled from: PG */
public final /* synthetic */ class C124105cd implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ List f342768a;

    public /* synthetic */ C124105cd(List list) {
        this.f342768a = list;
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
        return this.f342768a.contains((Integer) obj);
    }
}
