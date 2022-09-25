package com.google.android.apps.gsa.staticplugins.opa.tapas.p8572q;

import android.content.pm.ApplicationInfo;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.q.n */
/* compiled from: PG */
public final /* synthetic */ class C113207n implements Predicate {

    /* renamed from: a */
    public static final /* synthetic */ C113207n f313540a = new C113207n();

    private /* synthetic */ C113207n() {
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
        return ((ApplicationInfo) obj).enabled;
    }
}
