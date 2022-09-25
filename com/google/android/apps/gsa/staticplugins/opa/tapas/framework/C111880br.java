package com.google.android.apps.gsa.staticplugins.opa.tapas.framework;

import p3186j$.util.Objects;
import p3186j$.util.function.Predicate;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.framework.br */
/* compiled from: PG */
public final /* synthetic */ class C111880br implements Predicate {

    /* renamed from: a */
    public static final /* synthetic */ C111880br f310881a = new C111880br();

    private /* synthetic */ C111880br() {
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
        return Objects.nonNull((C69464a) obj);
    }
}
