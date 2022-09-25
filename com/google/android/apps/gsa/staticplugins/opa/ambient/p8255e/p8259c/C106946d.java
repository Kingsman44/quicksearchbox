package com.google.android.apps.gsa.staticplugins.opa.ambient.p8255e.p8259c;

import com.google.android.apps.search.assistant.verticals.ambient.p9920h.C130701b;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.ambient.e.c.d */
/* compiled from: PG */
public final /* synthetic */ class C106946d implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ double f297894a;

    /* renamed from: b */
    public final /* synthetic */ double f297895b;

    public /* synthetic */ C106946d(double d, double d2) {
        this.f297894a = d;
        this.f297895b = d2;
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
        return ((C130701b) obj).mo109791a() / this.f297894a > this.f297895b;
    }
}
