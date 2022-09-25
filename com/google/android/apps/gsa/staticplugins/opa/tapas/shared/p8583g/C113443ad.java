package com.google.android.apps.gsa.staticplugins.opa.tapas.shared.p8583g;

import com.google.assistant.p3781ad.p3789d.p3791b.p3792a.C48601aq;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.shared.g.ad */
/* compiled from: PG */
public final /* synthetic */ class C113443ad implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ C113446ag f314130a;

    public /* synthetic */ C113443ad(C113446ag agVar) {
        this.f314130a = agVar;
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
        C48601aq aqVar = (C48601aq) obj;
        return !this.f314130a.f314135c.f314154a.getAndSet(true);
    }
}
