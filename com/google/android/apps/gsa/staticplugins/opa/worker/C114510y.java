package com.google.android.apps.gsa.staticplugins.opa.worker;

import com.google.android.apps.gsa.p8839t.p8847h.C118426bs;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.worker.y */
/* compiled from: PG */
public final /* synthetic */ class C114510y implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ C118426bs f317542a;

    public /* synthetic */ C114510y(C118426bs bsVar) {
        this.f317542a = bsVar;
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
        return this.f317542a.mo103697i((Integer) obj);
    }
}
