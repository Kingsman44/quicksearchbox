package com.google.android.apps.gsa.staticplugins.opa.ambient.p8207b.p8208a.p8209a;

import com.google.android.apps.search.assistant.verticals.ambient.p9920h.C130701b;
import java.util.Map;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.ambient.b.a.a.r */
/* compiled from: PG */
public final /* synthetic */ class C106477r implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ Map f296965a;

    public /* synthetic */ C106477r(Map map) {
        this.f296965a = map;
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
        return this.f296965a.containsKey(((C130701b) obj).mo109797h());
    }
}
