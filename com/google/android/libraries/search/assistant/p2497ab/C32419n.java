package com.google.android.libraries.search.assistant.p2497ab;

import com.google.common.p4526f.C59071e;
import java.util.Map;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.libraries.search.assistant.ab.n */
/* compiled from: PG */
public final /* synthetic */ class C32419n implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ Map f86880a;

    public /* synthetic */ C32419n(Map map) {
        this.f86880a = map;
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
        Map map = this.f86880a;
        C59071e eVar = C32359aa.f86743a;
        return map.containsKey(((C32398bm) obj).f86844l);
    }
}
