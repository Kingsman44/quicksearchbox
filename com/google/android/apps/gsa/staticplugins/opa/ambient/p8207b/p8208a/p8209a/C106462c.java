package com.google.android.apps.gsa.staticplugins.opa.ambient.p8207b.p8208a.p8209a;

import android.app.usage.UsageStats;
import java.util.List;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.ambient.b.a.a.c */
/* compiled from: PG */
public final /* synthetic */ class C106462c implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ List f296950a;

    public /* synthetic */ C106462c(List list) {
        this.f296950a = list;
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
        return this.f296950a.contains(((UsageStats) obj).getPackageName());
    }
}
