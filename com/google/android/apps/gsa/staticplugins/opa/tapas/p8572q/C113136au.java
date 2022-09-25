package com.google.android.apps.gsa.staticplugins.opa.tapas.p8572q;

import p3186j$.util.Optional;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.q.au */
/* compiled from: PG */
public final /* synthetic */ class C113136au implements Predicate {

    /* renamed from: a */
    public static final /* synthetic */ C113136au f313451a = new C113136au();

    private /* synthetic */ C113136au() {
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
        return ((Optional) obj).isPresent();
    }
}
