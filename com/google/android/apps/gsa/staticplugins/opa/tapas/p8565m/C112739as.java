package com.google.android.apps.gsa.staticplugins.opa.tapas.p8565m;

import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.p8579c.C113320q;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.p8579c.C113321r;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.m.as */
/* compiled from: PG */
public final /* synthetic */ class C112739as implements Predicate {

    /* renamed from: a */
    public static final /* synthetic */ C112739as f312512a = new C112739as();

    private /* synthetic */ C112739as() {
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
        C113320q a = C113320q.m187477a(((C113321r) obj).f313837d);
        if (a == null) {
            a = C113320q.UNRECOGNIZED;
        }
        return a == C113320q.TEXT;
    }
}
