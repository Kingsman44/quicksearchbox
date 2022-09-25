package com.google.android.apps.search.podcasts.p10550b.p10556f;

import com.google.android.apps.gsa.staticplugins.p7678cl.p7680b.C97920j;
import java.util.Collection;
import java.util.Map;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.search.podcasts.b.f.i */
/* compiled from: PG */
public final /* synthetic */ class C140106i implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ Map f380741a;

    public /* synthetic */ C140106i(Map map) {
        this.f380741a = map;
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
        Map map = this.f380741a;
        C97920j jVar = (C97920j) obj;
        return !map.containsKey(jVar.f273429b) || !((Collection) map.get(jVar.f273429b)).contains(jVar.f273431d);
    }
}
