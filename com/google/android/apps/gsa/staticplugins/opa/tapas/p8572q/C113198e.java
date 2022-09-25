package com.google.android.apps.gsa.staticplugins.opa.tapas.p8572q;

import android.util.Pair;
import java.util.Map;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.q.e */
/* compiled from: PG */
public final /* synthetic */ class C113198e implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ Map f313531a;

    public /* synthetic */ C113198e(Map map) {
        this.f313531a = map;
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
        return this.f313531a.containsKey(((Pair) obj).first);
    }
}
