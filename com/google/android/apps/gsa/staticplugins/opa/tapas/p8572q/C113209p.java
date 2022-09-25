package com.google.android.apps.gsa.staticplugins.opa.tapas.p8572q;

import android.content.pm.ApplicationInfo;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.q.p */
/* compiled from: PG */
public final /* synthetic */ class C113209p implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ String f313543a;

    public /* synthetic */ C113209p(String str) {
        this.f313543a = str;
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
        return ((ApplicationInfo) obj).packageName.equals(this.f313543a);
    }
}
