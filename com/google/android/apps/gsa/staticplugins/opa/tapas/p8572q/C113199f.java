package com.google.android.apps.gsa.staticplugins.opa.tapas.p8572q;

import android.util.Pair;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.q.f */
/* compiled from: PG */
public final /* synthetic */ class C113199f implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ double f313532a;

    public /* synthetic */ C113199f(double d) {
        this.f313532a = d;
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
        return ((Double) ((Pair) obj).second).doubleValue() > this.f313532a;
    }
}
