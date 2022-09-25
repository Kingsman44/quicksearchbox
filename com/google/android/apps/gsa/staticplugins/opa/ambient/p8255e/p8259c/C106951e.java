package com.google.android.apps.gsa.staticplugins.opa.ambient.p8255e.p8259c;

import com.google.android.apps.search.assistant.verticals.ambient.p9920h.C130701b;
import com.google.common.p4522b.C58485gu;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.ambient.e.c.e */
/* compiled from: PG */
public final /* synthetic */ class C106951e implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ C58485gu f297906a;

    public /* synthetic */ C106951e(C58485gu guVar) {
        this.f297906a = guVar;
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
        return this.f297906a.contains(((C130701b) obj).mo109797h());
    }
}
