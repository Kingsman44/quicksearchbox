package com.google.android.apps.gsa.staticplugins.opa.tapas.framework.p8538c.p8539a;

import p3186j$.time.Duration;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.framework.c.a.f */
/* compiled from: PG */
public final /* synthetic */ class C111912f implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ Duration f310941a;

    public /* synthetic */ C111912f(Duration duration) {
        this.f310941a = duration;
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
        return ((C111914h) obj).mo99284b().compareTo(this.f310941a) < 0;
    }
}
