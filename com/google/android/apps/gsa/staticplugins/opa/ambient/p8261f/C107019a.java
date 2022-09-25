package com.google.android.apps.gsa.staticplugins.opa.ambient.p8261f;

import com.google.android.apps.gsa.staticplugins.opa.ambient.p8207b.p8213d.C106521b;
import com.google.android.apps.gsa.staticplugins.opa.ambient.p8207b.p8213d.C106546e;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.ambient.f.a */
/* compiled from: PG */
public final /* synthetic */ class C107019a implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ C106546e f298036a;

    public /* synthetic */ C107019a(C106546e eVar) {
        this.f298036a = eVar;
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
        return this.f298036a.mo95556a().equals(((C106521b) obj).mo95569b().mo95556a());
    }
}
