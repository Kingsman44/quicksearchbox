package com.google.android.apps.gsa.staticplugins.opa.tapas.datasource.p8504b;

import android.util.Pair;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.C59071e;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.datasource.b.n */
/* compiled from: PG */
public final /* synthetic */ class C111410n implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ C58485gu f309969a;

    public /* synthetic */ C111410n(C58485gu guVar) {
        this.f309969a = guVar;
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
        C58485gu guVar = this.f309969a;
        C59071e eVar = C111419w.f309980a;
        return !guVar.contains(((Pair) obj).first);
    }
}
