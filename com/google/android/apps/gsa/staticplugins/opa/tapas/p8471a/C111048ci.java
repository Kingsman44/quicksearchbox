package com.google.android.apps.gsa.staticplugins.opa.tapas.p8471a;

import com.google.assistant.p3825an.p3830c.p3831a.C49301bt;
import java.util.Map;
import p3186j$.util.Map;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.a.ci */
/* compiled from: PG */
public final /* synthetic */ class C111048ci implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ Map f309254a;

    public /* synthetic */ C111048ci(Map map) {
        this.f309254a = map;
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
        Map map = this.f309254a;
        int i = C111053cn.f309260g;
        return Map.EL.putIfAbsent(map, ((C49301bt) obj).f127426b, Boolean.TRUE) == null;
    }
}
